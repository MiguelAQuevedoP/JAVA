CREATE TABLE Persona (
    Nombre VARCHAR2(20)NOT NULL,
    Apellido  VARCHAR2(15) NOT NULL,
    Cedula NUMBER(10) NOT NULL,
    Codigo  NUMBER(15) PRIMARY KEY,
    Dia NUMBER (2)NOT NULL,
    Mes NUMBER(2)NOT NULL,
    Anios NUMBER(4)NOT NULL,
    Grado VARCHAR2(20),
    Tipo VARCHAR2(10)
    
    );
    
   
CREATE TABLE Materia (
    Codigo NUMBER(5) PRIMARY KEY,
    Nombre VARCHAR2(30) NOT NULL,
    Creditos NUMBER(1) NOT NULL,
    Semestre NUMBER (2) NOT NULL,
    Carrera VARCHAR2(30) NOT NULL
    );    

CREATE TABLE Curso (
    Codigo NUMBER(5) PRIMARY KEY,
    Nombre VARCHAR2(40) NOT NULL,
    C_Materia NUMBER (5) REFERENCES Materia(Codigo),
    Periodo VARCHAR2 (15) NOT NULL,
    Profesor NUMBER(15) REFERENCES Persona(Codigo),
    Horario_1 VARCHAR2 (40) NOT NULL,
    Horario_2 VARCHAR2 (40) NOT NULL,
    Tam NUMBER(2) NOT NULL
    
    ); 
