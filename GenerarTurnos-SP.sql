CREATE PROCEDURE GenerarTurnos(
    @FechaInicio DATE,
    @FechaFin DATE,
    @IdServicio INT
)
AS
BEGIN
    DECLARE @FechaActual DATE = @FechaInicio;
    DECLARE @HoraApertura TIME;
    DECLARE @HoraCierre TIME;
    DECLARE @Duracion INT;
    DECLARE @IdComercio INT;

    -- Obtener los datos del servicio
    SELECT @HoraApertura = hora_apertura, @HoraCierre = hora_cierre, @Duracion = duracion
    FROM Servicios
    WHERE id_servicio = @IdServicio;

    -- Obtener los comercios que comparten el servicio
    DECLARE @Comercios TABLE (id_comercio INT);
    INSERT INTO @Comercios (id_comercio)
    SELECT DISTINCT id_comercio
    FROM Servicios
    WHERE id_servicio = @IdServicio;

    -- Generar turnos para cada comercio
    WHILE @FechaActual <= @FechaFin
    BEGIN
        DECLARE @HoraInicio TIME = @HoraApertura;
        WHILE DATEADD(MINUTE, @Duracion, @HoraInicio) <= @HoraCierre
        BEGIN
            DECLARE @IdTurno INT;

            -- Generar turno para cada comercio
            DECLARE comercio_cursor CURSOR FOR
            SELECT id_comercio
            FROM @Comercios;

            OPEN comercio_cursor;
            FETCH NEXT FROM comercio_cursor INTO @IdComercio;

            WHILE @@FETCH_STATUS = 0
            BEGIN
                INSERT INTO Turnos (id_servicio, fecha_turno, hora_inicio, hora_fin, estado)
                VALUES (@IdServicio, @FechaActual, @HoraInicio, DATEADD(MINUTE, @Duracion, @HoraInicio), 'Pendiente');
                FETCH NEXT FROM comercio_cursor INTO @IdComercio;
            END

            CLOSE comercio_cursor;
            DEALLOCATE comercio_cursor;

            SET @HoraInicio = DATEADD(MINUTE, @Duracion, @HoraInicio);
        END

        SET @FechaActual = DATEADD(DAY, 1, @FechaActual);
    END
END