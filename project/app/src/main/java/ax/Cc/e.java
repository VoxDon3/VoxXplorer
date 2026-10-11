/*
 * Decompiled with CFR 0.152.
 */
package ax.Cc;

import ax.Cc.g;
import ax.Cc.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class e {
    private final boolean a;
    private final List<g> b;

    public e(byte[] byArray) throws IOException {
        this.b = new ArrayList<g>(h.n(byArray, 0, 21));
        this.a = h.d(byArray, 504);
    }

    public List<g> a() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }
}

