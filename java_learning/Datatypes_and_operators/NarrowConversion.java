/**
 * Description:
 * 网站：https://gitee.com/zzti_cs_16_java_group/liyonghua
 * Program Name: Java_learning
 * Data:2018/9/10
 * @author Yonghua Lee 449086240@qq.com
 * @vsrsion 1.0
 */
public class NarrowConversion {
    public static void main(String[] args){
        int iValue = 2333;

        //强制把一个int类型转换为byte类型
        byte bValue =(byte)iValue; //输出29

        System.out.println(bValue);

        double dValue=3.98;

        //强制把一个double类型转换为int类型的值;
        int tol =(int)dValue;

        System.out.println(tol);//输出3
    }
}
