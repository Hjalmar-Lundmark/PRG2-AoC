package AoC2022;

import java.util.ArrayList;

public class dec7_2022_dirObj extends dec7_2022_fileObj{
    private String dirName;
    private int size;
    ArrayList<dec7_2022_fileObj> files;
    ArrayList<dec7_2022_dirObj> dirs;
    dec7_2022_dirObj parent;

    public dec7_2022_dirObj(String dirName) {
        this.dirName = dirName;
    }

    public dec7_2022_dirObj(String dirName, dec7_2022_dirObj parent) {
        this.dirName = dirName;
        this.parent = parent;
        this.files = new ArrayList<>();
        this.dirs = new ArrayList<>();
    }

    public dec7_2022_dirObj(String dirName, int size, ArrayList<dec7_2022_fileObj> files, ArrayList<dec7_2022_dirObj> dirs) {
        this.dirName = dirName;
        this.size = size;
        this.files = files;
        this.dirs = dirs;
    }

    public dec7_2022_dirObj(String filename, int size, String dirName, int size1, ArrayList<dec7_2022_fileObj> files, ArrayList<dec7_2022_dirObj> dirs) {
        super(filename, size);
        this.dirName = dirName;
        this.size = size1;
        this.files = files;
        this.dirs = dirs;
    }

    public String getDirName() {
        return dirName;
    }

    @Override
    public int getSize() {
        return size;
    }

    public ArrayList<dec7_2022_fileObj> getFiles() {
        return files;
    }

    public ArrayList<dec7_2022_dirObj> getDirs() {
        return dirs;
    }

    @Override
    public String toString() {
        return "dec7_2022_dirObj{" +
                "dirName='" + dirName + '\'' +
                ", size=" + size +
                ", files=" + files +
                ", dirs=" + dirs +
                '}';
    }

    public dec7_2022_dirObj getParent() {
        return parent;
    }

    public String currentDir() {
        return dirName;
    }

    public void cd(String childName) {
        if (dirs.contains(childName)) {    //Should contain a dir with name childName, not contain childName directly
            //Go there, idk how

        }
    }

    public void addFile(dec7_2022_fileObj f) {
        files.add(f);
    }

    public void addDir(dec7_2022_dirObj d) {
        dirs.add(d);
    }

    private void travDirs(dec7_2022_dirObj di) {
        for (dec7_2022_dirObj d : di.dirs) {
            travDirs(d);
        }

    }
}
