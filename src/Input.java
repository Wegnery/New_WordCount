package New_WordCount;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
	1、输入参数为main函数的String[] args，即命令行中输入的文件名
	2、编译环境运行时文件需放在项目文件夹根目录下，命令行运行时文件需放在跟exe文件同目录下
	3、IOException含有‘系统找不到文件’提示，故未写	
	4、对文件中有无单词的判断写在main函数里，建议：
	
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
			
		}
	}
*/
	

public class Input 
{
	public static Vector<String> InputManage(String[] args) throws IOException
	{
		//创建输出向量words
		Vector<String> words = new Vector<String>(0);
		
		//一次仅处理一个文件，不同时处理多个文件。有多个文件时输出提示
		if(args.length >= 2)
		{
			System.out.println("输入了不止一个文件，仅处理第一个文件");
		}
		
		//判断输入的是否是txt文件，是则打开并提取单词
		if (Pattern.matches(".*\\.txt", args[0]))
		{
			//打开文件
			InputStreamReader isr = new InputStreamReader(new FileInputStream(args[0]));
			BufferedReader br = new BufferedReader(isr);
			String line = null;//存储每行的内容
			
			//文件内容以行为单位提取单词
			while((line = br.readLine()) != null)
			{
		        String regex = "[A-Za-z]+-?[A-Za-z]+|[A-Za-z]";//提取含-或者不含的单词的正则表达式
		        Pattern  pattern=Pattern.compile(regex);//将正则表达式转为pattern
		        Matcher  ma=pattern.matcher(line);//与每行文本进行匹配
		        while(ma.find())
		        {
		            words.addElement(ma.group());//将每个单词加入words向量
		        }
			}
			
			//关闭文件
			br.close();
		}
		else
		{
			System.out.println("输入的不是txt文件，请重新输入");
		}
		return words;//返回单词向量
	}
}
