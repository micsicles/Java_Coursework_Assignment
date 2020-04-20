package Step_3;
// Author Michael Burns :- B0035365 date 17/03/2020
//Referances that helped with the below code https://www.youtube.com/watch?v=0KdG9DZgi6I&list=PLfKyhM9sqOY5bHuIgk_taSa7qEBh8EPce&index=42
//Referances that helped with the below code https://www.youtube.com/watch?v=Yb0f_VMnvTo&list=PLfKyhM9sqOY5bHuIgk_taSa7qEBh8EPce&index=38

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TeamMember {
    private String name;
    private String employeeNumber;
    private String division;
    public String project;
    
    public TeamMember(){
        
        name = "";
        division = "";
    }
    public TeamMember( String employeeNumber, String name, String division, String project) throws TeamMemberException{
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
        this.project = project;
        }
    }
    
    // getters and setters
   public String getName(){
        return name;
    }
    public String getEmployeeNumber(){
        return employeeNumber;
    }
    public String getDivision(){
        return division;
    }
    public String getProject(){     
        return project;
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
       return employeeNumber + "\t" + name + "\t" + division + "\t" + project;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
