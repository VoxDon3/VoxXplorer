package ax.Dc;

import ax.Dc.C0674i;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class I extends ZipEntry implements ax.Ac.a {
    static final I[] v0 = new I[0];
    private long c0;
    private int d0;
    private int e0;
    private int f0;
    private int g0;
    private int h0;
    private long i0;
    private int j0;
    private N[] k0;
    private C0684t l0;
    private String m0;
    private byte[] n0;
    private C0675j o0;
    private long p0;
    private int q;
    private long q0;
    private boolean r0;
    private d s0;
    private b t0;
    private long u0;

    public enum b {
        COMMENT,
        UNICODE_EXTRA_FIELD
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class c implements InterfaceC0673h {
        public static final c c0;
        public static final c d0;
        public static final c e0;
        public static final c f0;
        public static final c g0;
        private static final /* synthetic */ c[] h0;
        private final C0674i.a q;

        enum a extends c {
            a(String str, int i, C0674i.a aVar) {
                super(str, i, aVar);
            }

            @Override // ax.Dc.I.c, ax.Dc.InterfaceC0673h
            public N j(N n, byte[] bArr, int i, int i2, boolean z) {
                return c.n(n, bArr, i, i2, z);
            }
        }

        enum b extends c {
            b(String str, int i, C0674i.a aVar) {
                super(str, i, aVar);
            }

            @Override // ax.Dc.I.c, ax.Dc.InterfaceC0673h
            public N j(N n, byte[] bArr, int i, int i2, boolean z) {
                return c.n(n, bArr, i, i2, z);
            }
        }

        static {
            C0674i.a aVar = C0674i.a.e0;
            a aVar2 = new a("BEST_EFFORT", 0, aVar);
            c0 = aVar2;
            c cVar = new c("STRICT_FOR_KNOW_EXTRA_FIELDS", 1, aVar);
            d0 = cVar;
            C0674i.a aVar3 = C0674i.a.d0;
            b bVar = new b("ONLY_PARSEABLE_LENIENT", 2, aVar3);
            e0 = bVar;
            c cVar2 = new c("ONLY_PARSEABLE_STRICT", 3, aVar3);
            f0 = cVar2;
            c cVar3 = new c("DRACONIC", 4, C0674i.a.c0);
            g0 = cVar3;
            h0 = new c[]{aVar2, cVar, bVar, cVar2, cVar3};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static N n(N n, byte[] bArr, int i, int i2, boolean z) {
            try {
                return C0674i.c(n, bArr, i, i2, z);
            } catch (ZipException unused) {
                C0685u c0685u = new C0685u();
                c0685u.e(n.b());
                if (z) {
                    c0685u.g(Arrays.copyOfRange(bArr, i, i2 + i));
                } else {
                    c0685u.a(Arrays.copyOfRange(bArr, i, i2 + i));
                }
                return c0685u;
            }
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) h0.clone();
        }

        @Override // ax.Dc.InterfaceC0683s
        public N d(byte[] bArr, int i, int i2, boolean z, int i3) throws ZipException {
            return this.q.d(bArr, i, i2, z, i3);
        }

        @Override // ax.Dc.InterfaceC0673h
        public N h(W w) throws ZipException, InstantiationException, IllegalAccessException {
            return C0674i.a(w);
        }

        @Override // ax.Dc.InterfaceC0673h
        public N j(N n, byte[] bArr, int i, int i2, boolean z) throws ZipException {
            return C0674i.c(n, bArr, i, i2, z);
        }

        private c(String str, int i, C0674i.a aVar) {
            this.q = aVar;
        }
    }

    public enum d {
        NAME,
        NAME_WITH_EFS_FLAG,
        UNICODE_EXTRA_FIELD
    }

    public I(String str) {
        super(str);
        this.q = -1;
        this.c0 = -1L;
        this.g0 = 0;
        this.o0 = new C0675j();
        this.p0 = -1L;
        this.q0 = -1L;
        this.s0 = d.NAME;
        this.t0 = b.COMMENT;
        L(str);
    }

    private N[] f(N[] nArr, int i) {
        N[] nArr2 = new N[i];
        System.arraycopy(nArr, 0, nArr2, 0, Math.min(nArr.length, i));
        return nArr2;
    }

    private N[] i() {
        N[] nArr = this.k0;
        return nArr == null ? x() : this.l0 != null ? v() : nArr;
    }

    private N[] v() {
        N[] nArr = this.k0;
        N[] f = f(nArr, nArr.length + 1);
        f[this.k0.length] = this.l0;
        return f;
    }

    private N[] x() {
        C0684t c0684t = this.l0;
        return c0684t == null ? C0674i.b : new N[]{c0684t};
    }

    private void y(N[] nArr, boolean z) {
        if (this.k0 == null) {
            H(nArr);
            return;
        }
        for (N n : nArr) {
            N n2 = n instanceof C0684t ? this.l0 : n(n.b());
            if (n2 == null) {
                d(n);
            } else {
                byte[] f = z ? n.f() : n.h();
                if (z) {
                    try {
                        n2.d(f, 0, f.length);
                    } catch (ZipException unused) {
                        C0685u c0685u = new C0685u();
                        c0685u.e(n2.b());
                        if (z) {
                            c0685u.g(f);
                            c0685u.a(n2.h());
                        } else {
                            c0685u.g(n2.f());
                            c0685u.a(f);
                        }
                        z(n2.b());
                        d(c0685u);
                    }
                } else {
                    n2.j(f, 0, f.length);
                }
            }
        }
        G();
    }

    public void B(byte[] bArr) {
        try {
            y(C0674i.f(bArr, false, c.c0), false);
        } catch (ZipException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public void C(b bVar) {
        this.t0 = bVar;
    }

    protected void D(long j) {
        this.q0 = j;
    }

    public void E(long j) {
        this.u0 = j;
    }

    public void F(long j) {
        this.i0 = j;
    }

    protected void G() {
        super.setExtra(C0674i.e(i()));
    }

    public void H(N[] nArr) {
        this.l0 = null;
        ArrayList arrayList = new ArrayList();
        if (nArr != null) {
            for (N n : nArr) {
                if (n instanceof C0684t) {
                    this.l0 = (C0684t) n;
                } else {
                    arrayList.add(n);
                }
            }
        }
        this.k0 = (N[]) arrayList.toArray(C0674i.b);
        G();
    }

    public void I(C0675j c0675j) {
        this.o0 = c0675j;
    }

    public void J(int i) {
        this.d0 = i;
    }

    protected void K(long j) {
        this.p0 = j;
    }

    protected void L(String str) {
        if (str != null && w() == 0 && !str.contains("/")) {
            str = str.replace('\\', '/');
        }
        this.m0 = str;
    }

    protected void M(String str, byte[] bArr) {
        L(str);
        this.n0 = bArr;
    }

    public void N(d dVar) {
        this.s0 = dVar;
    }

    protected void O(int i) {
        this.g0 = i;
    }

    public void P(int i) {
        this.h0 = i;
    }

    protected void Q(boolean z) {
        this.r0 = z;
    }

    public void R(int i) {
        this.f0 = i;
    }

    public void S(int i) {
        this.e0 = i;
    }

    @Override // ax.Ac.a
    public Date b() {
        return new Date(getTime());
    }

    public void c(N n) {
        if (n instanceof C0684t) {
            this.l0 = (C0684t) n;
        } else {
            if (n(n.b()) != null) {
                z(n.b());
            }
            N[] nArr = this.k0;
            N[] nArr2 = new N[nArr != null ? nArr.length + 1 : 1];
            this.k0 = nArr2;
            nArr2[0] = n;
            if (nArr != null) {
                System.arraycopy(nArr, 0, nArr2, 1, nArr2.length - 1);
            }
        }
        G();
    }

    @Override // java.util.zip.ZipEntry
    public Object clone() {
        I i = (I) super.clone();
        i.J(r());
        i.F(m());
        i.H(i());
        return i;
    }

    public void d(N n) {
        if (n instanceof C0684t) {
            this.l0 = (C0684t) n;
        } else if (this.k0 == null) {
            this.k0 = new N[]{n};
        } else {
            if (n(n.b()) != null) {
                z(n.b());
            }
            N[] nArr = this.k0;
            N[] f = f(nArr, nArr.length + 1);
            f[f.length - 1] = n;
            this.k0 = f;
        }
        G();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            I i = (I) obj;
            if (!Objects.equals(getName(), i.getName())) {
                return false;
            }
            String comment = getComment();
            String comment2 = i.getComment();
            if (comment == null) {
                comment = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (comment2 == null) {
                comment2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (getTime() == i.getTime() && comment.equals(comment2) && r() == i.r() && w() == i.w() && m() == i.m() && getMethod() == i.getMethod() && getSize() == i.getSize() && getCrc() == i.getCrc() && getCompressedSize() == i.getCompressedSize() && Arrays.equals(j(), i.j()) && Arrays.equals(s(), i.s()) && this.p0 == i.p0 && this.q0 == i.q0 && this.o0.equals(i.o0)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.zip.ZipEntry
    public int getMethod() {
        return this.q;
    }

    @Override // java.util.zip.ZipEntry, ax.Ac.a
    public String getName() {
        String str = this.m0;
        return str == null ? super.getName() : str;
    }

    @Override // java.util.zip.ZipEntry, ax.Ac.a
    public long getSize() {
        return this.c0;
    }

    protected int h() {
        return this.j0;
    }

    @Override // java.util.zip.ZipEntry
    public int hashCode() {
        String name = getName();
        if (name == null) {
            name = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return name.hashCode();
    }

    @Override // java.util.zip.ZipEntry, ax.Ac.a
    public boolean isDirectory() {
        String name = getName();
        return name != null && name.endsWith("/");
    }

    public byte[] j() {
        return C0674i.d(i());
    }

    public long k() {
        return this.q0;
    }

    public long l() {
        return this.u0;
    }

    public long m() {
        return this.i0;
    }

    public N n(W w) {
        N[] nArr = this.k0;
        if (nArr == null) {
            return null;
        }
        for (N n : nArr) {
            if (w.equals(n.b())) {
                return n;
            }
        }
        return null;
    }

    public C0675j o() {
        return this.o0;
    }

    public int r() {
        return this.d0;
    }

    public byte[] s() {
        byte[] extra = getExtra();
        return extra != null ? extra : ax.Kc.f.a;
    }

    @Override // java.util.zip.ZipEntry
    public void setExtra(byte[] bArr) throws RuntimeException {
        try {
            y(C0674i.f(bArr, true, c.c0), true);
        } catch (ZipException e) {
            throw new RuntimeException("Error parsing extra fields for entry: " + getName() + " - " + e.getMessage(), e);
        }
    }

    @Override // java.util.zip.ZipEntry
    public void setMethod(int i) {
        if (i >= 0) {
            this.q = i;
            return;
        }
        throw new IllegalArgumentException("ZIP compression method can not be negative: " + i);
    }

    @Override // java.util.zip.ZipEntry
    public void setSize(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Invalid entry size");
        }
        this.c0 = j;
    }

    protected long t() {
        return this.p0;
    }

    public int w() {
        return this.g0;
    }

    public void z(W w) {
        if (this.k0 == null) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        for (N n : this.k0) {
            if (!w.equals(n.b())) {
                arrayList.add(n);
            }
        }
        if (this.k0.length == arrayList.size()) {
            throw new NoSuchElementException();
        }
        this.k0 = (N[]) arrayList.toArray(C0674i.b);
        G();
    }

    protected I() {
        this(HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
