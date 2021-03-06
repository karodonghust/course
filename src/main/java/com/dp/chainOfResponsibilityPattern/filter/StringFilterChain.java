package com.dp.chainOfResponsibilityPattern.filter;

import java.util.ArrayList;
import java.util.List;

public class StringFilterChain implements FilterChain{
    List<Filter> filters = new ArrayList();
    @Override
    public String doFilter(String str) {
        for(Filter filter : filters){
            str = filter.doFilter(str);
        }
        return str;
    }

    @Override
    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public FilterChain removeFilter(Filter filter) {
        filters.remove(filter);
        return this;
    }
}
