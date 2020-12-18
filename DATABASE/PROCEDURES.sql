CREATE database PROCEDURE_ASSIGNMENT_1;

USE PROCEDURE_ASSIGNMENT_1;

Create table EMP 
(
EMPNO numeric(4) not null, 
ENAME varchar(30) not null, 
JOB varchar(10), 
MGR numeric(4), 
HIREDATE date, 
SAL numeric(7,2), 
DEPTNO numeric(2) 
);

Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) 
values(1000,  'Manish' , 'SALESMAN', 1003,  '2020-02-18', 600,  30) ;
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) 
values(1001,  'Manoj' , 'SALESMAN', 1003,  '2018-02-18', 600,  30) ;
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) 
values(1002 , 'Ashish', 'SALESMAN',1003 , '2013-02-18',  750,  30 );
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) 
values(1004,  'Rekha', 'ANALYST', 1006 , '2001-02-18', 3000,  10);
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) 
values(1005 , 'Sachin', 'ANALYST', 1006 ,  '2019-02-18', 3000, 10 );
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) 
values(1006,  'Pooja',  'MANAGER'  , null, '2000-02-18' ,6000, 10 );

Create table dept 
(
dno numeric(4) not null, 
dname varchar(10) not null,
area varchar(30)
);

Insert into dept(dno,dname,area) values(10,'Store','Mumbai');
Insert into dept(dno,dname,area) values(20,'Purchase','Mumbai');
Insert into dept(dno,dname,area) values(30,'Store', 'Delhi');
Insert into dept(dno,dname,area) values(40,'Marketing','Pune');
Insert into dept(dno,dname,area) values(50,'Finance','Delhi');
Insert into dept(dno,dname,area) values(60,'Accounts','Mumbai');

DELIMITER $$
CREATE PROCEDURE QUES01(IN VAL1 INT, IN VAL2 INT)
BEGIN
	SELECT VAL1 + VAL2;
    SELECT VAL1 - VAL2;
    SELECT VAL1 * VAL2;
    SELECT VAL1 / VAL2;
END $$

CALL QUES01(20, 10);
/*	********************************************************************** */

DELIMITER $$
CREATE PROCEDURE QUES02(INOUT STR VARCHAR(30))
BEGIN
	SET STR = (SELECT REVERSE(STR));
END $$

SET @STR = "DATABASE";

CALL QUES02(@STR);

SELECT @STR AS REV;

/*	********************************************************************** */

DELIMITER $$
CREATE PROCEDURE QUES03()
BEGIN
	SELECT EMPNO, ENAME, SAL FROM EMP ORDER BY SAL DESC LIMIT 5;
END $$

CALL QUES03();

/*	********************************************************************** */

DELIMITER $$
CREATE PROCEDURE QUES04()
BEGIN
	CREATE TABLE EMP_TABLE 
    (
		E_ID INTEGER(3),
        E_NAME VARCHAR(10)
    );
END $$

CALL QUES04();

/*	********************************************************************** */

DELIMITER $$
CREATE PROCEDURE QUES05()
BEGIN
	INSERT INTO DEPT VALUES
    (40, 'EDUCATION', 'PUNE');
END $$

CALL QUES05();

DELIMITER $$
CREATE PROCEDURE QUES05A(IN VAL1 INT, IN VAL2 VARCHAR(10), IN VAL3 VARCHAR(10))
BEGIN
	INSERT INTO DEPT VALUES
    (VAL1, VAL2, VAL3);
END $$

SET @VAL1 = 60;
SET @VAL2 = 'EDUCATION';
SET @VAL3 = 'PUNE'; 
CALL QUES05A(@VAL1, @VAL2, @VAL3);
SELECT * FROM DEPT;

/*	********************************************************************** */

DELIMITER $$
CREATE PROCEDURE QUES06(INOUT NUM INTEGER, OUT SQUARE INTEGER, OUT CUBE1 INTEGER)
BEGIN 
	DECLARE NUM1 INTEGER;
    SET NUM1 = NUM;
    SELECT NUM, POWER(NUM,2), POWER(NUM,3)INTO NUM,SQUARE,CUBE1;
END $$

SET @NUM = 2;
CALL QUES06(@NUM, @SQUARE, @CUBE1);
SELECT @NUM, @SQUARE, @CUBE1;

DELIMITER $$
CREATE PROCEDURE QUES06A(IN VAR INT)
BEGIN
	SET @NUM =VAR;
	SELECT @NUM, POWER(@NUM,2) AS SQUARE, POWER (@NUM,3) AS CUBIC;
END $$
CALL QUES06A(5);

/*	********************************************************************** */

DELIMITER $$
CREATE PROCEDURE QUES07(OUT A INTEGER)
BEGIN
	DECLARE NUM INTEGER;
    SET NUM = 2;
    SELECT NUM INTO A;
END $$

CALL QUES07(@A);
SELECT @A;

/*	********************************************************************** */

delimiter $$
CREATE PROCEDURE QUES08(IN X INT, OUT STR VARCHAR(50))
BEGIN
	SELECT concat(E.ENAME,' IS FROM ',D.DNAME) 
	INTO STR  FROM EMP E 
    INNER JOIN DEPT D ON D.DNO=E.DEPTNO 
    WHERE E.DEPTNO = X AND E.EMPNO=1004;
END $$

CALL QUES08(10,@STR);
SELECT @STR;

