public class Driver {

	public static void main(String[] args) {

	FileLogger l1 = FileLogger.getLogger();
	l1.test();
	
	FileLogger l2 = FileLogger.getLogger();
	l2.test();
}

}
