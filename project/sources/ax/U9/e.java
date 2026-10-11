package ax.U9;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

/* loaded from: classes3.dex */
public class e {
    private static final ax.U9.g h = new a();
    private final Context a;
    private final String b;
    private Set<String> e;
    private final q f;
    private HttpClient d = new DefaultHttpClient();
    private boolean c = false;
    private final ax.U9.h g = new ax.U9.h(this);

    class b implements s {
        b() {
        }

        @Override // ax.U9.s
        public void c(t tVar) {
            e.this.c = false;
        }

        @Override // ax.U9.s
        public void d(ax.U9.f fVar) {
            e.this.c = false;
        }
    }

    class c extends AsyncTask<Void, Void, Void> {
        final /* synthetic */ boolean a;
        final /* synthetic */ ax.U9.g b;
        final /* synthetic */ Object c;
        final /* synthetic */ Iterable d;

        c(boolean z, ax.U9.g gVar, Object obj, Iterable iterable) {
            this.a = z;
            this.b = gVar;
            this.c = obj;
            this.d = iterable;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            if (!this.a) {
                Log.i("LiveAuthClient", "Access token still valid, so using it.");
                this.b.a(j.CONNECTED, e.this.g, this.c);
                return null;
            }
            if (e.this.n(this.d).booleanValue()) {
                Log.i("LiveAuthClient", "Used refresh token to refresh access and refresh tokens.");
                this.b.a(j.CONNECTED, e.this.g, this.c);
                return null;
            }
            Log.i("LiveAuthClient", "All tokens expired, you need to call login() to initiate interactive logon");
            this.b.a(j.NOT_CONNECTED, e.this.g(), this.c);
            return null;
        }
    }

    private static class d extends f implements Runnable {
        private final j d0;
        private final ax.U9.h e0;

        public d(ax.U9.g gVar, Object obj, j jVar, ax.U9.h hVar) {
            super(gVar, obj);
            this.d0 = jVar;
            this.e0 = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.a(this.d0, this.e0, this.c0);
        }
    }

    /* renamed from: ax.U9.e$e, reason: collision with other inner class name */
    private static class RunnableC0210e extends f implements Runnable {
        private final ax.U9.f d0;

        public RunnableC0210e(ax.U9.g gVar, Object obj, ax.U9.f fVar) {
            super(gVar, obj);
            this.d0 = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.b(this.d0, this.c0);
        }
    }

    private static abstract class f {
        protected final Object c0;
        protected final ax.U9.g q;

        public f(ax.U9.g gVar, Object obj) {
            this.q = gVar;
            this.c0 = obj;
        }
    }

    private class g extends f implements s, u {
        public g(ax.U9.g gVar, Object obj) {
            super(gVar, obj);
        }

        @Override // ax.U9.u
        public void a(v vVar) {
            e.this.g.e(vVar);
            new d(this.q, this.c0, j.CONNECTED, e.this.g).run();
        }

        @Override // ax.U9.u
        public void b(r rVar) {
            new RunnableC0210e(this.q, this.c0, new ax.U9.f(rVar.c().toString().toLowerCase(Locale.US), rVar.d(), rVar.e())).run();
        }

        @Override // ax.U9.s
        public void c(t tVar) {
            tVar.a(this);
        }

        @Override // ax.U9.s
        public void d(ax.U9.f fVar) {
            new RunnableC0210e(this.q, this.c0, fVar).run();
        }
    }

    private class h implements s, u {
        private h() {
        }

        private boolean e(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new AssertionError();
            }
            SharedPreferences.Editor edit = e.this.a.getSharedPreferences("com.microsoft.live", 0).edit();
            edit.putString("refresh_token", str);
            return edit.commit();
        }

        @Override // ax.U9.u
        public void a(v vVar) {
            String g = vVar.g();
            if (TextUtils.isEmpty(g)) {
                return;
            }
            e(g);
        }

        @Override // ax.U9.u
        public void b(r rVar) {
            if (rVar.c() == m.INVALID_GRANT) {
                e.this.e();
            }
        }

        @Override // ax.U9.s
        public void c(t tVar) {
            tVar.a(this);
        }

        /* synthetic */ h(e eVar, a aVar) {
            this();
        }

