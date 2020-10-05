package oct01_morning;

public class Array02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*here i am printing 1D array
		 *the procedure is simple while 
		 *we do with "for-each loop" 
		 *
		 * for( <data-type> <object-name> : <array-name> )
		 * {
		 * 		always print the object-name
		 * }
		 * 
		 */
		int[] a= {1,2,3,4};
		for(int i: a)
		{
			System.out.println(i);
		}
	}

}
