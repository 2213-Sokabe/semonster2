package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {

  @Test
  public void testSummonMonster() {
    // 各レア度のモンスターが正しく生成されるかを確認
    Monster m0 = Monster.summonMonster(0);
    assertEquals("スライム", m0.getName());
    assertEquals(0, m0.getRarity());

    Monster m4 = Monster.summonMonster(4);
    assertEquals("キングドラゴン", m4.getName());
    assertEquals(4, m4.getRarity());
  }

  @Test
  public void testInvalidRarity() {
    // 範囲外（例：9）の場合も動くか
    Monster invalid = Monster.summonMonster(9);
    assertEquals("不明なモンスター", invalid.getName());
    assertEquals(9, invalid.getRarity());
  }

  @Test
  public void testKingPrefixAddedForRarity3() {
    Monster m3 = Monster.summonMonster(3);
    assertEquals("キングバンパイア", m3.getName());
    assertEquals(3, m3.getRarity());
  }

  @Test
  public void testNoKingPrefixForUnknownMonster() {
    Monster unknown = Monster.summonMonster(99);
    assertEquals("不明なモンスター", unknown.getName());
    assertEquals(99, unknown.getRarity());
  }
}
