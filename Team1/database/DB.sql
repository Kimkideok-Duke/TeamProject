CREATE TABLE user (
    userno varchar2(50) PRIMARY KEY,
    id varchar2(50) NOT NULL UNIQUE,
    passwd varchar2(50) NOT NULL,
    nickname varchar2(50) NOT NULL,
    gender char(1) CONSTRAINT user_gender_ck CHECK (gender IN ('M', 'F')),
    age NUMBER NOT NULL,
    loc varchar2(50) NOT NULL,
    interest1 varchar2(50) NOT NULL,
    interest2 varchar2(50) NOT NULL,
    interest3 varchar2(50) NOT NULL,
    interest4 varchar2(50) NOT NULL,
    interest5 varchar2(50) NOT NULL
)