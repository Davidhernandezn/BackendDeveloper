package poo;

//CLASE ENTIDAD
//DEBEMOS ENCAPSULARLO, SI NO SE TOMA DEFAULT
public class Automovil {
	//ATRIBUTOS
	String fabricante;
	String modelo;
	String color;
	double cilindraje;
	
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
		sb.append("auto.fabricante = " + this.fabricante); // llegar a los atributos
		//sb.append("auto.modelo = " + this.modelo);//TOMA VALOR DE LA CLASE
		sb.append("auto.modelo = " + this.modelo);//TOMA VALOR DE ESTE METODO
		sb.append("auto.color = " + this.color);
		sb.append("auto.cilindraje = " + this.cilindraje);
		return sb.toString();
	}
}

