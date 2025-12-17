public class car {
    // 属性（データ）
    String color;

    // インスタンスメソッド（staticを付けない！）
    public void drive() {
        System.out.println(color + "の車が走ります。");
    }
}

class Main {
    public static void main(String[] args) {
        // 1. インスタンスを作る（実体化）
        car myCar = new car();
        myCar.color = "青";

        // 2. インスタンスメソッドを呼ぶ
        myCar.drive(); // 結果：赤の車が走ります。
    }
}

