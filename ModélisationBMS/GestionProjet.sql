/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  14/08/2023 18:53:38                      */  
/* this script is modified in local                             */
/*==============================================================*/


drop table if exists Consumable;

drop table if exists Customer;

drop table if exists DeliveryNote;

drop table if exists Devis;

drop table if exists Document;

drop table if exists Entreprise;

drop table if exists HumanResources;

drop table if exists Invoice;

drop table if exists InvoiceItem;

drop table if exists Link;

drop table if exists Materiel;

drop table if exists Milestone;

drop table if exists OrderItem;

drop table if exists Project;

drop table if exists Provider;

drop table if exists Qualification;

drop table if exists Renewable;

drop table if exists Stock;

drop table if exists TAddress;

drop table if exists TOrder;

drop table if exists TResource;

drop table if exists TRole;

drop table if exists TSchedule;

drop table if exists TUser;

drop table if exists Task;

drop table if exists association28;

drop table if exists destock;

drop table if exists hasMultipleRoles;

drop table if exists isQualifiedBy;

drop table if exists providing;

drop table if exists store;

/*==============================================================*/
/* Table : Consumable                                           */
/*==============================================================*/
create table Consumable
(
   codeResource         bigint not null,
   deadlinesApprovisionnement int,
   primary key (codeResource)
);

/*==============================================================*/
/* Table : Customer                                             */
/*==============================================================*/
create table Customer
(
   codeE                bigint not null,
   login                varchar(254),
   primary key (codeE)
);

/*==============================================================*/
/* Table : DeliveryNote                                         */
/*==============================================================*/
create table DeliveryNote
(
   numBL                bigint not null,
   invoiceId            bigint,
   numDevis             bigint,
   dateValidBL          datetime,
   primary key (numBL)
);

/*==============================================================*/
/* Table : Devis                                                */
/*==============================================================*/
create table Devis
(
   numDevis             bigint not null,
   codeE                bigint,
   dateDevis            datetime,
   primary key (numDevis)
);

/*==============================================================*/
/* Table : Document                                             */
/*==============================================================*/
create table Document
(
   indice               bigint not null,
   codeTask             bigint,
   documentWording      varchar(254),
   dateOfIssue          datetime,
   validityDate         datetime,
   presentation         varchar(254),
   valueType            varchar(254),
   pathDocument         varchar(254),
   docType              varchar(254),
   primary key (indice)
);

/*==============================================================*/
/* Table : Entreprise                                           */
/*==============================================================*/
create table Entreprise
(
   codeE                bigint not null,
   nameE                varchar(254),
   contactE             varchar(254),
   emailE               varchar(254),
   faxE                 varchar(254),
   mobileE              varchar(254),
   desktopPhoneE        varchar(254),
   siteWebAdress        varchar(254),
   primary key (codeE)
);

/*==============================================================*/
/* Table : HumanResources                                       */
/*==============================================================*/
create table HumanResources
(
   codeResource         bigint not null,
   login                varchar(254),
   name                 varchar(254),
   primary key (codeResource)
);

/*==============================================================*/
/* Table : Invoice                                              */
/*==============================================================*/
create table Invoice
(
   invoiceId            bigint not null,
   codeE                bigint not null,
   invoiceDate          datetime,
   datePayment          int,
   totalAmount          numeric(8,0),
   regulation           varchar(254),
   deadlineInvoice      int,
   primary key (invoiceId)
);

/*==============================================================*/
/* Table : InvoiceItem                                          */
/*==============================================================*/
create table InvoiceItem
(
   invoiceId            bigint not null,
   id                   bigint not null,
   codeResource         bigint not null,
   price                numeric(8,0),
   qty                  int,
   total                numeric(8,0),
   primary key (invoiceId, id)
);

/*==============================================================*/
/* Table : Link                                                 */
/*==============================================================*/
create table Link
(
   idLink               bigint not null,
   codeTask             bigint,
   Tas_codeTask         bigint,
   typeLink             varchar(254),
   primary key (idLink)
);

