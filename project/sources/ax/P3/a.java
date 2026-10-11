package ax.P3;

import ax.N3.b;
import ax.P3.d;
import ax.U3.m;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
class a implements d, b.a<Object> {
    private final e<?> c0;
    private final d.a d0;
    private int e0;
    private ax.M3.h f0;
    private List<ax.U3.m<File, ?>> g0;
    private int h0;
    private volatile m.a<?> i0;
    private File j0;
    private List<ax.M3.h> q;

    a(e<?> eVar, d.a aVar) {
        this(eVar.b(), eVar, aVar);
    }

    private boolean b() {
        return this.h0 < this.g0.size();
    }

    @Override // ax.P3.d
    public boolean a() {
        while (true) {
            boolean z = false;
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
            if (i2 >= this.q.size()) {
                return false;
            }
            ax.M3.h hVar = this.q.get(this.e0);
            File b = this.c0.c().b(new b(hVar, this.c0.m()));
            this.j0 = b;
            if (b != null) {
                this.f0 = hVar;
                this.g0 = this.c0.h(b);
                this.h0 = 0;
            }
        }
    }

    @Override // ax.N3.b.a
    public void c(Exception exc) {
        this.d0.j(this.f0, exc, this.i0.c, ax.M3.a.DATA_DISK_CACHE);
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
        this.d0.d(this.f0, obj, this.i0.c, ax.M3.a.DATA_DISK_CACHE, this.f0);
    }

    a(List<ax.M3.h> list, e<?> eVar, d.a aVar) {
        this.e0 = -1;
        this.q = list;
        this.c0 = eVar;
        this.d0 = aVar;
    }
}
