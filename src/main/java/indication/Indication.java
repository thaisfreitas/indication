package indication;

public class Indication {

    private long id;
    private String name;

    public Indication(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
