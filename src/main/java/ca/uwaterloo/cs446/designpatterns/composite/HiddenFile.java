package ca.uwaterloo.cs446.designpatterns.composite;

public class HiddenFile implements Component {
    private String name;

    public HiddenFile(String name) {
        this.name = name;
    }

    @Override
    public String ls() {
        String name = "";
        return name;
    }
}
