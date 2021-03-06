import java.util.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by mizumuratomomi on 2015/08/12.
 *
 * <p>
 *     #008 カレンダークラスの使用
 *
 *     カレンダークラスを使用して、今月末と来月末の曜日と日付を出力してください。
 *
 *     １. 曜日は漢字一文字で出力する
 *     ２. 日付は2015/00/00 形式で出力する
 *
 *     ヒント
 *     SimpleDateFormatクラスを使用すると日付のフォーマットが簡単に行えます。
 * </p>
 */
public class Study08 {
    public static void main(String[] args) {

        // 現在時刻を取得する
        Calendar cal = Calendar.getInstance();
        // フォーマットパターンを指定して表示する
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd E");

        //現在時刻を表示する
        Date date = cal.getTime();
        String dateStr = sdf.format(date);
        System.out.println("dateStr:" + dateStr);

            //月を取得する
            int month = cal.get(Calendar.MONTH);
            month = month + 1;
            System.out.println("month:" + month);

        //翌月の時刻を表示する
        int i = cal.get(Calendar.MONTH);

        Date date = cal.set(Calendar.DAY_OF_WEEK_IN_MONTH,-1);
        String dateStr2 = sdf.format(date);
        System.out.println(dateStr2);
        String dateStrNext = sdf.format(date);
        System.out.println("dateStrNext:" + dateStrNext);
    }
}
