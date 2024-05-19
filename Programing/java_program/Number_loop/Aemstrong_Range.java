 
package Number_loop;

public class Aemstrong_Range {
	public static void main(String[] args) {
		int num = 400;

	      for (int i = 1;i<num; i++){
	         int check=i;
	         int  sum = 0;
	         
	         while(check != 0) 
	         {
	           int temp = check % 10;
	            sum = sum + (temp*temp*temp);
	            check = check / 10;
	         }
	         if(sum == i){
	            System.out.println(i+" is an Armstrong number.");
	         }
		}
	}
}
