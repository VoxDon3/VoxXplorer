/*
 * Decompiled with CFR 0.152.
 */
package ax.qc;

import ax.lc.d;
import ax.qc.b;
import ax.qc.g;
import ax.rc.f;
import java.io.IOException;

class i
extends b<d> {
    public i(g g8, f f8, char[] cArray, int n8, boolean bl) throws IOException {
        super(g8, f8, cArray, n8, bl);
    }

    private byte[] g() throws IOException {
        byte[] byArray = new byte[12];
        this.f(byArray);
        return byArray;
    }

    protected d j(f f8, char[] cArray, boolean bl) throws IOException {
        return new d(cArray, f8.e(), f8.k(), this.g(), bl);
    }
}

