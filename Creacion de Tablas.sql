drop database if exists cinemar;
create database cinemar character set utf8mb4;
use cienmar;


create table Usuario (
Id int unsigned auto_increment primary key,
Nombre varchar(50) not null,
Apellido varchar(30) not null,
Mail  varchar(30) not null,
Fecha_Nac date not null,
Contraseña varchar(8) not null,
Id_Tipo int not null,
id_Sala int not null,
foreign key (Id_Tipo) references Tipo_Usuario (Id_Tipo)
);
create table Tipo_Usuario (
Id_Tipo int unsigned auto_increment primary key,
Nombre_Usuario varchar(15)
);

create table Reserva(
Id_Reserva int unsigned auto_increment primary key,
Fecha date not null,
Descuento boolean not null,
Id_Usuario integer not null,
Id_Descuento integer not null,
Id_Sala integer not null,
foreign key (Id_Usuario) references Usuario (Id_Usuario),
foreign key (Id_Descuento) references Descuento (ID_Descuento),
foreign key (Id_Sala) references Sala (Id_Sala)
);

create table Descuento(
Id_Descuento int unsigned auto_increment primary key,
Dia_Semana varchar(9) not null,
Porcentaje integer not null
); 

create table Sala(
Id_Sala int unsigned auto_increment primary key,
Butaca varchar(3) not null,
Dia varchar(9) not null,
Horario time not null,
Eliminar boolean not null,
Id_Peli integer not null,
foreign key (Id_Peli) references Pelicula (Id_Peli)
);

create table Pelicula(
Id_Peli int unsigned auto_increment primary key,
Titulo_Pelicula varchar(25) not null,
Duracion_Pelicula time not null,
Sinopsis varchar(200) not null,
ID_Categoria integer not null,
foreign key (Id_Categoria) references Categoria (Id_Categoria)
);

create table Categoria(
Id_Descuento int unsigned auto_increment primary key,
Nombre_Categoria varchar(30)
);


						