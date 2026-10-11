package ax.Ed;

import ax.Dd.h;
import ax.Dd.i;
import ax.vd.InterfaceC3307d;
import ax.vd.r;
import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public class b implements r {
    private final C0079b a = new C0079b();
    private final byte[] b;
    private boolean c;
    private h d;
    private i e;

    /* renamed from: ax.Ed.b$b, reason: collision with other inner class name */
    private static class C0079b extends ByteArrayOutputStream {
        private C0079b() {
        }

        synchronized byte[] a(h hVar, byte[] bArr) {
            byte[] bArr2;
            bArr2 = new byte[114];
            hVar.c(0, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr2, 0);
            reset();
            return bArr2;
        }

        synchronized boolean b(i iVar, byte[] bArr, byte[] bArr2) {
            if (114 != bArr2.length) {
                reset();
                return false;
            }
            boolean Q = ax.Jd.b.Q(bArr2, 0, iVar.b(), 0, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            reset();
            return Q;
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            ax.Nd.a.h(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }
    }

    public b(byte[] bArr) {
        this.b = ax.Nd.a.d(bArr);
    }

    @Override // ax.vd.r
    public boolean a(byte[] bArr) {
        i iVar;
        if (this.c || (iVar = this.e) == null) {
            throw new IllegalStateException("Ed448Signer not initialised for verification");
        }
        return this.a.b(iVar, this.b, bArr);
    }

    @Override // ax.vd.r
    public void b(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }

    @Override // ax.vd.r
    public byte[] c() {
        h hVar;
        if (!this.c || (hVar = this.d) == null) {
            throw new IllegalStateException("Ed448Signer not initialised for signature generation.");
        }
        return this.a.a(hVar, this.b);
    }

    public void d() {
        this.a.reset();
    }

    @Override // ax.vd.r
    public void e(boolean z, InterfaceC3307d interfaceC3307d) {
        this.c = z;
        if (z) {
            this.d = (h) interfaceC3307d;
            this.e = null;
        } else {
            this.d = null;
            this.e = (i) interfaceC3307d;
        }
        d();
    }
}
