package ax.Bc;

import ax.be.y;
import ax.be.z;
import ax.zc.C3566a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
class j extends f {
    j() {
        super(z.class, Number.class);
    }

    private int g(Object obj) {
        return obj instanceof z ? ((z) obj).i() : j(obj);
    }

    private int h(e eVar) throws IOException {
        byte[] bArr = eVar.d;
        if (bArr == null) {
            throw new IOException("Missing LZMA2 properties");
        }
        if (bArr.length < 1) {
            throw new IOException("LZMA2 properties too short");
        }
        byte b = bArr[0];
        int i = b & 255;
        if ((b & 192) != 0) {
            throw new IOException("Unsupported LZMA2 property bits");
        }
        if (i > 40) {
            throw new IOException("Dictionary larger than 4GiB maximum size");
        }
        if (i == 40) {
            return -1;
        }
        return ((b & 1) | 2) << ((i / 2) + 11);
    }

    private z i(Object obj) throws IOException {
        if (obj instanceof z) {
            return (z) obj;
        }
        z zVar = new z();
        zVar.s(j(obj));
        return zVar;
    }

    private int j(Object obj) {
        return f.f(obj, 8388608);
    }

    @Override // ax.Bc.f
    InputStream b(String str, InputStream inputStream, long j, e eVar, byte[] bArr, int i) throws IOException {
        try {
            int h = h(eVar);
            int d = y.d(h);
            if (d <= i) {
                return new y(inputStream, h);
            }
            throw new C3566a(d, i);
        } catch (IllegalArgumentException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // ax.Bc.f
    OutputStream c(OutputStream outputStream, Object obj) throws IOException {
        return i(obj).d(new ax.be.t(outputStream));
    }

    @Override // ax.Bc.f
    byte[] d(Object obj) {
        return new byte[]{(byte) (((19 - Integer.numberOfLeadingZeros(g(obj))) * 2) + ((r3 >>> (30 - r0)) - 2))};
    }

    @Override // ax.Bc.f
    Object e(e eVar, InputStream inputStream) throws IOException {
        return Integer.valueOf(h(eVar));
    }
}
