package ax.I0;

import androidx.lifecycle.p;
import androidx.lifecycle.q;
import ax.G0.t;
import ax.Gb.l;

/* loaded from: classes.dex */
public final class b implements q.b {
    private final f<?>[] a;

    public b(f<?>... fVarArr) {
        l.f(fVarArr, "initializers");
        this.a = fVarArr;
    }

    @Override // androidx.lifecycle.q.b
    public /* synthetic */ p a(Class cls) {
        return t.a(this, cls);
    }

    @Override // androidx.lifecycle.q.b
    public <T extends p> T b(Class<T> cls, a aVar) {
        l.f(cls, "modelClass");
        l.f(aVar, "extras");
        T t = null;
        for (f<?> fVar : this.a) {
            if (l.a(fVar.a(), cls)) {
                Object invoke = fVar.b().invoke(aVar);
                t = invoke instanceof p ? (T) invoke : null;
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
