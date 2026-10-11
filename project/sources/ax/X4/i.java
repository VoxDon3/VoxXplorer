package ax.X4;

import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
class i {
    public static double a(double d, double d2, double d3) {
        return (d * d2) + d3;
    }

    protected static boolean b(char c) {
        return ((char) (c + 65488)) < '\n';
    }

    public static boolean c(CharSequence charSequence, int i) {
        boolean z = true;
        for (int i2 = 0; i2 < 8; i2++) {
            z &= b(charSequence.charAt(i2 + i));
        }
        return z;
    }

    public static boolean d(CharSequence charSequence, int i) {
        boolean z = true;
        for (int i2 = 0; i2 < 8; i2++) {
            z &= '0' == charSequence.charAt(i2 + i);
        }
        return z;
    }

    public static int e(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int f(CharSequence charSequence, int i) {
        return g(charSequence.charAt(i) | (charSequence.charAt(i + 1) << 16) | (charSequence.charAt(i + 2) << 32) | (charSequence.charAt(i + 3) << 48), (charSequence.charAt(i + 7) << 48) | charSequence.charAt(i + 4) | (charSequence.charAt(i + 5) << 16) | (charSequence.charAt(i + 6) << 32));
    }

    public static int g(long j, long j2) {
        long j3 = j - 13511005043687472L;
        long j4 = j2 - 13511005043687472L;
        if ((((j + 19703549022044230L) | j3 | (j2 + 19703549022044230L) | j4) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return ((int) ((j4 * 281475406208040961L) >>> 48)) + (((int) ((j3 * 281475406208040961L) >>> 48)) * 10000);
    }

    public static long h(CharSequence charSequence, int i) {
        return i((charSequence.charAt(i) << 48) | (charSequence.charAt(i + 1) << 32) | (charSequence.charAt(i + 2) << 16) | charSequence.charAt(i + 3), charSequence.charAt(i + 7) | (charSequence.charAt(i + 4) << 48) | (charSequence.charAt(i + 5) << 32) | (charSequence.charAt(i + 6) << 16));
    }

    public static long i(long j, long j2) {
        return (l(j) << 16) | l(j2);
    }

    public static int j(CharSequence charSequence, int i) {
        return k((charSequence.charAt(i + 3) << 48) | charSequence.charAt(i) | (charSequence.charAt(i + 1) << 16) | (charSequence.charAt(i + 2) << 32));
    }

    public static int k(long j) {
        long j2 = j - 13511005043687472L;
        if ((((j + 19703549022044230L) | j2) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return (int) ((j2 * 281475406208040961L) >>> 48);
    }

    public static long l(long j) {
        long j2 = j - 13511005043687472L;
        long j3 = (j - (-9207186978729525190L)) & (-9223231297218904064L);
        if (j3 != ((j - (-9196209287131529119L)) & (-9223231297218904064L) & ((9223231297218904063L ^ j2) + 15481359945891895L))) {
            return -1L;
        }
        long j4 = (j3 >>> 15) * WebSocketProtocol.PAYLOAD_SHORT_MAX;
        long j5 = ((~j4) & j2) | (j2 - (j4 & 10977691597996071L));
        long j6 = j5 | (j5 >>> 12);
        return (j6 | (j6 >>> 24)) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    public static int m(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        boolean z = true;
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            z &= b(charAt);
            i3 = ((i3 * 10) + charAt) - 48;
            i++;
        }
        if (z) {
            return i3;
        }
        return -1;
    }

    public static void n(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >>> 24);
        bArr[i + 1] = (byte) (i2 >>> 16);
        bArr[i + 2] = (byte) (i2 >>> 8);
        bArr[i + 3] = (byte) i2;
    }
}
