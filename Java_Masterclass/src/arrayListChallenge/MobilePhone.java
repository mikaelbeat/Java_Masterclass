package arrayListChallenge;

import java.util.ArrayList;

public class MobilePhone {
	
	private ArrayList<String> mobilePhone = new ArrayList<String>();
	
	public void addContact(String contact) {
		mobilePhone.add(contact);
	}
	
	public  void updateContact(String name, String newName){
		int position = findName(name);
		if(position >=0){
			updateContact(position, newName);
		}
	}
	
	public  void updateContact(int position, String newName){
		mobilePhone.set(position, newName);
		System.out.println("Contact name "+(position+1)+" has been updated.");
	}
	
	public void removeContact(String contact){
		int position = findName(contact);
		if(position >=0){
			removeContact(position);
		}
	}
	
	public void removeContact(int position){
		mobilePhone.remove(position);
	}
	
	public void viewContacts(){
		System.out.println("You have "+mobilePhone.size()+" contacts in mobile phone.");
		for(int i=0; i<mobilePhone.size(); i++){
			System.out.println((i+1)+". "+mobilePhone.get(i));
		}
	}

	private int findName(String searchName){
		return mobilePhone.indexOf(searchName);
	}
}
