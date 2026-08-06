select a.name 
from Employee as a 
join Employee as b
on a.id=b.managerId 
group by a.id, a.name
having count(b.id)>=5;