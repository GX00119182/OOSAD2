public class FileLogger {
	

	int counter;
	
	private static FileLogger logger;

	private FileLogger(){
	counter++;	
	}
	public static FileLogger getLogger() {
    	if (logger == null) {
          logger = new FileLogger();
      		}
	return logger;
	}
	
	public void test(){
	System.out.println("dddddddddddddddddd" + counter);	
	}

}
