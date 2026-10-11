/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.Z2.s;
import ax.b3.l;
import ax.b3.t;
import ax.c3.B;
import ax.c3.G;
import ax.c3.Z;
import ax.c3.a0;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.g;
import ax.c3.k0;
import ax.g3.h;
import ax.g3.k;
import ax.la.A;
import ax.la.a;
import ax.la.i;
import ax.la.j;
import ax.la.q;
import ax.la.r;
import ax.la.u;
import ax.la.x;
import ax.la.y;
import ax.xc.f;
import com.alphainventor.filemanager.file.T;
import com.alphainventor.filemanager.file.c;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.p;
import com.pcloud.sdk.AuthorizationActivity;
import com.pcloud.sdk.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class I
extends m {
    private static final Logger l = Logger.getLogger("FileManager.PCloudFileHelper");
    private static final String m = StandardCharsets.UTF_8.name();
    private static d n;
    private a h;
    private A i;
    private x j;
    private final Object k = new Object();

    public static /* synthetic */ void k0(ax.g3.i i8, long l8, long l9) {
        if (i8 != null) {
            i8.a(l8, l9);
        }
    }

    private void n0() throws ax.b3.h {
        if (this.a()) {
            return;
        }
        throw new ax.b3.h("Not connected");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private ax.b3.j o0(String string, Exception exception) {
        if (exception instanceof ax.la.b) {
            int n8 = ((ax.la.b)exception).a();
            if (n8 == 2003 || n8 == 1000 || n8 == 2007) return new ax.b3.e(exception);
            if (this.t0(n8)) {
                return new t();
            }
            if (n8 == 2008) {
                return new ax.b3.s(exception);
            }
            if (n8 == 2006) {
                return new ax.b3.k();
            }
            if (n8 == 2004) {
                return new ax.b3.f(false);
            }
            if (n8 != 2028) return ax.b3.d.b(string, exception);
            return new l(exception);
        }
        if (!(exception instanceof ax.na.a)) return ax.b3.d.b(string, exception);
        return new ax.b3.i(String.format("Error (%s)", ((ax.na.a)exception).a()), exception);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void p0(n i8, boolean bl) throws ax.b3.j {
        this.n0();
        if (!i8.n()) throw new t();
        try {
            String string = this.q0(((n)((Object)i8)).E());
            i8 = i8.isDirectory() ? this.h.k(string, bl) : this.h.h(string);
        }
        catch (Exception exception) {
            throw this.o0("deleteFile", exception);
        }
        i8 = i8.execute();
        if (i8 != null && ((Boolean)((Object)i8)).booleanValue()) {
            return;
        }
        i8 = new ax.b3.j("Failed to delete");
        throw i8;
    }

    private String q0(String string) throws UnsupportedEncodingException {
        return j.URLEncoder.encode((String)string, (String)m);
    }

    public static d r0(Context context) {
        if (n == null) {
            n = new d(context.getApplicationContext());
        }
        return n;
    }

    private x s0() {
        if (this.j == null) {
            int n8;
            int n9 = n8 = (int)(ax.u3.B.s(this.p()) * 128.0f);
            if (n8 > 1024) {
                n9 = 1024;
            }
            this.j = new x(n9, n9);
        }
        return this.j;
    }

    private boolean t0(int n8) {
        return n8 == 2055 || n8 == 2001 || n8 == 2002 || n8 == 2009 || n8 == 2005;
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void u0(a a8, A a9) {
        Object object = this.k;
        synchronized (object) {
            this.h = a8;
            this.i = a9;
            return;
        }
    }

    private static void v0(ax.u3.c c8) throws ax.b3.b {
        if (c8 != null && c8.isCancelled()) {
            throw new ax.b3.b();
        }
    }

    private void w0(n n8, G g8, String string, long l8, Long l9, boolean bl, ax.u3.c c8, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
        if (!bl) {
            ax.u3.b.a(n8.n());
        }
        this.n0();
        if (c8 != null && c8.isCancelled()) {
            throw new ax.b3.a();
        }
        if (l8 < 0L) {
            this.y0(n8, g8, string, l9, bl, c8, i8);
            return;
        }
        this.x0(n8, g8, string, l8, l9, bl, c8, i8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void x0(n object, G object2, String m8, long l8, Long object3, boolean bl, ax.u3.c object4, ax.g3.i object5) throws ax.b3.j, ax.b3.a {
        IOException iOException2;
        block6: {
            try {
                m8 = new ax.la.m(this, (ax.u3.c)object4, (G)object2, l8){
                    final ax.u3.c b;
                    final G c;
                    final long d;
                    final I e;
                    {
                        this.e = i8;
                        this.b = c8;
                        this.c = g8;
                        this.d = l8;
                    }

                    @Override
                    public long a() {
                        return this.d;
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    @Override
                    public void b(f f8) throws IOException {
                        int n8;
                        byte[] byArray;
                        I.v0(this.b);
                        InputStream inputStream = this.c.b();
                        try {
                            byArray = new byte[8192];
                            while (true) {
                                I.v0(this.b);
                                n8 = inputStream.read(byArray);
                                if (n8 >= 0) break block10;
                                break;
                            }
                        }
                        catch (Throwable throwable) {
                            if (inputStream == null) throw throwable;
                            try {
                                inputStream.close();
                                throw throwable;
                            }
                            catch (Throwable throwable2) {
                                try {
                                    throwable.addSuppressed(throwable2);
                                    throw throwable;
                                }
                                catch (ax.b3.j j8) {
                                    throw new IOException(j8);
                                }
                            }
                        }
                        {
                            block10: {
                                inputStream.close();
                                I.v0(this.b);
                                return;
                            }
                            if (n8 == 0) continue;
                            f8.write(byArray, 0, n8);
                            continue;
                        }
                    }
                };
                object2 = object3 != null ? new Date((Long)object3) : null;
            }
            catch (Exception exception) {
                throw this.o0("writeFile", exception);
            }
            catch (IOException iOException2) {
                break block6;
            }
            catch (ax.b3.j j8) {
                throw j8;
            }
            object3 = new Z((ax.g3.i)object5);
            object4 = y.a();
            if (bl) {
                ((y.a)object4).b(bl);
            }
            object5 = this.q0(((n)object).T());
            object2 = this.h.b((String)object5, ((n)object).B(), m8, (Date)object2, (r)object3, ((y.a)object4).a()).execute();
            if (bl) return;
            if (object2 == null) return;
            if (object2.a() == null) return;
            if (object2.a().equals(((n)object).B())) {
                return;
            }
            object = new ax.b3.f(object2.f());
            throw object;
        }
        if (!ax.b3.d.d(iOException2, ax.b3.b.class)) throw this.o0("writeFile", iOException2);
        throw new ax.b3.a(iOException2);
    }

    /*
     * Exception decompiling
     */
    private void y0(n var1_1, G var2_21, String var3_22, Long var4_23, boolean var5_24, ax.u3.c var6_25, ax.g3.i var7_26) throws ax.b3.j, ax.b3.a {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [44 : 317->326)] java.lang.Throwable
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

    /*
     * Unable to fully structure code
     */
    @Override
    public InputStream A(String var1_1, String var2_3, String var3_4) throws IOException {
        block10: {
            block12: {
                block11: {
                    block9: {
                        var6_5 = null;
                        if (var3_4 == null) ** GOTO lbl7
                        try {
                            block13: {
                                if (!var3_4.startsWith("fileid=")) break block13;
                                var1_1 = Uri.decode((String)var3_4.substring(7));
                                ** GOTO lbl18
                            }
                            if ((var1_1 = (a0)this.z((String)var2_3)) == null) break block9;
                        }
                        catch (ax.b3.j | Exception | NumberFormatException var1_2) {
                            var2_3 = var6_5;
                            ** continue;
                        }
                        if (var1_1.n()) break block9;
                        return null;
                    }
                    var1_1 = var1_1.t();
lbl18:
                    // 2 sources

                    if (this.h == null) {
                        return null;
                    }
                    var2_3 = var6_5;
                    if (var1_1 == null) break block10;
                    var2_3 = var6_5;
                    if (var1_1.isEmpty()) break block10;
                    if (var1_1.charAt(0) == 'f') break block11;
                    var2_3 = var6_5;
                    break block10;
                }
                var4_6 = a0.g0((String)var1_1);
                if (var4_6 >= 0L) break block12;
                return null;
            }
            var2_3 = this.h.f(var4_6, this.s0(), true).execute().V0();
        }
lbl37:
        // 2 sources

        return var2_3;
    }

    @Override
    public boolean B(n n8) {
        return true;
    }

    @Override
    public List<n> C(n object, m.f object2) throws ax.b3.j {
        if (object.n()) {
            Exception exception2;
            block5: {
                if (this.h == null) {
                    boolean bl = this.a();
                    boolean bl2 = this.h == null;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("FolderApi == null:connected = ");
                    ((StringBuilder)object).append(bl);
                    ((StringBuilder)object).append(":");
                    ((StringBuilder)object).append(bl2);
                    object = new ax.b3.j(((StringBuilder)object).toString());
                    ax.Q2.d.b((Throwable)object);
                    throw object;
                }
                ax.u3.b.c(object.isDirectory());
                try {
                    object2 = new ArrayList();
                    String string = this.q0(((n)object).E());
                    for (u u8 : this.h.l(string).execute().k()) {
                        string = d0.Q(((n)object).E(), u8.a());
                        a0 a02 = new a0(this, object.t(), u8, string);
                        object2.add(a02);
                    }
                }
                catch (Exception exception2) {
                    break block5;
                }
                return object2;
            }
            throw this.o0("listChildren", exception2);
        }
        throw new t();
    }

    @Override
    public void D(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
        this.w0(n8, g8, string, l8, l9, false, c8, i8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void E(n object, n object2, ax.u3.c object3, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
        ax.u3.b.a(object2.n());
        if (!object.n()) throw new t();
        this.n0();
        try {
            object3 = this.q0(((n)object).E());
            object2 = this.q0(((n)object2).E());
            if (object.isDirectory()) {
                if (this.h.a((String)object3, (String)object2).execute() != null) {
                    return;
                }
                object = new ax.b3.j("No moved Folder");
                throw object;
            }
        }
        catch (Exception exception) {
            throw this.o0("moveFile", exception);
        }
        if (this.h.i((String)object3, (String)object2).execute() != null) {
            return;
        }
        object = new ax.b3.j("No moved file");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void F(n object, n object2, ax.u3.c object3, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
        if (!object.n()) throw new t();
        this.n0();
        try {
            object3 = this.q0(((n)object).E());
            object2 = this.q0(((n)object2).E());
            if (this.h.d((String)object3, (String)object2, false).execute() != null) {
                if (i8 == null) return;
                long l8 = object.p();
                i8.a(l8, l8);
                return;
            }
        }
        catch (Exception exception) {
            throw this.o0("copyFile", exception);
        }
        object = new ax.b3.j("No copied file");
        throw object;
    }

    @Override
    public int G(String string, String string2) {
        return -1;
    }

    @Override
    public String H(n n8) {
        if (((a0)n8).h0()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fileid=");
            stringBuilder.append(Uri.encode((String)n8.t()));
            return B.a0(n8, stringBuilder.toString());
        }
        return null;
    }

    @Override
    public void I(n n8) throws ax.b3.j {
        this.p0(n8, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream J(n object, long l8) throws ax.b3.j {
        Object object2;
        if (!object.n()) throw new t();
        this.n0();
        if (((a0)object).f0() == null) throw new t();
        try {
            object2 = ax.la.n.b().c(true).d(true).a();
            object = this.q0(((n)object).E());
            object = this.h.g((String)object, (ax.la.n)object2).execute();
            object = object != null ? object.a() : null;
        }
        catch (Exception exception) {
            throw this.o0("getInputStream", exception);
        }
        catch (ax.b3.j j8) {
            throw j8;
        }
        if (object == null) {
            object = new ax.b3.j("No pCloud download URL");
            throw object;
        }
        object2 = (HttpURLConnection)((URL)object).openConnection();
        long l9 = l8 - 0L;
        long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
        if (l10 > 0) {
            object = new StringBuilder();
            ((StringBuilder)object).append("bytes=");
            ((StringBuilder)object).append(l8);
            ((StringBuilder)object).append("-");
            ((URLConnection)object2).setRequestProperty("Range", ((StringBuilder)object).toString());
        }
        int n8 = ((HttpURLConnection)object2).getResponseCode();
        if (l10 > 0 && n8 != 206) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Range request failed: ");
            ((StringBuilder)object2).append(n8);
            object = new IOException(((StringBuilder)object2).toString());
            throw object;
        }
        if (n8 >= 200 && n8 < 300) {
            return ((URLConnection)object2).getInputStream();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("HTTP status: ");
        ((StringBuilder)object).append(n8);
        object2 = new IOException(((StringBuilder)object).toString());
        throw object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void K(Activity activity, Fragment object, c.a a8) {
        block7: {
            if (a8 != null) {
                a8.B();
            }
            int n8 = this.t();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            SharedPreferences sharedPreferences = this.p().getSharedPreferences("PCloudCloudPrefs", 0);
            object = new StringBuilder();
            ((StringBuilder)object).append("accountid_");
            ((StringBuilder)object).append(n8);
            sharedPreferences.getString(((StringBuilder)object).toString(), null);
            object = new StringBuilder();
            ((StringBuilder)object).append("email_");
            ((StringBuilder)object).append(n8);
            String string = sharedPreferences.getString(((StringBuilder)object).toString(), null);
            try {
                ax.Q2.f f8 = ax.Q2.f.R0;
                Object object2 = new c0(f8);
                object = new StringBuilder();
                ((StringBuilder)object).append("version_");
                ((StringBuilder)object).append(this.t());
                int n9 = sharedPreferences.getInt(((StringBuilder)object).toString(), 0);
                object = new StringBuilder();
                ((StringBuilder)object).append("token_");
                ((StringBuilder)object).append(this.t());
                object = sharedPreferences.getString(((StringBuilder)object).toString(), null);
                if (n9 != 0) {
                    object = ((c0)object2).a(n9, ax.Y2.a.a().b(f8), (String)object);
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("apihost_");
                ((StringBuilder)object2).append(n8);
                String string2 = sharedPreferences.getString(((StringBuilder)object2).toString(), null);
                if (!TextUtils.isEmpty((CharSequence)object) && !TextUtils.isEmpty((CharSequence)string2)) {
                    object = q.a().b(ax.la.e.b((String)object)).c(string2).a();
                    object.j().A(new j<A>(){
                        final a a;
                        final String b;
                        final int c;
                        final AtomicBoolean d;
                        final AtomicInteger e;
                        final c.a f;
                        final Activity g;
                        final I h;
                        {
                            this.h = i8;
                            this.a = a8;
                            this.b = string;
                            this.c = n8;
                            this.d = atomicBoolean;
                            this.e = atomicInteger;
                            this.f = a9;
                            this.g = activity;
                        }

                        @Override
                        public void a(i<A> object, Throwable object2) {
                            this.h.u0(null, null);
                            boolean bl = object2 instanceof ax.la.b && ((ax.la.b)object2).a() == 2095;
                            if (this.d.compareAndSet(false, true)) {
                                this.e.set(2);
                                this.h.f0(new Runnable(){
                                    final b c0;
                                    final boolean q;
                                    {
                                        this.c0 = b8;
                                        this.q = bl;
                                    }

                                    @Override
                                    public void run() {
                                        if (this.q) {
                                            Object object = this.c0.g;
                                            if (object != null && !object.isFinishing()) {
                                                d d8 = I.r0((Context)this.c0.g);
                                                object = this.c0;
                                                d8.x(object.g, object.f, object.c);
                                                return;
                                            }
                                            object = this.c0.f;
                                            if (object != null) {
                                                object.T(false, null);
                                                return;
                                            }
                                        } else {
                                            c.a a8 = this.c0.f;
                                            if (a8 != null) {
                                                a8.T(false, null);
                                            }
                                        }
                                    }
                                });
                                return;
                            }
                            int n8 = this.e.get();
                            object2 = ax.Ha.c.h().f().d("PCloud onConnectResult Twice 2");
                            object = new StringBuilder();
                            ((StringBuilder)object).append("called:");
                            ((StringBuilder)object).append(n8);
                            ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
                        }

                        public void c(i<A> object, A object2) {
                            this.h.u0(this.a, (A)object2);
                            if (TextUtils.isEmpty((CharSequence)this.b)) {
                                I.r0(this.h.p()).v(this.c, (A)object2);
                            }
                            if (this.d.compareAndSet(false, true)) {
                                this.e.set(1);
                                this.h.d0(this.f, true, null);
                                return;
                            }
                            int n8 = this.e.get();
                            object2 = ax.Ha.c.h().f().d("PCloud onConnectResult Twice 1");
                            object = new StringBuilder();
                            ((StringBuilder)object).append("called:");
                            ((StringBuilder)object).append(n8);
                            ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
                        }
                    });
                    return;
                }
            }
            catch (Exception exception) {
                break block7;
            }
            try {
                this.u0(null, null);
                this.d0(a8, false, null);
                return;
            }
            catch (Exception exception) {}
        }
        this.u0(null, null);
        this.d0(a8, false, null);
    }

    @Override
    public boolean L() {
        return false;
    }

    @Override
    public boolean M(n n8) {
        Object object;
        block5: {
            if (!this.a()) {
                return false;
            }
            try {
                object = this.q0(n8.E());
                object = this.h.n((String)object).execute();
                if (object != null) break block5;
                return false;
            }
            catch (Exception exception) {
                return false;
            }
        }
        if (!n8.B().equals(object.a())) {
            object.delete();
            return false;
        }
        return true;
    }

    @Override
    public boolean N(n n8) {
        Object object;
        block6: {
            if (!this.a()) {
                return false;
            }
            if (n8.n()) {
                return false;
            }
            try {
                ax.la.m m8 = ax.la.m.a;
                object = this.q0(n8.T());
                object = this.h.e((String)object, n8.B(), m8, y.c).execute();
                if (object != null) break block6;
                return false;
            }
            catch (Exception exception) {
                return false;
            }
        }
        if (!n8.B().equals(object.a())) {
            object.delete();
            return false;
        }
        return true;
    }

    @Override
    public boolean O() {
        return true;
    }

    @Override
    public void P(n n8) throws ax.b3.j {
        this.p0(n8, false);
    }

    @Override
    public boolean Q(n n8, n n9) {
        return true;
    }

    @Override
    public boolean Y() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean a() {
        Object object = this.k;
        synchronized (object) {
            if (this.h == null) return false;
            return true;
        }
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
    public void j0(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
        this.w0(n8, g8, string, l8, l9, true, c8, i8);
    }

    @Override
    void m(n n8, String string, boolean bl, boolean bl2, h h8, ax.u3.c c8) throws ax.b3.j {
        if (!bl2) {
            this.o(n8, string, bl, bl2, h8, c8);
            return;
        }
        this.n0();
        this.o(n8, string, bl, bl2, h8, c8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public k0 y() throws ax.b3.j {
        this.n0();
        Object object = this.h.j();
        try {
            object = object.execute();
            if (object != null) {
                return new k0(object.a(), object.c());
            }
        }
        catch (Exception exception) {
            throw this.o0("getStorageSpace", exception);
        }
        catch (ax.b3.j j8) {
            throw j8;
        }
        object = new ax.b3.j("No pCloud user info");
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public n z(String object) throws ax.b3.j {
        this.n0();
        if (d0.a.equals(object)) {
            return new a0(this, (String)object);
        }
        try {
            Object object2 = this.q0((String)object);
            object2 = this.h.m((String)object2).execute();
            return new a0(this, a0.i0(object2.m()), (u)object2, (String)object);
        }
        catch (Exception exception) {
            if (!(exception instanceof ax.la.b)) throw this.o0("getFileInfo", exception);
            if (!this.t0(((ax.la.b)exception).a())) throw this.o0("getFileInfo", exception);
            try {
                return new a0(this, (a0)this.z(d0.r((String)object)), (String)object);
            }
            catch (ax.b3.j j8) {
                throw this.o0("getFileInfo", exception);
            }
        }
    }

    public static class d
    extends T {
        private Context a;
        private k b;
        private c.a c;
        private int d;
        private boolean e;
        c0 f;

        public d(Context context) {
            this.a = context;
            this.f = new c0(ax.Q2.f.R0);
        }

        static /* synthetic */ k l(d d8, k k8) {
            d8.b = k8;
            return k8;
        }

        static /* synthetic */ c.a n(d d8, c.a a8) {
            d8.c = a8;
            return a8;
        }

        @Override
        public void a(int n8) {
            Object object = this.a.getSharedPreferences("PCloudCloudPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("accountid_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("email_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("location_name_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("created_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("apihost_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("token_");
            stringBuilder.append(n8);
            object.remove(stringBuilder.toString()).commit();
        }

        @Override
        public s f(int n8) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("PCloudCloudPrefs", 0);
            CharSequence charSequence = new StringBuilder();
            charSequence.append("email_");
            charSequence.append(n8);
            charSequence = sharedPreferences.getString(charSequence.toString(), null);
            Object object = new StringBuilder();
            ((StringBuilder)object).append("location_name_");
            ((StringBuilder)object).append(n8);
            String string = ((StringBuilder)object).toString();
            object = ax.Q2.f.R0;
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
            SharedPreferences.Editor editor = this.a.getSharedPreferences("PCloudCloudPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("location_name_");
            stringBuilder.append(n8);
            editor.putString(stringBuilder.toString(), string);
            editor.apply();
        }

        @Override
        public void j(int n8, long l8) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("PCloudCloudPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            editor.putLong(stringBuilder.toString(), l8);
            editor.apply();
        }

        public void q(com.alphainventor.filemanager.activity.a a8, k k8) {
            k8.b(ax.Q2.f.R0);
            this.b = k8;
            this.w(a8, false);
        }

        int r(String string) {
            Context context = this.a;
            context = context.getSharedPreferences("PCloudCloudPrefs", 0);
            int n8 = context.getInt("count", 0);
            for (int i8 = 0; i8 < n8; ++i8) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("accountid_");
                stringBuilder.append(i8);
                if (!context.contains(stringBuilder.toString()) || TextUtils.isEmpty((CharSequence)string)) continue;
                stringBuilder = new StringBuilder();
                stringBuilder.append("accountid_");
                stringBuilder.append(i8);
                if (!string.equals(context.getString(stringBuilder.toString(), null))) continue;
                return i8;
            }
            return -1;
        }

        int s() {
            return this.a.getSharedPreferences("PCloudCloudPrefs", 0).getInt("count", 0);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void t(int n8, Intent object) {
            Object object2;
            block12: {
                Object object3;
                block10: {
                    block11: {
                        if (object == null) {
                            object = this.c;
                            if (object == null) return;
                            object.T(false, null);
                            this.c = null;
                            return;
                        }
                        try {
                            object = AuthorizationActivity.h((Intent)object);
                            object3 = ((com.pcloud.sdk.a)object).c0;
                            n8 = com.alphainventor.filemanager.file.I$c.a[((Enum)object3).ordinal()];
                            if (n8 == 1) break block10;
                            if (n8 == 2) break block11;
                            if (n8 != 3) {
                                if (n8 != 4) {
                                    return;
                                }
                                object = this.c;
                                if (object == null) return;
                                object.T(false, null);
                                this.c = null;
                                return;
                            }
                        }
                        catch (NullPointerException nullPointerException) {
                            break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            break block12;
                        }
                        k k8 = this.b;
                        if (k8 != null) {
                            ax.Q2.f f8 = ax.Q2.f.R0;
                            object3 = new StringBuilder();
                            ((StringBuilder)object3).append("Account access grant error:\n");
                            ((StringBuilder)object3).append(((com.pcloud.sdk.a)object).i0);
                            k8.a(f8, "", 0, "", ((StringBuilder)object3).toString());
                        }
                        if ((object = this.c) == null) return;
                        object.T(false, null);
                        this.c = null;
                        return;
                    }
                    object = this.b;
                    if (object != null) {
                        object.a(ax.Q2.f.R0, "", 0, "", "Account access denied");
                    }
                    if ((object = this.c) == null) return;
                    object.T(false, null);
                    this.c = null;
                    return;
                }
                n8 = this.s();
                int n9 = this.r(String.valueOf(((com.pcloud.sdk.a)object).e0));
                if (n9 >= 0) {
                    n8 = n9;
                }
                this.u(n8, (com.pcloud.sdk.a)object);
                object = new Handler(Looper.getMainLooper());
                object3 = new Runnable(){
                    final d c0;
                    final int q;
                    {
                        this.c0 = d8;
                        this.q = n8;
                    }

                    @Override
                    public void run() {
                        if (this.c0.b != null) {
                            this.c0.b.c(ax.Q2.f.R0, this.q);
                            com.alphainventor.filemanager.file.I$d.l(this.c0, null);
                        }
                        if (this.c0.c != null) {
                            if (this.c0.e && this.q == this.c0.d) {
                                this.c0.c.T(false, new e());
                            } else {
                                this.c0.c.T(false, null);
                            }
                            com.alphainventor.filemanager.file.I$d.n(this.c0, null);
                        }
                    }
                };
                object.post((Runnable)object3);
                return;
            }
            ((Throwable)object2).printStackTrace();
            object2 = this.b;
            if (object2 != null) {
                object2.a(ax.Q2.f.R0, "", 0, "", "Exception");
            }
            if ((object2 = this.c) == null) return;
            object2.T(false, null);
            this.c = null;
        }

        void u(int n8, com.pcloud.sdk.a object) {
            Context context = this.a;
            boolean bl = false;
            if (n8 >= (context = context.getSharedPreferences("PCloudCloudPrefs", 0)).getInt("count", 0)) {
                bl = true;
            }
            context = context.edit();
            Object object2 = new StringBuilder();
            ((StringBuilder)object2).append("version_");
            ((StringBuilder)object2).append(n8);
            Object object3 = context.putInt(((StringBuilder)object2).toString(), 3);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("apihost_");
            ((StringBuilder)object2).append(n8);
            object2 = object3.putString(((StringBuilder)object2).toString(), ((com.pcloud.sdk.a)object).h0);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("accountid_");
            ((StringBuilder)object3).append(n8);
            object3 = object2.putString(((StringBuilder)object3).toString(), String.valueOf(((com.pcloud.sdk.a)object).e0));
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("token_");
            ((StringBuilder)object2).append(n8);
            String string = ((StringBuilder)object2).toString();
            c0 c02 = this.f;
            ax.Y2.a a8 = ax.Y2.a.a();
            object2 = ax.Q2.f.R0;
            object3 = object3.putString(string, c02.e(a8.b((ax.Q2.f)((Object)object2)), ((com.pcloud.sdk.a)object).d0));
            object = new StringBuilder();
            ((StringBuilder)object).append("location_name_");
            ((StringBuilder)object).append(n8);
            object3.putString(((StringBuilder)object).toString(), ((ax.Q2.f)((Object)object2)).M(this.a));
            if (bl) {
                object = new StringBuilder();
                ((StringBuilder)object).append("created_");
                ((StringBuilder)object).append(n8);
                context.putLong(((StringBuilder)object).toString(), System.currentTimeMillis());
                object = new StringBuilder();
                ((StringBuilder)object).append("sortindex_");
                ((StringBuilder)object).append(n8);
                context.putLong(((StringBuilder)object).toString(), System.currentTimeMillis());
            }
            if (bl) {
                context.putInt("count", n8 + 1);
            }
            context.apply();
        }

        public void v(int n8, A a8) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("PCloudCloudPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("email_");
            stringBuilder.append(n8);
            editor.putString(stringBuilder.toString(), a8.b());
            editor.apply();
        }

        public void w(Activity activity, boolean bl) {
            String string = g.c((Context)activity).a(ax.Q2.f.R0);
            activity.startActivityForResult(AuthorizationActivity.e((Context)activity, com.pcloud.sdk.b.a().j(b.c.d0).h(string).i(true).f("manageshares").g()), 10006);
            this.e = bl;
        }

        public void x(Activity activity, c.a a8, int n8) {
            this.c = a8;
            this.d = n8;
            this.w(activity, true);
        }
    }

    public static class e {
    }
}

