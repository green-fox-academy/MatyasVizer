use [AdventureWorks2016]
select top 20 PersonType, FirstName, LastName
from Person.Person
where PersonType = 'EM'