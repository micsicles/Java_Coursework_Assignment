//references and areas that helped with the below code https://www.youtube.com/watch?v=RBSGKlAvoiM / https://moodle.uws.ac.uk/mod/subpage/view.php?id=54130 / https://www.youtube.com/watch?v=sYjEzOIa5JI

package companytests;


public class Company{

    private void replaceNode(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void replaceWithNextLargest(ProjectsNode current, ProjectsNode current0, ProjectsNode dates) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // the node types for the tree structure
    private class ProjectsNode{
        private String data;
        private ProjectsNode company, project, dates;
    }
    public class ProjectNotFoundException extends Exception{}
    private final ProjectsNode root;
    private ProjectsNode current;
    
    
    public Company(String CompanyName){
        this.root = new ProjectsNode();
        this.root.data = CompanyName;
        this.current = this.root;
    }
    
    @Override
        public String toString(){
        String companyDetails = new String();
        companyDetails += "\n"+ this.root.data + " is the company\n\n";
        ProjectsNode company = this.root.project;
        ProjectsNode companys = this.current.dates;       
        if (company == null){
            companyDetails += "Has no Projects\n";
        }else{
            while(company !=null) {   
            companyDetails += "The projects are "+company.data+"\n"; 
            companyDetails +="the expected start date is " + companys.data +"\n";
            companyDetails += "the expected end date is " + companys.dates.data + "\n\n";                 
            company = company.project;
            companys = companys.dates;
                }   
        } 
        return companyDetails;
    }
        //the code that adds the project nodes
    public void addProject(String pro) {
        ProjectsNode pt = new ProjectsNode();
        pt.data = pro;
        pt.company = this.current;
        if (this.current.project == null) {
            this.current.project= pt;
        } else {
            ProjectsNode next = this.current.project;
            while (next.project != null) {
                next = next.project;
            }
            next.project= pt;
        }
    }
   //the code that add the dates (still to set dates to actual dates as accepts all data at moment.
    public void addDates(String dte){
        ProjectsNode dates = new ProjectsNode();
        dates.data = dte;
        dates.project = this.current;
        if(this.current.dates == null){
            this.current.dates = dates;                    
        }else{
           ProjectsNode next = this.current.dates;
            while(next.dates !=null){
                next = next.dates;
            }
            next.dates = dates;            
        }
    }
    //used to serach through all data from root.
    public void findDetails(String dat) throws ProjectNotFoundException{
        ProjectsNode date;
        ProjectsNode project;
        if (dat.equalsIgnoreCase(this.root.data)) {
            date = this.root;
        } else {
            if(this.root.project==null)
                throw new ProjectNotFoundException();
            date = this.checkProject(dat, this.root);
            if (date == null) {
                project = this.root.project;
                while (date==null) {
                    date = this.checkProject(dat, project);
                    if (date == null) {
                        project = project.dates;
                        if (project == null) {
                            throw new ProjectNotFoundException();
                        }
                    }
                }
            }
        }
        this.current=date;
    }
    //used as a boolean search for find dates code above
    private ProjectsNode checkProject(String data, ProjectsNode pjt) {
        pjt=pjt.project;
        Boolean search = pjt != null;
        while (search) {
            if (data.equalsIgnoreCase(pjt.data)) {
                search = false;
            } else {
                pjt = pjt.dates;
                if (pjt== null) {
                    search = false;
                }
            }
        }
        return pjt;
    }
    //gets all details for displaying for below code
    public String getDetails(){
        String projectDetails = new String();
        if(this.root !=null){
            projectDetails += this.getAlpha(this.root);
    }else{
    projectDetails +="There is no projects";
}
    return projectDetails;
}

//this is where want to sort the projects into alphabetical order but is only preorder at current.
private String getAlpha(ProjectsNode company){
String alphaDetails = new String();
if(company != null){
alphaDetails += company.data + "  "; 
alphaDetails += this.getAlpha(company.project);
//alphaDetails += this.getAlpha(company.dates);
}
return alphaDetails;
}
// the code to remove however the code isnt fine tuned to this code and need a lot of work to get it to work with this code.
public void remove(String data) throws ProjectNotFoundException {
        data=this.getDetails();       
        if (this.current.project == null && this.current.dates == null) {
            this.replaceNode(null);
        } else if (this.current.project != null && this.current.dates == null) {
            this.replaceNode(this.current.project);
            this.current.project = null;
        } else if (this.current.project == null && this.current.dates != null) {
            this.replaceNode(this.current.dates);
            this.current.dates = null;
        } else {
            this.replaceWithNextLargest(this.current, this.current, this.current.dates);
        }
       
}
    //gets current nodes.
    public String getCurrent() {
        String currentDetails = new String();
        currentDetails += this.current.data;
        if (this.current.company != null) {
            currentDetails += " is the projects for the Company: " + this.current.company.data +'\n';
        } else {
            currentDetails += " is the company\n";
        }        
        return currentDetails;
       
    }

}