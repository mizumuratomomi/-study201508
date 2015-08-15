import java.util.ArrayList;
import java.util.List;

/**
 * Created by mizumuratomomi on 2015/08/11.
 * #003
 * ループを用いた文字列の連結と文字列の削除
 *
 * 1.新規プロジェクトを作成。Main method を持ったClass Main を作成する。
 * 2.forループを使用して文字列0123456789を作成する。
 * 3.作成した文字列0123456789 から 345 を取り除く。
 * ループ内で文字列を削除するのはNG
 * 4. 文字列を標準出力する
 *
 */
public class Study03 {

    static final int TEN = 10;

    public static void main(String[] args) {
        // String型のリストを用意する
        List<Integer> list = new ArrayList<>();
        // 定数を宣言する
        for (int i = 0; i < TEN; i++) {
            list.add(i);
        }

        for (int num : list) {
//PlanA
//            if(num < 3 || 5 < num) {
//                System.out.print(num);
//            }

//PlanB
            if (num != 3 && num != 4 && num != 5) {
                System.out.print(num);
            }
        }
    }
}