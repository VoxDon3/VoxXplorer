package ax.P9;

import java.net.URL;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class a<T1, T2> implements o {
    private final b a;
    private final Class<T1> b;
    private final Class<T2> c;

    /* renamed from: ax.P9.a$a, reason: collision with other inner class name */
    class C0171a extends b {
        C0171a(String str, ax.M9.f fVar, List list, Class cls) {
            super(str, fVar, list, cls);
        }
    }

    public a(String str, ax.M9.f fVar, List<ax.S9.c> list, Class<T1> cls, Class<T2> cls2) {
        this.b = cls;
        this.c = cls2;
        this.a = new C0171a(str, fVar, list, cls);
    }

    @Override // ax.P9.o
    public List<ax.S9.b> a() {
        return this.a.a();
    }

    @Override // ax.P9.o
    public URL d() {
        return this.a.d();
    }

    public void e(ax.S9.a aVar) {
        this.a.n().add(aVar);
    }

    @Override // ax.P9.o
    public boolean g() {
        return this.a.g();
    }

    @Override // ax.P9.o
    public k h() {
        return this.a.h();
    }

    @Override // ax.P9.o
    public void k(String str, String str2) {
        this.a.k(str, str2);
    }

    public void l(ax.S9.d dVar) {
        this.a.p().add(dVar);
    }

    protected b m() {
        return this.a;
    }

    protected T1 n() throws ax.M9.d {
        this.a.t(k.GET);
        return (T1) this.a.m().b().a(this, this.b, null);
    }
}
