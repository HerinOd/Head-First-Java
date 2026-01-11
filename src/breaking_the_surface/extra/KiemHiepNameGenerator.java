package breaking_the_surface.extra;

import java.util.Random;

public class KiemHiepNameGenerator {
    public static void main(String[] args) {
        String[] firstPart  = new String[] {"Độc Cô", "Lệnh Hồ", "Tây Môn", "Quách", "Hoàng"};
        String[] secondPart = new String[] {"Cầu", "Bại", "Phi", "Tiếu", "Vô"};
        String[] thirdPart = new String[] {"Kiếm", "Đao", "Ca", "Khách", "Thần"};

        Random randomGenerator = new Random();
        String name1 = firstPart[randomGenerator.nextInt(firstPart.length)];
        String name2 = secondPart[randomGenerator.nextInt(secondPart.length)];
        String name3 = thirdPart[randomGenerator.nextInt(thirdPart.length)];

        System.out.println("Xin chào đại hiệp, tên giang hồ của ngài là: " +
                name1 + " " + name2 + " " + name3 + ".");
    }
}
