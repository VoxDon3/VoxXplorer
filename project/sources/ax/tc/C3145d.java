package ax.tc;

import ax.oc.C2743a;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: ax.tc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3145d {
    private final byte[] a = new byte[2];
    private final byte[] b = new byte[4];
    private final byte[] c = new byte[8];

    private void a(InputStream inputStream, byte[] bArr, int i) throws IOException {
        if (C3146e.f(inputStream, bArr, 0, i) != i) {
            throw new C2743a("Could not fill buffer");
        }
    }

    private void j(byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
    }

    public int b(InputStream inputStream) throws IOException {
        a(inputStream, this.b, 4);
        return c(this.b);
    }

    public int c(byte[] bArr) {
        return d(bArr, 0);
    }

    public int d(byte[] bArr, int i) {
        return ((((bArr[i + 3] & 255) << 8) | (bArr[i + 2] & 255)) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public long e(InputStream inputStream) throws IOException {
        byte[] bArr = this.c;
        a(inputStream, bArr, bArr.length);
        return g(this.c, 0);
    }

    public long f(InputStream inputStream, int i) throws IOException {
        j(this.c);
        a(inputStream, this.c, i);
        return g(this.c, 0);
    }

    public long g(byte[] bArr, int i) {
        if (bArr.length - i < 8) {
            j(this.c);
        }
        System.arraycopy(bArr, i, this.c, 0, Math.min(bArr.length - i, 8));
        byte[] bArr2 = this.c;
        return (bArr2[0] & 255) | ((((((((((((((bArr2[7] & 255) << 8) | (bArr2[6] & 255)) << 8) | (bArr2[5] & 255)) << 8) | (bArr2[4] & 255)) << 8) | (bArr2[3] & 255)) << 8) | (bArr2[2] & 255)) << 8) | (bArr2[1] & 255)) << 8);
    }

    public int h(InputStream inputStream) throws IOException {
        byte[] bArr = this.a;
        a(inputStream, bArr, bArr.length);
        return i(this.a, 0);
    }

    public int i(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }
}
