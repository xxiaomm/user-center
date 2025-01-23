use `user-center`;
-- truncate table -- delete all data in table
DROP TABLE IF EXISTS `user`;

create table user
(
    id            bigint auto_increment
        primary key,
    user_name     varchar(256)                       not null,
    user_password varchar(512)                       not null,
    phone         varchar(256)                       null,
    email         varchar(512)                       null,
    avatar_url    varchar(1024)                      null,
    gender        tinyint                            null,
    user_status   tinyint  default 0                 not null comment '0 - 正常',
    create_time   datetime default CURRENT_TIMESTAMP null,
    update_time   datetime default CURRENT_TIMESTAMP null,
    is_delete     tinyint  default 0                 not null comment '0 - not, 1 - yes',
    user_role     int                                null
);