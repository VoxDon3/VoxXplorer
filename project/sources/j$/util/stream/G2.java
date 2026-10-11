package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class G2 extends AbstractC3925u2 {
    public int[] c;
    public int d;

    @Override // j$.util.stream.AbstractC3836c2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new int[(int) j];
    }

    @Override // j$.util.stream.AbstractC3836c2, j$.util.stream.InterfaceC3866i2
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

    @Override // j$.util.stream.InterfaceC3856g2, j$.util.stream.InterfaceC3866i2
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }
}
