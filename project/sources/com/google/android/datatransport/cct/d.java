package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import ax.n5.C2580b;
import ax.o5.AbstractC2723a;
import ax.o5.n;
import ax.o5.o;
import ax.o5.p;
import ax.o5.q;
import ax.o5.r;
import ax.o5.s;
import ax.o5.t;
import ax.o5.u;
import ax.o5.v;
import ax.o5.w;
import ax.o5.x;
import ax.p5.h;
import ax.p5.i;
import ax.q5.f;
import ax.q5.g;
import ax.q5.m;
import ax.t5.C3102a;
import ax.u5.C3210b;
import ax.u5.InterfaceC3209a;
import ax.u5.InterfaceC3211c;
import ax.z5.InterfaceC3550a;
import com.google.android.datatransport.cct.d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
final class d implements m {
    private final ax.U7.a a;
    private final ConnectivityManager b;
    private final Context c;
    final URL d;
    private final InterfaceC3550a e;
    private final InterfaceC3550a f;
    private final int g;

    static final class a {
        final URL a;
        final n b;
        final String c;

        a(URL url, n nVar, String str) {
            this.a = url;
            this.b = nVar;
            this.c = str;
        }

        a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    static final class b {
        final int a;
        final URL b;
        final long c;

        b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    d(Context context, InterfaceC3550a interfaceC3550a, InterfaceC3550a interfaceC3550a2, int i) {
        this.a = n.b();
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = n(com.google.android.datatransport.cct.a.c);
        this.e = interfaceC3550a2;
        this.f = interfaceC3550a;
        this.g = i;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.b;
        if (url == null) {
            return null;
        }
        C3102a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        C3102a.f("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.a.a(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    C3102a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    C3102a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    C3102a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(m))).c());
                            if (m != null) {
                                m.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ax.U7.b e) {
            e = e;
            C3102a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            C3102a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            C3102a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            C3102a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.UNKNOWN_MOBILE_SUBTYPE.h();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return w.b.COMBINED.h();
        }
        if (w.b.d(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? w.c.NONE.h() : networkInfo.getType();
    }

    private static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C3102a.d("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    private n j(f fVar) {
        t.a l;
        HashMap hashMap = new HashMap();
        for (i iVar : fVar.b()) {
            String n = iVar.n();
            if (hashMap.containsKey(n)) {
                ((List) hashMap.get(n)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(n, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            u.a b2 = u.a().f(x.DEFAULT).g(this.f.a()).h(this.e.a()).b(o.a().c(o.b.ANDROID_FIREBASE).b(AbstractC2723a.a().m(Integer.valueOf(iVar2.i("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b2.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e = iVar3.e();
                C2580b b3 = e.b();
                if (b3.equals(C2580b.b("proto"))) {
                    l = t.l(e.a());
                } else if (b3.equals(C2580b.b("json"))) {
                    l = t.k(new String(e.a(), Charset.forName("UTF-8")));
                } else {
                    C3102a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b3);
                }
                l.d(iVar3.f()).e(iVar3.o()).j(iVar3.j("tz-offset")).g(w.a().c(w.c.d(iVar3.i("net-type"))).b(w.b.d(iVar3.i("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    l.c(iVar3.d());
                }
                if (iVar3.l() != null) {
                    l.b(p.a().b(s.a().b(r.a().b(iVar3.l()).a()).a()).c(p.b.EVENT_OVERRIDE).a());
                }
                if (iVar3.g() != null || iVar3.h() != null) {
                    q.a a2 = q.a();
                    if (iVar3.g() != null) {
                        a2.b(iVar3.g());
                    }
                    if (iVar3.h() != null) {
                        a2.c(iVar3.h());
                    }
                    l.f(a2.a());
                }
                arrayList3.add(l.a());
            }
            b2.c(arrayList3);
            arrayList2.add(b2.a());
        }
        return n.a(arrayList2);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    private static InputStream m(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // ax.q5.m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return iVar.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.c)).c("application_build", Integer.toString(i(this.c))).d();
    }

    @Override // ax.q5.m
    public g b(f fVar) {
        n j = j(fVar);
        URL url = this.d;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a c = com.google.android.datatransport.cct.a.c(fVar.c());
                r3 = c.d() != null ? c.d() : null;
                if (c.e() != null) {
                    url = n(c.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) C3210b.a(5, new a(url, j, r3), new InterfaceC3209a() { // from class: com.google.android.datatransport.cct.b
                @Override // ax.u5.InterfaceC3209a
                public final Object apply(Object obj) {
                    d.b e;
                    e = d.this.e((d.a) obj);
                    return e;
                }
            }, new InterfaceC3211c() { // from class: com.google.android.datatransport.cct.c
                @Override // ax.u5.InterfaceC3211c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i = bVar.a;
            if (i == 200) {
                return g.e(bVar.c);
            }
            if (i < 500 && i != 404) {
                return i == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e) {
            C3102a.d("CctTransportBackend", "Could not make request to the backend", e);
            return g.f();
        }
    }

    d(Context context, InterfaceC3550a interfaceC3550a, InterfaceC3550a interfaceC3550a2) {
        this(context, interfaceC3550a, interfaceC3550a2, 130000);
    }
}
