CREATE TABLE Servicios (
    id_servicio INT PRIMARY KEY,
    id_comercio INT,
    nombre_servicio VARCHAR(255),
    hora_apertura TIME,
    hora_cierre TIME,
    duracion INT,
    FOREIGN KEY (id_comercio) REFERENCES Comercios(id_comercio)
);