import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GeneradorTurnosComponent } from './generador-turnos.component';

describe('GeneradorTurnosComponent', () => {
  let component: GeneradorTurnosComponent;
  let fixture: ComponentFixture<GeneradorTurnosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GeneradorTurnosComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(GeneradorTurnosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
