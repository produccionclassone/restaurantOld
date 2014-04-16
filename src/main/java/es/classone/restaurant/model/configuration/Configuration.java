package es.classone.restaurant.model.configuration;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Res14cnt_1")
public class Configuration {
	private Long R1CNT001; // PK Fijo "1"
	private String R1CNT002; // Nombre de la Aplicacion
	private String R1CNT003; // Release
	private String R1CNT004; // Nombre BBDD Restaurante

	private String R1CNT007_01; // Programas Especial
	private String R1CNT007_02; // Programas Especial
	private String R1CNT007_03; // Programas Especial
	private String R1CNT007_04; // Programas Especial
	private String R1CNT007_05; // Programas Especial

	private char R4CNT015; // Prt Fras. 1->5
	private char R4CNT016; // Prt Tcks. 1->5
	private int R1CNT008; // Maximo Reg.Auditor
	private String R1CNT009_03; // Permisos Keys
	private String R1CNT009_04; // Permisos Keys
	private String R1CNT009_05; // Permisos Keys
	private String R1CNT009_06; // Permisos Keys
	private String R1CNT009_07; // Permisos Keys
	private String R1CNT009_08; // Permisos Keys

	private String R1CNT011; // Nombre BBDD Contabilidad
	private String R1CNT091; // Nombre BBDD Seven Stars
	private String R1CNT093; // Nombre BBDD StarEcon
	private String RSCNT026; // Nombre BBDD StarCar

	private String R4CNT002; // Categoria Restaurante
	private String R4CNT003; // Codigo Contabilidad
	private int R4CNT004; // Nro de Mesas
	private char R4CNT005; // Cobro por Servicio/Cbtos
	private float R4CNT006; // Importe si SI
	private int R4CNT106; // Tipo IVA (1->3)
	private char R4CNT007; // Propina CAMAREROS en Fra
	private float R4CNT008; // %
	private int R4CNT108; // Tipo IVA (1->3)
	private char R4CNT009; // Cobro PLATOS COMPLEMENTO
	private char R4CNT010; // Decimales
	private char R4CNT011; // I.V.A. Incluido
	private Calendar R4CNT012; // Fecha Sesion Actual
	private int R4CNT013_01; // Sesion Actual
	private int R4CNT013_02; // Ultima factura
	private int R4CNT013_03; // Ultima Comanda
	private int R4CNT013_04; // Ultimo Cliente
	private char R4CNT014; // Estado Sesion Actual (A/C)
	private int R4CNT017; // Tipo de Sesion /* 1=Almuerzo 2=Comida 3=Cena
							// 4=Otros */
	private String R4CNT018; // C.A.D. de la EXPLOTACION
	private char R4CNT019; // Efectuar E.CONTABLE VTAS (S/N)
	private String R4CNT030; // Tipo ING.SERVICIO CBTO
	private String R4CNT031; // Tipo ING.PROPINAS
	private String R4CNT032; // C.A.D. del Departamento
	private char R4CNT041; // Integracion HOTEL (S/N/R)
	private char R4CNT042; // Integracion ECONOMATO (S/N)
	private char R4CNT043; // Calificar PLATOS PRN-COCINA
	private char R4CNT044; // Imprimir COMANDA TOTAL
	private char R4CNT045; // Impresora (1->5)
	private char R4CNT046; // Division Comandas x Plato
	private char R4CNT047; // Separador de CAMPO .TXT
	private char R4CNT048; // Separador Alfabetico .TXT
	private char R4CNT049; // Imprimir COMANDA TOTAL 2 Imp
	private char R4CNT050; // 2da. Impresora (1->5)
	private char R4CNT051; // Especial cdas.cocina si comandos POS/ESC (S/N)

	private char R4CNT701; // Habilitado TPV Virtual ("S" o "N")
	private char R4CNT702; // Habilitado StarCard ("S" o "N")
	private char R4CNT703; // -- bmp->prt ("S" o "N")
	private int R4CNT704; // tamaÃ±o BMP (0 a 3)
	private Calendar R4CNT705; // Ultimo cierre mes
	private int R4CNT706; // Nivel Menus del dia
	private int R4CNT707; // Nivel Anula mesa

	private float R4CNT021_01; // Tipo de IVA .1.
	private String R4CNT022_01; // Cuenta IVA. 1
	private float R4CNT021_02; // Tipo de IVA .2.
	private String R4CNT022_02; // Cuenta IVA. 2
	private float R4CNT021_03; // Tipo de IVA .3.
	private String R4CNT022_03; // Cuenta IVA. 3
	/*
	 * Cuentas enlaces Contables
	 */
	private String R4CNT023_01; // Caja 1
	private String R4CNT023_02; // Invitacion 1
	private String R4CNT023_03; // Caja 2
	private String R4CNT023_04; // Invitacion 2
	private String R4CNT023_05; // Caja 3
	private String R4CNT023_06; // Invitacion 3
	private String R4CNT023_07; // Caja 4
	private String R4CNT023_08; // Invitacion 4
	private String R4CNT023_09; // Caja 5
	private String R4CNT023_10; // Invitacion 5

	private String R4CNT023_11; // Cuenta Generica Ventas
	private String R4CNT023_12; // Cta.Serv.Cubiertos
	private String R4CNT023_13; // Cta.Propinas Camareros
	private String R4CNT023_14; // Cta.Descuadre Ventas

	private char R4CNT101; // Linea de Euro ("S" o "N")

	private float R4CNT102; // Cambio del Euro/USD
	private String R4CNT201; // Literal de IVA
	private String R4CNT202; // Servicio Hotel Desayunos
	private String R4CNT203; // Servicio Hotel Comida
	private String R4CNT204; // Servicio Hotel Cena
	private String R4CNT205; // Servicio Hotel Otros
	private String R4CNT222; // Depto Desayunos
	private String R4CNT223; // Depto Comida
	private String R4CNT224; // Depto Cena
	private String R4CNT225; // Depto Otros

	private char R4CNT347; // Propinas
	private String R4CNT348; // Elemento Asociado a propinas -- NUMERICO */

	private char R4CNT349; // Dcto .1. S/N
	private String R4CNT350; // Elemento Asociado a Dcto 1 -- NUMERICO */

	private int R4CNT351; // % Dcto1
	private char R4CNT352; // Dcto .2. S/N
	private String R4CNT353; // Elemento Asociado a Dcto 2 -- NUMERICO */

	private float R4CNT354; // % Dcto2
	private char R4CNT355; // Dcto .3. S/N
	private String R4CNT356; // Elemento Asociado a Dcto 3 -- NUMERICO */

	private float R4CNT357; // % Dcto3
	private String R4CNT358; // Elemento Asociado TPV -- NUMERICO */

	private String R4CNT359; // Cargo TPV
	private char R4CNT024; // Formato Fecha /* 1= DDMMAAAA 2= MMDDAAAA 3=
							// AAAAMMDD */

	private String R5CNT002_01; // Pie Factura L.1
	private String R5CNT002_02; // Pie Factura L.2
	private String R5CNT002_03; // Pie Factura L.3
	private String R5CNT002_04; // Pie Factura L.4
	private String R5CNT003_01; // Pie Tickets L.1
	private String R5CNT003_02; // Pie Tickets L.2
	private String R5CNT003_03; // Pie Tickets L.3
	private String R5CNT003_04; // Pie Tickets L.4

	private String R4CNT025; // E-Mail Envio
	private String R4CNT026; // Servicio Envio
	private String R4CNT027; // Login Envio
	private String R4CNT028; // PSW Envio
	private String R4CNT303; // SMS Email
	private String R4CNT304; // SMS Api-Id
	private String R4CNT305; // SMS User
	private String R4CNT306; // SMS PWD
	private String RXCNT002; // IP LVDE
	private String RXCNT003; // IP Manuales
	private String RXCNT004; // IP CCC
	private String RXCNT005; // IP Alternativa
	/* Colores del Formulario */
	private String RSCNT003; // Comanda
	private String RSCNT303; // Color Background
	private String RSCNT004; // Factura
	private String RSCNT304; // Color Background 2
	private String RSCNT005; // Cobro
	private String RSCNT006; // Traspaso
	private String RSCNT007; // Vacia
	private String RSCNT008; // Ocupada
	private String RSCNT009; // Unida
	private String RSCNT010; // Reservada
	private String RSCNT011; // Facturada
	private int RSCNT012; // Longitud de Pagina
	private int RSCNT013; // Lineas de Salto Cabecera
	private int RSCNT014; // Tabulacion Izquierda
	private String RSCNT016; // psw S/N

	private String RSCNT018_01; // Codigo Calificador
	private String RSCNT019_01; // Descripcion Calificador
	private String RSCNT018_02; // Codigo Calificador
	private String RSCNT019_02; // Descripcion Calificador
	private String RSCNT018_03; // Codigo Calificador
	private String RSCNT019_03; // Descripcion Calificador
	private String RSCNT018_04; // Codigo Calificador
	private String RSCNT019_04; // Descripcion Calificador
	/* Salas */
	private String RSCNT020_01; // Descripcion Salas 1
	private int RSCNT021_01; // Primera Mesa
	private int RSCNT022_01; // Ultima Mesa
	private String RSCNT020_02; // Descripcion Salas 2
	private int RSCNT021_02; // Primera Mesa
	private int RSCNT022_02; // Ultima Mesa
	private String RSCNT020_03; // Descripcion Salas 3
	private int RSCNT021_03; // Primera Mesa
	private int RSCNT022_03; // Ultima Mesa
	private String RSCNT020_04; // Descripcion Salas 4
	private int RSCNT021_04; // Primera Mesa
	private int RSCNT022_04; // Ultima Mesa
	private String RSCNT020_05; // Descripcion Salas 5
	private int RSCNT021_05; // Primera Mesa
	private int RSCNT022_05; // Ultima Mesa
	private String RSCNT020_06; // Descripcion Salas 6
	private int RSCNT021_06; // Primera Mesa
	private int RSCNT022_06; // Ultima Mesa
	private String RSCNT020_07; // Descripcion Salas 7
	private int RSCNT021_07; // Primera Mesa
	private int RSCNT022_07; // Ultima Mesa

	private String RSCNT025; // Decimales (S/N)
	private int RSCNT028; // Caja al Cobro
	private String RSCNT029; // Literal Especial Factura

	private String RSCNT030; // SW Unidades acumulativas restaurante
	private String RSCNT031; // Literal Cobro x Cubierto
	private String RSCNT032; // Literal Propinas Automatico
	private String RSCNT033; // Impresion en COMPRIMIDO FRA.STANDARD.
	private String RSCNT034; // Literal PrecioxPersona
	private String RSCNT035; // Nuevo Antibloqueo

	private String RSCNT101; // Cabecera de Factura
	private int RSCNT102; // Caracteres Antes
	private int RSCNT103; // 0=EX / 1=10 / 2=17,5
	private String RSCNT104; // Literal
	private String RSCNT105; // Cabecera de Factura
	private int RSCNT106; // Caracteres Antes
	private int RSCNT107; // 0=EX / 1=10 / 2=17,5
	private String RSCNT108; // Literal
	private String RSCNT109; // Cabecera de Factura
	private int RSCNT110; // Caracteres Antes
	private int RSCNT111; // 0=EX / 1=10 / 2=17,5
	private String RSCNT112; // Literal

	private String RSCNT201; // Cabecera de Factura
	private int RSCNT202; // Caracteres Antes
	private int RSCNT203; // 0=EX / 1=10 / 2=17,5
	private int RSCNT204; // Literal
	private String RSCNT205; // Cabecera de Factura
	private int RSCNT206; // Caracteres Antes
	private int RSCNT207; // 0=EX / 1=10 / 2=17,5
	private String RSCNT208; // Literal
	private String RSCNT209; // Cabecera de Factura
	private int RSCNT210; // Caracteres Antes
	private int RSCNT211; // 0=EX / 1=10 / 2=17,5
	private String RSCNT212; // Literal
	/* Secuencias de Impresoras */
	/* Laser PCL */
	private String R2CNT002_01;
	private int R2CNT003_01_01; // Activar Comprimido
	private int R2CNT003_01_02;
	private int R2CNT003_01_03;
	private int R2CNT003_01_04;
	private int R2CNT003_01_05;
	private int R2CNT003_01_06;
	private int R2CNT003_01_07;
	private int R2CNT004_01_01; // Des-Activar Comprimido
	private int R2CNT004_01_02;
	private int R2CNT004_01_03;
	private int R2CNT004_01_04;
	private int R2CNT004_01_05;
	private int R2CNT004_01_06;
	private int R2CNT004_01_07;
	private int R2CNT005_01_01; // Activar Expandido
	private int R2CNT005_01_02;
	private int R2CNT005_01_03;
	private int R2CNT005_01_04;
	private int R2CNT005_01_05;
	private int R2CNT005_01_06;
	private int R2CNT005_01_07;
	private int R2CNT015_01_01; // Des-Activar Expandido
	private int R2CNT015_01_02;
	private int R2CNT015_01_03;
	private int R2CNT015_01_04;
	private int R2CNT015_01_05;
	private int R2CNT015_01_06;
	private int R2CNT015_01_07;
	private int R2CNT006_01_01; // Activar Subrayado
	private int R2CNT006_01_02;
	private int R2CNT006_01_03;
	private int R2CNT006_01_04;
	private int R2CNT006_01_05;
	private int R2CNT006_01_06;
	private int R2CNT006_01_07;
	private int R2CNT016_01_01; // Des-Activar Subrayado
	private int R2CNT016_01_02;
	private int R2CNT016_01_03;
	private int R2CNT016_01_04;
	private int R2CNT016_01_05;
	private int R2CNT016_01_06;
	private int R2CNT016_01_07;
	private int R2CNT013_01_01; // Otras Secuencias
	private int R2CNT013_01_02;
	private int R2CNT013_01_03;
	private int R2CNT013_01_04;
	private int R2CNT013_01_05;
	private int R2CNT013_01_06;
	private int R2CNT013_01_07;
	private int R2CNT014_01_01; // Otras Secuencias
	private int R2CNT014_01_02;
	private int R2CNT014_01_03;
	private int R2CNT014_01_04;
	private int R2CNT014_01_05;
	private int R2CNT014_01_06;
	private int R2CNT014_01_07;
	/* Laser PCL */
	private String R2CNT002_02;
	private int R2CNT003_02_01; // Activar Comprimido
	private int R2CNT003_02_02;
	private int R2CNT003_02_03;
	private int R2CNT003_02_04;
	private int R2CNT003_02_05;
	private int R2CNT003_02_06;
	private int R2CNT003_02_07;
	private int R2CNT004_02_01; // Des-Activar Comprimido
	private int R2CNT004_02_02;
	private int R2CNT004_02_03;
	private int R2CNT004_02_04;
	private int R2CNT004_02_05;
	private int R2CNT004_02_06;
	private int R2CNT004_02_07;
	private int R2CNT005_02_01; // Activar Expandido
	private int R2CNT005_02_02;
	private int R2CNT005_02_03;
	private int R2CNT005_02_04;
	private int R2CNT005_02_05;
	private int R2CNT005_02_06;
	private int R2CNT005_02_07;
	private int R2CNT015_02_01; // Des-Activar Expandido
	private int R2CNT015_02_02;
	private int R2CNT015_02_03;
	private int R2CNT015_02_04;
	private int R2CNT015_02_05;
	private int R2CNT015_02_06;
	private int R2CNT015_02_07;
	private int R2CNT006_02_01; // Activar Subrayado
	private int R2CNT006_02_02;
	private int R2CNT006_02_03;
	private int R2CNT006_02_04;
	private int R2CNT006_02_05;
	private int R2CNT006_02_06;
	private int R2CNT006_02_07;
	private int R2CNT016_02_01; // Des-Activar Subrayado
	private int R2CNT016_02_02;
	private int R2CNT016_02_03;
	private int R2CNT016_02_04;
	private int R2CNT016_02_05;
	private int R2CNT016_02_06;
	private int R2CNT016_02_07;
	private int R2CNT013_02_01; // Otras Secuencias
	private int R2CNT013_02_02;
	private int R2CNT013_02_03;
	private int R2CNT013_02_04;
	private int R2CNT013_02_05;
	private int R2CNT013_02_06;
	private int R2CNT013_02_07;
	private int R2CNT014_02_01; // Otras Secuencias
	private int R2CNT014_02_02;
	private int R2CNT014_02_03;
	private int R2CNT014_02_04;
	private int R2CNT014_02_05;
	private int R2CNT014_02_06;
	private int R2CNT014_02_07;
	/* Laser PCL */
	private String R2CNT002_03;
	private int R2CNT003_03_01; // Activar Comprimido
	private int R2CNT003_03_02;
	private int R2CNT003_03_03;
	private int R2CNT003_03_04;
	private int R2CNT003_03_05;
	private int R2CNT003_03_06;
	private int R2CNT003_03_07;
	private int R2CNT004_03_01; // Des-Activar Comprimido
	private int R2CNT004_03_02;
	private int R2CNT004_03_03;
	private int R2CNT004_03_04;
	private int R2CNT004_03_05;
	private int R2CNT004_03_06;
	private int R2CNT004_03_07;
	private int R2CNT005_03_01; // Activar Expandido
	private int R2CNT005_03_02;
	private int R2CNT005_03_03;
	private int R2CNT005_03_04;
	private int R2CNT005_03_05;
	private int R2CNT005_03_06;
	private int R2CNT005_03_07;
	private int R2CNT015_03_01; // Des-Activar Expandido
	private int R2CNT015_03_02;
	private int R2CNT015_03_03;
	private int R2CNT015_03_04;
	private int R2CNT015_03_05;
	private int R2CNT015_03_06;
	private int R2CNT015_03_07;
	private int R2CNT006_03_01; // Activar Subrayado
	private int R2CNT006_03_02;
	private int R2CNT006_03_03;
	private int R2CNT006_03_04;
	private int R2CNT006_03_05;
	private int R2CNT006_03_06;
	private int R2CNT006_03_07;
	private int R2CNT016_03_01; // Des-Activar Subrayado
	private int R2CNT016_03_02;
	private int R2CNT016_03_03;
	private int R2CNT016_03_04;
	private int R2CNT016_03_05;
	private int R2CNT016_03_06;
	private int R2CNT016_03_07;
	private int R2CNT013_03_01; // Otras Secuencias
	private int R2CNT013_03_02;
	private int R2CNT013_03_03;
	private int R2CNT013_03_04;
	private int R2CNT013_03_05;
	private int R2CNT013_03_06;
	private int R2CNT013_03_07;
	private int R2CNT014_03_01; // Otras Secuencias
	private int R2CNT014_03_02;
	private int R2CNT014_03_03;
	private int R2CNT014_03_04;
	private int R2CNT014_03_05;
	private int R2CNT014_03_06;
	private int R2CNT014_03_07;
	/* Matricial */
	private String R2CNT002_04;
	private int R2CNT003_04_01; // Activar Comprimido
	private int R2CNT003_04_02;
	private int R2CNT003_04_03;
	private int R2CNT003_04_04;
	private int R2CNT003_04_05;
	private int R2CNT003_04_06;
	private int R2CNT003_04_07;
	private int R2CNT004_04_01; // Des-Activar Comprimido
	private int R2CNT004_04_02;
	private int R2CNT004_04_03;
	private int R2CNT004_04_04;
	private int R2CNT004_04_05;
	private int R2CNT004_04_06;
	private int R2CNT004_04_07;
	private int R2CNT005_04_01; // Activar Expandido
	private int R2CNT005_04_02;
	private int R2CNT005_04_03;
	private int R2CNT005_04_04;
	private int R2CNT005_04_05;
	private int R2CNT005_04_06;
	private int R2CNT005_04_07;
	private int R2CNT015_04_01; // Des-Activar Expandido
	private int R2CNT015_04_02;
	private int R2CNT015_04_03;
	private int R2CNT015_04_04;
	private int R2CNT015_04_05;
	private int R2CNT015_04_06;
	private int R2CNT015_04_07;
	private int R2CNT006_04_01; // Activar Subrayado
	private int R2CNT006_04_02;
	private int R2CNT006_04_03;
	private int R2CNT006_04_04;
	private int R2CNT006_04_05;
	private int R2CNT006_04_06;
	private int R2CNT006_04_07;
	private int R2CNT016_04_01; // Des-Activar Subrayado
	private int R2CNT016_04_02;
	private int R2CNT016_04_03;
	private int R2CNT016_04_04;
	private int R2CNT016_04_05;
	private int R2CNT016_04_06;
	private int R2CNT016_04_07;
	private int R2CNT013_04_01; // Otras Secuencias
	private int R2CNT013_04_02;
	private int R2CNT013_04_03;
	private int R2CNT013_04_04;
	private int R2CNT013_04_05;
	private int R2CNT013_04_06;
	private int R2CNT013_04_07;
	private int R2CNT014_04_01; // Otras Secuencias
	private int R2CNT014_04_02;
	private int R2CNT014_04_03;
	private int R2CNT014_04_04;
	private int R2CNT014_04_05;
	private int R2CNT014_04_06;
	private int R2CNT014_04_07;
	/* Fichero */
	private String R2CNT002_05;
	private int R2CNT003_05_01; // Activar Comprimido
	private int R2CNT003_05_02;
	private int R2CNT003_05_03;
	private int R2CNT003_05_04;
	private int R2CNT003_05_05;
	private int R2CNT003_05_06;
	private int R2CNT003_05_07;
	private int R2CNT004_05_01; // Des-Activar Comprimido
	private int R2CNT004_05_02;
	private int R2CNT004_05_03;
	private int R2CNT004_05_04;
	private int R2CNT004_05_05;
	private int R2CNT004_05_06;
	private int R2CNT004_05_07;
	private int R2CNT005_05_01; // Activar Expandido
	private int R2CNT005_05_02;
	private int R2CNT005_05_03;
	private int R2CNT005_05_04;
	private int R2CNT005_05_05;
	private int R2CNT005_05_06;
	private int R2CNT005_05_07;
	private int R2CNT015_05_01; // Des-Activar Expandido
	private int R2CNT015_05_02;
	private int R2CNT015_05_03;
	private int R2CNT015_05_04;
	private int R2CNT015_05_05;
	private int R2CNT015_05_06;
	private int R2CNT015_05_07;
	private int R2CNT006_05_01; // Activar Subrayado
	private int R2CNT006_05_02;
	private int R2CNT006_05_03;
	private int R2CNT006_05_04;
	private int R2CNT006_05_05;
	private int R2CNT006_05_06;
	private int R2CNT006_05_07;
	private int R2CNT016_05_01; // Des-Activar Subrayado
	private int R2CNT016_05_02;
	private int R2CNT016_05_03;
	private int R2CNT016_05_04;
	private int R2CNT016_05_05;
	private int R2CNT016_05_06;
	private int R2CNT016_05_07;
	private int R2CNT013_05_01; // Otras Secuencias
	private int R2CNT013_05_02;
	private int R2CNT013_05_03;
	private int R2CNT013_05_04;
	private int R2CNT013_05_05;
	private int R2CNT013_05_06;
	private int R2CNT013_05_07;
	private int R2CNT014_05_01; // Otras Secuencias
	private int R2CNT014_05_02;
	private int R2CNT014_05_03;
	private int R2CNT014_05_04;
	private int R2CNT014_05_05;
	private int R2CNT014_05_06;
	private int R2CNT014_05_07;
	/* Especial Impresoras Tickets */
	private String RICNT010_01;
	private int RICNT020_01_01;
	private int RICNT020_01_02;
	private int RICNT020_01_03;
	private int RICNT020_01_04;
	private int RICNT020_01_05;
	private int RICNT020_01_06;
	private int RICNT020_01_07;
	private String RICNT010_02;
	private int RICNT020_02_01;
	private int RICNT020_02_02;
	private int RICNT020_02_03;
	private int RICNT020_02_04;
	private int RICNT020_02_05;
	private int RICNT020_02_06;
	private int RICNT020_02_07;
	private String RICNT010_03;
	private int RICNT020_03_01;
	private int RICNT020_03_02;
	private int RICNT020_03_03;
	private int RICNT020_03_04;
	private int RICNT020_03_05;
	private int RICNT020_03_06;
	private int RICNT020_03_07;
	private String RICNT010_04;
	private int RICNT020_04_01;
	private int RICNT020_04_02;
	private int RICNT020_04_03;
	private int RICNT020_04_04;
	private int RICNT020_04_05;
	private int RICNT020_04_06;
	private int RICNT020_04_07;
	private String RICNT010_05;
	private int RICNT020_05_01;
	private int RICNT020_05_02;
	private int RICNT020_05_03;
	private int RICNT020_05_04;
	private int RICNT020_05_05;
	private int RICNT020_05_06;
	private int RICNT020_05_07;
	private String RICNT010_06;
	private int RICNT020_06_01;
	private int RICNT020_06_02;
	private int RICNT020_06_03;
	private int RICNT020_06_04;
	private int RICNT020_06_05;
	private int RICNT020_06_06;
	private int RICNT020_06_07;
	private int RICNT010_07;
	private int RICNT020_07_01;
	private int RICNT020_07_02;
	private int RICNT020_07_03;
	private int RICNT020_07_04;
	private int RICNT020_07_05;
	private int RICNT020_07_06;
	private int RICNT020_07_07;
	private String RICNT010_08;
	private int RICNT020_08_01;
	private int RICNT020_08_02;
	private int RICNT020_08_03;
	private int RICNT020_08_04;
	private int RICNT020_08_05;
	private int RICNT020_08_06;
	private int RICNT020_08_07;
	private String RICNT010_09;
	private int RICNT020_09_01;
	private int RICNT020_09_02;
	private int RICNT020_09_03;
	private int RICNT020_09_04;
	private int RICNT020_09_05;
	private int RICNT020_09_06;
	private int RICNT020_09_07;
	private String RICNT010_10;
	private int RICNT020_10_01;
	private int RICNT020_10_02;
	private int RICNT020_10_03;
	private int RICNT020_10_04;
	private int RICNT020_10_05;
	private int RICNT020_10_06;
	private int RICNT020_10_07;
	/* Secuencias Especiales Impresoras */
	private String RICNT010101;
	private int RICNT020101_01;
	private int RICNT020101_02;
	private int RICNT020101_03;
	private int RICNT020101_04;
	private int RICNT020101_05;
	private int RICNT020101_06;
	private int RICNT020101_07;
	private String RICNT010102;
	private int RICNT020102_01;
	private int RICNT020102_02;
	private int RICNT020102_03;
	private int RICNT020102_04;
	private int RICNT020102_05;
	private int RICNT020102_06;
	private int RICNT020102_07;
	private String RICNT010103;
	private int RICNT020103_01;
	private int RICNT020103_02;
	private int RICNT020103_03;
	private int RICNT020103_04;
	private int RICNT020103_05;
	private int RICNT020103_06;
	private int RICNT020103_07;
	private String RICNT010104;
	private int RICNT020104_01;
	private int RICNT020104_02;
	private int RICNT020104_03;
	private int RICNT020104_04;
	private int RICNT020104_05;
	private int RICNT020104_06;
	private int RICNT020104_07;
	private String RICNT010105;
	private int RICNT020105_01;
	private int RICNT020105_02;
	private int RICNT020105_03;
	private int RICNT020105_04;
	private int RICNT020105_05;
	private int RICNT020105_06;
	private int RICNT020105_07;
	private String RICNT010106;
	private int RICNT020106_01;
	private int RICNT020106_02;
	private int RICNT020106_03;
	private int RICNT020106_04;
	private int RICNT020106_05;
	private int RICNT020106_06;
	private int RICNT020106_07;
	private String RICNT010107;
	private int RICNT020107_01;
	private int RICNT020107_02;
	private int RICNT020107_03;
	private int RICNT020107_04;
	private int RICNT020107_05;
	private int RICNT020107_06;
	private int RICNT020107_07;
	private String RICNT010108;
	private int RICNT020108_01;
	private int RICNT020108_02;
	private int RICNT020108_03;
	private int RICNT020108_04;
	private int RICNT020108_05;
	private int RICNT020108_06;
	private int RICNT020108_07;
	private String RICNT010109;
	private int RICNT020109_01;
	private int RICNT020109_02;
	private int RICNT020109_03;
	private int RICNT020109_04;
	private int RICNT020109_05;
	private int RICNT020109_06;
	private int RICNT020109_07;
	private String RICNT010110;
	private int RICNT020110_01;
	private int RICNT020110_02;
	private int RICNT020110_03;
	private int RICNT020110_04;
	private int RICNT020110_05;
	private int RICNT020110_06;
	private int RICNT020110_07;

