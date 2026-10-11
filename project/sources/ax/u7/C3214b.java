package ax.u7;

import ax.q7.n;

/* renamed from: ax.u7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3214b {
    public static char a(long j) {
        char c = (char) j;
        n.i(((long) c) == j, "Out of range: %s", j);
        return c;
    }

    public static boolean b(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public static char c(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }
}
