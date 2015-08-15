import jdk.nashorn.internal.ir.TernaryNode;

/**
 * Created by mizumuratomomi on 2015/08/10.
 *
 * #002 ループ条件と条件分岐
 *
 * forループを使用して、1から10までの数値を標準出力してください。
 * ただし、偶数の場合、100の倍数を出力。それ以外の場合はそのまま数値を出力してください。
 */
public class Study02 {
    public static void main(String[] args) {

        // 定数を宣言
        final int TEN = 10;
        // 定数TEN(10)回ループをまわす
        for (int i = 0; i <= TEN; i++) {
            // 偶数の場合の処理
            if(i % 2 == 0){
                System.out.println(i * 100);
            //  偶数でばい場合の処理
            }else{
                System.out.println(i);
            }
        }
    }
}
