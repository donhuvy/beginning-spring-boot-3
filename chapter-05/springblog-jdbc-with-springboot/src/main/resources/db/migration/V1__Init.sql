DROP TABLE IF EXISTS COMMENTS;
DROP TABLE IF EXISTS POSTS;
CREATE TABLE POSTS
(
    ID int NOT NULL AUTO_INCREMENT,
    TITLE varchar(50) NOT NULL,
    DESCRIPTION varchar(500) NOT NULL,
    BODY LONGTEXT DEFAULT NULL,
    SLUG varchar(60) DEFAULT NULL,
    POST_STATUS ENUM ('DRAFT','PUBLISHED'),
    CREATED_ON datetime DEFAULT NULL,
    UPDATED_ON datetime DEFAULT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE COMMENTS
(
    ID int NOT NULL AUTO_INCREMENT,
    POST_ID int NOT NULL,
    TITLE varchar(200) NOT NULL,
    AUTHOR_NAME varchar(200) NOT NULL,
    BODY LONGTEXT DEFAULT NULL,
    CREATED_ON datetime DEFAULT NULL,
    UPDATED_ON datetime DEFAULT NULL,
    PRIMARY KEY (ID),
    FOREIGN KEY (POST_ID) REFERENCES POSTS(ID)
);
