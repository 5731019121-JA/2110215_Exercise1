import java.util.*;
public class DailyPlanner {
	public static ArrayList<Task> tasks;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String cmd;
		while(true){
			showMenu();
			cmd=s.next();
			if(cmd.equals("E")) break;
		}
		s.close();
	}
	public static void showMenu(){
		System.out.println("--------------------------");
		System.out.println("Main Menu");
		System.out.println("--------------------------");
		System.out.println("V ) View calendar");
		System.out.println("A ) Add task to calendar");
		System.out.println("V ) Exit program");
		System.out.println("--------------------------");
		System.out.print("Enter input command :");
	}
	public static void viewCalendarMenu(){
		
	}
	public static String getCalendarString(int month,int year){
		
	}

}
