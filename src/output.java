package New_WordCount;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class output {
		public  static  ArrayList printData(Map<String , Integer>data) throws IOException {
		// TODO 自动生成的方法存根
		/*利用Map的Comparator函数对关键字的值value进行排序并输出*/
		Set<Entry<String, Integer>> entrys=data.entrySet();											   //获取map缓存中的内容
		ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String,Integer>>(data.entrySet());//将map转换为list便于排序
		for (Entry<String, Integer> entry : entrys) {												   //通过增强for循环遍历输出
			Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String,Integer>>() {			//通过Comparator接口对集合对象进行排序
				public int compare(Entry<String, Integer> o1,Entry<String, Integer> o2) {			   //定义比较函数的方法体
					// TODO自动生成方法存根
					return o1.getValue()-o2.getValue();
					}
		};					
					Collections.sort(list,valueComparator);										       // 调用系统自带函数对list中关键字的数值进行排序
					/*默认情况下，TreeMap对key进行升序排序*/
					System.out.println("------------升序排序如下------------------");
					for (Map.Entry<String,Integer> entry1 :list) {
					System.out.println(entry1.getKey() + ":" + entry1.getValue()+"\n");
					}     	
		}
		return list;
		}
//	public static void main(String[] args) throws IOException {
//		Vector<String> words=Input.InputManage(args);
//		printData(calc.account(words));
//	}
}