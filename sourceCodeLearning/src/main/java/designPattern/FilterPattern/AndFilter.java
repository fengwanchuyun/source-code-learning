package designPattern.FilterPattern;

import java.util.List;

public class AndFilter implements Filter {

    private Filter filter;
    private Filter anotherFilter;

    public AndFilter(Filter filter, Filter anotherFilter) {
        this.filter = filter;
        this.anotherFilter = anotherFilter;
    }

    @Override
    public List<Person> doFilter(List<Person> personList) {
        List<Person> firstList = filter.doFilter(personList);
        List<Person> finalList = anotherFilter.doFilter(firstList);
        return finalList;
    }
}
