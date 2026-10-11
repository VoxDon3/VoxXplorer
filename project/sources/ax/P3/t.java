package ax.P3;

import ax.N3.b;
import ax.P3.d;
import ax.U3.m;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
class t implements d, b.a<Object> {
    private final e<?> c0;
    private int d0 = 0;
    private int e0 = -1;
    private ax.M3.h f0;
    private List<ax.U3.m<File, ?>> g0;
    private int h0;
    private volatile m.a<?> i0;
    private File j0;
    private u k0;
    private final d.a q;

    public t(e<?> eVar, d.a aVar) {
        this.c0 = eVar;
        this.q = aVar;
    }

    private boolean b() {
        return this.h0 < this.g0.size();
    }

    @Override // ax.P3.d
    public boolean a() {
        List<ax.M3.h> b = this.c0.b();
        boolean z = false;
        if (b.isEmpty()) {
            return false;
        }
        List<Class<?>> k = this.c0.k();
        while (true) {
            if (this.g0 != null && b()) {
                this.i0 = null;
                while (!z && b()) {
                    List<ax.U3.m<File, ?>> list = this.g0;
                    int i = this.h0;
                    this.h0 = i + 1;
                    this.i0 = list.get(i).a(this.j0, this.c0.p(), this.c0.e(), this.c0.i());
                    if (this.i0 != null && this.c0.q(this.i0.c.a())) {
                        this.i0.c.e(this.c0.j(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.e0 + 1;
            this.e0 = i2;
            if (i2 >= k.size()) {
                int i3 = this.d0 + 1;
                this.d0 = i3;
                if (i3 >= b.size()) {
                    return false;
                }
                this.e0 = 0;
            }
            ax.M3.h hVar = b.get(this.d0);
            Class<?> cls = k.get(this.e0);
            this.k0 = new u(hVar, this.c0.m(), this.c0.p(), this.c0.e(), this.c0.o(cls), cls, this.c0.i());
            File b2 = this.c0.c().b(this.k0);
            this.j0 = b2;
            if (b2 != null) {
                this.f0 = hVar;
                this.g0 = this.c0.h(b2);
                this.h0 = 0;
            }
        }
    }

    @Override // ax.N3.b.a
    public void c(Exception exc) {
        this.q.j(this.k0, exc, this.i0.c, ax.M3.a.RESOURCE_DISK_CACHE);
    }

    @Override // ax.P3.d
    public void cancel() {
        m.a<?> aVar = this.i0;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // ax.N3.b.a
    public void f(Object obj) {
        this.q.d(this.f0, obj, this.i0.c, ax.M3.a.RESOURCE_DISK_CACHE, this.k0);
    }
}
