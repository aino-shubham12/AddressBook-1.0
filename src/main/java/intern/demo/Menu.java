package intern.demo;

import java.util.ArrayList;
import java.util.Scanner;

import intern.demo.action.Action;

/**
 * Description : The Menu class is inherited from its parent class (MenuItem).
 * so it can use all methods of its parent class and display the Menu.
 * 
 * @author :Shubham Bangar
 * @version 1.0
 */
public class Menu extends MenuItem {

	public Menu(String displayText) {
		super(displayText);
	}

	/**
	 * This is the ArrayList of a MenuItem which stores the items of menu
	 */
	private ArrayList<MenuItem> item = new ArrayList<MenuItem>();

	Scanner sobj = new Scanner(System.in);

	/**
	 * Description : This method is used to add Parent Menu.
	 * 
	 * @param choice : It is an integer parameter to addMenuItem method to add
	 *               choice in ArrayList item.
	 * @param menu   : It is an string parameter to addMenuItem method to add menu
	 *               in ArrayList item.
	 * @param act    : It is a reference of Action interface which performs action
	 *               on parent menu.
	 */
	public void addMenuItem(int choice, String menu, Action act) {
		MenuItem mi = new MenuItem(choice, menu, act);
		item.add(mi);
		mi.setParent(this);

	}

	/**
	 * Description : This method is used to add Child Menu.
	 * 
	 * @param choice : It is an integer parameter to addMenuItem method to add
	 *               choice in ArrayList item.
	 * @param menu   : Its is a reference of child menu to add nested menu in
	 *               ArrayList item.
	 * @param act    : It is a reference of Action interface which performs action
	 *               on child menu.
	 */
	public void addMenuItem(int choice, Menu menu, Action act) {
		menu.setChoice(choice);
		menu.setAction(act);
		item.add(menu);
		menu.setParent(this);

	}

	/**
	 * Depends on user action this method is used to display Parent Menu as well as
	 * Child(nested) Menu.
	 */
	public void display() {
		while (true) {
			System.out.println(getDisplayText());
			System.out.println("==============================================================================");

			for (MenuItem m : item) {
				if (m instanceof Menu) {
					((Menu) m).displayAsMenuItem();

				} else {
					m.display();
				}
			}
			System.out.println("Enter your choice:");

			int choice = sobj.nextInt();

			for (MenuItem m : item) {
				if (m.isSelected(choice))
					break;

			}
		}
	}

	/**
	 * This method display menu items of Menu.
	 */
	public void displayAsMenuItem() {
		System.out.println(getChoice() + " : " + getDisplayText());
	}

}
