public class GenThree {
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int rang = b - a ; 

        int random1 = (int)( Math.random( ) * rang ) + a;
        int random2 = (int)( Math.random( ) * rang ) + a;
        int random3 = (int)( Math.random( ) * rang ) + a;

        int min = Math.min( random1 , Math.min( random2 , random3 ) ); 

        System.out.println( random1 ); 
        System.out.println( random2 ); 
        System.out.println( random3 ); 
        System.out.println( "The minimal generated number was " + min );
	}
}
