package New_WordCount;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Vector;
import java.util.Map.Entry;

public class wcMain {

	public static void main(String[] args) throws Exception 
{
	Vector<String> words = Input.InputManage(args);
	int num = words.size();
	if (num == 0)
	{
		System.out.println("\n文件中无单词");
	}
	else
	{
		//进行下面的操作
		ArrayList<Entry<String, Integer>>  list=output.printData(calc.account(words));
	   File writename = new File("result.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
  	writename.createNewFile(); // 创建新文件  
      BufferedWriter out = new BufferedWriter(new FileWriter(writename));
		//p.print(output.printData(calc.account(words)));
        Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("-------------------------执行日期：yyyy-MM-dd HH:mm:ss\r\n"); //加入执行时间记录
		for (Map.Entry<String,Integer> entry1 :list) {
			out.write(entry1.getKey() + ":" + entry1.getValue()+"\r\n");  
			}    
		out.write(df.format(day));
		out.flush(); // 把缓存区内容压入文件  
		
	}
  }
}
