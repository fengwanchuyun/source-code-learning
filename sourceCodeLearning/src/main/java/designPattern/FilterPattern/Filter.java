package designPattern.FilterPattern;

import java.util.List;

public interface Filter {
    public List<Person> doFilter(List<Person> personList);
}
