package ch.bbw;

public class VisabilityTest {

    private int returnSixPrivate() {
        return 6;
    }

    public int returnSixPublic() {
        return 6;
    }

    protected int returnSixProtected() {
        return 6;
    }

    int returnSixPackageProtected() {
        return 6;
    }
}
