package udemy.assignments.datastructures;

public class TowerOfHanoiRecursion {

	static void move(int n, char from, char to, char inter){
		if(n==1){
			System.out.println("moving disc 1 from " +from +" to "+to);
		}else{
			move(n-1,from,inter,to);
			
			System.out.println("moving disc" +(n)+ " from " +from +" to " +to+" Using " +inter );
				
			move(n-1,inter,to,from);
		}
	}
	
	public static void main(String[] args) {
		TowerOfHanoiRecursion tw = new TowerOfHanoiRecursion();
		move(10, 'A', 'C', 'B');
	}
	
}
