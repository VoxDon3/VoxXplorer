/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import ax.U9.b;
import ax.U9.j;
import ax.U9.k;
import ax.U9.m;
import ax.U9.q;
import ax.U9.r;
import ax.U9.s;
import ax.U9.t;
import ax.U9.u;
import ax.U9.v;
import ax.U9.w;
import ax.U9.y;
import ax.U9.z;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

public class e {
    private static final ax.U9.g h = new ax.U9.g(){

        @Override
        public void a(j j8, ax.U9.h h8, Object object) {
        }

        @Override
        public void b(ax.U9.f f8, Object object) {
        }
    };
    private final Context a;
    private final String b;
    private boolean c = false;
    private HttpClient d = new DefaultHttpClient();
    private Set<String> e;
    private final q f;
    private final ax.U9.h g = new ax.U9.h(this);

    public e(Context object, String object2, Iterable<String> iterable, q q8) {
        ax.U9.i.a(object, "context");
        ax.U9.i.b((String)object2, "clientId");
        this.a = object.getApplicationContext();
        this.b = object2;
        this.f = q8 == null ? k.e() : q8;
        object = iterable;
        if (iterable == null) {
            object = Arrays.asList(new String[0]);
        }
        this.e = new HashSet<String>();
        object2 = object.iterator();
        while (object2.hasNext()) {
            object = (String)object2.next();
            this.e.add((String)object);
        }
        this.e = java.util.DesugarCollections.unmodifiableSet(this.e);
        object = this.f();
        if (!TextUtils.isEmpty((CharSequence)object)) {
            object2 = TextUtils.join((CharSequence)" ", this.e);
            object = new z(new w(this.d, this.b, (String)object, (String)object2, this.f));
            ((z)((Object)object)).a(new h(this));
            object.execute((Object[])new Void[0]);
        }
    }

    static /* synthetic */ boolean d(e e8, boolean bl) {
        e8.c = bl;
        return bl;
    }

    private boolean e() {
        SharedPreferences.Editor editor = this.h().edit();
        editor.remove("refresh_token");
        return editor.commit();
    }

    private String f() {
        return this.h().getString("refresh_token", null);
    }

    private SharedPreferences h() {
        return this.a.getSharedPreferences("com.microsoft.live", 0);
    }

    public ax.U9.h g() {
        return this.g;
    }

    public void i(Activity object, Iterable<String> object2, Object object3, String string, ax.U9.g iterable) {
        ax.U9.i.a(object, "activity");
        ax.U9.g g8 = iterable;
        if (iterable == null) {
            g8 = h;
        }
        if (!this.c) {
            iterable = object2;
            if (object2 == null) {
                object2 = this.e;
                iterable = object2;
                if (object2 == null) {
                    iterable = Arrays.asList(new String[0]);
                }
            }
            if (this.k(iterable, object3, g8).booleanValue()) {
                Log.i((String)"LiveAuthClient", (String)"Interactive login not required.");
                return;
            }
            object2 = TextUtils.join((CharSequence)" ", iterable);
            object = new b((Activity)object, this.d, this.b, (String)object2, string, this.f);
            ((b)object).g(new g(this, g8, object3));
            ((b)object).g(new h(this));
            ((b)object).g(new s(this){
                final e q;
                {
                    this.q = e8;
                }

                @Override
                public void c(t t8) {
                    ax.U9.e.d(this.q, false);
                }

                @Override
                public void d(ax.U9.f f8) {
                    ax.U9.e.d(this.q, false);
                }
            });
            this.c = true;
            ((b)object).h();
            return;
        }
        throw new IllegalStateException("Another login operation is already in progress.");
    }

    public Boolean j(ax.U9.g g8) {
        return this.k(null, null, g8);
    }

    public Boolean k(Iterable<String> iterable, Object object, ax.U9.g g8) {
        if (!this.c) {
            Iterable<String> iterable2 = iterable;
            if (iterable == null) {
                iterable2 = iterable = this.e;
                if (iterable == null) {
                    iterable2 = Arrays.asList(new String[0]);
                }
            }
            if (TextUtils.isEmpty((CharSequence)this.g.c())) {
                this.g.i(this.f());
            }
            boolean bl = this.g.d() || !this.g.a(iterable2);
            boolean bl2 = TextUtils.isEmpty((CharSequence)this.g.c());
            new AsyncTask<Void, Void, Void>(this, bl, g8, object, iterable2){
                final boolean a;
                final ax.U9.g b;
                final Object c;
                final Iterable d;
                final e e;
                {
                    this.e = e8;
                    this.a = bl;
                    this.b = g8;
                    this.c = object;
                    this.d = iterable;
                }

                protected Void a(Void ... voidArray) {
                    if (!this.a) {
                        Log.i((String)"LiveAuthClient", (String)"Access token still valid, so using it.");
                        this.b.a(j.c0, this.e.g, this.c);
                    } else if (this.e.n(this.d).booleanValue()) {
                        Log.i((String)"LiveAuthClient", (String)"Used refresh token to refresh access and refresh tokens.");
                        this.b.a(j.c0, this.e.g, this.c);
                    } else {
                        Log.i((String)"LiveAuthClient", (String)"All tokens expired, you need to call login() to initiate interactive logon");
                        this.b.a(j.d0, this.e.g(), this.c);
                    }
                    return null;
                }
            }.execute((Object[])new Void[0]);
            return bl2 ^ true;
        }
        throw new IllegalStateException("Another login operation is already in progress.");
    }

