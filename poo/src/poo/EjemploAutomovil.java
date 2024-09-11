package poo;

import java.util.Date;

public class EjemploAutomovil {
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
		//deportivo.setFabricante("Chevrolet");
		//deportivo.setModelo("Camaro R7");
		deportivo.setColor("Blanco");
		deportivo.setCilindraje(22.2);
		
		
		//USAMOS METODO DE TALLE DE NUESTRA INSTANCIA AUTOMOVIL
		//auto.detalle();
		deportivo.detalle();
		
		//AL USAR STRING BUILDER
		//System.out.println(auto.detalle());
		System.out.println(deportivo.detalle());
		 
		//METODOS SEPARADOS
		//System.out.println(auto.acelerar(300));
		//System.out.println(auto.frenar());
		
		//System.out.println(auto.acelerarFrenar(333));
		System.out.println(deportivo.getModelo());
		System.out.println(deportivo.getFabricante());
		
		/**Llama al metodo que solcita un float*/
		System.out.println("KM por litro: "+ deportivo.calcularConsumo(300, 0.76f));
		
		/**Llama al metodo que solcita un Int*/
		System.out.println("KM por litro: "+ deportivo.calcularConsumo(300, 76));
		
		System.out.println("#################################");
		Automovil Jeep = new Automovil("Jepp", "Compass", "Blanco", 1.4, 79);
		System.out.println(Jeep.detalle());

		Automovil nissan = new Automovil("Nissan","Navara","Gris Oscuro",1.3); 
		Automovil nissan2 = new Automovil("Nissan","Navara","Gris Oscuro",1.3); 

		System.out.println(nissan.detalle());
		System.out.println("##### MANEJO DE EQUXALS ######");
		
		//COMPARA POR REFERENCIA
		//verificar si dos variables apuntan al mismo objeto en memoria. En otras palabras, 
		//se comprueba si ambas variables son referencias al mismo lugar en la memoria, 
		//no sólo si sus contenidos son iguales.
		System.out.println("USANDO =="+ (nissan == nissan2)); //COMPARA POR REFERENCIA
		
		//COMPARA POR VALOR
		//verificar si los datos contenidos en dos variables son iguales. 
		//Esto se refiere al contenido o la información que cada variable almacena.
		System.out.println("USANDO EQUALS"+(nissan.equals(nissan2)));//COMPARA CON EL 
		
		Automovil auto = new Automovil();
		System.out.println("VALIDA EQUALS NULOS"+auto.equals(nissan));
		
		Date fecha = new Date();
		System.out.println("VALIDA TIPO AUTO CON TIPO FECHA "+auto.equals(fecha));
		
		
		//TO STRING
		System.out.println(nissan);
		System.out.println(nissan.toString());
		
	}

}
