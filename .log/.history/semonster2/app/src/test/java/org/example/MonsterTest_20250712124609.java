package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {

  @Test
  public void testConstructorAndToString() {
    Monster monster = new Monster("スライム", 1);
    assertEquals("スライム:レア度[1]", monster.toString());
  }

  @Test
  public void testGetNameAndRarity() {
    Monster monster = new Monster("ドラゴン", 4);
    assertEquals("ドラゴン", monster.getName());
    assertEquals(4, monster.getRarity());
  }
}
