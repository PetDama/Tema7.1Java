import java.util.LinkedList;
import java.util.Scanner;

public class Main {



		public static void main(String[] args) {
			LinkedList<String> first_list = new LinkedList();
			LinkedList<String> final_list = new LinkedList();


			Scanner scanner = new Scanner(System.in);
			while(true) {
				String s = scanner.nextLine();
				if(s.equals("STOP"))
					break;
				first_list.add(s);	
				}
			
			System.out.println("With duplicates");
			for (int i = 0; i < first_list.size(); i++) {
	            System.out.println(first_list.get(i));
	        }
			
			for(String ss: first_list)
	        {
	            if(!final_list.contains(ss))
	            	final_list.add(ss);
	        }
			
			System.out.println("Without duplicates");
			for (int i = 0; i < final_list.size(); i++) {
	            System.out.println(final_list.get(i));
	        }
		}
			
	}


