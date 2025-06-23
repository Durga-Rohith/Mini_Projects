import java.util.Scanner;
import java.util.Random;
public class rockpaperscissor{
  public static void main(String[] args) {
    String play="yes";
    System.out.println("****************************************");
    System.out.println("** Welcome to Rock paper Scissor Game **");
    System.out.println("****************************************");
    Scanner sc =new Scanner(System.in);
    Random rd =new Random();
  do{
    System.out.println("Enter you choice: Rock,paper,scissor");
    String choice =sc.nextLine().toLowerCase(); 

    String computer[] = {"rock","paper","scissor"};
    String computerChoice = computer[rd.nextInt(3)];

    if(choice.equals("rock")&&computerChoice.equals("scissor")||choice.equals("scissor")&&computerChoice.equals("paper")||choice.equals("paper")&&computerChoice.equals("rock")){
      System.out.println(choice+" beats "+computerChoice+ " You Won");
    }else if(choice.equals("rock")&&computerChoice.equals("paper")||choice.equals("scissor")&&computerChoice.equals("rock")||choice.equals("paper")&&computerChoice.equals("scissor")){
      System.out.println(computerChoice+" beats "+choice+" You lost");
    }else if(choice.equals(computerChoice)){
      System.out.println(computerChoice+" "+choice+" It's a Draw");

    System.out.println("Do you want to Play Again?");
    play =sc.nextLine().toLowerCase(); 
  }
  }while(play.equals("yes"));
  System.out.println("Thank you GOODNIGHT!!!!");
  sc.close();
}
}