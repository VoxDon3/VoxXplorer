package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import ax.R5.j;
import ax.i8.AbstractC2284b;
import ax.i8.InterfaceC2285c;
import ax.i8.i;
import ax.j6.AbstractC2327j;
import ax.j6.InterfaceC2319b;
import ax.j6.m;
import ax.x7.C3471f;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class g {
    static final int[] q = {2, 4, 8, 16, 32, 64, 128, 256};
    private static final Pattern r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private final Set<InterfaceC2285c> a;
    private int c;
    private final ScheduledExecutorService g;
    private final d h;
    private final C3471f i;
    private final ax.b8.e j;
    com.google.firebase.remoteconfig.internal.b k;
    private final Context l;
    private final String m;
    private final e p;
    private final int f = 8;
    private boolean b = false;
    private final Random n = new Random();
    private final ax.R5.e o = ax.R5.h.c();
    private boolean d = false;
    private boolean e = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.e();
        }
    }

    public g(C3471f c3471f, ax.b8.e eVar, d dVar, com.google.firebase.remoteconfig.internal.b bVar, Context context, String str, Set<InterfaceC2285c> set, e eVar2, ScheduledExecutorService scheduledExecutorService) {
        this.a = set;
        this.g = scheduledExecutorService;
        this.c = Math.max(8 - eVar2.g().b(), 1);
        this.i = c3471f;
        this.h = dVar;
        this.j = eVar;
        this.k = bVar;
        this.l = context;
        this.m = str;
        this.p = eVar2;
    }

    private void B(Date date) {
        int b2 = this.p.g().b() + 1;
        this.p.m(b2, new Date(date.getTime() + m(b2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ ax.j6.AbstractC2327j a(com.google.firebase.remoteconfig.internal.g r11, ax.j6.AbstractC2327j r12, ax.j6.AbstractC2327j r13) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.g.a(com.google.firebase.remoteconfig.internal.g, ax.j6.j, ax.j6.j):ax.j6.j");
    }

    public static /* synthetic */ AbstractC2327j b(g gVar, AbstractC2327j abstractC2327j, AbstractC2327j abstractC2327j2, AbstractC2327j abstractC2327j3) {
        gVar.getClass();
        if (!abstractC2327j.m()) {
            return m.d(new ax.i8.h("Firebase Installations failed to get installation auth token for config update listener connection.", abstractC2327j.i()));
        }
        if (!abstractC2327j2.m()) {
            return m.d(new ax.i8.h("Firebase Installations failed to get installation ID for config update listener connection.", abstractC2327j2.i()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) gVar.o().openConnection();
            gVar.y(httpURLConnection, (String) abstractC2327j2.j(), ((com.google.firebase.installations.g) abstractC2327j.j()).b());
            return m.e(httpURLConnection);
        } catch (IOException e) {
            return m.d(new ax.i8.h("Failed to open HTTP stream connection", e));
        }
    }

    private synchronized boolean f() {
        boolean z;
        if (!this.a.isEmpty() && !this.b && !this.d) {
            z = this.e ? false : true;
        }
        return z;
    }

    private JSONObject i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("project", k(this.i.n().c()));
        hashMap.put("namespace", this.m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.h.r()));
        hashMap.put("appId", this.i.n().c());
        hashMap.put("sdkVersion", "22.0.0");
        hashMap.put("appInstanceId", str);
        return new JSONObject(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        this.d = true;
    }

    private static String k(String str) {
        Matcher matcher = r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String l() {
        try {
            Context context = this.l;
            byte[] a2 = ax.R5.a.a(context, context.getPackageName());
            if (a2 != null) {
                return j.b(a2, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.l.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.l.getPackageName());
            return null;
        }
    }

    private long m(int i) {
        int length = q.length;
        if (i >= length) {
            i = length;
        }
        return (TimeUnit.MINUTES.toMillis(r0[i - 1]) / 2) + this.n.nextInt((int) r0);
    }

    private String n(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", k(this.i.n().c()), str);
    }

    private URL o() {
        try {
            return new URL(n(this.m));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    private boolean p(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    private synchronized void q(long j) {
        try {
            if (f()) {
                int i = this.c;
                if (i > 0) {
                    this.c = i - 1;
                    this.g.schedule(new a(), j, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    s(new ax.i8.h("Unable to connect to the server. Check your connection and try again.", i.a.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private String r(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void s(i iVar) {
        Iterator<InterfaceC2285c> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(iVar);
        }
    }

    private synchronized void t() {
        this.c = 8;
    }

    private void v(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.i.n().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", l());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private synchronized void w(boolean z) {
        this.b = z;
    }

    public void A() {
        q(0L);
    }

    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void e() {
        if (f()) {
            if (new Date(this.o.a()).before(this.p.g().a())) {
                u();
            } else {
                final AbstractC2327j<HttpURLConnection> h = h();
                m.j(h).g(this.g, new InterfaceC2319b() { // from class: ax.j8.l
                    @Override // ax.j6.InterfaceC2319b
                    public final Object a(AbstractC2327j abstractC2327j) {
                        return com.google.firebase.remoteconfig.internal.g.a(com.google.firebase.remoteconfig.internal.g.this, h, abstractC2327j);
                    }
                });
            }
        }
    }

    public void g(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public AbstractC2327j<HttpURLConnection> h() {
        final AbstractC2327j<com.google.firebase.installations.g> b2 = this.j.b(false);
        final AbstractC2327j<String> a2 = this.j.a();
        return m.j(b2, a2).h(this.g, new InterfaceC2319b() { // from class: ax.j8.m
            @Override // ax.j6.InterfaceC2319b
            public final Object a(AbstractC2327j abstractC2327j) {
                return com.google.firebase.remoteconfig.internal.g.b(com.google.firebase.remoteconfig.internal.g.this, b2, a2, abstractC2327j);
            }
        });
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void u() {
        q(Math.max(0L, this.p.g().a().getTime() - new Date(this.o.a()).getTime()));
    }

    void x(boolean z) {
        this.e = z;
    }

    @SuppressLint({"VisibleForTests"})
    public void y(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        v(httpURLConnection, str2);
        byte[] bytes = i(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized com.google.firebase.remoteconfig.internal.a z(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.a(httpURLConnection, this.h, this.k, this.a, new b(), this.g);
    }

    class b implements InterfaceC2285c {
        b() {
        }

        @Override // ax.i8.InterfaceC2285c
        public void a(i iVar) {
            g.this.j();
            g.this.s(iVar);
        }

        @Override // ax.i8.InterfaceC2285c
        public void b(AbstractC2284b abstractC2284b) {
        }
    }
}
