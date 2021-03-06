package com.designPattern.chainOfResponsibilityPattern.filter;

public class HTMLFilter implements Filter{

    @Override
    public String doFilter(String str) {
        return str.replaceAll("<","[")
                .replaceAll(">","]");
    }
}
