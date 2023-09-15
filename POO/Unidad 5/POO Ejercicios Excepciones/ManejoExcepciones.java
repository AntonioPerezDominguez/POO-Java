package Exceptions;

public class ManejoExcepciones {

	public static void main(String[] args) {
		String [] cadenas= {"Primero", "Segundo", "Tercero"};
		
		System.out.println(cadenas[0]);
		System.out.println(cadenas[1]);
		System.out.println(cadenas[2]);
		System.out.println(cadenas[3]);//genera excepcion porque no existe esta posici�n
		
		try {/*ayuda a encerrar bloque de codigo que podria generar une excepcion-error y cuando sucede se ejecuta lo de CATCH*/
			System.out.println(cadenas[0]);
			System.out.println(cadenas[1]);
			System.out.println(cadenas[2]);
			System.out.println(cadenas[3]);//genera excepcion porque no existe esta posici�n
			
			String c=null;
			c.concat("Fin");//aqui se aparecera el catch ne, porque no se puede concatener algo a la nada o algo asi xd
			
		}catch(ArrayIndexOutOfBoundsException e/*exception*/){
			System.err.println("Estas intentando accedera a una posici�n incorrecta del arreglo");
		}catch(NullPointerException ne) {/*se puede tener varios catch, para cubrir varias exceptiones que puedan ocurrir o de tipos diferentes*/
			System.err.println("Variable apuntanto a nulo");
		}catch(Exception er) {/*se puede tener varios catch, para cubrir varias exceptiones que puedan ocurrir o de tipos diferentes*/
			System.err.println("Ocurri� una excepti�n");
		}
	}

}
