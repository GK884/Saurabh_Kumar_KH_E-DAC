CREATE DATABASE FUNCTIONS;
USE FUNCTIONS;

/*
DELIMITER $$
CREATE FUNCTION FUNCTION_NAME (ARGUMENTS DATATYPE) RETURNS INT
BEGIN
	COMMANDS		//ONLY DML(INSERT, UPDATE, DELETE)
END $$
*/

/* ******************************************************************************* */

/* HELLO WORLD */

DELIMITER $$
CREATE FUNCTION HELLO_WORD () RETURNS VARCHAR(20)
BEGIN
	RETURN 'HELLO WORLD';
END $$

SELECT HELLO_WORD() AS HELLO;

/* ******************************************************************** */

/* FIBONACCI */

DELIMITER $$
CREATE FUNCTION FIBONACCI (NUM INTEGER) RETURNS INTEGER /* VARCHAR */
BEGIN
	DECLARE A, B, C, I INTEGER;
    SET A = 0;
    SET B = 1;
    SET I = 0;
    SAURABH : LOOP
	WHILE I < (NUM - 1) DO
        SET C = A + B;
        SET A = B;
        SET B = C;
        SET I = I + 1;
        ITERATE SAURABH;
	END WHILE;
    RETURN A;
    END LOOP;
END $$

SELECT FIBONACCI (5) AS FUBB;

/* MAKE A STRING AS A RETURN TYPE FOR MULTIPLE OUTPUT */

/* ******************************************************* */

/* RECURSIVE */
DELIMITER $$
CREATE FUNCTION FIB(N INTEGER) RETURNS INTEGER
BEGIN
	IF N = 0 OR N = 1 THEN
		RETURN 0;
	ELSE
		RETURN FIB(N-1) + FIB(N-2);
    END IF;
END $$

SELECT FIB(5) AS FIB;

/* ******************************************************* */


delimiter //
CREATE PROCEDURE `Fibonacci`(IN POS INT, IN RANG INT, IN LIMTED INT)
BEGIN
       select FORMAT(Fibonacci,0) AS Fibonacci from (
       select @f0 Fibonacci, @fn:=@f1+@f0, @f0:=@f1, @f1:=@fn
       from   (select @f0:=0, @f1:=1, @fn:=1) x,
       information_schema.STATISTICS p limit LIMTED) y LIMIT POS, RANG;
END//
delimiter ;

CALL Fibonacci(0,10,100);



/* ********** */

DELIMITER #
CREATE procedure DELIMITER1()
BEGIN
	DECLARE A INTEGER;
    SET A = 10;
	SELECT A;
END #

DELIMITER ;