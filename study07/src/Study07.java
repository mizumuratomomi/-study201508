/**
 * Created by mizumuratomomi on 2015/08/12.
 *
 * <p>
 *     #007 FIZZ-BUZZ
 *
 *     Fizz Buzz問題(クイズ)に挑戦してみてください。
 *     1 ~ 30 までの数字を順に出力し、 3 で割り切れた場合 fizz
 *     5 で割り切れた場合 buzz  両方で割り切れた場合 fizz - buzz と出力してください。
 *
 *     手順
 *     1 ~ 30 までの数字を出力。
 *     3 で割り切れた場合 fizz
 *     5 で割り切れた場合 buzz
 *     両方で割り切れた場合 fizz-buzz と出力してください。
 * </p>
 */
public class Study07 {
    static final int THIRTY = 30;
    public static void main(String[] args) {

        // TODO 0 fizz-buzzが出力されているので治す

        for(int i = 1 ; i <= THIRTY ; i ++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " fizz-buzz");
            }else if (i % 3 == 0){
                System.out.println(i + " fizz");
            }else if(i % 5 == 0){
                System.out.println(i + " buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
