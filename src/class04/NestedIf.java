package class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean vaccine=false;
		int dose=2;
		
		if(vaccine) {
			
			System.out.println("How many doses have taken?");
			
			if(dose==1) {
				System.out.println("When are you taken your 2nd dose?");
			}else {
				System.out.println("You are fully vaccinated");
			}
			
		}
		
		System.out.println(" -----------------------------------------------------");
		
		String day ="Monday";
		int date=13;
		int time=12;
		
		if(day.equals("Friday")) {
			
			System.out.println("I am going to the movies today");
			
			if(date==13) {
				System.out.println("I am wathing a scary movie");
			}else {
				System.out.println("I am watching a comedy today");
			}
			
		}else {
			
			System.out.println("I am going to study");
			
			if (time>23) {
				System.out.println("I have to go to sleep cause I have class");
			}
			
		}
	}

}
