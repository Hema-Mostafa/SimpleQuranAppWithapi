package route.com.g2holyquran.Model;


public class Hadeth {
    String title;
    String content;

    public Hadeth() {
        title= "";
        content = "";
    }

    public Hadeth(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
