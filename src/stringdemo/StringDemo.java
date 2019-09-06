package stringdemo;

public class StringDemo implements Comparable<StringDemo>{
	private int length = 0;
	
	public StringDemo() {
		
	}
	
	public StringDemo(int length){
		this.length = length;
	}
	
	public static void main(String[] args) {
		StringDemo sd1 = new StringDemo(1);
		StringDemo sd2 = new StringDemo(3);
		int compare = sd1.compareTo(sd2);
		System.out.println(compare);
	}

	@Override
	public int compareTo(StringDemo o) {
		// TODO Auto-generated method stub
		if(this.length<=o.length) {
			System.out.println(this.length + " " + o.length);
			return -1;
		}else {
			return 1;
		}
		
	}
	
	
	
}
