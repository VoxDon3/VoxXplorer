/*
 * Decompiled with CFR 0.152.
 */
package ax.Aa;

import ax.pa.c;
import java.io.EOFException;
import java.io.IOException;

public class a
extends IOException {
    private final ax.oa.c c0;
    private final int q;

    public a(int n8) {
        this.q = n8;
        this.c0 = ax.oa.c.h(n8);
    }

    public static a c(c c8) throws IOException {
        int n8;
        try {
            n8 = c8.f();
        }
        catch (EOFException eOFException) {
            n8 = -1;
        }
        return new a(n8);
    }

    public ax.oa.c a() {
        return this.c0;
    }

    public int b() {
        return this.q;
    }

    @Override
    public String getMessage() {
        return String.format("Fault: %s (0x%08X)", new Object[]{this.a(), this.b()});
    }
}

