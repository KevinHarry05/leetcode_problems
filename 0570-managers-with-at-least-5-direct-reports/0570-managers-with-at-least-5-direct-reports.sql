select m.name
from Employee e
join Employee m
on m.id=e.managerId
group by m.id,m.name
having count(*) >= 5;