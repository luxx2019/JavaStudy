/**
 * 用于将字符串类型数字转化成整数类型数字
 */
package IntegerMethods;

public class AboutParseInt {
    public static void main(String[] args) {
        String s1 = "2020";
        String s2 = "2020";
        String s3 = "BC";
        int[] nums = new int[3];
        nums[0] = Integer.parseInt(s1);
        nums[1] = Integer.parseInt(s2, 8);
        nums[2] = Integer.parseInt(s3, 16);
        for (int num : nums)
            System.out.println(num);
    }
}