	public Configuration(){
	}
	
	@SequenceGenerator( // It only takes effect for
	name = "ConfigurationIdGenerator", // databases providing identifier
	sequenceName = "ConfigurationSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ConfigurationIdGenerator")	
	public Long getR1CNT001() {
		return R1CNT001;
	}

	public void setR1CNT001(Long r1cnt001) {
		R1CNT001 = r1cnt001;
	}

	public String getR1CNT002() {
		return R1CNT002;
	}

	public void setR1CNT002(String r1cnt002) {
		R1CNT002 = r1cnt002;
	}

	public String getR1CNT003() {
		return R1CNT003;
	}

	public void setR1CNT003(String r1cnt003) {
		R1CNT003 = r1cnt003;
	}

	public String getR1CNT004() {
		return R1CNT004;
	}

	public void setR1CNT004(String r1cnt004) {
		R1CNT004 = r1cnt004;
	}

	public String getR1CNT007_01() {
		return R1CNT007_01;
	}

	public void setR1CNT007_01(String r1cnt007_01) {
		R1CNT007_01 = r1cnt007_01;
	}

	public String getR1CNT007_02() {
		return R1CNT007_02;
	}

	public void setR1CNT007_02(String r1cnt007_02) {
		R1CNT007_02 = r1cnt007_02;
	}

	public String getR1CNT007_03() {
		return R1CNT007_03;
	}

	public void setR1CNT007_03(String r1cnt007_03) {
		R1CNT007_03 = r1cnt007_03;
	}

	public String getR1CNT007_04() {
		return R1CNT007_04;
	}

	public void setR1CNT007_04(String r1cnt007_04) {
		R1CNT007_04 = r1cnt007_04;
	}

	public String getR1CNT007_05() {
		return R1CNT007_05;
	}

	public void setR1CNT007_05(String r1cnt007_05) {
		R1CNT007_05 = r1cnt007_05;
	}

	public char getR4CNT015() {
		return R4CNT015;
	}

	public void setR4CNT015(char r4cnt015) {
		R4CNT015 = r4cnt015;
	}

	public char getR4CNT016() {
		return R4CNT016;
	}

	public void setR4CNT016(char r4cnt016) {
		R4CNT016 = r4cnt016;
	}

	public int getR1CNT008() {
		return R1CNT008;
	}

	public void setR1CNT008(int r1cnt008) {
		R1CNT008 = r1cnt008;
	}

	public String getR1CNT009_03() {
		return R1CNT009_03;
	}

	public void setR1CNT009_03(String r1cnt009_03) {
		R1CNT009_03 = r1cnt009_03;
	}

	public String getR1CNT009_04() {
		return R1CNT009_04;
	}

	public void setR1CNT009_04(String r1cnt009_04) {
		R1CNT009_04 = r1cnt009_04;
	}

	public String getR1CNT009_05() {
		return R1CNT009_05;
	}

	public void setR1CNT009_05(String r1cnt009_05) {
		R1CNT009_05 = r1cnt009_05;
	}

	public String getR1CNT009_06() {
		return R1CNT009_06;
	}

	public void setR1CNT009_06(String r1cnt009_06) {
		R1CNT009_06 = r1cnt009_06;
	}

	public String getR1CNT009_07() {
		return R1CNT009_07;
	}

	public void setR1CNT009_07(String r1cnt009_07) {
		R1CNT009_07 = r1cnt009_07;
	}

	public String getR1CNT009_08() {
		return R1CNT009_08;
	}

	public void setR1CNT009_08(String r1cnt009_08) {
		R1CNT009_08 = r1cnt009_08;
	}

	public String getR1CNT011() {
		return R1CNT011;
	}

	public void setR1CNT011(String r1cnt011) {
		R1CNT011 = r1cnt011;
	}

	public String getR1CNT091() {
		return R1CNT091;
	}

	public void setR1CNT091(String r1cnt091) {
		R1CNT091 = r1cnt091;
	}

	public String getR1CNT093() {
		return R1CNT093;
	}

	public void setR1CNT093(String r1cnt093) {
		R1CNT093 = r1cnt093;
	}

	public String getRSCNT026() {
		return RSCNT026;
	}

	public void setRSCNT026(String rSCNT026) {
		RSCNT026 = rSCNT026;
	}

	public String getR4CNT002() {
		return R4CNT002;
	}

	public void setR4CNT002(String r4cnt002) {
		R4CNT002 = r4cnt002;
	}

	public String getR4CNT003() {
		return R4CNT003;
	}

	public void setR4CNT003(String r4cnt003) {
		R4CNT003 = r4cnt003;
	}

	public int getR4CNT004() {
		return R4CNT004;
	}

	public void setR4CNT004(int r4cnt004) {
		R4CNT004 = r4cnt004;
	}

	public char getR4CNT005() {
		return R4CNT005;
	}

	public void setR4CNT005(char r4cnt005) {
		R4CNT005 = r4cnt005;
	}

	public float getR4CNT006() {
		return R4CNT006;
	}

	public void setR4CNT006(float r4cnt006) {
		R4CNT006 = r4cnt006;
	}

	public int getR4CNT106() {
		return R4CNT106;
	}

	public void setR4CNT106(int r4cnt106) {
		R4CNT106 = r4cnt106;
	}

	public char getR4CNT007() {
		return R4CNT007;
	}

	public void setR4CNT007(char r4cnt007) {
		R4CNT007 = r4cnt007;
	}

	public float getR4CNT008() {
		return R4CNT008;
	}

	public void setR4CNT008(float r4cnt008) {
		R4CNT008 = r4cnt008;
	}

	public int getR4CNT108() {
		return R4CNT108;
	}

	public void setR4CNT108(int r4cnt108) {
		R4CNT108 = r4cnt108;
	}

	public char getR4CNT009() {
		return R4CNT009;
	}

	public void setR4CNT009(char r4cnt009) {
		R4CNT009 = r4cnt009;
	}

	public char getR4CNT010() {
		return R4CNT010;
	}

	public void setR4CNT010(char r4cnt010) {
		R4CNT010 = r4cnt010;
	}

	public char getR4CNT011() {
		return R4CNT011;
	}

	public void setR4CNT011(char r4cnt011) {
		R4CNT011 = r4cnt011;
	}

	public Calendar getR4CNT012() {
		return R4CNT012;
	}

	public void setR4CNT012(Calendar r4cnt012) {
		R4CNT012 = r4cnt012;
	}

	public int getR4CNT013_01() {
		return R4CNT013_01;
	}

	public void setR4CNT013_01(int r4cnt013_01) {
		R4CNT013_01 = r4cnt013_01;
	}

	public int getR4CNT013_02() {
		return R4CNT013_02;
	}

	public void setR4CNT013_02(int r4cnt013_02) {
		R4CNT013_02 = r4cnt013_02;
	}

	public int getR4CNT013_03() {
		return R4CNT013_03;
	}

	public void setR4CNT013_03(int r4cnt013_03) {
		R4CNT013_03 = r4cnt013_03;
	}

	public int getR4CNT013_04() {
		return R4CNT013_04;
	}

	public void setR4CNT013_04(int r4cnt013_04) {
		R4CNT013_04 = r4cnt013_04;
	}

	public char getR4CNT014() {
		return R4CNT014;
	}

	public void setR4CNT014(char r4cnt014) {
		R4CNT014 = r4cnt014;
	}

	public int getR4CNT017() {
		return R4CNT017;
	}

	public void setR4CNT017(int r4cnt017) {
		R4CNT017 = r4cnt017;
	}

	public String getR4CNT018() {
		return R4CNT018;
	}

	public void setR4CNT018(String r4cnt018) {
		R4CNT018 = r4cnt018;
	}

	public char getR4CNT019() {
		return R4CNT019;
	}

	public void setR4CNT019(char r4cnt019) {
		R4CNT019 = r4cnt019;
	}

	public String getR4CNT030() {
		return R4CNT030;
	}

	public void setR4CNT030(String r4cnt030) {
		R4CNT030 = r4cnt030;
	}

	public String getR4CNT031() {
		return R4CNT031;
	}

	public void setR4CNT031(String r4cnt031) {
		R4CNT031 = r4cnt031;
	}

	public String getR4CNT032() {
		return R4CNT032;
	}

	public void setR4CNT032(String r4cnt032) {
		R4CNT032 = r4cnt032;
	}

	public char getR4CNT041() {
		return R4CNT041;
	}

	public void setR4CNT041(char r4cnt041) {
		R4CNT041 = r4cnt041;
	}

	public char getR4CNT042() {
		return R4CNT042;
	}

	public void setR4CNT042(char r4cnt042) {
		R4CNT042 = r4cnt042;
	}

	public char getR4CNT043() {
		return R4CNT043;
	}

	public void setR4CNT043(char r4cnt043) {
		R4CNT043 = r4cnt043;
	}

	public char getR4CNT044() {
		return R4CNT044;
	}

	public void setR4CNT044(char r4cnt044) {
		R4CNT044 = r4cnt044;
	}

	public char getR4CNT045() {
		return R4CNT045;
	}

	public void setR4CNT045(char r4cnt045) {
		R4CNT045 = r4cnt045;
	}

	public char getR4CNT046() {
		return R4CNT046;
	}

	public void setR4CNT046(char r4cnt046) {
		R4CNT046 = r4cnt046;
	}

	public char getR4CNT047() {
		return R4CNT047;
	}

	public void setR4CNT047(char r4cnt047) {
		R4CNT047 = r4cnt047;
	}

	public char getR4CNT048() {
		return R4CNT048;
	}

	public void setR4CNT048(char r4cnt048) {
		R4CNT048 = r4cnt048;
	}

	public char getR4CNT049() {
		return R4CNT049;
	}

	public void setR4CNT049(char r4cnt049) {
		R4CNT049 = r4cnt049;
	}

	public char getR4CNT050() {
		return R4CNT050;
	}

	public void setR4CNT050(char r4cnt050) {
		R4CNT050 = r4cnt050;
	}

	public char getR4CNT051() {
		return R4CNT051;
	}

	public void setR4CNT051(char r4cnt051) {
		R4CNT051 = r4cnt051;
	}

	public char getR4CNT701() {
		return R4CNT701;
	}

	public void setR4CNT701(char r4cnt701) {
		R4CNT701 = r4cnt701;
	}

	public char getR4CNT702() {
		return R4CNT702;
	}

	public void setR4CNT702(char r4cnt702) {
		R4CNT702 = r4cnt702;
	}

	public char getR4CNT703() {
		return R4CNT703;
	}

	public void setR4CNT703(char r4cnt703) {
		R4CNT703 = r4cnt703;
	}

	public int getR4CNT704() {
		return R4CNT704;
	}

	public void setR4CNT704(int r4cnt704) {
		R4CNT704 = r4cnt704;
	}

	public Calendar getR4CNT705() {
		return R4CNT705;
	}

	public void setR4CNT705(Calendar r4cnt705) {
		R4CNT705 = r4cnt705;
	}

	public int getR4CNT706() {
		return R4CNT706;
	}

	public void setR4CNT706(int r4cnt706) {
		R4CNT706 = r4cnt706;
	}

	public int getR4CNT707() {
		return R4CNT707;
	}

	public void setR4CNT707(int r4cnt707) {
		R4CNT707 = r4cnt707;
	}

	public float getR4CNT021_01() {
		return R4CNT021_01;
	}

