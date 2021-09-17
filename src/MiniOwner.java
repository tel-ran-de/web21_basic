import auto.Owner;

public class MiniOwner extends Owner {
    public MiniOwner(String name) {
        super(name);
    }

    public void setPassword(int pass) {
        passport = pass;
    }

    @Override
    public String toString() {
        return "MiniOwner{" +
                "passport=" + passport +
                '}';
    }
}
