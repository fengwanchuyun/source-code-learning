package designPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class FeMaleFilter implements Filter {
    @Override
    public List<Person> doFilter(List<Person> personList) {
        List<Person> feMaleList = new ArrayList<>();
        for (Person person : personList) {
            String gender = person.getGender();
            if(gender != null && gender.equalsIgnoreCase("female")){
                feMaleList.add(person);
            }
        }
        return feMaleList;
    }
}
