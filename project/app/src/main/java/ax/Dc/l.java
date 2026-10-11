/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.N;
import ax.Dc.W;
import ax.Kc.f;
import java.util.zip.ZipException;

public final class l
implements N {
    private static final W c0;
    private static final l d0;
    private static final W q;

    static {
        q = new W(51966);
        c0 = new W(0);
        d0 = new l();
    }

    @Override
    public W b() {
        return q;
    }

    @Override
    public W c() {
        return c0;
    }

    @Override
    public void d(byte[] byArray, int n8, int n9) throws ZipException {
        if (n9 == 0) {
            return;
        }
        throw new ZipException("JarMarker doesn't expect any data");
    }

    @Override
    public byte[] f() {
        return f.a;
    }

    @Override
    public byte[] h() {
        return f.a;
    }

    @Override
    public W i() {
        return c0;
    }

    @Override
    public void j(byte[] byArray, int n8, int n9) throws ZipException {
        this.d(byArray, n8, n9);
    }
}