	public void setR4CNT021_01(float r4cnt021_01) {
		R4CNT021_01 = r4cnt021_01;
	}

	public String getR4CNT022_01() {
		return R4CNT022_01;
	}

	public void setR4CNT022_01(String r4cnt022_01) {
		R4CNT022_01 = r4cnt022_01;
	}

	public float getR4CNT021_02() {
		return R4CNT021_02;
	}

	public void setR4CNT021_02(float r4cnt021_02) {
		R4CNT021_02 = r4cnt021_02;
	}

	public String getR4CNT022_02() {
		return R4CNT022_02;
	}

	public void setR4CNT022_02(String r4cnt022_02) {
		R4CNT022_02 = r4cnt022_02;
	}

	public float getR4CNT021_03() {
		return R4CNT021_03;
	}

	public void setR4CNT021_03(float r4cnt021_03) {
		R4CNT021_03 = r4cnt021_03;
	}

	public String getR4CNT022_03() {
		return R4CNT022_03;
	}

	public void setR4CNT022_03(String r4cnt022_03) {
		R4CNT022_03 = r4cnt022_03;
	}

	public String getR4CNT023_01() {
		return R4CNT023_01;
	}

	public void setR4CNT023_01(String r4cnt023_01) {
		R4CNT023_01 = r4cnt023_01;
	}

	public String getR4CNT023_02() {
		return R4CNT023_02;
	}

	public void setR4CNT023_02(String r4cnt023_02) {
		R4CNT023_02 = r4cnt023_02;
	}

	public String getR4CNT023_03() {
		return R4CNT023_03;
	}

	public void setR4CNT023_03(String r4cnt023_03) {
		R4CNT023_03 = r4cnt023_03;
	}

	public String getR4CNT023_04() {
		return R4CNT023_04;
	}

	public void setR4CNT023_04(String r4cnt023_04) {
		R4CNT023_04 = r4cnt023_04;
	}

	public String getR4CNT023_05() {
		return R4CNT023_05;
	}

	public void setR4CNT023_05(String r4cnt023_05) {
		R4CNT023_05 = r4cnt023_05;
	}

	public String getR4CNT023_06() {
		return R4CNT023_06;
	}

	public void setR4CNT023_06(String r4cnt023_06) {
		R4CNT023_06 = r4cnt023_06;
	}

	public String getR4CNT023_07() {
		return R4CNT023_07;
	}

	public void setR4CNT023_07(String r4cnt023_07) {
		R4CNT023_07 = r4cnt023_07;
	}

	public String getR4CNT023_08() {
		return R4CNT023_08;
	}

	public void setR4CNT023_08(String r4cnt023_08) {
		R4CNT023_08 = r4cnt023_08;
	}

	public String getR4CNT023_09() {
		return R4CNT023_09;
	}

	public void setR4CNT023_09(String r4cnt023_09) {
		R4CNT023_09 = r4cnt023_09;
	}

	public String getR4CNT023_10() {
		return R4CNT023_10;
	}

	public void setR4CNT023_10(String r4cnt023_10) {
		R4CNT023_10 = r4cnt023_10;
	}

	public String getR4CNT023_11() {
		return R4CNT023_11;
	}

	public void setR4CNT023_11(String r4cnt023_11) {
		R4CNT023_11 = r4cnt023_11;
	}

	public String getR4CNT023_12() {
		return R4CNT023_12;
	}

	public void setR4CNT023_12(String r4cnt023_12) {
		R4CNT023_12 = r4cnt023_12;
	}

	public String getR4CNT023_13() {
		return R4CNT023_13;
	}

	public void setR4CNT023_13(String r4cnt023_13) {
		R4CNT023_13 = r4cnt023_13;
	}

	public String getR4CNT023_14() {
		return R4CNT023_14;
	}

	public void setR4CNT023_14(String r4cnt023_14) {
		R4CNT023_14 = r4cnt023_14;
	}

	public char getR4CNT101() {
		return R4CNT101;
	}

	public void setR4CNT101(char r4cnt101) {
		R4CNT101 = r4cnt101;
	}

	public float getR4CNT102() {
		return R4CNT102;
	}

	public void setR4CNT102(float r4cnt102) {
		R4CNT102 = r4cnt102;
	}

	public String getR4CNT201() {
		return R4CNT201;
	}

	public void setR4CNT201(String r4cnt201) {
		R4CNT201 = r4cnt201;
	}

	public String getR4CNT202() {
		return R4CNT202;
	}

	public void setR4CNT202(String r4cnt202) {
		R4CNT202 = r4cnt202;
	}

	public String getR4CNT203() {
		return R4CNT203;
	}

	public void setR4CNT203(String r4cnt203) {
		R4CNT203 = r4cnt203;
	}

	public String getR4CNT204() {
		return R4CNT204;
	}

	public void setR4CNT204(String r4cnt204) {
		R4CNT204 = r4cnt204;
	}

	public String getR4CNT205() {
		return R4CNT205;
	}

	public void setR4CNT205(String r4cnt205) {
		R4CNT205 = r4cnt205;
	}

	public String getR4CNT222() {
		return R4CNT222;
	}

	public void setR4CNT222(String r4cnt222) {
		R4CNT222 = r4cnt222;
	}

	public String getR4CNT223() {
		return R4CNT223;
	}

	public void setR4CNT223(String r4cnt223) {
		R4CNT223 = r4cnt223;
	}

	public String getR4CNT224() {
		return R4CNT224;
	}

	public void setR4CNT224(String r4cnt224) {
		R4CNT224 = r4cnt224;
	}

	public String getR4CNT225() {
		return R4CNT225;
	}

	public void setR4CNT225(String r4cnt225) {
		R4CNT225 = r4cnt225;
	}

	public char getR4CNT347() {
		return R4CNT347;
	}

	public void setR4CNT347(char r4cnt347) {
		R4CNT347 = r4cnt347;
	}

	public String getR4CNT348() {
		return R4CNT348;
	}

	public void setR4CNT348(String r4cnt348) {
		R4CNT348 = r4cnt348;
	}

	public char getR4CNT349() {
		return R4CNT349;
	}

	public void setR4CNT349(char r4cnt349) {
		R4CNT349 = r4cnt349;
	}

	public String getR4CNT350() {
		return R4CNT350;
	}

	public void setR4CNT350(String r4cnt350) {
		R4CNT350 = r4cnt350;
	}

	public int getR4CNT351() {
		return R4CNT351;
	}

	public void setR4CNT351(int r4cnt351) {
		R4CNT351 = r4cnt351;
	}

	public char getR4CNT352() {
		return R4CNT352;
	}

	public void setR4CNT352(char r4cnt352) {
		R4CNT352 = r4cnt352;
	}

	public String getR4CNT353() {
		return R4CNT353;
	}

	public void setR4CNT353(String r4cnt353) {
		R4CNT353 = r4cnt353;
	}

	public float getR4CNT354() {
		return R4CNT354;
	}

	public void setR4CNT354(float r4cnt354) {
		R4CNT354 = r4cnt354;
	}

	public char getR4CNT355() {
		return R4CNT355;
	}

	public void setR4CNT355(char r4cnt355) {
		R4CNT355 = r4cnt355;
	}

	public String getR4CNT356() {
		return R4CNT356;
	}

	public void setR4CNT356(String r4cnt356) {
		R4CNT356 = r4cnt356;
	}

	public float getR4CNT357() {
		return R4CNT357;
	}

	public void setR4CNT357(float r4cnt357) {
		R4CNT357 = r4cnt357;
	}

	public String getR4CNT358() {
		return R4CNT358;
	}

	public void setR4CNT358(String r4cnt358) {
		R4CNT358 = r4cnt358;
	}

	public String getR4CNT359() {
		return R4CNT359;
	}

	public void setR4CNT359(String r4cnt359) {
		R4CNT359 = r4cnt359;
	}

	public char getR4CNT024() {
		return R4CNT024;
	}

	public void setR4CNT024(char r4cnt024) {
		R4CNT024 = r4cnt024;
	}

	public String getR5CNT002_01() {
		return R5CNT002_01;
	}

	public void setR5CNT002_01(String r5cnt002_01) {
		R5CNT002_01 = r5cnt002_01;
	}

	public String getR5CNT002_02() {
		return R5CNT002_02;
	}

	public void setR5CNT002_02(String r5cnt002_02) {
		R5CNT002_02 = r5cnt002_02;
	}

	public String getR5CNT002_03() {
		return R5CNT002_03;
	}

	public void setR5CNT002_03(String r5cnt002_03) {
		R5CNT002_03 = r5cnt002_03;
	}

	public String getR5CNT002_04() {
		return R5CNT002_04;
	}

	public void setR5CNT002_04(String r5cnt002_04) {
		R5CNT002_04 = r5cnt002_04;
	}

	public String getR5CNT003_01() {
		return R5CNT003_01;
	}

	public void setR5CNT003_01(String r5cnt003_01) {
		R5CNT003_01 = r5cnt003_01;
	}

	public String getR5CNT003_02() {
		return R5CNT003_02;
	}

	public void setR5CNT003_02(String r5cnt003_02) {
		R5CNT003_02 = r5cnt003_02;
	}

	public String getR5CNT003_03() {
		return R5CNT003_03;
	}

	public void setR5CNT003_03(String r5cnt003_03) {
		R5CNT003_03 = r5cnt003_03;
	}

	public String getR5CNT003_04() {
		return R5CNT003_04;
	}

	public void setR5CNT003_04(String r5cnt003_04) {
		R5CNT003_04 = r5cnt003_04;
	}

	public String getR4CNT025() {
		return R4CNT025;
	}

	public void setR4CNT025(String r4cnt025) {
		R4CNT025 = r4cnt025;
	}

	public String getR4CNT026() {
		return R4CNT026;
	}

	public void setR4CNT026(String r4cnt026) {
		R4CNT026 = r4cnt026;
	}

	public String getR4CNT027() {
		return R4CNT027;
	}

	public void setR4CNT027(String r4cnt027) {
		R4CNT027 = r4cnt027;
	}

	public String getR4CNT028() {
		return R4CNT028;
	}

	public void setR4CNT028(String r4cnt028) {
		R4CNT028 = r4cnt028;
	}

	public String getR4CNT303() {
		return R4CNT303;
	}

	public void setR4CNT303(String r4cnt303) {
		R4CNT303 = r4cnt303;
	}

	public String getR4CNT304() {
		return R4CNT304;
	}

	public void setR4CNT304(String r4cnt304) {
		R4CNT304 = r4cnt304;
	}

	public String getR4CNT305() {
		return R4CNT305;
	}

	public void setR4CNT305(String r4cnt305) {
		R4CNT305 = r4cnt305;
	}

	public String getR4CNT306() {
		return R4CNT306;
	}

	public void setR4CNT306(String r4cnt306) {
		R4CNT306 = r4cnt306;
	}

	public String getRXCNT002() {
		return RXCNT002;
	}

	public void setRXCNT002(String rXCNT002) {
		RXCNT002 = rXCNT002;
	}

	public String getRXCNT003() {
		return RXCNT003;
	}

	public void setRXCNT003(String rXCNT003) {
		RXCNT003 = rXCNT003;
	}

	public String getRXCNT004() {
		return RXCNT004;
	}

	public void setRXCNT004(String rXCNT004) {
		RXCNT004 = rXCNT004;
	}

	public String getRXCNT005() {
		return RXCNT005;
	}

	public void setRXCNT005(String rXCNT005) {
		RXCNT005 = rXCNT005;
	}

	public String getRSCNT003() {
		return RSCNT003;
	}

	public void setRSCNT003(String rSCNT003) {
		RSCNT003 = rSCNT003;
	}

	public String getRSCNT303() {
		return RSCNT303;
	}

	public void setRSCNT303(String rSCNT303) {
		RSCNT303 = rSCNT303;
	}

	public String getRSCNT004() {
		return RSCNT004;
	}

	public void setRSCNT004(String rSCNT004) {
		RSCNT004 = rSCNT004;
	}

	public String getRSCNT304() {
		return RSCNT304;
	}

	public void setRSCNT304(String rSCNT304) {
		RSCNT304 = rSCNT304;
	}

	public String getRSCNT005() {
		return RSCNT005;
	}

	public void setRSCNT005(String rSCNT005) {
		RSCNT005 = rSCNT005;
	}

	public String getRSCNT006() {
		return RSCNT006;
	}

	public void setRSCNT006(String rSCNT006) {
		RSCNT006 = rSCNT006;
	}

	public String getRSCNT007() {
		return RSCNT007;
	}

	public void setRSCNT007(String rSCNT007) {
		RSCNT007 = rSCNT007;
	}

	public String getRSCNT008() {
		return RSCNT008;
	}

	public void setRSCNT008(String rSCNT008) {
		RSCNT008 = rSCNT008;
	}

	public String getRSCNT009() {
		return RSCNT009;
	}

	public void setRSCNT009(String rSCNT009) {
		RSCNT009 = rSCNT009;
	}

	public String getRSCNT010() {
		return RSCNT010;
	}

	public void setRSCNT010(String rSCNT010) {
		RSCNT010 = rSCNT010;
	}

	public String getRSCNT011() {
		return RSCNT011;
	}

	public void setRSCNT011(String rSCNT011) {
		RSCNT011 = rSCNT011;
	}

	public int getRSCNT012() {
		return RSCNT012;
	}

	public void setRSCNT012(int rSCNT012) {
		RSCNT012 = rSCNT012;
	}

	public int getRSCNT013() {
		return RSCNT013;
	}

	public void setRSCNT013(int rSCNT013) {
		RSCNT013 = rSCNT013;
	}

	public int getRSCNT014() {
		return RSCNT014;
	}

	public void setRSCNT014(int rSCNT014) {
		RSCNT014 = rSCNT014;
	}

	public String getRSCNT016() {
		return RSCNT016;
	}

	public void setRSCNT016(String rSCNT016) {
		RSCNT016 = rSCNT016;
	}

	public String getRSCNT018_01() {
		return RSCNT018_01;
	}

	public void setRSCNT018_01(String rSCNT018_01) {
		RSCNT018_01 = rSCNT018_01;
	}

	public String getRSCNT019_01() {
		return RSCNT019_01;
	}

	public void setRSCNT019_01(String rSCNT019_01) {
		RSCNT019_01 = rSCNT019_01;
	}

	public String getRSCNT018_02() {
		return RSCNT018_02;
	}

	public void setRSCNT018_02(String rSCNT018_02) {
		RSCNT018_02 = rSCNT018_02;
	}

	public String getRSCNT019_02() {
		return RSCNT019_02;
	}

	public void setRSCNT019_02(String rSCNT019_02) {
		RSCNT019_02 = rSCNT019_02;
	}

	public String getRSCNT018_03() {
		return RSCNT018_03;
	}

	public void setRSCNT018_03(String rSCNT018_03) {
		RSCNT018_03 = rSCNT018_03;
	}

	public String getRSCNT019_03() {
		return RSCNT019_03;
	}

	public void setRSCNT019_03(String rSCNT019_03) {
		RSCNT019_03 = rSCNT019_03;
	}

	public String getRSCNT018_04() {
		return RSCNT018_04;
	}

	public void setRSCNT018_04(String rSCNT018_04) {
		RSCNT018_04 = rSCNT018_04;
	}

	public String getRSCNT019_04() {
		return RSCNT019_04;
	}

	public void setRSCNT019_04(String rSCNT019_04) {
		RSCNT019_04 = rSCNT019_04;
	}

	public String getRSCNT020_01() {
		return RSCNT020_01;
	}

	public void setRSCNT020_01(String rSCNT020_01) {
		RSCNT020_01 = rSCNT020_01;
	}

	public int getRSCNT021_01() {
		return RSCNT021_01;
	}

	public void setRSCNT021_01(int rSCNT021_01) {
		RSCNT021_01 = rSCNT021_01;
	}

	public int getRSCNT022_01() {
		return RSCNT022_01;
	}

	public void setRSCNT022_01(int rSCNT022_01) {
		RSCNT022_01 = rSCNT022_01;
	}

	public String getRSCNT020_02() {
		return RSCNT020_02;
	}

	public void setRSCNT020_02(String rSCNT020_02) {
		RSCNT020_02 = rSCNT020_02;
	}

	public int getRSCNT021_02() {
		return RSCNT021_02;
	}

	public void setRSCNT021_02(int rSCNT021_02) {
		RSCNT021_02 = rSCNT021_02;
	}

	public int getRSCNT022_02() {
		return RSCNT022_02;
	}

	public void setRSCNT022_02(int rSCNT022_02) {
		RSCNT022_02 = rSCNT022_02;
	}

	public String getRSCNT020_03() {
		return RSCNT020_03;
	}

	public void setRSCNT020_03(String rSCNT020_03) {
		RSCNT020_03 = rSCNT020_03;
	}

	public int getRSCNT021_03() {
		return RSCNT021_03;
	}

	public void setRSCNT021_03(int rSCNT021_03) {
		RSCNT021_03 = rSCNT021_03;
	}

	public int getRSCNT022_03() {
		return RSCNT022_03;
	}

	public void setRSCNT022_03(int rSCNT022_03) {
		RSCNT022_03 = rSCNT022_03;
	}

	public String getRSCNT020_04() {
		return RSCNT020_04;
	}

	public void setRSCNT020_04(String rSCNT020_04) {
		RSCNT020_04 = rSCNT020_04;
	}

	public int getRSCNT021_04() {
		return RSCNT021_04;
	}

	public void setRSCNT021_04(int rSCNT021_04) {
		RSCNT021_04 = rSCNT021_04;
	}

	public int getRSCNT022_04() {
		return RSCNT022_04;
	}

	public void setRSCNT022_04(int rSCNT022_04) {
		RSCNT022_04 = rSCNT022_04;
	}

	public String getRSCNT020_05() {
		return RSCNT020_05;
	}

	public void setRSCNT020_05(String rSCNT020_05) {
		RSCNT020_05 = rSCNT020_05;
	}

	public int getRSCNT021_05() {
		return RSCNT021_05;
	}

	public void setRSCNT021_05(int rSCNT021_05) {
		RSCNT021_05 = rSCNT021_05;
	}

	public int getRSCNT022_05() {
		return RSCNT022_05;
	}

	public void setRSCNT022_05(int rSCNT022_05) {
		RSCNT022_05 = rSCNT022_05;
	}

	public String getRSCNT020_06() {
		return RSCNT020_06;
	}

	public void setRSCNT020_06(String rSCNT020_06) {
		RSCNT020_06 = rSCNT020_06;
	}

	public int getRSCNT021_06() {
		return RSCNT021_06;
	}

	public void setRSCNT021_06(int rSCNT021_06) {
		RSCNT021_06 = rSCNT021_06;
	}

	public int getRSCNT022_06() {
		return RSCNT022_06;
	}

	public void setRSCNT022_06(int rSCNT022_06) {
		RSCNT022_06 = rSCNT022_06;
	}

	public String getRSCNT020_07() {
		return RSCNT020_07;
	}

	public void setRSCNT020_07(String rSCNT020_07) {
		RSCNT020_07 = rSCNT020_07;
	}

	public int getRSCNT021_07() {
		return RSCNT021_07;
	}

	public void setRSCNT021_07(int rSCNT021_07) {
		RSCNT021_07 = rSCNT021_07;
	}

	public int getRSCNT022_07() {
		return RSCNT022_07;
	}

	public void setRSCNT022_07(int rSCNT022_07) {
		RSCNT022_07 = rSCNT022_07;
	}

	public String getRSCNT025() {
		return RSCNT025;
	}

	public void setRSCNT025(String rSCNT025) {
		RSCNT025 = rSCNT025;
	}

	public int getRSCNT028() {
		return RSCNT028;
	}

	public void setRSCNT028(int rSCNT028) {
		RSCNT028 = rSCNT028;
	}

	public String getRSCNT029() {
		return RSCNT029;
	}

	public void setRSCNT029(String rSCNT029) {
		RSCNT029 = rSCNT029;
	}

