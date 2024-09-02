package poo;

public class EjemploAutomovil {
//PANTILLA PARA CREAR OBJETOS, 
	
	//STATIC, METODO DE LA CLASE, MAS NO DEL METOOO
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NEW CREA INSTANCIA, INICIALIZA EL OBJETO Y LO GUARDA EN LA MEMORIA
		// TIPO DATO Automovil
		Automovil auto = new Automovil();
		auto.fabricante ="Jeep";
		auto.modelo = "Compass";
		auto.color="Blanco";
		auto.cilindraje = 12.2;
		
		Automovil deportivo = new Automovil();
		deportivo.fabricante ="Chevrolet";
		deportivo.modelo = "Camaro R7";
		deportivo.color="Blanco";
		deportivo.cilindraje = 22.2;
		
		
		//USAMOS METODO DE TALLE DE NUESTRA INSTANCIA AUTOMOVIL
		auto.detalle();
		deportivo.detalle();
		
		//AL USAR STRING BUILDER
		System.out.println(auto.detalle());
		System.out.println(deportivo.detalle());		
	}

}
