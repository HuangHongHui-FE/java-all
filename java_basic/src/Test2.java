import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

class Test2 {
    public static void main(String[] args) {

        String [] first_name={"张","赵","孙","李","郑","周","王","吴","邓","程"};
        String [] second_name={"玉","鑫","欣","恒","业","建","鹏","德","品","慧"};
        String [] thire_name={"宝","致","举","易","波","秋","竹","凡","南","寒"};
        String [] user_types={"微信","支付宝"};
        String [] provinces={"北京市","天津市","河北省","山西省","内蒙古自治区","辽宁省","吉林省","黑龙江省","上海市","江苏省","浙江省","安徽省","福建省","江西省","山东省","河南省","湖北省","湖南省","广东省","广西壮族自治区","海南省","重庆市","四川省","贵州省","云南省","西藏藏族自治区","陕西省","甘肃省","青海省","宁夏回族自治区","新疆维吾尔族自治区","香港特别行政区","澳门特别行政区","台湾省"};
//        在控制台一次性生成1000个信息：
//        1、 用户名称（first_name+ second+third）
//        2、 电话号码（其中电话号码前7位为："1503661";）后四位随机
//        3、 充电时间：（格式为"yyyy-MM-dd hh:mm:ss"）
//        4、 充电付款方式user_types
//        5、 省份provinces
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            Random r = new Random();

            int first_index = r.nextInt(first_name.length);
            int second_index = r.nextInt(second_name.length);
            int thire_index = r.nextInt(thire_name.length);

            String username = first_name[first_index] + second_name[second_index] + thire_name[thire_index];
            String number = "1503661" + r.nextInt(10) + r.nextInt(10) + r.nextInt(10);
            String time = null;
            String user_type = user_types[i % user_types.length];
            String province = provinces[i % provinces.length];

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            time = sdf.format(date);

            System.out.println("用户" + i + "-" + username + "-" + number + "-" + time + "-" + user_type + "-" + province);
        }

    }
}