	public String getRSCNT030() {
		return RSCNT030;
	}

	public void setRSCNT030(String rSCNT030) {
		RSCNT030 = rSCNT030;
	}

	public String getRSCNT031() {
		return RSCNT031;
	}

	public void setRSCNT031(String rSCNT031) {
		RSCNT031 = rSCNT031;
	}

	public String getRSCNT032() {
		return RSCNT032;
	}

	public void setRSCNT032(String rSCNT032) {
		RSCNT032 = rSCNT032;
	}

	public String getRSCNT033() {
		return RSCNT033;
	}

	public void setRSCNT033(String rSCNT033) {
		RSCNT033 = rSCNT033;
	}

	public String getRSCNT034() {
		return RSCNT034;
	}

	public void setRSCNT034(String rSCNT034) {
		RSCNT034 = rSCNT034;
	}

	public String getRSCNT035() {
		return RSCNT035;
	}

	public void setRSCNT035(String rSCNT035) {
		RSCNT035 = rSCNT035;
	}

	public String getRSCNT101() {
		return RSCNT101;
	}

	public void setRSCNT101(String rSCNT101) {
		RSCNT101 = rSCNT101;
	}

	public int getRSCNT102() {
		return RSCNT102;
	}

	public void setRSCNT102(int rSCNT102) {
		RSCNT102 = rSCNT102;
	}

	public int getRSCNT103() {
		return RSCNT103;
	}

	public void setRSCNT103(int rSCNT103) {
		RSCNT103 = rSCNT103;
	}

	public String getRSCNT104() {
		return RSCNT104;
	}

	public void setRSCNT104(String rSCNT104) {
		RSCNT104 = rSCNT104;
	}

	public String getRSCNT105() {
		return RSCNT105;
	}

	public void setRSCNT105(String rSCNT105) {
		RSCNT105 = rSCNT105;
	}

	public int getRSCNT106() {
		return RSCNT106;
	}

	public void setRSCNT106(int rSCNT106) {
		RSCNT106 = rSCNT106;
	}

	public int getRSCNT107() {
		return RSCNT107;
	}

	public void setRSCNT107(int rSCNT107) {
		RSCNT107 = rSCNT107;
	}

	public String getRSCNT108() {
		return RSCNT108;
	}

	public void setRSCNT108(String rSCNT108) {
		RSCNT108 = rSCNT108;
	}

	public String getRSCNT109() {
		return RSCNT109;
	}

	public void setRSCNT109(String rSCNT109) {
		RSCNT109 = rSCNT109;
	}

	public int getRSCNT110() {
		return RSCNT110;
	}

	public void setRSCNT110(int rSCNT110) {
		RSCNT110 = rSCNT110;
	}

	public int getRSCNT111() {
		return RSCNT111;
	}

	public void setRSCNT111(int rSCNT111) {
		RSCNT111 = rSCNT111;
	}

	public String getRSCNT112() {
		return RSCNT112;
	}

	public void setRSCNT112(String rSCNT112) {
		RSCNT112 = rSCNT112;
	}

	public String getRSCNT201() {
		return RSCNT201;
	}

	public void setRSCNT201(String rSCNT201) {
		RSCNT201 = rSCNT201;
	}

	public int getRSCNT202() {
		return RSCNT202;
	}

	public void setRSCNT202(int rSCNT202) {
		RSCNT202 = rSCNT202;
	}

	public int getRSCNT203() {
		return RSCNT203;
	}

	public void setRSCNT203(int rSCNT203) {
		RSCNT203 = rSCNT203;
	}

	public int getRSCNT204() {
		return RSCNT204;
	}

	public void setRSCNT204(int rSCNT204) {
		RSCNT204 = rSCNT204;
	}

	public String getRSCNT205() {
		return RSCNT205;
	}

	public void setRSCNT205(String rSCNT205) {
		RSCNT205 = rSCNT205;
	}

	public int getRSCNT206() {
		return RSCNT206;
	}

	public void setRSCNT206(int rSCNT206) {
		RSCNT206 = rSCNT206;
	}

	public int getRSCNT207() {
		return RSCNT207;
	}

	public void setRSCNT207(int rSCNT207) {
		RSCNT207 = rSCNT207;
	}

	public String getRSCNT208() {
		return RSCNT208;
	}

	public void setRSCNT208(String rSCNT208) {
		RSCNT208 = rSCNT208;
	}

	public String getRSCNT209() {
		return RSCNT209;
	}

	public void setRSCNT209(String rSCNT209) {
		RSCNT209 = rSCNT209;
	}

	public int getRSCNT210() {
		return RSCNT210;
	}

	public void setRSCNT210(int rSCNT210) {
		RSCNT210 = rSCNT210;
	}

	public int getRSCNT211() {
		return RSCNT211;
	}

	public void setRSCNT211(int rSCNT211) {
		RSCNT211 = rSCNT211;
	}

	public String getRSCNT212() {
		return RSCNT212;
	}

	public void setRSCNT212(String rSCNT212) {
		RSCNT212 = rSCNT212;
	}

	public String getR2CNT002_01() {
		return R2CNT002_01;
	}

	public void setR2CNT002_01(String r2cnt002_01) {
		R2CNT002_01 = r2cnt002_01;
	}

	public int getR2CNT003_01_01() {
		return R2CNT003_01_01;
	}

	public void setR2CNT003_01_01(int r2cnt003_01_01) {
		R2CNT003_01_01 = r2cnt003_01_01;
	}

	public int getR2CNT003_01_02() {
		return R2CNT003_01_02;
	}

	public void setR2CNT003_01_02(int r2cnt003_01_02) {
		R2CNT003_01_02 = r2cnt003_01_02;
	}

	public int getR2CNT003_01_03() {
		return R2CNT003_01_03;
	}

	public void setR2CNT003_01_03(int r2cnt003_01_03) {
		R2CNT003_01_03 = r2cnt003_01_03;
	}

	public int getR2CNT003_01_04() {
		return R2CNT003_01_04;
	}

	public void setR2CNT003_01_04(int r2cnt003_01_04) {
		R2CNT003_01_04 = r2cnt003_01_04;
	}

	public int getR2CNT003_01_05() {
		return R2CNT003_01_05;
	}

	public void setR2CNT003_01_05(int r2cnt003_01_05) {
		R2CNT003_01_05 = r2cnt003_01_05;
	}

	public int getR2CNT003_01_06() {
		return R2CNT003_01_06;
	}

	public void setR2CNT003_01_06(int r2cnt003_01_06) {
		R2CNT003_01_06 = r2cnt003_01_06;
	}

	public int getR2CNT003_01_07() {
		return R2CNT003_01_07;
	}

	public void setR2CNT003_01_07(int r2cnt003_01_07) {
		R2CNT003_01_07 = r2cnt003_01_07;
	}

	public int getR2CNT004_01_01() {
		return R2CNT004_01_01;
	}

	public void setR2CNT004_01_01(int r2cnt004_01_01) {
		R2CNT004_01_01 = r2cnt004_01_01;
	}

	public int getR2CNT004_01_02() {
		return R2CNT004_01_02;
	}

	public void setR2CNT004_01_02(int r2cnt004_01_02) {
		R2CNT004_01_02 = r2cnt004_01_02;
	}

	public int getR2CNT004_01_03() {
		return R2CNT004_01_03;
	}

	public void setR2CNT004_01_03(int r2cnt004_01_03) {
		R2CNT004_01_03 = r2cnt004_01_03;
	}

	public int getR2CNT004_01_04() {
		return R2CNT004_01_04;
	}

	public void setR2CNT004_01_04(int r2cnt004_01_04) {
		R2CNT004_01_04 = r2cnt004_01_04;
	}

	public int getR2CNT004_01_05() {
		return R2CNT004_01_05;
	}

	public void setR2CNT004_01_05(int r2cnt004_01_05) {
		R2CNT004_01_05 = r2cnt004_01_05;
	}

	public int getR2CNT004_01_06() {
		return R2CNT004_01_06;
	}

	public void setR2CNT004_01_06(int r2cnt004_01_06) {
		R2CNT004_01_06 = r2cnt004_01_06;
	}

	public int getR2CNT004_01_07() {
		return R2CNT004_01_07;
	}

	public void setR2CNT004_01_07(int r2cnt004_01_07) {
		R2CNT004_01_07 = r2cnt004_01_07;
	}

	public int getR2CNT005_01_01() {
		return R2CNT005_01_01;
	}

	public void setR2CNT005_01_01(int r2cnt005_01_01) {
		R2CNT005_01_01 = r2cnt005_01_01;
	}

	public int getR2CNT005_01_02() {
		return R2CNT005_01_02;
	}

	public void setR2CNT005_01_02(int r2cnt005_01_02) {
		R2CNT005_01_02 = r2cnt005_01_02;
	}

	public int getR2CNT005_01_03() {
		return R2CNT005_01_03;
	}

	public void setR2CNT005_01_03(int r2cnt005_01_03) {
		R2CNT005_01_03 = r2cnt005_01_03;
	}

	public int getR2CNT005_01_04() {
		return R2CNT005_01_04;
	}

	public void setR2CNT005_01_04(int r2cnt005_01_04) {
		R2CNT005_01_04 = r2cnt005_01_04;
	}

	public int getR2CNT005_01_05() {
		return R2CNT005_01_05;
	}

	public void setR2CNT005_01_05(int r2cnt005_01_05) {
		R2CNT005_01_05 = r2cnt005_01_05;
	}

	public int getR2CNT005_01_06() {
		return R2CNT005_01_06;
	}

	public void setR2CNT005_01_06(int r2cnt005_01_06) {
		R2CNT005_01_06 = r2cnt005_01_06;
	}

	public int getR2CNT005_01_07() {
		return R2CNT005_01_07;
	}

	public void setR2CNT005_01_07(int r2cnt005_01_07) {
		R2CNT005_01_07 = r2cnt005_01_07;
	}

	public int getR2CNT015_01_01() {
		return R2CNT015_01_01;
	}

	public void setR2CNT015_01_01(int r2cnt015_01_01) {
		R2CNT015_01_01 = r2cnt015_01_01;
	}

	public int getR2CNT015_01_02() {
		return R2CNT015_01_02;
	}

	public void setR2CNT015_01_02(int r2cnt015_01_02) {
		R2CNT015_01_02 = r2cnt015_01_02;
	}

	public int getR2CNT015_01_03() {
		return R2CNT015_01_03;
	}

	public void setR2CNT015_01_03(int r2cnt015_01_03) {
		R2CNT015_01_03 = r2cnt015_01_03;
	}

	public int getR2CNT015_01_04() {
		return R2CNT015_01_04;
	}

	public void setR2CNT015_01_04(int r2cnt015_01_04) {
		R2CNT015_01_04 = r2cnt015_01_04;
	}

	public int getR2CNT015_01_05() {
		return R2CNT015_01_05;
	}

	public void setR2CNT015_01_05(int r2cnt015_01_05) {
		R2CNT015_01_05 = r2cnt015_01_05;
	}

	public int getR2CNT015_01_06() {
		return R2CNT015_01_06;
	}

	public void setR2CNT015_01_06(int r2cnt015_01_06) {
		R2CNT015_01_06 = r2cnt015_01_06;
	}

	public int getR2CNT015_01_07() {
		return R2CNT015_01_07;
	}

	public void setR2CNT015_01_07(int r2cnt015_01_07) {
		R2CNT015_01_07 = r2cnt015_01_07;
	}

	public int getR2CNT006_01_01() {
		return R2CNT006_01_01;
	}

	public void setR2CNT006_01_01(int r2cnt006_01_01) {
		R2CNT006_01_01 = r2cnt006_01_01;
	}

	public int getR2CNT006_01_02() {
		return R2CNT006_01_02;
	}

	public void setR2CNT006_01_02(int r2cnt006_01_02) {
		R2CNT006_01_02 = r2cnt006_01_02;
	}

	public int getR2CNT006_01_03() {
		return R2CNT006_01_03;
	}

	public void setR2CNT006_01_03(int r2cnt006_01_03) {
		R2CNT006_01_03 = r2cnt006_01_03;
	}

	public int getR2CNT006_01_04() {
		return R2CNT006_01_04;
	}

	public void setR2CNT006_01_04(int r2cnt006_01_04) {
		R2CNT006_01_04 = r2cnt006_01_04;
	}

	public int getR2CNT006_01_05() {
		return R2CNT006_01_05;
	}

	public void setR2CNT006_01_05(int r2cnt006_01_05) {
		R2CNT006_01_05 = r2cnt006_01_05;
	}

	public int getR2CNT006_01_06() {
		return R2CNT006_01_06;
	}

	public void setR2CNT006_01_06(int r2cnt006_01_06) {
		R2CNT006_01_06 = r2cnt006_01_06;
	}

	public int getR2CNT006_01_07() {
		return R2CNT006_01_07;
	}

	public void setR2CNT006_01_07(int r2cnt006_01_07) {
		R2CNT006_01_07 = r2cnt006_01_07;
	}

	public int getR2CNT016_01_01() {
		return R2CNT016_01_01;
	}

	public void setR2CNT016_01_01(int r2cnt016_01_01) {
		R2CNT016_01_01 = r2cnt016_01_01;
	}

	public int getR2CNT016_01_02() {
		return R2CNT016_01_02;
	}

	public void setR2CNT016_01_02(int r2cnt016_01_02) {
		R2CNT016_01_02 = r2cnt016_01_02;
	}

	public int getR2CNT016_01_03() {
		return R2CNT016_01_03;
	}

	public void setR2CNT016_01_03(int r2cnt016_01_03) {
		R2CNT016_01_03 = r2cnt016_01_03;
	}

	public int getR2CNT016_01_04() {
		return R2CNT016_01_04;
	}

	public void setR2CNT016_01_04(int r2cnt016_01_04) {
		R2CNT016_01_04 = r2cnt016_01_04;
	}

	public int getR2CNT016_01_05() {
		return R2CNT016_01_05;
	}

	public void setR2CNT016_01_05(int r2cnt016_01_05) {
		R2CNT016_01_05 = r2cnt016_01_05;
	}

	public int getR2CNT016_01_06() {
		return R2CNT016_01_06;
	}

	public void setR2CNT016_01_06(int r2cnt016_01_06) {
		R2CNT016_01_06 = r2cnt016_01_06;
	}

	public int getR2CNT016_01_07() {
		return R2CNT016_01_07;
	}

	public void setR2CNT016_01_07(int r2cnt016_01_07) {
		R2CNT016_01_07 = r2cnt016_01_07;
	}

	public int getR2CNT013_01_01() {
		return R2CNT013_01_01;
	}

	public void setR2CNT013_01_01(int r2cnt013_01_01) {
		R2CNT013_01_01 = r2cnt013_01_01;
	}

	public int getR2CNT013_01_02() {
		return R2CNT013_01_02;
	}

	public void setR2CNT013_01_02(int r2cnt013_01_02) {
		R2CNT013_01_02 = r2cnt013_01_02;
	}

	public int getR2CNT013_01_03() {
		return R2CNT013_01_03;
	}

	public void setR2CNT013_01_03(int r2cnt013_01_03) {
		R2CNT013_01_03 = r2cnt013_01_03;
	}

	public int getR2CNT013_01_04() {
		return R2CNT013_01_04;
	}

	public void setR2CNT013_01_04(int r2cnt013_01_04) {
		R2CNT013_01_04 = r2cnt013_01_04;
	}

	public int getR2CNT013_01_05() {
		return R2CNT013_01_05;
	}

	public void setR2CNT013_01_05(int r2cnt013_01_05) {
		R2CNT013_01_05 = r2cnt013_01_05;
	}

	public int getR2CNT013_01_06() {
		return R2CNT013_01_06;
	}

	public void setR2CNT013_01_06(int r2cnt013_01_06) {
		R2CNT013_01_06 = r2cnt013_01_06;
	}

	public int getR2CNT013_01_07() {
		return R2CNT013_01_07;
	}

	public void setR2CNT013_01_07(int r2cnt013_01_07) {
		R2CNT013_01_07 = r2cnt013_01_07;
	}

	public int getR2CNT014_01_01() {
		return R2CNT014_01_01;
	}

	public void setR2CNT014_01_01(int r2cnt014_01_01) {
		R2CNT014_01_01 = r2cnt014_01_01;
	}

	public int getR2CNT014_01_02() {
		return R2CNT014_01_02;
	}

	public void setR2CNT014_01_02(int r2cnt014_01_02) {
		R2CNT014_01_02 = r2cnt014_01_02;
	}

	public int getR2CNT014_01_03() {
		return R2CNT014_01_03;
	}

	public void setR2CNT014_01_03(int r2cnt014_01_03) {
		R2CNT014_01_03 = r2cnt014_01_03;
	}

	public int getR2CNT014_01_04() {
		return R2CNT014_01_04;
	}

	public void setR2CNT014_01_04(int r2cnt014_01_04) {
		R2CNT014_01_04 = r2cnt014_01_04;
	}

	public int getR2CNT014_01_05() {
		return R2CNT014_01_05;
	}

	public void setR2CNT014_01_05(int r2cnt014_01_05) {
		R2CNT014_01_05 = r2cnt014_01_05;
	}

	public int getR2CNT014_01_06() {
		return R2CNT014_01_06;
	}

	public void setR2CNT014_01_06(int r2cnt014_01_06) {
		R2CNT014_01_06 = r2cnt014_01_06;
	}

	public int getR2CNT014_01_07() {
		return R2CNT014_01_07;
	}

	public void setR2CNT014_01_07(int r2cnt014_01_07) {
		R2CNT014_01_07 = r2cnt014_01_07;
	}

	public String getR2CNT002_02() {
		return R2CNT002_02;
	}

	public void setR2CNT002_02(String r2cnt002_02) {
		R2CNT002_02 = r2cnt002_02;
	}

	public int getR2CNT003_02_01() {
		return R2CNT003_02_01;
	}

	public void setR2CNT003_02_01(int r2cnt003_02_01) {
		R2CNT003_02_01 = r2cnt003_02_01;
	}

	public int getR2CNT003_02_02() {
		return R2CNT003_02_02;
	}

	public void setR2CNT003_02_02(int r2cnt003_02_02) {
		R2CNT003_02_02 = r2cnt003_02_02;
	}

	public int getR2CNT003_02_03() {
		return R2CNT003_02_03;
	}

	public void setR2CNT003_02_03(int r2cnt003_02_03) {
		R2CNT003_02_03 = r2cnt003_02_03;
	}

	public int getR2CNT003_02_04() {
		return R2CNT003_02_04;
	}

	public void setR2CNT003_02_04(int r2cnt003_02_04) {
		R2CNT003_02_04 = r2cnt003_02_04;
	}

	public int getR2CNT003_02_05() {
		return R2CNT003_02_05;
	}

	public void setR2CNT003_02_05(int r2cnt003_02_05) {
		R2CNT003_02_05 = r2cnt003_02_05;
	}

	public int getR2CNT003_02_06() {
		return R2CNT003_02_06;
	}

	public void setR2CNT003_02_06(int r2cnt003_02_06) {
		R2CNT003_02_06 = r2cnt003_02_06;
	}

	public int getR2CNT003_02_07() {
		return R2CNT003_02_07;
	}

	public void setR2CNT003_02_07(int r2cnt003_02_07) {
		R2CNT003_02_07 = r2cnt003_02_07;
	}

	public int getR2CNT004_02_01() {
		return R2CNT004_02_01;
	}

	public void setR2CNT004_02_01(int r2cnt004_02_01) {
		R2CNT004_02_01 = r2cnt004_02_01;
	}

	public int getR2CNT004_02_02() {
		return R2CNT004_02_02;
	}

	public void setR2CNT004_02_02(int r2cnt004_02_02) {
		R2CNT004_02_02 = r2cnt004_02_02;
	}

	public int getR2CNT004_02_03() {
		return R2CNT004_02_03;
	}

