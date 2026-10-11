package java.nio.file;

import java.io.Closeable;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface DirectoryStream<T> extends Closeable, Iterable<T> {

    public interface Filter<T> {
        /* renamed from: accept */
        boolean mo6accept(T t);
    }

    Iterator<T> iterator();
}
