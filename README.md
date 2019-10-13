##这是第一次提交

ctrl + alt + v  =取一个变量

```sql
CREATE TABLE USER
(
  ID           INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
  ACCOUNT_ID   VARCHAR(100),
  NAME         VARCHAR(50),
  TOKEN        VARCHAR(36),
  GMT_CREATE   BIGINT,
  GMT_MODIFIED BIGINT
);
```

```sql
CREATE TABLE `NewTable` (
`id`  int NOT NULL AUTO_INCREMENT ,
`title`  varchar(50) NULL ,
`description`  text NULL ,
`gmt_create`  bigint NULL ,
`gmt_modified`  bigint NULL ,
`creator`  int NULL ,
`comment_count`  int NULL DEFAULT 0 ,
`view_count`  int NULL DEFAULT 0 ,
`like_count`  int NULL DEFAULT 0 ,
`tag`  varchar(256) NULL ,
PRIMARY KEY (`id`)
);
```