CREATE TABLE USERS001 (
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
);

CREATE TABLE notice (
	noticeno varchar2(50) PRIMARY KEY,
	nttitle varchar2(500) NOT NULL,
	ntcontent varchar2(1000) NOT NULL
);

CREATE TABLE faq (
	faqno varchar2(50) PRIMARY KEY,
	question varchar2(500) NOT NULL,
	answer varchar2(3000) NOT NULL
);


CREATE TABLE review (
	reviewno varchar2(50) PRIMARY KEY,
	rvtitle varchar2(500) NOT NULL,
	rvcontent varchar2(4000) NOT NULL
);


SELECT * FROM users001;

/**   상대 매칭   **/
SELECT userno, nickname, gender, age, loc, interest1, interest2, interest3, interest4, interest5
FROM users001
where gender=?
AND loc=?
AND age >= ? AND age <= ?

/**   회원 조회   **/
SELECT nickname, gender, age, loc, interest1, interest2, interest3, interest4, interest5
FROM users001
WHERE userno = ?

/**   회원 등록   **/
INSERT INTO users001 
values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)

/**   회원 수정   **/
UPDATE users001
    SET id = ?,
        passwd = ?,
        nickname= ?, 
        gender = ?,
        age = ?,
        loc = ?,
        interest1 = ?,
        interest2 = ?,
        interest3 = ?,
        interest4 = ?,
        interest5 = ?
WHERE userno = ?

/**   회원 삭제   **/
DELETE FROM users001
WHERE userno = ?

/**   공지 조회   **/
SELECT nttitle, ntcontent
FROM notice
WHERE noticeno = ?

/**   공지 등록   **/
INSERT INTO notice 
values(?, ?, ?)

/**   공지 수정   **/
UPDATE notice
    SET nttitle = ?,
        ntcontent= ?
WHERE noticeno = ?

/**   공지 삭제   **/
DELETE FROM notice
WHERE noticeno = ?

/**   FAQ 조회   **/
SELECT question, answer
FROM faq
WHERE faqno = ?

/**   FAQ 등록   **/
INSERT INTO faq 
values(?, ?, ?)

/**   FAQ 수정   **/
UPDATE faq
    SET question = ?,
        answer= ?
WHERE faqno = ?

/**   FAQ 삭제   **/
DELETE FROM faq
WHERE faqno = ?

/**   리뷰 조회   **/
SELECT rvtitle, rvcontent
FROM review
WHERE reviewno = ?

/**   리뷰 등록   **/
INSERT INTO review 
values(?, ?, ?)

/**   리뷰 수정   **/
UPDATE review
    SET rvtitle = ?,
        rvcontent= ?
WHERE reviewno = ?

/**   리뷰 삭제   **/
DELETE FROM review
WHERE reviewno = ?