	public void setR2CNT004_02_03(int r2cnt004_02_03) {
		R2CNT004_02_03 = r2cnt004_02_03;
	}

	public int getR2CNT004_02_04() {
		return R2CNT004_02_04;
	}

	public void setR2CNT004_02_04(int r2cnt004_02_04) {
		R2CNT004_02_04 = r2cnt004_02_04;
	}

	public int getR2CNT004_02_05() {
		return R2CNT004_02_05;
	}

	public void setR2CNT004_02_05(int r2cnt004_02_05) {
		R2CNT004_02_05 = r2cnt004_02_05;
	}

	public int getR2CNT004_02_06() {
		return R2CNT004_02_06;
	}

	public void setR2CNT004_02_06(int r2cnt004_02_06) {
		R2CNT004_02_06 = r2cnt004_02_06;
	}

	public int getR2CNT004_02_07() {
		return R2CNT004_02_07;
	}

	public void setR2CNT004_02_07(int r2cnt004_02_07) {
		R2CNT004_02_07 = r2cnt004_02_07;
	}

	public int getR2CNT005_02_01() {
		return R2CNT005_02_01;
	}

	public void setR2CNT005_02_01(int r2cnt005_02_01) {
		R2CNT005_02_01 = r2cnt005_02_01;
	}

	public int getR2CNT005_02_02() {
		return R2CNT005_02_02;
	}

	public void setR2CNT005_02_02(int r2cnt005_02_02) {
		R2CNT005_02_02 = r2cnt005_02_02;
	}

	public int getR2CNT005_02_03() {
		return R2CNT005_02_03;
	}

	public void setR2CNT005_02_03(int r2cnt005_02_03) {
		R2CNT005_02_03 = r2cnt005_02_03;
	}

	public int getR2CNT005_02_04() {
		return R2CNT005_02_04;
	}

	public void setR2CNT005_02_04(int r2cnt005_02_04) {
		R2CNT005_02_04 = r2cnt005_02_04;
	}

	public int getR2CNT005_02_05() {
		return R2CNT005_02_05;
	}

	public void setR2CNT005_02_05(int r2cnt005_02_05) {
		R2CNT005_02_05 = r2cnt005_02_05;
	}

	public int getR2CNT005_02_06() {
		return R2CNT005_02_06;
	}

	public void setR2CNT005_02_06(int r2cnt005_02_06) {
		R2CNT005_02_06 = r2cnt005_02_06;
	}

	public int getR2CNT005_02_07() {
		return R2CNT005_02_07;
	}

	public void setR2CNT005_02_07(int r2cnt005_02_07) {
		R2CNT005_02_07 = r2cnt005_02_07;
	}

	public int getR2CNT015_02_01() {
		return R2CNT015_02_01;
	}

	public void setR2CNT015_02_01(int r2cnt015_02_01) {
		R2CNT015_02_01 = r2cnt015_02_01;
	}

	public int getR2CNT015_02_02() {
		return R2CNT015_02_02;
	}

	public void setR2CNT015_02_02(int r2cnt015_02_02) {
		R2CNT015_02_02 = r2cnt015_02_02;
	}

	public int getR2CNT015_02_03() {
		return R2CNT015_02_03;
	}

	public void setR2CNT015_02_03(int r2cnt015_02_03) {
		R2CNT015_02_03 = r2cnt015_02_03;
	}

	public int getR2CNT015_02_04() {
		return R2CNT015_02_04;
	}

	public void setR2CNT015_02_04(int r2cnt015_02_04) {
		R2CNT015_02_04 = r2cnt015_02_04;
	}

	public int getR2CNT015_02_05() {
		return R2CNT015_02_05;
	}

	public void setR2CNT015_02_05(int r2cnt015_02_05) {
		R2CNT015_02_05 = r2cnt015_02_05;
	}

	public int getR2CNT015_02_06() {
		return R2CNT015_02_06;
	}

	public void setR2CNT015_02_06(int r2cnt015_02_06) {
		R2CNT015_02_06 = r2cnt015_02_06;
	}

	public int getR2CNT015_02_07() {
		return R2CNT015_02_07;
	}

	public void setR2CNT015_02_07(int r2cnt015_02_07) {
		R2CNT015_02_07 = r2cnt015_02_07;
	}

	public int getR2CNT006_02_01() {
		return R2CNT006_02_01;
	}

	public void setR2CNT006_02_01(int r2cnt006_02_01) {
		R2CNT006_02_01 = r2cnt006_02_01;
	}

	public int getR2CNT006_02_02() {
		return R2CNT006_02_02;
	}

	public void setR2CNT006_02_02(int r2cnt006_02_02) {
		R2CNT006_02_02 = r2cnt006_02_02;
	}

	public int getR2CNT006_02_03() {
		return R2CNT006_02_03;
	}

	public void setR2CNT006_02_03(int r2cnt006_02_03) {
		R2CNT006_02_03 = r2cnt006_02_03;
	}

	public int getR2CNT006_02_04() {
		return R2CNT006_02_04;
	}

	public void setR2CNT006_02_04(int r2cnt006_02_04) {
		R2CNT006_02_04 = r2cnt006_02_04;
	}

	public int getR2CNT006_02_05() {
		return R2CNT006_02_05;
	}

	public void setR2CNT006_02_05(int r2cnt006_02_05) {
		R2CNT006_02_05 = r2cnt006_02_05;
	}

	public int getR2CNT006_02_06() {
		return R2CNT006_02_06;
	}

	public void setR2CNT006_02_06(int r2cnt006_02_06) {
		R2CNT006_02_06 = r2cnt006_02_06;
	}

	public int getR2CNT006_02_07() {
		return R2CNT006_02_07;
	}

	public void setR2CNT006_02_07(int r2cnt006_02_07) {
		R2CNT006_02_07 = r2cnt006_02_07;
	}

	public int getR2CNT016_02_01() {
		return R2CNT016_02_01;
	}

	public void setR2CNT016_02_01(int r2cnt016_02_01) {
		R2CNT016_02_01 = r2cnt016_02_01;
	}

	public int getR2CNT016_02_02() {
		return R2CNT016_02_02;
	}

	public void setR2CNT016_02_02(int r2cnt016_02_02) {
		R2CNT016_02_02 = r2cnt016_02_02;
	}

	public int getR2CNT016_02_03() {
		return R2CNT016_02_03;
	}

	public void setR2CNT016_02_03(int r2cnt016_02_03) {
		R2CNT016_02_03 = r2cnt016_02_03;
	}

	public int getR2CNT016_02_04() {
		return R2CNT016_02_04;
	}

	public void setR2CNT016_02_04(int r2cnt016_02_04) {
		R2CNT016_02_04 = r2cnt016_02_04;
	}

	public int getR2CNT016_02_05() {
		return R2CNT016_02_05;
	}

	public void setR2CNT016_02_05(int r2cnt016_02_05) {
		R2CNT016_02_05 = r2cnt016_02_05;
	}

	public int getR2CNT016_02_06() {
		return R2CNT016_02_06;
	}

	public void setR2CNT016_02_06(int r2cnt016_02_06) {
		R2CNT016_02_06 = r2cnt016_02_06;
	}

	public int getR2CNT016_02_07() {
		return R2CNT016_02_07;
	}

	public void setR2CNT016_02_07(int r2cnt016_02_07) {
		R2CNT016_02_07 = r2cnt016_02_07;
	}

	public int getR2CNT013_02_01() {
		return R2CNT013_02_01;
	}

	public void setR2CNT013_02_01(int r2cnt013_02_01) {
		R2CNT013_02_01 = r2cnt013_02_01;
	}

	public int getR2CNT013_02_02() {
		return R2CNT013_02_02;
	}

	public void setR2CNT013_02_02(int r2cnt013_02_02) {
		R2CNT013_02_02 = r2cnt013_02_02;
	}

	public int getR2CNT013_02_03() {
		return R2CNT013_02_03;
	}

	public void setR2CNT013_02_03(int r2cnt013_02_03) {
		R2CNT013_02_03 = r2cnt013_02_03;
	}

	public int getR2CNT013_02_04() {
		return R2CNT013_02_04;
	}

	public void setR2CNT013_02_04(int r2cnt013_02_04) {
		R2CNT013_02_04 = r2cnt013_02_04;
	}

	public int getR2CNT013_02_05() {
		return R2CNT013_02_05;
	}

	public void setR2CNT013_02_05(int r2cnt013_02_05) {
		R2CNT013_02_05 = r2cnt013_02_05;
	}

	public int getR2CNT013_02_06() {
		return R2CNT013_02_06;
	}

	public void setR2CNT013_02_06(int r2cnt013_02_06) {
		R2CNT013_02_06 = r2cnt013_02_06;
	}

	public int getR2CNT013_02_07() {
		return R2CNT013_02_07;
	}

	public void setR2CNT013_02_07(int r2cnt013_02_07) {
		R2CNT013_02_07 = r2cnt013_02_07;
	}

	public int getR2CNT014_02_01() {
		return R2CNT014_02_01;
	}

	public void setR2CNT014_02_01(int r2cnt014_02_01) {
		R2CNT014_02_01 = r2cnt014_02_01;
	}

	public int getR2CNT014_02_02() {
		return R2CNT014_02_02;
	}

	public void setR2CNT014_02_02(int r2cnt014_02_02) {
		R2CNT014_02_02 = r2cnt014_02_02;
	}

	public int getR2CNT014_02_03() {
		return R2CNT014_02_03;
	}

	public void setR2CNT014_02_03(int r2cnt014_02_03) {
		R2CNT014_02_03 = r2cnt014_02_03;
	}

	public int getR2CNT014_02_04() {
		return R2CNT014_02_04;
	}

	public void setR2CNT014_02_04(int r2cnt014_02_04) {
		R2CNT014_02_04 = r2cnt014_02_04;
	}

	public int getR2CNT014_02_05() {
		return R2CNT014_02_05;
	}

	public void setR2CNT014_02_05(int r2cnt014_02_05) {
		R2CNT014_02_05 = r2cnt014_02_05;
	}

	public int getR2CNT014_02_06() {
		return R2CNT014_02_06;
	}

	public void setR2CNT014_02_06(int r2cnt014_02_06) {
		R2CNT014_02_06 = r2cnt014_02_06;
	}

	public int getR2CNT014_02_07() {
		return R2CNT014_02_07;
	}

	public void setR2CNT014_02_07(int r2cnt014_02_07) {
		R2CNT014_02_07 = r2cnt014_02_07;
	}

	public String getR2CNT002_03() {
		return R2CNT002_03;
	}

	public void setR2CNT002_03(String r2cnt002_03) {
		R2CNT002_03 = r2cnt002_03;
	}

	public int getR2CNT003_03_01() {
		return R2CNT003_03_01;
	}

	public void setR2CNT003_03_01(int r2cnt003_03_01) {
		R2CNT003_03_01 = r2cnt003_03_01;
	}

	public int getR2CNT003_03_02() {
		return R2CNT003_03_02;
	}

	public void setR2CNT003_03_02(int r2cnt003_03_02) {
		R2CNT003_03_02 = r2cnt003_03_02;
	}

	public int getR2CNT003_03_03() {
		return R2CNT003_03_03;
	}

	public void setR2CNT003_03_03(int r2cnt003_03_03) {
		R2CNT003_03_03 = r2cnt003_03_03;
	}

	public int getR2CNT003_03_04() {
		return R2CNT003_03_04;
	}

	public void setR2CNT003_03_04(int r2cnt003_03_04) {
		R2CNT003_03_04 = r2cnt003_03_04;
	}

	public int getR2CNT003_03_05() {
		return R2CNT003_03_05;
	}

	public void setR2CNT003_03_05(int r2cnt003_03_05) {
		R2CNT003_03_05 = r2cnt003_03_05;
	}

	public int getR2CNT003_03_06() {
		return R2CNT003_03_06;
	}

	public void setR2CNT003_03_06(int r2cnt003_03_06) {
		R2CNT003_03_06 = r2cnt003_03_06;
	}

	public int getR2CNT003_03_07() {
		return R2CNT003_03_07;
	}

	public void setR2CNT003_03_07(int r2cnt003_03_07) {
		R2CNT003_03_07 = r2cnt003_03_07;
	}

	public int getR2CNT004_03_01() {
		return R2CNT004_03_01;
	}

	public void setR2CNT004_03_01(int r2cnt004_03_01) {
		R2CNT004_03_01 = r2cnt004_03_01;
	}

	public int getR2CNT004_03_02() {
		return R2CNT004_03_02;
	}

	public void setR2CNT004_03_02(int r2cnt004_03_02) {
		R2CNT004_03_02 = r2cnt004_03_02;
	}

	public int getR2CNT004_03_03() {
		return R2CNT004_03_03;
	}

	public void setR2CNT004_03_03(int r2cnt004_03_03) {
		R2CNT004_03_03 = r2cnt004_03_03;
	}

	public int getR2CNT004_03_04() {
		return R2CNT004_03_04;
	}

	public void setR2CNT004_03_04(int r2cnt004_03_04) {
		R2CNT004_03_04 = r2cnt004_03_04;
	}

	public int getR2CNT004_03_05() {
		return R2CNT004_03_05;
	}

	public void setR2CNT004_03_05(int r2cnt004_03_05) {
		R2CNT004_03_05 = r2cnt004_03_05;
	}

	public int getR2CNT004_03_06() {
		return R2CNT004_03_06;
	}

	public void setR2CNT004_03_06(int r2cnt004_03_06) {
		R2CNT004_03_06 = r2cnt004_03_06;
	}

	public int getR2CNT004_03_07() {
		return R2CNT004_03_07;
	}

	public void setR2CNT004_03_07(int r2cnt004_03_07) {
		R2CNT004_03_07 = r2cnt004_03_07;
	}

	public int getR2CNT005_03_01() {
		return R2CNT005_03_01;
	}

	public void setR2CNT005_03_01(int r2cnt005_03_01) {
		R2CNT005_03_01 = r2cnt005_03_01;
	}

	public int getR2CNT005_03_02() {
		return R2CNT005_03_02;
	}

	public void setR2CNT005_03_02(int r2cnt005_03_02) {
		R2CNT005_03_02 = r2cnt005_03_02;
	}

	public int getR2CNT005_03_03() {
		return R2CNT005_03_03;
	}

	public void setR2CNT005_03_03(int r2cnt005_03_03) {
		R2CNT005_03_03 = r2cnt005_03_03;
	}

	public int getR2CNT005_03_04() {
		return R2CNT005_03_04;
	}

	public void setR2CNT005_03_04(int r2cnt005_03_04) {
		R2CNT005_03_04 = r2cnt005_03_04;
	}

	public int getR2CNT005_03_05() {
		return R2CNT005_03_05;
	}

	public void setR2CNT005_03_05(int r2cnt005_03_05) {
		R2CNT005_03_05 = r2cnt005_03_05;
	}

	public int getR2CNT005_03_06() {
		return R2CNT005_03_06;
	}

	public void setR2CNT005_03_06(int r2cnt005_03_06) {
		R2CNT005_03_06 = r2cnt005_03_06;
	}

	public int getR2CNT005_03_07() {
		return R2CNT005_03_07;
	}

	public void setR2CNT005_03_07(int r2cnt005_03_07) {
		R2CNT005_03_07 = r2cnt005_03_07;
	}

	public int getR2CNT015_03_01() {
		return R2CNT015_03_01;
	}

	public void setR2CNT015_03_01(int r2cnt015_03_01) {
		R2CNT015_03_01 = r2cnt015_03_01;
	}

	public int getR2CNT015_03_02() {
		return R2CNT015_03_02;
	}

	public void setR2CNT015_03_02(int r2cnt015_03_02) {
		R2CNT015_03_02 = r2cnt015_03_02;
	}

	public int getR2CNT015_03_03() {
		return R2CNT015_03_03;
	}

	public void setR2CNT015_03_03(int r2cnt015_03_03) {
		R2CNT015_03_03 = r2cnt015_03_03;
	}

	public int getR2CNT015_03_04() {
		return R2CNT015_03_04;
	}

	public void setR2CNT015_03_04(int r2cnt015_03_04) {
		R2CNT015_03_04 = r2cnt015_03_04;
	}

	public int getR2CNT015_03_05() {
		return R2CNT015_03_05;
	}

	public void setR2CNT015_03_05(int r2cnt015_03_05) {
		R2CNT015_03_05 = r2cnt015_03_05;
	}

	public int getR2CNT015_03_06() {
		return R2CNT015_03_06;
	}

	public void setR2CNT015_03_06(int r2cnt015_03_06) {
		R2CNT015_03_06 = r2cnt015_03_06;
	}

	public int getR2CNT015_03_07() {
		return R2CNT015_03_07;
	}

	public void setR2CNT015_03_07(int r2cnt015_03_07) {
		R2CNT015_03_07 = r2cnt015_03_07;
	}

	public int getR2CNT006_03_01() {
		return R2CNT006_03_01;
	}

	public void setR2CNT006_03_01(int r2cnt006_03_01) {
		R2CNT006_03_01 = r2cnt006_03_01;
	}

	public int getR2CNT006_03_02() {
		return R2CNT006_03_02;
	}

	public void setR2CNT006_03_02(int r2cnt006_03_02) {
		R2CNT006_03_02 = r2cnt006_03_02;
	}

	public int getR2CNT006_03_03() {
		return R2CNT006_03_03;
	}

	public void setR2CNT006_03_03(int r2cnt006_03_03) {
		R2CNT006_03_03 = r2cnt006_03_03;
	}

	public int getR2CNT006_03_04() {
		return R2CNT006_03_04;
	}

	public void setR2CNT006_03_04(int r2cnt006_03_04) {
		R2CNT006_03_04 = r2cnt006_03_04;
	}

	public int getR2CNT006_03_05() {
		return R2CNT006_03_05;
	}

	public void setR2CNT006_03_05(int r2cnt006_03_05) {
		R2CNT006_03_05 = r2cnt006_03_05;
	}

	public int getR2CNT006_03_06() {
		return R2CNT006_03_06;
	}

	public void setR2CNT006_03_06(int r2cnt006_03_06) {
		R2CNT006_03_06 = r2cnt006_03_06;
	}

	public int getR2CNT006_03_07() {
		return R2CNT006_03_07;
	}

	public void setR2CNT006_03_07(int r2cnt006_03_07) {
		R2CNT006_03_07 = r2cnt006_03_07;
	}

	public int getR2CNT016_03_01() {
		return R2CNT016_03_01;
	}

	public void setR2CNT016_03_01(int r2cnt016_03_01) {
		R2CNT016_03_01 = r2cnt016_03_01;
	}

	public int getR2CNT016_03_02() {
		return R2CNT016_03_02;
	}

	public void setR2CNT016_03_02(int r2cnt016_03_02) {
		R2CNT016_03_02 = r2cnt016_03_02;
	}

	public int getR2CNT016_03_03() {
		return R2CNT016_03_03;
	}

	public void setR2CNT016_03_03(int r2cnt016_03_03) {
		R2CNT016_03_03 = r2cnt016_03_03;
	}

	public int getR2CNT016_03_04() {
		return R2CNT016_03_04;
	}

	public void setR2CNT016_03_04(int r2cnt016_03_04) {
		R2CNT016_03_04 = r2cnt016_03_04;
	}

	public int getR2CNT016_03_05() {
		return R2CNT016_03_05;
	}

	public void setR2CNT016_03_05(int r2cnt016_03_05) {
		R2CNT016_03_05 = r2cnt016_03_05;
	}

	public int getR2CNT016_03_06() {
		return R2CNT016_03_06;
	}

	public void setR2CNT016_03_06(int r2cnt016_03_06) {
		R2CNT016_03_06 = r2cnt016_03_06;
	}

	public int getR2CNT016_03_07() {
		return R2CNT016_03_07;
	}

	public void setR2CNT016_03_07(int r2cnt016_03_07) {
		R2CNT016_03_07 = r2cnt016_03_07;
	}

	public int getR2CNT013_03_01() {
		return R2CNT013_03_01;
	}

