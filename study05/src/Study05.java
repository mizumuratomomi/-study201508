import java.math.BigDecimal;

/**
 * Created by mizumuratomomi on 2015/08/12.
 *<p>
 *
 * #005 数理計算 BIGDECIMAL を使用した計算
 * 浮動小数点(float , double) を使用した計算を行うと誤差が発生します。
 * そのため、厳密な数値計算が必要な場合、BidDecimal というクラスを使用する必要があります。
 *
 * 手順
 * １ forループを利用して、float 0.1 を10回かけた結果を出力してください。
 * ２ forループと BigDecimal を使用して、 0.1 を 10 回足した結果を出力してください。
 *</p>
 */
public class Study05 {

    /**
     * 小数点第４位まで.
     * <p>
     * 今回の使用では、小数点第4位以下は使用しないため、Scaleは４を指定しています。
     * </p>
     */
    public static final int SCALE = 4;


    /**
     *
     */
    public static void main(String[] args) {
//        float num = 0.0f;
//        // forループ内で float型の数 0.1 を 10回 かける
//        for(int i = 0 ; i < 10 ; i++){
//            num = num + 0.1f;
//        }
//        System.out.println(num);

        BigDecimal bigDecimal = BigDecimal.valueOf(0.1d);
        bigDecimal = bigDecimal.add(BigDecimal.valueOf(0.1d));
        bigDecimal = bigDecimal.add(BigDecimal.valueOf(0.1d));
        bigDecimal = bigDecimal.add(BigDecimal.valueOf(0.1d));
        bigDecimal = bigDecimal.add(BigDecimal.valueOf(0.1d));
        bigDecimal = bigDecimal.add(BigDecimal.valueOf(0.1d));
        bigDecimal = bigDecimal.add(BigDecimal.valueOf(0.1d));
        bigDecimal = bigDecimal.add(BigDecimal.valueOf(0.1d));
        bigDecimal = bigDecimal.add(BigDecimal.valueOf(0.1d));
        bigDecimal = bigDecimal.add(BigDecimal.valueOf(0.1d));

        bigDecimal = bigDecimal.divide(BigDecimal.TEN, SCALE,BigDecimal.ROUND_HALF_UP);

        double doubleNum = bigDecimal.doubleValue();
        System.out.println(doubleNum);



    }
}
