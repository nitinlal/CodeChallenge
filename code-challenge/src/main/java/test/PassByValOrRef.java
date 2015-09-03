package src.main.java.test;

/**
 * Created by nitin on 8/29/15.
 */
public class PassByValOrRef {
    public static void main(String args[]) {

        Integer i = 4;

        /**
         * pass by value of pass by reference
         */

        increment(i);
        System.out.println(i);

        String name = "nitin";
        changeName(name);
        System.out.println(name); //String immutability in action


        People peopleOne = new People();
        peopleOne.setName("Nitin");
        changePeopleName(peopleOne);
        System.out.println(peopleOne.getName());

    }

    private static void changePeopleName(People peopleOne) {
        peopleOne.setName("Sachin");
    }

    private static void changeName(String name) {
        name = "sachin";
    }

    private static void increment(Integer i) {
        i++;
    }


    static class People {

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;


    }
}
