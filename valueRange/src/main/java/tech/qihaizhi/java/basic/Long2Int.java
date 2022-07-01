package tech.qihaizhi.java.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Long2Int {
    public static void main(String[] argv){
        long num = 100;
        /**
         * the line below compiles failure:
         * java: incompatible types: possible lossy conversion from long to int
         * */
        // int x = num + 2;
    }
}
