/*
 * AppOps is a Java framework to develop, deploy microservices with ease and is available for free
 * and common use developed by AinoSoft ( www.ainosoft.com )
 * 
 * AppOps and AinoSoft are registered trademarks of Aino Softwares private limited, India.
 * 
 * Copyright (C) <2016> <Aino Softwares private limited>
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
 */
 
 
package intern.demo;

import java.util.ArrayList;
import intern.demo.action.DeleteAddressAction;
import intern.demo.action.DisplayAddressAction;
import intern.demo.action.DisplayMenuAction;
import intern.demo.action.EnterAddressAction;
import intern.demo.action.ExitAddressAction;
import intern.demo.action.FindAddressAction;
import intern.demo.action.GoBackAddressAction;

/**
 * Description : The ApplicationBook program implements an Address Book application that contains
 * all Actions to be executed.
 * 
 * @author : Shubham Bangar
 * @version 1.0
 */

public class ApplicationBook {

  /**
   * This is the ArrayList of a Address which contains all details of Address Book
   */
  ArrayList<Address> Book = new ArrayList<Address>();

  /**
   * This is the main entry point to code generation which contains all Address Book Actions.
   */
  public void run() {

    Menu mobj = new Menu("Address Book Application");

    mobj.addMenuItem(1, "Enter Address", new EnterAddressAction(Book));
    mobj.addMenuItem(2, "Delete Address", new DeleteAddressAction(Book));
    mobj.addMenuItem(3, "Display Book", new DisplayAddressAction(Book));

    Menu findAddress = new Menu("Find Address");
    findAddress.addMenuItem(1, "By Street", new FindAddressAction(Book, "Street"));
    findAddress.addMenuItem(2, "By City", new FindAddressAction(Book, "City"));
    findAddress.addMenuItem(3, "By Pincode", new FindAddressAction(Book, "Pincode"));
    mobj.addMenuItem(4, findAddress, new DisplayMenuAction(findAddress));
    findAddress.addMenuItem(4, "Go Back", new GoBackAddressAction(mobj));
    mobj.addMenuItem(5, "Exit", new ExitAddressAction(Book));
    new DisplayMenuAction(mobj).execute();
    // mobj.run();

  }

  /**
   * This is the main method which makes use of run method.
   * 
   * @param args Unused.
   */
  public static void main(String[] args) {
    ApplicationBook Abook = new ApplicationBook();
    Abook.run();
  }

}
