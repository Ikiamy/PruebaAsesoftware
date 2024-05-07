import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AutenticacionUsuarioComponent } from './autenticacion-usuario.component';

describe('AutenticacionUsuarioComponent', () => {
  let component: AutenticacionUsuarioComponent;
  let fixture: ComponentFixture<AutenticacionUsuarioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AutenticacionUsuarioComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AutenticacionUsuarioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
