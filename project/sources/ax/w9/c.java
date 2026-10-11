package ax.w9;

import ax.Z8.a;
import ax.y8.C3512a;
import ax.y8.C3513b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class c extends f {
    private BigInteger c;
    private ax.E8.e d;
    private byte[] e;
    private byte[] f;

    public c() {
        super(1, "NegTokenTarg");
    }

    private c f(ax.Z8.a<?> aVar) throws e {
        try {
            C3512a c3512a = new C3512a(new ax.B8.a(), aVar.b());
            try {
                a(c3512a.g());
                c3512a.close();
                return this;
            } finally {
            }
        } catch (IOException e) {
            throw new e("Could not read NegTokenTarg from buffer", e);
        }
    }

    private void h(ax.C8.b<?> bVar) throws e {
        if (bVar instanceof ax.F8.b) {
            this.f = ((ax.F8.b) bVar).g();
            return;
        }
        throw new e("Expected the responseToken (OCTET_STRING) contents, not: " + bVar);
    }

    private void i(ax.C8.b<?> bVar) throws e {
        if (bVar instanceof ax.E8.b) {
            this.c = ((ax.E8.b) bVar).g();
            return;
        }
        throw new e("Expected the negResult (ENUMERATED) contents, not: " + this.d);
    }

    private void j(ax.C8.b<?> bVar) throws e {
        if (bVar instanceof ax.F8.b) {
            this.e = ((ax.F8.b) bVar).g();
            return;
        }
        throw new e("Expected the responseToken (OCTET_STRING) contents, not: " + bVar);
    }

    private void k(ax.C8.b<?> bVar) throws e {
        if (bVar instanceof ax.E8.e) {
            this.d = (ax.E8.e) bVar;
            return;
        }
        throw new e("Expected the supportedMech (OBJECT IDENTIFIER) contents, not: " + bVar);
    }

    @Override // ax.w9.f
    protected void b(ax.D8.c cVar) throws e {
        int r = cVar.r();
        if (r == 0) {
            i(cVar.p());
            return;
        }
        if (r == 1) {
            k(cVar.p());
            return;
        }
        if (r == 2) {
            j(cVar.p());
            return;
        }
        if (r == 3) {
            h(cVar.p());
            return;
        }
        throw new e("Unknown Object Tag " + cVar.r() + " encountered.");
    }

    @Override // ax.w9.f
    public void c(ax.Z8.a<?> aVar) throws e {
        ArrayList arrayList = new ArrayList();
        try {
            if (this.c != null) {
                arrayList.add(new ax.D8.c(ax.C8.c.d(0).c(), new ax.E8.b(this.c)));
            }
            if (this.d != null) {
                arrayList.add(new ax.D8.c(ax.C8.c.d(1).c(), this.d));
            }
            byte[] bArr = this.e;
            if (bArr != null && bArr.length > 0) {
                arrayList.add(new ax.D8.c(ax.C8.c.d(2).c(), new ax.F8.b(this.e)));
            }
            byte[] bArr2 = this.f;
            if (bArr2 != null && bArr2.length > 0) {
                arrayList.add(new ax.D8.c(ax.C8.c.d(3).c(), new ax.F8.b(this.f)));
            }
            d(aVar, new ax.D8.a(arrayList));
        } catch (IOException e) {
            throw new e("Could not write NegTokenTarg to buffer", e);
        }
    }

    @Override // ax.w9.f
    protected void d(ax.Z8.a<?> aVar, ax.C8.b<?> bVar) throws IOException {
        ax.D8.c cVar = new ax.D8.c(ax.C8.c.d(1).c(), (ax.C8.b) bVar, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C3513b c3513b = new C3513b(new ax.B8.b(), byteArrayOutputStream);
        try {
            c3513b.c(cVar);
            c3513b.close();
            aVar.o(byteArrayOutputStream.toByteArray());
        } catch (Throwable th) {
            try {
                c3513b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public byte[] e() {
        return this.e;
    }

    public c g(byte[] bArr) throws e {
        return f(new a.c(bArr, ax.Z8.b.b));
    }

    public void l(byte[] bArr) {
        this.f = bArr;
    }

    public void m(byte[] bArr) {
        this.e = bArr;
    }
}
