package designPattern.IteratorPattern;

public class NameRepsitory implements Repository {

    private String[] name = {"micheal","kobe","lebron","keiven"};

    private Iterator iterator;

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }


    private class NameIterator implements Iterator {
        int index;

        @Override
        public Object next() {
            if(hasNext()){
                return name[index ++];
            }
            return null;
        }

        @Override
        public Boolean hasNext() {
            if(index < name.length){
                return true;
            }
            return false;
        }
    }
}
