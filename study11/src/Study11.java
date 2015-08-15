/**
 * Created by mizumuratomomi on 2015/08/12.
 *
 * <p>
 *     # 011 世界のナベアツ問題
 *     ３のつく倍数 と ３のつく数字の場合
 *     "Aho" と標準出力する。
 *     最大値は 40
 *
 *     条件
 *     アホになる数(3)は定数として宣言すること。
 *     最大値の数は定数として宣言すること。
 *
 * </p>
 */
public class Study11 {
    static final int MAX = 40;

    public static void main(String[] args) {
        for(int i = 0 ; i <= MAX ; i ++){
            if(i % 3 == 0 ||  ( 30 <= i && i < MAX )){
                System.out.print(" Aho");
            }else{
                System.out.print(" " + i);
            }
        }
    }
}
