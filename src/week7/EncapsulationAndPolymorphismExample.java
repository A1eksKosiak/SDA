package week7;

public class EncapsulationAndPolymorphismExample {
    public static void main(String[] args) {

        Person johnSmith = new Person("John Smith");
        Person sarahConnor = new Person("Sarah Connor");

//        System.out.println(johnSmith.fullName);
        System.out.println(sarahConnor.getFullName());

        johnSmith.setFirstName("patrick");
        System.out.println(johnSmith.getFirstName());
    }

    public static class Person {

        private String firstName;
        private String secondName;
        //    public String fullName;          //if public - can cause issues with amending code in the future

        public Person(String fullName) {
            if (fullName != null) {
                String[] nameParts = fullName.split(" ");
                //this.firstName = nameParts[0]
                setFirstName(nameParts[0]);
                if (nameParts.length > 1) {
                    this.secondName = nameParts[1];
                }
            }
        }

        public Person(String firstName, String secondName) {
            setFirstName(firstName);
            this.secondName = secondName;
        }

        public String getFullName() {
            return this.firstName + " " + secondName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            //make sure name starts from upper case
            this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }
    }
}
