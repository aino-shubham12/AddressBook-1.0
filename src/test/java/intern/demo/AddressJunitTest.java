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
