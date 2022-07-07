drop database if exists cinemar;
create database cinemar character set utf8mb4;
use cinemar;


create table Usuario (
Id int4 unsigned auto_increment primary key,
Nombre varchar(50) not null,
Apellido varchar(30) not null,
Mail  varchar(30) not null,
Fecha_Nac date not null,
Contraseña varchar(8) not null,
Id_Tipo int4 unsigned not null,
foreign key (Id_Tipo) references Tipo_Usuario (Id_Tipo)
);

create table Tipo_Usuario (
id_tipo int4 unsigned auto_increment primary key,
nombre_usuario varchar(15)
);

create table Reserva(
Id_Reserva int4 unsigned auto_increment primary key,
Fecha date not null,
Descuento boolean not null,
Id_Usuario int4 unsigned not null,
Id_Descuento int4 unsigned not null,
Id_Sala int4 unsigned not null,
foreign key (Id_Usuario) references Usuario (Id),
foreign key (Id_Descuento) references Descuento (ID_Descuento),
foreign key (Id_Sala) references Sala (Id_Sala)
);

create table Descuento(
Id_Descuento int4 unsigned auto_increment primary key,
Dia_Semana varchar(9) not null,
Porcentaje integer not null
); 

create table Sala(
Id_Sala int4 unsigned auto_increment primary key,
Butaca varchar(3) not null,
Dia varchar(9) not null,
Horario time not null,
Eliminar boolean not null,
Id_Peli int4 unsigned not null,
foreign key (Id_Peli) references Pelicula (Id_Peli)
);

create table Pelicula(
Id_Peli int4 unsigned auto_increment primary key,
Titulo_Pelicula varchar(25) not null,
Duracion_Pelicula time not null,
Sinopsis varchar(200) not null,
idioma varchar(15) not null,
Id_Categoria int4 unsigned not null,
Id_Clasificacion int4 unsigned not null,
foreign key (Id_Categoria) references Categoria (Id_Categoria)
);

create table Categoria(
Id_Categoria int4 unsigned auto_increment primary key,
Nombre_Categoria varchar(30)
);

create table Clasificacion(
Id_Clasificacion int unsigned auto_increment primary key,
Nombre_Clas varchar(10)
);


						