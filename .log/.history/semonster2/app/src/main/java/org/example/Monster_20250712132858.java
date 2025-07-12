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

  // 追加：召喚処理
  public static Monster summonMonster(int rarity) {
    String name;
    switch (rarity) {
      case 0:
        name = "スライム";
        break;
      case 1:
        name = "ゴブリン";
        break;
      case 2:
        name = "デュラハン";
        break;
      case 3:
        name = "バンパイア";
        break;
      case 4:
        name = "ドラゴン";
        break;
      default:
        name = "不明なモンスター";
        break; // エラー対策
    }
    return new Monster(name, rarity);
  }
}
