package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.d;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements f {
    private final a.C0020a c0;
    private final Object q;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.q = obj;
        this.c0 = a.c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.f
    public void b(ax.G0.h hVar, d.a aVar) {
        this.c0.a(hVar, aVar, this.q);
    }
}
