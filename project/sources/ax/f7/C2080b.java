package ax.f7;

import ax.b7.C1722a;
import ax.i7.AbstractC2278b;
import ax.i7.C2275B;
import ax.i7.C2279c;
import ax.i7.C2281e;
import ax.i7.C2282f;
import ax.i7.g;
import ax.i7.i;
import ax.i7.m;
import ax.i7.p;
import ax.i7.q;
import ax.i7.r;
import ax.i7.s;
import ax.i7.w;
import ax.i7.y;
import ax.m7.C2529d;
import ax.m7.v;
import ax.m7.x;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: ax.f7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2080b {
    private final AbstractC2278b b;
    private final q c;
    private final w d;
    private i e;
    private long f;
    private boolean g;
    private p j;
    private InputStream k;
    private boolean l;
    private InterfaceC2081c m;
    private long o;
    private Byte q;
    private long r;
    private int s;
    private byte[] t;
    private boolean u;
    private EnumC0311b a = EnumC0311b.NOT_STARTED;
    private String h = "POST";
    private m i = new m();
    String n = "*";
    private int p = 10485760;
    x v = x.a;

    /* renamed from: ax.f7.b$a */
    private static class a {
        private final AbstractC2278b a;
        private final String b;

        a(AbstractC2278b abstractC2278b, String str) {
            this.a = abstractC2278b;
            this.b = str;
        }

        AbstractC2278b a() {
            return this.a;
        }

        String b() {
            return this.b;
        }
    }

    /* renamed from: ax.f7.b$b, reason: collision with other inner class name */
    public enum EnumC0311b {
        NOT_STARTED,
        INITIATION_STARTED,
        INITIATION_COMPLETE,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    public C2080b(AbstractC2278b abstractC2278b, w wVar, r rVar) {
        this.b = (AbstractC2278b) v.d(abstractC2278b);
        this.d = (w) v.d(wVar);
        this.c = rVar == null ? wVar.c() : wVar.d(rVar);
    }

    private a a() throws IOException {
        int i;
        int i2;
        AbstractC2278b c2279c;
        String str;
        int min = j() ? (int) Math.min(this.p, f() - this.o) : this.p;
        if (j()) {
            this.k.mark(min);
            long j = min;
            c2279c = new y(this.b.a(), C2529d.b(this.k, j)).j(true).i(j).h(false);
            this.n = String.valueOf(f());
        } else {
            byte[] bArr = this.t;
            if (bArr == null) {
                Byte b = this.q;
                i2 = b == null ? min + 1 : min;
                byte[] bArr2 = new byte[min + 1];
                this.t = bArr2;
                if (b != null) {
                    bArr2[0] = b.byteValue();
                }
                i = 0;
            } else {
                i = (int) (this.r - this.o);
                System.arraycopy(bArr, this.s - i, bArr, 0, i);
                Byte b2 = this.q;
                if (b2 != null) {
                    this.t[i] = b2.byteValue();
                }
                i2 = min - i;
            }
            int c = C2529d.c(this.k, this.t, (min + 1) - i2, i2);
            if (c < i2) {
                int max = i + Math.max(0, c);
                if (this.q != null) {
                    max++;
                    this.q = null;
                }
                min = max;
                if (this.n.equals("*")) {
                    this.n = String.valueOf(this.o + min);
                }
            } else {
                this.q = Byte.valueOf(this.t[min]);
            }
            c2279c = new C2279c(this.b.a(), this.t, 0, min);
            this.r = this.o + min;
        }
        this.s = min;
        if (min == 0) {
            str = "bytes */" + this.n;
        } else {
            str = "bytes " + this.o + "-" + ((this.o + min) - 1) + "/" + this.n;
        }
        return new a(c2279c, str);
    }

    private s b(g gVar) throws IOException {
        t(EnumC0311b.MEDIA_IN_PROGRESS);
        i iVar = this.b;
        if (this.e != null) {
            iVar = new C2275B().j(Arrays.asList(this.e, this.b));
            gVar.put("uploadType", "multipart");
        } else {
            gVar.put("uploadType", "media");
        }
        p c = this.c.c(this.h, gVar, iVar);
        c.f().putAll(this.i);
        s c2 = c(c);
        try {
            if (j()) {
                this.o = f();
            }
            t(EnumC0311b.MEDIA_COMPLETE);
            return c2;
        } catch (Throwable th) {
            c2.a();
            throw th;
        }
    }

    private s c(p pVar) throws IOException {
        if (!this.u && !(pVar.c() instanceof C2281e)) {
            pVar.u(new C2282f());
        }
        return d(pVar);
    }

    private s d(p pVar) throws IOException {
        new C1722a().a(pVar);
        pVar.C(false);
        return pVar.b();
    }

    private s e(g gVar) throws IOException {
        t(EnumC0311b.INITIATION_STARTED);
        gVar.put("uploadType", "resumable");
        i iVar = this.e;
        if (iVar == null) {
            iVar = new C2281e();
        }
        p c = this.c.c(this.h, gVar, iVar);
        this.i.f("X-Upload-Content-Type", this.b.a());
        if (j()) {
            this.i.f("X-Upload-Content-Length", Long.valueOf(f()));
        }
        c.f().putAll(this.i);
        s c2 = c(c);
        try {
            t(EnumC0311b.INITIATION_COMPLETE);
            return c2;
        } catch (Throwable th) {
            c2.a();
            throw th;
        }
    }

    private long f() throws IOException {
        if (!this.g) {
            this.f = this.b.getLength();
            this.g = true;
        }
        return this.f;
    }

    private long g(String str) {
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1)) + 1;
    }

    private boolean j() throws IOException {
        return f() >= 0;
    }

    private s k(g gVar) throws IOException {
        s e = e(gVar);
        if (!e.l()) {
            return e;
        }
        try {
            g gVar2 = new g(e.f().r());
            e.a();
            InputStream e2 = this.b.e();
            this.k = e2;
            if (!e2.markSupported() && j()) {
                this.k = new BufferedInputStream(this.k);
            }
            while (true) {
                a a2 = a();
                p b = this.c.b(gVar2, null);
                this.j = b;
                b.t(a2.a());
                this.j.f().H(a2.b());
                new C2082d(this, this.j);
                s d = j() ? d(this.j) : c(this.j);
                try {
                    if (d.l()) {
                        this.o = f();
                        if (this.b.d()) {
                            this.k.close();
                        }
                        t(EnumC0311b.MEDIA_COMPLETE);
                        return d;
                    }
                    if (d.h() != 308) {
                        if (this.b.d()) {
                            this.k.close();
                        }
                        return d;
                    }
                    String r = d.f().r();
                    if (r != null) {
                        gVar2 = new g(r);
                    }
                    long g = g(d.f().s());
                    long j = g - this.o;
                    v.g(j >= 0 && j <= ((long) this.s));
                    long j2 = this.s - j;
                    if (j()) {
                        if (j2 > 0) {
                            this.k.reset();
                            v.g(j == this.k.skip(j));
                        }
                    } else if (j2 == 0) {
                        this.t = null;
                    }
                    this.o = g;
                    t(EnumC0311b.MEDIA_IN_PROGRESS);
                    d.a();
                } catch (Throwable th) {
                    d.a();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            e.a();
            throw th2;
        }
    }

    private void t(EnumC0311b enumC0311b) throws IOException {
        this.a = enumC0311b;
        InterfaceC2081c interfaceC2081c = this.m;
        if (interfaceC2081c != null) {
            interfaceC2081c.a(this);
        }
    }

    public long h() {
        return this.o;
    }

    public EnumC0311b i() {
        return this.a;
    }

    void l() throws IOException {
        v.e(this.j, "The current request should not be null");
        this.j.t(new C2281e());
        this.j.f().H("bytes */" + this.n);
    }

    public C2080b m(int i) {
        v.b(i > 0 && i % 262144 == 0, "chunkSize must be a positive multiple of 262144.");
        this.p = i;
        return this;
    }

    public C2080b n(boolean z) {
        this.l = z;
        return this;
    }

    public C2080b o(boolean z) {
        this.u = z;
        return this;
    }

    public C2080b p(m mVar) {
        this.i = mVar;
        return this;
    }

    public C2080b q(String str) {
        v.a(str.equals("POST") || str.equals("PUT") || str.equals("PATCH"));
        this.h = str;
        return this;
    }

    public C2080b r(i iVar) {
        this.e = iVar;
        return this;
    }

    public C2080b s(InterfaceC2081c interfaceC2081c) {
        this.m = interfaceC2081c;
        return this;
    }

    public s u(g gVar) throws IOException {
        v.a(this.a == EnumC0311b.NOT_STARTED);
        return this.l ? b(gVar) : k(gVar);
    }
}
