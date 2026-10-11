/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.j;
import ax.m7.v;
import ax.m7.y;
import java.io.IOException;
import java.io.OutputStream;

public final class k
implements y {
    private final y a;
    private final j b;

    public k(y y8, j j8) {
        this.a = v.d(y8);
        this.b = v.d(j8);
    }

    @Override
    public void b(OutputStream outputStream) throws IOException {
        this.b.a(this.a, outputStream);
    }
}

