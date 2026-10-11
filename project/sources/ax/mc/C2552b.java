package ax.mc;

import ax.tc.C3146e;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: ax.mc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2552b {
    private C2553c a;
    private d b;

    public C2552b(C2553c c2553c) {
        this(c2553c, null);
    }

    private byte[] b(d dVar, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] bArr2 = bArr;
        int c = dVar.c();
        int e = e(i2, c);
        int i3 = i2 - ((e - 1) * c);
        byte[] bArr3 = new byte[e * c];
        int i4 = 0;
        for (int i5 = 1; i5 <= e; i5++) {
            c(bArr3, i4, dVar, bArr2, i, i5);
            i4 += c;
        }
        if (i3 >= c) {
            return bArr3;
        }
        byte[] bArr4 = new byte[i2];
        System.arraycopy(bArr3, 0, bArr4, 0, i2);
        return bArr4;
    }

    private void c(byte[] bArr, int i, d dVar, byte[] bArr2, int i2, int i3) {
        int c = dVar.c();
        byte[] bArr3 = new byte[c];
        byte[] bArr4 = new byte[bArr2.length + 4];
        System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        a(bArr4, bArr2.length, i3);
        for (int i4 = 0; i4 < i2; i4++) {
            bArr4 = dVar.b(bArr4);
            g(bArr3, bArr4);
        }
        System.arraycopy(bArr3, 0, bArr, i, c);
    }

    private void d(byte[] bArr) {
        if (this.b == null) {
            this.b = new C2551a(this.a.a());
        }
        this.b.a(bArr);
    }

    private int e(int i, int i2) {
        return (i / i2) + (i % i2 > 0 ? 1 : 0);
    }

    private void g(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    protected void a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 / Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        bArr[i + 1] = (byte) (i2 / 65536);
        bArr[i + 2] = (byte) (i2 / 256);
        bArr[i + 3] = (byte) i2;
    }

    public byte[] f(char[] cArr, int i, boolean z) {
        cArr.getClass();
        d(C3146e.a(cArr, z));
        if (i == 0) {
            i = this.b.c();
        }
        return b(this.b, this.a.c(), this.a.b(), i);
    }

    public C2552b(C2553c c2553c, d dVar) {
        this.a = c2553c;
        this.b = dVar;
    }
}
