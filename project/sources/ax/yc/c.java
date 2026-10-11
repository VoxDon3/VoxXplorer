package ax.yc;

import ax.Gb.l;
import ax.xc.z;

/* loaded from: classes3.dex */
public final class c {
    public static final int a(int[] iArr, int i, int i2, int i3) {
        l.f(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final int b(z zVar, int i) {
        l.f(zVar, "<this>");
        int a = a(zVar.M(), i + 1, 0, zVar.N().length);
        return a >= 0 ? a : ~a;
    }
}
