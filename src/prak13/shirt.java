package prak13;

import java.util.StringTokenizer;

public class shirt {
    private String s;
    private String title;
    private String color;
    private String size;

    public void setInfo(String s) {
        StringTokenizer a = new StringTokenizer(s, ",");
        this.s = a.nextToken();
        this.title = a.nextToken();
        this.color = a.nextToken();
        this.size = a.nextToken();
    }

    @Override
    public String toString() {
        return "Shirt{" + "s='" + s + '\'' + ", title='" + title + '\'' + ", color='" + color + '\'' + ", size = '" + size + '\'' + '}';
    }
}