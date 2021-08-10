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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AddressJunitTest {

  Address ad = new Address("Pune", "mundhwa", 24);
  ApplicationBook abook = new ApplicationBook();
  ApplicationBook book = null;



  @Test
  public void test() {
    assertTrue(ad.getStreet() == "Pune");
    assertTrue(ad.getCity() == "mundhwa");
    assertTrue(ad.getPinCode() == 24);
  }

  @Test
  public void testIsMatch() {
    assertTrue(ad.isMatchCity("mundhwa"));
    assertTrue(ad.isMatchStreet("Pune"));
    assertTrue(ad.isMatchPincode(24));
  }

  @Test
  public void isObjectNotNull() {
    assertNotNull(ad);
  }

  @Test
  public void isObjectNull() {
    assertNull(book);
  }

  @Test
  public void isObjectSame() {
    assertSame(ad, ad);

  }

}
