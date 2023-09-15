package Exceptions;

public class LanzarExcepciones {

	public static void main(String[] args) {
		
		try {
			division(6,0);
                        System.out.println("si");
		}catch(Exception e) {
			System.out.println("la division no se puede realizar");
			System.out.println(e.toString());
		}

	}

	/*el trow era para generar la excepcion, y el try catch era para observar un bloque de codigo que podr�a
	 *  generar una excepcion y definir la accion a hacer si se da una*/
	
	public static float division( float dividendo, float divisor) throws Exception{
		try {
			if(divisor==0) {
				throw new Exception("Division entre cero");//se usa cuando tu quieres lanzar una exception (algun metodo puede lanzar una exception)
			}

			return dividendo/divisor;
		}catch(Exception e) {
			return 0;
		}
		
		
	}
}
