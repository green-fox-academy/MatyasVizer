use [AdventureWorks2016]
select *
from Person.Person as P
where P.PersonType = 'EM' and P.FirstName = 'John'