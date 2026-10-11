package ax.W5;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class O0 {
    static final Charset a = Charset.forName("US-ASCII");
    static final Charset b = Charset.forName("UTF-8");
    static final Charset c = Charset.forName("ISO-8859-1");
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final C1081x0 f;

    static {
        byte[] bArr = new byte[0];
        d = bArr;
        e = ByteBuffer.wrap(bArr);
        int i = C1081x0.a;
        C1075v0 c1075v0 = new C1075v0(bArr, 0, 0, false, null);
        try {
            c1075v0.c(0);
            f = c1075v0;
        } catch (P0 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    static int b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static String d(byte[] bArr) {
        return new String(bArr, b);
    }
}
