/**
 * Description:
 * 网站：https://gitee.com/zzti_cs_16_java_group/liyonghua
 * Program Name: Java_learning
 * Data:
 * @author Yonghua Lee 449086240@qq.com
 * @vsrsion 1.0
 */
public class AutoConversion {
    public static void main(String[] args){
        int a = 6;
        //int类型可以自动转换为float类型
        float f=a;//输出6.0

        System.out.println(f);

        byte b =9;
        //byte类型不能自动类型转换为char类型；
        //char c =b;

        //byte类型变量可以自动类型转换为double类型
        double d =b;
        System.out.println(d);

    }
}
