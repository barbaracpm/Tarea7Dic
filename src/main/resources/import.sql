INSERT INTO tutores (nombre) VALUES('Dayana');
INSERT INTO tutores (nombre) VALUES('Miguel');
INSERT INTO tutores (nombre) VALUES('Yanelis');
INSERT INTO tutores (nombre) VALUES('Ivan');


INSERT INTO alumnos (tutor_id,nombre,apellido,email,dni,created_at) VALUES(1,'Jose','Perez','jp@hotmail.com','11864454L','2021-10-01');
INSERT INTO alumnos (tutor_id,nombre,apellido,email,dni,created_at) VALUES(1,'María','Morán','mm@hotmail.com','11898454L','2021-10-01');
INSERT INTO alumnos (tutor_id,nombre,apellido,email,dni,created_at) VALUES(2,'Eduardo','Friese','ef@hotmail.com','15564454L','2021-10-01');
INSERT INTO alumnos (tutor_id,nombre,apellido,email,dni,created_at) VALUES(3,'Shiger','Ban','sb@hotmail.com','11899454L','2021-10-01');
INSERT INTO alumnos (tutor_id,nombre,apellido,email,dni,created_at) VALUES(4,'Alvar','Aalto','alaal@hotmail.com','11868854L','2021-10-01');
INSERT INTO alumnos (tutor_id,nombre,apellido,email,dni,created_at) VALUES(3,'Chantal','Akerman','chantal@hotmail.com','11864499M','2021-10-01');
INSERT INTO alumnos (tutor_id,nombre,apellido,email,dni,created_at) VALUES(4,'Jean','Nouvel','jnouvel@hotmail.com','11843454F','2021-10-01');

INSERT INTO roles (nombre) VALUES('ROLE_USER');
INSERT INTO roles (nombre) VALUES('ROLE_ADMIN');

INSERT INTO usuarios (username,password,enabled) VALUES('Paul','$2a$10$YWayHht2FJvleYFDvzv6K.fU0cElPqZ4VUa3cGi6csqSEZR5kHn/O',1);
INSERT INTO usuarios (username,password,enabled) VALUES('Carolina','$2a$10$V4YaQKVAvb2.4AcCJPWz5eJG.5KWLggYN0O/57f8wE5SIhH7Qz8.2',2);


INSERT INTO usuarios_roles (usuario_id,role_id) VALUES(1,1);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES(2,2);
