package designPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterPatternDemo {


    /**
     *
     *
     */

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        //jdk8提供的过滤功能
        Map<String, List<Person>> collect = persons.stream().collect(Collectors.groupingBy(Person::getGender));
        collect.forEach((k,v)->{
            System.out.println(k);
            v.forEach(System.out::println);
        });

//        MaleFilter maleFilter = new MaleFilter();
//        FeMaleFilter feMaleFilter = new FeMaleFilter();
//        SingleFilter singleFilter = new SingleFilter();
//        AndFilter maleAndSingleFilter = new AndFilter(maleFilter, singleFilter);
//        OrFilter feMaleOrSingleFilter = new OrFilter(feMaleFilter, singleFilter);
//
//        printMsg(maleFilter.doFilter(persons),"maleFilter");
//        printMsg(feMaleFilter.doFilter(persons),"feMaleFilter");
//        printMsg(singleFilter.doFilter(persons),"singleFilter");
//        printMsg(maleAndSingleFilter.doFilter(persons),"maleAndSingleFilter");
//        printMsg(feMaleOrSingleFilter.doFilter(persons),"feMaleOrSingleFilter");
    }

    public static void printMsg(List<Person> list, String type){
        for (Person person : list) {
            System.out.println(type+":name:"+person.getName()+",gender:"+person.getGender()+",maritalStatus:"+person.getMaritalStatus());
        }
    }

}
