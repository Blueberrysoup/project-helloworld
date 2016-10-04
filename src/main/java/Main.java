
public class Main {

	public static void main(String[] args) {
		NoTeenSum noTeen = new NoTeenSum();
		System.out.println(noTeen.noTeenSum(8, 14, 12)); 	//20
		System.out.println(noTeen.noTeenSum(8, 15, 12));	//35
		System.out.println(noTeen.noTeenSum(1, 2, 3));		//6
		System.out.println(noTeen.noTeenSum(13, 14, 15));	//15
		System.out.println(noTeen.noTeenSum(16, 15, 16));	//47
		System.out.println(noTeen.noTeenSum(17, 18, 19));	//0

	}

}
