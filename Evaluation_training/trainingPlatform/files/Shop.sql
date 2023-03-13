-- -------------------------------------- ---
-- - Construction de la base de données - ---
-- -------------------------------------- ---
DROP DATABASE IF EXISTS ShopTraining;
CREATE DATABASE ShopTraining;
USE ShopTraining;

-- -------------------------- ---
-- - Table des utilisateurs - ---
-- -------------------------- ---
CREATE TABLE T_Users (
	IdUser				int(4)		PRIMARY KEY AUTO_INCREMENT,
	Login				varchar(20)	NOT NULL UNIQUE,
	Password			varchar(20)	NOT NULL
) ENGINE = InnoDB;

INSERT INTO T_Users ( Login, Password ) VALUE ( 'WilliamShakespeare','W123');
INSERT INTO T_Users ( Login, Password ) VALUE ( 'SamiraLachhab','S123');
INSERT INTO T_Users ( Login, Password ) VALUE ( 'MohamedSijelmassi','M123');
INSERT INTO T_Users ( Login, Password ) VALUE ( 'OctaviaButler','O123');
INSERT INTO T_Users ( Login, Password ) VALUE ( 'MariamaBa','M123');
INSERT INTO T_Users ( Login, Password ) VALUE ( 'NatsumeSoseki','N123');

SELECT * FROM T_Users;

-- ------------------------------------- ---
-- - Table des catégories de formation - ---
-- ------------------------------------- ---

CREATE TABLE T_Categories (
	IdCategory 				INT(4) 		 PRIMARY KEY AUTO_INCREMENT,
	CatName 				VARCHAR(30)  NOT NULL,
	Description 			VARCHAR(100) NOT NULL
) ENGINE = InnoDB;

insert into T_Categories (IdCategory, CatName, Description) values (1 , 'front-end' , 'l’interface utilisateur représente l''ensemble des mécanismes, matériels ou logiciels, qui permettent à un utilisateur d''interagir avec un système informatique.');
insert into T_Categories (IdCategory, CatName, Description) values (2 , 'Frameworks' , 'Les frameworks sont donc conçus et utilisés pour modeler l''architecture des logiciels applicatifs');
insert into T_Categories (IdCategory, CatName, Description) values (3 , 'Linux' , 'systèmes d''exploitation open source de type Unix');
insert into T_Categories (IdCategory, CatName, Description) values (4 , 'Langage de programmation' , 'structures des données qui seront manipulées par l''appareil informatique et quelles seront les manipulations.');
insert into T_Categories (IdCategory, CatName, Description) values (5 , 'back-end' , 'Architecture modèle-vue-contrôleur, représentation et traitement des données en arrière-plan');

select * from t_categories;

-- --------------------------------------------- --
-- - Table des formations disponibles payantes - --
-- --------------------------------------------- --
CREATE TABLE T_Training (
	IdTraining			    int(4)      PRIMARY KEY AUTO_INCREMENT,
	NameTraining            varchar(30) NOT NULL,
	Description				varchar(30)	NOT NULL,
	DayOfTraining			int(4)	    NOT NULL,
    ConditionTraining       VARCHAR(30) NOT NULL,
	PricePerCourse  		float(8)	NOT NULL DEFAULT 0,
	IdCategory				int(4),
	FOREIGN KEY (IdCategory)	REFERENCES T_Categories(IdCategory)
) ENGINE = InnoDB;

INSERT INTO T_Training ( NameTraining, Description, DayOfTraining, ConditionTraining, PricePerCourse, IdCategory ) VALUES ( 'Java', 'Java SE 8 : Syntaxe & Poo', 20, 'Distanciel', 825 , 4);
INSERT INTO T_Training ( NameTraining, Description, DayOfTraining, ConditionTraining, PricePerCourse, IdCategory ) VALUES ( 'Java Avancé', 'Poo, exceptions, fichiers, Jdbc, thread', 20, 'Distanciel', 1225 , 4);
INSERT INTO T_Training ( NameTraining, Description, DayOfTraining, ConditionTraining, PricePerCourse, IdCategory ) VALUES ( 'Spring', 'Spring Core/Mvc/Security', 20, 'Distanciel', 750 , 2);
INSERT INTO T_Training ( NameTraining, Description, DayOfTraining, ConditionTraining, PricePerCourse, IdCategory ) VALUES ( 'Php frameworks' , 'Symphony' , 15, 'Distanciel', 565 , 2);
INSERT INTO T_Training ( NameTraining, Description, DayOfTraining, ConditionTraining, PricePerCourse, IdCategory ) VALUES ( 'C#' , 'DoteNet Core' , 20, 'Présentiel', 1875 , 1);
INSERT INTO T_Training ( NameTraining, Description, DayOfTraining, ConditionTraining, PricePerCourse, IdCategory ) VALUES ( 'Python avancé' , 'Poo, Utiliser les args et kwargs, Bien documenter avec docstrings, Utiliser les args et kwargs pour rendre vos fonctions versatiles et personnalisables' , 7, 'Présentiel', 1825 );
INSERT INTO T_Training ( NameTraining, Description, DayOfTraining, ConditionTraining, PricePerCourse, IdCategory ) VALUES ( 'Scripting Shell/Bash' , 'Automatisez votre système Linux !, logs, boucles, Shebang, Case' , 5, 'Distanciel', 225 );
INSERT INTO T_Training ( NameTraining, Description, DayOfTraining, ConditionTraining, PricePerCourse, IdCategory ) VALUES ( 'Java Bdd' , 'Java et les bases de données avec JDBC, Hibernate et JPA' , 8, 'Présentiel', 1825, 5 );
INSERT INTO T_Training ( NameTraining, Description, DayOfTraining, ConditionTraining, PricePerCourse, IdCategory ) VALUES ( 'Javascript ES7' , 'Npm, Webpack' , 8, 'Présentiel', 1225 , 1);
INSERT INTO T_Training ( NameTraining, Description, DayOfTraining, ConditionTraining, PricePerCourse, IdCategory ) VALUES ( 'React.js' , 'Hooks, Redux, Contexte inclus' , 20, 'Distanciel', 475 , 2);
INSERT INTO T_Training ( NameTraining, Description, DayOfTraining, ConditionTraining, PricePerCourse, IdCategory ) VALUES ( 'Angular' , 'Databinding et les Templates dans Angular, Les Directives et les pipes' , 22, 'Distanciel', 1075 , 2);


SELECT * FROM T_Training;

