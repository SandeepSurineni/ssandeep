public class PERFORM1 {
	
public static void main(String[] args) {
		TopLevel();	
	}
      static void TopLevel(){
		System.out.println("In TopLevel. Starting to run program");
		OneLevelDown();
		System.out.println("Back in TopLevel.");
	}
    static void TwoLevelDown() {
		System.out.println(">>>>>>>> Now in TwoLevelsDown.");
		ThreeLevelDown();
		System.out.println(">>>>>>>> Back in TwoLevelsDown.");
	}
	 static void OneLevelDown() {
		System.out.println(">>>> Now in OneLevelDown");
		TwoLevelDown();
		System.out.println(">>>> Back in OneLevelDown");	
	}
  static void ThreeLevelDown() {
		System.out.println(">>>>>>>>>>>> Now in ThreeLevelsDown");
	}

}