/*==============================================================*/
/* Table : Materiel                                             */
/*==============================================================*/
create table Materiel
(
   codeResource         bigint not null,
   model                varchar(254),
   mark                 varchar(254),
   primary key (codeResource)
);

/*==============================================================*/
/* Table : Milestone                                            */
/*==============================================================*/
create table Milestone
(
   codeMilestone        bigint not null,
   codeTask             bigint,
   milistoneName        varchar(254),
   description          varchar(254),
   date                 datetime,
   primary key (codeMilestone)
);

/*==============================================================*/
/* Table : OrderItem                                            */
/*==============================================================*/
create table OrderItem
(
   orderId              bigint not null,
   id                   bigint not null,
   codeResource         bigint not null,
   quantityOrder        int,
   total                numeric(8,0),
   price                numeric(8,0),
   primary key (orderId, id)
);

/*==============================================================*/
/* Table : Project                                              */
/*==============================================================*/
create table Project
(
   codeProject          bigint not null,
   codeAddress          bigint not null,
   codeE                bigint not null,
   codeResource         bigint not null,
   description          varchar(254),
   serviceOrder         varchar(254),
   startExpectedDate    datetime,
   endExpectedDtae      datetime,
   estimatedCost        numeric(8,0),
   String               varchar(254),
   primary key (codeProject)
);

/*==============================================================*/
/* Table : Provider                                             */
/*==============================================================*/
create table Provider
(
   codeE                bigint not null,
   primary key (codeE)
);

/*==============================================================*/
/* Table : Qualification                                        */
/*==============================================================*/
create table Qualification
(
   codeQualif           bigint not null,
   qualificationName    varchar(254),
   tariffRate           numeric(8,0),
   tariffAssignment     numeric(8,0),
   primary key (codeQualif)
);

/*==============================================================*/
/* Table : Renewable                                            */
/*==============================================================*/
create table Renewable
(
   codeResource         bigint not null,
   etatDisposition      bool,
   primary key (codeResource)
);

/*==============================================================*/
/* Table : Stock                                                */
/*==============================================================*/
create table Stock
(
   stockId              bigint not null,
   quantityInStck       bigint,
   unitOfMeasurement    int,
   dateStck             int,
   stockAmount          int,
   primary key (stockId)
);

/*==============================================================*/
/* Table : TAddress                                             */
/*==============================================================*/
create table TAddress
(
   codeAddress          bigint not null,
   codeE                bigint not null,
   addressLigne1        varchar(254),
   addressLigne2        varchar(254),
   addressLigne3        varchar(254),
   country              varchar(254),
   town                 varchar(254),
   postalCode           int,
   longitude            numeric(8,0),
   latitude             numeric(8,0),
   primary key (codeAddress)
);

/*==============================================================*/
/* Table : TOrder                                               */
/*==============================================================*/
create table TOrder
(
   orderId              bigint not null,
   codeResource         bigint not null,
   orderDate            int,
   status               varchar(254),
   deadlineOrder        datetime,
   primary key (orderId)
);

/*==============================================================*/
/* Table : TResource                                            */
/*==============================================================*/
create table TResource
(
   codeResource         bigint not null,
   labelResource        int,
   unitCost             numeric(8,0),
   quantity             int,
   quantityMin          int,
   primary key (codeResource)
);

/*==============================================================*/
/* Table : TRole                                                */
/*==============================================================*/
create table TRole
(
   roleID               bigint not null,
   roleName             varchar(254),
   primary key (roleID)
);

/*==============================================================*/
/* Table : TSchedule                                            */
/*==============================================================*/
create table TSchedule
(
   codeSchedule         varchar(254) not null,
   codeProject          bigint,
   designation          varchar(254),
   startDate            datetime,
   endDtae              datetime,
   primary key (codeSchedule)
);

/*==============================================================*/
/* Table : TUser                                                */
/*==============================================================*/
create table TUser
(
   login                varchar(254) not null,
   password             varchar(254),
   email                varchar(254),
   primary key (login)
);

