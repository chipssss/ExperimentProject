package e1;

/**
 * @author: chips
 * @date: 2019-05-01
 * @description:
 **/
public class ReverseTest {
    public static <T> void reverse(T[] data) {
        if (data == null || data.length == 0) {
            return;
        }

        // 时间复杂度n/2 O(n), 控件复杂度n/2 O(n)
        for (int i = 0, j = (data.length - 1); i < data.length / 2; i++, j--) {
            T temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("测试数组逆置");

        Integer[] testInteger = {1, 2, 3, 4, 5};
        String[] testString = {"a", "b", "c", "d"};
        String[] testStringSingle = {"a"};

        reverse(testString);
        reverse(testInteger);
        reverse(testStringSingle);

        System.out.println("{1, 2, 3, 4, 5} : " + print(testInteger));
        System.out.println("{\"a\", \"b\", \"c\", \"d\"} : " + print(testString));
        System.out.println("{\"a\"} : " + print(testStringSingle));
    }

    private static <T> String print(T[] data) {
        StringBuffer buffer = new StringBuffer("{");

        for (T item : data) {
            buffer.append(item).append(",");
        }
        buffer.setCharAt(buffer.length()-1, '}');

        return buffer.toString();
    }
}
