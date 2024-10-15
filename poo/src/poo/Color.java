package poo;

public enum Color {
	/***SE SE AGREGA LA PERSONALIZACIÓN NOS SOLICITARA AGREGAR EL ARGUMENTO */
	ROJO("Red"),
	AMARILLO("Yellow"),
	AZUL("Blue"),
	BLANCO("White"),
	GRIS("GRAY"),
	NARANJO("ORANGE");
	
	/***PERSONALIZAR */
	private final String color;

	
	/*** GENERA CONSTRUCTOR
	 *PASA EL COLOR EN EL ARGUMENTO Y ASIGNA VALOR EL VALOR*/
		private Color(String color) {
		this.color = color;
	}


	/*** ACTUALIZARA Y MOSTRARA LA PERSONALIZACION AL LLAMAR GET*/
	public String getColor() {
		return color;
	}
		
	
}
