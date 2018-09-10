/**
 * Description:
 * 网站：https://gitee.com/zzti_cs_16_java_group/liyonghua
 * Program Name: Java_learning
 * Data:2018/9/10
 * @author Yonghua Lee 449086240@qq.com
 * @vsrsion 1.0
 */public class PrimitiveAndString {
        public static void main(String[] args){
            //+不仅可以用作加法运算符使用，还可以作为字符串连接运算符使用
            String str2 = 3.5f + "";   //输出3.5
            System.out.println(str2);

            System.out.println(3+4+"真香!");//输出7真香！

            //下面的语句输出我王境泽不会吃你们的一点饭！34
            //+3会把3当成字符串处理
            //然后再把4当作字符串处理
            System.out.println("我王境泽不会吃你们的一点饭！"+3+4);
        }
 }
