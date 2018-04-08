package New_WordCount;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.Map.Entry;

public class WcMain {

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
<<<<<<< HEAD
		ArrayList<Entry<String, Integer>>  list=Output.printData((TreeMap<String, Integer>) Calc.account(words));
		FileOutputStream fos = null;
		try{
			File writename = new File("result.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件    
	  	    writename.createNewFile(); // 创建新文件  
	  	    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("result.txt"),"GBK"));
	        Date day=new Date();    
			SimpleDateFormat df = new SimpleDateFormat("-------------------------执行日期：yyyy-MM-dd HH:mm:ss\r\n"); //加入执行时间记录
			for (Map.Entry<String,Integer> entry1 :list) {
				out.write(entry1.getKey() + " " + entry1.getValue()+"\r\n");//将排序后的关键字与对应值写入文档
				}    
			out.write(df.format(day));
			out.flush(); // 把缓存区内容压入文件  	
		        }
		catch(Exception e){
	         e.printStackTrace();
	       }   
	    finally {  
           if (fos != null) {  
        	   fos.close();
        	   }
	    }
=======
		ArrayList<Entry<String, Integer>>  list=output.printData((TreeMap<String, Integer>) calc.account(words));
		//output.print((TreeMap<String, Integer>) calc.account(words));
	    File writename = new File("result.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
  	    writename.createNewFile(); // 创建新文件  
  	   	BufferedWriter out = new BufferedWriter(new FileWriter(writename,true));
		//p.print(output.printData(calc.account(words)));
        Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("-------------------------执行日期：yyyy-MM-dd HH:mm:ss\r\n"); //加入执行时间记录
		for (Map.Entry<String,Integer> entry1 :list) {
			out.write(entry1.getKey() + " " + entry1.getValue()+"\r\n");//将排序后的关键字与对应值写入文档
			}    
		out.write(df.format(day));
		out.flush(); // 把缓存区内容压入文件  
		
>>>>>>> parent of 6497901... 基础功能完成，宁宁：核心模块，周雨贝：输入模块，易成龙：main 模块和整体架构，朱全：输出模块
	}
  }
}
