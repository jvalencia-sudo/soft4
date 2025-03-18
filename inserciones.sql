-- Eliminar tablas si existen en cascada
DROP TABLE IF EXISTS historial_estados CASCADE;
DROP TABLE IF EXISTS aplicaciones CASCADE;
DROP TABLE IF EXISTS medicamentos CASCADE;
DROP TABLE IF EXISTS empleados CASCADE;
DROP TABLE IF EXISTS mascotas CASCADE;
DROP TABLE IF EXISTS clientes CASCADE;
DROP TABLE IF EXISTS estados CASCADE;

-- Crear tablas
CREATE TABLE clientes
(
    id_cliente bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    nombre     text,
    telefono   text,
    email      text,
    direccion  text
);

CREATE TABLE mascotas
(
    id_mascota       bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    nombre           text,
    especie          text,
    edad             integer,
    historial_medico text,
    id_cliente       bigint REFERENCES clientes (id_cliente)
);

CREATE TABLE empleados
(
    id_empleado bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    nombre      text,
    rol         text,
    horario     text
);

CREATE TABLE medicamentos
(
    id_medicamento    bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    nombre            text,
    cantidad_stock    integer,
    precio            numeric,
    fecha_vencimiento date
);

CREATE TABLE aplicaciones
(
    id_aplicacion    BIGSERIAL PRIMARY KEY,
    id_mascota       BIGINT REFERENCES mascotas (id_mascota),
    id_medicamento   BIGINT REFERENCES medicamentos (id_medicamento),
    id_veterinario   BIGINT REFERENCES empleados (id_empleado),
    fecha_aplicacion TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    comentario       TEXT
);

CREATE TABLE estados
(
    id_estado bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    nombre    text
);

CREATE TABLE historial_estados
(
    id_historial_estado bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    id_mascota          bigint REFERENCES mascotas (id_mascota),
    id_estado           bigint REFERENCES estados (id_estado),
    fecha_hora          timestamp with time zone,
    comentario          text,
    id_empleado         bigint REFERENCES empleados (id_empleado)
);