package Builder;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String gender;
    private final int age;
    private final String phone;

    private Person(PersonBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    public static class PersonBuilder{
        private final String firstName;
        private final String lastName;
        private String gender;
        private int age;
        private String phone;

        public PersonBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder gender(String gender){
            this.gender = gender;
            return this;
        }

        public PersonBuilder age(int age){
            this.age = age;
            return this;
        }

        public PersonBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.firstName + " ");
        sb.append(this.lastName + " ");
        sb.append(this.gender + " ");
        sb.append(this.age + " ");
        sb.append(this.phone);
        return sb.toString(); 
    }

    static public void main(String[] args){
        Person person = new Person.PersonBuilder("Alex", "Feld")
        .gender("Male").age(30).phone("123456789").build();

        System.out.println(person.toString());

        Person person2 = new Person.PersonBuilder("Masha", "Dolina")
        .gender("Female").age(25).phone("987654321").build();

        System.out.println(person2.toString());
    }
}
