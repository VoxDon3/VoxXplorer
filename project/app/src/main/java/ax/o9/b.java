/*
 * Decompiled with CFR 0.152.
 */
package ax.o9;

import ax.Z8.a;
import ax.o9.c;
import java.io.IOException;

public class b
extends c {
    private a<?> e0;

    public b(a<?> a8) {
        this.e0 = a8;
    }

    @Override
    public int a() {
        return this.e0.c();
    }

    @Override
    protected int b(byte[] byArray) throws IOException {
        int n8 = byArray.length;
        if (this.e0.c() < byArray.length) {
            n8 = this.e0.c();
        }
        try {
            this.e0.F(byArray, 0, n8);
            return n8;
        }
        catch (a.b b8) {
            throw new IOException(b8);
        }
    }

    @Override
    public boolean e() {
        return this.e0.c() > 0;
    }

    @Override
    public void f(int n8) {
    }
}

