package org.davidhernandezn.app;

import org.davidhernandezn.app.hogar.Persona;
//import org.davidhernandezn.app.hogar.*;//habilita las clases y no afectar rendimeinto SOLO LO QUE USAS /WITHE CART


public class EjemploPaquetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona();
		org.davidhernandezn.app.hogar.Persona p2 = new org.davidhernandezn.app.hogar.Persona();
		
		p.nombre = "David"; //IMPORT
		p2.nombre = "Persona sin import";//SIN IMPORT
		
		System.out.println(p.nombre);
		System.out.println(p2.nombre);

	}

}
