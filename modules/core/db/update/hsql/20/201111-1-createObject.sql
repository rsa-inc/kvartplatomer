create table KVARTPLATOMER_OBJECT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    SHORT_NAME varchar(255),
    OBJECT_TYPE varchar(50),
    POST_INDEX varchar(6),
    DESCRIPTION varchar(255),
    --
    primary key (ID)
);