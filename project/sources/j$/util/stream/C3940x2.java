package j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3940x2 extends AbstractC3920t2 {
    public L2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.L2, j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.R2] */
    @Override // j$.util.stream.AbstractC3831b2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new R2();
        } else {
            r0 = new L2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.AbstractC3831b2, j$.util.stream.InterfaceC3866i2
    public final void l() {
        double[] dArr = (double[]) this.c.d();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC3866i2 interfaceC3866i2 = this.a;
        interfaceC3866i2.m(length);
        int i = 0;
        if (!this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                interfaceC3866i2.accept(dArr[i]);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                double d = dArr[i];
                if (interfaceC3866i2.q()) {
                    break;
                }
                interfaceC3866i2.accept(d);
                i++;
            }
        }
        interfaceC3866i2.l();
    }

    @Override // j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.c.accept(d);
    }
}
