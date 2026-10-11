package ax.g4;

/* renamed from: ax.g4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2120i implements InterfaceC2114c, InterfaceC2113b {
    private InterfaceC2113b c0;
    private InterfaceC2114c d0;
    private boolean e0;
    private InterfaceC2113b q;

    public C2120i() {
        this(null);
    }

    private boolean j() {
        InterfaceC2114c interfaceC2114c = this.d0;
        return interfaceC2114c == null || interfaceC2114c.b(this);
    }

    private boolean k() {
        InterfaceC2114c interfaceC2114c = this.d0;
        return interfaceC2114c == null || interfaceC2114c.g(this);
    }

    private boolean l() {
        InterfaceC2114c interfaceC2114c = this.d0;
        return interfaceC2114c != null && interfaceC2114c.a();
    }

    @Override // ax.g4.InterfaceC2114c
    public boolean a() {
        return l() || c();
    }

    @Override // ax.g4.InterfaceC2114c
    public boolean b(InterfaceC2113b interfaceC2113b) {
        return j() && interfaceC2113b.equals(this.q) && !a();
    }

    @Override // ax.g4.InterfaceC2113b
    public boolean c() {
        return this.q.c() || this.c0.c();
    }

    @Override // ax.g4.InterfaceC2113b
    public void clear() {
        this.e0 = false;
        this.c0.clear();
        this.q.clear();
    }

    @Override // ax.g4.InterfaceC2113b
    public boolean d(InterfaceC2113b interfaceC2113b) {
        if (interfaceC2113b instanceof C2120i) {
            C2120i c2120i = (C2120i) interfaceC2113b;
            InterfaceC2113b interfaceC2113b2 = this.q;
            if (interfaceC2113b2 != null ? interfaceC2113b2.d(c2120i.q) : c2120i.q == null) {
                InterfaceC2113b interfaceC2113b3 = this.c0;
                InterfaceC2113b interfaceC2113b4 = c2120i.c0;
                if (interfaceC2113b3 == null) {
                    if (interfaceC2113b4 == null) {
                        return true;
                    }
                } else if (interfaceC2113b3.d(interfaceC2113b4)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ax.g4.InterfaceC2114c
    public void e(InterfaceC2113b interfaceC2113b) {
        if (interfaceC2113b.equals(this.c0)) {
            return;
        }
        InterfaceC2114c interfaceC2114c = this.d0;
        if (interfaceC2114c != null) {
            interfaceC2114c.e(this);
        }
        if (this.c0.i()) {
            return;
        }
        this.c0.clear();
    }

    @Override // ax.g4.InterfaceC2113b
    public void f() {
        this.e0 = false;
        this.q.f();
        this.c0.f();
    }

    @Override // ax.g4.InterfaceC2114c
    public boolean g(InterfaceC2113b interfaceC2113b) {
        if (k()) {
            return interfaceC2113b.equals(this.q) || !this.q.c();
        }
        return false;
    }

    @Override // ax.g4.InterfaceC2113b
    public void h() {
        this.e0 = true;
        if (!this.c0.isRunning()) {
            this.c0.h();
        }
        if (!this.e0 || this.q.isRunning()) {
            return;
        }
        this.q.h();
    }

    @Override // ax.g4.InterfaceC2113b
    public boolean i() {
        return this.q.i() || this.c0.i();
    }

    @Override // ax.g4.InterfaceC2113b
    public boolean isCancelled() {
        return this.q.isCancelled();
    }

    @Override // ax.g4.InterfaceC2113b
    public boolean isRunning() {
        return this.q.isRunning();
    }

    public void m(InterfaceC2113b interfaceC2113b, InterfaceC2113b interfaceC2113b2) {
        this.q = interfaceC2113b;
        this.c0 = interfaceC2113b2;
    }

    @Override // ax.g4.InterfaceC2113b
    public void recycle() {
        this.q.recycle();
        this.c0.recycle();
    }

    public C2120i(InterfaceC2114c interfaceC2114c) {
        this.d0 = interfaceC2114c;
    }
}
