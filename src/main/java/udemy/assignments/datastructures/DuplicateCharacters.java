package udemy.assignments.datastructures;

public class DuplicateCharacters {
private String s;
	public DuplicateCharacters(String string) {
		this.s=string;
		
	}
	
	public boolean hasDuplicateChars(){
		
		if(s.length() > 0){
		int i=0;
		while(i<s.length()-1){
			for(int j=i+1;j<s.length(); j++){
				
				if(s.substring(i,i+1).equalsIgnoreCase(s.substring(j, j+1))){
					return true;
				}

			}
			i++;
		}
		}
return false;		
	}
	 public static int removeDuplicateElements(int arr[], int n){  
	        if (n==0 || n==1){  
	            return n;  
	        }    
	        int j = 0;//for next element  
	        for (int i=0; i < n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                arr[j++] = arr[i];  
	            }  
	        }  
	        
	        arr[j++] = arr[n-1];  
	        
	     
	        return j;  
	    }
	 
	public static void main(String args[]){
		
		/*DuplicateCharacters dup = new DuplicateCharacters("ravindmfewqxra");	
		System.out.println("Has Duplicate characters " +dup.hasDuplicateChars());*/
		
		   int arr[] = {10,20,20,30,30,40,50,50};  
	        int length = arr.length;  
	        length = removeDuplicateElements(arr, length);  
	        //printing array elements  
	        for (int i=0; i<length; i++)  
	           System.out.print(arr[i]+" ");  
	}
}
