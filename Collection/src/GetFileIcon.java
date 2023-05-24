import sun.awt.shell.ShellFolder;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Base64;


/**
 * @author NPF
 * @date 2020/10/27 15:53
 */
public class GetFileIcon {
    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {

        //GetFileIcon.getIcon1();
        GetFileIcon.getIcon2();
        File file = new File("D:\\BaiduNetdiskDownload\\npp.8.4.4.Installer.exe");
        GetFileIcon.getIcon1(file);


    }
    /**
     * 参考网址：https://blog.csdn.net/weixin_34023863/article/details/91560836
     * 第一种形式获取icon,利用javax.swing中FileSystemView获取
     * 缺点就是很小，很模糊
     */
    public static String getIcon1(File file){
        String base64String = "iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAD4ElEQVR4Xu3XW0xbdRwHcDRGE01IfNEHfdVElxiTveiL2YNTN2ccC1sGGG8bojh2TdhAxkmZZHOsc0I3CmWlYEFWGHUttPQCdL1xaVdaSrm1UBDXaSbIbYBAfvr/f7MuS1OyvdEHT/J5OGnO//8953/7Nenf+9f6+jpthqT/AzwqwOrqKtyZmaa5xUW4rLtBfaEgdPp9UNaipvl7i/fdo7W1NYhtL1biB4hMT0PahWJyBYeh2WknlcMCnf19UNryKw1MhEHRbkQILra9WHEDLK+sULleC+2+PpCb9GTyumH09u+ksOggv64SBFUt1XYaQd1lo2DkNmh6uuAf9hVjO0+8ANFxW1pZpnNNDXBJ0wwmXzeNRiZA67HQ6UYpfFSSB2/kHqRXjnwBBcpqFsIB0eeXlpfizovECvD3wjyYvR4a/G0SdB4H3Br309RfEegO+ahIXQXpEgHeKvyWXsraD8+l76aTChmM34mAxd9PswsLsGGAwclJ+F5VRxqXAyo6miB8d4qGI2NgHXKTcF0K0QBvC4fo5W/S4Kl9H9Lzn6SC0mIGob6GApMTkLgB9O5eaLRb6YpJDUVqGQSmQmTyO6HaqqXjyouQIv4OtuZ/TS9m7oMnU3dSUsr7kFMhAT4P2m65IG4AvttVm9tA3WWnvHopZMvPg97rpFprCxQ0llNamQDbREfh1WOfUfKnKfDEnh309N5dIDPqQGlpZ20bIEEDsOXRzDrmGh1WOqoog4yyIlDc1NF5bR0ckJ6ld4TD8PqJL+GFg3vp2bSPYcvhr+iKTgP11g5odtromu0mrCVkAL5B+MNh8I6zmR7oh/0/ngGNy0lKmwkKG+T0rigXtotOQaZEzDrqBEW7gV7LyYTs8lLwjYeobywIcQPwG+9YCGQG3YMVUWXWg314gC5oVOAY8lPqDyLYXSzArjOFtFN0Gt4T8mnLkSyoYuPPiRp+pok//4C4cyAhAtydnYXjsnKq7TBBhvgcbBfyqNKoB294jK6y1cIVKOVwSCqhbQW5kJyxh7IkF8Hs84Cczf6Z+TnYMED0sLAF/HSWHURci6sH0llB8uaxbNh6IodqWNHBJbN9n0tK+YCeYcuOO/CTmLS9XVDMdlWOv9gjD6NNDxDFl6RjcABa3d3AiwpednG8PBPfaIIGNuu5zy+VUKlWDb+w++gxbPC4gW90D/eR2AEe1jMyBBWGVippVsE1u4U0vU64zgpUjq+Yy60auMrKt97REeAvw8W2+9gBouM2PTdHzqEAqOx8R7NAZVsr1HQYyR0cgRlW1MQb73gSP8BGoh1E/7jE/v64HgTYrGvTA/wHKxmKe2fuz0gAAAAASUVORK5CYII=";
        Image icon = ((ImageIcon) FileSystemView.getFileSystemView().getSystemIcon(file)).getImage();
        //获取小图标后转化为大图标
        int width = 32;
        int height = 32;
        BufferedImage bi = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.getGraphics();
        g.drawImage(icon,0,0,width,height,null);
        g.dispose();
        try {
            //图片转base64
            //bi = ImageIO.read(file) ;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ImageIO.write(bi,"png",outputStream);
            byte[] bytes = outputStream.toByteArray();
            base64String = Base64.getEncoder().encodeToString(bytes);
            System.out.println(base64String);
        }catch (IOException e){
            e.printStackTrace();
        }
        if (base64String.equals("iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAD4ElEQVR4Xu3XW0xbdRwHcDRGE01IfNEHfdVElxiTveiL2YNTN2ccC1sGGG8bojh2TdhAxkmZZHOsc0I3CmWlYEFWGHUttPQCdL1xaVdaSrm1UBDXaSbIbYBAfvr/f7MuS1OyvdEHT/J5OGnO//8953/7Nenf+9f6+jpthqT/AzwqwOrqKtyZmaa5xUW4rLtBfaEgdPp9UNaipvl7i/fdo7W1NYhtL1biB4hMT0PahWJyBYeh2WknlcMCnf19UNryKw1MhEHRbkQILra9WHEDLK+sULleC+2+PpCb9GTyumH09u+ksOggv64SBFUt1XYaQd1lo2DkNmh6uuAf9hVjO0+8ANFxW1pZpnNNDXBJ0wwmXzeNRiZA67HQ6UYpfFSSB2/kHqRXjnwBBcpqFsIB0eeXlpfizovECvD3wjyYvR4a/G0SdB4H3Br309RfEegO+ahIXQXpEgHeKvyWXsraD8+l76aTChmM34mAxd9PswsLsGGAwclJ+F5VRxqXAyo6miB8d4qGI2NgHXKTcF0K0QBvC4fo5W/S4Kl9H9Lzn6SC0mIGob6GApMTkLgB9O5eaLRb6YpJDUVqGQSmQmTyO6HaqqXjyouQIv4OtuZ/TS9m7oMnU3dSUsr7kFMhAT4P2m65IG4AvttVm9tA3WWnvHopZMvPg97rpFprCxQ0llNamQDbREfh1WOfUfKnKfDEnh309N5dIDPqQGlpZ20bIEEDsOXRzDrmGh1WOqoog4yyIlDc1NF5bR0ckJ6ld4TD8PqJL+GFg3vp2bSPYcvhr+iKTgP11g5odtromu0mrCVkAL5B+MNh8I6zmR7oh/0/ngGNy0lKmwkKG+T0rigXtotOQaZEzDrqBEW7gV7LyYTs8lLwjYeobywIcQPwG+9YCGQG3YMVUWXWg314gC5oVOAY8lPqDyLYXSzArjOFtFN0Gt4T8mnLkSyoYuPPiRp+pok//4C4cyAhAtydnYXjsnKq7TBBhvgcbBfyqNKoB294jK6y1cIVKOVwSCqhbQW5kJyxh7IkF8Hs84Cczf6Z+TnYMED0sLAF/HSWHURci6sH0llB8uaxbNh6IodqWNHBJbN9n0tK+YCeYcuOO/CTmLS9XVDMdlWOv9gjD6NNDxDFl6RjcABa3d3AiwpednG8PBPfaIIGNuu5zy+VUKlWDb+w++gxbPC4gW90D/eR2AEe1jMyBBWGVippVsE1u4U0vU64zgpUjq+Yy60auMrKt97REeAvw8W2+9gBouM2PTdHzqEAqOx8R7NAZVsr1HQYyR0cgRlW1MQb73gSP8BGoh1E/7jE/v64HgTYrGvTA/wHKxmKe2fuz0gAAAAASUVORK5CYII="))
        {
            System.out.println("base64String生成失敗，使用初始图标。");
        }
        return base64String;
    }
    /**
     * 推荐使用
     * 参考网址：https://zhidao.baidu.com/question/317417746.html
     * 第二种形式获取icon,利用通过awt.shellFolder获取图标
     * 获取的32*32 比较清晰，可以使用
     */
    public static void getIcon2() throws FileNotFoundException {
        File file = new File("C:\\Users\\DELL\\Desktop\\学业相关\\20230206程序打包\\Setup.exe");
        // 图标保存地址
//        OutputStream inStream = new FileOutputStream(new File("D:\\TencentDocs.exe_64(2).png"));
        // 通过awt.shellFolder获取图标 默认为32 *32
            ShellFolder shellFolder = ShellFolder.getShellFolder(file);
            ImageIcon icon = new ImageIcon(shellFolder.getIcon(true));
        //Image icon = ((ImageIcon) FileSystemView.getFileSystemView().getSystemIcon(file)).getImage();

        int width = 32;
        int height = 32;
        BufferedImage bi = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.getGraphics();
        g.drawImage(icon.getImage(),0,0,width,height,null);
        g.dispose();
        try {
            //图片转base64
            //bi = ImageIO.read(file) ;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ImageIO.write(bi,"png",outputStream);
            byte[] bytes = outputStream.toByteArray();
            String base64String = Base64.getEncoder().encodeToString(bytes);
            System.out.println(base64String);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

//            BufferedImage imgIcon = (BufferedImage) icon.getImage();
//            // 调整icon图标大小，放大后会模糊
//            imgIcon = resize(imgIcon,256,256);
//            ImageIO.write(imgIcon, "png", inStream);
//            inStream.flush();
//            inStream.close();




    }
    /**
     * 调整大小
     * @param img
     * @param newW
     * @param newH
     * @return
     */
    public static BufferedImage resize(BufferedImage img, int newW, int newH) {
        int w = img.getWidth();
        int h = img.getHeight();
        BufferedImage new_img = new BufferedImage(newW, newH, img.getType());
        Graphics2D g = new_img.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);
        g.dispose();
        return new_img;
    }


}
//import java.awt.FlowLayout;
//import java.io.File;
//import java.io.FileNotFoundException;
//
//
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.filechooser.FileSystemView;
//
//
//
//
//public class GetFileIcon {
//
//
//    /**
//     * @param args
//     */
//    public static void main(String[] args) {
//        String filePath = "D:\\Program Files\\TencentDocs\\TencentDocs.exe";
//        File f = new File(filePath);
//        JFrame frm = new JFrame();
//        frm.setSize(300, 200);
//        frm.setLocationRelativeTo(null);
//        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frm.setVisible(true);
//        frm.setLayout(new FlowLayout(10,10,FlowLayout.LEADING));
//
//        JLabel sl = new JLabel("小图标");
//        frm.add(sl);
//        JLabel bl = new JLabel("大图标");
//        frm.add(bl);
//
//        sl.setIcon(getSmallIcon(f));
//        bl.setIcon(getBigIcon(f));
//    }
//
//
//    /**
//     * 获取小图标
//     * @param f
//     * @return
//     */
//    private static Icon getSmallIcon(File f) {
//        if (f != null && f.exists()) {
//            FileSystemView fsv = FileSystemView.getFileSystemView();
//            return fsv.getSystemIcon(f);
//        }
//        return null;
//    }
//
//    /**
//     * 获取大图标
//     * @param f
//     * @return
//     */
//    private static Icon getBigIcon(File f) {
//        if (f!=null && f.exists()) {
//            try {
//                sun.awt.shell.ShellFolder sf = sun.awt.shell.ShellFolder.getShellFolder(f);
//                return new ImageIcon(sf.getIcon(true));
//            } catch (FileNotFoundException e) {
//// TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }
//}
