// Author Michael Burns :- B0035365 date 14/03/2020
//References that helped with the below code https://www.youtube.com/watch?v=Yb0f_VMnvTo&list=PLfKyhM9sqOY5bHuIgk_taSa7qEBh8EPce&index=3 / https://stackify.com/specify-handle-exceptions-java/

package teamMember;

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
