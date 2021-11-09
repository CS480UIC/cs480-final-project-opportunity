CREATE DATABASE opportunity;


use  opportunity;

CREATE TABLE user
(
  user_id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) NOT NULL,
  `password` VARCHAR(50) NOT NULL,
  date_time DATETIME NOT NULL
);

CREATE TABLE entity1 
(
  
  username VARCHAR(50) primary key,
  `password` VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL
);

CREATE TABLE tutoring_service
(
	service_id INT AUTO_INCREMENT PRIMARY KEY,
    address VARCHAR(500) NOT NULL,
    total_tutors INT NOT NULL,
    operation_hours VARCHAR(500) NOT NULL,
    service_name VARCHAR(300) NOT NULL,
    contact_info VARCHAR(300) NOT NULL
);

CREATE TABLE tutor
(
	tutor_id INT AUTO_INCREMENT PRIMARY KEY,
    fullname VARCHAR(100) NOT NULL,
    grade_level INT NOT NULL,
    `subject` VARCHAR(100),
    fee DECIMAL(8,2) NOT NULL,
    service_id INT NOT NULL,
    phone_number VARCHAR(100) NOT NULL,
    tutor_hours VARCHAR(100) NOT NULL,
    FOREIGN KEY (service_id) REFERENCES tutoring_service(service_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT
);

CREATE TABLE login_user_tutoring_service
(
	login_user_id INT NOT NULL,
    tutoring_id INT NOT NULL,
    FOREIGN KEY (login_user_id) REFERENCES user(user_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
    FOREIGN KEY (tutoring_id) REFERENCES tutoring_service(service_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
    PRIMARY KEY(login_user_id, tutoring_id)
);

CREATE TABLE scholarship
(
	scholarship_id INT AUTO_INCREMENT PRIMARY KEY,
    award_name VARCHAR(1000) NOT NULL,
    `description` VARCHAR(1000) NOT NULL,
    requirement VARCHAR(1000) NOT NULL,
    reward_amount DECIMAL(8,2) NOT NULL,
    deadline DATE NOT NULL
);

CREATE TABLE login_user_scholarship
(
	login_id INT NOT NULL,
    scholar_id INT NOT NULL,
    FOREIGN KEY (login_id) REFERENCES user(user_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
    FOREIGN KEY (scholar_id) REFERENCES scholarship(scholarship_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
    PRIMARY KEY(login_id, scholar_id)
);

CREATE TABLE company
(
	company_id INT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(300) NOT NULL,
    industry VARCHAR(100) NOT NULL,
    comp_address VARCHAR(200) NOT NULL,
    review VARCHAR(500)
);

CREATE TABLE job_opportunity
(
	job_id INT AUTO_INCREMENT PRIMARY KEY,
    job_description VARCHAR(1000) NOT NULL,
    application_info VARCHAR(1000) NOT NULL,
    benefit_description VARCHAR(1000) NOT NULL,
    company_id INT NOT NULL,
    salary DECIMAL(8,2) NOT NULL,
    position_title VARCHAR(1000) NOT NULL,
    FOREIGN KEY (company_id) REFERENCES company(company_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT
);

CREATE TABLE login_user_job_opportunity
(
	user_log_id INT NOT NULL,
    job_id INT NOT NULL,
    FOREIGN KEY (user_log_id) REFERENCES user(user_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
    FOREIGN KEY (job_id) REFERENCES job_opportunity(job_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
    PRIMARY KEY(user_log_id, job_id)
);

CREATE TABLE health_resource
(
	health_id INT AUTO_INCREMENT PRIMARY KEY,
    contact VARCHAR(100) NOT NULL,
    health_type VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL,
    service_description VARCHAR(500) NOT NULL,
    payment VARCHAR(100) NOT NULL
);

CREATE TABLE login_user_health_resource
(
	user_login_id INT NOT NULL,
    health_resource_id INT NOT NULL,
    FOREIGN KEY (user_login_id) REFERENCES user(user_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
    FOREIGN KEY (health_resource_id) REFERENCES health_resource(health_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
    PRIMARY KEY(user_login_id, health_resource_id)
);

CREATE TABLE legal_resource
(
	legal_id INT AUTO_INCREMENT PRIMARY KEY,
    cost DECIMAL(8,2) NOT NULL,
    legal_description VARCHAR(500) NOT NULL,
    resource_location VARCHAR(200) NOT NULL,
    resource_name VARCHAR(100) NOT NULL,
    contact_information VARCHAR(80) NOT NULL
);

CREATE TABLE login_user_legal_resource
(
	user_account_id INT NOT NULL,
    legal_resource_id INT NOT NULL,
    FOREIGN KEY (user_account_id) REFERENCES user(user_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
    FOREIGN KEY (legal_resource_id) REFERENCES legal_resource(legal_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
    PRIMARY KEY(user_account_id, legal_resource_id)
);

CREATE TABLE academic_resource
(
	academic_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    payment_cost DECIMAL(8,2) NOT NULL,
    acad_subject VARCHAR(200),
    academic_description VARCHAR(400) NOT NULL,
    acad_location VARCHAR(100) NOT NULL
);

CREATE TABLE login_user_academic_resource
(
	log_user_id INT NOT NULL,
    academic_resource_id INT NOT NULL,
    FOREIGN KEY (log_user_id) REFERENCES user(user_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
    FOREIGN KEY (academic_resource_id) REFERENCES academic_resource(academic_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
    PRIMARY KEY(log_user_id, academic_resource_id)
);