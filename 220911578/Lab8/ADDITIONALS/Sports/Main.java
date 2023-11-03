import java.util.Scanner;
interface sports{
    int getnumberofgoals();
    void dispTeam();
}
class Hockey{
    public int getnumberofgoals(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of goals in Hockey:");
       int g = sc.nextInt();
       return g;
       }
       String name;
      public void dispTeam()
       {
     System.out.println("Winning team is "+name );
         }    
       }
class Football{
    public int getnumberofgoals(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of goals in Football:");
        int g = sc.nextInt();
        return g;
        }
        String name;
        public void dispTeam()
        {
            System.out.println("Winning team is "+name );
        }
    }
    class Main{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            Hockey h1 = new Hockey();
            Hockey h2 = new Hockey();
            Hockey h3 = new Hockey();
            Football f1 =new Football();
            Football f2 =new Football();
            System.out.println("Enter Hockey team name :");
            h1.name = sc.nextLine();
            h1.getnumberofgoals();
            System.out.println("Enter opponent Hockey team name :");
            h2.getnumberofgoals();
            h2.name = sc.nextLine();
            if(h1.getnumberofgoals() > h2.getnumberofgoals())
            {
                h1.dispTeam();
            }
         if(h1.getnumberofgoals() < h2.getnumberofgoals())
         {
      h2.dispTeam();
          }    



        }
    }
    /*if(f1.getnumberofgoals() > f2.getnumberofgoals())
            {
         System.out.println("Winning team is "+f1.name );
            }
         if(f1.getnumberofgoals() < f2.getnumberofgoals())
         {
      System.out.println("Winning team is "+f2.name );
          }    */