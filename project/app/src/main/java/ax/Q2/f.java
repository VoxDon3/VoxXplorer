/*
 * Decompiled with CFR 0.152.
 */
package ax.Q2;

import android.content.Context;
import android.os.Environment;
import ax.Q2.e;
import ax.X2.J;
import ax.X2.Q;
import ax.Z2.j;
import ax.c3.K;
import ax.c3.L;
import ax.c3.d0;
import ax.c3.l0;
import ax.c3.m0;
import ax.d3.D0;
import ax.d3.E;
import ax.d3.N;
import ax.d3.O;
import ax.d3.P;
import ax.d3.U;
import ax.d3.V;
import ax.d3.W;
import ax.d3.X;
import ax.d3.a0;
import ax.d3.b0;
import ax.d3.c;
import ax.d3.c0;
import ax.d3.d;
import ax.d3.f0;
import ax.d3.g0;
import ax.d3.h0;
import ax.d3.i0;
import ax.d3.j0;
import ax.d3.l;
import ax.d3.n;
import ax.d3.o;
import ax.d3.p0;
import ax.d3.q;
import ax.d3.q0;
import ax.d3.r;
import ax.d3.r0;
import ax.d3.s0;
import ax.d3.t0;
import ax.d3.u0;
import ax.d3.v0;
import ax.d3.w;
import ax.d3.y;
import ax.d3.z;
import ax.s3.b;
import com.alphainventor.filemanager.file.B;
import com.alphainventor.filemanager.file.D;
import com.alphainventor.filemanager.file.H;
import com.alphainventor.filemanager.file.I;
import com.alphainventor.filemanager.file.OneDriveFileHelper;
import com.alphainventor.filemanager.file.T;
import com.alphainventor.filemanager.file.Y;
import com.alphainventor.filemanager.file.a;
import com.alphainventor.filemanager.file.k;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.s;
import com.alphainventor.filemanager.file.t;
import com.alphainventor.filemanager.file.u;
import com.alphainventor.filemanager.file.v;
import com.alphainventor.filemanager.file.x;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class f
extends Enum<f> {
    public static final /* enum */ f A0;
    static final List<f> A1;
    public static final /* enum */ f B0;
    static final List<f> B1;
    public static final /* enum */ f C0;
    static final List<f> C1;
    public static final /* enum */ f D0;
    static final List<f> D1;
    public static final /* enum */ f E0;
    static final List<f> E1;
    public static final /* enum */ f F0;
    static final List<f> F1;
    public static final /* enum */ f G0;
    static final List<f> G1;
    public static final /* enum */ f H0;
    private static final f[] H1;
    public static final /* enum */ f I0;
    public static final /* enum */ f J0;
    public static final /* enum */ f K0;
    public static final /* enum */ f L0;
    public static final /* enum */ f M0;
    public static final /* enum */ f N0;
    public static final /* enum */ f O0;
    public static final /* enum */ f P0;
    public static final /* enum */ f Q0;
    public static final /* enum */ f R0;
    public static final /* enum */ f S0;
    public static final /* enum */ f T0;
    public static final /* enum */ f U0;
    public static final /* enum */ f V0;
    public static final /* enum */ f W0;
    public static final /* enum */ f X0;
    public static final /* enum */ f Y0;
    public static final /* enum */ f Z0;
    public static final /* enum */ f a1;
    public static final /* enum */ f b1;
    public static final /* enum */ f c1;
    public static final /* enum */ f d1;
    public static final /* enum */ f e1;
    public static final /* enum */ f f1;
    public static final /* enum */ f g1;
    public static final /* enum */ f h1;
    public static final /* enum */ f i1;
    public static final /* enum */ f j1;
    public static final /* enum */ f k1;
    public static final /* enum */ f l0;
    public static final /* enum */ f l1;
    public static final /* enum */ f m0;
    public static final /* enum */ f m1;
    public static final /* enum */ f n0;
    public static final /* enum */ f n1;
    public static final /* enum */ f o0;
    public static final /* enum */ f o1;
    public static final /* enum */ f p0;
    public static final /* enum */ f p1;
    public static final /* enum */ f q0;
    public static final /* enum */ f q1;
    public static final /* enum */ f r0;
    public static final /* enum */ f r1;
    public static final /* enum */ f s0;
    public static final /* enum */ f s1;
    public static final /* enum */ f t0;
    public static final /* enum */ f t1;
    public static final /* enum */ f u0;
    static HashMap<String, f> u1;
    public static final /* enum */ f v0;
    static final List<f> v1;
    public static final /* enum */ f w0;
    static final List<f> w1;
    public static final /* enum */ f x0;
    static final List<f> x1;
    public static final /* enum */ f y0;
    static final List<f> y1;
    public static final /* enum */ f z0;
    static final List<f> z1;
    private String c0;
    private String d0;
    private f e0;
    private boolean f0;
    private boolean g0;
    private boolean h0;
    private String i0;
    private Class<? extends n> j0;
    private Class<? extends m> k0;
    private final String q;

    static {
        f f8;
        f f9;
        f f10;
        f f11;
        f f12;
        f f13;
        f f14;
        f f15;
        f f16;
        f f17;
        f f18;
        f f19;
        f f20;
        f f21;
        f f22;
        f f23;
        f f24;
        f f25;
        f f26;
        f f27;
        f f28;
        f f29;
        f f30;
        f f31;
        f f32;
        f f33;
        f f34;
        f f35;
        f f36;
        f f37;
        f f38;
        f f39;
        f f40;
        f f41;
        f f42;
        f f43;
        f f44;
        f f45;
        f f46;
        f f47;
        f f48;
        f f49;
        f f50;
        f f51;
        l0 = new f("home", w.class, null, null, null, null, true, false, false, null);
        m0 = new f("empty", null, null, null, null, null, true, false, false, null);
        n0 = f51 = new f("local", null, null, null, null, null, false, false, false, null);
        o0 = f50 = new f("main", ax.d3.Q.class, x.class, null, "local", f51, false, true, true, "NameUp");
        p0 = f49 = new f("sdcard", ax.d3.Q.class, x.class, null, "local", f51, false, true, true, "NameUp");
        q0 = f48 = new f("download", ax.d3.Q.class, x.class, null, "local", f51, false, true, false, "DateDown");
        r0 = f47 = new f("camera", ax.d3.Q.class, x.class, null, "local", f51, false, true, false, "DateDown");
        s0 = f46 = new f("dual", ax.d3.Q.class, x.class, null, "local", f51, false, true, false, "NameUp");
        t0 = f45 = new f("system", ax.d3.Q.class, x.class, "/", "local", f51, false, true, false, "NameUp");
        u0 = f44 = new f("usbmount", ax.d3.Q.class, x.class, null, "local", f51, false, true, false, "NameUp");
        v0 = f43 = new f("usbvolume", ax.d3.Q.class, x.class, null, "local", f51, false, true, false, "NameUp");
        w0 = f42 = new f("chrome_volume", ax.d3.Q.class, x.class, null, "local", f51, false, true, false, "NameUp");
        x0 = f41 = new f("sdcard_volume", ax.d3.Q.class, x.class, null, "local", f51, false, true, true, "NameUp");
        y0 = f40 = new f("library", null, null, null, null, null, false, false, false, null);
        z0 = f39 = new f("image", P.class, u.class, "/", "image", f40, false, true, false, "DateDown");
        A0 = f51 = new f("audio", P.class, u.class, "/", "audio", f40, false, true, false, "DateDown");
        B0 = f38 = new f("video", P.class, u.class, "/", "video", f40, false, true, false, "DateDown");
        C0 = f37 = new f("document", P.class, u.class, "/", "local", f40, false, true, false, "DateDown");
        D0 = f36 = new f("archive", P.class, u.class, "/", "local", f40, false, true, false, "DateDown");
        E0 = new f("favorite", null, null, null, null, null, false, false, false, "NameUp");
        F0 = f35 = new f("new_files", V.class, B.class, "/", "new_files", null, true, false, false, "TypeUp");
        G0 = f40 = new f("remote", h0.class, null, null, null, null, false, false, false, null);
        H0 = f34 = new f("FTP", ax.d3.K.class, com.alphainventor.filemanager.file.q.class, "/", "ftp", f40, true, true, false, "NameUp");
        I0 = f33 = new f("SFTP", p0.class, com.alphainventor.filemanager.file.L.class, "/", "sftp", f40, true, true, false, "NameUp");
        J0 = f32 = new f("SMB", q0.class, com.alphainventor.filemanager.file.Q.class, "/", "smb", f40, true, true, false, "NameUp");
        K0 = f31 = new f("webdav", v0.class, com.alphainventor.filemanager.file.W.class, "/", "webdav", f40, true, true, false, "NameUp");
        L0 = new f("local_network", null, null, null, null, null, false, false, false, "NameUp");
        M0 = f30 = new f("cloud", r.class, null, null, null, null, false, false, false, null);
        N0 = f29 = new f("dropbox", y.class, k.class, "/", "dropbox", f30, true, true, false, "NameUp");
        O0 = f28 = new f("googledrive", ax.d3.L.class, com.alphainventor.filemanager.file.r.class, "/", "googledrive", f30, true, true, false, "NameUp");
        P0 = f27 = new f("onedrive", a0.class, OneDriveFileHelper.class, "/", "onedrive", f30, true, true, false, "NameUp");
        Q0 = f26 = new f("yandexdisk", D0.class, Y.class, "/", "yandex", f30, true, true, false, "NameUp");
        R0 = f25 = new f("pcloud", c0.class, I.class, "/", "pcloud", f30, true, true, false, "NameUp");
        S0 = f24 = new f("box", o.class, com.alphainventor.filemanager.file.d.class, "/", "box", f30, true, true, false, "NameUp");
        T0 = f23 = new f("nextcloud", W.class, D.class, "/", "nextcloud", f30, true, true, false, "NameUp");
        U0 = f22 = new f("owncloud", b0.class, H.class, "/", "owncloud", f30, true, true, false, "NameUp");
        V0 = new f("app", ax.d3.j.class, null, "/", "apps", null, false, true, false, "NameUp");
        W0 = new f("server", ax.d3.l0.class, null, null, null, null, false, false, false, null);
        X0 = new f("archiveviewer", l.class, com.alphainventor.filemanager.file.b.class, "/", "archiveviewer", null, false, true, false, "NameUp");
        Y0 = new f("add_network", null, null, null, null, null, false, false, false, null);
        Z0 = new f("premium", null, null, null, null, null, false, false, false, null);
        a1 = new f("debug", null, null, null, null, null, false, false, false, null);
        b1 = new f("usb", u0.class, com.alphainventor.filemanager.file.U.class, "/", "usb", null, false, true, false, "NameUp");
        c1 = f21 = new f("usbdocument", t0.class, m0.class, "/", "usbdoc", null, false, true, false, "NameUp");
        d1 = f20 = new f("sdcard_document", i0.class, ax.c3.h0.class, "/", "sdcarddoc", null, false, true, false, "NameUp");
        e1 = f19 = new f("odd_document", X.class, ax.c3.Q.class, "/", "odddoc", null, false, true, false, "NameUp");
        f1 = f18 = new f("chrome_document", q.class, ax.c3.e.class, "/", "chromedoc", null, false, true, false, "NameUp");
        g1 = f17 = new f("unknown_document", r0.class, l0.class, "/", "unknowndoc", null, false, true, false, "NameUp");
        h1 = f16 = new f("mtp_document", U.class, L.class, "/", "mtpdoc", null, false, true, false, "NameUp");
        i1 = f15 = new f("storage_analysis", ax.d3.b.class, null, null, null, null, false, false, false, null);
        j1 = f14 = new f("large_files", N.class, s.class, "/", "local", f15, false, false, false, "SizeDown");
        k1 = f13 = new f("large_folders", O.class, t.class, "/", "local", f15, false, false, false, "SizeDown");
        l1 = f12 = new f("app_cache", c.class, a.class, "/", "local", f15, false, false, false, "SizeDown");
        m1 = f11 = new f("dup_files", z.class, com.alphainventor.filemanager.file.l.class, "/", "local", f15, false, false, false, "SizeDown");
        n1 = f10 = new f("dup_downloads", z.class, com.alphainventor.filemanager.file.l.class, "/", "local", f15, false, false, false, "SizeDown");
        o1 = f9 = new f("recycle_bin", g0.class, com.alphainventor.filemanager.file.J.class, "/", "recyclebin", null, false, false, false, "DateDown");
        p1 = f8 = new f("recycle_bin_card", f0.class, null, "/", null, null, false, false, false, null);
        q1 = new f("appstats", d.class, null, "/", null, f15, false, false, false, "SizeDown");
        r1 = new f("unused_apps", s0.class, null, "/", null, f15, false, false, false, "SizeDown");
        s1 = new f("search_result", j0.class, null, "/", "search_result", null, true, false, false, "None");
        t1 = new f("", null, null, null, null, null, false, false, false, null);
        H1 = f.d();
        u1 = null;
        v1 = Arrays.asList(f34, f33, f32, f31, f29, f28, f27, f26, f25, f23, f22, f24);
        w1 = Arrays.asList(f34, f33, f32, f31);
        x1 = Arrays.asList(f50, f49, f41, f20, f44, f43, f21);
        y1 = Arrays.asList(f50, f49, f41, f48, f47, f46, f45, f44, f43, f42);
        z1 = Arrays.asList(f50, f49);
        A1 = Arrays.asList(f39, f38, f51, f45, f34, f33);
        B1 = Arrays.asList(f49, f41, f44, f43, f42);
        C1 = Arrays.asList(f21, f20, f19, f18, f17);
        D1 = Arrays.asList(f16);
        E1 = Arrays.asList(f39, f38, f51, f37, f36);
        F1 = Arrays.asList(f50, f49, f48, f47, f35, f39, f38, f51, f37, f36);
        G1 = Arrays.asList(f40, f30, f15, f14, f13, f12, f8, f9, f10, f11);
    }

    private f(String string2, Class<? extends n> clazz, Class<? extends m> clazz2, String string3, String string4, f f8, boolean bl, boolean bl2, boolean bl3, String string5) {
        this.q = string2;
        this.c0 = string3;
        this.e0 = f8;
        this.f0 = bl;
        this.g0 = bl2;
        this.d0 = string4;
        this.i0 = string5;
        this.j0 = clazz;
        this.k0 = clazz2;
        this.h0 = bl3;
    }

    public static boolean A0(f f8) {
        return f.j0(f8) || f.g0(f8) || f8 == F0 || f8 == j1 || f8 == k1 || f8 == n1 || f8 == m1 || f8 == o1 || f8 == l1;
        {
        }
    }

    public static List<f> B() {
        return E1;
    }

    public static boolean B0(f f8) {
        return f.F0(f8) && f8 != P0;
    }

    public static List<f> C() {
        return G1;
    }

    public static boolean C0(f f8) {
        return f.p0(f8);
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f D(String string) {
        synchronized (f.class) {
            Throwable throwable2;
            f f82;
            block6: {
                try {
                    for (f f82 : f.values()) {
                        boolean bl = f82.I().equals(string);
                        if (!bl) {
                            continue;
                        }
                        break block6;
                    }
                }
                catch (Throwable throwable2) {}
                return null;
            }
            return f82;
            throw throwable2;
        }
    }

    public static boolean D0(f f8) {
        return f8 == H0 || f8 == I0;
        {
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f E(String object) {
        synchronized (f.class) {
            if (u1 != null) return u1.get(object);
            Object object2 = new HashMap();
            u1 = object2;
            for (Object object3 : f.values()) {
                if (((f)((Object)object3)).K() == null) continue;
                u1.put(((f)((Object)object3)).K(), (f)((Object)object3));
                u1.put(((f)((Object)object3)).t(), (f)((Object)object3));
            }
            try {
                Object object3;
                object3 = u1;
                object2 = t0;
                ((HashMap)object3).put("local", object2);
                u1.put(((f)((Object)object2)).t(), (f)((Object)object2));
                return u1.get(object);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static boolean E0(f f8, com.alphainventor.filemanager.file.n n8) {
        return f8.O() || ax.c3.d0.E(n8) && f.g0(f8);
        {
        }
    }

    public static int F(f f8, int n8) {
        if (f8 == X0) {
            return 0;
        }
        return n8;
    }

    public static boolean F0(f f8) {
        if (f.n0(f8)) {
            return true;
        }
        if (f.e0(f8)) {
            return true;
        }
        return f.o0(f8);
    }

    public static String G(Context object, K k8) {
        if ((object = T.b((Context)object, k8.d())) != null) {
            return ((T)object).f(k8.b()).b();
        }
        return null;
    }

    public static String H(Context context, K k8) {
        ax.c3.g0 g02 = T.d(context, k8.d());
        if (g02 != null) {
            return g02.f(k8.b()).f();
        }
        return k8.f(context);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static K L(K k8) {
        f f8 = k8.d();
        if (f.j0(f8)) {
            if (f.i0(f8)) {
                return k8;
            }
            if (o0 == f8) {
                return k8;
            }
            if (s0 != f8) return K.f;
            return k8;
        }
        K k9 = k8;
        if (f.e0(f8)) return k9;
        if (!f.o0(f8)) return null;
        return k8;
    }

    private int N() {
        return b.l(this);
    }

    private boolean O() {
        return this.f0;
    }

    public static boolean Q(K k8) {
        if (!Q.L()) {
            return false;
        }
        return k8 == K.e || k8 == K.f || k8 == K.g;
        {
        }
    }

    public static boolean R(K k8) {
        if (!Q.L()) {
            return false;
        }
        return k8 == K.e || k8 == K.f || k8 == K.g;
        {
        }
    }

    public static boolean S(f f8) {
        return f8.J() == i1;
    }

    public static boolean T(f f8) {
        return f.U(f8);
    }

    public static boolean U(f f8) {
        if (Q.m() && f8 == v0) {
            return true;
        }
        return f8 == o0 || f8 == p0;
        {
        }
    }

    public static boolean V(f f8) {
        if (f.i0(f8)) {
            return true;
        }
        return f.e0(f8);
    }

    public static boolean X(f f8) {
        return f8.J() == M0;
    }

    public static boolean Y(f f8) {
        return com.alphainventor.filemanager.file.e.class.isAssignableFrom(f8.x());
    }

    public static boolean Z(f f8) {
        return f.n0(f8) ^ true;
    }

    public static boolean a0(f f8) {
        return f8 == d1 || f8 == x0 || f8 == u0 || f8 == v0 || f8 == c1 || f8 == b1 || f8 == f1 || f8 == w0 || f8 == e1 || f8 == g1 || f8 == h1;
        {
        }
    }

    public static boolean b0(f f8) {
        if (f8 == o0) {
            return true;
        }
        return f.c0(f8);
    }

    public static boolean c0(f f8) {
        if (f.i0(f8)) {
            return true;
        }
        return f.e0(f8);
    }

    private static /* synthetic */ f[] d() {
        return new f[]{l0, m0, n0, o0, p0, q0, r0, s0, t0, u0, v0, w0, x0, y0, z0, A0, B0, C0, D0, E0, F0, G0, H0, I0, J0, K0, L0, M0, N0, O0, P0, Q0, R0, S0, T0, U0, V0, W0, X0, Y0, Z0, a1, b1, c1, d1, e1, f1, g1, h1, i1, j1, k1, l1, m1, n1, o1, p1, q1, r1, s1, t1};
    }

    public static boolean d0(f object) {
        if ((object = object.A()) == null) {
            return false;
        }
        return E.class.isAssignableFrom((Class<?>)object);
    }

    public static boolean e0(f f8) {
        return C1.contains((Object)f8);
    }

    public static boolean f0(f f8) {
        return f8 == o0 || f8 == p0;
        {
        }
    }

    public static boolean g0(f f8) {
        return E1.contains((Object)f8);
    }

    public static boolean h(f f8) {
        return x1.contains((Object)f8);
    }

    public static boolean h0(com.alphainventor.filemanager.file.n n8) {
        if (!(n8 instanceof v)) {
            return false;
        }
        return ax.c3.d0.E(n8);
    }

    public static boolean i0(f f8) {
        return B1.contains((Object)f8);
    }

    public static boolean j(f f8) {
        return f.j0(f8) || f.g0(f8);
        {
        }
    }

    public static boolean j0(f f8) {
        return y1.contains((Object)f8);
    }

    public static boolean k0(f f8) {
        return z1.contains((Object)f8);
    }

    public static boolean l(f f8) {
        return F1.contains((Object)f8);
    }

    public static boolean l0(f f8) {
        return f.j0(f8) || f.e0(f8) || f.o0(f8);
        {
        }
    }

    public static boolean m0(f f8) {
        return f8 == z0 || f8 == B0 || f8 == A0;
        {
        }
    }

    public static boolean n(f f8) {
        if (!f.d0(f8)) {
            return false;
        }
        return !G1.contains((Object)f8);
    }

    public static boolean n0(f f8) {
        return v1.contains((Object)f8);
    }

    public static boolean o0(f f8) {
        return D1.contains((Object)f8);
    }

    public static f p(String string) {
        for (f f8 : f.values()) {
            if (!f8.I().equals(string)) continue;
            return f8;
        }
        return null;
    }

    public static boolean p0(f f8) {
        return w1.contains((Object)f8);
    }

    public static String q() {
        File file = Environment.getExternalStoragePublicDirectory((String)Environment.DIRECTORY_DCIM);
        File file2 = new File(file, "Camera");
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        file2 = new File(file, "100ANDRO");
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        file2 = new File(file, "100MEDIA");
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        return file.getAbsolutePath();
    }

    public static boolean r0(K k8, boolean bl) {
        int n8 = k8.d().ordinal();
        if (n8 != 3) {
            if (n8 != 4) {
                if (n8 != 7) {
                    if (n8 != 22) {
                        if (n8 != 48) {
                            switch (n8) {
                                default: {
                                    switch (n8) {
                                        default: {
                                            return true;
                                        }
                                        case 42: 
                                        case 43: 
                                        case 44: 
                                        case 45: 
                                        case 46: {
                                            return j.F().l0(k8);
                                        }
                                    }
                                }
                                case 9: 
                                case 10: 
                                case 11: 
                                case 12: {
                                    return j.F().l0(k8);
                                }
                            }
                        }
                    } else {
                        if (com.alphainventor.filemanager.file.q.D0(k8.b())) {
                            return ax.c3.x.e(k8).a();
                        }
                        return true;
                    }
                }
                return j.F().l0(k8);
            }
            return j.F().t0();
        }
        if (bl) {
            return e.K();
        }
        return true;
    }

    public static boolean s0(f f8) {
        if (!f.A0(f8)) {
            return false;
        }
        return !f.x0(f8) && f8 != l1 && f8 != s0;
        {
        }
    }

    public static boolean t0(f f8) {
        return f8 == p0 || f8 == d1 || f8 == x0;
        {
        }
    }

    public static String u() {
        try {
            String string = Environment.getExternalStoragePublicDirectory((String)Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
            return string;
        }
        catch (Exception exception) {
            ax.Ha.c.h().f().b("DOWNLOAD PATH ERROR").l(exception).h();
            return ax.c3.d0.Q(e.v(), "Download");
        }
    }

    public static boolean u0(f f8) {
        return f8 == o0;
    }

    public static boolean v0(f f8) {
        return f.X(f8) || f8 == K0 || f.h(f8);
        {
        }
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    public static f[] values() {
        return (f[])H1.clone();
    }

    public static String w() {
        if (!J.B() && new File("/storage/emulated/999").exists()) {
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

    public static boolean w0(f f8) {
        return f8 == u0 || f8 == v0 || f8 == c1;
        {
        }
    }

    public static boolean x0(f f8) {
        return f8 == u0 || f8 == v0 || f8 == c1 || f8 == b1;
        {
        }
    }

    public static boolean y0(f f8) {
        return f8 == v0 || f8 == c1;
        {
        }
    }

    public static boolean z0(f f8) {
        return f.x0(f8);
    }

    public Class<? extends n> A() {
        if (l0 == this) {
            return ax.d3.v.class;
        }
        return this.j0;
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
        return context.getString(this.N());
    }

    public boolean P() {
        return this.g0;
    }

    public boolean W() {
        return this == N0 || f.A0(this) || f.c0(this);
        {
        }
    }

    public boolean q0() {
        if (this == o0) {
            return j.F().o0();
        }
        if (this == p0) {
            return j.F().w0();
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("dir_");
        stringBuilder.append(this.d0);
        return stringBuilder.toString();
    }

    public String toString() {
        return this.q;
    }

    public Class<? extends m> x() {
        return this.k0;
    }
}

