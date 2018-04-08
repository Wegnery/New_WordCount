package New_WordCountTest;

<<<<<<< HEAD

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
=======
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import New_WordCount.Input;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeMap;
import java.util.Vector;


@RunWith(Parameterized.class)
public class InputTest {

	// (2)步骤二：为测试类声明几个变量，分别用于存放期望值和测试所用数据
	private String inputArr;
	private String[] expectArr;
	//参数文件名定义
	String fileName = "input.txt";
	String[] args = new String[]{fileName};
	
    // (3)步骤三：为测试类声明一个带有参数的公共构造函数，并在其中为第二个环节中声明的几个变量赋值。
    public InputTest(String inputArr,String[] expectArr) 
    {
        this.inputArr = inputArr;
        this.expectArr = expectArr;
    }

    // (4)步骤四：为测试类声明一个使用注解 org.junit.runners.Parameterized.Parameters 修饰的，返回值为
    // java.util.Collection 的公共静态方法，并在此方法中初始化所有需要测试的参数对。
    @Parameters
    @SuppressWarnings("rawtypes")
    public static Collection testData() 
    {
    	//测试用例定义
		String[] inputArr = new String[]{
		        "software", 
		        "content-" +
		        "based",
		        "night-", 
		        "“I", 
		        "TABLE1-2",
		        "(see Box 3–2).8885d_c01_016", 
		        "Let's",
		        "content--base",
		        "ta1ble-2",
		        "Abo,Abo,aBo-"};
		//结果定义
	    String[][] expectArr = new String[][] {
	    		{"software"},
	    		{"content-based"},
	    		{"night"},
	    		{"i"},
	    		{"table"},
	    		{"see" , "box" , "d" , "c"},
	    		{"let" , "s"},
	    		{"content","base"},
	    		{"ta","ble"},
	    		{"abo","abo","abo"}};
	    
	    Object[][]data= new Object[inputArr.length][2];
	    for(int i=0;i<inputArr.length;i++)
	    {
	    	data[i]=new Object[]{inputArr[i],expectArr[i]};
	    }
         return Arrays.asList(data);  
    }

    // (5)步骤五：编写测试方法，使用定义的变量作为参数进行测试。
	@Test
	public void testAccount() throws IOException {
    	//将测试用例写入到文件
    	OutputStreamWriter pw = null;//定义一个流
    	pw = new OutputStreamWriter(new FileOutputStream(fileName),"GBK");//确认流的输出文件和编码格式，此过程创建了txt实例
    	pw.write(inputArr);//写入文件
    	pw.close();//关闭流
    	
    	//测试方法主体
		Vector<String> words = Input.InputManage(args);//获得函数返回值
        String[] actualArr = words.toArray(new String[words.size()]);//向量转数组
        assertArrayEquals(expectArr,actualArr);//进行对比
>>>>>>> 3f1b63edbe35cf177ff860806ac0863c974b67b5
	}
}
