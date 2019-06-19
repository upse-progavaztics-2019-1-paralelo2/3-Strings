
/**
 * 
 * @author ivansanchez
 * Esta clase es una practica de String para 
 * programacion Avanzada TICS 2019-1
 */
public class StringTest {

	public static final String UNIVERSIDAD = "UPSE";
	
	public static void main(String[] args) {
	
		// Aqui declaramos una cadena
		String cadenita;
		cadenita = "   Hey Carmen!  	 " + UNIVERSIDAD;
		System.out.println(cadenita);
		System.out.println("La cadena tiene longitud\t" + cadenita.length() );
		System.out.println(cadenita.contains("u"));
		System.out.println("Son iguanesl? " + cadenita.equals("Hey Carmen!"));
		System.out.println("Vacia?" + cadenita.isEmpty());
		System.out.println(cadenita.trim());
		System.out.println(cadenita.toUpperCase());
		System.out.print("test\r");
		System.out.println("Java");
		
		String nombre1= "Adrian esta programando en Java.";
		System.out.println(nombre1.compareTo("Freddy"));
		System.out.println(nombre1.compareTo("Aaron"));
		System.out.println(nombre1.compareTo("Adrian"));
		System.out.println(nombre1.compareTo("Adrian!"));
		System.out.println(nombre1.compareTo("ADRIAN"));
		System.out.println(nombre1.compareToIgnoreCase("ADRIAN"));
		System.out.println(nombre1.charAt(3));
		System.out.println(nombre1.lastIndexOf("a"));
		System.out.println(nombre1.substring(8, 17));
	}

}
