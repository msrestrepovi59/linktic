CREATE DATABASE linktic;

\c linktic;


CREATE TABLE asegurados (
    
    tipo_identificacion INT NOT NULL,
    num_identificacion BIGINT NOT NULL,
    apellidos VARCHAR(100),
    nombres VARCHAR(100),
    sexo INT,
    fecha_nacimiento DATE,
	PRIMARY KEY (num_identificacion)

	
);

CREATE TABLE amparos (
    codigo INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE primas (
    codigo INT NOT NULL,
    edad_minima INT,
    edad_maxima INT,
    porcentaje_prima DECIMAL(10,5),
    PRIMARY KEY (codigo, edad_minima, edad_maxima)
);


INSERT INTO asegurados (tipo_identificacion, num_identificacion, apellidos, nombres, sexo, fecha_nacimiento) VALUES
(1, 79000001, 'APELLIDO1', 'NOMBRE1', 1, '1945-01-10'),
(1, 79000002, 'APELLIDO2', 'NOMBRE2', 1, '1950-01-10'),
(1, 79000003, 'APELLIDO3', 'NOMBRE3', 1, '1955-01-10'),
(2, 51000001, 'APELLIDO4', 'NOMBRE4', 2, '1960-01-10'),
(2, 51000002, 'APELLIDO5', 'NOMBRE5', 2, '1965-01-10'),
(2, 51000003, 'APELLIDO6', 'NOMBRE6', 2, '1970-01-10');

INSERT INTO amparos (codigo, nombre) VALUES
(1, 'Muerte accidental'),
(2, 'Desmembración'),
(3, 'Auxilio funerario'),
(4, 'Renta vitalicia');

INSERT INTO primas (codigo, edad_minima, edad_maxima, porcentaje_prima) VALUES
(1, 18, 45, 0.02304),
(1, 46, 75, 0.02012),
(2, 18, 50, 0.1809),
(2, 51, 70, 0.16043),
(3, 18, 60, 0.14123),
(3, 61, 70, 0.1545),
(4, 18, 50, 0.12123),
(4, 51, 70, 0.1345);