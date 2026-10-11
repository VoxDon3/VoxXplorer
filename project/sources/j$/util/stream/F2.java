package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class F2 extends AbstractC3920t2 {
    public double[] c;
    public int d;

    @Override // j$.util.stream.AbstractC3831b2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new double[(int) j];
    }

    @Override // j$.util.stream.AbstractC3831b2, j$.util.stream.InterfaceC3866i2
    public final void l() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        InterfaceC3866i2 interfaceC3866i2 = this.a;
        interfaceC3866i2.m(j);
        if (!this.b) {
            while (i < this.d) {
                interfaceC3866i2.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d && !interfaceC3866i2.q()) {
                interfaceC3866i2.accept(this.c[i]);
                i++;
            }
        }
        interfaceC3866i2.l();
        this.c = null;
    }

    @Override // j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        double[] dArr = this.c;
        int i = this.d;
        this.d = i + 1;
        dArr[i] = d;
    }
}
