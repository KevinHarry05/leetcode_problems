SELECT query_name,
    round(avg(rating/position),2) as quality , round(avg(rating < 3)*100,2) as poor_query_percentage
FROM Queries
WHERE query_name IS NOT NULL
GROUP BY query_name;