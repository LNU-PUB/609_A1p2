package sinkingships.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for the Ship class.
 */
public class ShipTest {

  @Test
  public void testShipTypeSizeAndName() {
    // Test with each ShipType enum
    for (ShipType type : ShipType.values()) {
      Ship ship = new Ship(type);
      assertEquals(type, ship.getShipType());
      assertEquals(type.getName(), ship.getName());
      assertEquals(type.getSize(), ship.getShipSize());
    }
  }
}
