CREATE TABLESPACE conaspaamn DATAFILE 'C:\oraclexe\app\oracle\oradata\XE\conaspaamn.dbf' SIZE 100M;

CREATE TEMPORARY TABLESPACE temp_conaspaamn TEMPFILE 'C:\oraclexe\app\oracle\oradata\XE\temp_conaspaamn.dbf' SIZE 40M;


CREATE USER adminaspaamn IDENTIFIED BY qwerty123 DEFAULT TABLESPACE conaspaamn
TEMPORARY TABLESPACE temp_conaspaamn
QUOTA UNLIMITED ON conaspaamn;

GRANT CREATE SESSION TO adminaspaamn;

GRANT ALTER SESSION TO adminaspaamn;

GRANT CREATE TABLE TO adminaspaamn;