	public void setR2CNT013_03_01(int r2cnt013_03_01) {
		R2CNT013_03_01 = r2cnt013_03_01;
	}

	public int getR2CNT013_03_02() {
		return R2CNT013_03_02;
	}

	public void setR2CNT013_03_02(int r2cnt013_03_02) {
		R2CNT013_03_02 = r2cnt013_03_02;
	}

	public int getR2CNT013_03_03() {
		return R2CNT013_03_03;
	}

	public void setR2CNT013_03_03(int r2cnt013_03_03) {
		R2CNT013_03_03 = r2cnt013_03_03;
	}

	public int getR2CNT013_03_04() {
		return R2CNT013_03_04;
	}

	public void setR2CNT013_03_04(int r2cnt013_03_04) {
		R2CNT013_03_04 = r2cnt013_03_04;
	}

	public int getR2CNT013_03_05() {
		return R2CNT013_03_05;
	}

	public void setR2CNT013_03_05(int r2cnt013_03_05) {
		R2CNT013_03_05 = r2cnt013_03_05;
	}

	public int getR2CNT013_03_06() {
		return R2CNT013_03_06;
	}

	public void setR2CNT013_03_06(int r2cnt013_03_06) {
		R2CNT013_03_06 = r2cnt013_03_06;
	}

	public int getR2CNT013_03_07() {
		return R2CNT013_03_07;
	}

	public void setR2CNT013_03_07(int r2cnt013_03_07) {
		R2CNT013_03_07 = r2cnt013_03_07;
	}

	public int getR2CNT014_03_01() {
		return R2CNT014_03_01;
	}

	public void setR2CNT014_03_01(int r2cnt014_03_01) {
		R2CNT014_03_01 = r2cnt014_03_01;
	}

	public int getR2CNT014_03_02() {
		return R2CNT014_03_02;
	}

	public void setR2CNT014_03_02(int r2cnt014_03_02) {
		R2CNT014_03_02 = r2cnt014_03_02;
	}

	public int getR2CNT014_03_03() {
		return R2CNT014_03_03;
	}

	public void setR2CNT014_03_03(int r2cnt014_03_03) {
		R2CNT014_03_03 = r2cnt014_03_03;
	}

	public int getR2CNT014_03_04() {
		return R2CNT014_03_04;
	}

	public void setR2CNT014_03_04(int r2cnt014_03_04) {
		R2CNT014_03_04 = r2cnt014_03_04;
	}

	public int getR2CNT014_03_05() {
		return R2CNT014_03_05;
	}

	public void setR2CNT014_03_05(int r2cnt014_03_05) {
		R2CNT014_03_05 = r2cnt014_03_05;
	}

	public int getR2CNT014_03_06() {
		return R2CNT014_03_06;
	}

	public void setR2CNT014_03_06(int r2cnt014_03_06) {
		R2CNT014_03_06 = r2cnt014_03_06;
	}

	public int getR2CNT014_03_07() {
		return R2CNT014_03_07;
	}

	public void setR2CNT014_03_07(int r2cnt014_03_07) {
		R2CNT014_03_07 = r2cnt014_03_07;
	}

	public String getR2CNT002_04() {
		return R2CNT002_04;
	}

	public void setR2CNT002_04(String r2cnt002_04) {
		R2CNT002_04 = r2cnt002_04;
	}

	public int getR2CNT003_04_01() {
		return R2CNT003_04_01;
	}

	public void setR2CNT003_04_01(int r2cnt003_04_01) {
		R2CNT003_04_01 = r2cnt003_04_01;
	}

	public int getR2CNT003_04_02() {
		return R2CNT003_04_02;
	}

	public void setR2CNT003_04_02(int r2cnt003_04_02) {
		R2CNT003_04_02 = r2cnt003_04_02;
	}

	public int getR2CNT003_04_03() {
		return R2CNT003_04_03;
	}

	public void setR2CNT003_04_03(int r2cnt003_04_03) {
		R2CNT003_04_03 = r2cnt003_04_03;
	}

	public int getR2CNT003_04_04() {
		return R2CNT003_04_04;
	}

	public void setR2CNT003_04_04(int r2cnt003_04_04) {
		R2CNT003_04_04 = r2cnt003_04_04;
	}

	public int getR2CNT003_04_05() {
		return R2CNT003_04_05;
	}

	public void setR2CNT003_04_05(int r2cnt003_04_05) {
		R2CNT003_04_05 = r2cnt003_04_05;
	}

	public int getR2CNT003_04_06() {
		return R2CNT003_04_06;
	}

	public void setR2CNT003_04_06(int r2cnt003_04_06) {
		R2CNT003_04_06 = r2cnt003_04_06;
	}

	public int getR2CNT003_04_07() {
		return R2CNT003_04_07;
	}

	public void setR2CNT003_04_07(int r2cnt003_04_07) {
		R2CNT003_04_07 = r2cnt003_04_07;
	}

	public int getR2CNT004_04_01() {
		return R2CNT004_04_01;
	}

	public void setR2CNT004_04_01(int r2cnt004_04_01) {
		R2CNT004_04_01 = r2cnt004_04_01;
	}

	public int getR2CNT004_04_02() {
		return R2CNT004_04_02;
	}

	public void setR2CNT004_04_02(int r2cnt004_04_02) {
		R2CNT004_04_02 = r2cnt004_04_02;
	}

	public int getR2CNT004_04_03() {
		return R2CNT004_04_03;
	}

	public void setR2CNT004_04_03(int r2cnt004_04_03) {
		R2CNT004_04_03 = r2cnt004_04_03;
	}

	public int getR2CNT004_04_04() {
		return R2CNT004_04_04;
	}

	public void setR2CNT004_04_04(int r2cnt004_04_04) {
		R2CNT004_04_04 = r2cnt004_04_04;
	}

	public int getR2CNT004_04_05() {
		return R2CNT004_04_05;
	}

	public void setR2CNT004_04_05(int r2cnt004_04_05) {
		R2CNT004_04_05 = r2cnt004_04_05;
	}

	public int getR2CNT004_04_06() {
		return R2CNT004_04_06;
	}

	public void setR2CNT004_04_06(int r2cnt004_04_06) {
		R2CNT004_04_06 = r2cnt004_04_06;
	}

	public int getR2CNT004_04_07() {
		return R2CNT004_04_07;
	}

	public void setR2CNT004_04_07(int r2cnt004_04_07) {
		R2CNT004_04_07 = r2cnt004_04_07;
	}

	public int getR2CNT005_04_01() {
		return R2CNT005_04_01;
	}

	public void setR2CNT005_04_01(int r2cnt005_04_01) {
		R2CNT005_04_01 = r2cnt005_04_01;
	}

	public int getR2CNT005_04_02() {
		return R2CNT005_04_02;
	}

	public void setR2CNT005_04_02(int r2cnt005_04_02) {
		R2CNT005_04_02 = r2cnt005_04_02;
	}

	public int getR2CNT005_04_03() {
		return R2CNT005_04_03;
	}

	public void setR2CNT005_04_03(int r2cnt005_04_03) {
		R2CNT005_04_03 = r2cnt005_04_03;
	}

	public int getR2CNT005_04_04() {
		return R2CNT005_04_04;
	}

	public void setR2CNT005_04_04(int r2cnt005_04_04) {
		R2CNT005_04_04 = r2cnt005_04_04;
	}

	public int getR2CNT005_04_05() {
		return R2CNT005_04_05;
	}

	public void setR2CNT005_04_05(int r2cnt005_04_05) {
		R2CNT005_04_05 = r2cnt005_04_05;
	}

	public int getR2CNT005_04_06() {
		return R2CNT005_04_06;
	}

	public void setR2CNT005_04_06(int r2cnt005_04_06) {
		R2CNT005_04_06 = r2cnt005_04_06;
	}

	public int getR2CNT005_04_07() {
		return R2CNT005_04_07;
	}

	public void setR2CNT005_04_07(int r2cnt005_04_07) {
		R2CNT005_04_07 = r2cnt005_04_07;
	}

	public int getR2CNT015_04_01() {
		return R2CNT015_04_01;
	}

	public void setR2CNT015_04_01(int r2cnt015_04_01) {
		R2CNT015_04_01 = r2cnt015_04_01;
	}

	public int getR2CNT015_04_02() {
		return R2CNT015_04_02;
	}

	public void setR2CNT015_04_02(int r2cnt015_04_02) {
		R2CNT015_04_02 = r2cnt015_04_02;
	}

	public int getR2CNT015_04_03() {
		return R2CNT015_04_03;
	}

	public void setR2CNT015_04_03(int r2cnt015_04_03) {
		R2CNT015_04_03 = r2cnt015_04_03;
	}

	public int getR2CNT015_04_04() {
		return R2CNT015_04_04;
	}

	public void setR2CNT015_04_04(int r2cnt015_04_04) {
		R2CNT015_04_04 = r2cnt015_04_04;
	}

	public int getR2CNT015_04_05() {
		return R2CNT015_04_05;
	}

	public void setR2CNT015_04_05(int r2cnt015_04_05) {
		R2CNT015_04_05 = r2cnt015_04_05;
	}

	public int getR2CNT015_04_06() {
		return R2CNT015_04_06;
	}

	public void setR2CNT015_04_06(int r2cnt015_04_06) {
		R2CNT015_04_06 = r2cnt015_04_06;
	}

	public int getR2CNT015_04_07() {
		return R2CNT015_04_07;
	}

	public void setR2CNT015_04_07(int r2cnt015_04_07) {
		R2CNT015_04_07 = r2cnt015_04_07;
	}

	public int getR2CNT006_04_01() {
		return R2CNT006_04_01;
	}

	public void setR2CNT006_04_01(int r2cnt006_04_01) {
		R2CNT006_04_01 = r2cnt006_04_01;
	}

	public int getR2CNT006_04_02() {
		return R2CNT006_04_02;
	}

	public void setR2CNT006_04_02(int r2cnt006_04_02) {
		R2CNT006_04_02 = r2cnt006_04_02;
	}

	public int getR2CNT006_04_03() {
		return R2CNT006_04_03;
	}

	public void setR2CNT006_04_03(int r2cnt006_04_03) {
		R2CNT006_04_03 = r2cnt006_04_03;
	}

	public int getR2CNT006_04_04() {
		return R2CNT006_04_04;
	}

	public void setR2CNT006_04_04(int r2cnt006_04_04) {
		R2CNT006_04_04 = r2cnt006_04_04;
	}

	public int getR2CNT006_04_05() {
		return R2CNT006_04_05;
	}

	public void setR2CNT006_04_05(int r2cnt006_04_05) {
		R2CNT006_04_05 = r2cnt006_04_05;
	}

	public int getR2CNT006_04_06() {
		return R2CNT006_04_06;
	}

	public void setR2CNT006_04_06(int r2cnt006_04_06) {
		R2CNT006_04_06 = r2cnt006_04_06;
	}

	public int getR2CNT006_04_07() {
		return R2CNT006_04_07;
	}

	public void setR2CNT006_04_07(int r2cnt006_04_07) {
		R2CNT006_04_07 = r2cnt006_04_07;
	}

	public int getR2CNT016_04_01() {
		return R2CNT016_04_01;
	}

	public void setR2CNT016_04_01(int r2cnt016_04_01) {
		R2CNT016_04_01 = r2cnt016_04_01;
	}

	public int getR2CNT016_04_02() {
		return R2CNT016_04_02;
	}

	public void setR2CNT016_04_02(int r2cnt016_04_02) {
		R2CNT016_04_02 = r2cnt016_04_02;
	}

	public int getR2CNT016_04_03() {
		return R2CNT016_04_03;
	}

	public void setR2CNT016_04_03(int r2cnt016_04_03) {
		R2CNT016_04_03 = r2cnt016_04_03;
	}

	public int getR2CNT016_04_04() {
		return R2CNT016_04_04;
	}

	public void setR2CNT016_04_04(int r2cnt016_04_04) {
		R2CNT016_04_04 = r2cnt016_04_04;
	}

	public int getR2CNT016_04_05() {
		return R2CNT016_04_05;
	}

	public void setR2CNT016_04_05(int r2cnt016_04_05) {
		R2CNT016_04_05 = r2cnt016_04_05;
	}

	public int getR2CNT016_04_06() {
		return R2CNT016_04_06;
	}

	public void setR2CNT016_04_06(int r2cnt016_04_06) {
		R2CNT016_04_06 = r2cnt016_04_06;
	}

	public int getR2CNT016_04_07() {
		return R2CNT016_04_07;
	}

	public void setR2CNT016_04_07(int r2cnt016_04_07) {
		R2CNT016_04_07 = r2cnt016_04_07;
	}

	public int getR2CNT013_04_01() {
		return R2CNT013_04_01;
	}

	public void setR2CNT013_04_01(int r2cnt013_04_01) {
		R2CNT013_04_01 = r2cnt013_04_01;
	}

	public int getR2CNT013_04_02() {
		return R2CNT013_04_02;
	}

	public void setR2CNT013_04_02(int r2cnt013_04_02) {
		R2CNT013_04_02 = r2cnt013_04_02;
	}

	public int getR2CNT013_04_03() {
		return R2CNT013_04_03;
	}

	public void setR2CNT013_04_03(int r2cnt013_04_03) {
		R2CNT013_04_03 = r2cnt013_04_03;
	}

	public int getR2CNT013_04_04() {
		return R2CNT013_04_04;
	}

	public void setR2CNT013_04_04(int r2cnt013_04_04) {
		R2CNT013_04_04 = r2cnt013_04_04;
	}

	public int getR2CNT013_04_05() {
		return R2CNT013_04_05;
	}

	public void setR2CNT013_04_05(int r2cnt013_04_05) {
		R2CNT013_04_05 = r2cnt013_04_05;
	}

	public int getR2CNT013_04_06() {
		return R2CNT013_04_06;
	}

	public void setR2CNT013_04_06(int r2cnt013_04_06) {
		R2CNT013_04_06 = r2cnt013_04_06;
	}

	public int getR2CNT013_04_07() {
		return R2CNT013_04_07;
	}

	public void setR2CNT013_04_07(int r2cnt013_04_07) {
		R2CNT013_04_07 = r2cnt013_04_07;
	}

	public int getR2CNT014_04_01() {
		return R2CNT014_04_01;
	}

	public void setR2CNT014_04_01(int r2cnt014_04_01) {
		R2CNT014_04_01 = r2cnt014_04_01;
	}

	public int getR2CNT014_04_02() {
		return R2CNT014_04_02;
	}

	public void setR2CNT014_04_02(int r2cnt014_04_02) {
		R2CNT014_04_02 = r2cnt014_04_02;
	}

	public int getR2CNT014_04_03() {
		return R2CNT014_04_03;
	}

	public void setR2CNT014_04_03(int r2cnt014_04_03) {
		R2CNT014_04_03 = r2cnt014_04_03;
	}

	public int getR2CNT014_04_04() {
		return R2CNT014_04_04;
	}

	public void setR2CNT014_04_04(int r2cnt014_04_04) {
		R2CNT014_04_04 = r2cnt014_04_04;
	}

	public int getR2CNT014_04_05() {
		return R2CNT014_04_05;
	}

	public void setR2CNT014_04_05(int r2cnt014_04_05) {
		R2CNT014_04_05 = r2cnt014_04_05;
	}

	public int getR2CNT014_04_06() {
		return R2CNT014_04_06;
	}

	public void setR2CNT014_04_06(int r2cnt014_04_06) {
		R2CNT014_04_06 = r2cnt014_04_06;
	}

	public int getR2CNT014_04_07() {
		return R2CNT014_04_07;
	}

	public void setR2CNT014_04_07(int r2cnt014_04_07) {
		R2CNT014_04_07 = r2cnt014_04_07;
	}

	public String getR2CNT002_05() {
		return R2CNT002_05;
	}

	public void setR2CNT002_05(String r2cnt002_05) {
		R2CNT002_05 = r2cnt002_05;
	}

	public int getR2CNT003_05_01() {
		return R2CNT003_05_01;
	}

	public void setR2CNT003_05_01(int r2cnt003_05_01) {
		R2CNT003_05_01 = r2cnt003_05_01;
	}

	public int getR2CNT003_05_02() {
		return R2CNT003_05_02;
	}

	public void setR2CNT003_05_02(int r2cnt003_05_02) {
		R2CNT003_05_02 = r2cnt003_05_02;
	}

	public int getR2CNT003_05_03() {
		return R2CNT003_05_03;
	}

	public void setR2CNT003_05_03(int r2cnt003_05_03) {
		R2CNT003_05_03 = r2cnt003_05_03;
	}

	public int getR2CNT003_05_04() {
		return R2CNT003_05_04;
	}

	public void setR2CNT003_05_04(int r2cnt003_05_04) {
		R2CNT003_05_04 = r2cnt003_05_04;
	}

	public int getR2CNT003_05_05() {
		return R2CNT003_05_05;
	}

	public void setR2CNT003_05_05(int r2cnt003_05_05) {
		R2CNT003_05_05 = r2cnt003_05_05;
	}

	public int getR2CNT003_05_06() {
		return R2CNT003_05_06;
	}

	public void setR2CNT003_05_06(int r2cnt003_05_06) {
		R2CNT003_05_06 = r2cnt003_05_06;
	}

	public int getR2CNT003_05_07() {
		return R2CNT003_05_07;
	}

	public void setR2CNT003_05_07(int r2cnt003_05_07) {
		R2CNT003_05_07 = r2cnt003_05_07;
	}

	public int getR2CNT004_05_01() {
		return R2CNT004_05_01;
	}

	public void setR2CNT004_05_01(int r2cnt004_05_01) {
		R2CNT004_05_01 = r2cnt004_05_01;
	}

	public int getR2CNT004_05_02() {
		return R2CNT004_05_02;
	}

	public void setR2CNT004_05_02(int r2cnt004_05_02) {
		R2CNT004_05_02 = r2cnt004_05_02;
	}

	public int getR2CNT004_05_03() {
		return R2CNT004_05_03;
	}

	public void setR2CNT004_05_03(int r2cnt004_05_03) {
		R2CNT004_05_03 = r2cnt004_05_03;
	}

	public int getR2CNT004_05_04() {
		return R2CNT004_05_04;
	}

	public void setR2CNT004_05_04(int r2cnt004_05_04) {
		R2CNT004_05_04 = r2cnt004_05_04;
	}

	public int getR2CNT004_05_05() {
		return R2CNT004_05_05;
	}

	public void setR2CNT004_05_05(int r2cnt004_05_05) {
		R2CNT004_05_05 = r2cnt004_05_05;
	}

	public int getR2CNT004_05_06() {
		return R2CNT004_05_06;
	}

	public void setR2CNT004_05_06(int r2cnt004_05_06) {
		R2CNT004_05_06 = r2cnt004_05_06;
	}

	public int getR2CNT004_05_07() {
		return R2CNT004_05_07;
	}

	public void setR2CNT004_05_07(int r2cnt004_05_07) {
		R2CNT004_05_07 = r2cnt004_05_07;
	}

	public int getR2CNT005_05_01() {
		return R2CNT005_05_01;
	}

	public void setR2CNT005_05_01(int r2cnt005_05_01) {
		R2CNT005_05_01 = r2cnt005_05_01;
	}

	public int getR2CNT005_05_02() {
		return R2CNT005_05_02;
	}

	public void setR2CNT005_05_02(int r2cnt005_05_02) {
		R2CNT005_05_02 = r2cnt005_05_02;
	}

	public int getR2CNT005_05_03() {
		return R2CNT005_05_03;
	}

	public void setR2CNT005_05_03(int r2cnt005_05_03) {
		R2CNT005_05_03 = r2cnt005_05_03;
	}

	public int getR2CNT005_05_04() {
		return R2CNT005_05_04;
	}

	public void setR2CNT005_05_04(int r2cnt005_05_04) {
		R2CNT005_05_04 = r2cnt005_05_04;
	}

	public int getR2CNT005_05_05() {
		return R2CNT005_05_05;
	}

