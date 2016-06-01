USE rothexample;

CREATE TABLE rothexample.pet
(
  `id` INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,  
  `nickName` VARCHAR(255) NOT NULL,  
  `keeperId` INTEGER NOT NULL, 
  `animal` VARCHAR(255) NOT NULL, 
  `gender` VARCHAR(255) DEFAULT NULL,  
  `age` INTEGER NOT NULL DEFAULT 0,
  FOREIGN KEY (`keeperId`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into rothexample.pet (nickName, keeperId, animal, gender, age) VALUES ('Kitty', 1, 'cat', 'f', 1);
insert into rothexample.pet (nickName, keeperId, animal, gender, age) VALUES ('Turty', 2, 'turtle','m', 10);
insert into rothexample.pet (nickName, keeperId, animal, gender, age) VALUES ('Blecky', 4, 'dog', 'm', 2);
insert into rothexample.pet (nickName, keeperId, animal, gender, age) VALUES ('Curely', 4, 'dog', 'f', 3);