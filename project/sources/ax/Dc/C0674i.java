package ax.Dc;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.ZipException;

/* renamed from: ax.Dc.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0674i {
    private static final Map<W, Class<?>> a = new ConcurrentHashMap();
    static final N[] b;

    /* renamed from: ax.Dc.i$a */
    public static final class a implements InterfaceC0683s {
        public static final a c0 = new a(0);
        public static final a d0 = new a(1);
        public static final a e0 = new a(2);
        private final int q;

        private a(int i) {
            this.q = i;
        }

        @Override // ax.Dc.InterfaceC0683s
        public N d(byte[] bArr, int i, int i2, boolean z, int i3) throws ZipException {
            int i4 = this.q;
            if (i4 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bad extra field starting at ");
                sb.append(i);
                sb.append(".  Block length of ");
                sb.append(i3);
                sb.append(" bytes exceeds remaining data of ");
                sb.append(i2 - 4);
                sb.append(" bytes.");
                throw new ZipException(sb.toString());
            }
            if (i4 == 1) {
                return null;
            }
            if (i4 != 2) {
                throw new ZipException("Unknown UnparseableExtraField key: " + this.q);
            }
            C0684t c0684t = new C0684t();
            if (z) {
                c0684t.d(bArr, i, i2);
                return c0684t;
            }
            c0684t.j(bArr, i, i2);
            return c0684t;
        }
    }

    static {
        g(C0667b.class);
        g(D.class);
        g(E.class);
        g(C0677l.class);
        g(r.class);
        g(C0682q.class);
        g(F.class);
        g(C0688x.class);
        g(C0689y.class);
        g(C0690z.class);
        g(A.class);
        g(B.class);
        g(C.class);
        g(C0680o.class);
        b = new N[0];
    }

    public static N a(W w) throws InstantiationException, IllegalAccessException {
        N b2 = b(w);
        if (b2 != null) {
            return b2;
        }
        C0685u c0685u = new C0685u();
        c0685u.e(w);
        return c0685u;
    }

    public static N b(W w) throws InstantiationException, IllegalAccessException {
        Class<?> cls = a.get(w);
        if (cls != null) {
            return (N) cls.newInstance();
        }
        return null;
    }

    public static N c(N n, byte[] bArr, int i, int i2, boolean z) throws ZipException {
        try {
            if (z) {
                n.d(bArr, i, i2);
                return n;
            }
            n.j(bArr, i, i2);
            return n;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ((ZipException) new ZipException("Failed to parse corrupt ZIP extra field of type " + Integer.toHexString(n.b().d())).initCause(e));
        }
    }

    public static byte[] d(N[] nArr) {
        byte[] h;
        int length = nArr.length;
        boolean z = length > 0 && (nArr[length + (-1)] instanceof C0684t);
        int i = z ? length - 1 : length;
        int i2 = i * 4;
        for (N n : nArr) {
            i2 += n.i().d();
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            System.arraycopy(nArr[i4].b().b(), 0, bArr, i3, 2);
            System.arraycopy(nArr[i4].i().b(), 0, bArr, i3 + 2, 2);
            i3 += 4;
            byte[] h2 = nArr[i4].h();
            if (h2 != null) {
                System.arraycopy(h2, 0, bArr, i3, h2.length);
                i3 += h2.length;
            }
        }
        if (z && (h = nArr[length - 1].h()) != null) {
            System.arraycopy(h, 0, bArr, i3, h.length);
        }
        return bArr;
    }

    public static byte[] e(N[] nArr) {
        byte[] f;
        int length = nArr.length;
        boolean z = length > 0 && (nArr[length + (-1)] instanceof C0684t);
        int i = z ? length - 1 : length;
        int i2 = i * 4;
        for (N n : nArr) {
            i2 += n.c().d();
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            System.arraycopy(nArr[i4].b().b(), 0, bArr, i3, 2);
            System.arraycopy(nArr[i4].c().b(), 0, bArr, i3 + 2, 2);
            i3 += 4;
            byte[] f2 = nArr[i4].f();
            if (f2 != null) {
                System.arraycopy(f2, 0, bArr, i3, f2.length);
                i3 += f2.length;
            }
        }
        if (z && (f = nArr[length - 1].f()) != null) {
            System.arraycopy(f, 0, bArr, i3, f.length);
        }
        return bArr;
    }

    public static N[] f(byte[] bArr, boolean z, InterfaceC0673h interfaceC0673h) throws ZipException {
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i > length - 4) {
                break;
            }
            W w = new W(bArr, i);
            int d = new W(bArr, i + 2).d();
            int i2 = i + 4;
            if (i2 + d > length) {
                N d2 = interfaceC0673h.d(bArr, i, length - i, z, d);
                if (d2 != null) {
                    arrayList.add(d2);
                }
            } else {
                byte[] bArr2 = bArr;
                boolean z2 = z;
                InterfaceC0673h interfaceC0673h2 = interfaceC0673h;
                try {
                    N h = interfaceC0673h2.h(w);
                    Objects.requireNonNull(h, "createExtraField must not return null");
                    N j = interfaceC0673h2.j(h, bArr2, i2, d, z2);
                    Objects.requireNonNull(j, "fill must not return null");
                    arrayList.add(j);
                    i += d + 4;
                    interfaceC0673h = interfaceC0673h2;
                    bArr = bArr2;
                    z = z2;
                } catch (IllegalAccessException | InstantiationException e) {
                    throw ((ZipException) new ZipException(e.getMessage()).initCause(e));
                }
            }
        }
        return (N[]) arrayList.toArray(b);
    }

    public static void g(Class<?> cls) {
        try {
            a.put(((N) cls.newInstance()).b(), cls);
        } catch (ClassCastException unused) {
            throw new RuntimeException(cls + " doesn't implement ZipExtraField");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException(cls + "'s no-arg constructor is not public");
        } catch (InstantiationException unused3) {
            throw new RuntimeException(cls + " is not a concrete class");
        }
    }
}
