import java.io.*;
import java.net.*;
import java.util.Arrays;

public class TestNet {
    public static void main(String[] args) throws IOException {
/*
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        address = InetAddress.getByName("localhost");
        System.out.println(address);
        InetAddress[] sw = InetAddress.getAllByName("www.starwave.com");
        System.out.println(Arrays.toString(sw));
*/
/*
        URL hp = new URL("https://www.wikipedia.org/");
        System.out.println("Protocol: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());
        System.out.println("Host: " + hp.getHost());
        System.out.println("File: " + hp.getFile());
        System.out.println("Ext: " + hp.toExternalForm());
*/
/*
        int c;
        URL hp = new URL("http", "188.120.226.11", 8083,"/login/");
        URLConnection hpCon = hp.openConnection();
        System.out.println("Date: " + hpCon.getDate());
        System.out.println("Type: " + hpCon.getContentType());
        System.out.println("Exp: " + hpCon.getExpiration());
        System.out.println("Last M: " + hpCon.getLastModified());
        System.out.println("Length: " + hpCon.getContentLength());
        if (hpCon.getContentLength() > 0) {
            System.out.println("=== Content ===");
            InputStream input = hpCon.getInputStream();
            int i = hpCon.getContentLength();
            while (((c = input.read()) != -1) && (--i > 0)) {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("No Content Available");
        }
*/
/*
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        System.out.println(address.getHostAddress());
        address = InetAddress.getByName("123mag.ru");
        System.out.println(address );
        System.out.println(address.getHostAddress());
        //InetAddress[] sw = InetAddress.getAllByName("123mag.ru");
        //System.out.println(Arrays.toString(sw));
*/
/*
        // задание IP-адреса в виде массива
        byte[] ip = {127, 0, 0, 1};
        try {
            InetAddress addr = InetAddress.getByAddress("University", ip);
            System.out.println(addr.getHostName() +
                    "-> соединение:" + addr.isReachable(1000));
        } catch (UnknownHostException e) {
            System.err.println("адрес недоступен " + e);
        } catch (IOException e) {
            System.err.println("ошибка потока " + e);
        }
*/
/*
        //my
        int c;
        URL url = new URL(
                "https://123mag.ru/wp-content/uploads/img_zip_final/(3000x)-01-08-2020/zqTMuVK9MvWi_example_imgs.zip"
        );
        URLConnection hpCon = url.openConnection();
        if (hpCon.getContentLength() > 0) {
            System.out.println("=== Content ===");
            String[] nameF = url.getFile().split("/");
            File outFile = new File("C:/Users/Spavv/Desktop/study/file/"+nameF[nameF.length-1]);
            FileOutputStream outStream = new FileOutputStream(outFile); //Создаем экземпляр класса FileOutputStream
            InputStream input = hpCon.getInputStream();
            System.out.println(url.getFile());
            int i = hpCon.getContentLength();
            while (((c = input.read()) != -1) && (--i > 0)) {
                outStream.write(c);
                //System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("No Content Available");
        }
*/
/*
        //school
        String FILE_URL = "https://123mag.ru/wp-content/uploads/img_zip_final/(3000x)-01-08-2020/zqTMuVK9MvWi_example_imgs.zip";
        String FILE_NAME = "C:/Users/Spavv/Desktop/study/file/imgs.zip";
        try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME)) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            // handle exception
        }
*/





    }


}
