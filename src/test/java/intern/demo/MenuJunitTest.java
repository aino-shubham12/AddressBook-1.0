package intern.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class MenuJunitTest {

  Menu menu = new Menu("Address Book Application");
  ApplicationBook abook = new ApplicationBook();


  @Test
  public void testDisplayText() {
    assertTrue(menu.getDisplayText() == "Address Book Application");

  }
}


