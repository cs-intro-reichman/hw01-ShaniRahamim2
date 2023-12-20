public class LinearEq {
	public static void main(String[] args) {

        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        Double c = Double.parseDouble(args[2]);

        Double sum1 = c - b; 
        Double x = sum1 / a; 

        System.out.println( a + " * " + "x " + "+ " +  b + " = " + c );
        System.out.println( "x = " + x );

    }
} 