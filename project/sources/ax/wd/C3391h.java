package ax.wd;

/* renamed from: ax.wd.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3391h extends AbstractC3387d {
    public C3391h() {
    }

    @Override // ax.wd.AbstractC3387d, ax.vd.InterfaceC3312i
    public void a() {
        super.a();
        this.e = 7640891576956012808L;
        this.f = -4942790177534073029L;
        this.g = 4354685564936845355L;
        this.h = -6534734903238641935L;
        this.i = 5840696475078001361L;
        this.j = -7276294671716946913L;
        this.k = 2270897969802886507L;
        this.l = 6620516959819538809L;
    }

    @Override // ax.vd.InterfaceC3312i
    public int c(byte[] bArr, int i) {
        s();
        ax.Nd.h.n(this.e, bArr, i);
        ax.Nd.h.n(this.f, bArr, i + 8);
        ax.Nd.h.n(this.g, bArr, i + 16);
        ax.Nd.h.n(this.h, bArr, i + 24);
        ax.Nd.h.n(this.i, bArr, i + 32);
        ax.Nd.h.n(this.j, bArr, i + 40);
        ax.Nd.h.n(this.k, bArr, i + 48);
        ax.Nd.h.n(this.l, bArr, i + 56);
        a();
        return 64;
    }

    @Override // ax.vd.InterfaceC3312i
    public String f() {
        return "SHA-512";
    }

    @Override // ax.Nd.f
    public ax.Nd.f g() {
        return new C3391h(this);
    }

    @Override // ax.vd.InterfaceC3312i
    public int i() {
        return 64;
    }

    @Override // ax.Nd.f
    public void j(ax.Nd.f fVar) {
        r((C3391h) fVar);
    }

    public C3391h(C3391h c3391h) {
        super(c3391h);
    }
}
