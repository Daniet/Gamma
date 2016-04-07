
import gamma.Gamma;

public class main {
	
   public static void main(String[] args) { 
	   double x = 5.5;
	   Gamma g = new Gamma();
	  System.out.println("Gamma(" + x + ") = " + g.Gamma(x));
      System.out.println("log Gamma(" + x + ") = " + g.LogGamma(x));
   }

}