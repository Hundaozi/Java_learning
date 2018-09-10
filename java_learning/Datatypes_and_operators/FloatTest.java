/**
 * Description:
 * 网站：https://gitee.com/zzti_cs_16_java_group/liyonghua
 * Program Name: Java_learning
 * Data: 2018/9/10
 * @author Yonghua Lee 449086240@qq.com
 * @vsrsion 1.0
 */
public class FloatTest {
    public static void main(String[] args){
        float af=5.3333455f;
        System.out.println(af);
        double a=0.0;
        double c =Double.NEGATIVE_INFINITY;
        float d =Float.NEGATIVE_INFINITY;

        //double型和float型的负无穷大是相同的
        System.out.println(c==d);
        //两个非数之间是不相等的
        System.out.println(a/a);
        //所有正无穷大都是相等的
        System.out.println(a/a==Float.NaN);
        //负数除以0.0得到无穷大
        System.out.println(-8/a);

        //抛出除以0的异常
        //System.out.println(0/0);
    }
}
