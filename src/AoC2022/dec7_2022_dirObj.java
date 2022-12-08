package AoC2022;

import java.util.ArrayList;

public class dec7_2022_dirObj extends dec7_2022_fileObj{
    String dirName;
    int size;
    ArrayList<dec7_2022_fileObj> files;
    ArrayList<dec7_2022_dirObj> dirs;

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

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<dec7_2022_fileObj> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<dec7_2022_fileObj> files) {
        this.files = files;
    }

    public ArrayList<dec7_2022_dirObj> getDirs() {
        return dirs;
    }

    public void setDirs(ArrayList<dec7_2022_dirObj> dirs) {
        this.dirs = dirs;
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

    public void parent() {

    }

    public String currentDir() {
        return dirName;
    }

    public void cd(String childName) {
        if (dirs.contains(childName)) {    //Should contain a dir with name childName, not contain childName directly
            //Go there, idk how

        }
    }
}
