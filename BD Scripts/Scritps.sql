use sysinventariodb;

#Creando la tabla de usuario
create table usuario(
idUsuario int not null auto_increment,
nombreUsuario varchar(15) not null,
contrasena blob not null,
activo tinyint not null default 1,
fechaCreacion datetime not null default current_timestamp,
primary key (idUsuario),
unique key `nombreUsuario_UNIQUE`(nombreUsuario) 
);

#Procedimiento almacenado para crear Usuarios
delimiter $$
create procedure spCrearUsuario(in nombreUsuario varchar(15), 
in contrasena varchar(15),
out idUsuario int)
begin
insert into usuario(nombreUsuario, contrasena) 
value (nombreUsuario, aes_encrypt(contrasena, 'clavesupersecretaa'));
select last_insert_id() into idUsuario;
select *from usuario u where u.idUsuario = idUsuario;
end $$

#Creando un Usuario
set @idUsuario = null;
call spCrearUsuario('Jimmy','Upoli123',@idUsuario);
select @idUsuario;


#Procedimiento almacenado para validar Usuario
delimiter $$
create procedure spValidarUsuario(in nombreUsuario varchar(15), in contrasena varchar(15), 
out valido boolean)
begin
set @cantidad = null;
set valido = 0;

select count(*) from usuario u
where u.nombreUsuario = nombreUsuario
and u.contrasena = aes_encrypt(contrasena, 'clavesupersecretaa')
into @cantidad;

if @cantidad > 0 then
set valido = 1;
select *from usuario u where u.nombreUsuario = nombreUsuario
and u.contrasena = aes_encrypt(contrasena, 'clavesupersecretaa');
end if;
end$$

#Comprobando si el usuario existe
set @valido = null;
call spValidarUsuario('Kevin','Upoli123',@valido);
select @valido;

#cambiando nuestra zona horaria
set GLOBAL time_zone = '-6:00';

#Creando la tabla producto

CREATE TABLE productos(
`idProducto` int not null auto_increment,
`nombreProducto` varchar(45) not null,
`cantidadExistencia` decimal (8,2) not null default 0,
`existenciaMinima` decimal(8,2) not null,
`idUsuarioRegistra` int not null,
`fechaRegistro` datetime null default current_timestamp(),
primary key(`idProducto`),
unique index `nombreProductor_UNIQUE` (`nombreProducto` asc) visible,
constraint `FK_idUsuario`
foreign key (`idUsuarioRegistra`) references `usuario`(`idUsuario`)
on delete restrict 
on update cascade
);

#Creando una vista para los productos
/*create view vwListadoProductos as
select p.idProducto 'codigo',p.nombreProducto 'Nombre Producto', p.cantidadExistencia 'Existencia',
p.existenciaMinima 'Existencia Minima',
p.idUsuarioRegistra 'Registrado por'
from productos p;*/

set FOREIGN_KEY_CHECKS=0

create view vwListadoProductos as
select p.idProducto 'codigo',p.nombreProducto 'Nombre Producto', p.cantidadExistencia 'Existencia', 
p.existenciaMinima 'Existencia Minima', u.nombreUsuario 'Registrado por'
from productos p
inner join usuario u on u.idUsuario = p.idUsuarioRegistra

select *from vwListadoProductos

#Procedimiento almacenado para agregar un producto
delimiter $$
create procedure spRegistrarProducto(
in nombreProducto varchar(45),
in cantidadExitencia decimal (8,2),
in exitenciaMinima decimal (8,2),
in idUsuarioRegistra int
)
begin
	insert into productos(nombreProducto, cantidadExistencia, existenciaMinima, idUsuarioRegistra)  values
    (nombreProducto, cantidadExitencia, exitenciaMinima, idUsuarioRegistra);
    
    
    select *from productos p where p.idProducto = last_insert_id();
end $$
DELIMITER ;

select *from productos;
call spRegistrarProducto('Maruchan',20,5,3);