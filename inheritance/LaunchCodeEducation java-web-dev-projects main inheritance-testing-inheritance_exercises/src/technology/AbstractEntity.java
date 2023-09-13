package technology;

public class AbstractEntity {
    private static int nextId = 1;
    private int id;

    public AbstractEntity() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }
}
