
public class NoTeenSum {
	public int fixTeen(int n){
		if (( n == 15 ) || ( n == 16 ))
			return n;
		else
		    return 0;
	}

	public int noTeenSum(int a, int b, int c) {
	
		if ((a >= 13) && (a <= 19)) 
			a = fixTeen(a);
		if ((b >= 13) && (b <= 19)) 
			b = fixTeen(b);
		if ((c >= 13) && (c <= 19)) 
			c = fixTeen(c);
	    
		return a + b + c;    
	}

}
