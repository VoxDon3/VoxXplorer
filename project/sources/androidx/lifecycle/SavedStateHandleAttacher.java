package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements f {
    private final ax.G0.q q;

    public SavedStateHandleAttacher(ax.G0.q qVar) {
        ax.Gb.l.f(qVar, "provider");
        this.q = qVar;
    }

    @Override // androidx.lifecycle.f
    public void b(ax.G0.h hVar, d.a aVar) {
        ax.Gb.l.f(hVar, "source");
        ax.Gb.l.f(aVar, "event");
        if (aVar == d.a.ON_CREATE) {
            hVar.getLifecycle().c(this);
            this.q.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
