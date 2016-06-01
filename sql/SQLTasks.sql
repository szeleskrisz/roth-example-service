SELECT * FROM person;
SELECT * FROM pet;
SELECT * FROM medicalRecord;

DELETE FROM pet WHERE id > 4;

-- 1. List the number of pets per owner owner
SELECT person.firstName, person.lastName, person.id, petCount 
FROM person
INNER JOIN 
(
	SELECT person.id AS personId, COUNT(*) AS petCount 
    FROM person
	INNER JOIN pet ON person.id = pet.keeperId
	GROUP BY person.id
) AS aggregation ON person.id = aggregation.personId;     

-- 2. List the medical costs for each pet
SELECT pet.id, pet.nickName, costs 
FROM pet
INNER JOIN 
(
	SELECT pet.id AS petId, SUM(fee) AS costs 
    FROM pet
	INNER JOIN medicalRecordmedicalRecord ON medicalRecord.animalId = pet.id
	GROUP BY pet.id
) AS aggregation ON pet.id = aggregation.petId;

-- 3. List the total cost for each owner - the sum of all the medical fees for all the animals   
SELECT person.firstName, person.lastName, person.id AS personId, totalCost, nrOfPets, totalVisitPerPers 
FROM person
INNER JOIN
(
	SELECT pet.keeperId AS keeperID, SUM(costs) AS totalCost, COUNT(petId) as nrOfPets, SUM(visitPerAnimal) as totalVisitPerPers  
    FROM pet
	INNER JOIN 
    (
		SELECT pet.id AS petId, SUM(fee) AS costs, COUNT(medicalRecord.id) as visitPerAnimal 
        FROM pet
		INNER JOIN medicalRecord ON medicalRecord.animalId = pet.id
		GROUP BY pet.id
	) AS aggrMedRecord ON pet.id = aggrMedRecord.petId
	GROUP BY keeperID
) AS aggrPets ON aggrPets.keeperID = person.id;




