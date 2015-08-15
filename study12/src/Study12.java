/**
 * Created by mizumuratomomi on 2015/08/12.
 *
 * <p>
 *     #012 素数判定
 *     0 ~ 定数NUMBER で宣言された数値までの間の全ての素数を標準出力してください。
 *     素数
 *     の定義は、以下を使用してください。
 *     「１」を含まず。その数でしか割れない数。
 *
 *     1:最大値 10000 で素数を判定してみてください。
 *     2:最大値 10000000000 で素数を判定してみてください。
 * </p>
 */
public class Study12 {
    static final int NUM1 = 100;
    static final long NUM2 = 10000000000L;

    public static void main(String[] args) {
        for(int i = 2 ; i < NUM1 ; i ++){

            for (int j = 2 ; j < NUM1 ; j++){
                if(i % j == 0){
                    System.out.println(j);
                    break;
                }else if (i % j != 0){
                }
            }
        }
    }
}
