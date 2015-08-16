/**
 * Created by mizumuratomomi on 2015/08/12.
 *
 * <p>
 *     #010 フィボナッチ数出力
 *
 *     ＊フィボナッチ数とは、
 *     最初の二項は 0 , 1 と定義され
 *     以降どの項もその前の２つの項の和となっている数字。
 *     60個のフィボナッチ数を表示する。
 * </p>
 */
public class Study10 {
    public static void main(String[] args) {

        fibonatti(0, 1, 1);

    }

    static long fibonatti(long i, long n, long counter) {

        if (counter == 60) {
            return i + n;
        }

        System.out.println(i + ":i");
        System.out.println(n + ":n");
        System.out.println(counter + ":counter");

        return fibonatti(n, i + n, counter + 1);
    }

}
