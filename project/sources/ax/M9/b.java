package ax.M9;

import ax.P9.n;

/* loaded from: classes3.dex */
public abstract class b implements f {
    private ax.K9.a a;
    private ax.L9.d b;
    private n c;
    private ax.Q9.b d;
    private ax.T9.e e;

    @Override // ax.M9.f
    public ax.Q9.b a() {
        return this.d;
    }

    @Override // ax.M9.f
    public n b() {
        return this.c;
    }

    @Override // ax.M9.f
    public ax.K9.a c() {
        return this.a;
    }

    protected void f(ax.K9.a aVar) {
        this.a = aVar;
    }

    protected void g(ax.L9.d dVar) {
        this.b = dVar;
    }

    protected void h(n nVar) {
        this.c = nVar;
    }

    protected void i(ax.Q9.b bVar) {
        this.d = bVar;
    }

    public void j(ax.T9.e eVar) {
        this.e = eVar;
    }

    public void k() {
        if (this.a == null) {
            throw new NullPointerException("AuthenticationProvider");
        }
        if (this.b == null) {
            throw new NullPointerException("Executors");
        }
        if (this.c == null) {
            throw new NullPointerException("HttpProvider");
        }
        if (this.e == null) {
            throw new NullPointerException("Serializer");
        }
    }
}
