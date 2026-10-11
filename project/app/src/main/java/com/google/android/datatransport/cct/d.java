/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import ax.o5.n;
import ax.o5.o;
import ax.o5.p;
import ax.o5.q;
import ax.o5.r;
import ax.o5.s;
import ax.o5.t;
import ax.o5.u;
import ax.o5.w;
import ax.o5.x;
import ax.p5.h;
import ax.p5.i;
import ax.q5.f;
import ax.q5.g;
import ax.q5.m;
import com.google.android.datatransport.cct.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;

final class d
implements m {
    private final ax.U7.a a = n.b();
    private final ConnectivityManager b;
    private final Context c;
    final URL d;
    private final ax.z5.a e;
    private final ax.z5.a f;
    private final int g;

    d(Context context, ax.z5.a a8, ax.z5.a a9) {
        this(context, a8, a9, 130000);
    }

    d(Context context, ax.z5.a a8, ax.z5.a a9, int n8) {
        this.c = context;
        this.b = (ConnectivityManager)context.getSystemService("connectivity");
        this.d = com.google.android.datatransport.cct.d.n(com.google.android.datatransport.cct.a.c);
        this.e = a9;
        this.f = a8;
        this.g = n8;
    }

    public static /* synthetic */ b c(d d8, a a8) {
        return d8.e(a8);
    }

    public static /* synthetic */ a d(a a8, b b8) {
        URL uRL = b8.b;
        if (uRL != null) {
            ax.t5.a.b("CctTransportBackend", "Following redirect to: %s", uRL);
            return a8.a(b8.b);
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    private b e(a var1_1) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [15 : 422->432)] java.lang.Throwable
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

    private static String f(Context object) {
        if ((object = com.google.android.datatransport.cct.d.k(object).getSimOperator()) != null) {
            return object;
        }
        return "";
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.c0.h();
        }
        int n8 = networkInfo.getSubtype();
        if (n8 == -1) {
            return w.b.w0.h();
        }
        if (w.b.d(n8) != null) {
            return n8;
        }
        return 0;
    }

    private static int h(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.c.u0.h();
        }
        return networkInfo.getType();
    }

    private static int i(Context context) {
        try {
            int n8 = context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)0).versionCode;
            return n8;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            ax.t5.a.d("CctTransportBackend", "Unable to find version code for package", nameNotFoundException);
            return -1;
        }
    }

    /*
     * WARNING - void declaration
     */
    private n j(f object4) {
        ArrayList<u> arrayList;
        Object object;
        HashMap hashMap = new HashMap();
        for (i i8 : ((f)object4).b()) {
            object = i8.n();
            if (!hashMap.containsKey(object)) {
                arrayList = new ArrayList();
                arrayList.add((u)((Object)i8));
                hashMap.put(object, arrayList);
                continue;
            }
            ((List)hashMap.get(object)).add(i8);
        }
        arrayList = new ArrayList<u>();
        for (Map.Entry entry : hashMap.entrySet()) {
            object = (i)((List)entry.getValue()).get(0);
            object = u.a().f(x.c0).g(this.f.a()).h(this.e.a()).b(o.a().c(o.b.d0).b(ax.o5.a.a().m(((i)object).i("sdk-version")).j(((i)object).b("model")).f(((i)object).b("hardware")).d(((i)object).b("device")).l(((i)object).b("product")).k(((i)object).b("os-uild")).h(((i)object).b("manufacturer")).e(((i)object).b("fingerprint")).c(((i)object).b("country")).g(((i)object).b("locale")).i(((i)object).b("mcc_mnc")).b(((i)object).b("application_build")).a()).a());
            try {
                ((u.a)object).i(Integer.parseInt((String)entry.getKey()));
            }
            catch (NumberFormatException numberFormatException) {
                ((u.a)object).j((String)entry.getKey());
            }
            ArrayList<t> arrayList2 = new ArrayList<t>();
            for (i i9 : (List)entry.getValue()) {
                Object object2;
                block16: {
                    Object var1_9;
                    block15: {
                        h h8;
                        block14: {
                            h8 = i9.e();
                            object2 = h8.b();
                            if (!((ax.n5.b)object2).equals(ax.n5.b.b("proto"))) break block14;
                            t.a a8 = t.l(h8.a());
                            break block15;
                        }
                        if (!((ax.n5.b)object2).equals(ax.n5.b.b("json"))) break block16;
                        t.a a9 = t.k(new String(h8.a(), Charset.forName("UTF-8")));
                    }
                    var1_9.d(i9.f()).e(i9.o()).j(i9.j("tz-offset")).g(w.a().c(w.c.d(i9.i("net-type"))).b(w.b.d(i9.i("mobile-subtype"))).a());
                    if (i9.d() != null) {
                        var1_9.c(i9.d());
                    }
                    if (i9.l() != null) {
                        var1_9.b(p.a().b(s.a().b(r.a().b(i9.l()).a()).a()).c(p.b.d0).a());
                    }
                    if (i9.g() != null || i9.h() != null) {
                        object2 = q.a();
                        if (i9.g() != null) {
                            ((q.a)object2).b(i9.g());
                        }
                        if (i9.h() != null) {
                            ((q.a)object2).c(i9.h());
                        }
                        var1_9.f(((q.a)object2).a());
                    }
                    arrayList2.add(var1_9.a());
                    continue;
                }
                ax.t5.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", object2);
            }
            ((u.a)object).c(arrayList2);
            arrayList.add(((u.a)object).a());
        }
        return n.a(arrayList);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager)context.getSystemService("phone");
    }

    static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    private static InputStream m(InputStream inputStream, String string) throws IOException {
        if ("gzip".equals(string)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    private static URL n(String string) {
        try {
            URL uRL = new URL(string);
            return uRL;
        }
        catch (MalformedURLException malformedURLException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid url: ");
            stringBuilder.append(string);
            throw new IllegalArgumentException(stringBuilder.toString(), malformedURLException);
        }
    }

    @Override
    public i a(i i8) {
        NetworkInfo networkInfo = this.b.getActiveNetworkInfo();
        return i8.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", com.google.android.datatransport.cct.d.l()).a("net-type", com.google.android.datatransport.cct.d.h(networkInfo)).a("mobile-subtype", com.google.android.datatransport.cct.d.g(networkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", com.google.android.datatransport.cct.d.f(this.c)).c("application_build", Integer.toString(com.google.android.datatransport.cct.d.i(this.c))).d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public g b(f object) {
        IOException iOException2;
        block9: {
            int n8;
            n n9 = this.j((f)object);
            URL uRL = this.d;
            Object object2 = ((f)object).c();
            Object object3 = null;
            Object var6_8 = null;
            Object object4 = uRL;
            if (object2 != null) {
                try {
                    object2 = com.google.android.datatransport.cct.a.c(((f)object).c());
                    object = var6_8;
                    if (((com.google.android.datatransport.cct.a)object2).d() != null) {
                        object = ((com.google.android.datatransport.cct.a)object2).d();
                    }
                    object4 = uRL;
                    object3 = object;
                    if (((com.google.android.datatransport.cct.a)object2).e() != null) {
                        object4 = com.google.android.datatransport.cct.d.n(((com.google.android.datatransport.cct.a)object2).e());
                        object3 = object;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    return ax.q5.g.a();
                }
            }
            try {
                object = new a((URL)object4, n9, (String)object3);
                object4 = new com.google.android.datatransport.cct.b(this);
                object3 = new c();
                object = (b)ax.u5.b.a(5, object, object4, object3);
                n8 = ((b)object).a;
                if (n8 == 200) {
                    return ax.q5.g.e(((b)object).c);
                }
            }
            catch (IOException iOException2) {
                break block9;
            }
            if (n8 >= 500) return ax.q5.g.f();
            if (n8 != 404) {
                if (n8 != 400) return ax.q5.g.a();
                return ax.q5.g.d();
            }
            return ax.q5.g.f();
        }
        ax.t5.a.d("CctTransportBackend", "Could not make request to the backend", iOException2);
        return ax.q5.g.f();
    }

    static final class a {
        final URL a;
        final n b;
        final String c;

        a(URL uRL, n n8, String string) {
            this.a = uRL;
            this.b = n8;
            this.c = string;
        }

        a a(URL uRL) {
            return new a(uRL, this.b, this.c);
        }
    }

    static final class b {
        final int a;
        final URL b;
        final long c;

        b(int n8, URL uRL, long l8) {
            this.a = n8;
            this.b = uRL;
            this.c = l8;
        }
    }
}

