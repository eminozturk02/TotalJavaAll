package class14;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 7. How would you swap 2 strings without a temporary variable?
				String str = "Hormat";
				String str2 = "Sorbon";
				str = str + str2;
				str2 = str.replace(str2, "");
				str = str.replace(str2, "");
				System.out.println(str);
				System.out.println(str2);
	}

}
