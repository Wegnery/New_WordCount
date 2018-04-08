package New_WordCountTest;

import static org.junit.Assert.*;

import org.junit.Test;

import New_WordCount.WcMain;

public class WcMainTest {

	@Test
	public void testMain() throws Exception {
		String[] cmd = new String[1];
		cmd[0]="file.txt";
		WcMain.main(cmd);
	}
}
