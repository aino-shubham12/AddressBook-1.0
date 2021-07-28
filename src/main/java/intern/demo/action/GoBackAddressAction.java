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


import intern.demo.Menu;

/**
 * Description : This class define the execute method which is present in Action
 * Interface , so it implements Action Interface
 * 
 * @author : Shubham Bangar
 * @version 1.0
 */

public class GoBackAddressAction implements Action {

	private Menu menu;
	public GoBackAddressAction(Menu menu) {
		this.menu = menu;
	}

	/** It is a reference of Menu class which is used to display Parent Menu and MenuItem */
	public void execute() {
		menu.display();
	}
}
