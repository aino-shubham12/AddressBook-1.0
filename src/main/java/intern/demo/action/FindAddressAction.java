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
 
 
package intern.demo.action;

import java.util.ArrayList;
import java.util.Scanner;
import intern.demo.Address;
// import intern.demo.Menu;

/**
 * Description : This class define the execute method which is present in Action Interface , so it
 * implements Action Interface
 * 
 * @author : Shubham Bangar
 * @version 1.0
 */

public class FindAddressAction implements Action {

  /** abook is reference of Address ArrayList */
  private ArrayList<Address> abook;
  private String findBy;
  Scanner sobj = new Scanner(System.in);
  // private Menu Menu;

  public FindAddressAction(ArrayList<Address> Book, String by) {
    this.abook = Book;
    this.findBy = by;
  }

  /**
   * It is a concrete method which is to find Address using MenuItem class characteristics , only
   * user have to give choice so corresponding action gets executed.
   */
  public void execute() {

    if (this.findBy == "Street") {
      findByStreet();
    } else if (this.findBy == "City") {
      findByCity();
    } else if (this.findBy == "Pincode") {
      findByPincode();
    }
  }

  /**
   * This method accept String street from user and find corresponding Address from Address Book. It
   * display failure if given street not present in the Address Book
   */
  public void findByStreet() {
    int flag = 0;
    System.out.println("Enter street to search :");
    String str = sobj.nextLine();

    for (Address ad : abook) {
      if (ad.isMatchStreet(str)) {
        ad.display();
        flag = 1;
        break;
      }
    }
    if (flag == 0) {
      System.out.println(str + " " + "street not found in the Address Book");
    }

  }

  /**
   * This method accept String city from user and find corresponding Address from Address Book. It
   * display failure if given city not present in the Address Book
   */
  public void findByCity() {
    int flag = 0;
    System.out.println("Enter City to search :");
    String str = sobj.nextLine();
    for (Address ad : abook) {
      if (ad.isMatchCity(str)) {
        ad.display();
        flag = 1;
        break;
      }
    }

    if (flag == 0) {
      System.out.println(str + " " + "city not found in the Address Book");
    }

  }

  /**
   * This method accept integer pincode from user and find corresponding Address from Address Book.
   * It display failure if given pincode not present in the Address Book
   */
  private void findByPincode() {
    int flag = 0;
    System.out.println("Enter pincode to search:");
    int pincode = sobj.nextInt();

    for (Address ad : abook) {
      if (ad.isMatchPincode(pincode)) {
        ad.display();
        flag = 1;
        break;
      }

    }
    if (flag == 0) {
      System.out.println(pincode + " " + "pincode not found in the Address Book");
    }

  }
}
