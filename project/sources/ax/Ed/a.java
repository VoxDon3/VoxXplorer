package ax.Ed;

import ax.Dd.f;
import ax.Dd.g;
import ax.vd.InterfaceC3307d;
import ax.vd.r;
import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public class a implements r {
    private final b a = new b();
    private boolean b;
    private f c;
    private g d;

    private static class b extends ByteArrayOutputStream {
        private b() {
        }

        synchronized byte[] a(f fVar) {
            byte[] bArr;
            bArr = new byte[64];
            fVar.c(0, null, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr, 0);
            reset();
            return bArr;
        }

        synchronized boolean b(g gVar, byte[] bArr) {
            if (64 != bArr.length) {
                reset();
                return false;
            }
            boolean V = ax.Jd.a.V(bArr, 0, gVar.b(), 0, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            reset();
            return V;
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            ax.Nd.a.h(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }
    }

    @Override // ax.vd.r
    public boolean a(byte[] bArr) {
        g gVar;
        if (this.b || (gVar = this.d) == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for verification");
        }
        return this.a.b(gVar, bArr);
    }

    @Override // ax.vd.r
    public void b(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }

    @Override // ax.vd.r
    public byte[] c() {
        f fVar;
        if (!this.b || (fVar = this.c) == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for signature generation.");
        }
        return this.a.a(fVar);
    }

    public void d() {
        this.a.reset();
    }

    @Override // ax.vd.r
    public void e(boolean z, InterfaceC3307d interfaceC3307d) {
        this.b = z;
        if (z) {
            this.c = (f) interfaceC3307d;
            this.d = null;
        } else {
            this.c = null;
            this.d = (g) interfaceC3307d;
        }
        d();
    }
}
