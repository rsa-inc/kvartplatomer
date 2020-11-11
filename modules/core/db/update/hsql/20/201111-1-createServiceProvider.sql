create table KVARTPLATOMER_SERVICE_PROVIDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    SERVICE_TYPE_ID varchar(36),
    PC integer,
    INN integer,
    URL varchar(255),
    DESCRIPTION varchar(255),
    --
    primary key (ID)
);