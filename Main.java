import java.util.Scanner;
import java.util.Random; 


class Main {
  public static void main(String[] args) {
  
    Scanner nivel = new Scanner(System.in);
     System.out.println("Você quer jogar no nível 1, 2 ou 3? Digite o número do nível: ");
    int nivelescolhido = nivel.nextInt();

    switch (nivelescolhido){
      case 1:
        Random gerador1 = new Random();
        int x1 = gerador1.nextInt(10);
    
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Adivinhe o número que estou pensando entre 0 a 10: ");
        int numero1 = entrada1.nextInt();
    
        if (numero1 == x1){
          System.out.println("Parabéns, você acertou, eu pensei no número " + x1);
        }else{
           System.out.println("Você errou, eu pensei no número " + x1);
        }
        break;
  
        case 2:
        Random gerador2 = new Random();
        int x2 = gerador2.nextInt(50);
    
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Adivinhe o número que estou pensando entre 0 a 50: ");
        int numero2 = entrada2.nextInt();
    
        if (numero2 == x2){
          System.out.println("Parabéns, você acertou, eu pensei no número " + x2);
        }else{
           System.out.println("Você errou, eu pensei no número " + x2);
        }
        break;
      
      case 3:

        Random gerador3 = new Random();
        int x3 = gerador3.nextInt(100);
    
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Adivinhe o número que estou pensando ");
        int numero3 = entrada3.nextInt();
    
        if (numero3 == x3){
          System.out.println("Parabéns, você acertou, eu pensei no número " + x3);
        }else{
           System.out.println("Você errou, eu pensei no número " + x3);
        }
        break;
  
      default:
        System.out.println("número incorreto. Por favor, escolha entre as opções 1, 2 ou 3.");
  
    }
  }
}