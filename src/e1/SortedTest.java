package e1;

/**
 * @author: chips
 * @date: 2019-05-01
 * @description:
 **/
public class SortedTest {
    public static boolean isSorted(int[] table) {
        // 容错
        if (table == null || table.length == 0) {
            return false;
        }

        for(int i = 0, j = 1; j < table.length; i++, j++) {
            if (table[j] <  table[i]) return false;
        }
        return true;
    }

    public static boolean isSorted(Comparable[] table) {
        if (table == null || table.length == 0) {
            return false;
        }

        for(int i = 0, j = 1; j < table.length; i++, j++) {
            if (table[j].compareTo(table[i]) < 0) return false;
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println("测试int参数排序：");
        int[] testTable1 = {1,2,3,4,5,6};
        int[] testTable2 = {1,2,5,4,5,6};
        int[] testTable3 = {1};

        System.out.println("{1,2,3,4,5,6} : " + isSorted(testTable1));
        System.out.println("{1,2,5,4,5,6} : " + isSorted(testTable2));
        System.out.println("{1} : " + isSorted(testTable3));

        System.out.println("-------------------------");
        System.out.println("测试Comparable参数排序：");
        String[] testComparable1 = {"a","b", "c","d"};
        Double[] testComparable2 = {2.0, 3.0, 2.0};
        String[] testComparable3 = {"a","A", "c","d"};

        System.out.println("{\"a\",\"b\", \"c\",\"d\"} : " + isSorted(testComparable1));
        System.out.println("{2.0, 3.0, 2.0} : " + isSorted(testComparable2));
        System.out.println("{\"a\",\"A\", \"c\",\"d\"} : " + isSorted(testComparable3));
    }
}
