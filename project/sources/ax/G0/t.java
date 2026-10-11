package ax.G0;

import androidx.lifecycle.q;

/* loaded from: classes.dex */
public final /* synthetic */ class t {
    public static androidx.lifecycle.p a(q.b bVar, Class cls) {
        ax.Gb.l.f(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static androidx.lifecycle.p b(q.b bVar, Class cls, ax.I0.a aVar) {
        ax.Gb.l.f(cls, "modelClass");
        ax.Gb.l.f(aVar, "extras");
        return bVar.a(cls);
    }
}
