 package AssistedProject;

 class Demo{
	Demo(){
		System.out.println("zero or no argument constructor.....");
	}
}
	
 class AdharCard {
		String name;
		String dob;
		long contactno;
	    
		
		AdharCard(String personname,String persondob,long cno){
			name=personname;
			dob=persondob;
			contactno=cno;
		}

	}
	

  public class ConstructorWithTypes {

	public static void main(String[] args) {
      
		new Demo();
		
  //parameterized constructor defined
		AdharCard a1=new AdharCard("Abhijit","14/10/1997",123456789);
		System.out.println("name= "+a1.name);
		System.out.println("dob= "+a1.dob);
		System.out.println("contactno= "+a1.contactno);
		
		System.out.println("-----------------");
		AdharCard a2=new AdharCard("Shweta","09/07/1998",987654321);
		System.out.println("name= "+a2.name);
		System.out.println("dob= "+a2.dob);
		System.out.println("contactno= "+a2.contactno);
	}

}