	public void setR2CNT005_05_05(int r2cnt005_05_05) {
		R2CNT005_05_05 = r2cnt005_05_05;
	}

	public int getR2CNT005_05_06() {
		return R2CNT005_05_06;
	}

	public void setR2CNT005_05_06(int r2cnt005_05_06) {
		R2CNT005_05_06 = r2cnt005_05_06;
	}

	public int getR2CNT005_05_07() {
		return R2CNT005_05_07;
	}

	public void setR2CNT005_05_07(int r2cnt005_05_07) {
		R2CNT005_05_07 = r2cnt005_05_07;
	}

	public int getR2CNT015_05_01() {
		return R2CNT015_05_01;
	}

	public void setR2CNT015_05_01(int r2cnt015_05_01) {
		R2CNT015_05_01 = r2cnt015_05_01;
	}

	public int getR2CNT015_05_02() {
		return R2CNT015_05_02;
	}

	public void setR2CNT015_05_02(int r2cnt015_05_02) {
		R2CNT015_05_02 = r2cnt015_05_02;
	}

	public int getR2CNT015_05_03() {
		return R2CNT015_05_03;
	}

	public void setR2CNT015_05_03(int r2cnt015_05_03) {
		R2CNT015_05_03 = r2cnt015_05_03;
	}

	public int getR2CNT015_05_04() {
		return R2CNT015_05_04;
	}

	public void setR2CNT015_05_04(int r2cnt015_05_04) {
		R2CNT015_05_04 = r2cnt015_05_04;
	}

	public int getR2CNT015_05_05() {
		return R2CNT015_05_05;
	}

	public void setR2CNT015_05_05(int r2cnt015_05_05) {
		R2CNT015_05_05 = r2cnt015_05_05;
	}

	public int getR2CNT015_05_06() {
		return R2CNT015_05_06;
	}

	public void setR2CNT015_05_06(int r2cnt015_05_06) {
		R2CNT015_05_06 = r2cnt015_05_06;
	}

	public int getR2CNT015_05_07() {
		return R2CNT015_05_07;
	}

	public void setR2CNT015_05_07(int r2cnt015_05_07) {
		R2CNT015_05_07 = r2cnt015_05_07;
	}

	public int getR2CNT006_05_01() {
		return R2CNT006_05_01;
	}

	public void setR2CNT006_05_01(int r2cnt006_05_01) {
		R2CNT006_05_01 = r2cnt006_05_01;
	}

	public int getR2CNT006_05_02() {
		return R2CNT006_05_02;
	}

	public void setR2CNT006_05_02(int r2cnt006_05_02) {
		R2CNT006_05_02 = r2cnt006_05_02;
	}

	public int getR2CNT006_05_03() {
		return R2CNT006_05_03;
	}

	public void setR2CNT006_05_03(int r2cnt006_05_03) {
		R2CNT006_05_03 = r2cnt006_05_03;
	}

	public int getR2CNT006_05_04() {
		return R2CNT006_05_04;
	}

	public void setR2CNT006_05_04(int r2cnt006_05_04) {
		R2CNT006_05_04 = r2cnt006_05_04;
	}

	public int getR2CNT006_05_05() {
		return R2CNT006_05_05;
	}

	public void setR2CNT006_05_05(int r2cnt006_05_05) {
		R2CNT006_05_05 = r2cnt006_05_05;
	}

	public int getR2CNT006_05_06() {
		return R2CNT006_05_06;
	}

	public void setR2CNT006_05_06(int r2cnt006_05_06) {
		R2CNT006_05_06 = r2cnt006_05_06;
	}

	public int getR2CNT006_05_07() {
		return R2CNT006_05_07;
	}

	public void setR2CNT006_05_07(int r2cnt006_05_07) {
		R2CNT006_05_07 = r2cnt006_05_07;
	}

	public int getR2CNT016_05_01() {
		return R2CNT016_05_01;
	}

	public void setR2CNT016_05_01(int r2cnt016_05_01) {
		R2CNT016_05_01 = r2cnt016_05_01;
	}

	public int getR2CNT016_05_02() {
		return R2CNT016_05_02;
	}

	public void setR2CNT016_05_02(int r2cnt016_05_02) {
		R2CNT016_05_02 = r2cnt016_05_02;
	}

	public int getR2CNT016_05_03() {
		return R2CNT016_05_03;
	}

	public void setR2CNT016_05_03(int r2cnt016_05_03) {
		R2CNT016_05_03 = r2cnt016_05_03;
	}

	public int getR2CNT016_05_04() {
		return R2CNT016_05_04;
	}

	public void setR2CNT016_05_04(int r2cnt016_05_04) {
		R2CNT016_05_04 = r2cnt016_05_04;
	}

	public int getR2CNT016_05_05() {
		return R2CNT016_05_05;
	}

	public void setR2CNT016_05_05(int r2cnt016_05_05) {
		R2CNT016_05_05 = r2cnt016_05_05;
	}

	public int getR2CNT016_05_06() {
		return R2CNT016_05_06;
	}

	public void setR2CNT016_05_06(int r2cnt016_05_06) {
		R2CNT016_05_06 = r2cnt016_05_06;
	}

	public int getR2CNT016_05_07() {
		return R2CNT016_05_07;
	}

	public void setR2CNT016_05_07(int r2cnt016_05_07) {
		R2CNT016_05_07 = r2cnt016_05_07;
	}

	public int getR2CNT013_05_01() {
		return R2CNT013_05_01;
	}

	public void setR2CNT013_05_01(int r2cnt013_05_01) {
		R2CNT013_05_01 = r2cnt013_05_01;
	}

	public int getR2CNT013_05_02() {
		return R2CNT013_05_02;
	}

	public void setR2CNT013_05_02(int r2cnt013_05_02) {
		R2CNT013_05_02 = r2cnt013_05_02;
	}

	public int getR2CNT013_05_03() {
		return R2CNT013_05_03;
	}

	public void setR2CNT013_05_03(int r2cnt013_05_03) {
		R2CNT013_05_03 = r2cnt013_05_03;
	}

	public int getR2CNT013_05_04() {
		return R2CNT013_05_04;
	}

	public void setR2CNT013_05_04(int r2cnt013_05_04) {
		R2CNT013_05_04 = r2cnt013_05_04;
	}

	public int getR2CNT013_05_05() {
		return R2CNT013_05_05;
	}

	public void setR2CNT013_05_05(int r2cnt013_05_05) {
		R2CNT013_05_05 = r2cnt013_05_05;
	}

	public int getR2CNT013_05_06() {
		return R2CNT013_05_06;
	}

	public void setR2CNT013_05_06(int r2cnt013_05_06) {
		R2CNT013_05_06 = r2cnt013_05_06;
	}

	public int getR2CNT013_05_07() {
		return R2CNT013_05_07;
	}

	public void setR2CNT013_05_07(int r2cnt013_05_07) {
		R2CNT013_05_07 = r2cnt013_05_07;
	}

	public int getR2CNT014_05_01() {
		return R2CNT014_05_01;
	}

	public void setR2CNT014_05_01(int r2cnt014_05_01) {
		R2CNT014_05_01 = r2cnt014_05_01;
	}

	public int getR2CNT014_05_02() {
		return R2CNT014_05_02;
	}

	public void setR2CNT014_05_02(int r2cnt014_05_02) {
		R2CNT014_05_02 = r2cnt014_05_02;
	}

	public int getR2CNT014_05_03() {
		return R2CNT014_05_03;
	}

	public void setR2CNT014_05_03(int r2cnt014_05_03) {
		R2CNT014_05_03 = r2cnt014_05_03;
	}

	public int getR2CNT014_05_04() {
		return R2CNT014_05_04;
	}

	public void setR2CNT014_05_04(int r2cnt014_05_04) {
		R2CNT014_05_04 = r2cnt014_05_04;
	}

	public int getR2CNT014_05_05() {
		return R2CNT014_05_05;
	}

	public void setR2CNT014_05_05(int r2cnt014_05_05) {
		R2CNT014_05_05 = r2cnt014_05_05;
	}

	public int getR2CNT014_05_06() {
		return R2CNT014_05_06;
	}

	public void setR2CNT014_05_06(int r2cnt014_05_06) {
		R2CNT014_05_06 = r2cnt014_05_06;
	}

	public int getR2CNT014_05_07() {
		return R2CNT014_05_07;
	}

	public void setR2CNT014_05_07(int r2cnt014_05_07) {
		R2CNT014_05_07 = r2cnt014_05_07;
	}

	public String getRICNT010_01() {
		return RICNT010_01;
	}

	public void setRICNT010_01(String rICNT010_01) {
		RICNT010_01 = rICNT010_01;
	}

	public int getRICNT020_01_01() {
		return RICNT020_01_01;
	}

	public void setRICNT020_01_01(int rICNT020_01_01) {
		RICNT020_01_01 = rICNT020_01_01;
	}

	public int getRICNT020_01_02() {
		return RICNT020_01_02;
	}

	public void setRICNT020_01_02(int rICNT020_01_02) {
		RICNT020_01_02 = rICNT020_01_02;
	}

	public int getRICNT020_01_03() {
		return RICNT020_01_03;
	}

	public void setRICNT020_01_03(int rICNT020_01_03) {
		RICNT020_01_03 = rICNT020_01_03;
	}

	public int getRICNT020_01_04() {
		return RICNT020_01_04;
	}

	public void setRICNT020_01_04(int rICNT020_01_04) {
		RICNT020_01_04 = rICNT020_01_04;
	}

	public int getRICNT020_01_05() {
		return RICNT020_01_05;
	}

	public void setRICNT020_01_05(int rICNT020_01_05) {
		RICNT020_01_05 = rICNT020_01_05;
	}

	public int getRICNT020_01_06() {
		return RICNT020_01_06;
	}

	public void setRICNT020_01_06(int rICNT020_01_06) {
		RICNT020_01_06 = rICNT020_01_06;
	}

	public int getRICNT020_01_07() {
		return RICNT020_01_07;
	}

	public void setRICNT020_01_07(int rICNT020_01_07) {
		RICNT020_01_07 = rICNT020_01_07;
	}

	public String getRICNT010_02() {
		return RICNT010_02;
	}

	public void setRICNT010_02(String rICNT010_02) {
		RICNT010_02 = rICNT010_02;
	}

	public int getRICNT020_02_01() {
		return RICNT020_02_01;
	}

	public void setRICNT020_02_01(int rICNT020_02_01) {
		RICNT020_02_01 = rICNT020_02_01;
	}

	public int getRICNT020_02_02() {
		return RICNT020_02_02;
	}

	public void setRICNT020_02_02(int rICNT020_02_02) {
		RICNT020_02_02 = rICNT020_02_02;
	}

	public int getRICNT020_02_03() {
		return RICNT020_02_03;
	}

	public void setRICNT020_02_03(int rICNT020_02_03) {
		RICNT020_02_03 = rICNT020_02_03;
	}

	public int getRICNT020_02_04() {
		return RICNT020_02_04;
	}

	public void setRICNT020_02_04(int rICNT020_02_04) {
		RICNT020_02_04 = rICNT020_02_04;
	}

	public int getRICNT020_02_05() {
		return RICNT020_02_05;
	}

	public void setRICNT020_02_05(int rICNT020_02_05) {
		RICNT020_02_05 = rICNT020_02_05;
	}

	public int getRICNT020_02_06() {
		return RICNT020_02_06;
	}

	public void setRICNT020_02_06(int rICNT020_02_06) {
		RICNT020_02_06 = rICNT020_02_06;
	}

	public int getRICNT020_02_07() {
		return RICNT020_02_07;
	}

	public void setRICNT020_02_07(int rICNT020_02_07) {
		RICNT020_02_07 = rICNT020_02_07;
	}

	public String getRICNT010_03() {
		return RICNT010_03;
	}

	public void setRICNT010_03(String rICNT010_03) {
		RICNT010_03 = rICNT010_03;
	}

	public int getRICNT020_03_01() {
		return RICNT020_03_01;
	}

	public void setRICNT020_03_01(int rICNT020_03_01) {
		RICNT020_03_01 = rICNT020_03_01;
	}

	public int getRICNT020_03_02() {
		return RICNT020_03_02;
	}

	public void setRICNT020_03_02(int rICNT020_03_02) {
		RICNT020_03_02 = rICNT020_03_02;
	}

	public int getRICNT020_03_03() {
		return RICNT020_03_03;
	}

	public void setRICNT020_03_03(int rICNT020_03_03) {
		RICNT020_03_03 = rICNT020_03_03;
	}

	public int getRICNT020_03_04() {
		return RICNT020_03_04;
	}

	public void setRICNT020_03_04(int rICNT020_03_04) {
		RICNT020_03_04 = rICNT020_03_04;
	}

	public int getRICNT020_03_05() {
		return RICNT020_03_05;
	}

	public void setRICNT020_03_05(int rICNT020_03_05) {
		RICNT020_03_05 = rICNT020_03_05;
	}

	public int getRICNT020_03_06() {
		return RICNT020_03_06;
	}

	public void setRICNT020_03_06(int rICNT020_03_06) {
		RICNT020_03_06 = rICNT020_03_06;
	}

	public int getRICNT020_03_07() {
		return RICNT020_03_07;
	}

	public void setRICNT020_03_07(int rICNT020_03_07) {
		RICNT020_03_07 = rICNT020_03_07;
	}

	public String getRICNT010_04() {
		return RICNT010_04;
	}

	public void setRICNT010_04(String rICNT010_04) {
		RICNT010_04 = rICNT010_04;
	}

	public int getRICNT020_04_01() {
		return RICNT020_04_01;
	}

	public void setRICNT020_04_01(int rICNT020_04_01) {
		RICNT020_04_01 = rICNT020_04_01;
	}

	public int getRICNT020_04_02() {
		return RICNT020_04_02;
	}

	public void setRICNT020_04_02(int rICNT020_04_02) {
		RICNT020_04_02 = rICNT020_04_02;
	}

	public int getRICNT020_04_03() {
		return RICNT020_04_03;
	}

	public void setRICNT020_04_03(int rICNT020_04_03) {
		RICNT020_04_03 = rICNT020_04_03;
	}

	public int getRICNT020_04_04() {
		return RICNT020_04_04;
	}

	public void setRICNT020_04_04(int rICNT020_04_04) {
		RICNT020_04_04 = rICNT020_04_04;
	}

	public int getRICNT020_04_05() {
		return RICNT020_04_05;
	}

	public void setRICNT020_04_05(int rICNT020_04_05) {
		RICNT020_04_05 = rICNT020_04_05;
	}

	public int getRICNT020_04_06() {
		return RICNT020_04_06;
	}

	public void setRICNT020_04_06(int rICNT020_04_06) {
		RICNT020_04_06 = rICNT020_04_06;
	}

	public int getRICNT020_04_07() {
		return RICNT020_04_07;
	}

	public void setRICNT020_04_07(int rICNT020_04_07) {
		RICNT020_04_07 = rICNT020_04_07;
	}

	public String getRICNT010_05() {
		return RICNT010_05;
	}

	public void setRICNT010_05(String rICNT010_05) {
		RICNT010_05 = rICNT010_05;
	}

	public int getRICNT020_05_01() {
		return RICNT020_05_01;
	}

	public void setRICNT020_05_01(int rICNT020_05_01) {
		RICNT020_05_01 = rICNT020_05_01;
	}

	public int getRICNT020_05_02() {
		return RICNT020_05_02;
	}

	public void setRICNT020_05_02(int rICNT020_05_02) {
		RICNT020_05_02 = rICNT020_05_02;
	}

	public int getRICNT020_05_03() {
		return RICNT020_05_03;
	}

	public void setRICNT020_05_03(int rICNT020_05_03) {
		RICNT020_05_03 = rICNT020_05_03;
	}

	public int getRICNT020_05_04() {
		return RICNT020_05_04;
	}

	public void setRICNT020_05_04(int rICNT020_05_04) {
		RICNT020_05_04 = rICNT020_05_04;
	}

	public int getRICNT020_05_05() {
		return RICNT020_05_05;
	}

	public void setRICNT020_05_05(int rICNT020_05_05) {
		RICNT020_05_05 = rICNT020_05_05;
	}

	public int getRICNT020_05_06() {
		return RICNT020_05_06;
	}

	public void setRICNT020_05_06(int rICNT020_05_06) {
		RICNT020_05_06 = rICNT020_05_06;
	}

	public int getRICNT020_05_07() {
		return RICNT020_05_07;
	}

	public void setRICNT020_05_07(int rICNT020_05_07) {
		RICNT020_05_07 = rICNT020_05_07;
	}

	public String getRICNT010_06() {
		return RICNT010_06;
	}

	public void setRICNT010_06(String rICNT010_06) {
		RICNT010_06 = rICNT010_06;
	}

	public int getRICNT020_06_01() {
		return RICNT020_06_01;
	}

	public void setRICNT020_06_01(int rICNT020_06_01) {
		RICNT020_06_01 = rICNT020_06_01;
	}

	public int getRICNT020_06_02() {
		return RICNT020_06_02;
	}

	public void setRICNT020_06_02(int rICNT020_06_02) {
		RICNT020_06_02 = rICNT020_06_02;
	}

	public int getRICNT020_06_03() {
		return RICNT020_06_03;
	}

	public void setRICNT020_06_03(int rICNT020_06_03) {
		RICNT020_06_03 = rICNT020_06_03;
	}

	public int getRICNT020_06_04() {
		return RICNT020_06_04;
	}

	public void setRICNT020_06_04(int rICNT020_06_04) {
		RICNT020_06_04 = rICNT020_06_04;
	}

	public int getRICNT020_06_05() {
		return RICNT020_06_05;
	}

	public void setRICNT020_06_05(int rICNT020_06_05) {
		RICNT020_06_05 = rICNT020_06_05;
	}

	public int getRICNT020_06_06() {
		return RICNT020_06_06;
	}

	public void setRICNT020_06_06(int rICNT020_06_06) {
		RICNT020_06_06 = rICNT020_06_06;
	}

	public int getRICNT020_06_07() {
		return RICNT020_06_07;
	}

	public void setRICNT020_06_07(int rICNT020_06_07) {
		RICNT020_06_07 = rICNT020_06_07;
	}

	public int getRICNT010_07() {
		return RICNT010_07;
	}

	public void setRICNT010_07(int rICNT010_07) {
		RICNT010_07 = rICNT010_07;
	}

	public int getRICNT020_07_01() {
		return RICNT020_07_01;
	}

	public void setRICNT020_07_01(int rICNT020_07_01) {
		RICNT020_07_01 = rICNT020_07_01;
	}

	public int getRICNT020_07_02() {
		return RICNT020_07_02;
	}

	public void setRICNT020_07_02(int rICNT020_07_02) {
		RICNT020_07_02 = rICNT020_07_02;
	}

	public int getRICNT020_07_03() {
		return RICNT020_07_03;
	}

	public void setRICNT020_07_03(int rICNT020_07_03) {
		RICNT020_07_03 = rICNT020_07_03;
	}

	public int getRICNT020_07_04() {
		return RICNT020_07_04;
	}

	public void setRICNT020_07_04(int rICNT020_07_04) {
		RICNT020_07_04 = rICNT020_07_04;
	}

	public int getRICNT020_07_05() {
		return RICNT020_07_05;
	}

	public void setRICNT020_07_05(int rICNT020_07_05) {
		RICNT020_07_05 = rICNT020_07_05;
	}

	public int getRICNT020_07_06() {
		return RICNT020_07_06;
	}

	public void setRICNT020_07_06(int rICNT020_07_06) {
		RICNT020_07_06 = rICNT020_07_06;
	}

	public int getRICNT020_07_07() {
		return RICNT020_07_07;
	}

	public void setRICNT020_07_07(int rICNT020_07_07) {
		RICNT020_07_07 = rICNT020_07_07;
	}

	public String getRICNT010_08() {
		return RICNT010_08;
	}

