CREATE TABLE users (
    user_id BIGINT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email_address VARCHAR(255),
    address_line1 VARCHAR(255),
    address_line2 VARCHAR(255),
    city VARCHAR(255),
    state VARCHAR(255),
    zipcode INTEGER
);

INSERT INTO users (user_id, first_name, last_name, email_address, address_line1, address_line2, city, state, zipcode)
VALUES
  (1, 'John', 'Doe', 'john.doe@example.com', '123 Main St', 'Apt 456', 'Cityville', 'CA', 12345),
  (2, 'Jane', 'Smith', 'jane.smith@example.com', '456 Oak St', 'Suite 789', 'Townsville', 'NY', 56789),
  (3, 'Alice', 'Johnson', 'alice.johnson@example.com', '789 Pine St', NULL, 'Villageton', 'TX', 98765);