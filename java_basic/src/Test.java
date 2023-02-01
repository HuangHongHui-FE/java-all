import java.util.Random;

class Test {
    public static void main(String[] args) {
        int a[][] = new int[10][10];
        for (int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length;j++){
                a[i][j] = new Random().nextInt(2);
            }
        }
        for (int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length;j++){
                if(a[i][j]==1){
                    a[i][j]=2;
                }
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        for (int i=0; i<a.length; i++){
            for(int j=0; j<7;j++){
                if (a[i][j]==2 && a[i][j+1]==0 && a[i][j+2]==2 && a[i][j+3]==0){
                    count1++;
                }
            }
        }
        for (int j=0; j<a.length; j++){
            for(int i=0; i<7; i++){
                if (a[i][j]==2 && a[i+1][j]==0 && a[i+2][j]==2 && a[i+3][j]==0){
                    count2++;
                }
            }
        }
        for (int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                if (a[i][j]==2 && a[i+1][j+1]==0 && a[i+2][j+2]==2 && a[i+3][j+3]==0){
                    count3++;
                }
            }
        }
        for (int i=9; i>=3; i--){
            for(int j=0; j<7; j++){
                if (a[i][j]==2 && a[i-1][j+1]==0 && a[i-2][j+2]==2 && a[i-3][j+3]==0){
                    count4++;
                }
            }
        }

        System.out.println("������->�ң����ɣ���" + count1 + "��");
        System.out.println("������->�£����ɣ���" + count2 + "��");
        System.out.println("��������->���£����ɣ���" + count3 + "��");
        System.out.println("��������->���ϣ����ɣ���" + count4 + "��");
    }
}
