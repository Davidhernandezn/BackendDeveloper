package poo;

//CLASE ENTIDAD
//DEBEMOS ENCAPSULARLO, SI NO SE TOMA DEFAULT
public class Automovil {
	//ATRIBUTOS
	private int id;//ID AUTOINCREMENTAL
	private String fabricante;
	private String modelo;
	/***AGREGAR COLO TIPO STRING*/
	//private String color;
	/***AGREGAR COLOR TIPO COLOR*/
	private Color color = Color.ROJO;
	
	private double cilindraje;
	private int capacidadTanque = 40;//PODEMOS ACTUALIZAR LA CAPACIDAD	
	
	//private static String colorPatente = "Naranja";
	//PARAMETRIZAMOS
	private static Color colorPatente = Color.NARANJO;
	
	private static int capacidadTanqueEstatico = 30;
	private static int ultimoId = 0;//ID QUE PARTE EN 0 POR SER PRIMITIVO
	
	/** USO DE FINAL = CONSTANTE, NO PUEDE MODIFICARSE
	 * - Si se declara como private solo puede usarse dentro de esta clase AUTOMOVIL
	 * - USAR INTEGER PARA POO
	 * - int PRIMITIVO PARA TRABAJAR SOLO CON EL VALOR
	 * - final y static son modificadores de comportamiento*/
	public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
	final public static int VELOCIDAD_MAX_CIUDAD = 60;

	/**CONSTANTES PARA COLORES */
	public static final String COLOR_AMARILLO = "Amarillo";
	public static final String COLOR_ROJO = "Rojo";
	public static final String COLOR_AZUL = "Azul";
	
	
	
		public Automovil() {	
			//CADA QUE SE CREEA UN OBJETO
			//EN CLASE PRINCIPAL SOLO LO DECLARAS ASI: 		Automovil familiar = new Automovil(); SI TIENE PARAMETROS NO LO LLAMA
			this.id = ++ultimoId;// Incrementa y asigna el nuevo ID
		}
		
