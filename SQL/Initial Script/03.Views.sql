use inf;

CREATE VIEW PersonViewRepository AS
SELECT 
		id,
		CONCAT(fName," ",lName) name
FROM person;