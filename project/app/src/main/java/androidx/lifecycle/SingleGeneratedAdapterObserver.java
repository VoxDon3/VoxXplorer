/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.G0.h;
import ax.Gb.l;

public final class SingleGeneratedAdapterObserver
implements f {
    private final b q;

    public SingleGeneratedAdapterObserver(b b8) {
        l.f(b8, "generatedAdapter");
        this.q = b8;
    }

    @Override
    public void b(h h8, d.a a8) {
        l.f(h8, "source");
        l.f((Object)a8, "event");
        this.q.a(h8, a8, false, null);
        this.q.a(h8, a8, true, null);
    }
}

