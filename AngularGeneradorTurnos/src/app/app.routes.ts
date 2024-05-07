import {RouterModule, Routes} from '@angular/router';
import { NgModule } from '@angular/core';
import { AutenticacionUsuarioComponent } from '../app/autenticacion-usuario/autenticacion-usuario.component';
import {GeneradorTurnosComponent} from "./generador-turnos/generador-turnos.component";

export const routes: Routes = [{ path: 'login', component: AutenticacionUsuarioComponent },
  // Agregar ruta protegida para la página de generación de turnos
  { path: 'turnos', component: GeneradorTurnosComponent},
  { path: '', redirectTo: '/login', pathMatch: 'full' }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
