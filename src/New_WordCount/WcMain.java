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
	long startTime = System.currentTimeMillis();
	Vector<String> words = Input.InputManage(args);
	int num = words.size();
	if (num == 0)
	{
		System.out.println("\n文件中无单词");
	}
	else
	{
		//进行下面的操作
		ArrayList<Entry<String, Integer>>  list=Output.printData((TreeMap<String, Integer>) Calc.account(words));
		FileOutputStream fos = null;
		try{
			File writename = new File("result.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件    
	  	    writename.createNewFile(); // 创建新文件  
	  	    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("result.txt"),"GBK"));
	        Date day=new Date();    
	        long endTime = System.currentTimeMillis();
	        String runtime="程序运行时间："+(endTime-startTime)+"ms";
			SimpleDateFormat df = new SimpleDateFormat("-------------------------执行日期：yyyy-MM-dd HH:mm:ss\r\n"); //加入执行时间记录
			for (Map.Entry<String,Integer> entry1 :list) {
				out.write(entry1.getKey() + " " + entry1.getValue()+"\r\n");//将排序后的关键字与对应值写入文档
				}    
			out.write(df.format(day));
			out.write(runtime);
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
	}
  }
}
