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
    OBJECT_ID varchar(36),
    SERVICE_ACCOUNT_ID varchar(36),
    C_ACCRUED double precision,
    C_PAID double precision,
    C_DEBT_SM double precision,
    P_DEBT_SM double precision,
    P_ACCRUED double precision,
    P_PAID double precision,
    --
    primary key (ID)
);