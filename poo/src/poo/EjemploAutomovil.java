package poo;

public class EjemploAutomovil {
//PANTILLA PARA CREAR OBJETOS, 
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
		
		
		System.out.println("auto.fabricante = " + auto.fabricante); // llegar a los atributos
		System.out.println("auto.modelo = " + auto.modelo);
		System.out.println("auto.color = " + auto.color);
		System.out.println("auto.cilindraje = " + auto.cilindraje);
			
		System.out.println("deportivo.fabricante = " + deportivo.fabricante); // llegar a los atributos
		System.out.println("deportivo.modelo = " + deportivo.modelo);
		System.out.println("deportivo.color = " + deportivo.color);
		System.out.println("deportivo.cilindraje = " +deportivo.cilindraje);

	}

}
