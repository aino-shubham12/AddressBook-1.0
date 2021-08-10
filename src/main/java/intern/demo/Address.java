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

/**
 * Description : The Address class used to display All details of Address Book.
 * 
 * @author : Shubham Bangar
 * @version 1.0
 */

public class Address {

  private String street, city;
  private int pinCode;

  public Address(String street, String city, int pinCode) {

    this.street = street;
    this.city = city;
    this.pinCode = pinCode;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getPinCode() {
    return pinCode;
  }

  public void setPinCode(int pinCode) {
    this.pinCode = pinCode;
  }

  /**
   * Description : This method is used to display the content of Address Book with its index.
   * 
   * @param i : This is the integer parameter display method. It shows index of specific content of
   *        Address Book.
   */
  public void display(int i) {

    System.out.printf(i + "\t" + street + "\t" + city + "\t" + pinCode + "\n");
  }

  /**
   * Description : This is method is used to display the contents of Address Book.
   */
  public void display() {
    System.out.printf(street + "\t" + city + "\t" + pinCode + "\n");
  }

  /**
   * Description : This method is used to check whether two strings are equals.
   * 
   * @param str : This is the string parameter to isMatchStreet method and it is used to check given
   *        street is equal to this street.
   * @return : boolean value i.e true or false.
   */
  public boolean isMatchStreet(String str) {
    return this.street.contains(str);
  }

  /**
   * Description : This method is used to check whether two strings are equals.
   * 
   * @param str : This is the string parameter to isMatchCity method and it is used to check given
   *        city is equal to this city.
   * @return : boolean value i.e true or false.
   */
  public boolean isMatchCity(String str) {
    return this.city.contains(str);

  }

  /**
   * Description : This method is used to check whether two integers are equals.
   * 
   * @param pincode : This is the interger parameter to isMatchPincode method and it is used to
   *        check given pincode is equal to this pinocde.
   * @return : boolean value i.e true or false.
   */
  public boolean isMatchPincode(int pincode) {
    return (this.pinCode == pincode);
  }

}
