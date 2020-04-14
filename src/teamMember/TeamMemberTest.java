// Author Michael Burns :- B0035365 date 14/03/2020
//References that helped with the below code :- https://www.youtube.com/watch?v=0KdG9DZgi6I&list=PLfKyhM9sqOY5bHuIgk_taSa7qEBh8EPce&index=42 , https://examples.javacodegeeks.com/adt-java-tutorial/#section4

//Imports required
package teamMember;
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

// set up of label names and display text size + display text area
public class TeamMemberTest extends JFrame {
    
    //GUI components
    JTextArea   interfaceText            = new JTextArea     ();
    
    JLabel      employeeNumberLabel      = new JLabel        ("employee Number: ");
    JTextField  employeeNumberTextField  = new JTextField    (6);
    JLabel      nameLabel                = new JLabel        ("Employee Name: ");
    JTextField  nameTextField            = new JTextField    (10);
    JLabel      divisionLabel            = new JLabel        ("Division: ");
    JTextField  divisionTextField        = new JTextField    (15);
    
    JButton     addButton                = new JButton       ("Add");
    JButton     findDisplayButton        = new JButton       ("Find & Display");
    JButton     RemoveButton             = new JButton       ("Remove");
    JButton     displayAllButton         = new JButton       ("Display All");
    JButton     exitButton               = new JButton       ("Exit");

//Class Starter Linked List
private LinkedList<TeamMember> teamMemberLinkedList = new LinkedList<TeamMember>();
    
    
// Set up of the buttons to link the above into 2 different panel regions on the GUI
public TeamMemberTest (){
    JPanel flowPanel  = new JPanel (new FlowLayout(FlowLayout.CENTER));
    JPanel flow1Panel = new JPanel (new FlowLayout(FlowLayout.CENTER));
    JPanel gridPanel  = new JPanel (new GridLayout(2,1));
    
    interfaceText.setEditable(false);
    
    flowPanel.add   (employeeNumberLabel);
    flowPanel.add   (employeeNumberTextField);
    flowPanel.add   (nameLabel);
    flowPanel.add   (nameTextField);
    flowPanel.add   (divisionLabel);
    flowPanel.add   (divisionTextField);
    
    flow1Panel.add  (addButton); 
    flow1Panel.add  (findDisplayButton);
    flow1Panel.add  (RemoveButton);
    flow1Panel.add  (displayAllButton);
    flow1Panel.add  (exitButton);
    
    gridPanel.add   (flowPanel);
    gridPanel.add   (flow1Panel);
    
    add (interfaceText,BorderLayout.CENTER);
    add (gridPanel,BorderLayout.SOUTH);
    
    addButton.addActionListener            (event -> addMember());
    findDisplayButton.addActionListener     (event -> findDisplayButton());
    RemoveButton.addActionListener         (event -> deleteMember());
    displayAllButton.addActionListener     (event -> displayAll());
    exitButton.addActionListener           (event -> exitQuit());
}     

//determines uniquness of ID field
private boolean isEmployeeIDInLinkedList(String eidLL){
    boolean  isEmployeeIdUnique = false; 
    for (TeamMember details : teamMemberLinkedList){
       if (details.getEmployeeNumber().compareToIgnoreCase (eidLL)==0)
       {
           isEmployeeIdUnique = true;
       }
       }
       return isEmployeeIdUnique;
    } 

//determines uniquness of name field for find & display button
private boolean isEmployeeNameInLinkedList(String enLL){
    boolean  isEmployeeNameUnique = false; 
       for (TeamMember details : teamMemberLinkedList){
       if (details.getName().compareToIgnoreCase (enLL)==0)
       {
           isEmployeeNameUnique = true;
       }
       }
       return isEmployeeNameUnique;
}

//adds member details
private void addMember(){
    if (isEmployeeIDInLinkedList(employeeNumberTextField.getText())== true){
        JOptionPane.showMessageDialog (null,"Error: Member ID is already in use!!");
    }
    else{
        try{
            TeamMember team = new TeamMember(employeeNumberTextField.getText(),nameTextField.getText(),divisionTextField.getText());
            teamMemberLinkedList.add(team);
        }
        catch(TeamMemberException error){
            JOptionPane.showMessageDialog(null,error.toString());
    }
        
        //clears text area after input
        employeeNumberTextField.setText("");  
        nameTextField.setText("");            
        divisionTextField.setText("");        
    }       
}

// displays all in Linked List
private void displayAll(){
    interfaceText.setText ("\t" + "Id:" + "\t" + "Name:" + "\t" +"Division:" + "\n\n"); 
    if (teamMemberLinkedList.isEmpty()){
        JOptionPane.showMessageDialog (null,"Error: Database is empty.!!");}
    for (TeamMember details : teamMemberLinkedList){
            interfaceText.append ("\t" + details + "\n");
    }
}

//deletes member from the Linked List
private void deleteMember(){
    if (teamMemberLinkedList.isEmpty()){
        JOptionPane.showMessageDialog (null,"Error: Database is empty.!!");
    }
    else if (isEmployeeIDInLinkedList(employeeNumberTextField.getText())== false){
        JOptionPane.showMessageDialog (null,"Error: Member ID is not in the system!!");
    }
    else{
       for (int tm = 0; tm < teamMemberLinkedList.size(); tm++){
          String currEmn = teamMemberLinkedList.get(tm).getEmployeeNumber();
       if (currEmn.compareToIgnoreCase (employeeNumberTextField.getText())==0)
       {
           teamMemberLinkedList.remove(tm);
           interfaceText.setText("\t" + "Member has been removed.");
       }
    }
       //clears text area after input
        employeeNumberTextField.setText("");  
        nameTextField.setText("");            
        divisionTextField.setText("");        
} 
}

//finds and displays a specific person based on name field
private void findDisplayButton(){    
    interfaceText.setText ("\t" + "Id:" + "\t" + "Name:" + "\t" +"Division:" + "\n\n"); 
    if (isEmployeeNameInLinkedList(nameTextField.getText())== false){
        JOptionPane.showMessageDialog (null,"Error: Member Name is not in the system!!");
    }
    else{
       for (int tm = 0; tm < teamMemberLinkedList.size(); tm++){
          String found = teamMemberLinkedList.get(tm).getEmployeeNumber();
          String found1 = teamMemberLinkedList.get(tm).getName();
          String found2 = teamMemberLinkedList.get(tm).getDivision();
          if (found1.compareToIgnoreCase (nameTextField.getText())==0)
          {
              //teamMemberLinkedList.contains(tm);
              interfaceText.append("\t" + found +"\t"+ found1 +"\t"+ found2 + "\n");
    }
       }
       //clears text area after input
        employeeNumberTextField.setText("");  
        nameTextField.setText("");            
        divisionTextField.setText("");
}
    }

//exit of the program
private void exitQuit(){
    //can prompt for user to save file here
    System.exit(0);
}

//prompt gui sizes of the overall space
public static void main (String[]args){
    TeamMemberTest app = new TeamMemberTest ();
    app.setVisible  (true);
    app.setSize     (800,800);
    app.setLocation (200,100);
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
