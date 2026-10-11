/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import ax.R5.e;
import ax.b6.I1;
import ax.b6.R6;
import ax.b6.U1;
import ax.b6.W1;
import ax.b6.X6;
import ax.b6.Z1;
import ax.b6.b2;
import ax.b6.e2;
import ax.b6.g6;
import ax.b6.i2;
import ax.b6.k0;
import ax.b6.k4;
import ax.b6.k7;
import ax.b6.l7;
import ax.b6.m6;
import ax.b6.n6;
import ax.b6.r7;
import ax.b6.s4;
import ax.b6.y6;
import ax.f6.B;
import ax.u3.w;
import com.google.android.gms.measurement.internal.A;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.C;
import com.google.android.gms.measurement.internal.C5;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.D5;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.J5;
import com.google.android.gms.measurement.internal.M1;
import com.google.android.gms.measurement.internal.Q4;
import com.google.android.gms.measurement.internal.R1;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.Y1;
import com.google.android.gms.measurement.internal.Z1;
import com.google.android.gms.measurement.internal.a2;
import com.google.android.gms.measurement.internal.b4;
import com.google.android.gms.measurement.internal.c;
import com.google.android.gms.measurement.internal.c2;
import com.google.android.gms.measurement.internal.d2;
import com.google.android.gms.measurement.internal.d4;
import com.google.android.gms.measurement.internal.f;
import com.google.android.gms.measurement.internal.f2;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.f5;
import com.google.android.gms.measurement.internal.g3;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.h2;
import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.i;
import com.google.android.gms.measurement.internal.j5;
import com.google.android.gms.measurement.internal.k;
import com.google.android.gms.measurement.internal.k5;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.n2;
import com.google.android.gms.measurement.internal.o;
import com.google.android.gms.measurement.internal.o2;
import com.google.android.gms.measurement.internal.o5;
import com.google.android.gms.measurement.internal.p;
import com.google.android.gms.measurement.internal.p5;
import com.google.android.gms.measurement.internal.q2;
import com.google.android.gms.measurement.internal.r5;
import com.google.android.gms.measurement.internal.s5;
import com.google.android.gms.measurement.internal.t5;
import com.google.android.gms.measurement.internal.u;
import com.google.android.gms.measurement.internal.u5;
import com.google.android.gms.measurement.internal.v5;
import com.google.android.gms.measurement.internal.x5;
import com.google.android.gms.measurement.internal.y;
import com.google.android.gms.measurement.internal.y5;
import com.google.android.gms.measurement.internal.z2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class q5
implements g3 {
    private static volatile q5 H;
    private long A;
    private final Map<String, h3> B;
    private final Map<String, u> C;
    private final Map<String, b> D;
    private d4 E;
    private String F;
    private final D5 G;
    private q2 a;
    private Y1 b;
    private l c;
    private f2 d;
    private j5 e;
    private J5 f;
    private final x5 g;
    private b4 h;
    private Q4 i;
    private final o5 j;
    private o2 k;
    private final E2 l;
    private boolean m = false;
    private boolean n;
    private long o;
    private List<Runnable> p;
    private final Set<String> q = new HashSet<String>();
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private FileLock w;
    private FileChannel x;
    private List<Long> y;
    private List<Long> z;

    private q5(y5 y52) {
        this(y52, null);
    }

    private q5(y5 y52, E2 g32) {
        this.G = new t5(this);
        ax.M5.p.l(y52);
        this.l = E2.c(y52.a, null, null);
        this.A = -1L;
        this.j = new o5(this);
        g32 = new x5(this);
        ((k5)g32).v();
        this.g = g32;
        g32 = new Y1(this);
        ((k5)g32).v();
        this.b = g32;
        g32 = new q2(this);
        ((k5)g32).v();
        this.a = g32;
        this.B = new HashMap<String, h3>();
        this.C = new HashMap<String, u>();
        this.D = new HashMap<String, b>();
        this.l().D(new p5(this, y52));
    }

    private final long A0() {
        long l8;
        long l9 = this.b().a();
        Q4 q42 = this.i;
        q42.u();
        ((f3)q42).n();
        long l10 = l8 = q42.i.a();
        if (l8 == 0L) {
            l10 = (long)((f3)q42).i().W0().nextInt(86400000) + 1L;
            q42.i.b(l10);
        }
        return (l9 + l10) / 1000L / 60L / 60L / 24L;
    }

    private final f2 B0() {
        f2 f22 = this.d;
        if (f22 != null) {
            return f22;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void C(String string, b2.a a8, Bundle bundle, String string2) {
        List<String> list = ax.R5.f.b("_o", "_sn", "_sc", "_si");
        int n8 = !B5.J0(a8.I()) && !B5.J0(string) ? this.f0().r(string2, true) : this.f0().w(string2, true);
        long l8 = n8;
        long l9 = a8.J().codePointCount(0, a8.J().length());
        this.t0();
        string = a8.I();
        this.f0();
        string = B5.J(string, 40, true);
        if (l9 > l8 && !list.contains(a8.I())) {
            if ("_ev".equals(a8.I())) {
                this.t0();
                bundle.putString("_ev", B5.J(a8.J(), this.f0().w(string2, true), true));
                return;
            }
            this.k().M().c("Param value is too long; discarded. Name, value length", string, l9);
            if (bundle.getLong("_err") == 0L) {
                bundle.putLong("_err", 4L);
                if (bundle.getString("_ev") == null) {
                    bundle.putString("_ev", string);
                    bundle.putLong("_el", l9);
                }
            }
            bundle.remove(a8.I());
        }
    }

    private final j5 C0() {
        return (j5)q5.j(this.e);
    }

    private final void E(String string, h3 h32) {
        ((f3)this.l()).n();
        this.v0();
        this.B.put(string, h32);
        this.h0().A0(string, h32);
    }

    private final void H(String object, boolean bl, Long l8, Long l9) {
        object = this.h0().H0((String)object);
        if (object != null) {
            ((Z1)object).T(bl);
            ((Z1)object).e(l8);
            ((Z1)object).I(l9);
            if (((Z1)object).B()) {
                this.h0().V((Z1)object, false, false);
            }
        }
    }

    private final void I(List<Long> list) {
        ax.M5.p.a(list.isEmpty() ^ true);
        if (this.y != null) {
            this.k().G().a("Set uploading progress before finishing the previous upload");
            return;
        }
        this.y = new ArrayList<Long>(list);
    }

    private final boolean L(int n8, FileChannel fileChannel) {
        ((f3)this.l()).n();
        if (fileChannel != null && fileChannel.isOpen()) {
            IOException iOException2;
            block4: {
                block3: {
                    ByteBuffer byteBuffer = ByteBuffer.allocate(4);
                    byteBuffer.putInt(n8);
                    byteBuffer.flip();
                    try {
                        fileChannel.truncate(0L);
                        fileChannel.write(byteBuffer);
                        fileChannel.force(true);
                        if (fileChannel.size() == 4L) break block3;
                        this.k().G().b("Error writing to channel. Bytes written", fileChannel.size());
                    }
                    catch (IOException iOException2) {
                        break block4;
                    }
                }
                return true;
            }
            this.k().G().b("Failed to write to channel", iOException2);
            return false;
        }
        this.k().G().a("Bad channel to read from");
        return false;
    }

    private final boolean M(Z1.a a8, Z1.a a9) {
        ax.M5.p.a("_e".equals(a8.L()));
        this.s0();
        Object object = x5.F((ax.b6.Z1)((k4)a8.q()), "_sc");
        String string = null;
        object = object == null ? null : ((b2)object).g0();
        this.s0();
        b2 b22 = x5.F((ax.b6.Z1)((k4)a9.q()), "_pc");
        if (b22 != null) {
            string = b22.g0();
        }
        if (string != null && string.equals(object)) {
            ax.M5.p.a("_e".equals(a8.L()));
            this.s0();
            object = x5.F((ax.b6.Z1)((k4)a8.q()), "_et");
            if (object != null && ((b2)object).k0() && ((b2)object).a0() > 0L) {
                long l8 = ((b2)object).a0();
                this.s0();
                object = x5.F((ax.b6.Z1)((k4)a9.q()), "_et");
                long l9 = l8;
                if (object != null) {
                    l9 = l8;
                    if (((b2)object).a0() > 0L) {
                        l9 = l8 + ((b2)object).a0();
                    }
                }
                this.s0();
                x5.T(a9, "_et", l9);
                this.s0();
                x5.T(a8, "_fr", 1L);
            }
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    private final boolean N(String var1_1, long var2_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [7, 6 : 133->146)] java.lang.Throwable
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

    private final void O() {
        ((f3)this.l()).n();
        if (!(this.t || this.u || this.v)) {
            this.k().K().a("Stopping uploading service(s)");
            Object object = this.p;
            if (object == null) {
                return;
            }
            object = object.iterator();
            while (object.hasNext()) {
                ((Runnable)object.next()).run();
            }
            ax.M5.p.l(this.p).clear();
            return;
        }
        this.k().K().d("Not stopping services. fetch, network, upload", this.t, this.u, this.v);
    }

    private final void P() {
        long l8;
        ((f3)this.l()).n();
        this.v0();
        if (this.o > 0L) {
            l8 = 3600000L - Math.abs(this.b().b() - this.o);
            if (l8 > 0L) {
                this.k().K().b("Upload has been suspended. Will update scheduling later in approximately ms", l8);
                this.B0().c();
                this.C0().z();
                return;
            }
            this.o = 0L;
        }
        if (this.l.s() && this.Q()) {
            long l9;
            long l10;
            long l11;
            block20: {
                Object object;
                l11 = this.b().a();
                this.f0();
                l10 = Math.max(0L, (Long)com.google.android.gms.measurement.internal.F.B.a(null));
                int n8 = !this.h0().e1() && !this.h0().d1() ? 0 : 1;
                if (n8 != 0) {
                    object = this.f0().P();
                    if (!TextUtils.isEmpty((CharSequence)object) && !".none.".equals(object)) {
                        this.f0();
                        l8 = Math.max(0L, (Long)com.google.android.gms.measurement.internal.F.w.a(null));
                    } else {
                        this.f0();
                        l8 = Math.max(0L, (Long)com.google.android.gms.measurement.internal.F.v.a(null));
                    }
                } else {
                    this.f0();
                    l8 = Math.max(0L, (Long)com.google.android.gms.measurement.internal.F.u.a(null));
                }
                long l12 = this.i.g.a();
                long l13 = this.i.h.a();
                object = this.h0();
                l9 = Math.max(((l)object).z(), this.h0().A());
                if (l9 == 0L) {
                    l8 = 0L;
                } else {
                    l9 = l11 - Math.abs(l9 - l11);
                    l12 = Math.abs(l12 - l11);
                    l13 = l11 - Math.abs(l13 - l11);
                    l12 = Math.max(l11 - l12, l13);
                    l10 = l11 = l9 + l10;
                    if (n8 != 0) {
                        l10 = l11;
                        if (l12 > 0L) {
                            l10 = Math.min(l9, l12) + l8;
                        }
                    }
                    if (!this.s0().d0(l12, l8)) {
                        l10 = l12 + l8;
                    }
                    l8 = l10;
                    if (l13 != 0L) {
                        l8 = l10;
                        if (l13 >= l9) {
                            n8 = 0;
                            l8 = l10;
                            while (true) {
                                this.f0();
                                if (n8 >= Math.min(20, Math.max(0, (Integer)com.google.android.gms.measurement.internal.F.D.a(null)))) break;
                                this.f0();
                                if ((l8 += Math.max(0L, (Long)com.google.android.gms.measurement.internal.F.C.a(null)) * (1L << n8)) <= l13) {
                                    ++n8;
                                    continue;
                                }
                                break block20;
                                break;
                            }
                            l8 = 0L;
                        }
                    }
                }
            }
            if (l8 == 0L) {
                this.k().K().a("Next upload time is 0");
                this.B0().c();
                this.C0().z();
                return;
            }
            if (!this.l0().A()) {
                this.k().K().a("No network");
                this.B0().b();
                this.C0().z();
                return;
            }
            l11 = this.i.f.a();
            this.f0();
            l9 = Math.max(0L, (Long)com.google.android.gms.measurement.internal.F.s.a(null));
            l10 = l8;
            if (!this.s0().d0(l11, l9)) {
                l10 = Math.max(l8, l11 + l9);
            }
            this.B0().c();
            l8 = l10 -= this.b().a();
            if (l10 <= 0L) {
                this.f0();
                l8 = Math.max(0L, (Long)com.google.android.gms.measurement.internal.F.x.a(null));
                this.i.g.b(this.b().a());
            }
            this.k().K().b("Upload scheduled in approximately ms", l8);
            this.C0().y(l8);
            return;
        }
        this.k().K().a("Nothing to upload or uploading impossible");
        this.B0().c();
        this.C0().z();
    }

    private final boolean Q() {
        ((f3)this.l()).n();
        this.v0();
        return this.h0().c1() || !TextUtils.isEmpty((CharSequence)this.h0().C());
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean R() {
        FileNotFoundException fileNotFoundException2;
        block8: {
            IOException iOException2;
            block7: {
                OverlappingFileLockException overlappingFileLockException2;
                block6: {
                    ((f3)this.l()).n();
                    Object object = this.w;
                    if (object != null && ((FileLock)object).isValid()) {
                        this.k().K().a("Storage concurrent access okay");
                        return true;
                    }
                    object = this.l.a().getFilesDir();
                    object = new File(k0.a().b((File)object, "google_app_measurement.db"));
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile((File)object, "rw");
                        this.x = object = ax.u3.w.a(randomAccessFile);
                        this.w = object = ((FileChannel)object).tryLock();
                        if (object != null) {
                            this.k().K().a("Storage concurrent access okay");
                            return true;
                        }
                    }
                    catch (OverlappingFileLockException overlappingFileLockException2) {
                        break block6;
                    }
                    catch (IOException iOException2) {
                        break block7;
                    }
                    catch (FileNotFoundException fileNotFoundException2) {
                        break block8;
                    }
                    this.k().G().a("Storage concurrent data access panic");
                    return false;
                }
                this.k().L().b("Storage lock already acquired", overlappingFileLockException2);
                return false;
            }
            this.k().G().b("Failed to access storage lock file", iOException2);
            return false;
        }
        this.k().G().b("Failed to acquire storage lock", fileNotFoundException2);
        return false;
    }

    private final void W(D object, E5 e52) {
        ax.M5.p.f(e52.q);
        object = a2.b((D)object);
        this.t0().N(((a2)object).d, this.h0().F0(e52.q));
        this.t0().W((a2)object, this.f0().u(e52.q));
        D d8 = ((a2)object).a();
        if ("_cmp".equals(d8.q) && "referrer API v2".equals(d8.c0.E("_cis")) && !TextUtils.isEmpty((CharSequence)(object = d8.c0.E("gclid")))) {
            this.z(new A5("_lgclid", d8.e0, object, "auto"), e52);
        }
        this.v(d8, e52);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void X(Z1 z12) {
        ax.B.a<String, String> a8;
        ((f3)this.l()).n();
        if (TextUtils.isEmpty((CharSequence)z12.q()) && TextUtils.isEmpty((CharSequence)z12.j())) {
            this.B(ax.M5.p.l(z12.l()), 204, null, null, null);
            return;
        }
        Uri.Builder builder = new Uri.Builder();
        ax.B.a<String, String> a9 = a8 = z12.q();
        if (TextUtils.isEmpty((CharSequence)((Object)a8))) {
            a9 = z12.j();
        }
        Object object = com.google.android.gms.measurement.internal.F.f;
        a8 = null;
        Object object2 = null;
        Uri.Builder builder2 = builder.scheme((String)((M1)object).a(null)).encodedAuthority((String)com.google.android.gms.measurement.internal.F.g.a(null));
        object = new StringBuilder("config/app/");
        ((StringBuilder)object).append((String)((Object)a9));
        builder2.path(((StringBuilder)object).toString()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "97001").appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            object = ax.M5.p.l(z12.l());
            URL uRL = new URL(string);
            this.k().K().b("Fetching remote configuration", object);
            a9 = this.n0().L((String)object);
            Object object3 = this.n0().Q((String)object);
            if (a9 != null) {
                a9 = object2;
                if (!TextUtils.isEmpty((CharSequence)object3)) {
                    a9 = new ax.B.a<String, String>();
                    a9.put("If-Modified-Since", (String)object3);
                }
                object2 = this.n0().O((String)object);
                a8 = a9;
                if (!TextUtils.isEmpty((CharSequence)object2)) {
                    a8 = a9;
                    if (a9 == null) {
                        a8 = new ax.B.a<String, String>();
                    }
                    a8.put("If-None-Match", (String)object2);
                }
            }
            this.t = true;
            a9 = this.l0();
            object2 = new r5(this);
            ((f3)((Object)a9)).n();
            ((k5)((Object)a9)).u();
            ax.M5.p.l(uRL);
            ax.M5.p.l(object2);
            z2 z22 = ((f3)((Object)a9)).l();
            object3 = new d2((Y1)((Object)a9), (String)object, uRL, null, a8, (c2)object2);
            z22.z((Runnable)object3);
            return;
        }
        catch (MalformedURLException malformedURLException) {
            this.k().G().c("Failed to parse config URL. Not fetching. appId", V1.v(z12.l()), string);
            return;
        }
    }

    private final E5 Z(String string) {
        Z1 z12 = this.h0().H0(string);
        if (z12 != null && !TextUtils.isEmpty((CharSequence)z12.o())) {
            Boolean bl = this.n(z12);
            if (bl != null && !bl.booleanValue()) {
                this.k().G().b("App version does not match; dropping. appId", V1.v(string));
                return null;
            }
            return new E5(string, z12.q(), z12.o(), z12.U(), z12.n(), z12.z0(), z12.t0(), null, z12.A(), false, z12.p(), z12.Q(), 0L, 0, z12.z(), false, z12.j(), z12.K0(), z12.v0(), z12.w(), null, this.S(string).z(), "", null, z12.C(), z12.J0(), this.S(string).b(), this.d0(string).j(), z12.a(), z12.X(), z12.v(), z12.t());
        }
        this.k().F().b("No app data available; dropping", string);
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void b0(D var1_1, E5 var2_5) {
        block73: {
            block74: {
                block72: {
                    ax.M5.p.l(var2_5);
                    ax.M5.p.f(var2_5.q);
                    var14_6 = System.nanoTime();
                    this.l().n();
                    this.v0();
                    var17_7 = var2_5.q;
                    this.s0();
                    if (!x5.e0((D)var1_1, (E5)var2_5)) {
                        return;
                    }
                    if (!var2_5.i0) {
                        this.h((E5)var2_5);
                        return;
                    }
                    if (this.n0().P((String)var17_7, var1_1.q)) {
                        this.k().L().c("Dropping blocked event. appId", V1.v((String)var17_7), this.l.D().c(var1_1.q));
                        var7_8 = this.n0().Y((String)var17_7) || this.n0().a0((String)var17_7);
                        if (!var7_8 && !"_err".equals(var1_1.q)) {
                            this.t0();
                            B5.Z(this.G, (String)var17_7, 11, "_ev", var1_1.q, 0);
                        }
                        if (var7_8 == false) return;
                        var1_1 = this.h0().H0((String)var17_7);
                        if (var1_1 == null) return;
                        var10_10 = Math.max(var1_1.x0(), var1_1.a0());
                        var10_10 = Math.abs(this.b().a() - var10_10);
                        this.f0();
                        if (var10_10 <= (Long)com.google.android.gms.measurement.internal.F.A.a(null)) return;
                        this.k().F().a("Fetching config for blocked app");
                        this.X((Z1)var1_1);
                        return;
                    }
                    var16_12 = a2.b((D)var1_1);
                    this.t0().W((a2)var16_12, this.f0().u((String)var17_7));
                    var7_9 = X6.a() != false && this.f0().t(com.google.android.gms.measurement.internal.F.z0) != false ? this.f0().q((String)var17_7, com.google.android.gms.measurement.internal.F.R, 10, 35) : 0;
                    for (Object var19_14 : new TreeSet<E>(var16_12.d.keySet())) {
                        if (!"items".equals(var19_14)) continue;
                        var1_1 = this.t0();
                        var19_14 = var16_12.d.getParcelableArray((String)var19_14);
                        var8_15 = X6.a() != false && this.f0().t(com.google.android.gms.measurement.internal.F.z0) != false;
                        var1_1.b0((Parcelable[])var19_14, var7_9, var8_15);
                    }
                    var16_12 = var16_12.a();
                    if (this.k().C(2)) {
                        this.k().K().b("Logging event", this.l.D().b((D)var16_12));
                    }
                    if (R6.a()) {
                        this.f0().t(com.google.android.gms.measurement.internal.F.w0);
                    }
                    this.h0().X0();
                    try {
                        this.h((E5)var2_5);
                        var8_15 = "ecommerce_purchase".equals(var16_12.q);
                        var7_9 = !(var8_15 || "purchase".equals(var16_12.q) || "refund".equals(var16_12.q)) ? 0 : 1;
                        if (!"_iap".equals(var16_12.q) && var7_9 == 0) ** GOTO lbl105
                        var1_1 = var16_12.c0.E("currency");
                        if (var7_9 != 0) {
                            var3_16 = var5_17 = var16_12.c0.z("value") * 1000000.0;
                            if (var5_17 != 0.0) break block72;
                        }
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var1_2) {
                        break block73;
                    }
                    var3_16 = (double)var16_12.c0.C("value").longValue() * 1000000.0;
                }
                if (!(var3_16 <= 9.223372036854776E18) || !(var3_16 >= -9.223372036854776E18)) ** GOTO lbl-1000
                {
                    var10_11 = var12_18 = Math.round(var3_16);
                    ** if (!"refund".equals((Object)var16_12.q)) goto lbl72
                }
lbl-1000:
                // 1 sources

                {
                    var10_11 = -var12_18;
                }
lbl72:
                // 2 sources

                ** GOTO lbl78
lbl-1000:
                // 1 sources

                {
                    this.k().L().c("Data lost. Currency value is too big. appId", V1.v((String)var17_7), var3_16);
                    this.h0().b1();
                    this.h0().Z0();
                    return;
                }
lbl-1000:
                // 1 sources

                {
                    var10_11 = var16_12.c0.C("value");
lbl78:
                    // 2 sources

                    if (!TextUtils.isEmpty((CharSequence)var1_1) && (var1_1 = var1_1.toUpperCase(Locale.US)).matches("[A-Z]{3}")) {
                        var18_13 = new List<C5>("_ltv_");
                        var18_13.append((String)var1_1);
                        var18_13 = var18_13.toString();
                        var1_1 = this.h0().I0((String)var17_7, (String)var18_13);
                        if (var1_1 != null && (var1_1 = var1_1.e) instanceof Long) {
                            var12_18 = (Long)var1_1;
                            var1_1 = new C5((String)var17_7, var16_12.d0, (String)var18_13, this.b().a(), var12_18 + var10_11);
                        } else {
                            var19_14 = this.h0();
                            var7_9 = this.f0().v((String)var17_7, com.google.android.gms.measurement.internal.F.F);
                            ax.M5.p.f((String)var17_7);
                            var19_14.n();
                            var19_14.u();
                            try {
                                var19_14.B().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", (Object[])new String[]{var17_7, var17_7, String.valueOf(var7_9 - 1)});
                            }
                            catch (SQLiteException var1_3) {
                                var19_14.k().G().c("Error pruning currencies. appId", V1.v((String)var17_7), (Object)var1_3);
                            }
                            var1_1 = new C5((String)var17_7, var16_12.d0, (String)var18_13, this.b().a(), var10_11);
                        }
                        if (!this.h0().f0((C5)var1_1)) {
                            this.k().G().d("Too many unique user properties are set. Ignoring user property. appId", V1.v((String)var17_7), this.l.D().g(var1_1.c), var1_1.e);
                            this.t0();
                            B5.Z(this.G, (String)var17_7, 9, null, null, 0);
                        }
                    }
lbl105:
                    // 6 sources

                    var8_15 = B5.L0(var16_12.q);
                    var9_19 = "_err".equals(var16_12.q);
                    this.t0();
                    var10_11 = B5.A(var16_12.c0);
                    var1_1 = this.h0().I(this.A0(), (String)var17_7, var10_11 + 1L, true, var8_15, false, var9_19, false, false);
                    var10_11 = var1_1.b;
                    this.f0();
                    if ((var10_11 -= (long)((Integer)com.google.android.gms.measurement.internal.F.l.a(null)).intValue()) <= 0L) break block74;
                    if (var10_11 % 1000L != 1L) ** GOTO lbl117
                }
                {
                    this.k().G().c("Data loss. Too many events logged. appId, count", V1.v((String)var17_7), var1_1.b);
lbl117:
                    // 2 sources

                    this.h0().b1();
                    this.h0().Z0();
                    return;
                }
            }
            if (!var8_15) ** GOTO lbl-1000
            {
                var10_11 = var1_1.a;
                this.f0();
                if ((var10_11 -= (long)((Integer)com.google.android.gms.measurement.internal.F.n.a(null)).intValue()) <= 0L) ** GOTO lbl-1000
                if (var10_11 % 1000L != 1L) ** GOTO lbl128
            }
            {
                this.k().G().c("Data loss. Too many public events logged. appId, count", V1.v((String)var17_7), var1_1.a);
lbl128:
                // 2 sources

                this.t0();
                B5.Z(this.G, (String)var17_7, 16, "_ev", var16_12.q, 0);
                this.h0().b1();
                this.h0().Z0();
                return;
            }
lbl-1000:
            // 2 sources

            {
                if (!var9_19 || (var10_11 = var1_1.d - (long)Math.max(0, Math.min(1000000, this.f0().v(var2_5.q, com.google.android.gms.measurement.internal.F.m)))) <= 0L) ** GOTO lbl-1000
                if (var10_11 == 1L) {
                    this.k().G().c("Too many error events logged. appId, count", V1.v((String)var17_7), var1_1.d);
                }
                this.h0().b1();
                this.h0().Z0();
                return;
            }
lbl-1000:
            // 1 sources

            {
                var18_13 = var16_12.c0.B();
                this.t0().O((Bundle)var18_13, "_o", var16_12.d0);
                var9_19 = this.t0().E0((String)var17_7, var2_5.F0);
                if (var9_19) {
                    this.t0().O((Bundle)var18_13, "_dbg", 1L);
                    this.t0().O((Bundle)var18_13, "_r", 1L);
                }
                if ("_s".equals(var16_12.q) && (var1_1 = this.h0().I0(var2_5.q, "_sno")) != null && var1_1.e instanceof Long) {
                    this.t0().O((Bundle)var18_13, "_sno", var1_1.e);
                }
                if ((var10_11 = this.h0().F((String)var17_7)) > 0L) {
                    this.k().L().c("Data lost. Too many events stored on disk, deleted. appId", V1.v((String)var17_7), var10_11);
                }
                var1_1 = new A(this.l, var16_12.d0, (String)var17_7, var16_12.q, var16_12.e0, 0L, (Bundle)var18_13);
                var16_12 = this.h0().G0((String)var17_7, var1_1.b);
                if (var16_12 != null) ** GOTO lbl162
                if (this.h0().C0((String)var17_7) < (long)this.f0().p((String)var17_7) || !var8_15) ** GOTO lbl-1000
                this.k().G().d("Too many event names used, ignoring event. appId, name, supported count", V1.v((String)var17_7), this.l.D().c(var1_1.b), this.f0().p((String)var17_7));
                this.t0();
                B5.Z(this.G, (String)var17_7, 8, null, null, 0);
                this.h0().Z0();
                return;
            }
lbl-1000:
            // 1 sources

            {
                block78: {
                    var16_12 = new y((String)var17_7, var1_1.b, 0L, 0L, var1_1.d, 0L, null, null, null, null);
                    break block78;
lbl162:
                    // 1 sources

                    var1_1 = var1_1.a(this.l, var16_12.f);
                    var16_12 = var16_12.a(var1_1.d);
                }
                this.h0().U((y)var16_12);
                this.l().n();
                this.v0();
                ax.M5.p.l(var1_1);
                ax.M5.p.l(var2_5);
                ax.M5.p.f(var1_1.a);
                ax.M5.p.a(var1_1.a.equals(var2_5.q));
                var17_7 = e2.M3().A0(1).a1("android");
                if (!TextUtils.isEmpty((CharSequence)var2_5.q)) {
                    var17_7.V(var2_5.q);
                }
                if (!TextUtils.isEmpty((CharSequence)var2_5.e0)) {
                    var17_7.i0(var2_5.e0);
                }
                if (!TextUtils.isEmpty((CharSequence)var2_5.d0)) {
                    var17_7.p0(var2_5.d0);
                }
                if (!TextUtils.isEmpty((CharSequence)var2_5.y0)) {
                    var17_7.e1(var2_5.y0);
                }
                if ((var10_11 = var2_5.k0) != -2147483648L) {
                    var17_7.l0((int)var10_11);
                }
                var17_7.s0(var2_5.f0);
                if (!TextUtils.isEmpty((CharSequence)var2_5.c0)) {
                    var17_7.U0(var2_5.c0);
                }
                var16_12 = this.S(ax.M5.p.l(var2_5.q)).h(h3.q(var2_5.w0));
                var17_7.y0(var16_12.y());
                if (var17_7.l1().isEmpty() && !TextUtils.isEmpty((CharSequence)var2_5.r0)) {
                    var17_7.K(var2_5.r0);
                }
                if (!k7.a() || !this.f0().E(var2_5.q, com.google.android.gms.measurement.internal.F.A0)) ** GOTO lbl243
                this.t0();
                if (!B5.D0(var2_5.q)) ** GOTO lbl243
                var17_7.f0(var2_5.D0);
                var10_11 = var12_18 = var2_5.E0;
                if (!this.f0().t(com.google.android.gms.measurement.internal.F.E0)) {
                    var10_11 = var12_18;
                    if (!var16_12.A()) {
                        var10_11 = var12_18;
                        if (var12_18 != 0L) {
                            var10_11 = var12_18 & -2L | 32L;
                        }
                    }
                }
                var8_15 = var10_11 == 1L;
            }
            {
                var17_7.L(var8_15);
                if (var10_11 == 0L) ** GOTO lbl243
                var16_12 = W1.I();
                var8_15 = (var10_11 & 1L) != 0L;
            }
            {
                var16_12.y(var8_15);
                var8_15 = (var10_11 & 2L) != 0L;
            }
            {
                var16_12.B(var8_15);
                var8_15 = (var10_11 & 4L) != 0L;
            }
            {
                var16_12.C(var8_15);
                var8_15 = (var10_11 & 8L) != 0L;
            }
            {
                var16_12.D(var8_15);
                var8_15 = (var10_11 & 16L) != 0L;
            }
            {
                var16_12.x(var8_15);
                var8_15 = (32L & var10_11) != 0L;
            }
            {
                var16_12.w(var8_15);
                var8_15 = (var10_11 & 64L) != 0L;
            }
            {
                var16_12.z(var8_15);
                var17_7.E((W1)((k4)var16_12.q()));
lbl243:
                // 4 sources

                if ((var10_11 = var2_5.g0) != 0L) {
                    var17_7.a0(var10_11);
                }
                var17_7.g0(var2_5.t0);
                var16_12 = this.s0().l0();
                if (var16_12 != null) {
                    var17_7.b0((Iterable<? extends Integer>)var16_12);
                }
                if ((var18_13 = this.S(ax.M5.p.l(var2_5.q)).h(h3.q(var2_5.w0))).A() && var2_5.p0 && (var19_14 = this.i.z(var2_5.q, (h3)var18_13)) != null && !TextUtils.isEmpty((CharSequence)((CharSequence)var19_14.first)) && var2_5.p0) {
                    var17_7.c1((String)var19_14.first);
                    var16_12 = var19_14.second;
                    if (var16_12 != null) {
                        var17_7.d0((Boolean)var16_12);
                    }
                    if (n6.a() && this.f0().t(com.google.android.gms.measurement.internal.F.L0) && !var1_1.b.equals("_fx") && !((String)var19_14.first).equals("00000000-0000-0000-0000-000000000000") && (var19_14 = this.h0().H0(var2_5.q)) != null && var19_14.D()) {
                        this.H(var2_5.q, false, null, null);
                        var16_12 = new Bundle();
                        var8_15 = this.f0().t(com.google.android.gms.measurement.internal.F.T0);
                        if (var8_15) {
                            var20_20 = var19_14.L0();
                            if (var20_20 != null) {
                                var16_12.putLong("_pfo", Math.max(0L, var20_20));
                            }
                            if ((var19_14 = var19_14.M0()) != null) {
                                var16_12.putLong("_uwa", var19_14.longValue());
                            }
                        } else if (this.f0().t(com.google.android.gms.measurement.internal.F.S0)) {
                            var16_12.putLong("_pfo", Math.max(0L, this.h0().w0(var2_5.q) - 1L));
                        }
                        var16_12.putLong("_r", 1L);
                        this.G.b(var2_5.q, "_fx", (Bundle)var16_12);
                    }
                }
                this.l.A().p();
                var16_12 = var17_7.H0(Build.MODEL);
                this.l.A().p();
                var16_12.Y0(Build.VERSION.RELEASE).J0((int)this.l.A().v()).g1(this.l.A().w());
                var17_7.K0(var2_5.A0);
                if (this.l.p()) {
                    var17_7.h1();
                    if (!TextUtils.isEmpty(null)) {
                        var17_7.L0(null);
                    }
                }
                if ((var16_12 = this.h0().H0(var2_5.q)) == null) {
                    var16_12 = new Z1(this.l, var2_5.q);
                    var16_12.J(this.o((h3)var18_13));
                    var16_12.W(var2_5.l0);
                    var16_12.Z(var2_5.c0);
                    if (var18_13.A()) {
                        var16_12.f0(this.i.A(var2_5.q, var2_5.p0));
                    }
                    var16_12.A0(0L);
                    var16_12.C0(0L);
                    var16_12.y0(0L);
                    var16_12.S(var2_5.d0);
                    var16_12.H(var2_5.k0);
                    var16_12.O(var2_5.e0);
                    var16_12.u0(var2_5.f0);
                    var16_12.n0(var2_5.g0);
                    var16_12.K(var2_5.i0);
                    var16_12.q0(var2_5.t0);
                    this.h0().V((Z1)var16_12, false, false);
                }
                if (var18_13.B() && !TextUtils.isEmpty((CharSequence)var16_12.m())) {
                    var17_7.c0(ax.M5.p.l(var16_12.m()));
                }
                if (!TextUtils.isEmpty((CharSequence)var16_12.p())) {
                    var17_7.S0(ax.M5.p.l(var16_12.p()));
                }
                var18_13 = this.h0().S0(var2_5.q);
                for (var7_9 = 0; var7_9 < var18_13.size(); ++var7_9) {
                    var19_14 = i2.a0().z(var18_13.get((int)var7_9).c).C(var18_13.get((int)var7_9).d);
                    this.s0().W((i2.a)var19_14, var18_13.get((int)var7_9).e);
                    var17_7.H((i2.a)var19_14);
                    if (!"_sid".equals(var18_13.get((int)var7_9).c) || var16_12.I0() == 0L || this.s0().z(var2_5.y0) == var16_12.I0()) continue;
                    var17_7.d1();
                }
            }
            {
                block76: {
                    block77: {
                        block75: {
                            try {
                                var10_11 = this.h0().E((e2)((k4)var17_7.q()));
                                var2_5 = this.h0();
                                var16_12 = var1_1.f;
                                if (var16_12 == null) break block75;
                                var16_12 = var16_12.iterator();
                            }
                            catch (IOException var1_4) {
                                this.k().G().c("Data loss. Failed to insert raw event metadata. appId", V1.v(var17_7.h1()), var1_4);
                                break block76;
                            }
                            while (var16_12.hasNext()) {
                                if (!"_r".equals(var16_12.next())) continue;
                                while (true) {
                                    var8_15 = true;
                                    break block77;
                                    break;
                                }
                            }
                            var8_15 = this.n0().N(var1_1.a, var1_1.b);
                            var16_12 = this.h0().J(this.A0(), var1_1.a, false, false, false, false, false, false);
                            if (var8_15 && var16_12.e < (long)this.f0().y(var1_1.a)) ** continue;
                        }
                        var8_15 = false;
                    }
                    if (var2_5.e0((A)var1_1, var10_11, var8_15)) {
                        this.o = 0L;
                    }
                }
                this.h0().b1();
                this.h0().Z0();
                this.P();
                this.k().K().b("Background event processing time, ms", (System.nanoTime() - var14_6 + 500000L) / 1000000L);
                return;
            }
        }
        this.h0().Z0();
        throw var1_2;
    }

    private final int c(String string, i i8) {
        Object object;
        if (this.a.J(string) == null) {
            i8.d(h3.a.f0, com.google.android.gms.measurement.internal.k.l0);
            return 1;
        }
        if (g6.a() && this.f0().t(com.google.android.gms.measurement.internal.F.Q0) && (object = this.h0().H0(string)) != null && h2.b(((Z1)object).t()).a() == ax.f6.o.d0) {
            Object object2 = this.a;
            object = h3.a.f0;
            if ((object2 = object2.B(string, (h3.a)((Object)object))) != ax.f6.o.c0) {
                i8.d((h3.a)((Object)object), com.google.android.gms.measurement.internal.k.k0);
                if (object2 == ax.f6.o.f0) {
                    return 0;
                }
                return 1;
            }
        }
        object = h3.a.f0;
        i8.d((h3.a)((Object)object), com.google.android.gms.measurement.internal.k.d0);
        if (this.a.M(string, (h3.a)((Object)object))) {
            return 0;
        }
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int d(FileChannel fileChannel) {
        ((f3)this.l()).n();
        if (fileChannel != null && fileChannel.isOpen()) {
            IOException iOException2;
            block4: {
                ByteBuffer byteBuffer = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int n8 = fileChannel.read(byteBuffer);
                    if (n8 != 4) {
                        if (n8 == -1) return 0;
                        this.k().L().b("Unexpected data length. Bytes read", n8);
                        return 0;
                    }
                }
                catch (IOException iOException2) {
                    break block4;
                }
                byteBuffer.flip();
                return byteBuffer.getInt();
            }
            this.k().G().b("Failed to read from channel", iOException2);
            return 0;
        }
        this.k().G().a("Bad channel to read from");
        return 0;
    }

    private final u d0(String string) {
        u u8;
        ((f3)this.l()).n();
        this.v0();
        u u9 = u8 = this.C.get(string);
        if (u8 == null) {
            u9 = this.h0().L0(string);
            this.C.put(string, u9);
        }
        return u9;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final u g(String string, u object, h3 object2, i i8) {
        Object var2_15;
        int n8;
        boolean bl;
        block15: {
            Enum enum_;
            Object var4_26;
            block12: {
                Object var11_32;
                int n9;
                block17: {
                    ax.f6.o var3_24;
                    Object var3_17;
                    boolean bl2;
                    ax.f6.o o8;
                    ax.f6.o o9;
                    block13: {
                        block16: {
                            int n10;
                            block14: {
                                q2 q22;
                                ax.f6.o o10;
                                I1 i12 = this.n0().J(string);
                                n9 = 90;
                                if (i12 == null) {
                                    if (((u)object).g() == ax.f6.o.e0) {
                                        n9 = ((u)object).a();
                                        var4_26.c(h3.a.e0, n9);
                                        return new u(Boolean.FALSE, n9, Boolean.TRUE, "-");
                                    }
                                    var4_26.d(h3.a.e0, com.google.android.gms.measurement.internal.k.l0);
                                    return new u(Boolean.FALSE, n9, Boolean.TRUE, "-");
                                }
                                enum_ = ((u)object).g();
                                if (enum_ == (o9 = ax.f6.o.f0) || enum_ == (o8 = ax.f6.o.e0)) break block12;
                                bl = g6.a();
                                bl2 = true;
                                n10 = 1;
                                if (!bl || !this.f0().t(com.google.android.gms.measurement.internal.F.Q0)) break block13;
                                if (enum_ != ax.f6.o.d0 || (o10 = (q22 = this.a).B(string, (h3.a)(enum_ = h3.a.e0))) == ax.f6.o.c0) break block14;
                                var4_26.d((h3.a)enum_, com.google.android.gms.measurement.internal.k.k0);
                                n8 = n9;
                                break block15;
                            }
                            q2 q23 = this.a;
                            enum_ = h3.a.e0;
                            h3.a a8 = q23.K(string, (h3.a)enum_);
                            ax.f6.o o11 = var3_17.t();
                            n8 = n10;
                            if (o11 != o9) {
                                n8 = o11 == o8 ? n10 : 0;
                            }
                            if (a8 != h3.a.c0 || n8 == 0) break block16;
                            var4_26.d((h3.a)enum_, com.google.android.gms.measurement.internal.k.e0);
                            n8 = n9;
                            break block15;
                        }
                        var4_26.d((h3.a)enum_, com.google.android.gms.measurement.internal.k.d0);
                        if (this.a.M(string, (h3.a)enum_)) break block17;
                        ax.f6.o o12 = o8;
                        n8 = n9;
                        break block15;
                    }
                    ax.f6.o o13 = ax.f6.o.c0;
                    bl = bl2;
                    if (enum_ != o13) {
                        bl = enum_ == ax.f6.o.d0 ? bl2 : false;
                    }
                    ax.M5.p.a(bl);
                    q2 q24 = this.a;
                    h3.a a9 = h3.a.e0;
                    h3.a a10 = q24.K(string, a9);
                    Boolean bl3 = var3_17.w();
                    Enum enum_2 = enum_;
                    if (a10 == h3.a.c0) {
                        Enum enum_3 = enum_;
                        if (bl3 != null) {
                            if (bl3.booleanValue()) {
                                ax.f6.o o14 = o9;
                            } else {
                                ax.f6.o o15 = o8;
                            }
                            var4_26.d(a9, com.google.android.gms.measurement.internal.k.e0);
                        }
                    }
                    void var2_13 = var3_24;
                    n8 = n9;
                    if (var3_24 != o13) break block15;
                    if (!this.a.M(string, a9)) {
                        ax.f6.o o16 = o8;
                    }
                    var4_26.d(a9, com.google.android.gms.measurement.internal.k.d0);
                }
                void var2_9 = var11_32;
                n8 = n9;
                break block15;
            }
            n8 = ((u)object).a();
            var4_26.c(h3.a.e0, n8);
            ax.f6.o o17 = enum_;
        }
        bl = this.a.Z(string);
        SortedSet<String> sortedSet = this.n0().T(string);
        if (var2_15 == ax.f6.o.e0) return new u(Boolean.FALSE, n8, (Boolean)bl, "-");
        if (sortedSet.isEmpty()) {
            return new u(Boolean.FALSE, n8, (Boolean)bl, "-");
        }
        Boolean bl4 = Boolean.TRUE;
        string = "";
        if (!bl) return new u(bl4, n8, (Boolean)bl, string);
        string = TextUtils.join((CharSequence)"", sortedSet);
        return new u(bl4, n8, (Boolean)bl, string);
    }

    static /* bridge */ /* synthetic */ E2 i(q5 q52) {
        return q52.l;
    }

    private static k5 j(k5 object) {
        if (object != null) {
            if (((k5)object).w()) {
                return object;
            }
            String string = String.valueOf(object.getClass());
            object = new StringBuilder("Component not initialized: ");
            ((StringBuilder)object).append(string);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        throw new IllegalStateException("Upload Component not created");
    }

    private final Boolean k0(E5 object) {
        Boolean bl;
        block0: {
            block1: {
                block2: {
                    block3: {
                        bl = object.s0;
                        if (!g6.a() || !this.f0().t(com.google.android.gms.measurement.internal.F.Q0) || TextUtils.isEmpty((CharSequence)object.G0)) break block0;
                        object = h2.b(object.G0).a();
                        int n8 = v5.a[((Enum)object).ordinal()];
                        if (n8 == 1) break block1;
                        if (n8 == 2) break block2;
                        if (n8 == 3) break block3;
                        if (n8 == 4) break block1;
                        break block0;
                    }
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
            return null;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static q5 m(Context object) {
        ax.M5.p.l(object);
        ax.M5.p.l(object.getApplicationContext());
        if (H != null) return H;
        synchronized (q5.class) {
            try {
                if (H != null) return H;
                Object object2 = new y5((Context)object);
                object = ax.M5.p.l(object2);
                H = object2 = new q5((y5)object);
                return H;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static boolean m0(E5 e52) {
        return !TextUtils.isEmpty((CharSequence)e52.c0) || !TextUtils.isEmpty((CharSequence)e52.r0);
        {
        }
    }

    private final Boolean n(Z1 object) {
        block5: {
            String string;
            try {
                if (((Z1)object).U() != Integer.MIN_VALUE) {
                    int n8 = ax.S5.e.a((Context)this.l.a()).d((String)((Z1)object).l(), (int)0).versionCode;
                    if (((Z1)object).U() == (long)n8) {
                        return Boolean.TRUE;
                    }
                    break block5;
                }
                string = ax.S5.e.a((Context)this.l.a()).d((String)((Z1)object).l(), (int)0).versionName;
                if ((object = ((Z1)object).o()) == null) break block5;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return null;
            }
            if (!((String)object).equals(string)) break block5;
            object = Boolean.TRUE;
            return object;
        }
        return Boolean.FALSE;
    }

    private final String o(h3 object) {
        if (((h3)object).B()) {
            object = new byte[16];
            this.t0().W0().nextBytes((byte[])object);
            return String.format(Locale.US, "%032x", new BigInteger(1, (byte[])object));
        }
        return null;
    }

    private static void p(Z1.a a8, int n8, String object) {
        Object object2 = a8.M();
        for (int i8 = 0; i8 < object2.size(); ++i8) {
            if (!"_err".equals(object2.get(i8).f0())) continue;
            return;
        }
        object2 = (b2)((k4)b2.c0().C("_err").y(n8).q());
        object = (b2)((k4)b2.c0().C("_ev").E((String)object).q());
        a8.D((b2)object2).D((b2)object);
    }

    private static void q(Z1.a a8, String string) {
        List<b2> list = a8.M();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            if (!string.equals(list.get(i8).f0())) continue;
            a8.x(i8);
            return;
        }
    }

    private final void r(e2.a object, long l8, boolean bl) {
        String string = bl ? "_se" : "_lte";
        C5 c52 = this.h0().I0(((e2.a)object).h1(), string);
        c52 = c52 != null && c52.e != null ? new C5(((e2.a)object).h1(), "auto", string, this.b().a(), (Long)c52.e + l8) : new C5(((e2.a)object).h1(), "auto", string, this.b().a(), l8);
        i2 i22 = (i2)((k4)i2.a0().z(string).C(this.b().a()).y((Long)c52.e).q());
        int n8 = x5.y((e2.a)object, string);
        if (n8 >= 0) {
            ((e2.a)object).B(n8, i22);
        } else {
            ((e2.a)object).I(i22);
        }
        if (l8 > 0L) {
            this.h0().f0(c52);
            object = bl ? "session-scoped" : "lifetime";
            this.k().K().c("Updated engagement user property. scope, value", object, c52.e);
        }
    }

    private static void s(e2.a a8, h3 h32) {
        if (!h32.A()) {
            a8.b1();
            a8.V0();
            a8.M0();
        }
        if (!h32.B()) {
            a8.z0();
            a8.d1();
        }
    }

    static /* synthetic */ void y(q5 q52, y5 object) {
        ((f3)q52.l()).n();
        q52.k = new o2(q52);
        object = new l(q52);
        ((k5)object).v();
        q52.c = object;
        q52.f0().s(ax.M5.p.l(q52.a));
        object = new Q4(q52);
        ((k5)object).v();
        q52.i = object;
        object = new J5(q52);
        ((k5)object).v();
        q52.f = object;
        object = new b4(q52);
        ((k5)object).v();
        q52.h = object;
        object = new j5(q52);
        ((k5)object).v();
        q52.e = object;
        q52.d = new f2(q52);
        if (q52.r != q52.s) {
            q52.k().G().c("Not all upload components initialized", q52.r, q52.s);
        }
        q52.m = true;
    }

    final void A(Runnable runnable2) {
        ((f3)this.l()).n();
        if (this.p == null) {
            this.p = new ArrayList<Runnable>();
        }
        this.p.add(runnable2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void B(String var1_1, int var2_4, Throwable var3_5, byte[] var4_6, Map<String, List<String>> var5_7) {
        block20: {
            block15: {
                block19: {
                    block18: {
                        block17: {
                            block16: {
                                this.l().n();
                                this.v0();
                                ax.M5.p.f(var1_1);
                                var8_8 = var4_6;
                                if (var4_6 != null) ** GOTO lbl9
                                try {
                                    var8_8 = new byte[0];
lbl9:
                                    // 2 sources

                                    this.k().K().b("onConfigFetched. Response size", ((Object)var8_8).length);
                                    this.h0().X0();
                                }
                                catch (Throwable var1_2) {}
                                var9_9 = this.h0().H0(var1_1);
                                var6_10 = (var2_4 == 200 || var2_4 == 204 || var2_4 == 304) && var3_5 == null;
                                if (var9_9 == null) {
                                    this.k().L().b("App does not exist in onConfigFetched. appId", V1.v(var1_1));
                                    break block15;
                                }
                                if (!var6_10 && var2_4 != 404) {
                                    var9_9.s0(this.b().a());
                                    this.h0().V(var9_9, false, false);
                                    this.k().K().c("Fetching config failed. code, error", var2_4, var3_5);
                                    this.n0().U(var1_1);
                                    this.i.h.b(this.b().a());
                                    if (var2_4 == 503 || var2_4 == 429) {
                                        this.i.f.b(this.b().a());
                                    }
                                    this.P();
                                    break block15;
                                }
                                var3_5 = var5_7 != null ? var5_7.get("Last-Modified") : null;
                                var3_5 = var3_5 != null && var3_5.isEmpty() == false ? var3_5.get(0) : null;
                                var4_6 = var5_7 != null ? var5_7.get("ETag") : null;
                                var4_6 = var4_6 != null && var4_6.isEmpty() == false ? (String)var4_6.get(0) : null;
                                if (var2_4 == 404 || var2_4 == 304) break block16;
                                var7_11 = this.n0().H(var1_1, (byte[])var8_8, (String)var3_5, (String)var4_6);
                                if (var7_11) break block17;
                                this.h0().Z0();
                                this.t = false;
                                this.O();
                                return;
                            }
                            if (this.n0().L(var1_1) != null || (var7_12 = this.n0().H(var1_1, null, null, null))) break block17;
                            this.h0().Z0();
                            this.t = false;
                            this.O();
                            return;
                        }
                        try {
                            var9_9.R(this.b().a());
                            this.h0().V(var9_9, false, false);
                            if (var2_4 != 404) break block18;
                            this.k().M().b("Config not found. Using empty config. appId", var1_1);
                            break block19;
                        }
                        catch (Throwable var1_3) {}
                        break block20;
                    }
                    this.k().K().c("Successfully fetched config. Got network response. code, size", var2_4, ((Object)var8_8).length);
                }
                if (this.l0().A() && this.Q()) {
                    this.z0();
                } else {
                    this.P();
                }
            }
            this.h0().b1();
            this.h0().Z0();
            this.t = false;
            this.O();
            return;
        }
        this.h0().Z0();
        throw var1_3;
        this.t = false;
        this.O();
        throw var1_2;
    }

    final void D(String string, e2.a a8) {
        block9: {
            Set<String> set;
            block11: {
                block10: {
                    int n8;
                    set = this.n0().S(string);
                    if (set != null) {
                        a8.h0(set);
                    }
                    if (this.n0().c0(string)) {
                        a8.I0();
                    }
                    if (this.n0().f0(string) && !TextUtils.isEmpty((CharSequence)((Object)(set = a8.m1()))) && (n8 = ((String)((Object)set)).indexOf(".")) != -1) {
                        a8.Y0(((String)((Object)set)).substring(0, n8));
                    }
                    if (this.n0().g0(string) && (n8 = x5.y(a8, "_id")) != -1) {
                        a8.Z(n8);
                    }
                    if (this.n0().e0(string)) {
                        a8.M0();
                    }
                    if (!this.n0().b0(string)) break block9;
                    a8.z0();
                    if (m6.a() && this.f0().t(com.google.android.gms.measurement.internal.F.W0) && !this.S(string).B()) break block9;
                    b b8 = this.D.get(string);
                    if (b8 == null) break block10;
                    set = b8;
                    if (b8.b + this.f0().z(string, com.google.android.gms.measurement.internal.F.V) >= this.b().b()) break block11;
                }
                set = new b(this, null);
                this.D.put(string, (b)((Object)set));
            }
            a8.O0(((b)((Object)set)).a);
        }
        if (this.n0().d0(string)) {
            a8.d1();
        }
    }

    public final void F(String string, d4 d42) {
        ((f3)this.l()).n();
        String string2 = this.F;
        if (string2 != null && !string2.equals(string) && d42 == null) {
            return;
        }
        this.F = string;
        this.E = d42;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void G(String string, E5 e52) {
        Throwable throwable2;
        block6: {
            block5: {
                ((f3)this.l()).n();
                this.v0();
                if (!q5.m0(e52)) {
                    return;
                }
                if (!e52.i0) {
                    this.h(e52);
                    return;
                }
                Boolean bl = this.k0(e52);
                if ("_npa".equals(string) && bl != null) {
                    this.k().F().a("Falling back to manifest metadata value for ad personalization");
                    long l8 = this.b().a();
                    long l9 = bl != false ? 1L : 0L;
                    this.z(new A5("_npa", l8, l9, "auto"), e52);
                    return;
                }
                this.k().F().b("Removing user property", this.l.D().g(string));
                this.h0().X0();
                try {
                    this.h(e52);
                    if (!"_id".equals(string)) break block5;
                    this.h0().O0(ax.M5.p.l(e52.q), "_lair");
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            this.h0().O0(ax.M5.p.l(e52.q), string);
            this.h0().b1();
            this.k().F().b("User property removed", this.l.D().g(string));
            this.h0().Z0();
            return;
        }
        this.h0().Z0();
        throw throwable2;
    }

    final void J(boolean bl) {
        this.P();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void K(boolean var1_1, int var2_2, Throwable var3_3, byte[] var4_7, String var5_8) {
        block24: {
            block26: {
                block20: {
                    block23: {
                        block25: {
                            block21: {
                                this.l().n();
                                this.v0();
                                var5_8 = (List<Long>)var4_7;
                                if (var4_7 != null) ** GOTO lbl7
                                try {
                                    var5_8 = (List<Long>)new byte[0];
lbl7:
                                    // 2 sources

                                    var4_7 = ax.M5.p.l(this.y);
                                    this.y = null;
                                    if ((!n6.a() || !(var6_9 = this.f0().t(com.google.android.gms.measurement.internal.F.L0)) || var1_1) && (var2_2 != 200 && var2_2 != 204 || var3_3 != null)) break block20;
                                    try {
                                        if (n6.a() && this.f0().t(com.google.android.gms.measurement.internal.F.L0) && !var1_1) break block21;
                                    }
                                    catch (SQLiteException var3_5) {
                                        break block23;
                                    }
                                }
                                catch (Throwable var3_4) {
                                    break block24;
                                }
                                this.i.g.b(this.b().a());
                            }
                            this.i.h.b(0L);
                            this.P();
                            if (n6.a() && (var3_3 = this.f0()).t((M1<Boolean>)(var9_10 /* !! */  = com.google.android.gms.measurement.internal.F.L0)) && !var1_1) {
                                if (n6.a() && this.f0().t((M1<Boolean>)var9_10 /* !! */ )) {
                                    this.k().K().a("Purged empty bundles");
                                }
                            } else {
                                this.k().K().c("Successful upload. Got network response. code, size", var2_2, ((Object)var5_8).length);
                            }
                            this.h0().X0();
                            try {
                                var3_3 = var4_7.iterator();
lbl30:
                                // 3 sources

                                while (var3_3.hasNext()) {
                                    var4_7 = (Long)var3_3.next();
                                    var5_8 = this.h0();
                                    var7_13 = var4_7.longValue();
                                    var5_8.n();
                                    var5_8.u();
                                    var9_10 /* !! */  = var5_8.B();
                                }
                                break block25;
                            }
                            catch (Throwable var3_6) {
                                ** GOTO lbl64
                            }
                            {
                                catch (SQLiteException var9_12) {
                                    var5_8 = this.z;
                                    if (var5_8 != null && var5_8.contains(var4_7)) ** GOTO lbl30
                                    throw var9_12;
                                }
                                try {
                                    if (var9_10 /* !! */ .delete("queue", "rowid=?", new String[]{String.valueOf(var7_13)}) == 1) ** GOTO lbl30
                                    var9_10 /* !! */  = new SQLiteException("Deleted fewer rows from queue than expected");
                                    throw var9_10 /* !! */ ;
                                }
                                catch (SQLiteException var9_11) {}
                                {
                                    var5_8.k().G().b("Failed to delete a bundle in a queue table", (Object)var9_11);
                                    throw var9_11;
                                }
                            }
                        }
                        this.h0().b1();
                        {
                            this.h0().Z0();
                            this.z = null;
                            if (this.l0().A() && this.Q()) {
                                this.z0();
                            } else {
                                this.A = -1L;
                                this.P();
                            }
                            this.o = 0L;
                            break block26;
lbl64:
                            // 1 sources

                            this.h0().Z0();
                            throw var3_6;
                        }
                    }
                    this.k().G().b("Database error while trying to delete uploaded bundles", (Object)var3_5);
                    this.o = this.b().b();
                    this.k().K().b("Disable upload, time", this.o);
                    break block26;
                }
                this.k().K().c("Network upload failed. Will retry later. code, error", var2_2, var3_3);
                this.i.h.b(this.b().a());
                if (var2_2 == 503 || var2_2 == 429) {
                    this.i.f.b(this.b().a());
                }
                this.h0().b0((List<Long>)var4_7);
                this.P();
            }
            this.u = false;
            this.O();
            return;
        }
        this.u = false;
        this.O();
        throw var3_4;
    }

    final h3 S(String string) {
        h3 h32;
        ((f3)this.l()).n();
        this.v0();
        h3 h33 = h32 = this.B.get(string);
        if (h32 == null) {
            h33 = h32 = this.h0().P0(string);
            if (h32 == null) {
                h33 = h3.c;
            }
            this.E(string, h33);
        }
        return h33;
    }

    /*
     * WARNING - void declaration
     */
    final String T(E5 e52) {
        Object var2_6;
        Object object = this.l().w(new u5(this, e52));
        try {
            object = object.get(30000L, TimeUnit.MILLISECONDS);
            return object;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
        }
        catch (TimeoutException timeoutException) {
            // empty catch block
        }
        this.k().G().c("Failed to get app instance id. appId", V1.v(e52.q), var2_6);
        return null;
    }

    final void U(f f8) {
        E5 e52 = this.Z(ax.M5.p.l(f8.q));
        if (e52 != null) {
            this.V(f8, e52);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void V(f f8, E5 e52) {
        Throwable throwable2;
        block14: {
            Object object;
            boolean bl;
            ax.N5.a a8;
            boolean bl2;
            block13: {
                ax.M5.p.l(f8);
                ax.M5.p.f(f8.q);
                ax.M5.p.l(f8.c0);
                ax.M5.p.l(f8.d0);
                ax.M5.p.f(f8.d0.c0);
                ((f3)this.l()).n();
                this.v0();
                if (!q5.m0(e52)) {
                    return;
                }
                if (!e52.i0) {
                    this.h(e52);
                    return;
                }
                f8 = new f(f8);
                bl2 = false;
                f8.f0 = false;
                this.h0().X0();
                try {
                    a8 = this.h0().D0(ax.M5.p.l(f8.q), f8.d0.c0);
                    if (a8 == null || ((f)a8).c0.equals(f8.c0)) break block13;
                    this.k().L().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.l.D().g(f8.d0.c0), f8.c0, ((f)a8).c0);
                }
                catch (Throwable throwable2) {
                    break block14;
                }
            }
            if (a8 != null && (bl = ((f)a8).f0)) {
                f8.c0 = ((f)a8).c0;
                f8.e0 = ((f)a8).e0;
                f8.i0 = ((f)a8).i0;
                f8.g0 = ((f)a8).g0;
                f8.j0 = ((f)a8).j0;
                f8.f0 = bl;
                A5 a52 = f8.d0;
                f8.d0 = object = new A5(a52.c0, ((f)a8).d0.d0, a52.k(), ((f)a8).d0.g0);
            } else if (TextUtils.isEmpty((CharSequence)f8.g0)) {
                a8 = f8.d0;
                f8.d0 = object = new A5(((A5)a8).c0, f8.e0, ((A5)a8).k(), f8.d0.g0);
                bl2 = true;
                f8.f0 = true;
            }
            if (f8.f0) {
                a8 = f8.d0;
                object = new C5(ax.M5.p.l(f8.q), f8.c0, ((A5)a8).c0, ((A5)a8).d0, ax.M5.p.l(((A5)a8).k()));
                if (this.h0().f0((C5)object)) {
                    this.k().F().d("User property updated immediately", f8.q, this.l.D().g(((C5)object).c), ((C5)object).e);
                } else {
                    this.k().G().d("(2)Too many active user properties, ignoring", V1.v(f8.q), this.l.D().g(((C5)object).c), ((C5)object).e);
                }
                if (bl2 && f8.j0 != null) {
                    object = new D(f8.j0, f8.e0);
                    this.b0((D)object, e52);
                }
            }
            if (this.h0().d0(f8)) {
                this.k().F().d("Conditional property added", f8.q, this.l.D().g(f8.d0.c0), f8.d0.k());
            } else {
                this.k().G().d("Too many conditional properties, ignoring", V1.v(f8.q), this.l.D().g(f8.d0.c0), f8.d0.k());
            }
            this.h0().b1();
            this.h0().Z0();
            return;
        }
        this.h0().Z0();
        throw throwable2;
    }

    final void Y(Z1 z12, e2.a a8) {
        ((f3)this.l()).n();
        this.v0();
        U1.a a9 = U1.U();
        Object object = z12.E();
        Object object2 = a9;
        if (object != null) {
            try {
                object2 = x5.G(a9, (byte[])object);
            }
            catch (s4 s42) {
                this.k().L().b("Failed to parse locally stored ad campaign info. appId", V1.v(z12.l()));
                object2 = a9;
            }
        }
        for (ax.b6.Z1 z13 : a8.M()) {
            long l8;
            if (!z13.e0().equals("_cmp")) continue;
            String string = (String)x5.J(z13, "gclid", "");
            String string2 = (String)x5.J(z13, "gbraid", "");
            object = (String)x5.J(z13, "gad_source", "");
            if (string.isEmpty() && string2.isEmpty() & ((String)object).isEmpty()) continue;
            long l9 = l8 = ((Long)x5.J(z13, "click_timestamp", 0L)).longValue();
            if (l8 <= 0L) {
                l9 = z13.b0();
            }
            if ("referrer API v2".equals(x5.g0(z13, "_cis"))) {
                if (l9 <= ((U1.a)object2).z()) continue;
                if (string.isEmpty()) {
                    ((U1.a)object2).M();
                } else {
                    ((U1.a)object2).K(string);
                }
                if (string2.isEmpty()) {
                    ((U1.a)object2).L();
                } else {
                    ((U1.a)object2).I(string2);
                }
                if (((String)object).isEmpty()) {
                    ((U1.a)object2).J();
                } else {
                    ((U1.a)object2).G((String)object);
                }
                ((U1.a)object2).B(l9);
                continue;
            }
            if (l9 <= ((U1.a)object2).w()) continue;
            if (string.isEmpty()) {
                ((U1.a)object2).H();
            } else {
                ((U1.a)object2).E(string);
            }
            if (string2.isEmpty()) {
                ((U1.a)object2).F();
            } else {
                ((U1.a)object2).C(string2);
            }
            if (((String)object).isEmpty()) {
                ((U1.a)object2).D();
            } else {
                ((U1.a)object2).y((String)object);
            }
            ((U1.a)object2).x(l9);
        }
        if (!((U1)((k4)((k4.b)object2).q())).equals(U1.d0())) {
            a8.D((U1)((k4)((k4.b)object2).q()));
        }
        z12.i(((U1)((k4)((k4.b)object2).q())).l());
        if (z12.B()) {
            this.h0().V(z12, false, false);
        }
    }

    @Override
    public final Context a() {
        return this.l.a();
    }

    public final J5 a0() {
        return (J5)q5.j(this.f);
    }

    @Override
    public final e b() {
        return ax.M5.p.l(this.l).b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void c0(E5 e52) {
        Throwable throwable2;
        block49: {
            block56: {
                Object object;
                Object object2;
                long l8;
                Object object3;
                block45: {
                    int n8;
                    long l9;
                    block46: {
                        block52: {
                            block48: {
                                block54: {
                                    block55: {
                                        RuntimeException runtimeException2;
                                        block50: {
                                            Object object4;
                                            block53: {
                                                block51: {
                                                    block47: {
                                                        int n9;
                                                        ((f3)this.l()).n();
                                                        this.v0();
                                                        ax.M5.p.l(e52);
                                                        ax.M5.p.f(e52.q);
                                                        if (!q5.m0(e52)) {
                                                            return;
                                                        }
                                                        object3 = this.h0().H0(e52.q);
                                                        if (object3 != null && TextUtils.isEmpty((CharSequence)((Z1)object3).q()) && !TextUtils.isEmpty((CharSequence)e52.c0)) {
                                                            ((Z1)object3).R(0L);
                                                            this.h0().V((Z1)object3, false, false);
                                                            this.n0().V(e52.q);
                                                        }
                                                        if (!e52.i0) {
                                                            this.h(e52);
                                                            return;
                                                        }
                                                        l8 = l9 = e52.n0;
                                                        if (l9 == 0L) {
                                                            l8 = this.b().a();
                                                        }
                                                        this.l.A().x();
                                                        n8 = n9 = e52.o0;
                                                        if (n9 != 0) {
                                                            n8 = n9;
                                                            if (n9 != 1) {
                                                                this.k().L().c("Incorrect app type, assuming installed app. appId, appType", V1.v(e52.q), n9);
                                                                n8 = 0;
                                                            }
                                                        }
                                                        this.h0().X0();
                                                        try {
                                                            object2 = this.h0().I0(e52.q, "_npa");
                                                            object = this.k0(e52);
                                                            if (object2 == null || "auto".equals(((C5)object2).b)) {
                                                                if (object != null) {
                                                                    l9 = ((Boolean)object).booleanValue() ? 1L : 0L;
                                                                    object3 = new A5("_npa", l8, l9, "auto");
                                                                    if (object2 == null || !((C5)object2).e.equals(((A5)object3).e0)) {
                                                                        this.z((A5)object3, e52);
                                                                    }
                                                                } else if (object2 != null) {
                                                                    this.G("_npa", e52);
                                                                }
                                                            }
                                                            object3 = object = this.h0().H0(ax.M5.p.l(e52.q));
                                                            if (object != null) {
                                                                this.t0();
                                                                object3 = object;
                                                                if (B5.m0(e52.c0, ((Z1)object).q(), e52.r0, ((Z1)object).j())) {
                                                                    this.k().L().b("New GMP App Id passed in. Removing cached database data. appId", V1.v(((Z1)object).l()));
                                                                    object3 = this.h0();
                                                                    object = ((Z1)object).l();
                                                                    ((k5)object3).u();
                                                                    ((f3)object3).n();
                                                                    ax.M5.p.f((String)object);
                                                                    try {
                                                                        object2 = ((l)object3).B();
                                                                        object4 = new String[]{object};
                                                                        n9 = object2.delete("events", "app_id=?", (String[])object4) + object2.delete("user_attributes", "app_id=?", (String[])object4) + object2.delete("conditional_properties", "app_id=?", (String[])object4) + object2.delete("apps", "app_id=?", (String[])object4) + object2.delete("raw_events", "app_id=?", (String[])object4) + object2.delete("raw_events_metadata", "app_id=?", (String[])object4) + object2.delete("event_filters", "app_id=?", (String[])object4) + object2.delete("property_filters", "app_id=?", (String[])object4) + object2.delete("audience_filter_values", "app_id=?", (String[])object4) + object2.delete("consent_settings", "app_id=?", (String[])object4) + object2.delete("default_event_params", "app_id=?", (String[])object4) + object2.delete("trigger_uris", "app_id=?", (String[])object4);
                                                                        if (n9 > 0) {
                                                                            ((f3)object3).k().K().c("Deleted application data. app, records", object, n9);
                                                                        }
                                                                    }
                                                                    catch (SQLiteException sQLiteException) {
                                                                        ((f3)object3).k().G().c("Error deleting application data. appId, error", V1.v((String)object), (Object)sQLiteException);
                                                                    }
                                                                    object3 = null;
                                                                }
                                                            }
                                                            if (object3 != null) {
                                                                n9 = ((Z1)object3).U() != Integer.MIN_VALUE && ((Z1)object3).U() != e52.k0 ? 1 : 0;
                                                                object = ((Z1)object3).o();
                                                                int n10 = ((Z1)object3).U() == Integer.MIN_VALUE && object != null && !((String)object).equals(e52.d0) ? 1 : 0;
                                                                if ((n10 | n9) != 0) {
                                                                    object3 = new Bundle();
                                                                    object3.putString("_pv", (String)object);
                                                                    object2 = new C((Bundle)object3);
                                                                    object = new D("_au", (C)object2, "auto", l8);
                                                                    this.v((D)object, e52);
                                                                }
                                                            }
                                                            this.h(e52);
                                                            object3 = n8 == 0 ? this.h0().G0(e52.q, "_f") : (n8 == 1 ? this.h0().G0(e52.q, "_v") : null);
                                                            if (object3 != null) break block45;
                                                            l9 = l8 / 3600000L;
                                                            l9 = (l9 + 1L) * 3600000L;
                                                            if (n8 != 0) break block46;
                                                            object3 = new A5("_fot", l8, l9, "auto");
                                                            this.z((A5)object3, e52);
                                                            ((f3)this.l()).n();
                                                            object = ax.M5.p.l(this.k);
                                                            object2 = e52.q;
                                                            if (object2 != null && !((String)object2).isEmpty()) break block47;
                                                            break block48;
                                                        }
                                                        catch (Throwable throwable2) {
                                                            break block49;
                                                        }
                                                    }
                                                    ((f3)((o2)object).a.l()).n();
                                                    if (((o2)object).b()) break block51;
                                                    ((o2)object).a.k().J().a("Install Referrer Reporter is not available");
                                                    break block52;
                                                }
                                                object3 = new n2((o2)object, (String)object2);
                                                ((f3)((o2)object).a.l()).n();
                                                object2 = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                                object4 = new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService");
                                                object2.setComponent((ComponentName)object4);
                                                object4 = ((o2)object).a.a().getPackageManager();
                                                if (object4 != null) break block53;
                                                ((o2)object).a.k().N().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                                break block52;
                                            }
                                            if ((object4 = object4.queryIntentServices((Intent)object2, 0)) == null || object4.isEmpty()) break block54;
                                            object4 = ((ResolveInfo)object4.get((int)0)).serviceInfo;
                                            if (object4 == null) break block52;
                                            String string = ((ServiceInfo)object4).packageName;
                                            if (((ServiceInfo)object4).name == null || !"com.android.vending".equals(string) || !((o2)object).b()) break block55;
                                            object4 = new Intent((Intent)object2);
                                            try {
                                                boolean bl = ax.Q5.b.b().a(((o2)object).a.a(), (Intent)object4, (ServiceConnection)object3, 1);
                                                object2 = ((o2)object).a.k().K();
                                                object3 = bl ? "available" : "not available";
                                            }
                                            catch (RuntimeException runtimeException2) {
                                                break block50;
                                            }
                                            ((X1)object2).b("Install Referrer Service is", object3);
                                            break block52;
                                        }
                                        ((o2)object).a.k().G().b("Exception occurred while binding to Install Referrer Service", runtimeException2.getMessage());
                                        break block52;
                                    }
                                    ((o2)object).a.k().L().a("Play Store version 8.3.73 or higher required for Install Referrer");
                                    break block52;
                                }
                                ((o2)object).a.k().J().a("Play Service for fetching Install Referrer is unavailable on device");
                                break block52;
                            }
                            ((o2)object).a.k().N().a("Install Referrer Reporter was called with invalid app package name");
                        }
                        ((f3)this.l()).n();
                        this.v0();
                        object = new Bundle();
                        object.putLong("_c", 1L);
                        object.putLong("_r", 1L);
                        object.putLong("_uwa", 0L);
                        object.putLong("_pfo", 0L);
                        object.putLong("_sys", 0L);
                        object.putLong("_sysu", 0L);
                        object.putLong("_et", 1L);
                        if (e52.q0) {
                            object.putLong("_dac", 1L);
                        }
                        object2 = ax.M5.p.l(e52.q);
                        object3 = this.h0();
                        ax.M5.p.f((String)object2);
                        ((f3)object3).n();
                        ((k5)object3).u();
                        long l10 = ((l)object3).x0((String)object2, "first_open_count");
                        if (this.l.a().getPackageManager() == null) {
                            this.k().G().b("PackageManager is null, first open report might be inaccurate. appId", V1.v((String)object2));
                        } else {
                            try {
                                object3 = ax.S5.e.a(this.l.a()).d((String)object2, 0);
                            }
                            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                                this.k().G().c("Package info is null, first open report might be inaccurate. appId", V1.v((String)object2), (Object)nameNotFoundException);
                                object3 = null;
                            }
                            if (object3 != null && (l9 = ((PackageInfo)object3).firstInstallTime) != 0L) {
                                if (l9 != ((PackageInfo)object3).lastUpdateTime) {
                                    if (this.f0().t(com.google.android.gms.measurement.internal.F.o0)) {
                                        if (l10 == 0L) {
                                            object.putLong("_uwa", 1L);
                                        }
                                    } else {
                                        object.putLong("_uwa", 1L);
                                    }
                                    n8 = 0;
                                } else {
                                    n8 = 1;
                                }
                                l9 = n8 != 0 ? 1L : 0L;
                                object3 = new A5("_fi", l8, l9, "auto");
                                this.z((A5)object3, e52);
                            }
                            try {
                                object3 = ax.S5.e.a(this.l.a()).b((String)object2, 0);
                            }
                            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                                this.k().G().c("Application info is null, first open report might be inaccurate. appId", V1.v((String)object2), (Object)nameNotFoundException);
                                object3 = null;
                            }
                            if (object3 != null) {
                                if ((((ApplicationInfo)object3).flags & 1) != 0) {
                                    object.putLong("_sys", 1L);
                                }
                                if ((((ApplicationInfo)object3).flags & 0x80) != 0) {
                                    object.putLong("_sysu", 1L);
                                }
                            }
                        }
                        if (l10 >= 0L) {
                            object.putLong("_pfo", l10);
                        }
                        object2 = new C((Bundle)object);
                        object3 = new D("_f", (C)object2, "auto", l8);
                        this.W((D)object3, e52);
                        break block56;
                    }
                    if (n8 == 1) {
                        object3 = new A5("_fvt", l8, l9, "auto");
                        this.z((A5)object3, e52);
                        ((f3)this.l()).n();
                        this.v0();
                        object = new Bundle();
                        object.putLong("_c", 1L);
                        object.putLong("_r", 1L);
                        object.putLong("_et", 1L);
                        if (e52.q0) {
                            object.putLong("_dac", 1L);
                        }
                        object3 = new C((Bundle)object);
                        object2 = new D("_v", (C)object3, "auto", l8);
                        this.W((D)object2, e52);
                    }
                    break block56;
                }
                if (e52.j0) {
                    object3 = new Bundle();
                    object2 = new C((Bundle)object3);
                    object = new D("_cd", (C)object2, "auto", l8);
                    this.W((D)object, e52);
                }
            }
            this.h0().b1();
            this.h0().Z0();
            return;
        }
        this.h0().Z0();
        throw throwable2;
    }

    @Override
    public final c e() {
        return this.l.e();
    }

    final void e0(E5 e52) {
        block6: {
            Object object;
            if (this.y != null) {
                object = new ArrayList<Long>();
                this.z = object;
                object.addAll(this.y);
            }
            l l8 = this.h0();
            object = ax.M5.p.l(e52.q);
            ax.M5.p.f((String)object);
            l8.n();
            l8.u();
            SQLiteDatabase sQLiteDatabase = l8.B();
            String[] stringArray = new String[]{object};
            int n8 = sQLiteDatabase.delete("apps", "app_id=?", stringArray) + sQLiteDatabase.delete("events", "app_id=?", stringArray) + sQLiteDatabase.delete("events_snapshot", "app_id=?", stringArray) + sQLiteDatabase.delete("user_attributes", "app_id=?", stringArray) + sQLiteDatabase.delete("conditional_properties", "app_id=?", stringArray) + sQLiteDatabase.delete("raw_events", "app_id=?", stringArray) + sQLiteDatabase.delete("raw_events_metadata", "app_id=?", stringArray) + sQLiteDatabase.delete("queue", "app_id=?", stringArray) + sQLiteDatabase.delete("audience_filter_values", "app_id=?", stringArray) + sQLiteDatabase.delete("main_event_params", "app_id=?", stringArray) + sQLiteDatabase.delete("default_event_params", "app_id=?", stringArray) + sQLiteDatabase.delete("trigger_uris", "app_id=?", stringArray);
            if (n8 <= 0) break block6;
            try {
                l8.k().K().c("Reset analytics data. app, records", object, n8);
            }
            catch (SQLiteException sQLiteException) {
                l8.k().G().c("Error resetting analytics data. appId, error", V1.v((String)object), (Object)sQLiteException);
            }
        }
        if (e52.i0) {
            this.c0(e52);
        }
    }

    final Bundle f(String string) {
        ((f3)this.l()).n();
        this.v0();
        if (this.n0().J(string) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        Object object = this.S(string);
        bundle.putAll(((h3)object).o());
        bundle.putAll(this.g(string, this.d0(string), (h3)object, new i()).f());
        int n8 = this.s0().j0(string) ? 1 : ((object = this.h0().I0(string, "_npa")) != null ? ((C5)object).e.equals(1L) : this.c(string, new i()));
        string = n8 == 1 ? "denied" : "granted";
        bundle.putString("ad_personalization", string);
        return bundle;
    }

    public final h f0() {
        return ax.M5.p.l(this.l).z();
    }

    final void g0(E5 object) {
        boolean bl;
        Object object2;
        Object object3;
        block5: {
            boolean bl2;
            block7: {
                block6: {
                    ((f3)this.l()).n();
                    this.v0();
                    ax.M5.p.f(((E5)object).q);
                    object3 = com.google.android.gms.measurement.internal.u.d(((E5)object).C0);
                    this.k().K().c("Setting DMA consent for package", ((E5)object).q, object3);
                    object = ((E5)object).q;
                    ((f3)this.l()).n();
                    this.v0();
                    object2 = com.google.android.gms.measurement.internal.u.b(this.f((String)object), 100).g();
                    this.C.put((String)object, (u)object3);
                    this.h0().W((String)object, (u)object3);
                    ax.f6.o o8 = com.google.android.gms.measurement.internal.u.b(this.f((String)object), 100).g();
                    ((f3)this.l()).n();
                    this.v0();
                    object3 = ax.f6.o.e0;
                    boolean bl3 = false;
                    bl2 = object2 == object3 && o8 == ax.f6.o.f0;
                    boolean bl4 = object2 == ax.f6.o.f0 && o8 == object3;
                    bl = bl2;
                    if (!this.f0().t(com.google.android.gms.measurement.internal.F.J0)) break block5;
                    if (bl2) break block6;
                    bl2 = bl3;
                    if (!bl4) break block7;
                }
                bl2 = true;
            }
            bl = bl2;
        }
        if (bl) {
            this.k().K().b("Generated _dcu event for", object);
            object3 = new Bundle();
            if (this.h0().J((long)this.A0(), (String)object, (boolean)false, (boolean)false, (boolean)false, (boolean)false, (boolean)false, (boolean)false).f < (long)this.f0().v((String)object, com.google.android.gms.measurement.internal.F.X)) {
                object3.putLong("_r", 1L);
                object2 = this.h0().J(this.A0(), (String)object, false, false, false, false, false, true);
                this.k().K().c("_dcu realtime event count", object, ((p)object2).f);
            }
            this.G.b((String)object, "_dcu", (Bundle)object3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    final Z1 h(E5 e52) {
        long l8;
        boolean bl;
        Object object;
        Object object2;
        block32: {
            block29: {
                h3 h32;
                block30: {
                    block31: {
                        String string;
                        block28: {
                            ((f3)this.l()).n();
                            this.v0();
                            ax.M5.p.l(e52);
                            ax.M5.p.f(e52.q);
                            if (!e52.x0.isEmpty()) {
                                this.D.put(e52.q, new b(this, e52.x0, null));
                            }
                            object2 = this.h0().H0(e52.q);
                            h32 = this.S(e52.q).h(h3.q(e52.w0));
                            string = h32.A() ? this.i.A(e52.q, e52.p0) : "";
                            if (object2 != null) break block28;
                            object2 = new Z1(this.l, e52.q);
                            if (h32.B()) {
                                ((Z1)object2).J(this.o(h32));
                            }
                            object = object2;
                            if (h32.A()) {
                                ((Z1)object2).f0(string);
                                object = object2;
                            }
                            break block29;
                        }
                        if (!h32.A() || string == null || string.equals(((Z1)object2).s())) break block30;
                        boolean bl2 = TextUtils.isEmpty((CharSequence)((Z1)object2).s());
                        ((Z1)object2).f0(string);
                        if (!e52.p0 || "00000000-0000-0000-0000-000000000000".equals(this.i.z((String)e52.q, (h3)h32).first) || bl2) break block31;
                        if (m6.a() && this.f0().t(com.google.android.gms.measurement.internal.F.W0) && !h32.B()) {
                            bl2 = true;
                        } else {
                            ((Z1)object2).J(this.o(h32));
                            bl2 = false;
                        }
                        object = object2;
                        bl = bl2;
                        if (this.h0().I0(e52.q, "_id") != null) {
                            object = object2;
                            bl = bl2;
                            if (this.h0().I0(e52.q, "_lair") == null) {
                                l8 = this.b().a();
                                object = new C5(e52.q, "auto", "_lair", l8, 1L);
                                this.h0().f0((C5)object);
                                object = object2;
                                bl = bl2;
                            }
                        }
                        break block32;
                    }
                    object = object2;
                    if (TextUtils.isEmpty((CharSequence)((Z1)object2).m())) {
                        object = object2;
                        if (h32.B()) {
                            ((Z1)object2).J(this.o(h32));
                            object = object2;
                        }
                    }
                    break block29;
                }
                object = object2;
                if (TextUtils.isEmpty((CharSequence)((Z1)object2).m())) {
                    object = object2;
                    if (h32.B()) {
                        ((Z1)object2).J(this.o(h32));
                        object = object2;
                    }
                }
            }
            bl = false;
        }
        ((Z1)object).Z(e52.c0);
        ((Z1)object).f(e52.r0);
        if (!TextUtils.isEmpty((CharSequence)e52.l0)) {
            ((Z1)object).W(e52.l0);
        }
        if ((l8 = e52.f0) != 0L) {
            ((Z1)object).u0(l8);
        }
        if (!TextUtils.isEmpty((CharSequence)e52.d0)) {
            ((Z1)object).S(e52.d0);
        }
        ((Z1)object).H(e52.k0);
        object2 = e52.e0;
        if (object2 != null) {
            ((Z1)object).O((String)object2);
        }
        ((Z1)object).n0(e52.g0);
        ((Z1)object).K(e52.i0);
        if (!TextUtils.isEmpty((CharSequence)e52.h0)) {
            ((Z1)object).c0(e52.h0);
        }
        ((Z1)object).h(e52.p0);
        ((Z1)object).d(e52.s0);
        ((Z1)object).q0(e52.t0);
        ((Z1)object).l0(e52.y0);
        if (y6.a() && this.f0().t(com.google.android.gms.measurement.internal.F.r0)) {
            ((Z1)object).g(e52.u0);
        } else if (y6.a() && this.f0().t(com.google.android.gms.measurement.internal.F.q0)) {
            ((Z1)object).g(null);
        }
        if (r7.a() && this.f0().t(com.google.android.gms.measurement.internal.F.t0)) {
            this.t0();
            if (B5.H0(((Z1)object).l())) {
                ((Z1)object).P(e52.z0);
                if (this.f0().t(com.google.android.gms.measurement.internal.F.u0)) {
                    ((Z1)object).o0(e52.F0);
                }
            }
        }
        if (k7.a() && this.f0().t(com.google.android.gms.measurement.internal.F.A0)) {
            ((Z1)object).b(e52.D0);
        }
        ((Z1)object).G0(e52.A0);
        if (g6.a() && this.f0().t(com.google.android.gms.measurement.internal.F.Q0)) {
            ((Z1)object).i0(e52.G0);
        }
        if (m6.a() && this.f0().t(com.google.android.gms.measurement.internal.F.W0)) {
            if (!((Z1)object).B() && !bl) return object;
            this.h0().V((Z1)object, bl, false);
            return object;
        } else {
            if (!((Z1)object).B()) return object;
            this.h0().V((Z1)object, false, false);
        }
        return object;
    }

    public final l h0() {
        return (l)q5.j(this.c);
    }

    final void i0(E5 e52) {
        ((f3)this.l()).n();
        this.v0();
        ax.M5.p.f(e52.q);
        int n8 = e52.B0;
        h3 h32 = h3.i(e52.w0, n8);
        h3 h33 = this.S(e52.q);
        this.k().K().c("Setting storage consent for package", e52.q, h32);
        this.E(e52.q, h32);
        if (!(m6.a() && this.f0().t(com.google.android.gms.measurement.internal.F.W0) || !h32.u(h33))) {
            this.e0(e52);
        }
    }

    public final R1 j0() {
        return this.l.D();
    }

    @Override
    public final V1 k() {
        return ax.M5.p.l(this.l).k();
    }

    @Override
    public final z2 l() {
        return ax.M5.p.l(this.l).l();
    }

    public final Y1 l0() {
        return (Y1)q5.j(this.b);
    }

    public final q2 n0() {
        return (q2)q5.j(this.a);
    }

    final E2 o0() {
        return this.l;
    }

    public final b4 p0() {
        return (b4)q5.j(this.h);
    }

    public final Q4 q0() {
        return this.i;
    }

    public final o5 r0() {
        return this.j;
    }

    public final x5 s0() {
        return (x5)q5.j(this.g);
    }

    final void t(f f8) {
        E5 e52 = this.Z(ax.M5.p.l(f8.q));
        if (e52 != null) {
            this.u(f8, e52);
        }
    }

    public final B5 t0() {
        return ax.M5.p.l(this.l).L();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void u(f f8, E5 e52) {
        Throwable throwable2;
        block7: {
            block8: {
                block5: {
                    ax.N5.a a8;
                    f f9;
                    String string;
                    block6: {
                        ax.M5.p.l(f8);
                        ax.M5.p.f(f8.q);
                        ax.M5.p.l(f8.d0);
                        ax.M5.p.f(f8.d0.c0);
                        ((f3)this.l()).n();
                        this.v0();
                        if (!q5.m0(e52)) {
                            return;
                        }
                        if (!e52.i0) {
                            this.h(e52);
                            return;
                        }
                        this.h0().X0();
                        try {
                            this.h(e52);
                            string = ax.M5.p.l(f8.q);
                            f9 = this.h0().D0(string, f8.d0.c0);
                            if (f9 == null) break block5;
                            this.k().F().c("Removing conditional user property", f8.q, this.l.D().g(f8.d0.c0));
                            this.h0().D(string, f8.d0.c0);
                            if (!f9.f0) break block6;
                            this.h0().O0(string, f8.d0.c0);
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    if ((a8 = f8.l0) != null) {
                        a8 = a8.c0;
                        a8 = a8 != null ? ((C)a8).B() : null;
                        this.b0(ax.M5.p.l(this.t0().H(string, ax.M5.p.l(f8.l0).q, (Bundle)a8, f9.c0, f8.l0.e0, true, true)), e52);
                    }
                    break block8;
                }
                this.k().L().c("Conditional user property doesn't exist", V1.v(f8.q), this.l.D().g(f8.d0.c0));
            }
            this.h0().b1();
            this.h0().Z0();
            return;
        }
        this.h0().Z0();
        throw throwable2;
    }

    final void u0() {
        ((f3)this.l()).n();
        this.v0();
        if (!this.n) {
            this.n = true;
            if (this.R()) {
                int n8 = this.d(this.x);
                int n9 = this.l.B().D();
                ((f3)this.l()).n();
                if (n8 > n9) {
                    this.k().G().c("Panic: can't downgrade version. Previous, current version", n8, n9);
                    return;
                }
                if (n8 < n9) {
                    if (this.L(n9, this.x)) {
                        this.k().K().c("Storage version upgraded. Previous, current version", n8, n9);
                    } else {
                        this.k().G().c("Storage version upgrade failed. Previous, current version", n8, n9);
                    }
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    final void v(D var1_1, E5 var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 313->371)] java.lang.Throwable
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

    final void v0() {
        if (this.m) {
            return;
        }
        throw new IllegalStateException("UploadController is not initialized");
    }

    final void w(D d8, String string) {
        Z1 z12 = this.h0().H0(string);
        if (z12 != null && !TextUtils.isEmpty((CharSequence)z12.o())) {
            Boolean bl = this.n(z12);
            if (bl == null) {
                if (!"_ui".equals(d8.q)) {
                    this.k().L().b("Could not find package. appId", V1.v(string));
                }
            } else if (!bl.booleanValue()) {
                this.k().G().b("App version does not match; dropping event. appId", V1.v(string));
                return;
            }
            this.W(d8, new E5(string, z12.q(), z12.o(), z12.U(), z12.n(), z12.z0(), z12.t0(), null, z12.A(), false, z12.p(), z12.Q(), 0L, 0, z12.z(), false, z12.j(), z12.K0(), z12.v0(), z12.w(), null, this.S(string).z(), "", null, z12.C(), z12.J0(), this.S(string).b(), this.d0(string).j(), z12.a(), z12.X(), z12.v(), z12.t()));
            return;
        }
        this.k().F().b("No app data available; dropping event", string);
    }

    final void w0() {
        ++this.s;
    }

    final void x(Z1 object, e2.a a8) {
        int n8;
        Object object2;
        Object object3;
        i i8;
        block30: {
            ((f3)this.l()).n();
            this.v0();
            i8 = com.google.android.gms.measurement.internal.i.a(a8.j1());
            if (g6.a() && this.f0().t(com.google.android.gms.measurement.internal.F.Q0)) {
                object3 = ((Z1)object).l();
                ((f3)this.l()).n();
                this.v0();
                object3 = this.S((String)object3);
                object2 = v5.a;
                n8 = object2[((h3)object3).t().ordinal()];
                if (n8 != 1) {
                    if (n8 != 2 && n8 != 3) {
                        i8.d(h3.a.c0, com.google.android.gms.measurement.internal.k.l0);
                    } else {
                        i8.c(h3.a.c0, ((h3)object3).b());
                    }
                } else {
                    i8.d(h3.a.c0, com.google.android.gms.measurement.internal.k.k0);
                }
                n8 = object2[((h3)object3).v().ordinal()];
                if (n8 != 1) {
                    if (n8 != 2 && n8 != 3) {
                        i8.d(h3.a.d0, com.google.android.gms.measurement.internal.k.l0);
                    } else {
                        i8.c(h3.a.d0, ((h3)object3).b());
                    }
                } else {
                    i8.d(h3.a.d0, com.google.android.gms.measurement.internal.k.k0);
                }
            } else {
                object3 = ((Z1)object).l();
                ((f3)this.l()).n();
                this.v0();
                object3 = this.S((String)object3);
                if (((h3)object3).w() != null) {
                    i8.c(h3.a.c0, ((h3)object3).b());
                } else {
                    i8.d(h3.a.c0, com.google.android.gms.measurement.internal.k.l0);
                }
                if (((h3)object3).x() != null) {
                    i8.c(h3.a.d0, ((h3)object3).b());
                } else {
                    i8.d(h3.a.d0, com.google.android.gms.measurement.internal.k.l0);
                }
            }
            object3 = ((Z1)object).l();
            ((f3)this.l()).n();
            this.v0();
            object3 = this.g((String)object3, this.d0((String)object3), this.S((String)object3), i8);
            a8.X(ax.M5.p.l(((u)object3).h()));
            if (!TextUtils.isEmpty((CharSequence)((u)object3).i())) {
                a8.C0(((u)object3).i());
            }
            ((f3)this.l()).n();
            this.v0();
            object2 = a8.N().iterator();
            while (object2.hasNext()) {
                object3 = (i2)object2.next();
                if (!"_npa".equals(((i2)object3).c0())) continue;
                break block30;
            }
            object3 = null;
        }
        if (object3 != null) {
            object2 = (Object)h3.a.f0;
            if (i8.b((h3.a)((Object)object2)) == com.google.android.gms.measurement.internal.k.c0) {
                Object object4 = this.h0().I0(((Z1)object).l(), "_npa");
                if (object4 != null) {
                    if ("tcf".equals(((C5)object4).b)) {
                        i8.d((h3.a)((Object)object2), com.google.android.gms.measurement.internal.k.j0);
                    } else if ("app".equals(((C5)object4).b)) {
                        i8.d((h3.a)((Object)object2), com.google.android.gms.measurement.internal.k.h0);
                    } else {
                        i8.d((h3.a)((Object)object2), com.google.android.gms.measurement.internal.k.f0);
                    }
                } else {
                    object4 = ((Z1)object).K0();
                    if (!(object4 == null || object4 == Boolean.TRUE && ((i2)object3).X() != 1L || object4 == Boolean.FALSE && ((i2)object3).X() != 0L)) {
                        i8.d((h3.a)((Object)object2), com.google.android.gms.measurement.internal.k.f0);
                    } else {
                        i8.d((h3.a)((Object)object2), com.google.android.gms.measurement.internal.k.h0);
                    }
                }
            }
        } else {
            n8 = this.c(((Z1)object).l(), i8);
            a8.I((i2)((k4)i2.a0().z("_npa").C(this.b().a()).y(n8).q()));
            this.k().K().c("Setting user property", "non_personalized_ads(_npa)", n8);
        }
        a8.t0(i8.toString());
        boolean bl = this.a.Z(((Z1)object).l());
        object = a8.M();
        int n9 = 0;
        for (n8 = 0; n8 < object.size(); ++n8) {
            if (!"_tcf".equals(((ax.b6.Z1)object.get(n8)).e0())) continue;
            object = (Z1.a)((ax.b6.Z1)object.get(n8)).A();
            object3 = ((Z1.a)object).M();
            while (n9 < object3.size()) {
                if ("_tcfd".equals(object3.get(n9).f0())) {
                    object3 = f5.d(object3.get(n9).g0(), bl);
                    ((Z1.a)object).y(n9, b2.c0().C("_tcfd").E((String)object3));
                    break;
                }
                ++n9;
            }
            a8.y(n8, (Z1.a)object);
            return;
        }
    }

    final void x0() {
        ++this.r;
    }

    protected final void y0() {
        int n8;
        M1<Long> m12;
        ((f3)this.l()).n();
        this.h0().a1();
        l l8 = this.h0();
        l8.n();
        l8.u();
        if (l8.l0() && (Long)(m12 = com.google.android.gms.measurement.internal.F.g0).a(null) != 0L && (n8 = l8.B().delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(l8.b().a()), String.valueOf(m12.a(null))})) > 0) {
            l8.k().K().b("Deleted stale trigger uris. rowsDeleted", n8);
        }
        if (this.i.g.a() == 0L) {
            this.i.g.b(this.b().a());
        }
        this.P();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void z(A5 object, E5 e52) {
        Throwable throwable2;
        block18: {
            long l8;
            Object object2;
            block17: {
                ((f3)this.l()).n();
                this.v0();
                if (!q5.m0(e52)) {
                    return;
                }
                if (!e52.i0) {
                    this.h(e52);
                    return;
                }
                int n8 = this.t0().r0(((A5)object).c0);
                if (n8 != 0) {
                    this.t0();
                    String string = ((A5)object).c0;
                    this.f0();
                    string = B5.J(string, 24, true);
                    object = ((A5)object).c0;
                    int n9 = object != null ? ((String)object).length() : 0;
                    this.t0();
                    B5.Z(this.G, e52.q, n8, "_ev", string, n9);
                    return;
                }
                n8 = this.t0().w(((A5)object).c0, ((A5)object).k());
                if (n8 != 0) {
                    this.t0();
                    String string = ((A5)object).c0;
                    this.f0();
                    string = B5.J(string, 24, true);
                    object = ((A5)object).k();
                    int n10 = object != null && (object instanceof String || object instanceof CharSequence) ? String.valueOf(object).length() : 0;
                    this.t0();
                    B5.Z(this.G, e52.q, n8, "_ev", string, n10);
                    return;
                }
                Object object3 = this.t0().A0(((A5)object).c0, ((A5)object).k());
                if (object3 == null) {
                    return;
                }
                if ("_sid".equals(((A5)object).c0)) {
                    Object object4;
                    long l9 = ((A5)object).d0;
                    object2 = ((A5)object).g0;
                    String string = ax.M5.p.l(e52.q);
                    C5 c52 = this.h0().I0(string, "_sno");
                    if (c52 != null && (object4 = c52.e) instanceof Long) {
                        l8 = (Long)object4;
                    } else {
                        if (c52 != null) {
                            this.k().L().b("Retrieved last session number from database does not contain a valid (long) value", c52.e);
                        }
                        if ((object4 = this.h0().G0(string, "_s")) != null) {
                            l8 = ((y)object4).c;
                            this.k().K().b("Backfill the session number. Last used session number", l8);
                        } else {
                            l8 = 0L;
                        }
                    }
                    this.z(new A5("_sno", l9, l8 + 1L, (String)object2), e52);
                }
                object2 = new C5(ax.M5.p.l(e52.q), ax.M5.p.l(((A5)object).g0), ((A5)object).c0, ((A5)object).d0, object3);
                this.k().K().c("Setting user property", this.l.D().g(((C5)object2).c), object3);
                this.h0().X0();
                try {
                    if (!"_id".equals(((C5)object2).c) || (object3 = this.h0().I0(e52.q, "_id")) == null || ((C5)object2).e.equals(((C5)object3).e)) break block17;
                    this.h0().O0(e52.q, "_lair");
                }
                catch (Throwable throwable2) {
                    break block18;
                }
            }
            this.h(e52);
            boolean bl = this.h0().f0((C5)object2);
            if ("_sid".equals(((A5)object).c0)) {
                l8 = this.s0().z(e52.y0);
                object = this.h0().H0(e52.q);
                if (object != null) {
                    ((Z1)object).E0(l8);
                    if (((Z1)object).B()) {
                        this.h0().V((Z1)object, false, false);
                    }
                }
            }
            this.h0().b1();
            if (!bl) {
                this.k().G().c("Too many unique user properties are set. Ignoring user property", this.l.D().g(((C5)object2).c), ((C5)object2).e);
                this.t0();
                B5.Z(this.G, e52.q, 9, null, null, 0);
            }
            this.h0().Z0();
            return;
        }
        this.h0().Z0();
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void z0() {
        this.l().n();
        this.v0();
        this.v = true;
        try {
            var14_1 = this.l.J().W();
            if (var14_1 == null) {
                this.k().L().a("Upload data called on the client side before use of service was decided");
                this.v = false;
                this.O();
                return;
            }
        }
        catch (Throwable var14_2) {
            ** GOTO lbl238
        }
        {
            if (!var14_1.booleanValue()) ** GOTO lbl-1000
            this.k().G().a("Upload called in the client side when service should be used");
            this.v = false;
            this.O();
            return;
        }
lbl-1000:
        // 1 sources

        {
            if (this.o <= 0L) ** GOTO lbl-1000
            this.P();
            this.v = false;
            this.O();
            return;
        }
lbl-1000:
        // 1 sources

        {
            this.l().n();
            if (this.y == null) ** GOTO lbl-1000
            this.k().K().a("Uploading requested multiple times");
            this.v = false;
            this.O();
            return;
        }
lbl-1000:
        // 1 sources

        {
            if (this.l0().A()) ** GOTO lbl-1000
            this.k().K().a("Network not connected, ignoring upload request");
            this.P();
            this.v = false;
            this.O();
            return;
        }
lbl-1000:
        // 1 sources

        {
            var8_5 = this.b().a();
            var2_6 = this.f0().v(null, com.google.android.gms.measurement.internal.F.T);
            this.f0();
            var10_7 = com.google.android.gms.measurement.internal.h.J();
            for (var1_8 = 0; var1_8 < var2_6 && this.N(null, var8_5 - var10_7); ++var1_8) {
            }
        }
        {
            block51: {
                if (k7.a()) {
                    this.l().n();
                    for (Object var14_1 : this.q) {
                        if (!k7.a() || !this.f0().E((String)var14_1, com.google.android.gms.measurement.internal.F.A0)) continue;
                        this.k().F().b("Notifying app that trigger URIs are available. App ID", var14_1);
                        var15_10 = new Intent();
                        var15_10.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        var15_10.setPackage((String)var14_1);
                        this.l.a().sendBroadcast((Intent)var15_10);
                    }
                    this.q.clear();
                }
                if ((var10_7 = this.i.g.a()) != 0L) {
                    this.k().F().b("Uploading events. Elapsed time since last upload attempt (ms)", Math.abs(var8_5 - var10_7));
                }
                if (TextUtils.isEmpty((CharSequence)(var20_11 = this.h0().C()))) ** GOTO lbl227
                if (this.A == -1L) {
                    this.A = this.h0().y();
                }
                var2_6 = this.f0().v(var20_11, com.google.android.gms.measurement.internal.F.h);
                var1_8 = Math.max(0, this.f0().v(var20_11, com.google.android.gms.measurement.internal.F.i));
                var16_9 = this.h0().Q(var20_11, var2_6, var1_8);
                if (var16_9.isEmpty()) ** GOTO lbl234
                var14_1 = var16_9;
                if (!this.S(var20_11).A()) ** GOTO lbl-1000
                var15_10 = var16_9.iterator();
                while (var15_10.hasNext()) {
                    var14_1 = (e2)((Pair)var15_10.next()).first;
                    if (var14_1.v0().isEmpty()) continue;
                    var15_10 = var14_1.v0();
                    break block51;
                }
                var15_10 = null;
            }
            var14_1 = var16_9;
            if (var15_10 == null) ** GOTO lbl-1000
            var1_8 = 0;
            while (true) {
                var14_1 = var16_9;
                if (var1_8 >= var16_9.size()) break;
                var14_1 = (e2)((Pair)var16_9.get((int)var1_8)).first;
                if (!var14_1.v0().isEmpty() && !var14_1.v0().equals(var15_10)) {
                    var14_1 = var16_9.subList(0, var1_8);
                    break;
                }
                ++var1_8;
            }
        }
lbl-1000:
        // 4 sources

        {
            var22_12 = ax.b6.d2.N();
            var4_13 = var14_1.size();
            var23_14 = new ArrayList<Long>(var14_1.size());
            var1_8 = this.f0().M(var20_11) != false && this.S(var20_11).A() != false ? 1 : 0;
            var12_15 = this.S(var20_11).A();
            var13_16 = this.S(var20_11).B();
            var3_17 = l7.a() != false && this.f0().E(var20_11, com.google.android.gms.measurement.internal.F.s0) != false;
            var21_18 = this.j.u(var20_11);
            if (r7.a() && this.f0().t(com.google.android.gms.measurement.internal.F.t0)) {
                this.t0();
                if (B5.H0(var20_11)) {
                    var15_10 = this.n0().R(var20_11);
                    if (var21_18.a() == 3 && !TextUtils.isEmpty((CharSequence)var15_10)) {
                        var22_12.y((String)var15_10);
                    }
                }
            }
            for (var5_19 = 0; var5_19 < var4_13; ++var5_19) {
                var24_25 = (e2.a)((e2)((Pair)var14_1.get((int)var5_19)).first).A();
                var23_14.add((Long)((Pair)var14_1.get((int)var5_19)).second);
                this.f0();
                var24_25.R0(97001L).N0(var8_5).j0(false);
                if (var1_8 == 0) {
                    var24_25.M0();
                }
                if (!var12_15) {
                    var24_25.b1();
                    var24_25.V0();
                }
                if (!var13_16) {
                    var24_25.z0();
                }
                this.D(var20_11, var24_25);
                if (!var3_17) {
                    var24_25.d1();
                }
                if (m6.a() && this.f0().t(com.google.android.gms.measurement.internal.F.X0) && !var13_16) {
                    var24_25.D0();
                }
                if (n6.a() && this.f0().t(com.google.android.gms.measurement.internal.F.L0)) {
                    var15_10 = var24_25.n1();
                    if (TextUtils.isEmpty((CharSequence)var15_10) || var15_10.equals("00000000-0000-0000-0000-000000000000")) {
                        var25_26 = new ArrayList<ax.b6.Z1>(var24_25.M());
                        var17_22 = var25_26.iterator();
                        var15_10 = null;
                        var16_9 = null;
                        var6_20 = false;
                        var2_6 = 0;
                        while (var17_22.hasNext()) {
                            var26_27 = (ax.b6.Z1)var17_22.next();
                            if ("_fx".equals(var26_27.e0())) {
                                var17_22.remove();
                                var6_20 = true;
                                var2_6 = 1;
                                continue;
                            }
                            var18_23 = var15_10;
                            var19_24 = var16_9;
                            if ("_f".equals(var26_27.e0())) {
                                var18_23 = var15_10;
                                var19_24 = var16_9;
                                if (this.f0().t(com.google.android.gms.measurement.internal.F.T0)) {
                                    this.s0();
                                    var18_23 = x5.F((ax.b6.Z1)var26_27, "_pfo");
                                    if (var18_23 != null) {
                                        var15_10 = var18_23.a0();
                                    }
                                    this.s0();
                                    var26_27 = x5.F((ax.b6.Z1)var26_27, "_uwa");
                                    var18_23 = var15_10;
                                    var19_24 = var16_9;
                                    if (var26_27 != null) {
                                        var19_24 = var26_27.a0();
                                        var18_23 = var15_10;
                                    }
                                }
                                var2_6 = 1;
                            }
                            var15_10 = var18_23;
                            var16_9 = var19_24;
                        }
                        var17_22 = var14_1;
                        var7_21 = var1_8;
                        if (var6_20) {
                            var24_25.Q0();
                            var24_25.U(var25_26);
                        }
                        var14_1 = var17_22;
                        var1_8 = var7_21;
                        if (var2_6 != 0) {
                            this.H(var24_25.h1(), true, (Long)var15_10, (Long)var16_9);
                            var1_8 = var7_21;
                            var14_1 = var17_22;
                        }
                    }
                    if (var24_25.Y() == 0) continue;
                }
                if (this.f0().E(var20_11, com.google.android.gms.measurement.internal.F.i0)) {
                    var15_10 = ((e2)((k4)var24_25.q())).l();
                    var24_25.C(this.s0().A((byte[])var15_10));
                }
                if (r7.a() && this.f0().t(com.google.android.gms.measurement.internal.F.t0)) {
                    this.t0();
                    if (B5.H0(var20_11) && var21_18.a() == 3) {
                        var24_25.M0();
                    }
                }
                var22_12.x(var24_25);
            }
        }
        {
            if (!n6.a() || !this.f0().t(com.google.android.gms.measurement.internal.F.L0) || var22_12.w() != 0) ** GOTO lbl-1000
            this.I(var23_14);
            this.K(false, 204, null, null, var20_11);
            this.v = false;
            this.O();
            return;
        }
lbl-1000:
        // 1 sources

        {
            block52: {
                var14_1 = this.k().C(2) != false ? this.s0().M((ax.b6.d2)((k4)var22_12.q())) : null;
                this.s0();
                var16_9 = (List<Pair<e2, Long>>)((ax.b6.d2)((k4)var22_12.q())).l();
                this.I(var23_14);
                this.i.h.b(var8_5);
                var15_10 = "?";
                if (var4_13 > 0) {
                    var15_10 = var22_12.z(0).P3();
                }
                this.k().K().d("Uploading data. app, uncompressed size, data", var15_10, ((Object)var16_9).length, var14_1);
                this.u = true;
                var22_12 = this.l0();
                var14_1 = new URL(var21_18.b());
                var18_23 = var21_18.c();
                var17_22 = new s5(this, var20_11);
                var22_12.n();
                var22_12.u();
                ax.M5.p.l(var14_1);
                ax.M5.p.l(var16_9);
                ax.M5.p.l(var17_22);
                var15_10 = var22_12.l();
                break block52;
lbl227:
                // 1 sources

                this.A = -1L;
                var14_1 = this.h0();
                this.f0();
                var14_1 = var14_1.O(var8_5 - com.google.android.gms.measurement.internal.h.J());
                if (!TextUtils.isEmpty((CharSequence)var14_1) && (var14_1 = this.h0().H0((String)var14_1)) != null) {
                    this.X((Z1)var14_1);
                }
lbl234:
                // 6 sources

                while (true) {
                    this.v = false;
                    this.O();
                    return;
                }
lbl238:
                // 1 sources

                this.v = false;
                this.O();
                throw var14_2;
            }
            try {
                var19_24 = new d2((Y1)var22_12, var20_11, (URL)var14_1, (byte[])var16_9, (Map)var18_23, (c2)var17_22);
            }
            catch (MalformedURLException var14_3) lbl-1000:
            // 2 sources

            {
                while (true) {
                    this.k().G().c("Failed to parse upload URL. Not uploading. appId", V1.v(var20_11), var21_18.b());
                    ** continue;
                    break;
                }
            }
            try {
                var15_10.z((Runnable)var19_24);
                ** GOTO lbl234
            }
            catch (MalformedURLException var14_4) {
                ** continue;
            }
        }
    }

    private final class a
    implements o {
        e2 a;
        List<Long> b;
        List<ax.b6.Z1> c;
        private long d;
        private final q5 e;

        private a(q5 q52) {
            this.e = q52;
        }

        /* synthetic */ a(q5 q52, B b8) {
            this(q52);
        }

        private static long c(ax.b6.Z1 z12) {
            return z12.b0() / 1000L / 60L / 60L;
        }

        @Override
        public final boolean a(long l8, ax.b6.Z1 z12) {
            ax.M5.p.l(z12);
            if (this.c == null) {
                this.c = new ArrayList<ax.b6.Z1>();
            }
            if (this.b == null) {
                this.b = new ArrayList<Long>();
            }
            if (!this.c.isEmpty() && com.google.android.gms.measurement.internal.q5$a.c(this.c.get(0)) != com.google.android.gms.measurement.internal.q5$a.c(z12)) {
                return false;
            }
            long l9 = this.d + (long)z12.d();
            this.e.f0();
            if (l9 >= (long)Math.max(0, (Integer)com.google.android.gms.measurement.internal.F.j.a(null))) {
                return false;
            }
            this.d = l9;
            this.c.add(z12);
            this.b.add(l8);
            int n8 = this.c.size();
            this.e.f0();
            return n8 < Math.max(1, (Integer)com.google.android.gms.measurement.internal.F.k.a(null));
        }

        @Override
        public final void b(e2 e22) {
            ax.M5.p.l(e22);
            this.a = e22;
        }
    }

    private final class b {
        final String a;
        long b;

        private b(q5 q52) {
            this(q52, q52.t0().U0());
        }

        /* synthetic */ b(q5 q52, ax.f6.C c8) {
            this(q52);
        }

        private b(q5 q52, String string) {
            this.a = string;
            this.b = q52.b().b();
        }

        /* synthetic */ b(q5 q52, String string, ax.f6.C c8) {
            this(q52, string);
        }
    }
}