    public void l(ax.U9.g g8) {
        this.m(null, g8);
    }

    public void m(Object object, ax.U9.g g8) {
        ax.U9.g g9 = g8;
        if (g8 == null) {
            g9 = h;
        }
        this.g.f(null);
        this.g.g(null);
        this.g.i(null);
        this.g.j(null);
        this.g.k(null);
        this.e();
        g8 = CookieSyncManager.createInstance((Context)this.a);
        CookieManager.getInstance().removeAllCookies(null);
        g8.sync();
        g9.a(j.q, null, object);
    }

    Boolean n(Iterable<String> object) {
        object = TextUtils.join((CharSequence)" ", object);
        Object object2 = this.g.c();
        if (TextUtils.isEmpty((CharSequence)object2)) {
            Log.i((String)"LiveAuthClient", (String)"No refresh token available, sorry!");
            return Boolean.FALSE;
        }
        Log.i((String)"LiveAuthClient", (String)"Refresh token found, attempting to refresh access and refresh tokens.");
        object = new w(this.d, this.b, (String)object2, (String)object, this.f);
        try {
            object2 = ((y)object).b();
        }
        catch (ax.U9.f f8) {
            return Boolean.FALSE;
        }
        object = new i(this.g);
        object2.a((u)object);
        object2.a(new h(this));
        return ((i)object).c();
    }

    private static class d
    extends f
    implements Runnable {
        private final j d0;
        private final ax.U9.h e0;

        public d(ax.U9.g g8, Object object, j j8, ax.U9.h h8) {
            super(g8, object);
            this.d0 = j8;
            this.e0 = h8;
        }

        @Override
        public void run() {
            this.q.a(this.d0, this.e0, this.c0);
        }
    }

    private static class e
    extends f
    implements Runnable {
        private final ax.U9.f d0;

        public e(ax.U9.g g8, Object object, ax.U9.f f8) {
            super(g8, object);
            this.d0 = f8;
        }

        @Override
        public void run() {
            this.q.b(this.d0, this.c0);
        }
    }

    private static abstract class f {
        protected final Object c0;
        protected final ax.U9.g q;

        public f(ax.U9.g g8, Object object) {
            this.q = g8;
            this.c0 = object;
        }
    }

    private class g
    extends f
    implements s,
    u {
        final e d0;

        public g(e e8, ax.U9.g g8, Object object) {
            this.d0 = e8;
            super(g8, object);
        }

        @Override
        public void a(v v8) {
            this.d0.g.e(v8);
            new d(this.q, this.c0, j.c0, this.d0.g).run();
        }

        @Override
        public void b(r object) {
            object = new ax.U9.f(((Object)((Object)((r)object).c())).toString().toLowerCase(Locale.US), ((r)object).d(), ((r)object).e());
            new e(this.q, this.c0, (ax.U9.f)object).run();
        }

        @Override
        public void c(t t8) {
            t8.a(this);
        }

        @Override
        public void d(ax.U9.f f8) {
            new e(this.q, this.c0, f8).run();
        }
    }

    private class h
    implements s,
    u {
        final e q;

        private h(e e8) {
            this.q = e8;
        }

        private boolean e(String string) {
            if (!TextUtils.isEmpty((CharSequence)string)) {
                SharedPreferences.Editor editor = this.q.a.getSharedPreferences("com.microsoft.live", 0).edit();
                editor.putString("refresh_token", string);
                return editor.commit();
            }
            throw new AssertionError();
        }

        @Override
        public void a(v object) {
            if (!TextUtils.isEmpty((CharSequence)(object = ((v)object).g()))) {
                this.e((String)object);
            }
        }

        @Override
        public void b(r r8) {
            if (r8.c() == m.c0) {
                this.q.e();
            }
        }

        @Override
        public void c(t t8) {
            t8.a(this);
        }

        @Override
        public void d(ax.U9.f f8) {
        }
    }

    private static class i
    implements u {
        private boolean c0;
        private final ax.U9.h q;

        public i(ax.U9.h h8) {
            if (h8 != null) {
                this.q = h8;
                this.c0 = false;
                return;
            }
            throw new AssertionError();
        }

        @Override
        public void a(v v8) {
            this.q.e(v8);
            this.c0 = true;
        }

        @Override
        public void b(r r8) {
            this.c0 = false;
        }

        public boolean c() {
            return this.c0;
        }
    }
}

