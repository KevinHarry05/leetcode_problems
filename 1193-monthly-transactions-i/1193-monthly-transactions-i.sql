SELECT LEFT(trans_date,7) as month,
            country,
            count(trans_date) as trans_count,
            count( 
                case
                when state='approved' then 1 END)
            as approved_count,
            sum(amount) as trans_total_amount,
            sum( 
                case
                when state='approved'then amount else 0 end) as approved_total_amount

from Transactions
GROUP BY LEFT(trans_date, 7), country;

            

