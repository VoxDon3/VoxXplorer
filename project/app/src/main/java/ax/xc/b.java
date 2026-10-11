/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.e;
import ax.xc.h;

public final class b {
    private static final e.a a = new e.a();
    private static final int b = -1234567890;

    public static final boolean a(byte[] byArray, int n8, byte[] byArray2, int n9, int n10) {
        l.f(byArray, "a");
        l.f(byArray2, "b");
        for (int i8 = 0; i8 < n10; ++i8) {
            if (byArray[i8 + n8] == byArray2[i8 + n9]) continue;
            return false;
        }
        return true;
    }

    public static final void b(long l8, long l9, long l10) {
        if ((l9 | l10) >= 0L && l9 <= l8 && l8 - l9 >= l10) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size=");
        stringBuilder.append(l8);
        stringBuilder.append(" offset=");
        stringBuilder.append(l9);
        stringBuilder.append(" byteCount=");
        stringBuilder.append(l10);
        throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
    }

    public static final int c() {
        return b;
    }

    public static final e.a d() {
        return a;
    }

    public static final int e(h h8, int n8) {
        l.f(h8, "<this>");
        if (n8 == b) {
            return h8.G();
        }
        return n8;
    }

    public static final int f(byte[] byArray, int n8) {
        l.f(byArray, "<this>");
        if (n8 == b) {
            return byArray.length;
        }
        return n8;
    }

    public static final e.a g(e.a a8) {
        l.f(a8, "unsafeCursor");
        e.a a9 = a8;
        if (a8 == a) {
            a9 = new e.a();
        }
        return a9;
    }

    public static final int h(int n8) {
        return (n8 & 0xFF) << 24 | ((0xFF000000 & n8) >>> 24 | (0xFF0000 & n8) >>> 8 | (0xFF00 & n8) << 8);
    }

    public static final short i(short s8) {
        return (short)((s8 & 0xFF) << 8 | (0xFF00 & s8) >>> 8);
    }

    public static final String j(byte by) {
        return ax.Ob.h.q(new char[]{ax.yc.b.f()[by >> 4 & 0xF], ax.yc.b.f()[by & 0xF]});
    }

    public static final String k(int n8) {
        int n9 = 0;
        if (n8 == 0) {
            return "0";
        }
        char c8 = ax.yc.b.f()[n8 >> 28 & 0xF];
        char c9 = ax.yc.b.f()[n8 >> 24 & 0xF];
        char c10 = ax.yc.b.f()[n8 >> 20 & 0xF];
        char c11 = ax.yc.b.f()[n8 >> 16 & 0xF];
        char c12 = ax.yc.b.f()[n8 >> 12 & 0xF];
        char c13 = ax.yc.b.f()[n8 >> 8 & 0xF];
        char c14 = ax.yc.b.f()[n8 >> 4 & 0xF];
        char c15 = ax.yc.b.f()[n8 & 0xF];
        char[] cArray = new char[]{c8, c9, c10, c11, c12, c13, c14, c15};
        for (n8 = n9; n8 < 8 && cArray[n8] == '0'; ++n8) {
        }
        return ax.Ob.h.r(cArray, n8, 8);
    }
}