        @Override // ax.U9.s
        public void d(ax.U9.f fVar) {
        }
    }

    private static class i implements u {
        private boolean c0;
        private final ax.U9.h q;

        public i(ax.U9.h hVar) {
            if (hVar == null) {
                throw new AssertionError();
            }
            this.q = hVar;
            this.c0 = false;
        }

        @Override // ax.U9.u
        public void a(v vVar) {
            this.q.e(vVar);
            this.c0 = true;
        }

        @Override // ax.U9.u
        public void b(r rVar) {
            this.c0 = false;
        }

        public boolean c() {
            return this.c0;
        }
    }

    public e(Context context, String str, Iterable<String> iterable, q qVar) {
        ax.U9.i.a(context, "context");
        ax.U9.i.b(str, "clientId");
        this.a = context.getApplicationContext();
        this.b = str;
        if (qVar == null) {
            this.f = k.e();
        } else {
            this.f = qVar;
        }
        iterable = iterable == null ? Arrays.asList(new String[0]) : iterable;
        this.e = new HashSet();
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            this.e.add(it.next());
        }
        this.e = DesugarCollections.unmodifiableSet(this.e);
        String f2 = f();
        if (TextUtils.isEmpty(f2)) {
            return;
        }
        z zVar = new z(new w(this.d, this.b, f2, TextUtils.join(" ", this.e), this.f));
        zVar.a(new h(this, null));
        zVar.execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        SharedPreferences.Editor edit = h().edit();
        edit.remove("refresh_token");
        return edit.commit();
    }

    private String f() {
        return h().getString("refresh_token", null);
    }

    private SharedPreferences h() {
        return this.a.getSharedPreferences("com.microsoft.live", 0);
    }

    public ax.U9.h g() {
        return this.g;
    }

    public void i(Activity activity, Iterable<String> iterable, Object obj, String str, ax.U9.g gVar) {
        ax.U9.i.a(activity, "activity");
        if (gVar == null) {
            gVar = h;
        }
        if (this.c) {
            throw new IllegalStateException("Another login operation is already in progress.");
        }
        if (iterable == null && (iterable = this.e) == null) {
            iterable = Arrays.asList(new String[0]);
        }
        if (k(iterable, obj, gVar).booleanValue()) {
            Log.i("LiveAuthClient", "Interactive login not required.");
            return;
        }
        ax.U9.b bVar = new ax.U9.b(activity, this.d, this.b, TextUtils.join(" ", iterable), str, this.f);
        bVar.g(new g(gVar, obj));
        bVar.g(new h(this, null));
        bVar.g(new b());
        this.c = true;
        bVar.h();
    }

    public Boolean j(ax.U9.g gVar) {
        return k(null, null, gVar);
    }

    public Boolean k(Iterable<String> iterable, Object obj, ax.U9.g gVar) {
        if (this.c) {
            throw new IllegalStateException("Another login operation is already in progress.");
        }
        if (iterable == null && (iterable = this.e) == null) {
            iterable = Arrays.asList(new String[0]);
        }
        Iterable<String> iterable2 = iterable;
        if (TextUtils.isEmpty(this.g.c())) {
            this.g.i(f());
        }
        boolean z = this.g.d() || !this.g.a(iterable2);
        boolean isEmpty = TextUtils.isEmpty(this.g.c());
        new c(z, gVar, obj, iterable2).execute(new Void[0]);
        return Boolean.valueOf(!isEmpty);
    }

    public void l(ax.U9.g gVar) {
        m(null, gVar);
    }

    public void m(Object obj, ax.U9.g gVar) {
        if (gVar == null) {
            gVar = h;
        }
        this.g.f(null);
        this.g.g(null);
        this.g.i(null);
        this.g.j(null);
        this.g.k(null);
        e();
        CookieSyncManager createInstance = CookieSyncManager.createInstance(this.a);
        CookieManager.getInstance().removeAllCookies(null);
        createInstance.sync();
        gVar.a(j.UNKNOWN, null, obj);
    }

    Boolean n(Iterable<String> iterable) {
        String join = TextUtils.join(" ", iterable);
        String c2 = this.g.c();
        if (TextUtils.isEmpty(c2)) {
            Log.i("LiveAuthClient", "No refresh token available, sorry!");
            return Boolean.FALSE;
        }
        Log.i("LiveAuthClient", "Refresh token found, attempting to refresh access and refresh tokens.");
        try {
            t b2 = new w(this.d, this.b, c2, join, this.f).b();
            i iVar = new i(this.g);
            b2.a(iVar);
            b2.a(new h(this, null));
            return Boolean.valueOf(iVar.c());
        } catch (ax.U9.f unused) {
            return Boolean.FALSE;
        }
    }

    class a implements ax.U9.g {
        a() {
        }

        @Override // ax.U9.g
        public void b(ax.U9.f fVar, Object obj) {
        }

        @Override // ax.U9.g
        public void a(j jVar, ax.U9.h hVar, Object obj) {
        }
    }
}
