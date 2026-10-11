package ax.xc;

import ax.xc.C3487e;

/* renamed from: ax.xc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3484b {
    private static final C3487e.a a = new C3487e.a();
    private static final int b = -1234567890;

    public static final boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        ax.Gb.l.f(bArr, "a");
        ax.Gb.l.f(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final int c() {
        return b;
    }

    public static final C3487e.a d() {
        return a;
    }

    public static final int e(h hVar, int i) {
        ax.Gb.l.f(hVar, "<this>");
        return i == b ? hVar.G() : i;
    }

    public static final int f(byte[] bArr, int i) {
        ax.Gb.l.f(bArr, "<this>");
        return i == b ? bArr.length : i;
    }

    public static final C3487e.a g(C3487e.a aVar) {
        ax.Gb.l.f(aVar, "unsafeCursor");
        return aVar == a ? new C3487e.a() : aVar;
    }

    public static final int h(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final short i(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public static final String j(byte b2) {
        return ax.Ob.h.q(new char[]{ax.yc.b.f()[(b2 >> 4) & 15], ax.yc.b.f()[b2 & 15]});
    }

    public static final String k(int i) {
        int i2 = 0;
        if (i == 0) {
            return "0";
        }
        char[] cArr = {ax.yc.b.f()[(i >> 28) & 15], ax.yc.b.f()[(i >> 24) & 15], ax.yc.b.f()[(i >> 20) & 15], ax.yc.b.f()[(i >> 16) & 15], ax.yc.b.f()[(i >> 12) & 15], ax.yc.b.f()[(i >> 8) & 15], ax.yc.b.f()[(i >> 4) & 15], ax.yc.b.f()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return ax.Ob.h.r(cArr, i2, 8);
    }
}
