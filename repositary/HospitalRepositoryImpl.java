package hospital.repository;

import hospital.model.Person;
import java.util.ArrayList;
import java.util.List;

public class HospitalRepositoryImpl<T extends Person> implements HospitalRepository<T> {
    private List<T> persons = new ArrayList<>();

    @Override
    public void add(T person) {
        persons.add(person);
    }

    @Override
    public T getById(String id) {
        for (T person : persons) {
            if (person.getId().equalsIgnoreCase(id)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(persons);
    }

    @Override
    public boolean remove(String id) {
        return persons.removeIf(person -> person.getId().equalsIgnoreCase(id));
    }
}
