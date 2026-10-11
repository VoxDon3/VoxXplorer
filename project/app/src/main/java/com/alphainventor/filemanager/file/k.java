/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.G4.B;
import ax.G4.J;
import ax.G4.K;
import ax.G4.L;
import ax.G4.M;
import ax.G4.P;
import ax.G4.Q;
import ax.G4.S0;
import ax.G4.T0;
import ax.G4.W;
import ax.G4.X;
import ax.G4.Z;
import ax.G4.e;
import ax.G4.f;
import ax.G4.f0;
import ax.G4.h;
import ax.G4.i;
import ax.G4.i0;
import ax.G4.j0;
import ax.G4.o;
import ax.G4.q0;
import ax.G4.s0;
import ax.G4.t;
import ax.G4.u0;
import ax.G4.v0;
import ax.G4.w0;
import ax.Q2.d;
import ax.Z2.s;
import ax.c3.G;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.e0;
import ax.c3.g;
import ax.c3.k0;
import ax.p4.j;
import ax.p4.r;
import ax.p4.x;
import ax.u3.q;
import com.alphainventor.filemanager.file.T;
import com.alphainventor.filemanager.file.c;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.p;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class k
extends m {
    private static final Logger o = Logger.getLogger("FileManager.DropboxFileHelper");
    static a p;
    static final HashSet<String> q;
    private ax.x4.a h;
    private b i;
    private c.a j;
    private boolean k;
    private boolean l;
    private String m;
    private boolean n;

    static {
        q = new HashSet<String>(Arrays.asList("jpg", "jpeg", "png", "tiff", "tif", "gif", "webp", "ppm", "bmp", "svg", "heic", "cr2", "crw", "nef", "nrw", "sr2", "dng", "arw", "orf", "mp4", "m4v", "3gp", "3gpp", "3gpp2", "webm", "mkv", "wmv", "avi", "mpg", "mpeg", "mov", "asf", "ogv", "ts", "mts", "vob", "pdf"));
    }

    private static boolean C0(Activity activity) {
        com.alphainventor.filemanager.file.k.t0((Context)activity);
        try {
            com.dropbox.core.android.a.b((Context)activity, g.c((Context)activity).a(ax.Q2.f.N0), com.alphainventor.filemanager.file.k.v0());
            return true;
        }
        catch (IllegalStateException illegalStateException) {
            ax.Ha.c.h().d("Dropbox OAuth Error").l(illegalStateException).h();
            return false;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void D0(ax.x4.a a8, G g8, long l8, Long l9, String string, boolean bl, ax.u3.c c8, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
        Throwable throwable222;
        e0 e02;
        block25: {
            int n8 = g8.a() ? 2 : 1;
            Object object = null;
            int n9 = 0;
            while (n9 < n8) {
                block23: {
                    block24: {
                        u0 u02;
                        block22: {
                            block21: {
                                e02 = new e0(g8.b(), 0L, l8, c8, i8);
                                object = a8.a();
                                try {
                                    u02 = ((f)object).v(string).e(Boolean.FALSE);
                                    if (!bl) break block21;
                                    u02.g(T0.d);
                                    break block22;
                                }
                                catch (ax.p4.t t8) {
                                    break block23;
                                }
                                catch (x x8) {
                                    break block24;
                                }
                            }
                            u02.g(T0.c);
                        }
                        if (l9 != null && l9 > 0L) {
                            object = new Date(l9);
                            u02.f((Date)object);
                        }
                        object = l8 >= 0L ? (t)u02.c(e02, l8) : (t)u02.b(e02);
                        ((InputStream)e02).close();
                        return;
                        catch (ax.p4.t t9) {
                            // empty catch block
                        }
                        break block23;
                        catch (x x9) {
                            // empty catch block
                        }
                    }
                    ((Throwable)object).printStackTrace();
                }
                ((Throwable)object).printStackTrace();
                try {
                    ((InputStream)e02).close();
                }
                catch (IOException iOException) {}
                catch (IOException iOException) {
                    return;
                }
                ++n9;
            }
            throw ax.b3.d.b("Maxed out upload attempts to Dropbox", object);
            catch (Throwable throwable222) {
                break block25;
            }
            catch (IOException iOException) {
            }
            catch (j j8) {
                throw this.p0("dropbox uploadfile", j8);
            }
            catch (w0 w02) {
                throw this.p0("upload", w02);
            }
            if (!(iOException.getCause() instanceof ax.b3.a)) throw ax.b3.d.b("dropbox uploadfile", iOException);
            throw (ax.b3.a)iOException.getCause();
        }
        try {
            ((InputStream)e02).close();
        }
        catch (IOException iOException) {
            throw throwable222;
        }
        throw throwable222;
    }

    private ax.b3.j E0(String string, j j8, S0 s02) {
        if (s02.e()) {
            return new ax.b3.s(string, j8);
        }
        if (s02.f()) {
            return new ax.b3.e(string, j8);
        }
        if (s02.d()) {
            return new ax.b3.o(string, j8);
        }
        return null;
    }

    static /* synthetic */ boolean m0(k k8, boolean bl) {
        k8.k = bl;
        return bl;
    }

    /*
     * Exception decompiling
     */
    private void o0(ax.x4.a var1_1, G var2_7, long var3_10, Long var5_11, String var6_12, boolean var7_13, ax.u3.c var8_14, ax.g3.i var9_15) throws ax.b3.j, ax.b3.a {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [13, 12, 11, 10, 9, 8, 7 : 241->246)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private ax.b3.j p0(String string, j j8) {
        Object object;
        Object object2;
        if (j8 instanceof ax.p4.t) {
            return new ax.b3.q(string, j8);
        }
        if (j8 instanceof ax.p4.a) {
            return new ax.b3.e(string, j8);
        }
        if (j8 instanceof ax.p4.d && ((ax.p4.d)j8).a() == 507) {
            return new ax.b3.s(string, j8);
        }
        if (j8 instanceof ax.G4.p) {
            object2 = (ax.G4.p)j8;
            object = ((ax.G4.p)object2).d0;
            if (object != null && ((o)object).c() && ((ax.G4.p)object2).d0.b() != null && (object = this.u0(string, j8, ((ax.G4.p)object2).d0.b())) != null) {
                return object;
            }
        }
        if (j8 instanceof w0) {
            object = (w0)j8;
            object2 = ((w0)object).d0;
            if (object2 != null && ((v0)object2).d() && ((w0)object).d0.c() != null && ((w0)object).d0.c().a() != null && (object = this.E0(string, j8, ((w0)object).d0.c().a())) != null) {
                return object;
            }
        }
        if (j8 instanceof X) {
            object2 = (X)j8;
            object = ((X)object2).d0;
            if (object != null) {
                if (((W)object).n()) {
                    return new ax.b3.s(string, j8);
                }
                if (((X)object2).d0.l() && ((X)object2).d0.j() != null ? (object = this.u0(string, j8, ((X)object2).d0.j())) != null : ((X)object2).d0.m() && ((X)object2).d0.k() != null && (object = this.E0(string, j8, ((X)object2).d0.k())) != null) {
                    return object;
                }
            }
        }
        if (j8 instanceof K) {
            object2 = (K)j8;
            object = ((K)object2).d0;
            if (object != null && ((J)object).d() && ((K)object2).d0.c() != null && (object = this.u0(string, j8, ((K)object2).d0.c())) != null) {
                return object;
            }
        }
        if (j8 instanceof i) {
            object = (i)j8;
            object2 = ((i)object).d0;
            if (object2 != null && (((h)object2).e() && ((i)object).d0.c() != null ? (object = this.u0(string, j8, ((i)object).d0.c())) != null : ((i)object).d0.f() && ((i)object).d0.d() != null && (object = this.E0(string, j8, ((i)object).d0.d())) != null)) {
                return object;
            }
        }
        return new ax.b3.j(string, j8);
    }

    static ax.x4.a q0(String string) {
        return new ax.x4.a(com.alphainventor.filemanager.file.k.v0(), string);
    }

    static ax.x4.a r0(ax.u4.a a8) {
        return new ax.x4.a(com.alphainventor.filemanager.file.k.v0(), a8);
    }

    public static a s0(Context context) {
        if (p == null) {
            p = new a(context.getApplicationContext());
        }
        return p;
    }

    private static void t0(Context context) {
    }

    private ax.b3.j u0(String string, j j8, M m8) {
        if (m8.b()) {
            return new ax.b3.t(j8);
        }
        if (m8.c()) {
            return new ax.b3.e(string, j8);
        }
        return null;
    }

    private static ax.p4.m v0() {
        return ax.p4.m.e("FileManager/2.7.8").b(ax.s4.b.e).a();
    }

    private void w0(boolean bl) {
        c.a a8 = this.j;
        if (a8 != null) {
            a8.T(bl, null);
        }
    }

    @Override
    public InputStream A(String object, String string, String string2) {
        object = this.h;
        if (object == null) {
            return null;
        }
        try {
            object = ((ax.x4.b)object).a().l(string).d(q0.q).e(s0.d0).c().b();
            return object;
        }
        catch (j j8) {
            j8.printStackTrace();
            return null;
        }
    }

    void A0(String string) {
        this.m = string;
    }

    @Override
    public boolean B(n n8) {
        return true;
    }

    void B0(boolean bl) {
        this.n = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<n> C(n object, m.f object2) throws ax.b3.j {
        if (!object.n()) throw new ax.b3.t();
        ax.u3.b.c(object.isDirectory());
        if (!this.a()) {
            ax.Ha.c.h().f().b("NOT CONNECT CALL LISTCHILDREN").j().h();
            throw new ax.b3.h("Not connected to server");
        }
        object = (ax.c3.m)object;
        try {
            object = d0.E((n)object) ? "" : ((n)object).E();
        }
        catch (j j8) {
            throw this.p0("listChildren", j8);
        }
        object2 = new ArrayList();
        object = this.h.a().n((String)object);
        while (true) {
            Object object3;
            if ((object3 = ((L)object).b()) != null) {
                Iterator<P> iterator = object3.iterator();
                while (iterator.hasNext()) {
                    object3 = iterator.next();
                    if (((P)object3).b() == null && ((P)object3).c() == null) continue;
                    ax.c3.m m8 = new ax.c3.m(this, (P)object3);
                    object2.add(m8);
                }
            }
            if (!((L)object).c()) {
                return object2;
            }
            object = this.h.a().p(((L)object).a());
        }
    }

    @Override
    public void D(n object, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
        ax.u3.b.a(object.n());
        object = ((n)object).E();
        if (l8 >= 0x400000L && l8 != -1L) {
            this.o0(this.h, g8, l8, l9, (String)object, false, c8, i8);
            return;
        }
        this.D0(this.h, g8, l8, l9, (String)object, false, c8, i8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void E(n object, n n8, ax.u3.c c8, ax.g3.i i8) throws ax.b3.j {
        IllegalArgumentException illegalArgumentException2;
        block4: {
            ax.u3.b.a(n8.n());
            try {
                long l8 = object.p();
                object = this.h.a().r(((n)object).E(), n8.E());
                if (object != null && ((Z)object).a() != null) {
                    if (i8 == null) return;
                    i8.a(l8, l8);
                    return;
                }
            }
            catch (IllegalArgumentException illegalArgumentException2) {
                break block4;
            }
            catch (j j8) {
                throw this.p0("moveFile", j8);
            }
            object = new ax.b3.j("null result");
            throw object;
        }
        d.c("dropbox move", illegalArgumentException2);
        throw new ax.b3.j("moveFile", illegalArgumentException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void F(n object, n n8, ax.u3.c c8, ax.g3.i i8) throws ax.b3.j {
        ax.u3.b.a(n8.n());
        try {
            long l8 = object.p();
            object = this.h.a().b(((n)object).E(), n8.E());
            if (object != null && ((Z)object).a() != null) {
                if (i8 == null) return;
                i8.a(l8, l8);
                return;
            }
        }
        catch (j j8) {
            throw this.p0("copyFile", j8);
        }
        object = new ax.b3.j("Dropbox copy returns null entry");
        throw object;
    }

    @Override
    public int G(String string, String string2) {
        return -1;
    }

    @Override
    public String H(n n8) {
        if (q.contains(n8.A())) {
            return ax.c3.B.Y(n8);
        }
        return null;
    }

    @Override
    public void I(n n8) throws ax.b3.j {
        j j82;
        block3: {
            try {
                this.h.a().f(n8.E());
                return;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (j j82) {
                break block3;
            }
            ax.Ha.b b8 = ax.Ha.c.h().f().b("Dropbox Delete").l(illegalArgumentException);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("path:");
            stringBuilder.append(n8.E());
            b8.g(stringBuilder.toString()).h();
            throw new ax.b3.j(illegalArgumentException);
        }
        j82.printStackTrace();
        throw this.p0("deleteFile", j82);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream J(n comparable, long l8) throws ax.b3.j {
        ax.p4.f f82;
        block6: {
            j j82;
            block5: {
                if (!this.a()) {
                    throw new ax.b3.h("Not connected : dropbox");
                }
                try {
                    ax.G4.n n8 = this.h.a().h(((n)comparable).E());
                    if (l8 <= 0L) return n8.c().b();
                    n8.b(l8);
                    return n8.c().b();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                }
                catch (j j82) {
                    break block5;
                }
                catch (ax.p4.f f82) {
                    break block6;
                }
                ax.Ha.b b8 = ax.Ha.c.h().f().b("dropbox path problem");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("path:");
                stringBuilder.append(((n)comparable).E());
                b8.g(stringBuilder.toString()).h();
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append("dropbox getInputStream : ");
                ((StringBuilder)comparable).append(illegalArgumentException.getMessage());
                throw new ax.b3.j(((StringBuilder)comparable).toString(), illegalArgumentException);
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("dropbox getinputstream : ");
            ((StringBuilder)comparable).append(j82.getMessage());
            throw this.p0(((StringBuilder)comparable).toString(), j82);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("dropbox getinputstream : ");
        stringBuilder.append(f82.b());
        stringBuilder.append(" ; ");
        stringBuilder.append(f82.getMessage());
        throw this.p0(stringBuilder.toString(), f82);
    }

    @Override
    public void K(Activity activity, Fragment object, c.a a8) {
        if (!this.k) {
            CharSequence charSequence;
            Object object2 = ax.Q2.f.N0;
            Object object3 = new c0((ax.Q2.f)((Object)object2));
            Object object4 = this.p().getSharedPreferences("DropboxPrefs", 0);
            object = new StringBuilder();
            ((StringBuilder)object).append("version_");
            ((StringBuilder)object).append(this.t());
            int n8 = object4.getInt(((StringBuilder)object).toString(), 0);
            Object var8_9 = null;
            if (n8 == 0) {
                object = new StringBuilder();
                ((StringBuilder)object).append("access_token_");
                ((StringBuilder)object).append(this.t());
                object = object4.getString(((StringBuilder)object).toString(), null);
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("credential_");
                ((StringBuilder)object3).append(this.t());
                object3 = object4.getString(((StringBuilder)object3).toString(), null);
            } else {
                object = ax.Y2.a.a().b((ax.Q2.f)((Object)object2));
                charSequence = new StringBuilder();
                charSequence.append("access_token_");
                charSequence.append(this.t());
                object = ((c0)object3).a(n8, (String)object, object4.getString(charSequence.toString(), null));
                charSequence = ax.Y2.a.a().b((ax.Q2.f)((Object)object2));
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("credential_");
                ((StringBuilder)object2).append(this.t());
                object3 = ((c0)object3).a(n8, (String)charSequence, object4.getString(((StringBuilder)object2).toString(), null));
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("app_rootspaceid_");
            ((StringBuilder)object2).append(this.t());
            charSequence = object4.getString(((StringBuilder)object2).toString(), null);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("app_userootspace_");
            ((StringBuilder)object2).append(this.t());
            boolean bl = object4.getBoolean(((StringBuilder)object2).toString(), false);
            this.A0((String)charSequence);
            this.B0(bl);
            object4 = var8_9;
            if (object3 != null) {
                try {
                    object4 = ax.u4.a.f.i((String)object3);
                }
                catch (ax.t4.a a9) {
                    object4 = var8_9;
                }
            }
            this.j = a8;
            a8.B();
            if (object == null && object4 == null) {
                if (activity == null) {
                    this.w0(false);
                } else {
                    this.k = bl = com.alphainventor.filemanager.file.k.C0(activity);
                    if (!bl) {
                        this.w0(false);
                    }
                }
            } else {
                new c(this, activity, (String)object, (ax.u4.a)object4).i(new Void[0]);
            }
        }
    }

    @Override
    public boolean L() {
        return false;
    }

    @Override
    public boolean M(n object) {
        j j82;
        block5: {
            block4: {
                try {
                    object = this.h.a().d(((n)object).E(), false);
                    if (object == null) break block4;
                }
                catch (j j82) {
                    break block5;
                }
                object = ((e)object).a();
                if (object != null) {
                    return true;
                }
            }
            return false;
        }
        j82.printStackTrace();
        return false;
    }

    @Override
    public boolean N(n n8) {
        return this.l(n8);
    }

    @Override
    public boolean O() {
        return true;
    }

    @Override
    public void P(n n8) throws ax.b3.j {
        this.I(n8);
    }

    @Override
    public boolean Q(n n8, n n9) {
        return true;
    }

    @Override
    public boolean Y() {
        return true;
    }

    @Override
    public boolean a() {
        return this.h != null;
    }

    @Override
    public void b() {
    }

    @Override
    public boolean g0() {
        return true;
    }

    @Override
    public boolean h0() {
        return true;
    }

    @Override
    public void j0(n object, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
        object = ((n)object).E();
        if (l8 >= 0x400000L && l8 != -1L) {
            this.o0(this.h, g8, l8, l9, (String)object, true, c8, i8);
            return;
        }
        this.D0(this.h, g8, l8, l9, (String)object, true, c8, i8);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive exception aggregation
     */
    @Override
    void m(n object, String iterator, boolean bl, boolean bl2, ax.g3.h h8, ax.u3.c object2) throws ax.b3.j {
        synchronized (this) {
            RuntimeException var1_3;
            block9: {
                j j82;
                block10: {
                    block11: {
                        if (bl2) break block11;
                        try {
                            this.o((n)object, (String)((Object)iterator), bl, bl2, h8, (ax.u3.c)object2);
                            return;
                        }
                        catch (Throwable throwable) {
                            break block9;
                        }
                    }
                    object = "/".equals(((n)object).E()) ? "" : ((n)object).E();
                    catch (Throwable throwable) {
                        break block9;
                    }
                    catch (j j82) {
                        break block10;
                    }
                    iterator = this.h.a().t((String)((Object)iterator));
                    ((i0)((Object)iterator)).b(f0.a().d((String)object).c(1000L).b(Boolean.TRUE).a());
                    iterator = ((i0)((Object)iterator)).a();
                    object = new Object();
                    if (iterator != null && ((j0)((Object)iterator)).a() != null) {
                        iterator = ((j0)((Object)iterator)).a().iterator();
                        while (iterator.hasNext()) {
                            P p8;
                            object2 = iterator.next().a();
                            if (object2 == null || !((Q)object2).c() || (p8 = ((Q)object2).b()).b() == null && p8.c() == null) continue;
                            object2 = new ax.c3.m(this, p8);
                            object.add((n)object2);
                        }
                    }
                    h8.Y(ax.c3.B.h(object, null, bl, false), true);
                    return;
                }
                j82.printStackTrace();
                throw this.p0("doSearch", j82);
            }
            throw var1_3;
        }
    }

    public void x0() {
        if (this.k) {
            this.l = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public k0 y() throws ax.b3.j {
        ax.M4.g g8;
        try {
            ax.M4.h h8 = this.h.b().b();
            g8 = h8.a();
            if (g8.f()) {
                return new k0(g8.c().a(), h8.b());
            }
        }
        catch (j j8) {
            throw this.p0("storagespace", j8);
        }
        if (!g8.g()) return null;
        return new k0(g8.d().a(), g8.d().b());
    }

    public void y0() {
        Object object;
        if (this.k && this.l && ((object = this.i) == null || ((Object)((Object)((q)object).m())).equals((Object)q.f.d0))) {
            object = com.dropbox.core.android.a.a();
            if (object != null) {
                this.i = object = new b(this.p(), this, this.j, (ax.u4.a)object);
                ((q)object).i(new Void[0]);
            } else {
                this.j.T(false, null);
            }
            this.k = false;
            this.l = false;
            this.j = null;
        }
    }

    @Override
    public n z(String string) throws ax.b3.j {
        if ("/".equals(string)) {
            return new ax.c3.m(this, "/");
        }
        if (this.a()) {
            j j82;
            block7: {
                try {
                    ax.c3.m m8 = new ax.c3.m(this, this.h.a().j(string));
                    return m8;
                }
                catch (Exception exception) {
                }
                catch (j j82) {
                    break block7;
                }
                exception.printStackTrace();
                throw ax.b3.d.b("dropbox getfileinfo", exception);
            }
            if (j82 instanceof B) {
                B b8 = (B)j82;
                if (b8.d0.c() && b8.d0.b() == M.c) {
                    return new ax.c3.m(this, string);
                }
            }
            throw this.p0("getFileInfo", j82);
        }
        ax.Ha.c.h().f().b("NOT CONNECT CALL GET FILE INFO").j().h();
        throw new ax.b3.h("Not connected to server");
    }

    void z0(ax.x4.a a8) {
        if (this.n && !TextUtils.isEmpty((CharSequence)this.m)) {
            o.fine("Use dropbox team space");
            this.h = a8.d(ax.C4.a.c(this.m));
            return;
        }
        o.fine("Use dropbox user space");
        this.h = a8;
    }

    public static class a
    extends T {
        Context a;
        boolean b;
        b c;
        WeakReference<ax.g3.k> d;

        public a(Context context) {
            this.a = context;
        }

        @Override
        public void a(int n8) {
            Object object = this.a.getSharedPreferences("DropboxPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("app_userid_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("app_accountid_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("access_token_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("credential_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("app_name_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("location_name_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("app_email_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("app_rootspaceid_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("app_userootspace_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("created_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("sortindex_");
            ((StringBuilder)object).append(n8);
            stringBuilder.remove(((StringBuilder)object).toString()).commit();
        }

        @Override
        public s f(int n8) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("DropboxPrefs", 0);
            CharSequence charSequence = new StringBuilder();
            charSequence.append("app_name_");
            charSequence.append(n8);
            charSequence = sharedPreferences.getString(charSequence.toString(), null);
            Object object = new StringBuilder();
            ((StringBuilder)object).append("app_email_");
            ((StringBuilder)object).append(n8);
            object = sharedPreferences.getString(((StringBuilder)object).toString(), null);
            if (!TextUtils.isEmpty((CharSequence)object)) {
                charSequence = object;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("location_name_");
            ((StringBuilder)object).append(n8);
            String string = ((StringBuilder)object).toString();
            object = ax.Q2.f.N0;
            string = sharedPreferences.getString(string, ((ax.Q2.f)((Object)object)).M(this.a));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("created_");
            stringBuilder.append(n8);
            long l8 = sharedPreferences.getLong(stringBuilder.toString(), 0L);
            stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            return new s((ax.Q2.f)((Object)object), n8, string, (String)charSequence, null, null, l8, sharedPreferences.getLong(stringBuilder.toString(), 0L));
        }

        @Override
        public void g(int n8, String string) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("DropboxPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("location_name_");
            stringBuilder.append(n8);
            editor.putString(stringBuilder.toString(), string);
            editor.commit();
        }

        @Override
        public void j(int n8, long l8) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("DropboxPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            editor.putLong(stringBuilder.toString(), l8);
            editor.apply();
        }

        public void k(Activity activity, ax.g3.k k8) {
            boolean bl;
            this.d = new WeakReference<ax.g3.k>(k8);
            ax.Q2.f f8 = ax.Q2.f.N0;
            k8.b(f8);
            this.b = bl = com.alphainventor.filemanager.file.k.C0(activity);
            if (!bl) {
                k8.a(f8, null, 0, null, null);
            }
        }

        public void l(Activity activity, ax.g3.k k8, int n8, boolean bl) {
            this.s(n8, bl);
            if (k8 != null) {
                k8.c(ax.Q2.f.N0, n8);
            }
        }

        int m(String string, String string2) {
            Context context = this.a;
            context = context.getSharedPreferences("DropboxPrefs", 0);
            int n8 = context.getInt("count", 0);
            for (int i8 = 0; i8 < n8; ++i8) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("app_accountid_");
                stringBuilder.append(i8);
                if (context.contains(stringBuilder.toString())) {
                    if (TextUtils.isEmpty((CharSequence)string)) continue;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("app_accountid_");
                    stringBuilder.append(i8);
                    if (!string.equals(context.getString(stringBuilder.toString(), null))) continue;
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("app_name_");
                    stringBuilder.append(i8);
                    if (!context.contains(stringBuilder.toString()) || TextUtils.isEmpty((CharSequence)string2)) continue;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("app_name_");
                    stringBuilder.append(i8);
                    if (!string2.equals(context.getString(stringBuilder.toString(), null))) continue;
                }
                return i8;
            }
            return -1;
        }

        int n() {
            return this.a.getSharedPreferences("DropboxPrefs", 0).getInt("count", 0);
        }

        public List<s> o() {
            ArrayList<s> arrayList = new ArrayList<s>();
            Context context = this.a;
            context = context.getSharedPreferences("DropboxPrefs", 0);
            int n8 = context.getInt("count", 0);
            for (int i8 = 0; i8 < n8; ++i8) {
                CharSequence charSequence = new StringBuilder();
                charSequence.append("credential_");
                charSequence.append(i8);
                charSequence = context.getString(charSequence.toString(), null);
                CharSequence charSequence2 = new StringBuilder();
                charSequence2.append("access_token_");
                charSequence2.append(i8);
                charSequence2 = context.getString(charSequence2.toString(), null);
                if (charSequence == null && charSequence2 == null) continue;
                arrayList.add(this.f(i8));
            }
            return arrayList;
        }

        public void p(Activity object) {
            Object object2;
            if (this.b && ((object2 = this.c) == null || ((Object)((Object)((q)object2).m())).equals((Object)q.f.d0))) {
                object2 = (ax.g3.k)this.d.get();
                if (object2 != null) {
                    ax.u4.a a8 = com.dropbox.core.android.a.a();
                    if (a8 != null) {
                        object = new b((Context)object, (ax.g3.k)object2, a8);
                        this.c = object;
                        ((q)object).i(new Void[0]);
                    } else {
                        object2.a(ax.Q2.f.N0, null, 0, null, null);
                    }
                }
                this.b = false;
            }
        }

        void q(int n8, ax.u4.a a8) {
            ax.Q2.f f8 = ax.Q2.f.N0;
            c0 c02 = new c0(f8);
            SharedPreferences.Editor editor = this.a.getSharedPreferences("DropboxPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            editor.putInt(stringBuilder.toString(), 3);
            stringBuilder = new StringBuilder();
            stringBuilder.append("credential_");
            stringBuilder.append(n8);
            editor.putString(stringBuilder.toString(), c02.e(ax.Y2.a.a().b(f8), a8.toString()));
            editor.commit();
        }

        void r(int n8, String charSequence, String charSequence2, String string, String string2, String string3, ax.u4.a a8) {
            Context context = this.a;
            boolean bl = false;
            if (n8 >= (context = context.getSharedPreferences("DropboxPrefs", 0)).getInt("count", 0)) {
                bl = true;
            }
            ax.Q2.f f8 = ax.Q2.f.N0;
            c0 c02 = new c0(f8);
            context = context.edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("app_accountid_");
            stringBuilder.append(n8);
            stringBuilder = context.putString(stringBuilder.toString(), (String)charSequence);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("version_");
            ((StringBuilder)charSequence).append(n8);
            charSequence = stringBuilder.putInt(((StringBuilder)charSequence).toString(), 3);
            stringBuilder = new StringBuilder();
            stringBuilder.append("app_name_");
            stringBuilder.append(n8);
            charSequence = charSequence.putString(stringBuilder.toString(), (String)charSequence2);
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("access_token_");
            ((StringBuilder)charSequence2).append(n8);
            charSequence2 = charSequence.putString(((StringBuilder)charSequence2).toString(), c02.e(ax.Y2.a.a().b(f8), string3));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("app_email_");
            ((StringBuilder)charSequence).append(n8);
            charSequence = charSequence2.putString(((StringBuilder)charSequence).toString(), string);
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("app_rootspaceid_");
            ((StringBuilder)charSequence2).append(n8);
            charSequence = charSequence.putString(((StringBuilder)charSequence2).toString(), string2);
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("location_name_");
            ((StringBuilder)charSequence2).append(n8);
            charSequence.putString(((StringBuilder)charSequence2).toString(), f8.M(this.a));
            if (a8 != null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("credential_");
                ((StringBuilder)charSequence).append(n8);
                context.putString(((StringBuilder)charSequence).toString(), c02.e(ax.Y2.a.a().b(f8), a8.toString()));
            } else {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("credential_");
                ((StringBuilder)charSequence).append(n8);
                context.putString(((StringBuilder)charSequence).toString(), null);
            }
            if (bl) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("created_");
                ((StringBuilder)charSequence).append(n8);
                context.putLong(((StringBuilder)charSequence).toString(), System.currentTimeMillis());
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("sortindex_");
                ((StringBuilder)charSequence).append(n8);
                context.putLong(((StringBuilder)charSequence).toString(), System.currentTimeMillis());
            }
            if (bl) {
                context.putInt("count", n8 + 1);
            }
            context.commit();
        }

        void s(int n8, boolean bl) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("DropboxPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("app_userootspace_");
            stringBuilder.append(n8);
            editor.putBoolean(stringBuilder.toString(), bl);
            editor.commit();
        }
    }

    private static class b
    extends q<Void, Void, Integer> {
        private c.a h;
        ax.g3.k i;
        ax.u4.a j;
        Context k;
        k l;
        int m;

        public b(Context context, ax.g3.k k8, ax.u4.a a8) {
            super(q.e.c0);
            this.k = context;
            this.i = k8;
            this.j = a8;
        }

        public b(Context context, k k8, c.a a8, ax.u4.a a9) {
            super(q.e.c0);
            this.k = context;
            this.h = a8;
            this.j = a9;
            this.l = k8;
        }

        /*
         * Unable to fully structure code
         * Could not resolve type clashes
         */
        protected Integer w(Void ... var1_1) {
            block22: {
                block21: {
                    block20: {
                        var1_1 /* !! */  = "";
                        var6_3 = this.j;
                        if (var6_3 == null) {
                            return -1;
                        }
                        var13_5 = com.alphainventor.filemanager.file.k.r0((ax.u4.a)var6_3);
                        var12_6 = null;
                        var8_7 = null;
                        var14_8 = var13_5.b().a();
                        var9_9 = var14_8.c().a();
                        var10_10 /* !! */  = var14_8.a();
                        var6_3 = var8_7;
                        try {
                            var11_11 = var14_8.b();
                            var6_3 = var8_7;
                            var1_1 /* !! */  = var11_11;
                            var7_12 /* !! */  = var12_6;
                        }
                        catch (j var7_13) {
                            var7_12 /* !! */  = var1_1 /* !! */ ;
                            var1_1 /* !! */  = var10_10 /* !! */ ;
lbl22:
                            // 2 sources

                            while (true) {
                                var8_7 = var9_9;
                                break;
                            }
                        }
                        if (this.i == null) break block20;
                        var6_3 = var8_7;
                        var1_1 /* !! */  = var11_11;
                        var7_12 /* !! */  = var12_6;
                        if (var14_8.d() == null) break block20;
                        var6_3 = var8_7;
                        var1_1 /* !! */  = var11_11;
                        var6_3 = var8_7 = var14_8.d().b();
                        var1_1 /* !! */  = var11_11;
                        var12_6 = var14_8.d().a();
                        var6_3 = var8_7;
                        var1_1 /* !! */  = var11_11;
                        var7_12 /* !! */  = var8_7;
                        if (TextUtils.isEmpty((CharSequence)var8_7)) break block20;
                        var6_3 = var8_7;
                        var1_1 /* !! */  = var11_11;
                        var7_12 /* !! */  = var8_7;
                        if (TextUtils.isEmpty((CharSequence)var12_6)) break block20;
                        var6_3 = var8_7;
                        var1_1 /* !! */  = var11_11;
                        var5_14 = var8_7.equals(var12_6);
                        var7_12 /* !! */  = var8_7;
                        if (var5_14) break block20;
                        var2_15 = 1;
                        var7_12 /* !! */  = var8_7;
                        break block21;
                    }
                    var2_15 = 0;
                }
                var1_1 /* !! */  = var7_12 /* !! */ ;
                var6_3 = var9_9;
                var7_12 /* !! */  = var11_11;
                var3_16 = var2_15;
                break block22;
                catch (j var1_2) {
                    var1_1 /* !! */  = "";
                    var6_3 = null;
                    var7_12 /* !! */  = "";
                    ** continue;
                }
                catch (j var6_4) {
                    var9_9 = "";
                    var6_3 = null;
                    var7_12 /* !! */  = "";
                    var8_7 = var1_1 /* !! */ ;
                    var1_1 /* !! */  = var9_9;
                }
                var9_9 = var6_3;
                var3_16 = 0;
                var10_10 /* !! */  = var1_1 /* !! */ ;
                var6_3 = var8_7;
                var1_1 /* !! */  = var9_9;
            }
            var9_9 = com.alphainventor.filemanager.file.k.s0(this.k);
            var8_7 = this.l;
            if (var8_7 != null) {
                var2_15 = var8_7.t();
            } else {
                var2_15 = var9_9.n();
                var4_17 = var9_9.m((String)var10_10 /* !! */ , (String)var6_3);
                if (var4_17 >= 0) {
                    var2_15 = var4_17;
                }
            }
            var9_9.r(var2_15, (String)var10_10 /* !! */ , (String)var6_3, (String)var7_12 /* !! */ , (String)var1_1 /* !! */ , null, this.j);
            this.m = var2_15;
            if (this.i != null && var3_16 != 0) {
                return -2;
            }
            var6_3 = this.l;
            if (var6_3 != null) {
                var6_3.A0((String)var1_1 /* !! */ );
                this.l.z0(var13_5);
            }
            return 0;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        protected void x(Integer object) {
            if ((Integer)object == 0) {
                object = this.h;
                if (object != null) {
                    object.T(true, null);
                }
                if ((object = this.i) == null) return;
                object.c(ax.Q2.f.N0, this.m);
                return;
            }
            if ((Integer)object == -2) {
                try {
                    this.i.d(ax.Q2.f.N0, this.m, null);
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    Object object2 = this.h;
                    if (object2 != null) {
                        object2.T(false, null);
                    }
                    if ((object2 = this.i) == null) return;
                    object2.a(ax.Q2.f.N0, null, 0, null, null);
                    return;
                }
            } else {
                object = this.h;
                if (object != null) {
                    object.T(false, null);
                }
                if ((object = this.i) == null) return;
                object.a(ax.Q2.f.N0, null, 0, null, null);
            }
        }
    }

    private class c
    extends q<Void, Void, Integer> {
        Activity h;
        ax.u4.a i;
        String j;
        final k k;

        public c(k k8, Activity activity, String string, ax.u4.a a8) {
            this.k = k8;
            super(q.e.c0);
            this.j = string;
            this.i = a8;
            this.h = activity;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Integer w(Void ... object) {
            r r82;
            block12: {
                j j82;
                block11: {
                    block13: {
                        boolean bl;
                        block10: {
                            block9: {
                                try {
                                    object = this.i;
                                    if (object == null) break block9;
                                    object = com.alphainventor.filemanager.file.k.r0((ax.u4.a)object);
                                    break block10;
                                }
                                catch (j j82) {
                                    break block11;
                                }
                                catch (r r82) {
                                    break block12;
                                }
                            }
                            object = this.j;
                            if (object == null) break block13;
                            object = com.alphainventor.filemanager.file.k.q0((String)object);
                        }
                        Object object2 = this.i;
                        if (object2 != null && ((ax.u4.a)object2).i() != null && (bl = this.i.a())) {
                            try {
                                ((ax.x4.a)object).c();
                                com.alphainventor.filemanager.file.k.s0(this.k.p()).q(this.k.t(), this.i);
                            }
                            catch (ax.u4.c c8) {
                                return -2;
                            }
                        }
                        Object object3 = ((ax.x4.b)object).b().a();
                        Object object4 = this.k.p().getSharedPreferences("DropboxPrefs", 0);
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("app_email_");
                        ((StringBuilder)object2).append(this.k.t());
                        String string = ((StringBuilder)object2).toString();
                        object2 = null;
                        string = object4.getString(string, null);
                        CharSequence charSequence = new StringBuilder();
                        charSequence.append("app_rootspaceid_");
                        charSequence.append(this.k.t());
                        object4 = object4.getString(charSequence.toString(), null);
                        if (((ax.M4.c)object3).d() != null) {
                            object2 = ((ax.M4.c)object3).d().b();
                        }
                        if (!ax.u3.B.j(string, charSequence = ((ax.M4.c)object3).b()) || !ax.u3.B.j(object4, object2)) {
                            string = ((ax.M4.c)object3).c().a();
                            object3 = ((ax.M4.c)object3).a();
                            com.alphainventor.filemanager.file.k.s0(this.k.p()).r(this.k.t(), (String)object3, string, (String)charSequence, (String)object2, this.j, this.i);
                        }
                        this.k.A0((String)object2);
                        this.k.z0((ax.x4.a)object);
                        return 0;
                    }
                    return -2;
                }
                j82.printStackTrace();
                return -1;
            }
            r82.printStackTrace();
            return -2;
        }

        protected void x(Integer n8) {
            if (n8 == 0) {
                this.k.w0(true);
                return;
            }
            if (n8 == -1) {
                this.k.w0(false);
                return;
            }
            if (n8 == -2) {
                n8 = this.h;
                if (n8 == null) {
                    this.k.w0(false);
                    return;
                }
                com.alphainventor.filemanager.file.k.m0(this.k, com.alphainventor.filemanager.file.k.C0((Activity)n8));
                if (!this.k.k) {
                    this.k.w0(false);
                }
            }
        }
    }
}

