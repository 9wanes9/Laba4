package copyfile;
import java.util.Date;
import java.util.Scanner;
import java.io.*;
public class Copy {

    private InputStream inputStream;
    private OutputStream outputStream;
    int fourMB=4*1024*1024;
    byte [] buffer=new byte[fourMB];
    public void ReadWrite(String pathRead, String pathWrite) throws IOException{
        File file=new File(pathRead);
        long weight=file.length();
        Date timeStart=new Date();
        long msecStart = timeStart.getTime();
        inputStream= new FileInputStream(pathRead);
        outputStream= new FileOutputStream(pathWrite);
        int symbol;
        while ((symbol=inputStream.read(buffer))!=-1) {
            outputStream.write(buffer,0,symbol);
        }

        inputStream.close();
        outputStream.close();
        Date timeFinish=new Date();
        long msecFinish = timeFinish.getTime();
        long time=(msecFinish-msecStart);
        if(time<1000)
        System.out.println("Время работы : "+time+"мс");
        else
        if(time>1000&&time<60000)
            System.out.println("Время работы : "+(time/1000)+"сек");
        if(time<1000)
        System.out.println("Скорость записи : "+(weight/time)+"байт/мс");
        if(time>1000&&time<60000)
            System.out.println("Скорость записи : "+(weight/(time/1000))+"байт/сек");
    }

}