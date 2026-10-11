/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.b;
import ax.m7.v;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class c
extends b {
    private final byte[] c;
    private final int d;
    private final int e;

    public c(String string, byte[] byArray, int n8, int n9) {
        super(string);
        this.c = v.d(byArray);
        boolean bl = n8 >= 0 && n9 >= 0 && n8 + n9 <= byArray.length;
        v.c(bl, "offset %s, length %s, array length %s", n8, n9, byArray.length);
        this.d = n8;
        this.e = n9;
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public InputStream e() {
        return new ByteArrayInputStream(this.c, this.d, this.e);
    }

    @Override
    public long getLength() {
        return this.e;
    }

    public c h(String string) {
        return (c)super.g(string);
    }
}

