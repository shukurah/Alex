package alex;

public class alex_work {
	public static void main(String args[]){
		try{
		int a[] = new int[2];
		System .out.println("Access elem ent three :" + a[3]);
		}catch(ArrayIndexOutOfBoundsException e){
		System .out.println("Exception thrown :" + e);
		}
		System .out.println("Out of the block");
		
		}

}