/*==============================================================*/
/* Table : Task                                                 */
/*==============================================================*/
create table Task
(
   codeTask             bigint not null,
   codeSchedule         varchar(254),
   Tas_codeTask         bigint,
   nameTask             varchar(254),
   startExpectedDate    datetime,
   endExpectedDate      datetime,
   priority             datetime,
   estimatedCost        numeric(8,0),
   expectedDuration     int,
   status               varchar(254),
   billingStatus        varchar(254),
   paymentStatus        varchar(254),
   constraintType       varchar(254),
   ordinal              int,
   complete             int,
   primary key (codeTask)
);

/*==============================================================*/
/* Table : association28                                        */
/*==============================================================*/
create table AffectationRH
(
   codeTask             bigint not null,
   codeResource         bigint not null,
   nbreDaysPerMan       int,
   nbreIntervenersMin   int,
   nbreIntervenersMax   int,
   nbreIntervenersOp    int,
   primary key (codeTask, codeResource)
);

/*==============================================================*/
/* Table : destock                                              */
/*==============================================================*/
create table destock
(
   codeResource         bigint not null,
   stockId              bigint not null,
   quantityExit         int,
   date                 datetime,
   unitAmount           numeric(8,0),
   transfert            bool,
   primary key (codeResource, stockId)
);

/*==============================================================*/
/* Table : hasMultipleRoles                                     */
/*==============================================================*/
create table hasMultipleRoles
(
   login                varchar(254) not null,
   roleID               bigint not null,
   primary key (login, roleID)
);

/*==============================================================*/
/* Table : isQualifiedBy                                        */
/*==============================================================*/
create table isQualifiedBy
(
   codeResource         bigint not null,
   codeQualif           bigint not null,
   primary key (codeResource, codeQualif)
);

/*==============================================================*/
/* Table : providing                                            */
/*==============================================================*/
create table providing
(
   codeE                bigint not null,
   codeResource         bigint not null,
   primary key (codeE, codeResource)
);

/*==============================================================*/
/* Table : store                                                */
/*==============================================================*/
create table store
(
   codeResource         bigint not null,
   stockId              bigint not null,
   quantityE            int,
   date                 datetime,
   unitAmount           numeric(8,0),
   transfert            bool,
   primary key (codeResource, stockId)
);

alter table Consumable add constraint FK_ConsumableIsAResource foreign key (codeResource)
      references TResource (codeResource) on delete restrict on update restrict;

alter table Customer add constraint FK_CustomerIsEntreprise foreign key (codeE)
      references Entreprise (codeE) on delete restrict on update restrict;

alter table Customer add constraint FK_hasUserCompte foreign key (login)
      references TUser (login) on delete restrict on update restrict;

alter table DeliveryNote add constraint FK_devisDeliveryNote foreign key (numDevis)
      references Devis (numDevis) on delete restrict on update restrict;

alter table DeliveryNote add constraint FK_invoiceDeliveryNote foreign key (invoiceId)
      references Invoice (invoiceId) on delete restrict on update restrict;

alter table Devis add constraint FK_request foreign key (codeE)
      references Customer (codeE) on delete restrict on update restrict;

alter table Document add constraint FK_taskDocument foreign key (codeTask)
      references Task (codeTask) on delete restrict on update restrict;

alter table HumanResources add constraint FK_HumanIsARenewable foreign key (codeResource)
      references Renewable (codeResource) on delete restrict on update restrict;

alter table HumanResources add constraint FK_hasAUserProfile foreign key (login)
      references TUser (login) on delete restrict on update restrict;

alter table Invoice add constraint FK_pay foreign key (codeE)
      references Customer (codeE) on delete restrict on update restrict;

alter table InvoiceItem add constraint FK_invoiceInvoiceItem foreign key (invoiceId)
      references Invoice (invoiceId) on delete restrict on update restrict;

