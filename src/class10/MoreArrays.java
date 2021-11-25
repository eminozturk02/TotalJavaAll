package class10;

public class MoreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] grades= {'A', 'D', 'A', 'B', 'C'};
		
		for(char grade:grades) {
			
			System.out.print(grade+"  ");
		}
		
		System.out.println();
		//reverse
		
					//5-1=4
		for(int i=grades.length-1; i>=0;i-- ) {
			
			System.out.print(grades[i]+"  ");
		}
	}

}
