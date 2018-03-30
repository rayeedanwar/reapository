package main.java.framework.controls;

public class DropdownOption extends Control {
    private String value;
    private String displayText;
    private int index;

    public DropdownOption(String value, String displayText) {
        this.value = value;
        this.displayText = displayText;
    }

    public DropdownOption(String value, String displayText, int index) {
        this.value = value;
        this.displayText = displayText;
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public String getDisplayText() {
        return displayText;
    }

    public int getIndex() {
        return index;
    }
}
