/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.xc.D;
import ax.xc.e;
import java.io.Closeable;
import java.io.IOException;

public interface C
extends Closeable {
    @Override
    public void close() throws IOException;

    public long read(e var1, long var2) throws IOException;

    public D timeout();
}

