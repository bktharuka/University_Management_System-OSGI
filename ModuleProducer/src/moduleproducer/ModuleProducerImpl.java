package moduleproducer;

import java.util.ArrayList;
import java.util.Scanner;


import moduleproducer.Module;


public class ModuleProducerImpl implements ModuleProducer {
	Scanner sc = new Scanner(System.in);
	String mmoduleId, mmoduleName, mcredict, mmedium, mmoduleFee; 
	static ArrayList<Module> mmodule = new ArrayList<Module>();


		
	public void ModuleRegister() {

		
		System.out.println("**************************************************************************");
		System.out.println("**************Welcome to Module Registration Panel***********************");
		System.out.println("**************************************************************************");
		System.out.println();
		
		System.out.print("Are You A New Module (y|Y or n|N)?: ");
		String input = sc.next();
		System.out.println();
		
		while (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("Y")) {
			System.out.println("If you wish to end your proccess and leave the system, type exit");
			
			System.out.println("............................................................... ");	
			System.out.println("Enter module id: ");
			mmoduleId = sc.next();
			
			System.out.println("Enter module name: ");
			mmoduleName = sc.next();
			
			System.out.println("Enter module credict: ");
			mcredict = sc.next();
			
			System.out.println("Enter module medium: ");
			mmedium = sc.next();
			
			System.out.println("Enter module fee: ");
			mmoduleFee = sc.next();
			
			mmodule.add(new Module(mmoduleId, mmoduleName, mcredict, mmedium, mmoduleFee));

			System.out.println("Do You Want To Add Another module(y/n)?");
			input = sc.next();
			
			
		}
		
	}

	@Override

	public void UpdateModule(Module module) {
		System.out.print("Do you want to update Module details(y/n)? ");
		String input = sc.next();
		System.out.println("--------------------------------------------------------------------------");
		
		while (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("Y")) {
			
			if (mmodule.contains(module)) {
				
				System.out.println("What do you want to edit?(name-1, credict-2, medium-3, fee-4): ");
				int editDetails = sc.nextInt();
				
				if(editDetails == 1) {
					System.out.println("Enter module name: ");	
					mmoduleName = sc.next();
					}
				
				else if (editDetails == 2) {
					System.out.println("Enter credict: ");
					mcredict = sc.next();
				}
				else if (editDetails == 3) {
					System.out.println("Enter module medium: ");
					mmedium = sc.next();
				}
				
				else if (editDetails == 4) {
					System.out.println("Enter new fee: ");
					mmoduleFee = sc.next();
				}
				
				else { 
					System.out.println("Undefined input!");
				}
				System.out.println("--------------------------------------------------------------------------");
				mmodule.set(mmodule.indexOf(module), new Module(mmoduleId, mmoduleName, mcredict, mmedium,  mmoduleFee) );
			}
			else if (mmodule.size() == 0) {
				System.out.println("No record added yet! ");
			}
			else {
				System.out.println("Ivalid module ID!");
			}
			System.out.println("Do you want to update another module details(y/n)?");
			input = sc.next();
		}
		
	}

	@Override
	public void ModuleDelete(String moduleid) {
		System.out.print("Are You Sure; Do You Want To Delete This Module (y|Y or n|N)?: ");
		String input = sc.next();

		while (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("Y")) {
			if(mmodule.size() !=0) { 
				int x =0;
				for (int y = 0; y < mmodule.size(); y++) {
					if(mmodule.get(y).getModuleId() == mmoduleId) { 
					String deleteID = mmodule.get(y).getModuleId();
					mmodule.remove(y);
					System.out.println("Subject :" + deleteID + "is module deleted successfully");
					break;
					}	
					x++;
				}
			}else {
				System.out.println("No record added yet!");
			}
			System.out.println("Do you want to delete another module(y/n)?");
			input = sc.next();
		} 
		
	}

	
		
	@Override
	public void displayModuleList() {
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------------Display Module Details--------------------------------------");
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println();
		
		for (Module enroll : mmodule) {
			System.out.println("--------------------------Module Details-------------------------------");
			System.out.println("Module ID      : " + enroll.getModuleId());
			System.out.println("Module Name    : " + enroll.getModuleName());
			System.out.println("Module Credict : " + enroll.getCredict());
			System.out.println("Module Medium  : " + enroll.getMedium());
			System.out.println("Module Fee     : " + enroll.getModuleFee());
			System.out.println("\n");
			
		}
		
	}

	@Override
	public Module getModuleById(String moduleid) {
		for (Module module : mmodule) {
			if (module.getModuleId() == mmoduleId) {
				return module;
			}
		}
		return null;
	}

	

}
