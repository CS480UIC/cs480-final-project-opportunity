# Stored Procedures
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `GetServiceAndContact`()
BEGIN
	SELECT service_name, contact_info
    FROM tutoring_service;
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
    FROM tutor
    WHERE tutor_id = id;
    
RETURN total_cost;
END$$
DELIMITER ;
