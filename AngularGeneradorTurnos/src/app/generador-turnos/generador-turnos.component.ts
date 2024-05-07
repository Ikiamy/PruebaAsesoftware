import {Component, OnInit} from '@angular/core';
import {GeneradorService} from "../Servicios/GeneradorService";
import {FormsModule} from "@angular/forms";
import {NgForOf} from "@angular/common";

@Component({
  selector: 'app-generador-turnos',
  standalone: true,
  imports: [
    FormsModule,
    NgForOf
  ],
  templateUrl: './generador-turnos.component.html',
  styleUrl: './generador-turnos.component.css'
})
export class GeneradorTurnosComponent implements OnInit{

  comercios: any[] = [];
  servicios: any[] = [];
  selectedComercio: number = 0;
  selectedServicio: number = 0;
  fechaInicio: string = '';
  fechaFin: string = '';
  turnosGenerados: any[] = [];

  constructor(private service: GeneradorService) { }

  ngOnInit(): void {
    this.cargarComercios();
    this.cargarServicios();
  }

  cargarComercios(): void {
    this.service.getComercios().subscribe((data: any[]) => {
      this.comercios = data;
    });
  }

  cargarServicios(): void {
    this.service.getServicios().subscribe((data: any[]) => {
      this.servicios = data;
    });
  }

  generarTurnos(): void {
    const data = {
      idComercio: this.selectedComercio,
      idServicio: this.selectedServicio,
      fechaInicio: this.fechaInicio,
      fechaFin: this.fechaFin
    };

    this.service.generarTurnos(data).subscribe((response: any) => {
      console.log('Turnos generados:', response);
      this.turnosGenerados = response;
    }, error => {
      console.error('Error al generar turnos:', error);
    });
  }

}
