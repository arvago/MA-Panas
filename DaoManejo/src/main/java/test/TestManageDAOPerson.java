
package test;
import data.PersonDAO;
import domain.Person;
import java.util.List;

public class TestManageDAOPerson {
    public static void main(String[] args) {
        PersonDAO personDao = new PersonDAO();
        /*
        List<Person> people = personDao.select();
        
        people.forEach(person ->{
            System.out.println(person);
        });
        */
        personDao.delete(5);
        
        /*for(Person person:people){
            System.out.println("Person"+person);
        }*/
    }
}
