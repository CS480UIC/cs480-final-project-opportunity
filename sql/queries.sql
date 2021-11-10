# Simple Queries
SELECT position_title, job_description, salary
FROM job_opportunity
WHERE salary > 70000 AND benefit_description LIKE '%Insurance%'
ORDER BY salary DESC;

# Aggregate Queries
SELECT user_id, award_name, `description`, MAX(reward_amount), deadline
FROM scholarship
GROUP BY user_id
HAVING deadline > '2022-03-01';

# Complex Queries
SELECT position_title, job_description, salary, `name`, industry, review
FROM job_opportunity
INNER JOIN company
ON job_opportunity.company_id = company.company_id;