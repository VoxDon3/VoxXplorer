/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.xc.D;
import ax.xc.e;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public interface A
extends Closeable,
Flushable {
    @Override
    public void close() throws IOException;

    @Override
    public void flush() throws IOException;

    public D timeout();

    public void write(e var1, long var2) throws IOException;
}

