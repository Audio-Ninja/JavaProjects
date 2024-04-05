public class Weight implements Comparable<Weight> {
    int pounds;
    String type;

    Weight(int pounds, String type) {
        this.pounds = pounds;
        this.type = type;
    }

    public int compareTo(Weight w) {
        if(pounds == w.pounds) {
            return 0;
        } else if(pounds < w.pounds) {
            return -1;
        } else {
            return 1;
        }
    }
}