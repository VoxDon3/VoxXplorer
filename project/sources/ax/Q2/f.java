package ax.Q2;

import android.content.Context;
import android.os.Environment;
import ax.c3.C1817e;
import ax.c3.C1835x;
import ax.c3.d0;
import ax.c3.m0;
import ax.d3.AbstractC1927n;
import ax.d3.C1911a0;
import ax.d3.C1912b;
import ax.d3.C1913b0;
import ax.d3.C1914c;
import ax.d3.C1915c0;
import ax.d3.C1916d;
import ax.d3.C1923j;
import ax.d3.C1925l;
import ax.d3.C1928o;
import ax.d3.C1930q;
import ax.d3.C1934v;
import ax.d3.C1935w;
import ax.d3.C1937y;
import ax.d3.C1938z;
import ax.d3.D0;
import ax.d3.E;
import ax.d3.K;
import ax.d3.N;
import ax.d3.O;
import ax.d3.P;
import ax.d3.Q;
import ax.d3.V;
import ax.d3.X;
import ax.d3.f0;
import ax.d3.g0;
import ax.d3.h0;
import ax.d3.i0;
import ax.d3.j0;
import ax.d3.l0;
import ax.d3.p0;
import ax.d3.q0;
import ax.d3.r;
import ax.d3.r0;
import ax.d3.s0;
import ax.d3.t0;
import ax.d3.u0;
import ax.d3.v0;
import com.voxdon.xplorer.file.AbstractC3586e;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.B;
import com.voxdon.xplorer.file.C3582a;
import com.voxdon.xplorer.file.C3583b;
import com.voxdon.xplorer.file.C3585d;
import com.voxdon.xplorer.file.C3592k;
import com.voxdon.xplorer.file.C3593l;
import com.voxdon.xplorer.file.C3598q;
import com.voxdon.xplorer.file.C3599s;
import com.voxdon.xplorer.file.C3600t;
import com.voxdon.xplorer.file.C3601u;
import com.voxdon.xplorer.file.C3602v;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.file.D;
import com.voxdon.xplorer.file.H;
import com.voxdon.xplorer.file.I;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.file.L;
import com.voxdon.xplorer.file.OneDriveFileHelper;
import com.voxdon.xplorer.file.T;
import com.voxdon.xplorer.file.U;
import com.voxdon.xplorer.file.W;
import com.voxdon.xplorer.file.Y;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import okhttp3.HttpUrl;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'H0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class f {
    public static final f A0;
    static final List<f> A1;
    public static final f B0;
    static final List<f> B1;
    public static final f C0;
    static final List<f> C1;
    public static final f D0;
    static final List<f> D1;
    public static final f E0;
    static final List<f> E1;
    public static final f F0;
    static final List<f> F1;
    public static final f G0;
    static final List<f> G1;
    public static final f H0;
    private static final /* synthetic */ f[] H1;
    public static final f I0;
    public static final f J0;
    public static final f K0;
    public static final f L0;
    public static final f M0;
    public static final f N0;
    public static final f O0;
    public static final f P0;
    public static final f Q0;
    public static final f R0;
    public static final f S0;
    public static final f T0;
    public static final f U0;
    public static final f V0;
    public static final f W0;
    public static final f X0;
    public static final f Y0;
    public static final f Z0;
    public static final f a1;
    public static final f b1;
    public static final f c1;
    public static final f d1;
    public static final f e1;
    public static final f f1;
    public static final f g1;
    public static final f h1;
    public static final f i1;
    public static final f j1;
    public static final f k1;
    public static final f l1;
    public static final f m1;
    public static final f n0;
    public static final f n1;
    public static final f o0;
    public static final f o1;
    public static final f p0;
    public static final f p1;
    public static final f q0;
    public static final f q1;
    public static final f r0;
    public static final f r1;
    public static final f s0;
    public static final f s1;
    public static final f t0;
    public static final f t1;
    public static final f u0;
    static HashMap<String, f> u1;
    public static final f v0;
    static final List<f> v1;
    public static final f w0;
    static final List<f> w1;
    public static final f x0;
    static final List<f> x1;
    public static final f y0;
    static final List<f> y1;
    public static final f z0;
    static final List<f> z1;
    private String c0;
    private String d0;
    private f e0;
    private boolean f0;
    private boolean g0;
    private boolean h0;
    private String i0;
    private Class<? extends AbstractC1927n> j0;
    private Class<? extends AbstractC3594m> k0;
    private final String q;
    public static final f l0 = new f("HOME", 0, "home", C1935w.class, null, null, null, null, true, false, false, null);
    public static final f m0 = new f("EMPTY", 1, "empty", null, null, null, null, null, true, false, false, null);

    static {
        f fVar = new f("LOCAL", 2, "local", null, null, null, null, null, false, false, false, null);
        n0 = fVar;
        f fVar2 = new f("MAINSTORAGE", 3, "main", Q.class, C3604x.class, null, "local", fVar, false, true, true, "NameUp");
        o0 = fVar2;
        f fVar3 = new f("SDCARD", 4, "sdcard", Q.class, C3604x.class, null, "local", fVar, false, true, true, "NameUp");
        p0 = fVar3;
        f fVar4 = new f("DOWNLOAD", 5, "download", Q.class, C3604x.class, null, "local", fVar, false, true, false, "DateDown");
        q0 = fVar4;
        f fVar5 = new f("CAMERA", 6, "camera", Q.class, C3604x.class, null, "local", fVar, false, true, false, "DateDown");
        r0 = fVar5;
        f fVar6 = new f("DUAL_APPS", 7, "dual", Q.class, C3604x.class, null, "local", fVar, false, true, false, "NameUp");
        s0 = fVar6;
        f fVar7 = new f("SYSTEM", 8, "system", Q.class, C3604x.class, "/", "local", fVar, false, true, false, "NameUp");
        t0 = fVar7;
        f fVar8 = new f("USBMOUNT", 9, "usbmount", Q.class, C3604x.class, null, "local", fVar, false, true, false, "NameUp");
        u0 = fVar8;
        f fVar9 = new f("USBVOLUME", 10, "usbvolume", Q.class, C3604x.class, null, "local", fVar, false, true, false, "NameUp");
        v0 = fVar9;
        f fVar10 = new f("CHROME_VOLUME", 11, "chrome_volume", Q.class, C3604x.class, null, "local", fVar, false, true, false, "NameUp");
        w0 = fVar10;
        f fVar11 = new f("SDCARD_VOLUME", 12, "sdcard_volume", Q.class, C3604x.class, null, "local", fVar, false, true, true, "NameUp");
        x0 = fVar11;
        f fVar12 = new f("LIBRARY", 13, "library", null, null, null, null, null, false, false, false, null);
        y0 = fVar12;
        f fVar13 = new f("IMAGE", 14, "image", P.class, C3601u.class, "/", "image", fVar12, false, true, false, "DateDown");
        z0 = fVar13;
        f fVar14 = new f("AUDIO", 15, "audio", P.class, C3601u.class, "/", "audio", fVar12, false, true, false, "DateDown");
        A0 = fVar14;
        f fVar15 = new f("VIDEO", 16, "video", P.class, C3601u.class, "/", "video", fVar12, false, true, false, "DateDown");
        B0 = fVar15;
        f fVar16 = new f("DOCUMENT", 17, "document", P.class, C3601u.class, "/", "local", fVar12, false, true, false, "DateDown");
        C0 = fVar16;
        f fVar17 = new f("ARCHIVE", 18, "archive", P.class, C3601u.class, "/", "local", fVar12, false, true, false, "DateDown");
        D0 = fVar17;
        E0 = new f("FAVORITE", 19, "favorite", null, null, null, null, null, false, false, false, "NameUp");
        f fVar18 = new f("NEW_FILES", 20, "new_files", V.class, B.class, "/", "new_files", null, true, false, false, "TypeUp");
        F0 = fVar18;
        f fVar19 = new f("REMOTE", 21, "remote", h0.class, null, null, null, null, false, false, false, null);
        G0 = fVar19;
        f fVar20 = new f("FTP", 22, "FTP", K.class, C3598q.class, "/", "ftp", fVar19, true, true, false, "NameUp");
        H0 = fVar20;
        f fVar21 = new f("SFTP", 23, "SFTP", p0.class, L.class, "/", "sftp", fVar19, true, true, false, "NameUp");
        I0 = fVar21;
        f fVar22 = new f("SMB", 24, "SMB", q0.class, com.voxdon.xplorer.file.Q.class, "/", "smb", fVar19, true, true, false, "NameUp");
        J0 = fVar22;
        f fVar23 = new f("WEBDAV", 25, "webdav", v0.class, W.class, "/", "webdav", fVar19, true, true, false, "NameUp");
        K0 = fVar23;
        L0 = new f("LOCAL_NETWORK", 26, "local_network", null, null, null, null, null, false, false, false, "NameUp");
        f fVar24 = new f("CLOUD", 27, "cloud", r.class, null, null, null, null, false, false, false, null);
        M0 = fVar24;
        f fVar25 = new f("DROPBOX", 28, "dropbox", C1937y.class, C3592k.class, "/", "dropbox", fVar24, true, true, false, "NameUp");
        N0 = fVar25;
        f fVar26 = new f("GOOGLEDRIVE", 29, "googledrive", ax.d3.L.class, com.voxdon.xplorer.file.r.class, "/", "googledrive", fVar24, true, true, false, "NameUp");
        O0 = fVar26;
        f fVar27 = new f("ONEDRIVE", 30, "onedrive", C1911a0.class, OneDriveFileHelper.class, "/", "onedrive", fVar24, true, true, false, "NameUp");
        P0 = fVar27;
        f fVar28 = new f("YANDEX", 31, "yandexdisk", D0.class, Y.class, "/", "yandex", fVar24, true, true, false, "NameUp");
        Q0 = fVar28;
        f fVar29 = new f("PCLOUD", 32, "pcloud", C1915c0.class, I.class, "/", "pcloud", fVar24, true, true, false, "NameUp");
        R0 = fVar29;
        f fVar30 = new f("BOX", 33, "box", C1928o.class, C3585d.class, "/", "box", fVar24, true, true, false, "NameUp");
        S0 = fVar30;
        f fVar31 = new f("NEXTCLOUD", 34, "nextcloud", ax.d3.W.class, D.class, "/", "nextcloud", fVar24, true, true, false, "NameUp");
        T0 = fVar31;
        f fVar32 = new f("OWNCLOUD", 35, "owncloud", C1913b0.class, H.class, "/", "owncloud", fVar24, true, true, false, "NameUp");
        U0 = fVar32;
        V0 = new f("APP", 36, "app", C1923j.class, null, "/", "apps", null, false, true, false, "NameUp");
        W0 = new f("SERVER", 37, "server", l0.class, null, null, null, null, false, false, false, null);
        X0 = new f("ARCHIVE_VIEWER", 38, "archiveviewer", C1925l.class, C3583b.class, "/", "archiveviewer", null, false, true, false, "NameUp");
        Y0 = new f("ADD_NETWORK", 39, "add_network", null, null, null, null, null, false, false, false, null);
        Z0 = new f("PREMIUM", 40, "premium", null, null, null, null, null, false, false, false, null);
        a1 = new f("DEBUG", 41, "debug", null, null, null, null, null, false, false, false, null);
        b1 = new f("USBSTORAGE", 42, "usb", u0.class, U.class, "/", "usb", null, false, true, false, "NameUp");
        f fVar33 = new f("USBDOCUMENT", 43, "usbdocument", t0.class, m0.class, "/", "usbdoc", null, false, true, false, "NameUp");
        c1 = fVar33;
        f fVar34 = new f("SDCARD_DOCUMENT", 44, "sdcard_document", i0.class, ax.c3.h0.class, "/", "sdcarddoc", null, false, true, false, "NameUp");
        d1 = fVar34;
        f fVar35 = new f("ODD_DOCUMENT", 45, "odd_document", X.class, ax.c3.Q.class, "/", "odddoc", null, false, true, false, "NameUp");
        e1 = fVar35;
        f fVar36 = new f("CHROME_DOCUMENT", 46, "chrome_document", C1930q.class, C1817e.class, "/", "chromedoc", null, false, true, false, "NameUp");
        f1 = fVar36;
        f fVar37 = new f("UNKNOWN_DOCUMENT", 47, "unknown_document", r0.class, ax.c3.l0.class, "/", "unknowndoc", null, false, true, false, "NameUp");
        g1 = fVar37;
        f fVar38 = new f("MTP_DOCUMENT", 48, "mtp_document", ax.d3.U.class, ax.c3.L.class, "/", "mtpdoc", null, false, true, false, "NameUp");
        h1 = fVar38;
        f fVar39 = new f("STORAGE_ANALYSIS", 49, "storage_analysis", C1912b.class, null, null, null, null, false, false, false, null);
        i1 = fVar39;
        f fVar40 = new f("LARGE_FILES", 50, "large_files", N.class, C3599s.class, "/", "local", fVar39, false, false, false, "SizeDown");
        j1 = fVar40;
        f fVar41 = new f("LARGE_FOLDERS", 51, "large_folders", O.class, C3600t.class, "/", "local", fVar39, false, false, false, "SizeDown");
        k1 = fVar41;
        f fVar42 = new f("APP_CACHES", 52, "app_cache", C1914c.class, C3582a.class, "/", "local", fVar39, false, false, false, "SizeDown");
        l1 = fVar42;
        f fVar43 = new f("DUPLICATE_FILES", 53, "dup_files", C1938z.class, C3593l.class, "/", "local", fVar39, false, false, false, "SizeDown");
        m1 = fVar43;
        f fVar44 = new f("DUPLICATE_DOWNLOADS", 54, "dup_downloads", C1938z.class, C3593l.class, "/", "local", fVar39, false, false, false, "SizeDown");
        n1 = fVar44;
        f fVar45 = new f("RECYCLE_BIN", 55, "recycle_bin", g0.class, J.class, "/", "recyclebin", null, false, false, false, "DateDown");
        o1 = fVar45;
        f fVar46 = new f("RECYCLE_BIN_CARD", 56, "recycle_bin_card", f0.class, null, "/", null, null, false, false, false, null);
        p1 = fVar46;
        q1 = new f("APP_STATS", 57, "appstats", C1916d.class, null, "/", null, fVar39, false, false, false, "SizeDown");
        r1 = new f("UNUSED_APPS", 58, "unused_apps", s0.class, null, "/", null, fVar39, false, false, false, "SizeDown");
        s1 = new f("SEARCH_RESULT", 59, "search_result", j0.class, null, "/", "search_result", null, true, false, false, "None");
        t1 = new f("LAST", 60, HttpUrl.FRAGMENT_ENCODE_SET, null, null, null, null, null, false, false, false, null);
        H1 = d();
        u1 = null;
        v1 = Arrays.asList(fVar20, fVar21, fVar22, fVar23, fVar25, fVar26, fVar27, fVar28, fVar29, fVar31, fVar32, fVar30);
        w1 = Arrays.asList(fVar20, fVar21, fVar22, fVar23);
        x1 = Arrays.asList(fVar2, fVar3, fVar11, fVar34, fVar8, fVar9, fVar33);
        y1 = Arrays.asList(fVar2, fVar3, fVar11, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10);
        z1 = Arrays.asList(fVar2, fVar3);
        A1 = Arrays.asList(fVar13, fVar15, fVar14, fVar7, fVar20, fVar21);
        B1 = Arrays.asList(fVar3, fVar11, fVar8, fVar9, fVar10);
        C1 = Arrays.asList(fVar33, fVar34, fVar35, fVar36, fVar37);
        D1 = Arrays.asList(fVar38);
        E1 = Arrays.asList(fVar13, fVar15, fVar14, fVar16, fVar17);
        F1 = Arrays.asList(fVar2, fVar3, fVar4, fVar5, fVar18, fVar13, fVar15, fVar14, fVar16, fVar17);
        G1 = Arrays.asList(fVar19, fVar24, fVar39, fVar40, fVar41, fVar42, fVar46, fVar45, fVar44, fVar43);
    }

    private f(String str, int i, String str2, Class cls, Class cls2, String str3, String str4, f fVar, boolean z, boolean z2, boolean z3, String str5) {
        this.q = str2;
        this.c0 = str3;
        this.e0 = fVar;
        this.f0 = z;
        this.g0 = z2;
        this.d0 = str4;
        this.i0 = str5;
        this.j0 = cls;
        this.k0 = cls2;
        this.h0 = z3;
    }

    public static boolean A0(f fVar) {
        return j0(fVar) || g0(fVar) || fVar == F0 || fVar == j1 || fVar == k1 || fVar == n1 || fVar == m1 || fVar == o1 || fVar == l1;
    }

    public static List<f> B() {
        return E1;
    }

    public static boolean B0(f fVar) {
        return F0(fVar) && fVar != P0;
    }

    public static List<f> C() {
        return G1;
    }

    public static boolean C0(f fVar) {
        return p0(fVar);
    }

    public static synchronized f D(String str) {
        synchronized (f.class) {
            for (f fVar : values()) {
                if (fVar.I().equals(str)) {
                    return fVar;
                }
            }
            return null;
        }
    }

    public static boolean D0(f fVar) {
        return fVar == H0 || fVar == I0;
    }

    public static synchronized f E(String str) {
        f fVar;
        synchronized (f.class) {
            try {
                if (u1 == null) {
                    u1 = new HashMap<>();
                    for (f fVar2 : values()) {
                        if (fVar2.K() != null) {
                            u1.put(fVar2.K(), fVar2);
                            u1.put(fVar2.t(), fVar2);
                        }
                    }
                    HashMap<String, f> hashMap = u1;
                    f fVar3 = t0;
                    hashMap.put("local", fVar3);
                    u1.put(fVar3.t(), fVar3);
                }
                fVar = u1.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static boolean E0(f fVar, AbstractC3595n abstractC3595n) {
        if (fVar.O()) {
            return true;
        }
        return d0.E(abstractC3595n) && g0(fVar);
    }

    public static int F(f fVar, int i) {
        if (fVar == X0) {
            return 0;
        }
        return i;
    }

    public static boolean F0(f fVar) {
        return n0(fVar) || e0(fVar) || o0(fVar);
    }

    public static String G(Context context, ax.c3.K k) {
        T b = T.b(context, k.d());
        if (b != null) {
            return b.f(k.b()).b();
        }
        return null;
    }

    public static String H(Context context, ax.c3.K k) {
        ax.c3.g0 d = T.d(context, k.d());
        return d != null ? d.f(k.b()).f() : k.f(context);
    }

    public static ax.c3.K L(ax.c3.K k) {
        f d = k.d();
        if (j0(d)) {
            return (i0(d) || o0 == d || s0 == d) ? k : ax.c3.K.f;
        }
        if (e0(d) || o0(d)) {
            return k;
        }
        return null;
    }

    private int N() {
        return ax.s3.b.l(this);
    }

    private boolean O() {
        return this.f0;
    }

    public static boolean Q(ax.c3.K k) {
        if (ax.X2.Q.L()) {
            return k == ax.c3.K.e || k == ax.c3.K.f || k == ax.c3.K.g;
        }
        return false;
    }

    public static boolean R(ax.c3.K k) {
        if (ax.X2.Q.L()) {
            return k == ax.c3.K.e || k == ax.c3.K.f || k == ax.c3.K.g;
        }
        return false;
    }

    public static boolean S(f fVar) {
        return fVar.J() == i1;
    }

    public static boolean T(f fVar) {
        return U(fVar);
    }

    public static boolean U(f fVar) {
        return (ax.X2.Q.m() && fVar == v0) || fVar == o0 || fVar == p0;
    }

    public static boolean V(f fVar) {
        return i0(fVar) || e0(fVar);
    }

    public static boolean X(f fVar) {
        return fVar.J() == M0;
    }

    public static boolean Y(f fVar) {
        return AbstractC3586e.class.isAssignableFrom(fVar.x());
    }

    public static boolean Z(f fVar) {
        return !n0(fVar);
    }

    public static boolean a0(f fVar) {
        return fVar == d1 || fVar == x0 || fVar == u0 || fVar == v0 || fVar == c1 || fVar == b1 || fVar == f1 || fVar == w0 || fVar == e1 || fVar == g1 || fVar == h1;
    }

    public static boolean b0(f fVar) {
        return fVar == o0 || c0(fVar);
    }

    public static boolean c0(f fVar) {
        return i0(fVar) || e0(fVar);
    }

    private static /* synthetic */ f[] d() {
        return new f[]{l0, m0, n0, o0, p0, q0, r0, s0, t0, u0, v0, w0, x0, y0, z0, A0, B0, C0, D0, E0, F0, G0, H0, I0, J0, K0, L0, M0, N0, O0, P0, Q0, R0, S0, T0, U0, V0, W0, X0, Y0, Z0, a1, b1, c1, d1, e1, f1, g1, h1, i1, j1, k1, l1, m1, n1, o1, p1, q1, r1, s1, t1};
    }

    public static boolean d0(f fVar) {
        Class<? extends AbstractC1927n> A = fVar.A();
        if (A == null) {
            return false;
        }
        return E.class.isAssignableFrom(A);
    }

    public static boolean e0(f fVar) {
        return C1.contains(fVar);
    }

    public static boolean f0(f fVar) {
        return fVar == o0 || fVar == p0;
    }

    public static boolean g0(f fVar) {
        return E1.contains(fVar);
    }

    public static boolean h(f fVar) {
        return x1.contains(fVar);
    }

    public static boolean h0(AbstractC3595n abstractC3595n) {
        if (abstractC3595n instanceof C3602v) {
            return d0.E(abstractC3595n);
        }
        return false;
    }

    public static boolean i0(f fVar) {
        return B1.contains(fVar);
    }

    public static boolean j(f fVar) {
        return j0(fVar) || g0(fVar);
    }

    public static boolean j0(f fVar) {
        return y1.contains(fVar);
    }

    public static boolean k0(f fVar) {
        return z1.contains(fVar);
    }

    public static boolean l(f fVar) {
        return F1.contains(fVar);
    }

    public static boolean l0(f fVar) {
        return j0(fVar) || e0(fVar) || o0(fVar);
    }

    public static boolean m0(f fVar) {
        return fVar == z0 || fVar == B0 || fVar == A0;
    }

    public static boolean n(f fVar) {
        return d0(fVar) && !G1.contains(fVar);
    }

    public static boolean n0(f fVar) {
        return v1.contains(fVar);
    }

    public static boolean o0(f fVar) {
        return D1.contains(fVar);
    }

    public static f p(String str) {
        for (f fVar : values()) {
            if (fVar.I().equals(str)) {
                return fVar;
            }
        }
        return null;
    }

    public static boolean p0(f fVar) {
        return w1.contains(fVar);
    }

    public static String q() {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        File file = new File(externalStoragePublicDirectory, "Camera");
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        File file2 = new File(externalStoragePublicDirectory, "100ANDRO");
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        File file3 = new File(externalStoragePublicDirectory, "100MEDIA");
        return file3.exists() ? file3.getAbsolutePath() : externalStoragePublicDirectory.getAbsolutePath();
    }

    public static boolean r0(ax.c3.K k, boolean z) {
        int ordinal = k.d().ordinal();
        if (ordinal == 3) {
            if (z) {
                return e.K();
            }
            return true;
        }
        if (ordinal == 4) {
            return ax.Z2.j.F().t0();
        }
        if (ordinal != 7) {
            if (ordinal == 22) {
                if (C3598q.D0(k.b())) {
                    return C1835x.e(k).a();
                }
                return true;
            }
            if (ordinal != 48) {
                switch (ordinal) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        break;
                    default:
                        switch (ordinal) {
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                                break;
                            default:
                                return true;
                        }
                }
            }
        }
        return ax.Z2.j.F().l0(k);
    }

    public static boolean s0(f fVar) {
        return (!A0(fVar) || x0(fVar) || fVar == l1 || fVar == s0) ? false : true;
    }

    public static boolean t0(f fVar) {
        return fVar == p0 || fVar == d1 || fVar == x0;
    }

    public static String u() {
        try {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
        } catch (Exception e) {
            ax.Ha.c.h().f().b("DOWNLOAD PATH ERROR").l(e).h();
            return d0.Q(e.v(), "Download");
        }
    }

    public static boolean u0(f fVar) {
        return fVar == o0;
    }

    public static boolean v0(f fVar) {
        return X(fVar) || fVar == K0 || h(fVar);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) H1.clone();
    }

    public static String w() {
        if (!ax.X2.J.B() && new File("/storage/emulated/999").exists()) {
            return "/storage/emulated/999";
        }
        if (new File("/storage/emulated/95").exists()) {
            return "/storage/emulated/95";
        }
        if (new File("/storage/emulated/96").exists()) {
            return "/storage/emulated/96";
        }
        return null;
    }

    public static boolean w0(f fVar) {
        return fVar == u0 || fVar == v0 || fVar == c1;
    }

    public static boolean x0(f fVar) {
        return fVar == u0 || fVar == v0 || fVar == c1 || fVar == b1;
    }

    public static boolean y0(f fVar) {
        return fVar == v0 || fVar == c1;
    }

    public static boolean z0(f fVar) {
        return x0(fVar);
    }

    public Class<? extends AbstractC1927n> A() {
        return l0 == this ? C1934v.class : this.j0;
    }

    public String I() {
        return this.q;
    }

    public f J() {
        return this.e0;
    }

    public String K() {
        return this.d0;
    }

    public String M(Context context) {
        return context.getString(N());
    }

    public boolean P() {
        return this.g0;
    }

    public boolean W() {
        return this == N0 || A0(this) || c0(this);
    }

    public boolean q0() {
        if (this == o0) {
            return ax.Z2.j.F().o0();
        }
        if (this == p0) {
            return ax.Z2.j.F().w0();
        }
        return false;
    }

    public String r() {
        return this.c0;
    }

    public String s() {
        return this.i0;
    }

    public String t() {
        return "dir_" + this.d0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.q;
    }

    public Class<? extends AbstractC3594m> x() {
        return this.k0;
    }
}
