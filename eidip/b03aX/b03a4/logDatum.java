public class logDatum {
	public static boolean istSchaltjahr(int a){

		boolean fourdivides = (a < 1583		&	  a % 4 == 0) ? true : false;

		

		boolean hundreddividesnot = (a >= 1583   &   a % 4 == 0   &   a % 100 != 0) ? true : false ;

		
		if (fourdivides){
		return ((a >= 1583)	& (a % 4 == 0)	&	(a % 100 == 0)  & (a % 400 == 0)) ? true : fourdivides;
	
	}else{
		return hundreddividesnot;
	} 
	}

}