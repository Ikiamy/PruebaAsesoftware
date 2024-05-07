import { Component } from '@angular/core';
import { Auth } from '../Autenticacion/autenticacion.service';
import {FormsModule} from "@angular/forms";
import {NgIf} from "@angular/common";

@Component({
  selector: 'app-autenticacion-usuario',
  standalone: true,
  imports: [
    FormsModule,
    NgIf
  ],
  templateUrl: './autenticacion-usuario.component.html',
  styleUrl: './autenticacion-usuario.component.css'
})
export class AutenticacionUsuarioComponent {

  username: string = '';
  password: string = '';
  errorMsg: string = '';

  constructor(private autenticacion: Auth) { }

  login(): void {
    if (this.autenticacion.login(this.username, this.password)) {
      console.log('Login exitoso');
    } else {
      this.errorMsg = 'Credenciales incorrectas';
    }
  }

}
