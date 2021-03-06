package com.dp.chainOfResponsibilityPattern.filter;

public class SBWorkFilter implements Filter{


    @Override
    public String doFilter(String str) {
        return str.replaceAll("fuck","***").replaceAll("Fuck","***");
    }
}
