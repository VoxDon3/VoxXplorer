package ax.b6;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: ax.b6.m4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1616m4 {
    static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        P3.c(bArr, 0, bArr.length, false);
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    static <T> T e(T t) {
        t.getClass();
        return t;
    }

    static <T> T f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static boolean g(U4 u4) {
        boolean z = u4 instanceof AbstractC1662s3;
        return false;
    }
}
