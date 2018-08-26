import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author nandakumarv
 *
 */
public class MethodReference {

	/**
	 * @param args
	 */
	public static void main(String args[]){
	      ArrayList<String> names = new ArrayList<String>();
			
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
	      
	      /*for(String str : names) {
	    	  System.out.println(str);
	      }*/
			
	      names.forEach(System.out::println);
	   }

}
