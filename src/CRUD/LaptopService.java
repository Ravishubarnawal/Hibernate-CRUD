package CRUD;

public class LaptopService {
    private LaptopRepo repository;
    public LaptopService() {
        repository = new LaptopRepo();
    }
    public void addLaptop(Laptop laptop) {
        repository.add(laptop);
    }

    public Laptop read(int id) {
        return repository.read(id);
    }

    public void updateLaptop(Laptop laptop) {
        repository.update(laptop);
    }

    public void deleteLaptop(Laptop laptop) {
        repository.delete(laptop);
    }
}

