CREATE TABLE users001 (
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

/**   회원 등록   **/
INSERT INTO users001 values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)

/**   공지 조회   **/
SELECT nttitle, ntcontent
FROM notice
WHERE noticeno = ?

/**   FAQ 조회   **/
SELECT question, answer
FROM faq
WHERE faqno = ?

/**   리뷰 조회   **/
SELECT rvtitle, rvcontent
FROM notice
WHERE reviewno = ?