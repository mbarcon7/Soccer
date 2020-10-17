import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("What is your name?");
    String name= scan.next ();

    System.out.println("Who is your favorite soccer player?");
    String player = scan.next();

    System.out.println("What is the temperature in whole number?");
    int temperature = scan.nextInt();

    System.out.println("What day is the game?");
    int dayNumber = scan.nextInt();
  
    System.out.println("What is the amount of days till the game?");
    int daysTillGame = scan.nextInt();

    System.out.println("Answer with true or false, you like playing soccer.");
    boolean likePlayingSoccer = scan.nextBoolean();

    System.out.println("Answer with true or false, you like playing hockey.");
    boolean likeSkating = scan.nextBoolean();

    System.out.println("Answer with true or false, Aubameyang is your favorite player.");
    boolean isYourFavoritePlayer = scan.nextBoolean();

    System.out.println("Answer with true or false, is it sunny.");
    boolean sunny = scan.nextBoolean();

    int timeFeelLikePlaying = 30;

    System.out.print(name);


      if (temperature < 80 && sunny == true)

      {
      System.out.print(" go out and");

      }else{
      System.out.print(" stay inside and don't play and,");

           }
        if  (likePlayingSoccer == true || likeSkating == true )

        {
        System.out.print(" don't grab your ball or ice skates if your inside, but if your outside grab one .");
        }else{
        System.out.print("don't grab anything.");

             }
             System.out.print(" You should play for ");
               while (timeFeelLikePlaying < 40)
               {
               timeFeelLikePlaying++;
               }
               System.out.print(timeFeelLikePlaying +  " minutes. ");
                 if ( daysTillGame != dayNumber - 1 )

                 {
                 System.out.print(" However, since you didn't play yesterday play for an extra 15 minutes.");
                 }else{
                 System.out.println("");

                      }
                 System.out.print(" You should also dribble for ");
                 {
                 for(int dribble = 1; dribble <= 5; dribble++)
                 
                 System.out.print(dribble + " minutes.");
                 }

}
}