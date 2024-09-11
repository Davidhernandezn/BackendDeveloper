package poo;

//CLASE ENTIDAD
//DEBEMOS ENCAPSULARLO, SI NO SE TOMA DEFAULT
public class Automovil {
	//ATRIBUTOS
	private String fabricante;
	private String modelo;
	private String color;
	private double cilindraje;
	private int capacidadTanque = 40;	
	
	public Automovil() {	
	}
		
	//CONSTRUCTOR: PARA PROCESOS DE INICIALIZACION, conexion a bd, incializar	 conexion, conectarse a serve
	/**EL TENER CONSTRUCTORES CON DIFERENTES PARAMETROS SON SOBRECARGA DE CONSTRUTOR */
	public Automovil(String fabricante, String modelo) {
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public Automovil(String fabricante, String modelo, String color) {
		this(fabricante, modelo);//LLAMA AL CONSTRUCTOR DE 2 PARAMETROS (REFERENCIA A CONSTRUTOR DE LA MISMA CLASE)
		this.color = color;
	}
	
	public Automovil(String fabricante, String modelo, String color, double cilindraje) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.color = color;
		this.cilindraje = cilindraje;
	}
		
	public Automovil(String fabricante, String modelo, String color, double cilindraje, int capacidadTanque) {
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
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
	
	
}

