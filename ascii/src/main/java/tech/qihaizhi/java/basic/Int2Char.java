package tech.qihaizhi.java.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Int2Char {
    public static void main(String[] argv){
        int num = 68;
        char ch = (char)num;
        log.info("ch={}",ch);
    }
}
