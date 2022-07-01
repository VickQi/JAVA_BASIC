package tech.qihaizhi.java.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CompareFloatPointerNumbers {
    public static void main(String[] args){
        float f1 = 0.1f + 0.4f;
        float f2 = 0.5f;
        log.info("f1==f2:{}", f1==f2);
        float f3 = 1.0f - 0.9f;
        float f4 = 0.1f;
        log.info("f3==f4:{}", f3==f4);
    }
}
