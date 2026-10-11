/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import ax.i8.c;
import ax.i8.h;
import ax.i8.i;
import ax.i8.k;
import ax.j6.j;
import ax.j8.l;
import ax.j8.m;
import ax.x7.f;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
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

public class g {
    static final int[] q = new int[]{2, 4, 8, 16, 32, 64, 128, 256};
    private static final Pattern r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private final Set<c> a;
    private boolean b;
    private int c;
    private boolean d;
    private boolean e;
    private final int f;
    private final ScheduledExecutorService g;
    private final d h;
    private final f i;
    private final ax.b8.e j;
    b k;
    private final Context l;
    private final String m;
    private final Random n;
    private final ax.R5.e o;
    private final e p;

    public g(f f8, ax.b8.e e8, d d8, b b8, Context context, String string, Set<c> set, e e9, ScheduledExecutorService scheduledExecutorService) {
        this.f = 8;
        this.a = set;
        this.b = false;
        this.g = scheduledExecutorService;
        this.n = new Random();
        this.c = Math.max(8 - e9.g().b(), 1);
        this.o = ax.R5.h.c();
        this.i = f8;
        this.h = d8;
        this.j = e8;
        this.k = b8;
        this.l = context;
        this.m = string;
        this.p = e9;
        this.d = false;
        this.e = false;
    }

