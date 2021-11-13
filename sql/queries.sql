/* Simple Queries: A simple query searches data in one table using logic operators in the condition,
   and orders the result by a particular column. */

SELECT position_title, job_description, salary
FROM job_opportunity
WHERE salary > 70000 AND benefit_description LIKE '%Insurance%'
ORDER BY salary DESC;

SELECT *
FROM scholarship AS s
WHERE s.reward_amount > 3000 AND s.deadline = '2021-11-11'
ORDER BY s.award_name DESC;

SELECT * 
FROM tutor 
WHERE grade_level > 9 AND fee < 30
ORDER BY grade_level DESC;

/* ######## */

/* Aggregate Queries: An aggregate query groups data in one table and applies an aggregate function */

SELECT user_id, award_name, description, MAX(reward_amount), deadline
FROM scholarship
GROUP BY user_id, award_name, description, deadline
HAVING deadline > '2022-03-01';

SELECT subject, COUNT(*) AS totalTutors
FROM tutor
GROUP BY subject;

SELECT legal_id, user_id, cost, legal_description, resource_location, resource_name, COUNT(*) resource_count
FROM legal_resource
GROUP BY legal_id, user_id, cost, legal_description, resource_location, resource_name;

/* ######## */

/* Complex Queries: A complex query searches data in two or more tables */

SELECT position_title, job_description, salary, `name`, industry, review
FROM job_opportunity
INNER JOIN company
ON job_opportunity.company_id = company.company_id;

SELECT fullname, subject, fee, (SELECT service_name FROM tutoring_service ts WHERE ts.service_id = t.service_id) AS service_name
FROM tutor t;

SELECT username, cost, legal_description 
FROM user AS U
INNER JOIN legal_resource AS LR
ON U.user_id = LR.user_id;
