package com.designPattern.chainOfResponsibilityPattern.processor;

import com.designPattern.chainOfResponsibilityPattern.filter.*;

public class MsgProcessor {

    String message;
    FilterChain filterChain = new StringFilterChain();

    public MsgProcessor(String message) {
        this.message = message;
        filterChain.addFilter(new HTMLFilter())
                .addFilter(new SBWorkFilter());
    }

    public String process(){
        message = filterChain.doFilter(message);
        return message;
    }
}
