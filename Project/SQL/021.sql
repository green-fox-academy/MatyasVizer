use [AdventureWorks2016]
select top 50 P.FirstName, P.LastName, A.EmailAddress
from Person.Person as P inner join Person.EmailAddress as A
on P.BusinessEntityID = A.BusinessEntityID