alter table InvoiceItem add constraint FK_invoiceItemResource foreign key (codeResource)
      references TResource (codeResource) on delete restrict on update restrict;

alter table Link add constraint FK_taskOrigin foreign key (codeTask)
      references Task (codeTask) on delete restrict on update restrict;

alter table Link add constraint FK_taskTarget foreign key (Tas_codeTask)
      references Task (codeTask) on delete restrict on update restrict;

alter table Materiel add constraint FK_MaterialIsARenewable foreign key (codeResource)
      references Renewable (codeResource) on delete restrict on update restrict;

alter table Milestone add constraint FK_milestoneTask foreign key (codeTask)
      references Task (codeTask) on delete restrict on update restrict;

alter table OrderItem add constraint FK_concern foreign key (codeResource)
      references TResource (codeResource) on delete restrict on update restrict;

alter table OrderItem add constraint FK_orderItem foreign key (orderId)
      references TOrder (orderId) on delete restrict on update restrict;

alter table Project add constraint FK_followedBy foreign key (codeE)
      references Customer (codeE) on delete restrict on update restrict;

alter table Project add constraint FK_handledBy foreign key (codeResource)
      references HumanResources (codeResource) on delete restrict on update restrict;

alter table Project add constraint FK_locateBy foreign key (codeAddress)
      references TAddress (codeAddress) on delete restrict on update restrict;

alter table Provider add constraint FK_ProviderIsEntreprise foreign key (codeE)
      references Entreprise (codeE) on delete restrict on update restrict;

alter table Renewable add constraint FK_RenewableIsAResource foreign key (codeResource)
      references TResource (codeResource) on delete restrict on update restrict;

alter table TAddress add constraint FK_isLocated foreign key (codeE)
      references Entreprise (codeE) on delete restrict on update restrict;

alter table TOrder add constraint FK_carryOut foreign key (codeResource)
      references HumanResources (codeResource) on delete restrict on update restrict;

alter table TSchedule add constraint FK_programmedByShedule foreign key (codeProject)
      references Project (codeProject) on delete restrict on update restrict;

alter table Task add constraint FK_containsTask foreign key (codeSchedule)
      references TSchedule (codeSchedule) on delete restrict on update restrict;

alter table Task add constraint FK_taskParent foreign key (Tas_codeTask)
      references Task (codeTask) on delete restrict on update restrict;

alter table AffectationRH add constraint FK_AFF_Resources foreign key (codeResource)
      references TResource (codeResource) on delete restrict on update restrict;

alter table AffectationRH add constraint FK_AFF_TASK foreign key (codeTask)
      references Task (codeTask) on delete restrict on update restrict;

alter table destock add constraint FK_destock foreign key (codeResource)
      references TResource (codeResource) on delete restrict on update restrict;

alter table destock add constraint FK_stock2 foreign key (stockId)
      references Stock (stockId) on delete restrict on update restrict;

alter table hasMultipleRoles add constraint FK_hasMultipleRoles foreign key (roleID)
      references TRole (roleID) on delete restrict on update restrict;

alter table hasMultipleRoles add constraint FK_hasMultipleRoles_USER foreign key (login)
      references TUser (login) on delete restrict on update restrict;

alter table isQualifiedBy add constraint FK_isQualifiedBy_RH foreign key (codeResource)
      references HumanResources (codeResource) on delete restrict on update restrict;

alter table isQualifiedBy add constraint FK_isQualifiedBy_Q foreign key (codeQualif)
      references Qualification (codeQualif) on delete restrict on update restrict;

alter table providing add constraint FK_providing_E foreign key (codeE)
      references Provider (codeE) on delete restrict on update restrict;

alter table providing add constraint FK_providing_R foreign key (codeResource)
      references TResource (codeResource) on delete restrict on update restrict;

alter table store add constraint FK_stock3 foreign key (stockId)
      references Stock (stockId) on delete restrict on update restrict;

alter table store add constraint FK_store foreign key (codeResource)
      references TResource (codeResource) on delete restrict on update restrict;

