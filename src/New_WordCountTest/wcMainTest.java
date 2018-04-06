package New_WordCountTest;

import static org.junit.Assert.*;

import org.junit.Test;

import New_WordCount.wcMain;

public class wcMainTest {

	@Test
	public void testMain() throws Exception {
		String[] cmd = new String[1];
		cmd[0]="file.txt";
		wcMain.main(cmd);
	}
}
