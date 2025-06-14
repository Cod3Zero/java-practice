package practice;

public class Pattern {

	public static void main(String[] args) {
		String str="* ";
		for (int i=1;i<=9;i++){
			System.out.print(str);
		}
		System.out.println();
		System.out.println();
		int temp=1;
		while (temp<5){
			for(int i=1;i<=4;i++){
				System.out.print(str);
			}
			System.out.println();
			temp+=1;
		}
		System.out.println();
		System.out.println();
		int limit=1;
		while (limit<5){
			for (int i=0;i<limit;i++){
				System.out.print(str);
			}
			System.out.println();
			limit+=1;
			
		}
		System.out.println();
		System.out.println();
		int limit2=4;
		while (limit2>0){
			for (int i=limit2;i>0;i--){
				System.out.print(str);
			}
			System.out.println();
			limit2-=1;
			
		}
		
		

	}
	

}
