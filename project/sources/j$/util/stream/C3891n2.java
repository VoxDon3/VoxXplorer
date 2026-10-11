package j$.util.stream;

/* renamed from: j$.util.stream.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3891n2 extends AbstractC3841d2 {
    public long b;
    public long c;
    public final /* synthetic */ C3896o2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3891n2(C3896o2 c3896o2, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.d = c3896o2;
        this.b = c3896o2.m;
        long j = c3896o2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.AbstractC3841d2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        this.a.m(AbstractC3919t1.x(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.InterfaceC3861h2, j$.util.stream.InterfaceC3866i2
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 == 0) {
            long j3 = this.c;
            if (j3 > 0) {
                this.c = j3 - 1;
                this.a.accept(j);
                return;
            }
            return;
        }
        this.b = j2 - 1;
    }

    @Override // j$.util.stream.AbstractC3841d2, j$.util.stream.InterfaceC3866i2
    public final boolean q() {
        return this.c == 0 || this.a.q();
    }
}
