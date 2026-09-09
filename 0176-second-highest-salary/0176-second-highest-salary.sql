with cte as(
    select salary, DENSE_RANK() OVER( order by salary desc ) as sal
    from Employee
)
select MAX(salary) as SecondHighestSalary
from cte 
where sal =2;