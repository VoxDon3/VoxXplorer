/*
 * Decompiled with CFR 0.152.
 */
package java.nio.file;

import java.io.IOException;
import java.util.ConcurrentModificationException;

public final class DirectoryIteratorException
extends ConcurrentModificationException {
    public DirectoryIteratorException(IOException iOException) {
        super((Throwable)j.Objects.requireNonNull((Object)iOException));
    }

    @Override
    public IOException getCause() {
        return (IOException)super.getCause();
    }
}