	public void setRICNT010_08(String rICNT010_08) {
		RICNT010_08 = rICNT010_08;
	}

	public int getRICNT020_08_01() {
		return RICNT020_08_01;
	}

	public void setRICNT020_08_01(int rICNT020_08_01) {
		RICNT020_08_01 = rICNT020_08_01;
	}

	public int getRICNT020_08_02() {
		return RICNT020_08_02;
	}

	public void setRICNT020_08_02(int rICNT020_08_02) {
		RICNT020_08_02 = rICNT020_08_02;
	}

	public int getRICNT020_08_03() {
		return RICNT020_08_03;
	}

	public void setRICNT020_08_03(int rICNT020_08_03) {
		RICNT020_08_03 = rICNT020_08_03;
	}

	public int getRICNT020_08_04() {
		return RICNT020_08_04;
	}

	public void setRICNT020_08_04(int rICNT020_08_04) {
		RICNT020_08_04 = rICNT020_08_04;
	}

	public int getRICNT020_08_05() {
		return RICNT020_08_05;
	}

	public void setRICNT020_08_05(int rICNT020_08_05) {
		RICNT020_08_05 = rICNT020_08_05;
	}

	public int getRICNT020_08_06() {
		return RICNT020_08_06;
	}

	public void setRICNT020_08_06(int rICNT020_08_06) {
		RICNT020_08_06 = rICNT020_08_06;
	}

	public int getRICNT020_08_07() {
		return RICNT020_08_07;
	}

	public void setRICNT020_08_07(int rICNT020_08_07) {
		RICNT020_08_07 = rICNT020_08_07;
	}

	public String getRICNT010_09() {
		return RICNT010_09;
	}

	public void setRICNT010_09(String rICNT010_09) {
		RICNT010_09 = rICNT010_09;
	}

	public int getRICNT020_09_01() {
		return RICNT020_09_01;
	}

	public void setRICNT020_09_01(int rICNT020_09_01) {
		RICNT020_09_01 = rICNT020_09_01;
	}

	public int getRICNT020_09_02() {
		return RICNT020_09_02;
	}

	public void setRICNT020_09_02(int rICNT020_09_02) {
		RICNT020_09_02 = rICNT020_09_02;
	}

	public int getRICNT020_09_03() {
		return RICNT020_09_03;
	}

	public void setRICNT020_09_03(int rICNT020_09_03) {
		RICNT020_09_03 = rICNT020_09_03;
	}

	public int getRICNT020_09_04() {
		return RICNT020_09_04;
	}

	public void setRICNT020_09_04(int rICNT020_09_04) {
		RICNT020_09_04 = rICNT020_09_04;
	}

	public int getRICNT020_09_05() {
		return RICNT020_09_05;
	}

	public void setRICNT020_09_05(int rICNT020_09_05) {
		RICNT020_09_05 = rICNT020_09_05;
	}

	public int getRICNT020_09_06() {
		return RICNT020_09_06;
	}

	public void setRICNT020_09_06(int rICNT020_09_06) {
		RICNT020_09_06 = rICNT020_09_06;
	}

	public int getRICNT020_09_07() {
		return RICNT020_09_07;
	}

	public void setRICNT020_09_07(int rICNT020_09_07) {
		RICNT020_09_07 = rICNT020_09_07;
	}

	public String getRICNT010_10() {
		return RICNT010_10;
	}

	public void setRICNT010_10(String rICNT010_10) {
		RICNT010_10 = rICNT010_10;
	}

	public int getRICNT020_10_01() {
		return RICNT020_10_01;
	}

	public void setRICNT020_10_01(int rICNT020_10_01) {
		RICNT020_10_01 = rICNT020_10_01;
	}

	public int getRICNT020_10_02() {
		return RICNT020_10_02;
	}

	public void setRICNT020_10_02(int rICNT020_10_02) {
		RICNT020_10_02 = rICNT020_10_02;
	}

	public int getRICNT020_10_03() {
		return RICNT020_10_03;
	}

	public void setRICNT020_10_03(int rICNT020_10_03) {
		RICNT020_10_03 = rICNT020_10_03;
	}

	public int getRICNT020_10_04() {
		return RICNT020_10_04;
	}

	public void setRICNT020_10_04(int rICNT020_10_04) {
		RICNT020_10_04 = rICNT020_10_04;
	}

	public int getRICNT020_10_05() {
		return RICNT020_10_05;
	}

	public void setRICNT020_10_05(int rICNT020_10_05) {
		RICNT020_10_05 = rICNT020_10_05;
	}

	public int getRICNT020_10_06() {
		return RICNT020_10_06;
	}

	public void setRICNT020_10_06(int rICNT020_10_06) {
		RICNT020_10_06 = rICNT020_10_06;
	}

	public int getRICNT020_10_07() {
		return RICNT020_10_07;
	}

	public void setRICNT020_10_07(int rICNT020_10_07) {
		RICNT020_10_07 = rICNT020_10_07;
	}

	public String getRICNT010101() {
		return RICNT010101;
	}

	public void setRICNT010101(String rICNT010101) {
		RICNT010101 = rICNT010101;
	}

	public int getRICNT020101_01() {
		return RICNT020101_01;
	}

	public void setRICNT020101_01(int rICNT020101_01) {
		RICNT020101_01 = rICNT020101_01;
	}

	public int getRICNT020101_02() {
		return RICNT020101_02;
	}

	public void setRICNT020101_02(int rICNT020101_02) {
		RICNT020101_02 = rICNT020101_02;
	}

	public int getRICNT020101_03() {
		return RICNT020101_03;
	}

	public void setRICNT020101_03(int rICNT020101_03) {
		RICNT020101_03 = rICNT020101_03;
	}

	public int getRICNT020101_04() {
		return RICNT020101_04;
	}

	public void setRICNT020101_04(int rICNT020101_04) {
		RICNT020101_04 = rICNT020101_04;
	}

	public int getRICNT020101_05() {
		return RICNT020101_05;
	}

	public void setRICNT020101_05(int rICNT020101_05) {
		RICNT020101_05 = rICNT020101_05;
	}

	public int getRICNT020101_06() {
		return RICNT020101_06;
	}

	public void setRICNT020101_06(int rICNT020101_06) {
		RICNT020101_06 = rICNT020101_06;
	}

	public int getRICNT020101_07() {
		return RICNT020101_07;
	}

	public void setRICNT020101_07(int rICNT020101_07) {
		RICNT020101_07 = rICNT020101_07;
	}

	public String getRICNT010102() {
		return RICNT010102;
	}

	public void setRICNT010102(String rICNT010102) {
		RICNT010102 = rICNT010102;
	}

	public int getRICNT020102_01() {
		return RICNT020102_01;
	}

	public void setRICNT020102_01(int rICNT020102_01) {
		RICNT020102_01 = rICNT020102_01;
	}

	public int getRICNT020102_02() {
		return RICNT020102_02;
	}

	public void setRICNT020102_02(int rICNT020102_02) {
		RICNT020102_02 = rICNT020102_02;
	}

	public int getRICNT020102_03() {
		return RICNT020102_03;
	}

	public void setRICNT020102_03(int rICNT020102_03) {
		RICNT020102_03 = rICNT020102_03;
	}

	public int getRICNT020102_04() {
		return RICNT020102_04;
	}

	public void setRICNT020102_04(int rICNT020102_04) {
		RICNT020102_04 = rICNT020102_04;
	}

	public int getRICNT020102_05() {
		return RICNT020102_05;
	}

	public void setRICNT020102_05(int rICNT020102_05) {
		RICNT020102_05 = rICNT020102_05;
	}

	public int getRICNT020102_06() {
		return RICNT020102_06;
	}

	public void setRICNT020102_06(int rICNT020102_06) {
		RICNT020102_06 = rICNT020102_06;
	}

	public int getRICNT020102_07() {
		return RICNT020102_07;
	}

	public void setRICNT020102_07(int rICNT020102_07) {
		RICNT020102_07 = rICNT020102_07;
	}

	public String getRICNT010103() {
		return RICNT010103;
	}

	public void setRICNT010103(String rICNT010103) {
		RICNT010103 = rICNT010103;
	}

	public int getRICNT020103_01() {
		return RICNT020103_01;
	}

	public void setRICNT020103_01(int rICNT020103_01) {
		RICNT020103_01 = rICNT020103_01;
	}

	public int getRICNT020103_02() {
		return RICNT020103_02;
	}

	public void setRICNT020103_02(int rICNT020103_02) {
		RICNT020103_02 = rICNT020103_02;
	}

	public int getRICNT020103_03() {
		return RICNT020103_03;
	}

	public void setRICNT020103_03(int rICNT020103_03) {
		RICNT020103_03 = rICNT020103_03;
	}

	public int getRICNT020103_04() {
		return RICNT020103_04;
	}

	public void setRICNT020103_04(int rICNT020103_04) {
		RICNT020103_04 = rICNT020103_04;
	}

	public int getRICNT020103_05() {
		return RICNT020103_05;
	}

	public void setRICNT020103_05(int rICNT020103_05) {
		RICNT020103_05 = rICNT020103_05;
	}

	public int getRICNT020103_06() {
		return RICNT020103_06;
	}

	public void setRICNT020103_06(int rICNT020103_06) {
		RICNT020103_06 = rICNT020103_06;
	}

	public int getRICNT020103_07() {
		return RICNT020103_07;
	}

	public void setRICNT020103_07(int rICNT020103_07) {
		RICNT020103_07 = rICNT020103_07;
	}

	public String getRICNT010104() {
		return RICNT010104;
	}

	public void setRICNT010104(String rICNT010104) {
		RICNT010104 = rICNT010104;
	}

	public int getRICNT020104_01() {
		return RICNT020104_01;
	}

	public void setRICNT020104_01(int rICNT020104_01) {
		RICNT020104_01 = rICNT020104_01;
	}

	public int getRICNT020104_02() {
		return RICNT020104_02;
	}

	public void setRICNT020104_02(int rICNT020104_02) {
		RICNT020104_02 = rICNT020104_02;
	}

	public int getRICNT020104_03() {
		return RICNT020104_03;
	}

	public void setRICNT020104_03(int rICNT020104_03) {
		RICNT020104_03 = rICNT020104_03;
	}

	public int getRICNT020104_04() {
		return RICNT020104_04;
	}

	public void setRICNT020104_04(int rICNT020104_04) {
		RICNT020104_04 = rICNT020104_04;
	}

	public int getRICNT020104_05() {
		return RICNT020104_05;
	}

	public void setRICNT020104_05(int rICNT020104_05) {
		RICNT020104_05 = rICNT020104_05;
	}

	public int getRICNT020104_06() {
		return RICNT020104_06;
	}

	public void setRICNT020104_06(int rICNT020104_06) {
		RICNT020104_06 = rICNT020104_06;
	}

	public int getRICNT020104_07() {
		return RICNT020104_07;
	}

	public void setRICNT020104_07(int rICNT020104_07) {
		RICNT020104_07 = rICNT020104_07;
	}

	public String getRICNT010105() {
		return RICNT010105;
	}

	public void setRICNT010105(String rICNT010105) {
		RICNT010105 = rICNT010105;
	}

	public int getRICNT020105_01() {
		return RICNT020105_01;
	}

	public void setRICNT020105_01(int rICNT020105_01) {
		RICNT020105_01 = rICNT020105_01;
	}

	public int getRICNT020105_02() {
		return RICNT020105_02;
	}

	public void setRICNT020105_02(int rICNT020105_02) {
		RICNT020105_02 = rICNT020105_02;
	}

	public int getRICNT020105_03() {
		return RICNT020105_03;
	}

	public void setRICNT020105_03(int rICNT020105_03) {
		RICNT020105_03 = rICNT020105_03;
	}

	public int getRICNT020105_04() {
		return RICNT020105_04;
	}

	public void setRICNT020105_04(int rICNT020105_04) {
		RICNT020105_04 = rICNT020105_04;
	}

	public int getRICNT020105_05() {
		return RICNT020105_05;
	}

	public void setRICNT020105_05(int rICNT020105_05) {
		RICNT020105_05 = rICNT020105_05;
	}

	public int getRICNT020105_06() {
		return RICNT020105_06;
	}

	public void setRICNT020105_06(int rICNT020105_06) {
		RICNT020105_06 = rICNT020105_06;
	}

	public int getRICNT020105_07() {
		return RICNT020105_07;
	}

	public void setRICNT020105_07(int rICNT020105_07) {
		RICNT020105_07 = rICNT020105_07;
	}

	public String getRICNT010106() {
		return RICNT010106;
	}

	public void setRICNT010106(String rICNT010106) {
		RICNT010106 = rICNT010106;
	}

	public int getRICNT020106_01() {
		return RICNT020106_01;
	}

	public void setRICNT020106_01(int rICNT020106_01) {
		RICNT020106_01 = rICNT020106_01;
	}

	public int getRICNT020106_02() {
		return RICNT020106_02;
	}

	public void setRICNT020106_02(int rICNT020106_02) {
		RICNT020106_02 = rICNT020106_02;
	}

	public int getRICNT020106_03() {
		return RICNT020106_03;
	}

	public void setRICNT020106_03(int rICNT020106_03) {
		RICNT020106_03 = rICNT020106_03;
	}

	public int getRICNT020106_04() {
		return RICNT020106_04;
	}

	public void setRICNT020106_04(int rICNT020106_04) {
		RICNT020106_04 = rICNT020106_04;
	}

	public int getRICNT020106_05() {
		return RICNT020106_05;
	}

	public void setRICNT020106_05(int rICNT020106_05) {
		RICNT020106_05 = rICNT020106_05;
	}

	public int getRICNT020106_06() {
		return RICNT020106_06;
	}

	public void setRICNT020106_06(int rICNT020106_06) {
		RICNT020106_06 = rICNT020106_06;
	}

	public int getRICNT020106_07() {
		return RICNT020106_07;
	}

	public void setRICNT020106_07(int rICNT020106_07) {
		RICNT020106_07 = rICNT020106_07;
	}

	public String getRICNT010107() {
		return RICNT010107;
	}

	public void setRICNT010107(String rICNT010107) {
		RICNT010107 = rICNT010107;
	}

	public int getRICNT020107_01() {
		return RICNT020107_01;
	}

	public void setRICNT020107_01(int rICNT020107_01) {
		RICNT020107_01 = rICNT020107_01;
	}

	public int getRICNT020107_02() {
		return RICNT020107_02;
	}

	public void setRICNT020107_02(int rICNT020107_02) {
		RICNT020107_02 = rICNT020107_02;
	}

	public int getRICNT020107_03() {
		return RICNT020107_03;
	}

	public void setRICNT020107_03(int rICNT020107_03) {
		RICNT020107_03 = rICNT020107_03;
	}

	public int getRICNT020107_04() {
		return RICNT020107_04;
	}

	public void setRICNT020107_04(int rICNT020107_04) {
		RICNT020107_04 = rICNT020107_04;
	}

	public int getRICNT020107_05() {
		return RICNT020107_05;
	}

	public void setRICNT020107_05(int rICNT020107_05) {
		RICNT020107_05 = rICNT020107_05;
	}

	public int getRICNT020107_06() {
		return RICNT020107_06;
	}

	public void setRICNT020107_06(int rICNT020107_06) {
		RICNT020107_06 = rICNT020107_06;
	}

	public int getRICNT020107_07() {
		return RICNT020107_07;
	}

	public void setRICNT020107_07(int rICNT020107_07) {
		RICNT020107_07 = rICNT020107_07;
	}

	public String getRICNT010108() {
		return RICNT010108;
	}

	public void setRICNT010108(String rICNT010108) {
		RICNT010108 = rICNT010108;
	}

	public int getRICNT020108_01() {
		return RICNT020108_01;
	}

	public void setRICNT020108_01(int rICNT020108_01) {
		RICNT020108_01 = rICNT020108_01;
	}

	public int getRICNT020108_02() {
		return RICNT020108_02;
	}

	public void setRICNT020108_02(int rICNT020108_02) {
		RICNT020108_02 = rICNT020108_02;
	}

	public int getRICNT020108_03() {
		return RICNT020108_03;
	}

	public void setRICNT020108_03(int rICNT020108_03) {
		RICNT020108_03 = rICNT020108_03;
	}

	public int getRICNT020108_04() {
		return RICNT020108_04;
	}

	public void setRICNT020108_04(int rICNT020108_04) {
		RICNT020108_04 = rICNT020108_04;
	}

	public int getRICNT020108_05() {
		return RICNT020108_05;
	}

	public void setRICNT020108_05(int rICNT020108_05) {
		RICNT020108_05 = rICNT020108_05;
	}

	public int getRICNT020108_06() {
		return RICNT020108_06;
	}

	public void setRICNT020108_06(int rICNT020108_06) {
		RICNT020108_06 = rICNT020108_06;
	}

	public int getRICNT020108_07() {
		return RICNT020108_07;
	}

	public void setRICNT020108_07(int rICNT020108_07) {
		RICNT020108_07 = rICNT020108_07;
	}

	public String getRICNT010109() {
		return RICNT010109;
	}

	public void setRICNT010109(String rICNT010109) {
		RICNT010109 = rICNT010109;
	}

	public int getRICNT020109_01() {
		return RICNT020109_01;
	}

	public void setRICNT020109_01(int rICNT020109_01) {
		RICNT020109_01 = rICNT020109_01;
	}

	public int getRICNT020109_02() {
		return RICNT020109_02;
	}

	public void setRICNT020109_02(int rICNT020109_02) {
		RICNT020109_02 = rICNT020109_02;
	}

	public int getRICNT020109_03() {
		return RICNT020109_03;
	}

	public void setRICNT020109_03(int rICNT020109_03) {
		RICNT020109_03 = rICNT020109_03;
	}

	public int getRICNT020109_04() {
		return RICNT020109_04;
	}

	public void setRICNT020109_04(int rICNT020109_04) {
		RICNT020109_04 = rICNT020109_04;
	}

	public int getRICNT020109_05() {
		return RICNT020109_05;
	}

	public void setRICNT020109_05(int rICNT020109_05) {
		RICNT020109_05 = rICNT020109_05;
	}

	public int getRICNT020109_06() {
		return RICNT020109_06;
	}

	public void setRICNT020109_06(int rICNT020109_06) {
		RICNT020109_06 = rICNT020109_06;
	}

	public int getRICNT020109_07() {
		return RICNT020109_07;
	}

	public void setRICNT020109_07(int rICNT020109_07) {
		RICNT020109_07 = rICNT020109_07;
	}

	public String getRICNT010110() {
		return RICNT010110;
	}

	public void setRICNT010110(String rICNT010110) {
		RICNT010110 = rICNT010110;
	}

	public int getRICNT020110_01() {
		return RICNT020110_01;
	}

	public void setRICNT020110_01(int rICNT020110_01) {
		RICNT020110_01 = rICNT020110_01;
	}

	public int getRICNT020110_02() {
		return RICNT020110_02;
	}

	public void setRICNT020110_02(int rICNT020110_02) {
		RICNT020110_02 = rICNT020110_02;
	}

	public int getRICNT020110_03() {
		return RICNT020110_03;
	}

	public void setRICNT020110_03(int rICNT020110_03) {
		RICNT020110_03 = rICNT020110_03;
	}

	public int getRICNT020110_04() {
		return RICNT020110_04;
	}

	public void setRICNT020110_04(int rICNT020110_04) {
		RICNT020110_04 = rICNT020110_04;
	}

	public int getRICNT020110_05() {
		return RICNT020110_05;
	}

	public void setRICNT020110_05(int rICNT020110_05) {
		RICNT020110_05 = rICNT020110_05;
	}

	public int getRICNT020110_06() {
		return RICNT020110_06;
	}

	public void setRICNT020110_06(int rICNT020110_06) {
		RICNT020110_06 = rICNT020110_06;
	}

	public int getRICNT020110_07() {
		return RICNT020110_07;
	}

	public void setRICNT020110_07(int rICNT020110_07) {
		RICNT020110_07 = rICNT020110_07;
	}

}
