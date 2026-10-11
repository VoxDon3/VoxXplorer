package j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3950z2 extends AbstractC3930v2 {
    public P2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.P2, j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.R2] */
    @Override // j$.util.stream.AbstractC3841d2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new R2();
        } else {
            r0 = new P2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.AbstractC3841d2, j$.util.stream.InterfaceC3866i2
    public final void l() {
        long[] jArr = (long[]) this.c.d();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC3866i2 interfaceC3866i2 = this.a;
        interfaceC3866i2.m(length);
        int i = 0;
        if (!this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                interfaceC3866i2.accept(jArr[i]);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                long j = jArr[i];
                if (interfaceC3866i2.q()) {
                    break;
                }
                interfaceC3866i2.accept(j);
                i++;
            }
        }
        interfaceC3866i2.l();
    }

    @Override // j$.util.stream.InterfaceC3861h2, j$.util.stream.InterfaceC3866i2
    public final void accept(long j) {
        this.c.accept(j);
    }
}
