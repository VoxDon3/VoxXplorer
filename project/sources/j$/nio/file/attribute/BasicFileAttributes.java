package j$.nio.file.attribute;

/* loaded from: classes2.dex */
public interface BasicFileAttributes {
    s creationTime();

    Object fileKey();

    boolean isDirectory();

    boolean isOther();

    boolean isRegularFile();

    boolean isSymbolicLink();

    s lastAccessTime();

    s lastModifiedTime();

    long size();
}
