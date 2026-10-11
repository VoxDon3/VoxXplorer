package ax.i5;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
class k {
    private static int b = 11;
    private ByteBuffer a;

    k(String str, String str2) {
        byte[] bArr = new byte[b];
        Arrays.fill(bArr, (byte) 32);
        System.arraycopy(str.getBytes(Charset.forName("ASCII")), 0, bArr, 0, Math.min(str.length(), 8));
        System.arraycopy(str2.getBytes(Charset.forName("ASCII")), 0, bArr, 8, str2.length());
        if (bArr[0] == 229) {
            bArr[0] = 5;
        }
        this.a = ByteBuffer.wrap(bArr);
    }

    static k c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[b];
        byteBuffer.get(bArr);
        return new k(ByteBuffer.wrap(bArr));
    }

    byte a() {
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i = this.a.get(i2) + ((i & 1) == 1 ? 128 : 0) + ((i & 255) >> 1);
        }
        return (byte) (i & 255);
    }

    String b() {
        char[] cArr = new char[8];
        char[] cArr2 = new char[3];
        for (int i = 0; i < 8; i++) {
            cArr[i] = (char) (this.a.get(i) & 255);
        }
        if (this.a.get(0) == 5) {
            cArr[0] = 229;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            cArr2[i2] = (char) (this.a.get(i2 + 8) & 255);
        }
        String trim = new String(cArr).trim();
        String trim2 = new String(cArr2).trim();
        if (trim2.isEmpty()) {
            return trim;
        }
        return trim + "." + trim2;
    }

    void d(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a.array(), 0, b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return Arrays.equals(this.a.array(), ((k) obj).a.array());
        }
        return false;
    }

    public String toString() {
        return b();
    }

    private k(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }
}
