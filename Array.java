package assignment;

public class Array {
		public static void main(String[] args) {   
		 
		       int[] numbers = new int[]{1,2,3,4};
		     
		       double sum = 0;
		       for(int i=0; i < numbers.length ; i++)
		       sum = sum + numbers[i];
		      
		        double average = sum / numbers.length;
		        System.out.println("Average value of the array elements is : " + average); 
		   }
}


