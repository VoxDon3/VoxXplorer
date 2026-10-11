package java.io;

public final class FileRetargetClass {
    private FileRetargetClass() { }

    public static java.nio.file.Path toPath(File file) {
        return file.toPath();
    }
}
