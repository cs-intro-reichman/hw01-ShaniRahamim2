public class Coins {
	public static void main(String[] args) {
	// #feedback: keep consistent identation
	int num = Integer.parseInt(args[0]);
        int quarters = num/25; 
        int cents = num%25;
	/* #feedback
 	The absence of comments is acceptable here given the simplicity of the code. 
  	However, adding a brief comment for the division operation explaining the potential division by zero error might be helpful.
	*/

        System.out.println( "Use " + quarters + " quarters and " + cents + " cents"  );
	}
}
