select d.name as Department ,e.name as Employee ,e.salary as Salary
from Employee as e
left join Department as d 
on e.departmentId =d.id
where  e.salary = (
    SELECT MAX(e2.salary)
    FROM Employee as e2
    WHERE e2.departmentId = e.departmentId
);