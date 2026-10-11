/*
 * Decompiled with CFR 0.152.
 */
package java.nio.file;

import java.io.Closeable;
import java.util.Iterator;

public interface DirectoryStream<T>
extends Closeable,
Iterable<T> {
    @Override
    public Iterator<T> iterator();

    public static interface Filter<T> {
        public boolean accept(T var1);
    }
}