    private void B(Date date) {
        int n8 = this.p.g().b() + 1;
        long l8 = this.m(n8);
        date = new Date(date.getTime() + l8);
        this.p.m(n8, date);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ j a(g g8, j object, j object2) {
        RuntimeException var1_5;
        Object object3;
        Object object4;
        int n8;
        block21: {
            block25: {
                block23: {
                    block24: {
                        block22: {
                            block19: {
                                block20: {
                                    g8.getClass();
                                    if (!((j)object).m()) break block19;
                                    g8.w(true);
                                    object2 = (HttpURLConnection)((j)object).j();
                                    n8 = ((HttpURLConnection)object2).getResponseCode();
                                    object = n8;
                                    if (n8 != 200) break block20;
                                    object4 = object;
                                    object3 = object2;
                                    g8.t();
                                    object4 = object;
                                    object3 = object2;
                                    g8.p.i();
                                    object4 = object;
                                    object3 = object2;
                                    g8.z((HttpURLConnection)object2).h();
                                }
                                g8.g((HttpURLConnection)object2);
                                g8.w(false);
                                boolean bl = g8.p(n8);
                                if (bl) {
                                    g8.B(new Date(g8.o.a()));
                                }
                                if (bl || n8 == 200) break block24;
                                object = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", object);
                                if (n8 == 403) {
                                    object = g8.r(((HttpURLConnection)object2).getErrorStream());
                                }
                                object = new k(n8, (String)object, i.a.d0);
                                break block25;
                                catch (Throwable throwable) {
                                    object4 = null;
                                    break block21;
                                }
                                catch (IOException iOException) {
                                    object = null;
                                    break block22;
                                }
                            }
                            try {
                                object2 = new IOException(((j)object).i());
                                throw object2;
                            }
                            catch (Throwable throwable) {}
                            catch (IOException iOException) {}
                            finally {
                                object4 = null;
                                object2 = null;
                                break block21;
                            }
                            catch (Throwable throwable) {
                                object2 = object3;
                                break block21;
                            }
                            catch (IOException iOException) {}
                        }
                        object4 = object;
                        object3 = object2;
                        {
                            Throwable var7_13;
                            Log.d((String)"FirebaseRemoteConfig", (String)"Exception connecting to real-time RC backend. Retrying the connection...", (Throwable)var7_13);
                            g8.g((HttpURLConnection)object2);
                            g8.w(false);
                            n8 = object != null && !g8.p((Integer)object) ? 0 : 1;
                            if (n8 != 0) {
                                g8.B(new Date(g8.o.a()));
                            }
                            if (n8 == 0 && (Integer)object != 200) break block23;
                        }
                    }
                    g8.u();
                    return ax.j6.m.e(null);
                }
                object3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", object);
                if ((Integer)object == 403) {
                    object3 = g8.r(((HttpURLConnection)object2).getErrorStream());
                }
                object = new k(((Integer)object).intValue(), (String)object3, i.a.d0);
            }
            g8.s((i)object);
            return ax.j6.m.e(null);
        }
        g8.g((HttpURLConnection)object2);
        g8.w(false);
        n8 = object4 != null && !g8.p((Integer)object4) ? 0 : 1;
        if (n8 != 0) {
            g8.B(new Date(g8.o.a()));
        }
        if (n8 == 0 && (Integer)object4 != 200) {
            object3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", object4);
            if ((Integer)object4 == 403) {
                object3 = g8.r(((HttpURLConnection)object2).getErrorStream());
            }
            g8.s(new k(((Integer)object4).intValue(), (String)object3, i.a.d0));
            throw var1_5;
        }
        g8.u();
        throw var1_5;
    }

    public static /* synthetic */ j b(g g8, j object, j j8, j object2) {
        g8.getClass();
        if (!((j)object).m()) {
            return ax.j6.m.d(new h("Firebase Installations failed to get installation auth token for config update listener connection.", ((j)object).i()));
        }
        if (!j8.m()) {
            return ax.j6.m.d(new h("Firebase Installations failed to get installation ID for config update listener connection.", j8.i()));
        }
        try {
            object2 = (HttpURLConnection)g8.o().openConnection();
            object = ((com.google.firebase.installations.g)((j)object).j()).b();
            g8.y((HttpURLConnection)object2, (String)j8.j(), (String)object);
        }
        catch (IOException iOException) {
            return ax.j6.m.d(new h("Failed to open HTTP stream connection", iOException));
        }
        return ax.j6.m.e(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean f() {
        synchronized (this) {
            try {
                if (this.a.isEmpty()) return false;
                if (this.b) return false;
                if (this.d) return false;
                boolean bl = this.e;
                if (bl) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private JSONObject i(String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("project", com.google.firebase.remoteconfig.internal.g.k(this.i.n().c()));
        hashMap.put("namespace", this.m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.h.r()));
        hashMap.put("appId", this.i.n().c());
        hashMap.put("sdkVersion", "22.0.0");
        hashMap.put("appInstanceId", string);
        return new JSONObject(hashMap);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j() {
        synchronized (this) {
            this.d = true;
            return;
        }
    }

    private static String k(String object) {
        if (((Matcher)(object = r.matcher((CharSequence)object))).matches()) {
            return ((Matcher)object).group(1);
        }
        return null;
    }

    private String l() {
        Object object;
        block4: {
            try {
                object = this.l;
                object = ax.R5.a.a((Context)object, object.getPackageName());
                if (object != null) break block4;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No such package: ");
                stringBuilder.append(this.l.getPackageName());
                Log.i((String)"FirebaseRemoteConfig", (String)stringBuilder.toString());
                return null;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Could not get fingerprint hash for package: ");
            ((StringBuilder)object).append(this.l.getPackageName());
            Log.e((String)"FirebaseRemoteConfig", (String)((StringBuilder)object).toString());
            return null;
        }
        object = ax.R5.j.b((byte[])object, false);
        return object;
    }

    private long m(int n8) {
        int[] nArray = q;
        int n9 = nArray.length;
        if (n8 >= n9) {
            n8 = n9;
        }
        long l8 = TimeUnit.MINUTES.toMillis(nArray[n8 - 1]);
        return l8 / 2L + (long)this.n.nextInt((int)l8);
    }

    private String n(String string) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", com.google.firebase.remoteconfig.internal.g.k(this.i.n().c()), string);
    }

    private URL o() {
        try {
            URL uRL = new URL(this.n(this.m));
            return uRL;
        }
        catch (MalformedURLException malformedURLException) {
            Log.e((String)"FirebaseRemoteConfig", (String)"URL is malformed");
            return null;
        }
    }

    private boolean p(int n8) {
        return n8 == 408 || n8 == 429 || n8 == 502 || n8 == 503 || n8 == 504;
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void q(long l8) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block7: {
                    try {
                        boolean bl = this.f();
                        if (bl) break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    return;
                }
                int n8 = this.c;
                if (n8 > 0) {
                    this.c = n8 - 1;
                    ScheduledExecutorService scheduledExecutorService = this.g;
                    Runnable runnable2 = new Runnable(this){
                        final g q;
                        {
                            this.q = g8;
                        }

                        @Override
                        public void run() {
                            this.q.e();
                        }
                    };
                    scheduledExecutorService.schedule(runnable2, l8, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    h h8 = new h("Unable to connect to the server. Check your connection and try again.", i.a.d0);
                    this.s(h8);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String r(InputStream object) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader((InputStream)object);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while ((object = bufferedReader.readLine()) != null) {
                stringBuilder.append((String)object);
            }
            return stringBuilder.toString();
        }
        catch (IOException iOException) {
            if (stringBuilder.length() != 0) return stringBuilder.toString();
            return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void s(i i8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Iterator<c> iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().a(i8);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void t() {
        synchronized (this) {
            this.c = 8;
            return;
        }
    }

    private void v(HttpURLConnection httpURLConnection, String string) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", string);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.i.n().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", this.l());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void w(boolean bl) {
        synchronized (this) {
            this.b = bl;
            return;
        }
    }

    public void A() {
        this.q(0L);
    }

    @SuppressLint(value={"VisibleForTests", "DefaultLocale"})
    public void e() {
        if (!this.f()) {
            return;
        }
        Object object = this.p.g();
        if (new Date(this.o.a()).before(((e.b)object).a())) {
            this.u();
            return;
        }
        object = this.h();
        ax.j6.m.j(new j[]{object}).g(this.g, new l(this, (j)object));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) return;
        httpURLConnection.disconnect();
        try {
            httpURLConnection.getInputStream().close();
            if (httpURLConnection.getErrorStream() == null) return;
            httpURLConnection.getErrorStream().close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    @SuppressLint(value={"VisibleForTests"})
    public j<HttpURLConnection> h() {
        j<com.google.firebase.installations.g> j8 = this.j.b(false);
        j<String> j9 = this.j.a();
        return ax.j6.m.j(j8, j9).h(this.g, new m(this, j8, j9));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"VisibleForTests"})
    public void u() {
        synchronized (this) {
            Date date = new Date(this.o.a());
            this.q(Math.max(0L, this.p.g().a().getTime() - date.getTime()));
            return;
        }
    }

    void x(boolean bl) {
        this.e = bl;
    }

    @SuppressLint(value={"VisibleForTests"})
    public void y(HttpURLConnection object, String object2, String string) throws IOException {
        ((HttpURLConnection)object).setRequestMethod("POST");
        this.v((HttpURLConnection)object, string);
        object2 = this.i((String)object2).toString().getBytes("utf-8");
        object = new BufferedOutputStream(((URLConnection)object).getOutputStream());
        ((OutputStream)object).write((byte[])object2);
        ((OutputStream)object).flush();
        ((OutputStream)object).close();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"VisibleForTests"})
    public a z(HttpURLConnection object) {
        synchronized (this) {
            c c8 = new c(this){
                final g a;
                {
                    this.a = g8;
                }

                @Override
                public void a(i i8) {
                    this.a.j();
                    this.a.s(i8);
                }

                @Override
                public void b(ax.i8.b b8) {
                }
            };
            return new a((HttpURLConnection)object, this.h, this.k, this.a, c8, this.g);
        }
    }
}

