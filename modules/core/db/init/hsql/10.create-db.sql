-- begin KVARTPLATOMER_SERVICE_PROVIDER
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
    INN varchar(10),
    URL varchar(255),
    DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end KVARTPLATOMER_SERVICE_PROVIDER
-- begin KVARTPLATOMER_SERVICE_TYPE
create table KVARTPLATOMER_SERVICE_TYPE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STYPE_NAME varchar(255),
    SHORT_NAME varchar(255),
    --
    primary key (ID)
)^
-- end KVARTPLATOMER_SERVICE_TYPE
-- begin KVARTPLATOMER_OBJECT
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
)^
-- end KVARTPLATOMER_OBJECT
-- begin KVARTPLATOMER_SERVICE_ACCOUNT
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
)^
-- end KVARTPLATOMER_SERVICE_ACCOUNT
-- begin KVARTPLATOMER_BILL
create table KVARTPLATOMER_BILL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MONTH_ integer,
    accounted_Object varchar(36),
    SERVICE_ACCOUNT_ID varchar(36),
    C_ACCRUED double precision,
    C_PAID double precision,
    C_DEBT_SM double precision,
    P_DEBT_SM double precision,
    P_ACCRUED double precision,
    P_PAID double precision,
    --
    primary key (ID)
)^
-- end KVARTPLATOMER_BILL
