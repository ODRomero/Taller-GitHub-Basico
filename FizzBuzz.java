import java.util.stream.IntStream;
 
public class FizzBuzz 
{
  public static void main(String[] args) 
  {
    fizzBuzz(100);
  }
 
  private static void fizzBuzz(int num) 
  {
    String salida = "";
    boolean isFB;
    for (int i = 1; i <= num; i++) 
    {
      isFB = false;
      if ((i % 3) == 0) {
        salida += "fizz";
        isFB=true;
      }
      if ((i % 7) == 0) {
        salida += "cuzz";
        isFB=true;
      } 
      if ((i % 18) == 0) {
        salida += "lizz";
        isFB=true;
      } 
      if ((i % 23) == 0) {
        salida += "tuzz";
        isFB=true;
      }
      if ((i % 27) == 0) {
        salida += "luzz";
        isFB=true;
      } 
      if(isFB){
        System.out.println(salida);
      } else {
        System.out.println(i);
      }
    }
  }
 

}