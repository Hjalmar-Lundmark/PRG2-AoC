package AoC2022;

public class dec7_2022_fileObj {
    String filename;
    int size;

    public dec7_2022_fileObj() {

    }

    public dec7_2022_fileObj(String filename, int size) {
        this.filename = filename;
        this.size = size;
    }

    public String getFilename() {
        return filename;
    }

    public int getSize() {
        return size;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "dec7_2022_fileObj{" +
                "filename='" + filename + '\'' +
                ", size=" + size +
                '}';
    }
}
