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
call spCrearUsuario('Kevin','Upoli123',@idUsuario);
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


