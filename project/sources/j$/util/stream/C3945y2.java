package j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3945y2 extends AbstractC3925u2 {
    public N2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.N2, j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.R2] */
    @Override // j$.util.stream.AbstractC3836c2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new R2();
        } else {
            r0 = new N2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.AbstractC3836c2, j$.util.stream.InterfaceC3866i2
    public final void l() {
        int[] iArr = (int[]) this.c.d();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC3866i2 interfaceC3866i2 = this.a;
        interfaceC3866i2.m(length);
        int i = 0;
        if (!this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                interfaceC3866i2.accept(iArr[i]);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                int i2 = iArr[i];
                if (interfaceC3866i2.q()) {
                    break;
                }
                interfaceC3866i2.accept(i2);
                i++;
            }
        }
        interfaceC3866i2.l();
    }

    @Override // j$.util.stream.InterfaceC3856g2, j$.util.stream.InterfaceC3866i2
    public final void accept(int i) {
        this.c.accept(i);
    }
}
