CREATE TABLE rothexample.medicalRecord
(
  `id` INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,
  `visitDate` DATETIME NOT NULL,  
  `animalId` INTEGER NOT NULL,  
  `visitType` VARCHAR(255) NOT NULL, 
  `fee` DOUBLE DEFAULT NULL,  
  `notes` VARCHAR(255) DEFAULT NULL,
  FOREIGN KEY (`animalId`) REFERENCES `pet` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into rothexample.medicalRecord (visitDate, animalId, visitType, fee, notes) VALUES (now(), 2, 'operation', 100, "succeed");
insert into rothexample.medicalRecord (visitDate, animalId, visitType, fee, notes) VALUES (now(), 3,'inspection', 12.5, "healty");
insert into rothexample.medicalRecord (visitDate, animalId, visitType, fee, notes) VALUES (now(), 4,'medicine given', 5, "for 2 weeks");
insert into rothexample.medicalRecord (visitDate, animalId, visitType, fee, notes) VALUES (now(), 4,'vaccination', 7, "for 2 weeks");