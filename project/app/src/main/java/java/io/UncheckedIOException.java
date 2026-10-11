/*
 * Decompiled with CFR 0.152.
 */
package java.io;

import java.io.IOException;

public class UncheckedIOException
extends RuntimeException {
    public UncheckedIOException(IOException iOException) {
        super((Throwable)j.Objects.requireNonNull((Object)iOException));
    }

    @Override
    public IOException getCause() {
        return (IOException)super.getCause();
    }
}

