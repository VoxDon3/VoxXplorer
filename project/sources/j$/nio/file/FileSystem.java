package j$.nio.file;

import java.io.Closeable;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class FileSystem implements Closeable, AutoCloseable {
    public abstract boolean A();

    public abstract D C();

    public abstract j$.nio.file.spi.c D();

    public abstract Set H();

    public abstract boolean isOpen();

    public abstract Iterable j();

    public abstract Path k(String str, String... strArr);

    public abstract PathMatcher n(String str);

    public abstract Iterable o();

    public abstract String t();

    public abstract j$.nio.file.attribute.B y();
}
