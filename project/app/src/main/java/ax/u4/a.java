/*
 * Decompiled with CFR 0.152.
 */
package ax.u4;

import ax.T4.g;
import ax.T4.h;
import ax.p4.j;
import ax.p4.k;
import ax.p4.m;
import ax.p4.n;
import ax.s4.a;
import ax.u4.b;
import ax.u4.c;
import ax.u4.d;
import ax.w4.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class a {
    public static final ax.t4.b<a> f = new ax.t4.b<a>(){

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final a m(ax.T4.j j8) throws IOException, ax.t4.a {
            Object object;
            Object object2;
            h h8 = ax.t4.b.b(j8);
            String string = null;
            Long l8 = null;
            Object object3 = object2 = (object = l8);
            while (true) {
                if (j8.j() != ax.T4.m.p0) {
                    ax.t4.b.a(j8);
                    if (string == null) throw new ax.t4.a("missing field \"access_token\"", h8);
                    return new a(string, l8, (String)object, (String)object2, (String)object3);
                }
                String string2 = j8.g();
                j8.H();
                try {
                    if (string2.equals("access_token")) {
                        string = ax.t4.b.h.f(j8, string2, string);
                        continue;
                    }
                }
                catch (ax.t4.a a8) {
                    throw a8.a(string2);
                }
                if (string2.equals("expires_at")) {
                    l8 = ax.t4.b.b.f(j8, string2, l8);
                    continue;
                }
                if (string2.equals("refresh_token")) {
                    object = ax.t4.b.h.f(j8, string2, object);
                    continue;
                }
                if (string2.equals("app_key")) {
                    object2 = ax.t4.b.h.f(j8, string2, object2);
                    continue;
                }
                if (string2.equals("app_secret")) {
                    object3 = ax.t4.b.h.f(j8, string2, object3);
                    continue;
                }
                ax.t4.b.k(j8);
            }
        }
    };
    public static final ax.t4.c<a> g = new ax.t4.c<a>(){

        public void d(a a8, g g8) throws IOException {
            g8.o0();
            g8.u0("access_token", a8.a);
            if (a8.b != null) {
                g8.v("expires_at", a8.b);
            }
            if (a8.c != null) {
                g8.u0("refresh_token", a8.c);
            }
            if (a8.d != null) {
                g8.u0("app_key", a8.d);
            }
            if (a8.e != null) {
                g8.u0("app_secret", a8.e);
            }
            g8.m();
        }
    };
    private String a;
    private Long b;
    private final String c;
    private final String d;
    private final String e;

    public a(String string) {
        this(string, null, null, null, null);
    }

    public a(String string, Long l8, String string2, String string3) {
        this(string, l8, string2, string3, null);
    }

    public a(String string, Long l8, String string2, String string3, String string4) {
        if (string != null) {
            if (string2 != null && string3 == null) {
                throw new IllegalArgumentException("Can't refresh without app Key.");
            }
            if (string2 != null && l8 == null) {
                throw new IllegalArgumentException("Missing expireAt.");
            }
            this.a = string;
            this.b = l8;
            this.c = string2;
            this.d = string3;
            this.e = string4;
            return;
        }
        throw new IllegalArgumentException("Missing access token.");
    }

    public boolean a() {
        if (this.h() == null) {
            return false;
        }
        return System.currentTimeMillis() + 300000L > this.h();
    }

    public String g() {
        return this.a;
    }

    public Long h() {
        return this.b;
    }

    public String i() {
        return this.c;
    }

    public d j(m m8) throws j {
        return this.k(m8, k.e, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public d k(m object, k k8, Collection<String> collection) throws j {
        if (this.c == null) {
            throw new c(null, new b("invalid_request", "Cannot refresh becasue there is no refresh token"));
        }
        if (this.d == null) {
            throw new IllegalStateException("DbxCredential's constructor should always guarantee appKey is not null if refreshToken is not null.");
        }
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("grant_type", "refresh_token");
        hashMap.put("refresh_token", this.c);
        hashMap.put("locale", ((m)object).d());
        ArrayList<a.a> arrayList = new ArrayList<a.a>();
        String string = this.e;
        if (string == null) {
            hashMap.put("client_id", this.d);
        } else {
            n.b(arrayList, this.d, string);
        }
        if (collection != null) {
            hashMap.put("scope", ax.w4.f.e(collection, " "));
        }
        object = n.j((m)object, "OfficialDropboxJavaSDKv2", k8.h(), "oauth2/token", n.z(hashMap), arrayList, new n.c<d>(this){
            final a a;
            {
                this.a = a8;
            }

            public d b(a.b b8) throws j {
                if (b8.d() == 200) {
                    return n.u(ax.u4.d.e, b8);
                }
                throw new c(n.q(b8), n.u(ax.u4.b.d, b8));
            }
        });
        synchronized (this) {
            this.a = ((d)object).a();
            this.b = ((d)object).b();
            return object;
        }
    }

    public String toString() {
        return g.b(this);
    }
}

