

public class England extends WorldOrganization{

    String GREETINGS = "Hi. Mr. Gates. I am very pleased to meet you.";
    String ERRMESSAGE1 = "The add operation in class England is not supported";
	String ERRMESSAGE2 = "The remove operation in class England is not supported";

	public void add(WorldOrganization child) {
		  System.err.println(ERRMESSAGE1);
	}
	public void remove(WorldOrganization child) {
		  System.err.println(ERRMESSAGE2);
	}

    public String say(){
          return GREETINGS;
    }
}