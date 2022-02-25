use [AdventureWorks2016]
select count(P.FirstName)
from Person.Person as P
where P.FirstName = 'Ken'