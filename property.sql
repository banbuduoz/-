/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019-11-04 12:17:55                          */
/*==============================================================*/


drop table if exists blog;

drop table if exists blogkind;

drop table if exists car;

drop table if exists carport;

drop table if exists charge;

drop table if exists comment;

drop table if exists house;

drop table if exists kind;

drop table if exists pay;

drop table if exists person;

drop table if exists role;

drop table if exists room;

drop table if exists safekind;

drop table if exists safety;

drop table if exists service;

drop table if exists state;

drop table if exists user;

drop table if exists userfamily;

/*==============================================================*/
/* Table: blog                                                  */
/*==============================================================*/
create table blog
(
   id                   int not null,
   kid                  int,
   uid                  int,
   title                varchar(200),
   content              text,
   datetime             datetime,
   primary key (id)
);

/*==============================================================*/
/* Table: blogkind                                              */
/*==============================================================*/
create table blogkind
(
   int                  int not null,
   name                 varchar(20),
   primary key (int)
);

/*==============================================================*/
/* Table: car                                                   */
/*==============================================================*/
create table car
(
   id                   int not null,
   carnum               varchar(50),
   intime               datetime,
   outtime              datetime,
   pay                  double,
   info                 varchar(500),
   uid                  int,
   primary key (id)
);

/*==============================================================*/
/* Table: carport                                               */
/*==============================================================*/
create table carport
(
   total                int,
   number               int
);

/*==============================================================*/
/* Table: charge                                                */
/*==============================================================*/
create table charge
(
   id                   int not null,
   name                 varchar(50),
   chargeinfo           double,
   primary key (id)
);

/*==============================================================*/
/* Table: comment                                               */
/*==============================================================*/
create table comment
(
   id                   int not null,
   uid                  int,
   bid                  int,
   ip                   varchar(100),
   content              varchar(1000),
   primary key (id)
);

/*==============================================================*/
/* Table: house                                                 */
/*==============================================================*/
create table house
(
   id                   int not null,
   name                 varchar(50),
   buildstarttime       date,
   buildendtime         date,
   area                 double,
   info                 varchar(1000),
   primary key (id)
);

/*==============================================================*/
/* Table: kind                                                  */
/*==============================================================*/
create table kind
(
   id                   int not null,
   name                 varchar(50),
   primary key (id)
);

/*==============================================================*/
/* Table: pay                                                   */
/*==============================================================*/
create table pay
(
   id                   int not null,
   chargename           varchar(50),
   uid                  int,
   paystate             int,
   chargestandard       double,
   payreal              double,
   paybalance           double,
   chargetime           datetime,
   paymonth             varchar(50),
   primary key (id)
);

/*==============================================================*/
/* Table: person                                                */
/*==============================================================*/
create table person
(
   id                   int not null,
   name                 varchar(50),
   tel                  varchar(50),
   intime               datetime,
   outtime              datetime,
   visitname            varchar(50),
   info                 varchar(500),
   uid                  int,
   primary key (id)
);

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   id                   int not null,
   name                 varchar(50),
   primary key (id)
);

/*==============================================================*/
/* Table: room                                                  */
/*==============================================================*/
create table room
(
   id                   int not null,
   name                 varchar(50),
   hid                  int,
   uid                  int,
   area                 double,
   uname                varchar(50),
   primary key (id)
);

/*==============================================================*/
/* Table: safekind                                              */
/*==============================================================*/
create table safekind
(
   id                   int not null,
   name                 varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: safety                                                */
/*==============================================================*/
create table safety
(
   id                   int not null,
   safekid              int,
   starttime            datetime,
   endtime              datetime,
   info                 varchar(500),
   uid                  int,
   primary key (id)
);

/*==============================================================*/
/* Table: service                                               */
/*==============================================================*/
create table service
(
   title                varchar(50) not null,
   info                 varchar(500),
   uid                  int,
   sid                  int,
   starttime            datetime,
   endtime              datetime,
   appraise             varchar(50),
   kindid               int,
   result               varchar(500),
   primary key (title)
);

/*==============================================================*/
/* Table: state                                                 */
/*==============================================================*/
create table state
(
   id                   int not null,
   name                 varchar(50),
   primary key (id)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int not null,
   name                 varchar(20),
   loginname            varchar(20),
   pass                 varbinary(50),
   tel                  varchar(50),
   sex                  char(1),
   buildingurl          varchar(255),
   inputdate            datetime,
   ip                   varchar(100),
   age                  int,
   houseid              int,
   roomid               int,
   roleid               int,
   userurl              varchar(255),
   primary key (id)
);

/*==============================================================*/
/* Table: userfamily                                            */
/*==============================================================*/
create table userfamily
(
   id                   int not null,
   name                 varchar(50),
   sex                  char(1),
   tel                  varchar(50),
   relation             varchar(50),
   uid                  int,
   primary key (id)
);

alter table blog add constraint FK_Reference_5 foreign key (uid)
      references user (id) on delete restrict on update restrict;

alter table blog add constraint FK_Reference_6 foreign key (kid)
      references blogkind (int) on delete restrict on update restrict;

alter table car add constraint FK_Reference_13 foreign key (uid)
      references user (id) on delete restrict on update restrict;

alter table comment add constraint FK_Reference_7 foreign key (uid)
      references user (id) on delete restrict on update restrict;

alter table comment add constraint FK_Reference_8 foreign key (bid)
      references blog (id) on delete restrict on update restrict;

alter table pay add constraint FK_Reference_9 foreign key (uid)
      references user (id) on delete restrict on update restrict;

alter table person add constraint FK_Reference_14 foreign key (uid)
      references user (id) on delete restrict on update restrict;

alter table room add constraint FK_Reference_17 foreign key (hid)
      references house (id) on delete restrict on update restrict;

alter table safety add constraint FK_Reference_15 foreign key (safekid)
      references safekind (id) on delete restrict on update restrict;

alter table safety add constraint FK_Reference_16 foreign key (uid)
      references user (id) on delete restrict on update restrict;

alter table service add constraint FK_Reference_10 foreign key (uid)
      references user (id) on delete restrict on update restrict;

alter table service add constraint FK_Reference_11 foreign key (sid)
      references state (id) on delete restrict on update restrict;

alter table service add constraint FK_Reference_12 foreign key (kindid)
      references kind (id) on delete restrict on update restrict;

alter table user add constraint FK_Reference_2 foreign key (roleid)
      references role (id) on delete restrict on update restrict;

alter table user add constraint FK_Reference_3 foreign key (houseid)
      references house (id) on delete restrict on update restrict;

alter table user add constraint FK_Reference_4 foreign key (roomid)
      references room (id) on delete restrict on update restrict;

alter table userfamily add constraint FK_Reference_1 foreign key (uid)
      references user (id) on delete restrict on update restrict;

