package pagecounter;

public class PageCounter {
    private Integer pageCount = 0;

    public synchronized void increment() {
        pageCount++;
    }

    public Integer getPageCount() {
        return pageCount;
    }
}
