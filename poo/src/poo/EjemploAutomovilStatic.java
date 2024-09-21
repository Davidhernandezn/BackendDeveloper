package poo;

import java.util.Date;

public class EjemploAutomovilStatic {
//PANTILLA PARA CREAR OBJETOS, 
	
	//STATIC, METODO DE LA CLASE, MAS NO DEL METOOO
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NEW CREA INSTANCIA, INICIALIZA EL OBJETO Y LO GUARDA EN LA MEMORIA
		// TIPO DATO Automovil
		/**Automovil auto = new Automovil();
		auto.fabricante ="Jeep";
		auto.modelo = "Compass";
		auto.color="Blanco";
		auto.cilindraje = 12.2;**/
		
		Automovil familiar = new Automovil(); //CONSTUCTOR SIN PARAMETROS
		  
		/**Para usar constructor necesitas agregar new*/
		Automovil deportivo = new Automovil("Chevrolet", "Camaro R7"); //CONSTUCTOR CON PARAMETROS
		deportivo.setColor("Blanco");
		deportivo.setCilindraje(22.2);

		
		Automovil nissan = new Automovil("Nissan","Navara","Gris Oscuro",1.3); 
		Automovil nissan2 = new Automovil("Nissan","Navara","Gris Oscuro",1.3); 

		/*ATRIBUTO STATIC CAMBIA PARA TODOS
		 * nissan.colorPatente = "Negro";
		 * 
		 * */
		
		nissan2.setColor("Azul");
		Automovil.getColorPatente();
		
		System.out.println(nissan2.verDetalle());
		System.out.println(nissan.verDetalle());
		
	}

}
