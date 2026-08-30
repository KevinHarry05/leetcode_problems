select
    d.name as Department,
    e.name as Employee,
    e.salary as Salary
from(
    select name,
        salary,
        departmentId,
        DENSE_RANK() OVER (
            PARTITION BY departmentId
            ORDER BY salary DESC
        ) as rank_NM
    FROM Employee
) e
join Department d
on e.departmentId = d.id
where rank_NM<=3;