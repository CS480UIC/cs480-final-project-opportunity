# Simple Queries
SELECT position_title, job_description, salary
FROM job_opportunity
WHERE salary > 70000 AND benefit_description LIKE '%Insurance%'
ORDER BY salary DESC;

SELECT *
FROM scholarship AS s
WHERE s.reward_amount > 3000 AND s.deadline = '2021-11-11'
ORDER BY s.reward_amount DESC;

SELECT * 
FROM tutor 
WHERE grade_level > 9 AND fee < 30
ORDER BY grade_level DESC;

SELECT username, date_time
FROM user
WHERE username LIKE '%7%'
ORDER BY date_time;

SELECT location, service_description
FROM health_resource as h
GROUP BY h.location 
HAVING CAST(h.payment AS INT) < 1000 AND health_type = 'ABC';

# Aggregate Queries
SELECT user_id, award_name, `description`, MAX(reward_amount), deadline
FROM scholarship
GROUP BY user_id, award_name, `description`, deadline
HAVING deadline > '2022-03-01';

SELECT subject, COUNT(*) AS totalTutors 
FROM tutor 
GROUP BY subject;

SELECT legal_id, user_id, cost, legal_description, resource_location, resource_name, 
concat(resource_name, " ", legal_description) as NameDescription
FROM legal_resource
GROUP BY legal_id, user_id, cost, legal_description, resource_location, resource_name;

SELECT date_time, COUNT(*) AS NumUsers
FROM user
GROUP BY MINUTE(date_time);

SELECT position_title, COUNT(*) AS totalOpeningsInCompany
FROM job_opportunity
GROUP BY company_id
HAVING salary > 80000;

# Complex Queries
SELECT position_title, job_description, salary, `name`, industry, review
FROM job_opportunity
INNER JOIN company
ON job_opportunity.company_id = company.company_id;

SELECT fullname, `subject`, fee, (SELECT service_name FROM tutoring_service ts WHERE ts.service_id = t.service_id) AS service_name 
FROM tutor t;

SELECT username, cost, legal_description 
FROM user AS U
INNER JOIN legal_resource AS LR
ON U.user_id = LR.user_id;

SELECT jo.position_title, jo.job_description 
FROM job_opportunity as jo
INNER JOIN company as c
ON jo.company_id = c.company_id
WHERE c.industry = 'Technology';

SELECT username
FROM user
WHERE EXISTS
	(SELECT *
     FROM scholarship
     WHERE user.user_id = scholarship.user_id);