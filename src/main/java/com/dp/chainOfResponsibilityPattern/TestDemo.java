package com.dp.chainOfResponsibilityPattern;

import com.dp.chainOfResponsibilityPattern.processor.MsgProcessor;

public class TestDemo {

    public static void main(String[] args) {
        String msg = "大家好，我被就业了！Fuck off!<script>alert(0)</script>";

        MsgProcessor processor = new MsgProcessor(msg);
        String result = processor.process();

        System.out.println(result );
    }
}
