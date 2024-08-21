# Write your MySQL query statement below

select customer_id, COUNT(visit_id) as count_no_trans 
from Visits
where visit_id NOT IN (Select visit_id from transactions )
GROUP BY 
  customer_id;
