package New_WordCount;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Output {
		public  static  ArrayList printData(TreeMap<String , Integer>data) throws IOException {
		// TODO 自动生成的方法存根
		/*利用Map的Comparator函数对关键字的值value进行排序并输出*/
		Set<Entry<String, Integer>> entrys=data.entrySet();											   //获取map缓存中的内容
		ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String,Integer>>(data.entrySet());//将map转换为list便于排序
		for (Entry<String, Integer> entry : entrys) {												   //通过增强for循环遍历输出
			Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String,Integer>>() {//通过Comparator接口对集合对象进行排序
				public int compare(Entry<String, Integer> o1,Entry<String, Integer> o2) {			   //定义比较函数的方法体
					// TODO自动生成方法存根
					return o1.getValue()-o2.getValue();
					}
		};					
					Collections.sort(list,valueComparator);	// 调用系统自带函数对list中关键字的数值进行排序				
					}    
		return list;
		}
}				
