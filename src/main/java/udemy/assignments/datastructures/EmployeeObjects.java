package udemy.assignments.datastructures;

public class EmployeeObjects extends Employee{
 
public static void main(String[] args){
	
	Employee emp1 = new Employee();
	Employee emp2 = new Employee();
	Employee emp3 = new Employee();
	Employee emp4 = new Employee();
	
	emp1.setEmailId("emp1@gm");
	emp1.setEmpId(123546852L);
	emp1.setFirstName("mohit");
	emp1.setLastName("nib");
	
	emp2.setEmailId("emp2@gm");
	emp2.setEmpId(123145875L);
	emp2.setFirstName("rav");
	emp2.setLastName("divi");
	
	emp3.setEmailId("emp3@gm");
	emp3.setEmpId(124563214L);
	emp3.setFirstName("rohi");
	emp3.setLastName("not");
	
	emp4.setEmailId("emp4@gm");
	emp4.setEmpId(123587562L);
	emp4.setFirstName("aj");
	emp4.setLastName("nand");
	
	Employee[] empArr = new Employee[4];
	empArr[0] = emp1;
	empArr[1] = emp2;
	empArr[2] = emp3;
	empArr[3] = emp4;
	
	System.out.println("le : " +empArr.length);
for(int i =0 ;i<empArr.length; i++){

for(int j=i;j>0;j--){
	
	if(empArr[j].getEmpId() < empArr[j-1].getEmpId()){
		Employee temp = empArr[j];
		empArr[j] = empArr[j-1];
		empArr[j-1] = temp;
	}
}
}
System.out.println("sorted employess : " +empArr[0].getEmpId() +" " +empArr[1].getEmpId()+ " " +empArr[2].getEmpId()+ " " 
		+empArr[3].getEmpId());
	}


	
	
}
