package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class I2 extends AbstractC3935w2 {
    public Object[] d;
    public int e;

    @Override // j$.util.stream.AbstractC3846e2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }

    @Override // j$.util.stream.AbstractC3846e2, j$.util.stream.InterfaceC3866i2
    public final void l() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        InterfaceC3866i2 interfaceC3866i2 = this.a;
        interfaceC3866i2.m(j);
        if (!this.c) {
            while (i < this.e) {
                interfaceC3866i2.accept((InterfaceC3866i2) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e && !interfaceC3866i2.q()) {
                interfaceC3866i2.accept((InterfaceC3866i2) this.d[i]);
                i++;
            }
        }
        interfaceC3866i2.l();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }
}
