package ax.Cc;

import ax.Dc.L;
import ax.Kc.n;
import ax.m.j;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class c implements ax.Ac.a {
    private static final c[] B0 = new c[0];
    private long A0;
    private final boolean c0;
    private int d0;
    private long e0;
    private long f0;
    private long g0;
    private long h0;
    private boolean i0;
    private byte j0;
    private String k0;
    private String l0;
    private String m0;
    private String n0;
    private String o0;
    private int p0;
    private String q;
    private int q0;
    private List<g> r0;
    private boolean s0;
    private long t0;
    private boolean u0;
    private boolean v0;
    private boolean w0;
    private final Path x0;
    private final LinkOption[] y0;
    private final Map<String, String> z0;

    private c(boolean z) {
        this.q = HttpUrl.FRAGMENT_ENCODE_SET;
        this.k0 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.l0 = "ustar\u0000";
        this.m0 = "00";
        this.o0 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.z0 = new HashMap();
        this.A0 = -1L;
        String property = System.getProperty("user.name", HttpUrl.FRAGMENT_ENCODE_SET);
        this.n0 = property.length() > 31 ? property.substring(0, 31) : property;
        this.x0 = null;
        this.y0 = n.a;
        this.c0 = z;
    }

    private void A(String str, String str2, Map<String, String> map) throws IOException {
        str.getClass();
        switch (str) {
            case "SCHILY.devmajor":
                int parseInt = Integer.parseInt(str2);
                if (parseInt < 0) {
                    throw new IOException("Corrupted TAR archive. Dev-Major is negative");
                }
                B(parseInt);
                return;
            case "SCHILY.devminor":
                int parseInt2 = Integer.parseInt(str2);
                if (parseInt2 < 0) {
                    throw new IOException("Corrupted TAR archive. Dev-Minor is negative");
                }
                C(parseInt2);
                return;
            case "GNU.sparse.realsize":
                f(map);
                return;
            case "GNU.sparse.size":
                e(map);
                return;
            case "gid":
                D(Long.parseLong(str2));
                return;
            case "uid":
                K(Long.parseLong(str2));
                return;
            case "path":
                H(str2);
                return;
            case "size":
                long parseLong = Long.parseLong(str2);
                if (parseLong < 0) {
                    throw new IOException("Corrupted TAR archive. Entry size is negative");
                }
                I(parseLong);
                return;
            case "gname":
                E(str2);
                return;
            case "mtime":
                G((long) (Double.parseDouble(str2) * 1000.0d));
                return;
            case "uname":
                L(str2);
                return;
            case "SCHILY.filetype":
                if ("sparse".equals(str2)) {
                    g(map);
                    return;
                }
                return;
            case "linkpath":
                F(str2);
                return;
            default:
                this.z0.put(str, str2);
                return;
        }
    }

    public static /* synthetic */ boolean a(g gVar) {
        return gVar.b() > 0 || gVar.a() > 0;
    }

    private int d(byte[] bArr) {
        if (ax.Kc.a.c("ustar ", bArr, 257, 6)) {
            return 2;
        }
        if (ax.Kc.a.c("ustar\u0000", bArr, 257, 6)) {
            return ax.Kc.a.c("tar\u0000", bArr, 508, 4) ? 4 : 3;
        }
        return 0;
    }

    private static String w(String str, boolean z) {
        String lowerCase;
        int indexOf;
        if (!z && (lowerCase = System.getProperty("os.name").toLowerCase(Locale.ENGLISH)) != null) {
            if (lowerCase.startsWith("windows")) {
                if (str.length() > 2) {
                    char charAt = str.charAt(0);
                    if (str.charAt(1) == ':' && ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                        str = str.substring(2);
                    }
                }
            } else if (lowerCase.contains("netware") && (indexOf = str.indexOf(58)) != -1) {
                str = str.substring(indexOf + 1);
            }
        }
        String replace = str.replace(File.separatorChar, '/');
        while (!z && replace.startsWith("/")) {
            replace = replace.substring(1);
        }
        return replace;
    }

    private long x(byte[] bArr, int i, int i2, boolean z) {
        if (!z) {
            return h.i(bArr, i, i2);
        }
        try {
            return h.i(bArr, i, i2);
        } catch (IllegalArgumentException unused) {
            return -1L;
        }
    }

    private void y(byte[] bArr, L l, boolean z, boolean z2) throws IOException {
        try {
            z(bArr, l, z, z2);
        } catch (IllegalArgumentException e) {
            throw new IOException("Corrupted TAR archive.", e);
        }
    }

    private void z(byte[] bArr, L l, boolean z, boolean z2) throws IOException {
        this.q = z ? h.f(bArr, 0, 100) : h.g(bArr, 0, 100, l);
        this.d0 = (int) x(bArr, 100, 8, z2);
        this.e0 = (int) x(bArr, 108, 8, z2);
        this.f0 = (int) x(bArr, 116, 8, z2);
        long i = h.i(bArr, j.K0, 12);
        this.g0 = i;
        if (i < 0) {
            throw new IOException("broken archive, entry with negative size");
        }
        this.h0 = x(bArr, 136, 12, z2);
        this.i0 = h.o(bArr);
        this.j0 = bArr[156];
        this.k0 = z ? h.f(bArr, 157, 100) : h.g(bArr, 157, 100, l);
        this.l0 = h.f(bArr, 257, 6);
        this.m0 = h.f(bArr, 263, 2);
        this.n0 = z ? h.f(bArr, 265, 32) : h.g(bArr, 265, 32, l);
        this.o0 = z ? h.f(bArr, 297, 32) : h.g(bArr, 297, 32, l);
        byte b = this.j0;
        if (b == 51 || b == 52) {
            this.p0 = (int) x(bArr, 329, 8, z2);
            this.q0 = (int) x(bArr, 337, 8, z2);
        }
        int d = d(bArr);
        if (d == 2) {
            this.r0 = new ArrayList(h.n(bArr, 386, 4));
            this.s0 = h.d(bArr, 482);
            this.t0 = h.h(bArr, 483, 12);
            return;
        }
        if (d == 4) {
            String f = z ? h.f(bArr, 345, 131) : h.g(bArr, 345, 131, l);
            if (f.isEmpty()) {
                return;
            }
            this.q = f + "/" + this.q;
            return;
        }
        String f2 = z ? h.f(bArr, 345, 155) : h.g(bArr, 345, 155, l);
        if (isDirectory() && !this.q.endsWith("/")) {
            this.q += "/";
        }
        if (f2.isEmpty()) {
            return;
        }
        this.q = f2 + "/" + this.q;
    }

    public void B(int i) {
        if (i >= 0) {
            this.p0 = i;
            return;
        }
        throw new IllegalArgumentException("Major device number is out of range: " + i);
    }

    public void C(int i) {
        if (i >= 0) {
            this.q0 = i;
            return;
        }
        throw new IllegalArgumentException("Minor device number is out of range: " + i);
    }

    public void D(long j) {
        this.f0 = j;
    }

    public void E(String str) {
        this.o0 = str;
    }

    public void F(String str) {
        this.k0 = str;
    }

    public void G(long j) {
        this.h0 = j / 1000;
    }

    public void H(String str) {
        this.q = w(str, this.c0);
    }

    public void I(long j) {
        if (j >= 0) {
            this.g0 = j;
            return;
        }
        throw new IllegalArgumentException("Size is out of range: " + j);
    }

    public void J(List<g> list) {
        this.r0 = list;
    }

    public void K(long j) {
        this.e0 = j;
    }

    public void L(String str) {
        this.n0 = str;
    }

    void M(Map<String, String> map) throws IOException {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            A(entry.getKey(), entry.getValue(), map);
        }
    }

    @Override // ax.Ac.a
    public Date b() {
        return h();
    }

    public boolean c(c cVar) {
        return cVar != null && getName().equals(cVar.getName());
    }

    void e(Map<String, String> map) {
        this.u0 = true;
        this.t0 = Integer.parseInt(map.get("GNU.sparse.size"));
        if (map.containsKey("GNU.sparse.name")) {
            this.q = map.get("GNU.sparse.name");
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return c((c) obj);
    }

    void f(Map<String, String> map) throws IOException {
        this.u0 = true;
        this.v0 = true;
        if (map.containsKey("GNU.sparse.name")) {
            this.q = map.get("GNU.sparse.name");
        }
        if (map.containsKey("GNU.sparse.realsize")) {
            try {
                this.t0 = Integer.parseInt(map.get("GNU.sparse.realsize"));
            } catch (NumberFormatException unused) {
                throw new IOException("Corrupted TAR archive. GNU.sparse.realsize header for " + this.q + " contains non-numeric value");
            }
        }
    }

    void g(Map<String, String> map) throws IOException {
        this.w0 = true;
        if (map.containsKey("SCHILY.realsize")) {
            try {
                this.t0 = Long.parseLong(map.get("SCHILY.realsize"));
            } catch (NumberFormatException unused) {
                throw new IOException("Corrupted TAR archive. SCHILY.realsize header for " + this.q + " contains non-numeric value");
            }
        }
    }

    @Override // ax.Ac.a
    public String getName() {
        return this.q;
    }

    @Override // ax.Ac.a
    public long getSize() {
        return this.g0;
    }

    public Date h() {
        return new Date(this.h0 * 1000);
    }

    public int hashCode() {
        return getName().hashCode();
    }

    public List<g> i() throws IOException {
        List<g> list = this.r0;
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List<g> list2 = (List) Collection.EL.stream(this.r0).filter(new Predicate() { // from class: ax.Cc.a
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return c.a((g) obj);
            }
        }).sorted(Comparator.CC.comparingLong(new ToLongFunction() { // from class: ax.Cc.b
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((g) obj).b();
            }
        })).collect(Collectors.toList());
        int size = list2.size();
        int i = 0;
        while (i < size) {
            g gVar = list2.get(i);
            i++;
            if (i < size && gVar.b() + gVar.a() > list2.get(i).b()) {
                throw new IOException("Corrupted TAR archive. Sparse blocks for " + getName() + " overlap each other.");
            }
            if (gVar.b() + gVar.a() < 0) {
                throw new IOException("Unreadable TAR archive. Offset and numbytes for sparse block in " + getName() + " too large.");
            }
        }
        if (!list2.isEmpty()) {
            g gVar2 = list2.get(size - 1);
            if (gVar2.b() + gVar2.a() > j()) {
                throw new IOException("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
            }
        }
        return list2;
    }

    @Override // ax.Ac.a
    public boolean isDirectory() {
        Path path = this.x0;
        if (path != null) {
            return Files.isDirectory(path, this.y0);
        }
        if (this.j0 == 53) {
            return true;
        }
        return (t() || p() || !getName().endsWith("/")) ? false : true;
    }

    public long j() {
        return !u() ? getSize() : this.t0;
    }

    public List<g> k() {
        return this.r0;
    }

    public boolean l() {
        return this.s0;
    }

    public boolean m() {
        return this.j0 == 75;
    }

    public boolean n() {
        return this.j0 == 76;
    }

    public boolean o() {
        return q() || s();
    }

    public boolean p() {
        return this.j0 == 103;
    }

    public boolean q() {
        return this.j0 == 83;
    }

    public boolean r() {
        return this.v0;
    }

    public boolean s() {
        return this.u0;
    }

    public boolean t() {
        byte b = this.j0;
        return b == 120 || b == 88;
    }

    public boolean u() {
        return o() || v();
    }

    public boolean v() {
        return this.w0;
    }

    public c(byte[] bArr, L l, boolean z) throws IOException {
        this(false);
        y(bArr, l, false, z);
    }
}
