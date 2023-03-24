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

        String path="D:\\TencentDocs.exe_64(2).png";
        File file=new File(path);
        BufferedImage bufferedImage;
        try {
            //图片转base64
            bufferedImage=ImageIO.read(file) ;
            ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
            ImageIO.write(bufferedImage,"png",outputStream);
            byte[] bytes=outputStream.toByteArray();
            String base64String= Base64.getEncoder().encodeToString(bytes);
            System.out.println(base64String);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    /**
     * 参考网址：https://blog.csdn.net/weixin_34023863/article/details/91560836
     * 第一种形式获取icon,利用javax.swing中FileSystemView获取
     * 缺点就是很小，很模糊
     */
    public static void getIcon1(){
        // --------------------------------------------
        // 缺点就是很小，很模糊
        File file1 = new File("D:\\Program Files\\TencentDocs\\TencentDocs.exe");
        Image image = ((ImageIcon) FileSystemView.getFileSystemView().getSystemIcon(file1)).getImage();
        int width = 10;
        int height = 10;
        BufferedImage bi = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.getGraphics();
        g.drawImage(image,0,0,width,height,null);
        g.dispose();
        File f = new File("D:\\TencentDocs.exe_64(1).png");
        try {
            ImageIO.write(bi, "png", f);
        } catch (IOException e) {
            //log.error("写png文件失败",e);
        }
    }
    /**
     * 推荐使用
     * 参考网址：https://zhidao.baidu.com/question/317417746.html
     * 第二种形式获取icon,利用通过awt.shellFolder获取图标
     * 获取的32*32 比较清晰，可以使用
     */
    public static void getIcon2() throws FileNotFoundException {
        File file = new File("D:\\Program Files\\TencentDocs\\TencentDocs.exe");
        // 图标保存地址
//        OutputStream inStream = new FileOutputStream(new File("D:\\TencentDocs.exe_64(2).png"));
        try {
            // 通过awt.shellFolder获取图标 默认为32 *32
            ShellFolder shellFolder = ShellFolder.getShellFolder(file);
            ImageIcon icon = new ImageIcon(shellFolder.getIcon(true));

            int width = 32;
            int height = 32;
            BufferedImage bi = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
            Graphics g = bi.getGraphics();
            g.drawImage(icon.getImage(),0,0,width,height,null);
            g.dispose();
            File f = new File("D:\\TencentDocs.exe_64(2).png");
            try {
                ImageIO.write(bi, "png", f);
            } catch (IOException e) {
                //log.error("写png文件失败",e);
            }
//            BufferedImage imgIcon = (BufferedImage) icon.getImage();
//            // 调整icon图标大小，放大后会模糊
//            imgIcon = resize(imgIcon,256,256);
//            ImageIO.write(imgIcon, "png", inStream);
//            inStream.flush();
//            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
