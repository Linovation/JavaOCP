public class ImageScanner implements AutoCloseable {
    public void close () throws Exception {
        System.out.println("Scanner closed");
    }
    public void scanImage () throws Exception {
        System.out.println("Scan.");
        throw new Exception("Unable to scan.");
    }
}
