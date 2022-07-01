package tech.qihaizhi.java.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintAscii {

    public static void main(String[] argv){
        log.info("| ASCII | CHAR |");

        for(int i=0;i<128;i++){
            log.info("| {} | {} |", i, (char)i);
        }
    }
}
