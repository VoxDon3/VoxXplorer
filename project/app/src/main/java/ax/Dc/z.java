/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.W;
import ax.Dc.n;
import java.util.zip.ZipException;

public class z
extends n {
    private int e0;
    private n.b f0;

    public z() {
        super(new W(21));
    }

    @Override
    public void j(byte[] byArray, int n8, int n9) throws ZipException {
        this.a(4, n9);
        super.j(byArray, n8, n9);
        this.e0 = W.h(byArray, n8);
        this.f0 = n.b.d(W.h(byArray, n8 + 2));
    }
}

