create table factura (
	facturaId LONG not null primary key,
	nombreCliente VARCHAR(75) null,
	importeTotal DOUBLE,
	descripcion VARCHAR(75) null
);

create table lineaDeFactura (
	lineaDeacturaId LONG not null primary key,
	detalle VARCHAR(75) null,
	importe DOUBLE,
	facturaId LONG
);