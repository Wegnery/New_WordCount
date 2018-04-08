package New_WordCount;
import java.util.TreeMap;
import java.util.Vector;

public class Calc {
	public static TreeMap<String , Integer>account(Vector<String> strs) {
        TreeMap<String , Integer>data=new TreeMap<String ,Integer>();
        for (int i = 0; i < strs.size(); i++) {
            String str=strs.get(i);
            //判断一下treemap中的key有没有，如果没有则收录 treemap中
            if (data.get(str)==null)
            {
            	//第一次统计到字符串
                data.put(str, 1);
            }
            else 
            {
            	//取出key所对应的值加一
                data.put(str, (data.get(str)+1));
            }
        }
        return data;//最终返回treemap里面的值
	}
}