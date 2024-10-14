package poo;

import java.util.Date;

public class EjemploAutomovilStatic {
//PANTILLA PARA CREAR OBJETOS, 
	
	//STATIC, METODO DE LA CLASE, MAS NO DEL METOOO
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("## STATIC##");
		// TODO Auto-generated method stub

		// NEW CREA INSTANCIA, INICIALIZA EL OBJETO Y LO GUARDA EN LA MEMORIA
		// TIPO DATO Automovil
		//Automovil auto = new Automovil();
		/**auto.fabricante ="Jeep";
		auto.modelo = "Compass";
		auto.color="Blanco";
		auto.cilindraje = 12.2;**/
		
		//Automovil familiar = new Automovil(); //CONSTUCTOR SIN PARAMETROS
		  
		/**Para usar constructor necesitas agregar new*/
		//CONSTRUCTOR CON 2 PARAMETROS CON CONTADOR 1
		Automovil deportivo = new Automovil("Chevrolet", "Camaro R7"); //CONSTUCTOR CON PARAMETROS
		deportivo.setColor("Blanco");
		deportivo.setCilindraje(22.2);
		
		//LLAMA AL CONSTRUCTOR CON OTROS PARAMETROS QUE LLAMAN AL CONSTRUCTOR CON 2 PARAMETROS
		//CONTADOR 2
		Automovil nissan = new Automovil("Nissan","Navara",Automovil.COLOR_AZUL,1.3); 
		//Automovil nissan2 = new Automovil("Nissan","Navara","Gris Oscuro",1.3); 

		/*ATRIBUTO STATIC CAMBIA PARA TODOS
		 * nissan.colorPatente = "Negro";
		 * 
		 * */
		
		//nissan2.setColor("Azul");
		//Automovil.getColorPatente();
		
		System.out.println(deportivo.verDetalle());
		System.out.println(nissan.verDetalle());
		
		Automovil.setCapacidadTanqueEstatico(45); //ACTUALIZA CAPACIDAD
		/*** AL SER ESTATICO DEBE EL METODO DEBE LLAMARSE MEDIANTE SU NOMBRE DE CLASE */
		//System.out.println("KM por Litros: "+ nissan.calcularConsumoEstatico(300, 60));
		//System.out.println("KM por Litros: "+ Automovil.calcularConsumoEstatico(300, 60));
		
		System.out.println("VELICIDAD EN CARRETERA " + Automovil.VELOCIDAD_MAX_CARRETERA);
		System.out.println("VELICIDAD EN CIUDAD "+ Automovil.VELOCIDAD_MAX_CIUDAD);

		
	}

}
