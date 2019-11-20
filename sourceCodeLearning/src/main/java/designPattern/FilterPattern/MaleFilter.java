package designPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class MaleFilter implements Filter{

    @Override
    public List<Person> doFilter(List<Person> personList) {
        ArrayList<Person> maleList = new ArrayList<>();
        for (Person person : personList) {
            String gender = person.getGender();
            if(gender != null && gender.equalsIgnoreCase("male")){
                maleList.add(person);
            }
        }
        return maleList;
    }
}
