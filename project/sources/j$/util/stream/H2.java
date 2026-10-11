package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class H2 extends AbstractC3930v2 {
    public long[] c;
    public int d;

    @Override // j$.util.stream.AbstractC3841d2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new long[(int) j];
    }

    @Override // j$.util.stream.AbstractC3841d2, j$.util.stream.InterfaceC3866i2
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

    @Override // j$.util.stream.InterfaceC3861h2, j$.util.stream.InterfaceC3866i2
    public final void accept(long j) {
        long[] jArr = this.c;
        int i = this.d;
        this.d = i + 1;
        jArr[i] = j;
    }
}
