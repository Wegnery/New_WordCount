import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.File;
import java.io.OutputStreamWriter;
import java.util.Random;

public class RandomFileCreate {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = null;
        try {
            File writename = new File("file.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
            writename.createNewFile(); // 创建新文件
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(writename), "GBK"));
            String file=getRandomString(1000000);
            out.write(file);
            out.flush(); // 把缓存区内容压入文件
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                fos.close();
            }
        }
    }
    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGH          IJKLMNOPQRSTUVWXYZ012                                         3456789~`!#%^&*_...( )[]+=-:;“‘<> ,./?|";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(str.length());
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
