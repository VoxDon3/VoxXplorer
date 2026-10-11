package ax.P9;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class d<T> implements o {
    private final b a;

    class a extends b {
        a(String str, ax.M9.f fVar, List list, Class cls) {
            super(str, fVar, list, cls);
        }
    }

    public d(String str, ax.M9.f fVar, List<ax.S9.c> list, Class<T> cls) {
        this.a = new a(str, fVar, list, cls);
    }

    @Override // ax.P9.o
    public List<ax.S9.b> a() {
        return this.a.a();
    }

    @Override // ax.P9.o
    public URL d() {
        return this.a.d();
    }

    protected InputStream e() throws ax.M9.d {
        this.a.t(k.GET);
        return (InputStream) this.a.m().b().a(this, InputStream.class, null);
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

    protected T l(byte[] bArr) {
        this.a.t(k.PUT);
        return (T) this.a.m().b().a(this, this.a.q(), bArr);
    }
}
