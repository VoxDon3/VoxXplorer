/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.G0.h;
import ax.G0.k;
import ax.Gb.l;

public final class CompositeGeneratedAdaptersObserver
implements f {
    private final b[] q;

    public CompositeGeneratedAdaptersObserver(b[] bArray) {
        l.f(bArray, "generatedAdapters");
        this.q = bArray;
    }

    @Override
    public void b(h h8, d.a a8) {
        int n8;
        l.f(h8, "source");
        l.f((Object)a8, "event");
        k k8 = new k();
        b[] bArray = this.q;
        int n9 = bArray.length;
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            bArray[n8].a(h8, a8, false, k8);
        }
        bArray = this.q;
        n9 = bArray.length;
        for (n8 = n10; n8 < n9; ++n8) {
            bArray[n8].a(h8, a8, true, k8);
        }
    }
}

