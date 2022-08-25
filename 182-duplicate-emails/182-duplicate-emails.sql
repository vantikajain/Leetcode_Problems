# Write your MySQL query statement below
select email from Person 
group by Email
having COUNT(email)>1;