import java.util.Scanner;

/**
 * Created by mizumuratomomi on 2015/08/12.
 *
 * <p>
 *     # 013 WHILE によるループと標準出力
 *
 *     標準出力とwhile文を組み合わ
 *     せて入力待機をおこなう
 *
 *     手順
 *     標準入力を使用して入力を受け付ける。
 *     exitと入力することで待機状態を抜ける。
 *     数値を入力すると、その数値が偶数であるか奇数であるかを判定し、
 *     「00は偶数(奇数)です」と標準出力する。
 *
 *     ヒント
 *     入力待ちは以下の Scannerクラスを使用すると簡単に実装することが可能です。
 *
 *     import java,util.Scanner;
 *     Sccaner Scan = new Scanner(System.in);
 *     String input = scan.next();
 * </p>
 */
public class Study13 {
    public static void main(String[] args) {
        String input = new java.util.Scanner(System.in).next();
        int num = Integer.parseInt(input);
        if(num % 2 == 1){
            System.out.println(input + "は奇数です");
        }else if (num % 2 == 0){
            System.out.println(input + "は偶数です");
        }else if (input.equals("exit")){
            System.out.println("終了します");
        }else{
            System.out.println("数値を入力してください");
        }
    }
}
