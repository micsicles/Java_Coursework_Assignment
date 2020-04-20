package companytests;


public class CompanyTests {

    
public static void main(String[] args) {
        String data = Input.getString("input the Company name: ");
        Company company = new Company(data);
        

Integer option;
do{
            System.out.println();
            System.out.println("1: add project details");
            System.out.println("2: find project");
            System.out.println("3: remove project");
            System.out.println("4: display all projects");
            System.out.println("5: project list");
            System.out.println("0: quit");
            option = Input.getInteger("input option: ");
            switch (option) {
                case 1:
                    data = Input.getString("input the project's name: ");
                    company.addProject(data); 
                    data= Input.getString("input the start Date: ");
                    company.addDates(data);
                   data = Input.getString("input the end Date: ");
                    company.addDates(data);
                    break;
                case 2:
                    data = Input.getString("input the project's name: ");
                    try{
                        company.findDetails(data);
                        System.out.println(company.getCurrent());
                    } catch(Company.ProjectNotFoundException e){
                        System.out.println("not found");
                    } 
                    break;
                case 3:/*   //remove still to be worked upon.
                    data=Input.getString("value: ");
                    try{
                        data=(String)company.remove(data);
                        System.out.println(data+" removed");
                    }
                    catch(Company.ProjectNotFoundException e){
                        System.out.println("remove invalid - value not found");
                    }  */                         
                    break;                         
                case 4:
                    System.out.println(company);
                    break;
                case 5:
                    System.out.println(company.getDetails());
                    break;
                case 0:
                    System.out.println("quitting program");
                    break;
            }
        } while (option != 0);
}}