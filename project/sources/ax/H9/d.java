package ax.H9;

/* loaded from: classes3.dex */
public abstract class d extends e implements ax.Qa.a {
    protected f k0;
    protected ax.B9.b l0;

    public d(i iVar, ax.B9.b bVar, int i, int i2) {
        super(iVar);
        int i3 = i + i2;
        if (i3 > bVar.b()) {
            throw new IllegalArgumentException("tried to queue past end of data, " + i3);
        }
        if (i < 0) {
            throw new IllegalArgumentException("tried to queue before start of data, " + i);
        }
        this.q = bVar;
        this.l0 = bVar;
        this.k0 = new f();
        this.c0 = i;
        this.d0 = i2;
    }

    public h h() {
        return null;
    }

    public ax.B9.b i() {
        return this.l0;
    }

    public void j(int i) {
        this.e0 = i;
    }
}
