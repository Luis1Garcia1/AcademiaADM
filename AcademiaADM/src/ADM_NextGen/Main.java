/**
 * Proyecto sobre Reglas de Negocio de una Inversion
 * 
 * Datos de Entrada:
 * 	- Inversion Inicial
 * 	- Aportacion Anual
 * 	- % De incremento a la aportación anual
 * 	- Años de inversion
 * 	- Rendimiento de inversión
 * 
 * Tabla de Resultados:
 * 	- Año
 * 	- Saldo Inicial
 * 	- Aportacion
 * 	- Rendimiento
 * 	- Saldo Final
 *
 * Resumen de Resultado:
 * 	- Monto Final
 * 	- Ganancia por Inversion
 */
package ADM_NextGen;

import java.util.*;

/**
 * @author luisgarc
 * @date 6/5/2023
 *
 */
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inverInicial=0, aportAnual=0;
		double increAnual=0, inverAnio=0, inverRendimiento=0;
		Scanner entrada = new Scanner(System.in);
		Main main1 = new Main();
		
		System.out.println("Ingrese su Inversión Inicial ");
		inverInicial = entrada.nextDouble();
		
		System.out.println("Ingrese su Aportación Anual ");
		aportAnual = entrada.nextDouble();
		
		System.out.println("Ingrese el Incremento Anual (%) ");
		increAnual = entrada.nextDouble();
		
		System.out.println("Ingrese los Años para su Inversión ");
		inverAnio = entrada.nextDouble();
		
		System.out.println("Ingrese el Rendimiento para su Inversión (%) ");
		inverRendimiento = entrada.nextDouble();
		
		main1.getResults(inverInicial,aportAnual,increAnual,inverAnio,inverRendimiento);
	}
	
	public void getResults(double inverInicial, double aportAnual, double increAnual, double inverAnio, double inverRendimiento) {
		System.out.println("Inversión inicial | Aportación anual | Incremento anual | Años de inversión | Rendimiento");
		System.out.println("\t" + inverInicial + "\t         " + aportAnual + "\t           " + increAnual + "\t            " + inverAnio + "\t              " + inverRendimiento);
		System.out.println("\n");
		
		double rendimiento, aportacion, saldoFinal;		
		System.out.println("Año  Saldo Inicial  Aportación  Rendimiento  Saldo Final");
		for(int i =0 ; i < inverAnio; i++) {
			if(i == 0) {
				// Saldo Inicial y Aportacion se incrementan despues del año 0
				aportacion = aportAnual;
				rendimiento = ((inverInicial + aportacion) * (inverRendimiento/100));
				saldoFinal = inverInicial + aportacion + rendimiento;
				System.out.println(" " + (i+1) + "       " + inverInicial + "       " + aportAnual + "      " + rendimiento + "       " + saldoFinal);
			}else {
				aportacion = ((aportAnual) * (1+(increAnual/100)));
				rendimiento = ((inverInicial + aportacion) * (inverRendimiento/100));
				
				System.out.println(" " + (i+1) + "       " + inverInicial + "       " + aportacion + "      " + rendimiento);
			}
		}
	}

}
