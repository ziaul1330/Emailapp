package Email;
import java.util.Scanner;
//Generate an email with the following syntax: firstname.lastname@department.company.com
// Determine the department (sales, development, accounting), if none leave blank
// Generate a random String for a password
// Have set methods to change the password, set the mailbox capacity, and define an alternate email address
// Have get methods to display the name, email, and mailbox capacity

public class Email {
  private String firstname;
  private String lastname;
  private String department;
  private String password;
  private int mailBoxCapacity=500;
  private String alternateEmail;
  private String email;
  private String companySuffix=   "azcompany.com";
     
  
  //constructor to set the firstname and lastname
    public Email(String firstname,String lastname) {
    	this.firstname=firstname;
    	this.lastname=lastname;
    	System.out.println("New worker "+this.firstname+ " " + this.lastname);
    	
    	// call department 
    	this.department=setdepartment();
    	
    	System.out.println("Department: "+this.department);
    	
    	//call a method asking for random password
    	this.password=setRandompassword(10);
    //	System.out.println("your password is : "+this.password);
    	
    	/// call email to combine all
    	
    	email=firstname.toLowerCase()+ "."+lastname.toLowerCase()+ "@"+department+"."+companySuffix;
    	//System.out.println("your Email : "+email);
    }
    
    //ask the dipartment
    private String setdepartment() {
    	System.out.println("Department codes\n1 for sales \n2 for Developpment \n3 for Accounting \n0 for none  \nenter department code");
    	Scanner in = new Scanner(System.in);
    	int depchoice=in.nextInt();
    	if(depchoice==1) { return "Sales";	}
    	else if(depchoice==2) {return "Develoment";}
    	else if(depchoice==3) {return "Accounting";}
    	else { return "";}
}
    
    
    private String setRandompassword(int length) {
    	String passwordset="aabcdefghijklmnopqrstvwxyz!@#$%^&*()_+";
    	char[] password=new char[length];
    	for(int i=0;i<length;i++) {
    		int rand=(int) (Math.random() * passwordset.length());
    		password[i]=passwordset.charAt(rand);
    	}
    	return new String (password);
    }
        // set mailboxcapacity
       
    public  void setmailboxcapacity(int capacity) {
    	this.mailBoxCapacity=capacity;
    }
    
    
    // set alternate email 
     public void alternamtemai(String altemail) {
    	 this.alternateEmail=altemail;
     }
     
     public void chaangepassword(String password1) {
    	 this.password=password1;
     }
     
     
    
    public String Showinfo() {
    	return "Full name " +firstname+ " "+lastname+ "\nCompany name "+companySuffix+ "\nCompany email "+email+"\n password "+password+
    			"\nmailbox capacity "+mailBoxCapacity+ "mb";
    }
     
     
}