package j$.nio.file;

import j$.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface FileVisitor<T> {
    FileVisitResult postVisitDirectory(T t, IOException iOException);

    FileVisitResult preVisitDirectory(T t, BasicFileAttributes basicFileAttributes);

    FileVisitResult visitFile(T t, BasicFileAttributes basicFileAttributes);

    FileVisitResult visitFileFailed(T t, IOException iOException);
}
