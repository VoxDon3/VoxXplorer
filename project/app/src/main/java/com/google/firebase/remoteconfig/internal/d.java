/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import ax.i8.k;
import ax.j6.j;
import ax.j6.m;
import ax.j8.f;
import ax.j8.g;
import ax.j8.h;
import ax.j8.i;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.e;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class d {
    public static final long j = TimeUnit.HOURS.toSeconds(12L);
    static final int[] k = new int[]{2, 4, 8, 16, 32, 64, 128, 256};
    private final ax.b8.e a;
    private final ax.a8.b<ax.A7.a> b;
    private final Executor c;
    private final ax.R5.e d;
    private final Random e;
    private final com.google.firebase.remoteconfig.internal.b f;
    private final ConfigFetchHttpClient g;
    private final e h;
    private final Map<String, String> i;

    public d(ax.b8.e e8, ax.a8.b<ax.A7.a> b8, Executor executor, ax.R5.e e9, Random random, com.google.firebase.remoteconfig.internal.b b9, ConfigFetchHttpClient configFetchHttpClient, e e10, Map<String, String> map) {
        this.a = e8;
        this.b = b8;
        this.c = executor;
        this.d = e9;
        this.e = random;
        this.f = b9;
        this.g = configFetchHttpClient;
        this.h = e10;
        this.i = map;
    }

    public static /* synthetic */ j a(d d8, j j8, j j9, Date date, Map map, j j10) {
        d8.getClass();
        if (!j8.m()) {
            return m.d(new ax.i8.h("Firebase Installations failed to get installation ID for fetch.", j8.i()));
        }
        if (!j9.m()) {
            return m.d(new ax.i8.h("Firebase Installations failed to get installation auth token for fetch.", j9.i()));
        }
        return d8.l((String)j8.j(), ((com.google.firebase.installations.g)j9.j()).b(), date, map);
    }

    public static /* synthetic */ j b(a a8, c c8) {
        return m.e(a8);
    }

    public static /* synthetic */ j c(d d8, Date date, j j8) {
        d8.x(j8, date);
        return j8;
    }

    public static /* synthetic */ j d(d d8, Map map, j j8) {
        return d8.m(j8, 0L, map);
    }

    public static /* synthetic */ j e(d d8, long l8, Map map, j j8) {
        return d8.m(j8, l8, map);
    }

    private boolean f(long l8, Date date) {
        Date date2 = this.h.d();
        if (date2.equals(com.google.firebase.remoteconfig.internal.e.e)) {
            return false;
        }
        return date.before(new Date(date2.getTime() + TimeUnit.SECONDS.toMillis(l8)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private k g(k k8) throws ax.i8.h {
        String string;
        int n8 = k8.a();
        if (n8 != 401) {
            if (n8 != 403) {
                if (n8 == 429) throw new ax.i8.h("The throttled response from the server was not handled correctly by the FRC SDK.");
                if (n8 != 500) {
                    switch (n8) {
                        default: {
                            string = "The server returned an unexpected error.";
                            break;
                        }
                        case 502: 
                        case 503: 
                        case 504: {
                            string = "The server is unavailable. Please try again later.";
                            break;
                        }
                    }
                } else {
                    string = "There was an internal server error.";
                }
            } else {
                string = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            }
        } else {
            string = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        n8 = k8.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fetch failed: ");
        stringBuilder.append(string);
        return new k(n8, stringBuilder.toString(), k8);
    }

    private String h(long l8) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime((long)TimeUnit.MILLISECONDS.toSeconds(l8)));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private a k(String object, String object2, Date date, Map<String, String> map) throws ax.i8.i {
        k var1_3;
        block6: {
            block7: {
                Long l8;
                String string;
                Map<String, String> map2;
                ConfigFetchHttpClient configFetchHttpClient;
                HttpURLConnection httpURLConnection;
                try {
                    httpURLConnection = this.g.d();
                    configFetchHttpClient = this.g;
                    map2 = this.s();
                    string = this.h.c();
                    l8 = this.p();
                }
                catch (k k8) {
                    break block6;
                }
                try {
                    object = configFetchHttpClient.fetch(httpURLConnection, (String)object, (String)object2, map2, string, map, l8, date);
                    if (((a)object).d() == null) break block7;
                    this.h.l(((a)object).d().k());
                }
                catch (k k9) {
                    break block6;
                }
            }
            if (((a)object).e() != null) {
                this.h.k(((a)object).e());
            }
            this.h.h();
            return object;
        }
        object2 = this.v(var1_3.a(), date);
        if (this.u((e.a)object2, var1_3.a())) {
            throw new ax.i8.j(((e.a)object2).a().getTime());
        }
        throw this.g((k)var1_3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private j<a> l(String j8, String object, Date object2, Map<String, String> object3) {
        try {
            j8 = this.k((String)((Object)j8), (String)object, (Date)object2, (Map<String, String>)object3);
            if (((a)((Object)j8)).f() != 0) {
                return m.e(j8);
            }
        }
        catch (ax.i8.i i8) {
            return m.d(i8);
        }
        object = this.f.i(((a)((Object)j8)).d());
        object3 = this.c;
        object2 = new i((a)((Object)j8));
        return ((j)object).o((Executor)object3, object2);
    }

    private j<a> m(j<c> object, long l8, Map<String, String> map) {
        Date date = new Date(this.d.a());
        if (((j)object).m() && this.f(l8, date)) {
            return m.e(com.google.firebase.remoteconfig.internal.d$a.c(date));
        }
        object = this.o(date);
        if (object != null) {
            object = m.d(new ax.i8.j(this.h(((Date)object).getTime() - date.getTime()), ((Date)object).getTime()));
        } else {
            object = this.a.a();
            j<com.google.firebase.installations.g> j8 = this.a.b(false);
            object = m.j(new j[]{object, j8}).h(this.c, new f(this, (j)object, j8, date, map));
        }
        return ((j)object).h(this.c, new g(this, date));
    }

    private Date o(Date date) {
        Date date2 = this.h.a().a();
        if (date.before(date2)) {
            return date2;
        }
        return null;
    }

    private Long p() {
        ax.A7.a a8 = this.b.get();
        if (a8 == null) {
            return null;
        }
        return (Long)a8.a(true).get("_fot");
    }

    private long q(int n8) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] nArray = k;
        long l8 = timeUnit.toMillis(nArray[Math.min(n8, nArray.length) - 1]);
        return l8 / 2L + (long)this.e.nextInt((int)l8);
    }

    private Map<String, String> s() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        ax.A7.a a8 = this.b.get();
        if (a8 != null) {
            for (Map.Entry entry : a8.a(false).entrySet()) {
                hashMap.put((String)entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    private boolean t(int n8) {
        return n8 == 429 || n8 == 502 || n8 == 503 || n8 == 504;
        {
        }
    }

    private boolean u(e.a a8, int n8) {
        return a8.b() > 1 || n8 == 429;
        {
        }
    }

    private e.a v(int n8, Date date) {
        if (this.t(n8)) {
            this.w(date);
        }
        return this.h.a();
    }

    private void w(Date date) {
        int n8 = this.h.a().b() + 1;
        long l8 = this.q(n8);
        date = new Date(date.getTime() + l8);
        this.h.j(n8, date);
    }

    private void x(j<a> object, Date date) {
        if (((j)object).m()) {
            this.h.o(date);
            return;
        }
        if ((object = ((j)object).i()) == null) {
            return;
        }
        if (object instanceof ax.i8.j) {
            this.h.p();
            return;
        }
        this.h.n();
    }

    public j<a> i() {
        return this.j(this.h.f());
    }

    public j<a> j(long l8) {
        HashMap<String, String> hashMap = new HashMap<String, String>(this.i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.google.firebase.remoteconfig.internal.d$b.c0.h());
        stringBuilder.append("/");
        stringBuilder.append(1);
        hashMap.put("X-Firebase-RC-Fetch-Type", stringBuilder.toString());
        return this.f.e().h(this.c, new ax.j8.e(this, l8, hashMap));
    }

    public j<a> n(b b8, int n8) {
        HashMap<String, String> hashMap = new HashMap<String, String>(this.i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b8.h());
        stringBuilder.append("/");
        stringBuilder.append(n8);
        hashMap.put("X-Firebase-RC-Fetch-Type", stringBuilder.toString());
        return this.f.e().h(this.c, new h(this, hashMap));
    }

    public long r() {
        return this.h.e();
    }

    public static class a {
        private final Date a;
        private final int b;
        private final c c;
        private final String d;

        private a(Date date, int n8, c c8, String string) {
            this.a = date;
            this.b = n8;
            this.c = c8;
            this.d = string;
        }

        public static a a(Date date, c c8) {
            return new a(date, 1, c8, null);
        }

        public static a b(c c8, String string) {
            return new a(c8.h(), 0, c8, string);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public c d() {
            return this.c;
        }

        String e() {
            return this.d;
        }

        int f() {
            return this.b;
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0 = new b("BASE");
        public static final /* enum */ b d0 = new b("REALTIME");
        private static final b[] e0 = com.google.firebase.remoteconfig.internal.d$b.d();
        private final String q;

        private b(String string2) {
            this.q = string2;
        }

        private static /* synthetic */ b[] d() {
            return new b[]{c0, d0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])e0.clone();
        }

        String h() {
            return this.q;
        }
    }
}

