/*
 * Decompiled with CFR 0.152.
 */
package ax.ra;

import ax.pa.a;
import ax.pa.b;
import ax.pa.c;
import java.io.EOFException;
import java.io.IOException;

public abstract class e
extends a
implements b {
    private int a;

    public int b() {
        return this.a;
    }

    public void c(c c8) throws IOException {
        this.d(c8);
        c8.a(ax.qa.a.e0);
        this.a = c8.f();
        try {
            c8.c();
            throw new ax.c.a("At least one byte remained after reading the return code. Is this response aligned properly?");
        }
        catch (EOFException eOFException) {
            return;
        }
    }

    public abstract void d(c var1) throws IOException;
}

