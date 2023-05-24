import java.text.DecimalFormat;

public class SizeRecalculation {
    public static void main(String[] args) {
        long size = 55666612345L;
        System.out.println(setSize(size));
    }
    public static String setSize(long size) {
        int GB = 1024 * 1024 * 1024;//GB
        int MB = 1024 * 1024;//MB
        int KB = 1024;//KB
        long TB = 1024L * 1024L * 1024L * 1024L;
        DecimalFormat df = new DecimalFormat("0.00");//格式化小数
        String resultSize = "";
        if (size / TB >= 1) {
            //如果当前Byte的值大于等于1MB
            resultSize = df.format(size / (float) TB) + "TB";
        } else if (size / GB >= 1) {
            //如果当前Byte的值大于等于1MB
            resultSize = df.format(size / (float) GB) + "GB";
        } else if (size / MB >= 1) {
            //如果当前Byte的值大于等于1MB
            resultSize = df.format(size / (float) MB) + "MB";
        } else if (size / KB >= 1) {
            //如果当前Byte的值大于等于1KB
            resultSize = df.format(size / (float) KB) + "KB";
        } else {
            resultSize = size + "B";
        }
        return resultSize;
    }

}
