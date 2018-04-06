package New_WordCountTest;


import static org.junit.Assert.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Vector;
import org.junit.Test;

import New_WordCount.Input;

public class InputTest {

	@Test
	public void testInputManage() throws IOException 
	{
		//测试用例定义
		String[] inputArr = new String[]{
		        "software", "content-based",
		        "night-", "“I", "TABLE1-2",
		        "(see Box 3–2).8885d_c01_016", "Let's",
		        "content--base","ta1ble-2",
		        "Abo,Abo,aBo-"};
		//结果定义
	    String[][] expectArr = new String[][] {
	    		{"software"},{"content-based"},
	    		{"night"},{"i"},{"table"},
	    		{"see" , "box" , "d" , "c"},{"let" , "s"},
	    		{"content","base"},{"ta","ble"},
	    		{"abo","abo","abo"}};
		//参数文件名定义
		String fileName = "input.txt";
		String[] args = new String[]{fileName};
		
        for (int i = 0 ; i < inputArr.length ; ++ i) 
        {   
        	//将测试用例写入到文件
        	OutputStreamWriter pw = null;//定义一个流
        	pw = new OutputStreamWriter(new FileOutputStream(fileName),"GBK");//确认流的输出文件和编码格式，此过程创建了txt实例
        	pw.write(inputArr[i]);//写入文件
        	pw.close();//关闭流
            
        	//测试方法主体
            Vector<String> words = Input.InputManage(args);//获得InputManage函数返回值
            String[] actualArr = words.toArray(new String[words.size()]);//向量转数组
            assertArrayEquals(expectArr[i],actualArr);//进行对比
           
            //控制台输出显示
            /*
            System.out.println("actualArr"+i+":"+words);
            for (int k = 0 ; k < expectArr[i].length ; ++ k) 
            {
            	System.out.print("expectArr"+":");
            	System.out.println(expectArr[i][k]);
            }
        	System.out.println("");
        	*/
        }
	}
}
