package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {

  @Test
  public void testMonsterConstructor() {
    // インスタンスを作成
    Monster monster = new Monster("ゴブリン", 1);

    // フィールドが正しくセットされているかを確認
    assertEquals("ゴブリン", monster.getName());
    assertEquals(1, monster.getRarity());
  }

  @Test
  public void testToStringOutput() {
    // インスタンスを作成
    Monster monster = new Monster("ドラゴン", 4);

    // toStringの出力を検証
    String expected = "ドラゴン:レア度[4]";
    assertEquals(expected, monster.toString());
  }

  @Test
  public void testDifferentMonster() {
    // 別のモンスターで試す
    Monster monster = new Monster("スライム", 0);
    assertEquals("スライム", monster.getName());
    assertEquals(0, monster.getRarity());
    assertEquals("スライム:レア度[0]", monster.toString());
  }
}
