package org.example;

public class Monster {
  private String name;
  private int rarity;

  // コンストラクタ
  public Monster(String name, int rarity) {
    this.name = name;
    this.rarity = rarity;
  }

  // ゲッター
  public String getName() {
    return name;
  }

  public int getRarity() {
    return rarity;
  }

  // toString()メソッド（表示用）
  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rarity + "]";
  }
}
