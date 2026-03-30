package Adapter;

import java.nio.file.Path;
import java.nio.file.Paths;


interface ReadFromFile{
    final Path filePathRead = Paths.get("./datain.txt");
    final Path filePathWrite = Paths.get("./dataout.txt");
    public void readData();
    public void printData();
}
