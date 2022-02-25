use [AdventureWorks2016]
select top 20 concat(P.FirstName, ' ', P.LastName), count(*) 
from Person.Person as P
group by concat(P.FirstName, ' ', P.LastName)
having count(*) >= 4
order by count(*) desc