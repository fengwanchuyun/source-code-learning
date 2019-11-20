package designPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class SingleFilter implements Filter {
    @Override
    public List<Person> doFilter(List<Person> personList) {
        List<Person> singleList = new ArrayList<>();
        for (Person person : personList) {
            String gender = person.getMaritalStatus();
            if(gender != null && gender.equalsIgnoreCase("single")){
                singleList.add(person);
            }
        }
        return singleList;
    }
}
