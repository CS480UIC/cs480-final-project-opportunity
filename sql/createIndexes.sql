CREATE INDEX AcadSubjectIndex
ON academic_resource(acad_subject);

CREATE INDEX CompanyNameIndex
ON company(`name`);

CREATE INDEX HealthTypeIndex
ON health_resource(health_type);

CREATE INDEX SalaryIndex
ON job_opportunity(salary);

CREATE INDEX LegalCostIndex
ON legal_resource(cost);

CREATE INDEX ScholarIndex
ON scholarship(reward_amount);

CREATE INDEX TutorIndex
ON tutor(fullname, fee);

CREATE INDEX ServiceIndex
ON tutoring_service(service_name);

CREATE INDEX UserIndex
ON user(username);