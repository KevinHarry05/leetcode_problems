SELECT
    e.employee_id,
    e.name,
    m.reports_count,
    ROUND(m.average_age) AS average_age
FROM Employees e
JOIN (
    SELECT
        reports_to,
        COUNT(*) AS reports_count,
        AVG(age) AS average_age
    FROM Employees
    WHERE reports_to IS NOT NULL
    GROUP BY reports_to
) m
ON e.employee_id = m.reports_to
ORDER BY e.employee_id;