	//CONSTRUCTOR: PARA PROCESOS DE INICIALIZACION, conexion a bd, incializar	 conexion, conectarse a serve
	/**EL TENER CONSTRUCTORES CON DIFERENTES PARAMETROS SON SOBRECARGA DE CONSTRUTOR */
	public Automovil(String fabricante, String modelo) {
		this();//INVOCAMOS CONSTRUCTOR SIN PARAMETROS Y AUMENTARA
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

//	public Automovil(String fabricante, String modelo, String color) {
//		this(fabricante, modelo);//LLAMA AL CONSTRUCTOR DE 2 PARAMETROS (REFERENCIA A CONSTRUTOR DE LA MISMA CLASE)
//		this.color = color;
//	}
	
	public Automovil(String fabricante, String modelo, Color color) {
		this(fabricante, modelo);//LLAMA AL CONSTRUCTOR DE 2 PARAMETROS (REFERENCIA A CONSTRUTOR DE LA MISMA CLASE)
		this.color = color;
	}
	
///***Constructor que llama al de arriba*/
//	public Automovil(String fabricante, String modelo, String color, double cilindraje) {
//		this(fabricante,modelo);
//		this.color = color;
//		this.cilindraje = cilindraje;
//	}
	
	/***Constructor que llama al de arriba*/
	public Automovil(String fabricante, String modelo, Color color, double cilindraje) {
		this(fabricante,modelo);
		this.color = color;
		this.cilindraje = cilindraje;
	}

/** CONSTRUCTOR NORMAL*/ 
//	public Automovil(String fabricante, String modelo, String color, double cilindraje) {
//		this.fabricante = fabricante;
//		this.modelo = modelo;
//		this.color = color;
//		this.cilindraje = cilindraje;
//	}
//		
	public Automovil(String fabricante, String modelo, Color color, double cilindraje, int capacidadTanque) {
//		this.fabricante = fabricante;
//		this.modelo = modelo;
//		this.color = color;
//		this.cilindraje = cilindraje;
		this(fabricante, modelo, color, cilindraje);//(REFERENCIA A CONSTRUTOR DE LA MISMA CLASE)
		this.capacidadTanque = capacidadTanque;
	}

	//METODOS ESTATICOS: MATH, SQRT
	//FINAL: EVITA QUE EL METODO SE MODIFIQUE EN LA HERENCIA
	//void se hace algo pero no devuelve nada
	//this hace referencia de esta clase de 
	
	
	//STATIC =  EL ATRIBUTO DE LA CLASE, MAS NO DE LA INSTANCIA
	//void hace algo pero no devuelve nada
	//public void detalle() { //SI SOLO PONEMOS SYSTEM.OUT...
	public String detalle() {// SI VA A DEVOLVER UN STRING
		//VARIABLE DEL METODO DETALLE
		//String modelo = "ModelDetails";
		
		StringBuilder sb = new StringBuilder();//podemos concatenar
		
		//AQUI SE USA THIS PORQUE USAMOS LA INSTANCIA DEL MISMO OBJETO
		//ATRINUTO O METODO DE LA MISMA CLASE USAMOS THIS
		sb.append("auto.fabricante = " + this.getFabricante()); // llegar a los atributos
		//sb.append("auto.modelo = " + this.modelo);//TOMA VALOR DE LA CLASE
		sb.append("auto.modelo = " + this.getModelo());//TOMA VALOR DE ESTE METODO
		sb.append("auto.color = " + this.getColor());
		sb.append("auto.cilindraje = " + this.getCilindraje());
		return sb.toString();
	}
	
	
	//AL SER PRIVATE DEBEMOS ACCEDER Y USAR GETTER Y SETTER 

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

//	public String getColor() {
//		return color;
//	}

	public Color getColor() {
		return color;
	}


//	public void setColor(String color) {
//		this.color = color;
//	}
	public void setColor(Color color) {
		this.color = color;
	}

	public double getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(double cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getCapacidadTanque() {
		return capacidadTanque;
	}

	public void setCapacidadTanque(int capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	public String acelerar(int rpm) {
		return "el auto " + fabricante +" esta acelerando a "+ rpm +" RPM";
	}
	
	public String frenar() {
		return "El vehiculo "+ fabricante + modelo + " Frenando ";
	}
	
	public String acelerarFrenar(int rpm) {
		String acelerar = this.acelerar(rpm);
		String frenar = frenar();
		return acelerar + "\n" + frenar;
	}
	
	
	//CALCULAR
	public float calcularConsumo(int km, float porcentajeBencina) {
		return km/(capacidadTanque * porcentajeBencina);
	}
	
	//CALCULAR CONSUMO STATIC
	public static float calcularConsumoEstatico(int km, float porcentajeBencina) {
		return km/(capacidadTanqueEstatico * porcentajeBencina);
	}
	
//	//INDICAMOS QUE ESTAMOS SOBREESCRIBIENDO UN METODO
//	@Override //SOLO TIENE OBJETIVO DE DOCUMENTAR NO AFECTA AL CODIGO
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		//CONVERTIR OBJETO A TIPO AUTOMOVIL
//		Automovil a = (Automovil) obj; //CAST VALIDA AUTOMOVIL QUE VIENE FUERA CON EL OBJETO DE ESTA CLASE
//		//USAR EQUAL PARA COMPARAR STRINGS
//		return (this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
//	}
	
	//INDICAMOS QUE ESTAMOS SOBREESCRIBIENDO UN METODO (PARA NULO)
	//CONTIENE VALOR NULO 
	@Override //SOLO TIENE OBJETIVO DE DOCUMENTAR NO AFECTA AL CODIGO
	public boolean equals(Object obj) {
		//COMPARAMOS POR REFERENCIA, si son iguales devolver true
		if(this == obj) {
			return true;
		}
		
		//PARA COMPARAR SOLO SI EL TIPO DE DATO ES AUTOMOVIL, SI ES DIFERENTE DEVOLVER FALSE
		if(!(obj instanceof Automovil)) {
			return false;
		}
		
		
		Automovil a = (Automovil) obj; //CAST VALIDA AUTOMOVIL QUE VIENE FUERA CON EL OBJETO DE ESTA CLASE
		return (this.fabricante != null && this.modelo != null 
				&& this.fabricante.equals(a.getFabricante()) 
				&& this.modelo.equals(a.getModelo()));
	}

	//SOBRECARGA DE METODOS: MISMO METODO CON DIFERENTES PARAMETROS
	public float calcularConsumo(int km, int porcentajeBencina) {
		return km/(capacidadTanque * (porcentajeBencina/100f));
	}

	@Override
	public String toString() {
		return "Automovil [fabricante=" + fabricante + ", modelo=" + modelo + ", color=" + color + ", cilindraje="
				+ cilindraje + ", capacidadTanque=" + capacidadTanque + "Id " + id;
	}
	
	
	/*SI EL ATRIBUTO ES STATICO EL METODO GET Y SET TAMBIEN*/
	public static Color getColorPatente() {
		return colorPatente;
	}

	public static void setColorPatente(Color colorPatente) {
		Automovil.colorPatente = colorPatente; //ADIFERENCCIA DE LOS DEMAS SE USA NOMBRE DE LA CLASE
	}

	public String verDetalle() {
		/*USAR VARIABLE ESTATICA SOLO AGREGAR NOMBRE DE VARIABLE O NOMBRE DE CLASE Y ATRIBUTO */
		return "\n auto.id = "+this.id
				+ " Auto fabricante = " + this.getFabricante()
		+"\n Auto.color = " + this.color.getColor()
		+"\n VER DETALLE## \n AUTO COLOR = " + Automovil.getColorPatente().getColor();
		
	}
	
	/*** PARA ACTUALIZAR ID */
	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}


	
	/*** PARA ACTUALIZAR CAPACIDAD**/
	public static int getCapacidadTanqueEstatico() {
		return capacidadTanqueEstatico;
	}

	public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
		Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
	}

	/**calcularConsumoEstatico **/
	public static float calcularConsumoEstatico(int km, int porcentajeBencina) {
		return km / (Automovil.capacidadTanqueEstatico * (porcentajeBencina / 100f));
	}
	
	
}

