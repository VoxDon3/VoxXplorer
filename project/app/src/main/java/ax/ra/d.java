/*
 * Decompiled with CFR 0.152.
 */
package ax.ra;

import ax.Oc.b;
import ax.pa.a;
import ax.ra.e;
import java.io.IOException;

public abstract class d<T extends e>
extends a
implements ax.pa.b {
    private final short a;

    public d(short s8) {
        this.a = s8;
    }

    public short b() {
        return this.a;
    }

    public abstract T c();

    public byte[] d() throws IOException {
        b b8 = new b();
        this.a(new ax.pa.d(b8));
        return b8.b();
    }
}

