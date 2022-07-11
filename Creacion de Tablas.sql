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

insert into Tipo_Usuario values (null, "Cliente");
insert into Tipo_Usuario values (null, "Administrador");

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

insert into Descuento values (null,"Lunes",20);
insert into Descuento values (null,"Martes",10);
insert into Descuento values (null,"Miércoles",20);
insert into Descuento values (null,"Jueves",15);
insert into Descuento values (null,"Viernes",10);
insert into Descuento values (null,"Sábado",10);
insert into Descuento values (null,"Domingo",10);

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
id_dimen int unsigned not null,
foreign key (id_dimen) references dimens(id_dimen),
foreign key (Id_Categoria) references Categoria (Id_Categoria)
);

insert into Pelicula values (null,"LIGHTYEAR",'01:40:00',"Película sobre el joven piloto de pruebas Buzz Lightyear quién luego se convertiría en el popular juguete que todos los niños querrían tener en Toy Story","CASTELLANO",2,2,1);
insert into Pelicula values (null,"MINIONS NACE UN VILLANO",'01:27:00',"Muy pronto, de la franquicia animada más grande de la historia y el fenómeno global","CASTELLANO",2,1,1);
insert into Pelicula values (null,"TOP GUN MAVERICK",'02:17:00',"Después de más de treinta años de servicio como uno de los mejores aviadores de la Armada","CASTELLANO",3,3,1);
insert into Pelicula values (null,"ELVIS",'01:30:00',"Elvis es una película de drama biográfica sobre la vida y carrera del cantante Elvis Presley","CASTELLANO",3,4,1);
insert into Pelicula values (null,"DC LIGA DE SUPER MASCOTAS",'01:30:00',"Krypto el superperro y Superman son mejores amigos inseparables que comparten los mismos superpoderes y luchan juntos contra el crimen en Metropolis.","CASTELLANO",2,3,1);
insert into Pelicula values (null,"LIGHTYEAR",'01:40:00',"Película sobre el joven piloto de pruebas Buzz Lightyear quién luego se convertiría en el popular juguete que todos los niños querrían tener en Toy Story","CASTELLANO",2,2,2);
insert into Pelicula values (null,"MINIONS NACE UN VILLANO",'01:27:00',"Muy pronto, de la franquicia animada más grande de la historia y el fenómeno global","CASTELLANO",2,1,2);
insert into Pelicula values (null,"TOP GUN MAVERICK",'02:17:00',"Después de más de treinta años de servicio como uno de los mejores aviadores de la Armada","CASTELLANO",3,3,2);
insert into Pelicula values (null,"ELVIS",'01:30:00',"Elvis es una película de drama biográfica sobre la vida y carrera del cantante Elvis Presley","CASTELLANO",3,4,2);
insert into Pelicula values (null,"DC LIGA DE SUPER MASCOTAS",'01:30:00',"Krypto el superperro y Superman son mejores amigos inseparables que comparten los mismos superpoderes y luchan juntos contra el crimen en Metropolis.","CASTELLANO",2,3,2);


create table Categoria(
Id_Categoria int4 unsigned auto_increment primary key,
Nombre_Categoria varchar(30)
);

insert into Categoria values (null,"ACCION");
insert into Categoria values (null,"ANIMACION");
insert into Categoria values (null,"AVENTURA");
insert into Categoria values (null,"BIOGRAFIA");
insert into Categoria values (null,"COMEDIA");
insert into Categoria values (null,"DRAMA");
insert into Categoria values (null,"TERROR");

create table Clasificacion(
Id_Clasificacion int unsigned auto_increment primary key,
Nombre_Clas varchar(10)
);

insert into Clasificacion values (null, "ATP");
insert into Clasificacion values (null, "+13");
insert into Clasificacion values (null, "+15");
insert into Clasificacion values (null, "+18"); 


create table dimens(
Id_dimen int unsigned auto_increment primary key,
dimen varchar(2)
);

select * from dimens;

insert into dimens values(null,"2D");
insert into dimens values(null,"3D");
						