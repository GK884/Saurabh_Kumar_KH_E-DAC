CREATE DATABASE PRACTICE;

USE PRACTICE;

CREATE TABLE STUDENT
(
	ID INTEGER PRIMARY KEY auto_increment,
    S_NAME VARCHAR(30),
    S_AGE INTEGER,
    S_DATE DATE,
    S_CITY VARCHAR(30),
    S_COUNTRY VARCHAR(30),
    check(S_AGE >= 16)
);

INSERT INTO STUDENT (S_NAME, S_AGE, S_DATE, S_CITY) VALUES
('SAURABH', 18, '1995-12-09', 'DELHI');
INSERT INTO STUDENT (S_NAME, S_AGE, S_DATE, S_CITY) VALUES
('SAU', 20, '1995-01-20', 'MAHARASHTRA'),
('SAURABH', 21, '1995-12-09', 'NAGPUR'),
('MEGHENA', 17, '1995-12-09', 'KOLKATTA'),
('MANOJ', 18, '1996-11-15', 'RAJASTHAN');

SELECT * FROM STUDENT;

CREATE TABLE COURSES
(
	CID INTEGER PRIMARY KEY auto_increment,
    C_NAME VARCHAR(30),
    C_FEE INTEGER DEFAULT 4000,
    S_ID INTEGER,
    constraint FK_KEY foreign key(S_ID) references STUDENT(ID)
);

INSERT INTO COURSES (C_NAME, S_ID) VALUES
('MATHS', 2);
INSERT INTO COURSES (C_NAME, S_ID) VALUES
('ENGLISH', 1),
('HINDI', 3),
('MATHS', 1),
('ENGLISH', 4),
('HINDI', 5);

SELECT * FROM STUDENT;
SELECT * FROM COURSES;

SELECT S_NAME, S_AGE FROM STUDENT;

RENAME TABLES STUDENT
TO STUDENTS;

SELECT * FROM STUDENTS;

SELECT distinct(C_NAME), C_FEE FROM COURSES;

SELECT COUNT(distinct(C_NAME)) FROM COURSES;

SELECT COUNT(*) FROM COURSES;

SELECT * FROM COURSES WHERE C_NAME = 'MATHS';

SELECT * FROM STUDENTS WHERE S_DATE > '1995-01-20';

SELECT YEAR(S_DATE) FROM STUDENTS WHERE S_DATE = '1995-01-20';

SELECT MONTH(S_DATE) FROM STUDENTS WHERE S_DATE = '1995-01-20';

SELECT DAY(S_DATE) FROM STUDENTS WHERE S_DATE = '1995-01-20';

SELECT * FROM COURSES WHERE C_NAME <> 'MATHS';

SELECT * FROM COURSES WHERE C_NAME <> 'MATHS' AND C_FEE > 3000 ;

SELECT * FROM COURSES WHERE C_NAME = 'ENGLISH' OR C_NAME = 'HINDI';

SELECT * FROM COURSES WHERE C_NAME = 'ENGLISH' AND CID = 5 OR CID = 2;

SELECT * FROM STUDENTS WHERE S_CITY = 'DELHI' OR S_CITY = 'MAHARASHTRA';

SELECT * FROM STUDENTS WHERE NOT S_CITY = 'NAGPUR';

SELECT * FROM STUDENTS WHERE S_AGE <= 18 ORDER BY S_DATE DESC;

SELECT * FROM STUDENTS order by S_CITY ;

SELECT * FROM STUDENTS order by S_CITY DESC;

SELECT * FROM STUDENTS ORDER BY S_NAME DESC, S_CITY ASC;

INSERT INTO STUDENTS (S_NAME, S_AGE, S_CITY) VALUES
('GAURAV', 12, 'CHENNAI');

SELECT * FROM STUDENTS;

SELECT * FROM STUDENTS WHERE S_DATE IS NULL;

SELECT * FROM STUDENTS WHERE S_DATE IS NOT NULL;

UPDATE STUDENTS SET S_DATE = '2000-08-08' WHERE S_NAME = 'GAURAV';

DELETE FROM STUDENTS WHERE S_NAME = 'GAURAV';

SELECT * FROM STUDENTS LIMIT 2;

SELECT MAX(S_DATE) FROM STUDENTS;

SELECT MIN(S_DATE) FROM STUDENTS;

SELECT SUM(C_FEE) FROM COURSES WHERE C_NAME = 'HINDI' or C_NAME = 'MATHS';

SELECT S_NAME FROM STUDENTS WHERE S_NAME LIKE 'S%' order by S_DATE DESC;

SELECT S_NAME FROM STUDENTS WHERE S_NAME LIKE '%J';

