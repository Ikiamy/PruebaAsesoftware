import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class Auth {

  constructor() { }

  login(username: string, password: string): boolean {
    // Aquí puedes implementar la lógica de autenticación
    return username === 'usuario' && password === 'password';
  }

}
