public class shuixianhua {
    public static void main(String[] args) {
        int i = 100;
        int b,s,g;

        System.out.println("水仙花数有：");
        for (i = 100;i < 1000;i++){
            g = i % 10;
            b = i / 100;
            s = (i % 100) / 10;
            if (g*g*g+b*b*b+s*s*s == i)
                System.out.print(i+" ");
        }

    }
}
