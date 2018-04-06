package New_WordCountTest;

import static org.junit.Assert.*;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import New_WordCount.Input;
import New_WordCount.calc;

public class calcTest {

	@Test
	public void testAccount() {
		
		//测试用例定义
		String[][] inputArr = new String[][]{
				{"a","b","b"},{"a","a","a","a","d","d","x","string","a-b","c-num"}
		};
		Vector<String>[] inputVector = new Vector[inputArr.length];
		for(int i=0;i<inputArr.length;i++){
			inputVector[i]=new Vector<String>();
			for(int j=0;j<inputArr[i].length;j++){
				inputVector[i].add(inputArr[i][j]);
			}
		}
		//结果定义
		String[][] key=new String[][]{
				{"a","b"},{"a","d","x","string","a-b","c-num"}
		};
		int[][] value=new int[][]{
				{1,2},{4,2,1,1,1,1}
		};
		TreeMap<String, Integer>[] expectMap = new TreeMap[key.length];
		for(int i=0;i<key.length;i++){
			expectMap[i]=new TreeMap<String,Integer>();
			for(int j=0;j<key[i].length;j++){
				expectMap[i].put(key[i][j],value[i][j]);
			}
		}

        for (int i = 0 ; i < inputArr.length ; ++ i) 
        {   
        	//测试方法主体
        	TreeMap<String , Integer> actualMap = calc.account(inputVector[i]);//获得函数返回值
            assertEquals(expectMap[i],actualMap);//进行对比
        }
	}

}
