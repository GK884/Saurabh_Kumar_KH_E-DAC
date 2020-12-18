CREATE DATABASE CONTROL_STATEMENT;

USE CONTROL_STATEMENT;

/* IF ELSE */
DELIMITER $$
CREATE PROCEDURE IF_STATEMENT(IN NUM INTEGER)
BEGIN
	IF MOD(NUM,2) = 0 THEN
		SELECT "EVEN" AS EVEN_;
	ELSE 
		SELECT "ODD" AS ODD_;
	end if;
END $$

CALL IF_STATEMENT(5);

/* *********************************************************** */
/* WHILE + IF ELSE + ITERATE */
USE CONTROL_STATEMENT;

DELIMITER $$
CREATE PROCEDURE ITERATE_01(IN NUM INTEGER)
BEGIN
	SAURABH : LOOP 
		WHILE NUM > 0 DO
			IF MOD(NUM,2) = 0 THEN
				SELECT "EVEN" AS IF_;
				SET NUM = NUM - 1;
				ITERATE SAURABH;
			ELSE 
				SELECT "ODD" AS ELSE_;
				SET NUM = NUM - 2;
				ITERATE SAURABH;
			END IF;
		END WHILE;
	END LOOP;
END $$

CALL ITERATE_01(5);

/* *********************************************************** */

IF CONDITION THEN
COMMENTS;
ELSE IF CONDITION THEN
COMMENTS;
ELSE 
COMMENTS;
END IF;




/* *********************************************************** */
/* REPEAT */
/*
[begin_label:] 
REPEAT statement_list 
UNTIL condition 
END REPEAT [end_label]
*/
DELIMITER $$
CREATE FUNCTION REPEAT_DEMO() RETURNS VARCHAR(20)
BEGIN
	DECLARE I INTEGER;
    SET I = 3;
	SAURABH : LOOP
		REPEAT 
			RETURN 'HELLO_WORLD';
			SET I = I - 1;
            ITERATE SAURABH;
        UNTIL I>0
        END REPEAT;
    END LOOP;
END $$

SELECT REPEAT_DEMO();
/* *********************************************************** */



