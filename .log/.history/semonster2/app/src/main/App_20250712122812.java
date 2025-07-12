package org.example;

public class App {
  public String getGreeting() {
    return "こんにちは SEMonster";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    // Monsterクラスの動作確認
    Monster monster = new Monster("デュラハン", 2);
    System.out.println(monster); // デュラハン:レア度[2]
  }
}
