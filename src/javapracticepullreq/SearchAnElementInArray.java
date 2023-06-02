/*
 * author: Bapparaya
 * lastname:R
 */

package javapracticepullreq;

public class SearchAnElementInArray {

	public static void main(String[] args) {
      int a[] = {10,20,30,60};
      int search= 50;
      
      boolean flag=false;
      for(int i=0;i<a.length;i++) {
    	  if(a[i]==search) {
    		  System.out.println("element found at : " + i);
    		  flag=true;
    		  break;
    	  }
      }
      
      if(flag==false) {
    	  System.out.println("element not fount");
      }
	}
	
	

}
