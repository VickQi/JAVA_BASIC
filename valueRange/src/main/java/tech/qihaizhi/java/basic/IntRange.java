package tech.qihaizhi.java.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IntRange {
    public static void main(String[] args){
        int num = Integer.MAX_VALUE;
        log.info("num  ={}", num);
        log.info("num+2={}", num+2);
        log.info("num+1={}", num+1);
        log.info("Integer.MIN_VALUE={}", Integer.MIN_VALUE);
    }
}
