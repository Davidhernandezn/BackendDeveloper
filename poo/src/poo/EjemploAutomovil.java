package poo;

public class EjemploAutomovil {
//PANTILLA PARA CREAR OBJETOS, 
	
	//STATIC, METODO DE LA CLASE, MAS NO DEL METOOO
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NEW CREA INSTANCIA, INICIALIZA EL OBJETO Y LO GUARDA EN LA MEMORIA
		// TIPO DATO Automovil
		/**Automovil auto = new Automovil();
		auto.fabricante ="Jeep";
		auto.modelo = "Compass";
		auto.color="Blanco";
		auto.cilindraje = 12.2;**/
		
		Automovil deportivo = new Automovil();
		deportivo.setFabricante("Chevrolet");
		deportivo.setModelo("Camaro R7");
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

	}

}
