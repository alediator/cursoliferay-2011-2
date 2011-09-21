create table Emergya_Informe (
	informeId LONG not null primary key,
	companyId LONG,
	userId LONG,
	groupId LONG,
	titulo VARCHAR(75) null,
	descripcion VARCHAR(75) null,
	contenido VARCHAR(75) null,
	fechaCreacion DATE null
);