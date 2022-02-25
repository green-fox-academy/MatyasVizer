use [AdventureWorks2016]
select top 20 PersonType, concat(FirstName,' ', LastName) as 'Full Name'
from Person.Person
where PersonType = 'EM'