import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class practice {
    public static void practice(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 誕生日の年、月、日をユーザーに入力してもらう
        System.out.println("誕生日を入力してください（YYYY-MM-DD形式で入力してください）:");
        String input = scanner.nextLine();
        
        // ユーザーが入力した誕生日を解析して、LocalDateオブジェクトに変換する
        LocalDate birthday = LocalDate.parse(input);

        // 現在の日付を取得
        LocalDate currentDate = LocalDate.now();

        // 誕生日から現在の日付までの期間を計算
        Period period = Period.between(birthday, currentDate);

        // 年齢を取得
        int age = period.getYears();

        // 結果を出力
        System.out.println("現在の年齢は " + age + " 歳です。");

        // Scannerをクローズ
        scanner.close();
    }
}
