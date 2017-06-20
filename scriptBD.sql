 /*script para nuestra base de datos en mysql cree un usuario y contraseña tambien
  para que tengamos lo mismo en el archivo properties de spring para las propiedades del
  dataSource va y asi localmente puedan crearla e ir haciendo pruebas si gustan*/
  
create user 'equipo_sconti'@'localhost'identified by 'admin';

grant all privileges on * . * to 'equipo_sconti'@'localhost';

flush privileges;
 
 /*este usuario tiene privilegios sobre sus bd de forma local va entonces vamos 
 a crear la bd:*/
 
 
create database proyecto_sconti;

use proyecto_sconti;

/* creamos las tablas:*/

create table producto(idProducto int not null primary key auto_increment, 
nombre varchar(45) not null,
precio float(4,2) not null,
enExistencia int not null) ENGINE=InnoDB  default charset=utf8;

/*se crea venta con su idVenta && idProducto como llave primaria compuesta, para poder
tener asociados varios productos al mismo idVenta y se nos facilite obtener los productos 
de cierta venta por ejemplo tener en bd: 
{idVenta=1,idProoducto=2,fecha=2017/06/20,cantiad=4,}
{idVenta=1,idProoducto=3,fecha=2017/06/20,cantiad=2,}
{idVenta=1,idProoducto=7,fecha=2017/06/20,cantiad=1,}...etc
la cosa es que tendremos que incrementar manualmente el idVenta cuando hagamos una venta
para otra persona.
nota: el formato en mysql para date es año/mes/dia va para cuando vayamos a insertar a bd ;)
*/
 create table ventas(idVenta int not null,
idProducto int not null,
fechaVenta date not null,
cantidad int not null,
primary key(idVenta,idProducto),
 foreign key(idProducto) references producto(idProducto))ENGINE=InnoDB default charset=utf8;

/*
Creamos la tabla usuarios y sus roles:
en la tabla rolesUsuario deje como authority el campo que hace refrerencia al rol solo que en spring scurity asi
maenja el termino vale, que nose cuales definamos...como administrador y empleado por decirlo asi va.
*/

 CREATE TABLE usuarios (

usuarioId INT(10) UNSIGNED NOT NULL,

nombreUsuario VARCHAR(45) NOT NULL,

password VARCHAR(60) NOT NULL,

PRIMARY KEY (usuarioId)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE rolesUsuario (

rolUsuarioId INT(10) UNSIGNED NOT NULL,

usuarioId INT(10) UNSIGNED NOT NULL,

authority VARCHAR(45) NOT NULL,

PRIMARY KEY (rolUsuarioId),

KEY FK_usuarios_roles (usuarioId),

CONSTRAINT FK_usuarios_roles FOREIGN KEY (usuarioId) REFERENCES usuarios (usuarioId)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

