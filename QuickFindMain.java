import java.util.Scanner;
/**
 * Write a description of class QuickFindMain here.
 * 
 * @author (Damion Lowers) 
 * @version (a version number or a date)
 */
public class QuickFindMain
{
    public static void  main(String []arg){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number element: ");
        int n = reader.nextInt();
        QuickFindUF qf = new QuickFindUF(n);
        String task = "";
        int p = 0;
        int q = 0;
        boolean checker = true;
        
        do{
            System.out.println("please enter task");
            task = reader.nextLine();
            if (task.toLowerCase().equals("u")){
                System.out.println("please enter value to be connect");
                System.out.println("you may choose from this list");
                System.out.println(qf.toString());
                p = reader.nextInt();
                System.out.println("Choose next value");
                q = reader.nextInt();
                qf.union(p,q);
                System.out.println("Elements connect");
            }
            else if(task.toLowerCase().equals("c")){
                System.out.println("please enter value to be check for connection");
                System.out.println("you may choose from the list below");
                p = reader.nextInt();
                q = reader.nextInt();
                System.out.println(qf.connected(p,q));
            }
            else if(task.toLowerCase().equals("s")){
                 System.out.println(qf.toString());
                
            }
            else if(task.toLowerCase().equals("e")){
                checker = false;
            }
        }
        while(checker);
        
        
        
        
        System.out.println(qf.toString());
        
        
        System.out.println(qf.toString());
        System.out.println(qf.connected(5,6));
    }
}
