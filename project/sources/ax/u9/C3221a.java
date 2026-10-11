package ax.u9;

import ax.X8.b;
import ax.Z8.a;
import ax.c9.InterfaceC1848a;
import ax.c9.InterfaceC1850c;
import ax.c9.e;
import ax.t9.AbstractRunnableC3107a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ax.u9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3221a<D extends ax.X8.b<?>> extends AbstractRunnableC3107a<D> {
    private final InterfaceC1848a<D> g0;

    public C3221a(String str, InputStream inputStream, InterfaceC1848a<D> interfaceC1848a, InterfaceC1850c<D> interfaceC1850c) {
        super(str, inputStream, interfaceC1850c);
        this.g0 = interfaceC1848a;
    }

    private void e(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int read = this.c0.read(bArr, i, length);
            if (read == -1) {
                throw new e(new EOFException("EOF while reading packet"));
            }
            length -= read;
            i += read;
        }
    }

    private D f(int i) throws IOException, a.b {
        byte[] bArr = new byte[i];
        e(bArr);
        return this.g0.a(bArr);
    }

    private int g() throws IOException, a.b {
        byte[] bArr = new byte[4];
        e(bArr);
        a.c cVar = new a.c(bArr, ax.Z8.b.c);
        cVar.z();
        return cVar.L();
    }

    @Override // ax.t9.AbstractRunnableC3107a
    protected D a() throws e {
        try {
            return f(g());
        } catch (a.b e) {
            e = e;
            throw new e(e);
        } catch (e e2) {
            throw e2;
        } catch (IOException e3) {
            e = e3;
            throw new e(e);
        }
    }
}
