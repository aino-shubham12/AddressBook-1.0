/*
AppOps is a Java framework to develop, deploy microservices with ease and is available for free and common use developed by AinoSoft.

AppOps and AinoSoft are registered trademarks of Aino Softwares private limited 

Copyright (C) <2016>  <Aino Softwares private limited>
 
This program is free software: you can redistribute it and/or modify it under the terms of the 
GNU General Public License as published by the Free Software Foundation, either version 3 of the 
License, or (at your option) any later version along with applicable additional terms as provisioned by GPL 3. 

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License and applicable additional terms along with this program. 

If not, see <https://www.gnu.org/licenses/> <https://www.appops.org/license>
*/

package intern.demo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class JunitFiveExamplesTest {

  @Test
  public void shouldRaiseAnException() throws Exception {
    assertThrows(Exception.class, () -> {
      throw new NullPointerException("Null parameters are not allowed");
    });
  }


  @Test
  public void shouldAssertAllTheGroup() {
    List<Integer> list = Arrays.asList(1, 2, 4);
    assertAll(() -> assertEquals(list.get(0).intValue(), 1),
        () -> Assertions.assertEquals(list.get(1).intValue(), 2),
        () -> Assertions.assertEquals(list.get(2).intValue(), 4));
  }

  @Test
  public void shouldFailBecauseTimeout() throws InterruptedException {
    assertTimeout(Duration.ofMillis(1), () -> Thread.sleep(10));
  }



}
