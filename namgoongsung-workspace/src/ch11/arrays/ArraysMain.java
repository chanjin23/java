package ch11.arrays;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11,12,13},{21,22,23}};

        System.out.println("arr=" + Arrays.toString(arr));
        System.out.println("arr2D=" + Arrays.deepToString(arr2D));
        System.out.println();

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

        System.out.println("arr2="+ Arrays.toString(arr2));
        System.out.println("arr3="+ Arrays.toString(arr3));
        System.out.println("arr4="+ Arrays.toString(arr4));
        System.out.println("arr5="+ Arrays.toString(arr5));
        System.out.println("arr6="+ Arrays.toString(arr6));
        System.out.println();

        int[] arr7 =new int[5];
        Arrays.fill(arr7, 9);   //arr=[9,9,9,9,9];
        System.out.println("arr7=" + Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1);
        System.out.println("arr7=" + Arrays.toString(arr7));
        System.out.println();

        for (int i : arr7) {
//        for(int x=0;arr7.length;++x){
//            int i=arr7[x];
            //다음 for문을 간결하게 바꾼 향상된 for문
            char[] graph =new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph)+i);
            //new String(graph) -> graph에 있는 데이터를 전부 문자열로 변환
            //String을 char로 바꾸는 방법 tocharArray() 반대는 new String(char[])
        }
        System.out.println();

        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println(Arrays.equals(str2D,str2D2));        //잘못된 결과
        System.out.println(Arrays.deepEquals(str2D,str2D2));    //다차원배열일때는 deep을 사용한다.
        System.out.println();

        char[] chArr = {'A', 'D', 'C', 'B', 'E'};
        System.out.println("chArr=" + Arrays.toString(chArr));
        System.out.println("index of B=" + Arrays.binarySearch(chArr, 'B'));    //잘못된 결과
        System.out.println("= After Sorting  =");
        Arrays.sort(chArr);     //이진탐색을 하기위해선 정렬을 먼저해야한다.
        System.out.println("chArr=" + Arrays.toString(chArr));
        System.out.println("index of B=" + Arrays.binarySearch(chArr, 'B'));
    }
}
