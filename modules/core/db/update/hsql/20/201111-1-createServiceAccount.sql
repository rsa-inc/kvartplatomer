create table KVARTPLATOMER_SERVICE_ACCOUNT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ACCOUNTED_OBJECT_ID varchar(36) not null,
    ORGANIZATION_ID varchar(36) not null,
    ACCOUNT_NUMBER varchar(255) not null,
    LOGIN varchar(255),
    PASSWORD varchar(255),
    AUTOPAY boolean,
    IS_ACTIVE boolean,
    --
    primary key (ID)
);