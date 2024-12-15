class p1{
	public static void main(String [] args){
		try{
			int dividebyzero = 5 / 0 ;
			System.out.println("rest of code in try block");
		}
		catch (ArithmeticException e){
			System.out.println("ArithemetiException --> " + e.toString());
		}
	}
}