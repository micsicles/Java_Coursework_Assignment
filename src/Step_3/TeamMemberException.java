package Step_3;

//checked try catch code
public class TeamMemberException extends Exception{
  
public TeamMemberException ()
    {
        super();
    }
    
public TeamMemberException(String message){
    super (message);
}

public TeamMemberException (Throwable cause) {
    super (cause);
}
    
public TeamMemberException(String message, Throwable cause) {
    super (message, cause);
}
}

