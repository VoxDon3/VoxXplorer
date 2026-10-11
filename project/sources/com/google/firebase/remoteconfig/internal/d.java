package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import ax.i8.i;
import ax.i8.j;
import ax.i8.k;
import ax.j6.AbstractC2327j;
import ax.j6.InterfaceC2319b;
import ax.j6.InterfaceC2326i;
import ax.j6.m;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class d {
    public static final long j = TimeUnit.HOURS.toSeconds(12);
    static final int[] k = {2, 4, 8, 16, 32, 64, 128, 256};
    private final ax.b8.e a;
    private final ax.a8.b<ax.A7.a> b;
    private final Executor c;
    private final ax.R5.e d;
    private final Random e;
    private final com.google.firebase.remoteconfig.internal.b f;
    private final ConfigFetchHttpClient g;
    private final e h;
    private final Map<String, String> i;

    public static class a {
        private final Date a;
        private final int b;
        private final c c;
        private final String d;

        private a(Date date, int i, c cVar, String str) {
            this.a = date;
            this.b = i;
            this.c = cVar;
            this.d = str;
        }

        public static a a(Date date, c cVar) {
            return new a(date, 1, cVar, null);
        }

        public static a b(c cVar, String str) {
            return new a(cVar.h(), 0, cVar, str);
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

    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String q;

        b(String str) {
            this.q = str;
        }

        String h() {
            return this.q;
        }
    }

    public d(ax.b8.e eVar, ax.a8.b<ax.A7.a> bVar, Executor executor, ax.R5.e eVar2, Random random, com.google.firebase.remoteconfig.internal.b bVar2, ConfigFetchHttpClient configFetchHttpClient, e eVar3, Map<String, String> map) {
        this.a = eVar;
        this.b = bVar;
        this.c = executor;
        this.d = eVar2;
        this.e = random;
        this.f = bVar2;
        this.g = configFetchHttpClient;
        this.h = eVar3;
        this.i = map;
    }

    public static /* synthetic */ AbstractC2327j a(d dVar, AbstractC2327j abstractC2327j, AbstractC2327j abstractC2327j2, Date date, Map map, AbstractC2327j abstractC2327j3) {
        dVar.getClass();
        return !abstractC2327j.m() ? m.d(new ax.i8.h("Firebase Installations failed to get installation ID for fetch.", abstractC2327j.i())) : !abstractC2327j2.m() ? m.d(new ax.i8.h("Firebase Installations failed to get installation auth token for fetch.", abstractC2327j2.i())) : dVar.l((String) abstractC2327j.j(), ((com.google.firebase.installations.g) abstractC2327j2.j()).b(), date, map);
    }

    public static /* synthetic */ AbstractC2327j c(d dVar, Date date, AbstractC2327j abstractC2327j) {
        dVar.x(abstractC2327j, date);
        return abstractC2327j;
    }

    private boolean f(long j2, Date date) {
        Date d = this.h.d();
        if (d.equals(e.e)) {
            return false;
        }
        return date.before(new Date(d.getTime() + TimeUnit.SECONDS.toMillis(j2)));
    }

    private k g(k kVar) throws ax.i8.h {
        String str;
        int a2 = kVar.a();
        if (a2 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a2 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (a2 == 429) {
                throw new ax.i8.h("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (a2 != 500) {
                switch (a2) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new k(kVar.a(), "Fetch failed: " + str, kVar);
    }

    private String h(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2)));
    }

    private a k(String str, String str2, Date date, Map<String, String> map) throws i {
        Date date2;
        try {
            date2 = date;
        } catch (k e) {
            e = e;
            date2 = date;
        }
        try {
            a fetch = this.g.fetch(this.g.d(), str, str2, s(), this.h.c(), map, p(), date2);
            if (fetch.d() != null) {
                this.h.l(fetch.d().k());
            }
            if (fetch.e() != null) {
                this.h.k(fetch.e());
            }
            this.h.h();
            return fetch;
        } catch (k e2) {
            e = e2;
            k kVar = e;
            e.a v = v(kVar.a(), date2);
            if (u(v, kVar.a())) {
                throw new j(v.a().getTime());
            }
            throw g(kVar);
        }
    }

    private AbstractC2327j<a> l(String str, String str2, Date date, Map<String, String> map) {
        try {
            final a k2 = k(str, str2, date, map);
            return k2.f() != 0 ? m.e(k2) : this.f.i(k2.d()).o(this.c, new InterfaceC2326i() { // from class: ax.j8.i
                @Override // ax.j6.InterfaceC2326i
                public final AbstractC2327j a(Object obj) {
                    AbstractC2327j e;
                    e = ax.j6.m.e(d.a.this);
                    return e;
                }
            });
        } catch (i e) {
            return m.d(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC2327j<a> m(AbstractC2327j<c> abstractC2327j, long j2, final Map<String, String> map) {
        final d dVar;
        AbstractC2327j h;
        final Date date = new Date(this.d.a());
        if (abstractC2327j.m() && f(j2, date)) {
            return m.e(a.c(date));
        }
        Date o = o(date);
        if (o != null) {
            h = m.d(new j(h(o.getTime() - date.getTime()), o.getTime()));
            dVar = this;
        } else {
            final AbstractC2327j<String> a2 = this.a.a();
            final AbstractC2327j<com.google.firebase.installations.g> b2 = this.a.b(false);
            dVar = this;
            h = m.j(a2, b2).h(this.c, new InterfaceC2319b() { // from class: ax.j8.f
                @Override // ax.j6.InterfaceC2319b
                public final Object a(AbstractC2327j abstractC2327j2) {
                    return com.google.firebase.remoteconfig.internal.d.a(com.google.firebase.remoteconfig.internal.d.this, a2, b2, date, map, abstractC2327j2);
                }
            });
        }
        return h.h(dVar.c, new InterfaceC2319b() { // from class: ax.j8.g
            @Override // ax.j6.InterfaceC2319b
            public final Object a(AbstractC2327j abstractC2327j2) {
                return com.google.firebase.remoteconfig.internal.d.c(com.google.firebase.remoteconfig.internal.d.this, date, abstractC2327j2);
            }
        });
    }

    private Date o(Date date) {
        Date a2 = this.h.a().a();
        if (date.before(a2)) {
            return a2;
        }
        return null;
    }

    private Long p() {
        ax.A7.a aVar = this.b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.a(true).get("_fot");
    }

    private long q(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = k;
        return (timeUnit.toMillis(iArr[Math.min(i, iArr.length) - 1]) / 2) + this.e.nextInt((int) r0);
    }

    private Map<String, String> s() {
        HashMap hashMap = new HashMap();
        ax.A7.a aVar = this.b.get();
        if (aVar != null) {
            for (Map.Entry<String, Object> entry : aVar.a(false).entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    private boolean t(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    private boolean u(e.a aVar, int i) {
        return aVar.b() > 1 || i == 429;
    }

    private e.a v(int i, Date date) {
        if (t(i)) {
            w(date);
        }
        return this.h.a();
    }

    private void w(Date date) {
        int b2 = this.h.a().b() + 1;
        this.h.j(b2, new Date(date.getTime() + q(b2)));
    }

    private void x(AbstractC2327j<a> abstractC2327j, Date date) {
        if (abstractC2327j.m()) {
            this.h.o(date);
            return;
        }
        Exception i = abstractC2327j.i();
        if (i == null) {
            return;
        }
        if (i instanceof j) {
            this.h.p();
        } else {
            this.h.n();
        }
    }

    public AbstractC2327j<a> i() {
        return j(this.h.f());
    }

    public AbstractC2327j<a> j(final long j2) {
        final HashMap hashMap = new HashMap(this.i);
        hashMap.put("X-Firebase-RC-Fetch-Type", b.BASE.h() + "/1");
        return this.f.e().h(this.c, new InterfaceC2319b() { // from class: ax.j8.e
            @Override // ax.j6.InterfaceC2319b
            public final Object a(AbstractC2327j abstractC2327j) {
                AbstractC2327j m;
                m = com.google.firebase.remoteconfig.internal.d.this.m(abstractC2327j, j2, hashMap);
                return m;
            }
        });
    }

    public AbstractC2327j<a> n(b bVar, int i) {
        final HashMap hashMap = new HashMap(this.i);
        hashMap.put("X-Firebase-RC-Fetch-Type", bVar.h() + "/" + i);
        return this.f.e().h(this.c, new InterfaceC2319b() { // from class: ax.j8.h
            @Override // ax.j6.InterfaceC2319b
            public final Object a(AbstractC2327j abstractC2327j) {
                AbstractC2327j m;
                m = com.google.firebase.remoteconfig.internal.d.this.m(abstractC2327j, 0L, hashMap);
                return m;
            }
        });
    }

    public long r() {
        return this.h.e();
    }
}
