CREATE TABLE Turnos (
    id_turno INT PRIMARY KEY,
    id_servicio INT,
    fecha_turno DATE,
    hora_inicio TIME,
    hora_fin TIME,
    estado VARCHAR(50),
    FOREIGN KEY (id_servicio) REFERENCES Servicios(id_servicio)
);