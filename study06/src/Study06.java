import java.util.ArrayList;
import java.util.List;

/**
 * Created by mizumuratomomi on 2015/08/12.
 * <p>
 *     #006 文字列の比較
 *
 *     for文を使用して配列を回して出力を行ってください。
 *     配列の中身がC または Fだった場合は、小文字で出力してください。
 *
 *     手順
 *     ヒントにある配列の初期化コードを使用して配列を作成してください。
 *     拡張for文またはfor文を使用して配列の中身を判定してください。
 *
 *     ヒント
 *     配列の初期化 String[] str = {"A" ,"B" , "C" , "D" , "E" , "F"};
 *     小文字の出力 ： Stringクラスのメソッド toLowerCase()を使用すると小文字が出力できます。
 * </p>
 */
public class Study06 {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        list.add("E");
//        list.add("F");
        // 配列を初期化する
        String[] list = {"A","B" , "C", "D" , "E" , "F"};

        for(String str : list){
            if (str.equals("C") || str.equals("F")){
                String ret = str.toLowerCase();
                System.out.print(ret);
            }else {
                System.out.print(str);
            }
        }
    }
}