SELECT S_NAME FROM STUDENTS WHERE S_NAME LIKE '%E%';

SELECT * FROM STUDENTS WHERE ID IN(1,2,5);

SELECT * FROM STUDENTS 
WHERE S_AGE BETWEEN 17 AND 20;

SELECT S_NAME NAME FROM STUDENTS;

SELECT S_NAME AS NAME FROM STUDENTS;

UPDATE STUDENTS SET S_COUNTRY = 'INDIA';

/* ******************************************************************************** */
INSERT INTO COURSES (C_NAME, S_ID) VALUES
('SCIENCE', 3),
('MATHS', 5),
('HINDI', 1);

INSERT INTO STUDENTS (S_NAME, S_AGE, S_DATE, S_CITY)VALUES
('TANUJA', 19, '1997-12-16', 'NAGPUR'),
('MAYURESH', 23, '1998-09-17', 'HARYANA'),
('TITU', 25, '1999-10-01', 'KERALA');

SELECT * FROM STUDENTS;
SELECT * FROM COURSES;

SELECT ID, S_NAME, C_NAME, CID, S_ID FROM STUDENTS S INNER JOIN COURSES C
ON S.ID = C.S_ID;

SELECT * FROM STUDENTS S LEFT JOIN COURSES C
ON S.ID = C.S_ID;

SELECT * FROM STUDENTS S LEFT OUTER JOIN COURSES C
ON S.ID = C.S_ID;

SELECT * FROM COURSES C RIGHT JOIN STUDENTS S 
ON C.S_ID = S.ID;

SELECT * FROM COURSES C RIGHT OUTER JOIN STUDENTS S 
ON C.S_ID = S.ID;

SELECT S_NAME FROM STUDENTS
UNION
SELECT C_NAME FROM COURSES;

SELECT S_NAME FROM STUDENTS
UNION ALL
SELECT C_NAME FROM COURSES;

SELECT * FROM STUDENTS NATURAL JOIN COURSES;

SELECT S_NAME, S_AGE FROM STUDENTS 
group by S_NAME
HAVING S_AGE > 18
ORDER BY S_AGE;

CREATE VIEW STUDENTDATA
AS
SELECT * FROM STUDENTS S LEFT JOIN COURSES C 
ON S.ID = C.S_ID;

SELECT * FROM STUDENTDATA;

/* *************************************************************************************** */
SELECT * FROM STUDENTS;

INSERT INTO STUDENTS (S_NAME, S_CITY)VALUES
('AB158A', '23POOP'),
('NMSDNCS09888', 'ASBCBH2367');


SELECT * FROM STUDENTS WHERE S_NAME regexp '^S';
-- STARTING WITH S
SELECT * FROM STUDENTS WHERE S_NAME regexp '^SAUR';
-- STARTING WITH SAUR
SELECT * FROM STUDENTS WHERE S_NAME regexp 'A$';
-- END WITH A
SELECT * FROM STUDENTS WHERE S_NAME regexp 'SAURA?';
-- CONTANING SAURA OR SAUR_. _ IS ANY OF THE CHARACTER.
SELECT * FROM STUDENTS WHERE S_CITY regexp 'DE|AG|AH';
-- CITY NAME CONTAINING 'DE' OR 'AG' OR 'AH'
SELECT * FROM STUDENTS WHERE S_NAME regexp '[DS]';
-- NAME HAVING 'D' OR 'S'.
SELECT * FROM STUDENTS WHERE S_CITY regexp '^[DN]';
-- NAME HAVING 'D' OR 'N' IN STARTING.
SELECT * FROM STUDENTS WHERE S_CITY regexp '[IA]$';
-- NAME HAVING 'I' OR 'A' IN ENDING.
SELECT * FROM STUDENTS WHERE S_CITY regexp '[B-G].[A]';
-- NAME FROM 'B' TO 'G' AND CONTAINING 'A'.
SELECT * FROM STUDENTS WHERE S_CITY regexp '[b-g].[a]';
-- NAME FROM 'b' TO 'g' AND CONTAINING 'a'.
SELECT * FROM STUDENTS WHERE S_CITY regexp '[^NAGPUR]';
-- NAMES NOT CONTAINING 'NAGPUR'
SELECT * FROM STUDENTS WHERE S_CITY regexp 'PUR[[:>:]]';
-- NAMES ENDING WITH 'PUR'.
SELECT * FROM STUDENTS WHERE S_CITY regexp '[[:<:]]NAG';
-- NAMES STARTING WITH 'NAG'.
SELECT * FROM STUDENTS WHERE S_NAME regexp '[:DIGIT:]';
