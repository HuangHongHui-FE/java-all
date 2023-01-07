package basic;

public class Demo13While {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("我错啦！" + i);
            i++;
            if(i==5){
                break;
            }
        }


        int j = 1;
        do {
            j++;
            if(j==5) continue;
            System.out.println("原谅你啦！起来吧！地上怪凉！" + j);

        } while (j <= 10);
    }
}
