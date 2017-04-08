public class FunctionPerforming {
	
  public static void main(String args[]){
		
System.out.println("In TopLevel. Starting to run program");

   for(int i=1;i<=1;i++){	
	
System.out.println(">>>> Now in OneLevelDown");
	
	for(int j=1;j<=1;j++){	
		
		System.out.println(">>>>>>>> Now in TwoLevelsDown.");
		
		for(int k=1;k<=1;k++){	
			
			System.out.println(">>>>>>>>>>>> Now in ThreeLevelsDown");
		}
		
		
	System.out.println(">>>>>>>> Back in TwoLevelsDown.");
}
	
System.out.println(">>>> Back in OneLevelDown");		
}


System.out.println("Back in TopLevel.");
	}
}
