import java.util.Arrays;

public class ReferenceType {

	public static void main(String[] args) {
		int myIntValue=10;
		int anotherIntValue=myIntValue;
		System.out.println("myIntValue: "+myIntValue);
        System.out.println("anotherIntValue "+ anotherIntValue);
        
        anotherIntValue=anotherIntValue+1;
        System.out.println("myIntValue: "+myIntValue);
        System.out.println("anotherIntValue "+ anotherIntValue);
        System.out.println("______________");
        
        int[] myIntArray= new int[5];
        int[] anotherArray= myIntArray;
        System.out.println("myIntArray: "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));
	
          anotherArray[0]=1;
		
		System.out.println("myIntArray:" + Arrays.toString(myIntArray));
		System.out.println("anotherArray:" + Arrays.toString(anotherArray));
	}

}
