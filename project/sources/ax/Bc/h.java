package ax.Bc;

import ax.be.C1746n;
import ax.be.L;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
class h extends f {
    h() {
        super(Number.class);
    }

    private int g(e eVar) {
        byte[] bArr = eVar.d;
        if (bArr == null || bArr.length == 0) {
            return 1;
        }
        return (bArr[0] & 255) + 1;
    }

    @Override // ax.Bc.f
    InputStream b(String str, InputStream inputStream, long j, e eVar, byte[] bArr, int i) throws IOException {
        return new C1746n(g(eVar)).b(inputStream);
    }

    @Override // ax.Bc.f
    OutputStream c(OutputStream outputStream, Object obj) throws IOException {
        try {
            return new C1746n(f.f(obj, 1)).d(new ax.be.t(outputStream));
        } catch (L e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // ax.Bc.f
    byte[] d(Object obj) {
        return new byte[]{(byte) (f.f(obj, 1) - 1)};
    }

    @Override // ax.Bc.f
    Object e(e eVar, InputStream inputStream) {
        return Integer.valueOf(g(eVar));
    }
}
