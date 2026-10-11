package ax.Bc;

import ax.be.B;
import ax.be.C;
import ax.be.z;
import ax.zc.C3566a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
class k extends f {
    k() {
        super(z.class, Number.class);
    }

    private int g(e eVar) throws IllegalArgumentException {
        return (int) ax.Kc.f.c(eVar.d, 1, 4);
    }

    private z h(Object obj) throws IOException {
        if (obj instanceof z) {
            return (z) obj;
        }
        z zVar = new z();
        zVar.s(i(obj));
        return zVar;
    }

    private int i(Object obj) {
        return f.f(obj, 8388608);
    }

    @Override // ax.Bc.f
    InputStream b(String str, InputStream inputStream, long j, e eVar, byte[] bArr, int i) throws IOException {
        byte[] bArr2 = eVar.d;
        if (bArr2 == null) {
            throw new IOException("Missing LZMA properties");
        }
        if (bArr2.length < 1) {
            throw new IOException("LZMA properties too short");
        }
        byte b = bArr2[0];
        int g = g(eVar);
        if (g <= 2147483632) {
            int b2 = B.b(g, b);
            if (b2 <= i) {
                return new B(inputStream, j, b, g);
            }
            throw new C3566a(b2, i);
        }
        throw new IOException("Dictionary larger than 4GiB maximum size used in " + str);
    }

    @Override // ax.Bc.f
    OutputStream c(OutputStream outputStream, Object obj) throws IOException {
        return new ax.Kc.m(new C(outputStream, h(obj), false));
    }

    @Override // ax.Bc.f
    byte[] d(Object obj) throws IOException {
        z h = h(obj);
        byte o = (byte) ((((h.o() * 5) + h.k()) * 9) + h.j());
        int i = h.i();
        byte[] bArr = new byte[5];
        bArr[0] = o;
        ax.Kc.f.d(bArr, i, 1, 4);
        return bArr;
    }

    @Override // ax.Bc.f
    Object e(e eVar, InputStream inputStream) throws IOException {
        byte[] bArr = eVar.d;
        if (bArr == null) {
            throw new IOException("Missing LZMA properties");
        }
        if (bArr.length < 1) {
            throw new IOException("LZMA properties too short");
        }
        int i = bArr[0] & 255;
        int i2 = i / 45;
        int i3 = i - (i2 * 45);
        int i4 = i3 / 9;
        z zVar = new z();
        zVar.v(i2);
        zVar.t(i3 - (i4 * 9), i4);
        zVar.s(g(eVar));
        return zVar;
    }
}
