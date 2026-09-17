with cte as (
    select person_name,
    sum(weight) over(order by turn) as total
    from Queue
)
select person_name
from cte 
where total <= 1000
ORDER BY total DESC
LIMIT 1;