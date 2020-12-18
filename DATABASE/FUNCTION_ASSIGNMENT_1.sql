CREATE database FUN_ASSIGNMENT_1;

USE FUN_ASSIGNMENT_1;

/* WE CAN CALL PROCEDURE USING FUNCTIONS */
/* *************************************************************************** */

/* 1.	Write function that accepts a positive number from a user and 
	displays its factorial on the screen. */

delimiter $$
CREATE FUNCTION FACT(X INT) RETURNS INT4
BEGIN
DECLARE FACT INT;
DECLARE I INT;
SET FACT=1 , I=1;

L1:LOOP
	IF X>0 THEN 
		SET FACT=FACT*I;
		SET I=I+1;
		SET X=X-1;
		ITERATE L1;
		ELSE
		LEAVE L1;
	END IF;
	END LOOP L1;
RETURN FACT;
END$$

SELECT FACT(3) as factorial;

/* ********************************************** */
DELIMITER $$
CREATE FUNCTION QUES01 (NUM INTEGER) RETURNS INTEGER
BEGIN
	DECLARE FACT,I INTEGER;
    SET FACT = 1 , I = 1;
		WHILE (NUM > 0) DO
			SET FACT = FACT * NUM;
            SET NUM = NUM - 1;
        END WHILE;
    RETURN FACT;
END $$

SELECT QUES01(5) AS QUES;

DROP FUNCTION QUES01;


/* *************************************************************************** */

/*
2.	Write a function that accepts a positive number ‘n’ and 
	displays whether that number is a Prime number or not.
*/

DELIMITER $$
CREATE FUNCTION QUES02(NUM INTEGER)	RETURNS VARCHAR(10)
BEGIN
	DECLARE DIVI INTEGER;
    SET DIVI = 2;
    
    SAURABH : WHILE (DIVI * DIVI < NUM) DO
		IF (NUM % DIVI) = 0 THEN
			LEAVE SAURABH;
		END IF;
			SET DIVI = DIVI + 1;
	END WHILE;
    
    IF (DIVI * DIVI > NUM) THEN
		RETURN 'PRIME';
	ELSE
		RETURN 'NON PRIME';
	END IF;
END $$

SELECT QUES02(11);

/* ***************************************************************** */

/*
3.	Write a function to Convert an inputed number of inches 
into yards, feet, and inches. 
For example, 124 inches equals 3 yards, 1 foot, and 4 inches.
*/
DELIMITER $$
CREATE FUNCTION QUES03(GIVEN INTEGER) RETURNS VARCHAR(30)
BEGIN
	DECLARE YARDS INTEGER;
    DECLARE FOOT INTEGER;
    DECLARE INCHES INTEGER;
    SET YARDS = GIVEN / 36;
    SET GIVEN = GIVEN % 36;
    SET FOOT = GIVEN / 12;
    SET GIVEN = GIVEN % 12;
    SET INCHES = GIVEN;
    RETURN CONCAT(YARDS," YARDS ",FOOT, " FOOT ", INCHES, " INCHES ");
END $$

SELECT QUES03(124) AS QUES03;

/* ***************************************************************************** */

/*
4.	Write a function to update salary of the 
employees of specified dept by 10%. 
Take dept no as parameter.
*/

CREATE TABLE EMPLOYEE
(
EMPID INTEGER(5),
EMPNAME VARCHAR(10),
EMPSAL INTEGER(5)
);
INSERT INTO EMPLOYEE VALUES
(1, "ABC", 5000),
(2, "CDE", 7000);
SELECT * FROM EMPLOYEE;

DELIMITER $$
CREATE FUNCTION QUES04(NUM INTEGER) RETURNS VARCHAR(20)
BEGIN
	UPDATE EMPLOYEE 
    SET EMPSAL = EMPSAL + (EMPSAL*0.10)
    WHERE EMPID = NUM;
    RETURN 'UPDATES';
END $$

SELECT QUES04(2);

/* ***************************************************************************** */

/*
5.	Create a function named USER_ANNUAL_COMP that has a parameter 
p_eno for passing on the values of  an employee number of the employee 
and p_comp for passing the compansation. 
In the function calculates and returns the annual compensation of 
the employee by using the following formula.
annual_compensation =  (p_sal+p_comm)*12
If the salary or commission value is NULL 
then zero should be substituted for it.  
Give a call to USER_ANNUAL_COMP.
*/

DELIMITER $$
CREATE FUNCTION QUES05(VAL1 INTEGER, VAL2 INTEGER) RETURNS INTEGER
BEGIN
	DECLARE VAL INTEGER;
    SET VAL = (SELECT SAL FROM EMP WHERE EMPNO = VAL1);
    RETURN (VAL + VAL2) * 12;
END $$

SELECT QUES05(1004, 20) AS 'UPDATED SALARY';


/* ***************************************************************************** */

/*
6.	Create a procedure called USER_QUERY_EMP that accepts three parameters. 
Parameter p_myeno is of IN parameter mode which provides the empno value. 
The other two parameters p_myjob and p_mysal are of OUT mode. 
The procedure retrieves the salary and job of an employee with 
the provided employee number and assigns those to the two OUT parameters respectively. 
The procedure should raise the error if the empno does not exist in the EMP table by 
displaying an appropriate message
*/






/* ***************************************************************************** */

/*
7.	Create a procedure to print the inputted string in reverse order. 
If  inputted string is null display an appropriate message
*/

DELIMITER $$
CREATE PROCEDURE QUES07(INOUT STR VARCHAR(200))
BEGIN
	IF(STR = '' || ISNULL(STR)) THEN
		SET STR = 'NO STRING FOUND';
    ELSE
		SET STR = (SELECT REVERSE(STR));
	END IF;
END $$

SET @STR1 = NULL;
CALL QUES07(@STR1);
SELECT @STR1;





/* ***************************************************************************** */

/*
8.	Create a procedure named ‘tabledetails’ which gives 
all the details of a particular table stored in database
*/

DELIMITER $$
CREATE PROCEDURE QUES08()
BEGIN
	SHOW DATABASES;
END $$

CALL QUES08();


/* ***************************************************************************** */


/* ****************** ROUGH ********************** */

/*
4.	Write a function to update salary of the 
employees of specified dept by 10%. 
Take dept no as parameter.
*/

CREATE TABLE EMP
(
	EMPID INTEGER(2),
    EMPNAME VARCHAR(15),
    EMPSAL INTEGER(6)
);

INSERT INTO EMP VALUES
(1, 'HERO', 3000),
(2, 'ZERO', 5000),
(3, 'MANAGER', 10000);

SELECT * FROM EMP;

DELIMITER $$
CREATE FUNCTION QUES004() RETURNS VARCHAR(10)
BEGIN
	UPDATE EMP SET EMPSAL = EMPSAL + (EMPSAL*0.10) WHERE EMPID = '2';
    RETURN 'UPDATED';
END $$

SELECT QUES004();
/* ********************** */
DELIMITER $$
CREATE FUNCTION QUES0004(VAL INTEGER) RETURNS INTEGER
BEGIN
	UPDATE EMP SET EMPSAL = EMPSAL + (EMPSAL*0.10) WHERE EMPID = VAL;
    RETURN 0;
END $$

SELECT QUES0004(1);


