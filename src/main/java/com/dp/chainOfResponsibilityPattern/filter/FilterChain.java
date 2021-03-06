package com.dp.chainOfResponsibilityPattern.filter;

public interface FilterChain extends Filter{

    public FilterChain addFilter(Filter filter);

    public FilterChain removeFilter(Filter filter);
}
