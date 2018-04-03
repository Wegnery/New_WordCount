package New_WordCount;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class calc {


//    public static void main(String[] args) throws IOException {
//        Vector<String> words=Input.InputManage(args);
//        printData(account(words));
//    }





//class AccountUtil{
    public static Map<String , Integer>account(Vector<String> strs) {
//产生一个容器
        Map<String , Integer>data=new HashMap<String ,Integer>();
        for (int i = 0; i < strs.size(); i++) {//通过下标来取出字符串中的一个个元素
            String str=strs.get(i);//先把第一个字符串取出来
//判断一下hashmap中的key有没有，如果没有则收录 hashmap中
            if (data.get(str)==null) {//第一次统计到字符串
                data.put(str, 1);//把这个字符串作为键，值为第一次收入
            }else {
//取出key所对应的值加一
                data.put(str, (data.get(str)+1));//累加
            }
        }
        return data;//最终返回hashmap里面的值

    }
    //打印一下hashmap中的数据
//    public static void  printData(Map<String , Integer> data) {
//        Set<Entry<String, Integer>> entrys=data.entrySet();
//        for (Entry<String, Integer> entry : entrys) {//通过增强for循环遍历输出
//            System.out.println(entry.getKey()+"\t"+entry.getValue());
//        }
//    }
}
