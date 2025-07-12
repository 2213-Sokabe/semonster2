package org.example;

public class App {
  public String getGreeting() {
    return "こんにちは SEMonster";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    // summonMonster を使ってモンスターを召喚・表示
    for (int i = 0; i <= 4; i++) {
      Monster m = Monster.summonMonster(i);
      System.out.println(m);
    }

    // 範囲外も試す（確認用）
    Monster unknown = Monster.summonMonster(99);
    System.out.println(unknown);
  }
}
