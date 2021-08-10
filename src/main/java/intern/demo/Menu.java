/*
 * AppOps is a Java framework to develop, deploy microservices with ease and is available for free
 * and common use developed by AinoSoft ( www.ainosoft.com )
 *
 * AppOps and AinoSoft are registered trademarks of Aino Softwares private limited, India.
 *
 * Copyright © 2016 <Aino Softwares private limited>
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version along with applicable additional terms as
 * provisioned by GPL 3.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License and applicable additional terms
 * along with this program.
 *
 * If not, see <https://www.gnu.org/licenses/> and <https://www.appops.org/license>
 *
 *
 */
package intern.demo;

import java.util.ArrayList;
import java.util.Scanner;
import intern.demo.action.Action;

/**
 * Description : The Menu class is inherited from its parent class (MenuItem). so it can use all
 * methods of its parent class and display the Menu.
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
   * @param choice : It is an integer parameter to addMenuItem method to add choice in ArrayList
   *        item.
   * @param menu : It is an string parameter to addMenuItem method to add menu in ArrayList item.
   * @param act : It is a reference of Action interface which performs action on parent menu.
   */
  public void addMenuItem(int choice, String menu, Action act) {
    MenuItem mi = new MenuItem(choice, menu, act);
    item.add(mi);
    mi.setParent(this);

  }

  /**
   * Description : This method is used to add Child Menu.
   * 
   * @param choice : It is an integer parameter to addMenuItem method to add choice in ArrayList
   *        item.
   * @param menu : Its is a reference of child menu to add nested menu in ArrayList item.
   * @param act : It is a reference of Action interface which performs action on child menu.
   */
  public void addMenuItem(int choice, Menu menu, Action act) {
    menu.setChoice(choice);
    menu.setAction(act);
    item.add(menu);
    menu.setParent(this);

  }

  /**
   * Depends on user action this method is used to display Parent Menu as well as Child(nested)
   * Menu.
   */
  public void display() {
    while (true) {
      System.out.println(getDisplayText());
      System.out.println(
          "==============================================================================");

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
