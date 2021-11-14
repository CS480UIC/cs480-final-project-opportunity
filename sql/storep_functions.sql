# Stored Procedures
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `GetServiceAndContact`()
BEGIN
	SELECT service_name, contact_info
    FROM tutoring_service;
END$$
DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `biggest_scholarships`()
BEGIN
SELECT scholarship_id, award_name, requirement, reward_amount
FROM scholarship
WHERE reward_amount > (SELECT AVG(reward_amount) FROM scholarship);
END$$
DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `user_progress`(In username varchar(20), OUT quantity int)
SELECT COUNT(*)
    INTO quantity
    FROM scholarship as s, user as u
    WHERE u.user_id = s.user_id$$
DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `JobsPerUser`()
BEGIN
	SELECT COUNT(*)
    FROM job_opportunity
    GROUP BY user_id;

END$$
DELIMITER ;


# Functions
DELIMITER $$
CREATE DEFINER=`root`@`localhost` FUNCTION `CalculateTutorCost`(id INT, hours DECIMAL(8,2)) RETURNS decimal(8,2)
    READS SQL DATA
BEGIN
	DECLARE total_cost DECIMAL(8,2);
    
    SELECT fee * hours
    INTO total_cost
    FROM tutorGetServiceAndContact
    WHERE tutor_id = id;
    
RETURN total_cost;
END$$
DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` FUNCTION `sum_scholarship`(the_user int) RETURNS int(11)
    READS SQL DATA
BEGIN
DECLARE scholarship_sum INT;

SELECT reward_amount
INTO scholarship_sum
FROM scholarship
WHERE the_user = user_id;

RETURN scholarship_sum;
END$$
DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` FUNCTION `countScholarships`(threshold INT) RETURNS int(11)
    READS SQL DATA
BEGIN
DECLARE numScholarships INT;

SELECT COUNT(*)
INTO numScholarships
FROM scholarship as s
WHERE s.reward_amount >= threshold;

RETURN numScholarships;
END$$
DELIMITER ;


