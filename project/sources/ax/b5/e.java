package ax.b5;

import ax.T4.o;
import ax.T4.p;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes.dex */
public class e implements o, Serializable {
    public static final ax.W4.l i0 = new ax.W4.l(" ");
    protected b c0;
    protected final p d0;
    protected boolean e0;
    protected transient int f0;
    protected k g0;
    protected String h0;
    protected b q;

    public static class a extends c {
        public static final a c0 = new a();

        @Override // ax.b5.e.c, ax.b5.e.b
        public boolean a() {
            return true;
        }

        @Override // ax.b5.e.c, ax.b5.e.b
        public void b(ax.T4.g gVar, int i) throws IOException {
            gVar.A(' ');
        }
    }

    public interface b {
        boolean a();

        void b(ax.T4.g gVar, int i) throws IOException;
    }

    public e() {
        this(i0);
    }

    @Override // ax.T4.o
    public void a(ax.T4.g gVar) throws IOException {
        this.c0.b(gVar, this.f0);
    }

    @Override // ax.T4.o
    public void b(ax.T4.g gVar, int i) throws IOException {
        if (!this.q.a()) {
            this.f0--;
        }
        if (i > 0) {
            this.q.b(gVar, this.f0);
        } else {
            gVar.A(' ');
        }
        gVar.A(']');
    }

    @Override // ax.T4.o
    public void c(ax.T4.g gVar, int i) throws IOException {
        if (!this.c0.a()) {
            this.f0--;
        }
        if (i > 0) {
            this.c0.b(gVar, this.f0);
        } else {
            gVar.A(' ');
        }
        gVar.A('}');
    }

    @Override // ax.T4.o
    public void d(ax.T4.g gVar) throws IOException {
        if (this.e0) {
            gVar.H(this.h0);
        } else {
            gVar.A(this.g0.d());
        }
    }

    @Override // ax.T4.o
    public void e(ax.T4.g gVar) throws IOException {
        this.q.b(gVar, this.f0);
    }

    @Override // ax.T4.o
    public void f(ax.T4.g gVar) throws IOException {
        if (!this.q.a()) {
            this.f0++;
        }
        gVar.A('[');
    }

    @Override // ax.T4.o
    public void g(ax.T4.g gVar) throws IOException {
        gVar.A('{');
        if (this.c0.a()) {
            return;
        }
        this.f0++;
    }

    @Override // ax.T4.o
    public void h(ax.T4.g gVar) throws IOException {
        gVar.A(this.g0.c());
        this.c0.b(gVar, this.f0);
    }

    @Override // ax.T4.o
    public void i(ax.T4.g gVar) throws IOException {
        p pVar = this.d0;
        if (pVar != null) {
            gVar.F(pVar);
        }
    }

    @Override // ax.T4.o
    public void j(ax.T4.g gVar) throws IOException {
        gVar.A(this.g0.b());
        this.q.b(gVar, this.f0);
    }

    public e k(k kVar) {
        this.g0 = kVar;
        this.h0 = " " + kVar.d() + " ";
        return this;
    }

    public e(p pVar) {
        this.q = a.c0;
        this.c0 = d.g0;
        this.e0 = true;
        this.d0 = pVar;
        k(o.d);
    }

    public static class c implements b, Serializable {
        public static final c q = new c();

        @Override // ax.b5.e.b
        public boolean a() {
            return true;
        }

        @Override // ax.b5.e.b
        public void b(ax.T4.g gVar, int i) throws IOException {
        }
    }
}
