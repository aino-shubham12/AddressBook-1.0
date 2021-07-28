/*
 * AppOps is a Java framework to develop, deploy microservices with ease and is available for free
 * and common use developed by AinoSoft.
 * 
 * AppOps and AinoSoft are registered trademarks of Aino Softwares private limited
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
 * If not, see <https://www.gnu.org/licenses/> <https://www.appops.org/license>
 */ 
 
 
package intern.demo.action;

import java.util.ArrayList;
import java.util.Scanner;
import intern.demo.Address;

/**
 * Description  : This class define the execute method  which is present in Action Interface , so  it implements Action Interface
 * @author      : Shubham Bangar
 * @version 1.0
 */

public class EnterAddressAction implements Action {

	/** abook is reference of Address ArrayList */
	private ArrayList<Address> abook;

	Scanner sobj = new Scanner(System.in);

	public EnterAddressAction(ArrayList<Address> Book) {
		abook = Book;
	}

	/**
	 * It is a concrete method which accept the all Address book characteristics and add them to Address ArrayList.
	 */
	public void execute() {

		System.out.println("Enter Street Address :");
		String street = sobj.next();
		
		System.out.println("Enter City Address :");
		String city = sobj.next();
		
		System.out.println("Enter Pincode Addrees :");
		int pin = sobj.nextInt();
		
		Address ad = new Address(street, city, pin);

		abook.add(ad);
		
		System.out.println("Address Book Added Succesfully !");
		System.out.println("----------------------------------------");
	}

}






//Console c = System.console();
//
//c.printf("Enter address street");
//String street = c.readLine();
//
//c.printf("Enter address city");
//String city = c.readLine();
//
//c.printf("Enter address pincode");
//int pin = Integer.parseInt(c.readLine());