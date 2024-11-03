-- SQL для створення таблиці Customer
CREATE TABLE Customer (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          full_name VARCHAR(100) NOT NULL,
                          email VARCHAR(100) NOT NULL UNIQUE,
                          social_security_number VARCHAR(11) NOT NULL UNIQUE
);

-- SQL для отримання всіх клієнтів
SELECT * FROM Customer;

-- SQL для отримання клієнта за ID
SELECT * FROM Customer WHERE id = ?;

-- SQL для додавання нового клієнта
INSERT INTO Customer (full_name, email, social_security_number) VALUES (?, ?, ?);

-- SQL для оновлення клієнта
UPDATE Customer SET full_name = ?, email = ?, social_security_number = ? WHERE id = ?;

-- SQL для видалення клієнта
DELETE FROM Customer WHERE id = ?;