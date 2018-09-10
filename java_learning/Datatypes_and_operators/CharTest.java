/**
 * Description:
 * 网站：https://gitee.com/zzti_cs_16_java_group/liyonghua
 * Program Name: Java_learning
 * Data: 2018 /9/10
 * @author Yonghua Lee 449086240@qq.com
 * @vsrsion 1.0
 */
public class CharTest {
    public static void main(String[] args){
        char aChar = 'a'; // 直接使用单个字符作为字符值
        char enterChar = '\r'; // 使用转义字符来作为字符值
        char ch = '\u771f'; //将输的“真”
        System.out.println(ch);

        char lee = '香'; //直接将一个char变量当成int类型变量使用
        int leeValue=lee;
        System.out.println(leeValue);
        // 直接把一个0-65535范围内的int整数赋值给一个char变量
        char c =97;
        System.out.println(c);
        String s ="我欲成仙法力无边！";
        System.out.println(s);

    }
}
