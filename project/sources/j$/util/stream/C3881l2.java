package j$.util.stream;

/* renamed from: j$.util.stream.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3881l2 extends AbstractC3836c2 {
    public long b;
    public long c;
    public final /* synthetic */ C3886m2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3881l2(C3886m2 c3886m2, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.d = c3886m2;
        this.b = c3886m2.m;
        long j = c3886m2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.AbstractC3836c2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        this.a.m(AbstractC3919t1.x(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.InterfaceC3856g2, j$.util.stream.InterfaceC3866i2
    public final void accept(int i) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.accept(i);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // j$.util.stream.AbstractC3836c2, j$.util.stream.InterfaceC3866i2
    public final boolean q() {
        return this.c == 0 || this.a.q();
    }
}
