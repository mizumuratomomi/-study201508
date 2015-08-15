/**
 * Created by mizumuratomomi on 2015/08/12.
 *
 * <p>
 *     #009 閏年判定
 *     西暦1年 ~ 2016年までの間で閏年だった年を出力してください。
 *     また、最後に閏年の回数も出力してください。
 *
 *     -  西暦年が 4 で割り切れる年は閏年
 *     - ただし、西暦年が 100 で割り切れる年は平年
 *     - ただし、西暦年が 400 で割り切れる年は閏年
 * </p>
 */
public class Study09 {
    static final int YEAR = 2016;

    public static void main(String[] args) {
        // 1 ~ 2016  ループをまわす
        for(int i = 1 ; i <= YEAR ; i ++){
            // 400 で割り切れるときの処理
            if(i % 400 == 0){
                System.out.println(i);
            // 100 で割り切れるときの処理
            }else if(i % 100 == 0){
                //  なにもしない
            // 4 で割り切れるときの処理
            }else if(i % 4 == 0){
                System.out.println(i);
            }
        }
    }
}
