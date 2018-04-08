package New_WordCountTest;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import New_WordCount.Calc;
import New_WordCount.Output;
public class OutputTest {

	@Test
	public void testPrintData() throws IOException {
		//测试用例定义
		TreeMap<String , Integer> data = new TreeMap<String , Integer>(){{
    		put("a",20);
			put("aa",7);
			put("alive",15);
			put("a-b",5);
			put("base",7);
			put("be",12);
			put("box",4);
			put("by",2);
			put("content",3);
			put("go",3);
			put("i",9);
			put("is",1);
			put("le",12);
			put("let",5);
			put("night",1);
			put("py",9);
			put("software",2);
			put("table",5);
			put("tie",6);
			put("unit-base",4);
		}};
		//结果定义
		Map<String , Integer> expectList= new LinkedHashMap<String , Integer>(){{
			put("is",1);
			put("night",1);
			put("by",2);
			put("software",2);
			put("content",3);
			put("go",3);
			put("box",4);
			put("unit-base",4);	
			put("a-b",5);
			put("let",5);
			put("table",5);
			put("tie",6);
			put("aa",7);
			put("base",7);
			put("i",9);
			put("py",9);
			put("be",12);
			put("le",12);
			put("alive",15);
			put("a",20);
		}};
	    //测试方法主体
		ArrayList<Entry<String, Integer>> actualList = Output.printData(data);//获得函数返回值
		ArrayList<String> endlist=new ArrayList();
		Set<String> set = expectList.keySet();
        for (String key : set) {
            Integer value = expectList.get(key);
            endlist.add(key+","+value);
        }
        int i=0;
		for (Entry<String, Integer> entry1 :actualList){
			String index=entry1.getKey()+","+entry1.getValue();
			assertEquals(index,endlist.get(i));
			i++;
		}
	}

}
