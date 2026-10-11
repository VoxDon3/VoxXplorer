package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements f {
    private final b[] q;

    public CompositeGeneratedAdaptersObserver(b[] bVarArr) {
        ax.Gb.l.f(bVarArr, "generatedAdapters");
        this.q = bVarArr;
    }

    @Override // androidx.lifecycle.f
    public void b(ax.G0.h hVar, d.a aVar) {
        ax.Gb.l.f(hVar, "source");
        ax.Gb.l.f(aVar, "event");
        ax.G0.k kVar = new ax.G0.k();
        for (b bVar : this.q) {
            bVar.a(hVar, aVar, false, kVar);
        }
        for (b bVar2 : this.q) {
            bVar2.a(hVar, aVar, true, kVar);
        }
    }
}
