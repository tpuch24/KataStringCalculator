
public class StringCalculator {

	int add(String str){
		int intSum=0;
		
		if(str.length()==0){
			//System.out.println("Chaine vide");
			return 0;
		}
	      for (String retval: str.split(",")){
	          //System.out.println(retval);
	    	  intSum+=Integer.parseInt(retval);
	       }
		return intSum;
	}
}
