DROP USER 'testuser'@'localhost';
CREATE USER 'testuser'@'localhost' IDENTIFIED BY 'mypass';
GRANT ALL ON people.* TO 'testuser'@'localhost';