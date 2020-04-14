// Author Michael Burns :- B0035365 date 14/03/2020
//Referances that helped with the below code https://www.youtube.com/watch?v=0KdG9DZgi6I&list=PLfKyhM9sqOY5bHuIgk_taSa7qEBh8EPce&index=42
//Referances that helped with the below code https://www.youtube.com/watch?v=Yb0f_VMnvTo&list=PLfKyhM9sqOY5bHuIgk_taSa7qEBh8EPce&index=38
package teamMember;

import javax.swing.JOptionPane;

public class TeamMember {
    private String name;
    private String employeeNumber;
    private String division;
    
    public TeamMember(){
        
        name = "";
        division = "";
    }
    public TeamMember( String employeeNumber, String name, String division) throws TeamMemberException{
        //Exception handling and cleaning up of data inputted.
        employeeNumber = employeeNumber.trim();
        name = name.trim();
        division = division.trim();
        
        if (employeeNumber.length () == 0){
        throw new TeamMemberException ("Error: ID cannot be BLANK!");
        }
        else if (name.length () == 0){
        throw new TeamMemberException ("Error: Name cannot be BLANK!");
        }
        else if (division.length () == 0){
        throw new TeamMemberException ("Error: Divison cannot be BLANK!");
        }
        else{    
            //sets data if everything validates from above code
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.division = division;
        }
    }
   public String getName(){
        return name;
    }
    public String getEmployeeNumber(){
        return employeeNumber;
    }
    public String getDivision(){
        return division;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(String employeeNumber){
        this.employeeNumber= employeeNumber;
    }
    public void setDivision(String division){
        this.division=division;
    }
    
    @Override
    public String toString(){
       return employeeNumber + "\t" + name + "\t" + division;
    }
}

