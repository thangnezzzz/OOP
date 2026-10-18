public class Image {
    private int height; //pixels
    private int width; //pixels
    private String fileName;
    private String quality;//low,medium or high
    public Image (int height, int width, String fileName, String quality){
        this.height=height;
        this.width=width;
        this.fileName=fileName;
        this.quality=quality;
    }
    public boolean isPortrait(){
        return this.width < this.height;
    }
    public int size(){
        return this.height * this.width;
    }
    public boolean isLarger(Image that){
        return this.size() > that.size();
    }
}
