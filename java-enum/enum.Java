enum Sorvete {
    MORANGO,
    CHOCOLATE,
    ABACAXI
  }
  public class Main {
   
   public static void main (String [] args ){
    Sorvete sorvete = Sorvete.ABACAXI;
   
  
   switch (sorvete ){
   
   case MORANGO:
   System.out.println("Sorvete de morango");
   break;
   
   case CHOCOLATE:
   System.out.println("Sorvete de chocolate");
   break;
   
   case ABACAXI:
   System.out.println("Sorvete de abacaxi");
   break;
  
  
   } } }