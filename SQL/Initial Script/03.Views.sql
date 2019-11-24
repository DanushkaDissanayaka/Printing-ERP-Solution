use inf;

CREATE VIEW SupplierViewRepository AS
SELECT 
		id,
		CONCAT(fName," ",lName) name
FROM person WHERE type = 3;


CREATE VIEW PersonViewRepository AS
SELECT 
		p.id,
        p.type,
        p.status,
		CONCAT(p.fName," ",p.lName) name,
        p.email,
        t.number
FROM person p 
LEFT JOIN teliphone t ON p.id = t.id;