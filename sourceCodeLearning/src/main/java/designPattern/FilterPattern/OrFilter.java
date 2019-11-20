package designPattern.FilterPattern;

import java.util.List;

public class OrFilter implements Filter {

    private Filter filter;
    private Filter anoterFilter;

    public OrFilter(Filter filter, Filter anoterFilter) {
        this.filter = filter;
        this.anoterFilter = anoterFilter;
    }

    @Override
    public List<Person> doFilter(List<Person> personList) {
        List<Person> firstList = filter.doFilter(personList);
        List<Person> secondList = anoterFilter.doFilter(personList);

        for (Person person : firstList) {
            if (!secondList.contains(person)){
                secondList.add(person);
            }
        }
        return secondList;
    }
}
