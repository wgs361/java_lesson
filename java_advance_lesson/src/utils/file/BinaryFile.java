//: net/mindview/util/BinaryFile.java
// Utility for reading files in binary form.
package utils.file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFile {
    public static byte[] read(File file) throws IOException {
        BufferedInputStream stream = new BufferedInputStream(
                new FileInputStream(file));
        try {
            byte[] data = new byte[stream.available()];
            stream.read(data);
            return data;
        } finally {
            stream.close();
        }
    }

    public static byte[] read(String path) throws IOException {
        return read(new File(path).getAbsoluteFile());
    }
} ///:~
