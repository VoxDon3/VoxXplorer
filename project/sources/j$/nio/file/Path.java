package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface Path extends Comparable<Path>, Iterable<Path> {
    boolean A(Path path);

    Path C(Path path);

    C D(D d, A... aArr);

    Path I(Path path);

    boolean endsWith(String str);

    boolean equals(Object obj);

    Path getFileName();

    FileSystem getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    boolean isAbsolute();

    Iterator iterator();

    C k(D d, A[] aArr, B... bArr);

    Path n(Path path);

    Path normalize();

    Path o(LinkOption... linkOptionArr);

    Path resolve(String str);

    Path resolveSibling(String str);

    boolean startsWith(String str);

    Path subpath(int i, int i2);

    int t(Path path);

    Path toAbsolutePath();

    File toFile();

    String toString();

    URI toUri();

    boolean y(Path path);
}
