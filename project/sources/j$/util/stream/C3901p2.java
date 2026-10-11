package j$.util.stream;

/* renamed from: j$.util.stream.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3901p2 extends AbstractC3831b2 {
    public long b;
    public long c;
    public final /* synthetic */ C3906q2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3901p2(C3906q2 c3906q2, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.d = c3906q2;
        this.b = c3906q2.m;
        long j = c3906q2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.AbstractC3831b2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        this.a.m(AbstractC3919t1.x(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.accept(d);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // j$.util.stream.AbstractC3831b2, j$.util.stream.InterfaceC3866i2
    public final boolean q() {
        return this.c == 0 || this.a.q();
    }
}
