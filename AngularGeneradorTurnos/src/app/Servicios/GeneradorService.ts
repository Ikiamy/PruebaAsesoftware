import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GeneradorService{
  private apiUrl = 'http://localhost:puerto/api';

  constructor(private http: HttpClient) { }

  getComercios(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/comercios`);
  }

  getServicios(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/servicios`);
  }

  generarTurnos(data: any): Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/turnos/generar`, data);
  }
}
