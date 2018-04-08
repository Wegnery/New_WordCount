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
<<<<<<< HEAD
        return data;//最终返回treemap里面的值
	}
}
=======
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
>>>>>>> parent of 6497901... 基础功能完成，宁宁：核心模块，周雨贝：输入模块，易成龙：main 模块和整体架构，朱全：输出模块
