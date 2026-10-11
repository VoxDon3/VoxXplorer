package j$.util.stream;

/* loaded from: classes2.dex */
public final class F3 extends AbstractC3846e2 implements S3 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ G3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F3(G3 g3, InterfaceC3866i2 interfaceC3866i2, boolean z) {
        super(interfaceC3866i2);
        this.e = g3;
        this.d = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (!this.c) {
            boolean test = this.e.m.test(obj);
            this.c = !test;
            if (test) {
                z = false;
                z2 = this.d;
                if (z2 && !z) {
                    this.b++;
                }
                if (!z2 || z) {
                    this.a.accept((InterfaceC3866i2) obj);
                }
                return;
            }
        }
        z = true;
        z2 = this.d;
        if (z2) {
            this.b++;
        }
        if (z2) {
        }
        this.a.accept((InterfaceC3866i2) obj);
    }

    @Override // j$.util.stream.S3
    public final long f() {
        return this.b;
    }
}
