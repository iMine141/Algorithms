package DataStructures.Sort;

/**
 * @author wym
 */
public class insert {
    public static void main(String[] args) {
        int insertBase = 10000;
        int len=(int)Math.ceil(100000D / insertBase);
        System.out.println(len);
    }
    /**
     * 插入排序
     */
    public static void insert(int array[]){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while( j>0 && temp<array[j-1] ){
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
    }
}
