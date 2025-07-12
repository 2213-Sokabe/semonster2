package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void testGetGreeting() {
    App app = new App();
    String expected = "こんにちは SEMonster";
    assertEquals(expected, app.getGreeting());
  }

  @Test
  public void testSummonMonsterFromApp() {
    // App側からMonster.summonMonsterを使って確認
    Monster monster = Monster.summonMonster(2);
    assertEquals("デュラハン", monster.getName());
    assertEquals(2, monster.getRarity());
  }
}
