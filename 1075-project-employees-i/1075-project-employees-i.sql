select p.project_id , 
            IFNULL(
        ROUND(SUM(experience_years ) / count(p.project_id), 2),
        0
    ) AS average_years
from Project p
join Employee e
on p.employee_id= e.employee_id
GROUP BY p.project_id
order by project_id;