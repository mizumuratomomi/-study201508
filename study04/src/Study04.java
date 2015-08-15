import java.util.ArrayList;
import java.util.List;

/**
 * Created by mizumuratomomi on 2015/08/12.
 *
 * #004 コレクションとFOREACH
 *
 * String型のコレクション(List)を作り、文字A~Fを追加してください。
 * Foreach(拡張for)文を使用して文字列を出力してください。
 */
public class Study04 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        for(String str : list){
            System.out.println(str);
        }
    }
}
