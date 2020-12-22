create table KVARTPLATOMER_BILL_HISTORY (
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
    SERVICE_ACCOUNT_ID varchar(36),
    C_PAID double precision,
    C_ACCRUED double precision,
    C_DEBT_SM double precision,
    PAID_DATE timestamp,
    --
    primary key (ID)
);