package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
public final class SingleGeneratedAdapterObserver implements f {
    private final b q;

    public SingleGeneratedAdapterObserver(b bVar) {
        ax.Gb.l.f(bVar, "generatedAdapter");
        this.q = bVar;
    }

    @Override // androidx.lifecycle.f
    public void b(ax.G0.h hVar, d.a aVar) {
        ax.Gb.l.f(hVar, "source");
        ax.Gb.l.f(aVar, "event");
        this.q.a(hVar, aVar, false, null);
        this.q.a(hVar, aVar, true, null);
    }
}
