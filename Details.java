//System.out.print("");
package Project;
import java.util.*;
public class Details {
	public static void main(String[] args) {
        System.out.println("Hello User!!!");
        LinkedList<Stack> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Set MPIN: ");
        String mpin = sc.next();
        System.out.println("No of account to be added: ");
   	 int n= sc.nextInt();
        for(int i=0;i<=n-1;i++){
            System.out.println("Add bank account\n1)Yes\n2)later");
            int ch=sc.nextInt();
            switch(ch){
                case 1: 
                	Stack<String> stk = new Stack<>();
                	System.out.print("IFSC code: ");
                String ifcs = sc.next();
                stk.add(ifcs);
                System.out.print("Account no: ");
                String acc = sc.next();
                stk.add(acc);
                System.out.print("CRN: ");
                String crn = sc.next();
                stk.add(crn);
                ll.add(stk);
                System.out.println("Account added Succefully!!!!");
                break;
                case 2: 
                System.out.println("Home page loading");
                break;
                default: System.out.println("Invalid input");
                break;
            }
        }
        System.out.println("User: "+name);
        for(int i=0;i<=n-1;i++){
            System.out.println("Account "+(i+1)+": "+ll.get(i));
        }
	}

}
