package New_WordCountTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import New_WordCount.Calc;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeMap;
import java.util.Vector;


@RunWith(Parameterized.class)
public class CalcTest {

	private Vector<String> inputVector;
	private TreeMap<String, Integer> expectMap;
	
    public CalcTest(Vector<String> inputVector, TreeMap<String, Integer> expectMap) 
    {
        this.inputVector = inputVector;
        this.expectMap = expectMap;
    }

    @Parameters
    @SuppressWarnings("rawtypes")
    public static Collection testData()
    {
		String[][] inputArr = new String[][]{
				{"a","b"},
				{"a","b","b"},
				{"a","a","a","a","d","d","x","string","a-b","c-num"},
		};
		Vector<String>[] inputVector = new Vector[inputArr.length];
		for(int i=0;i<inputArr.length;i++){
			inputVector[i]=new Vector<String>();
			for(int j=0;j<inputArr[i].length;j++){
				inputVector[i].add(inputArr[i][j]);
			}
		}
		
		String[][] key=new String[][]{
				{"a","b"},
				{"a","b"},
				{"a","d","x","string","a-b","c-num"},
		};
		int[][] value=new int[][]{
				{1,1},
				{1,2},
				{4,2,1,1,1,1}
		};
		TreeMap<String, Integer>[] expectMap = new TreeMap[key.length];
		for(int i=0;i<key.length;i++)
		{
			expectMap[i]=new TreeMap<String,Integer>();
			for(int j=0;j<key[i].length;j++)
			{
				expectMap[i].put(key[i][j],value[i][j]);
			}
		}

	    Object[][]data= new Object[inputVector.length][2];
	    for(int i=0;i<inputVector.length;i++)
	    {
	    	data[i]=new Object[]{inputVector[i],expectMap[i]};
	    }
         return Arrays.asList(data);  
    }

	@Test
	public void testAccount() 
	{
    	TreeMap<String , Integer> actualMap = Calc.account(inputVector);
        assertEquals(expectMap,actualMap);
	}
}
