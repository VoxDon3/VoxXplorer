package ax.Q7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import ax.J7.C;
import ax.J7.C0764i;
import ax.J7.C0778x;
import ax.J7.EnumC0779y;
import ax.J7.InterfaceC0777w;
import ax.J7.T;
import ax.j6.AbstractC2327j;
import ax.j6.C2328k;
import ax.j6.InterfaceC2326i;
import ax.j6.m;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f implements i {
    private final Context a;
    private final j b;
    private final g c;
    private final InterfaceC0777w d;
    private final ax.Q7.a e;
    private final k f;
    private final C0778x g;
    private final AtomicReference<d> h;
    private final AtomicReference<C2328k<d>> i;

    class a implements InterfaceC2326i<Void, Void> {
        a() {
        }

        @Override // ax.j6.InterfaceC2326i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC2327j<Void> a(Void r5) throws Exception {
            JSONObject a = f.this.f.a(f.this.b, true);
            if (a != null) {
                d b = f.this.c.b(a);
                f.this.e.c(b.c, a);
                f.this.q(a, "Loaded settings: ");
                f fVar = f.this;
                fVar.r(fVar.b.f);
                f.this.h.set(b);
                ((C2328k) f.this.i.get()).e(b);
            }
            return m.e(null);
        }
    }

    f(Context context, j jVar, InterfaceC0777w interfaceC0777w, g gVar, ax.Q7.a aVar, k kVar, C0778x c0778x) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.h = atomicReference;
        this.i = new AtomicReference<>(new C2328k());
        this.a = context;
        this.b = jVar;
        this.d = interfaceC0777w;
        this.c = gVar;
        this.e = aVar;
        this.f = kVar;
        this.g = c0778x;
        atomicReference.set(b.b(interfaceC0777w));
    }

    public static f l(Context context, String str, C c, ax.N7.b bVar, String str2, String str3, ax.O7.g gVar, C0778x c0778x) {
        String g = c.g();
        T t = new T();
        return new f(context, new j(str, c.h(), c.i(), c.j(), c, C0764i.h(C0764i.m(context), str, str3, str2), str3, str2, EnumC0779y.h(g).j()), t, new g(t), new ax.Q7.a(gVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), c0778x);
    }

    private d m(e eVar) {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject b = this.e.b();
                if (b != null) {
                    d b2 = this.c.b(b);
                    if (b2 == null) {
                        ax.G7.g.f().e("Failed to parse cached settings data.", null);
                        return null;
                    }
                    q(b, "Loaded cached settings: ");
                    long a2 = this.d.a();
                    if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && b2.a(a2)) {
                        ax.G7.g.f().i("Cached settings have expired.");
                        return null;
                    }
                    try {
                        ax.G7.g.f().i("Returning cached settings.");
                        return b2;
                    } catch (Exception e) {
                        e = e;
                        dVar = b2;
                        ax.G7.g.f().e("Failed to get cached settings", e);
                        return dVar;
                    }
                }
                ax.G7.g.f().b("No cached settings data found.");
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    private String n() {
        return C0764i.q(this.a).getString("existing_instance_identifier", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) throws JSONException {
        ax.G7.g.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor edit = C0764i.q(this.a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // ax.Q7.i
    public AbstractC2327j<d> a() {
        return this.i.get().a();
    }

    @Override // ax.Q7.i
    public d b() {
        return this.h.get();
    }

    boolean k() {
        return !n().equals(this.b.f);
    }

    public AbstractC2327j<Void> o(e eVar, Executor executor) {
        d m;
        if (!k() && (m = m(eVar)) != null) {
            this.h.set(m);
            this.i.get().e(m);
            return m.e(null);
        }
        d m2 = m(e.IGNORE_CACHE_EXPIRATION);
        if (m2 != null) {
            this.h.set(m2);
            this.i.get().e(m2);
        }
        return this.g.k(executor).o(executor, new a());
    }

    public AbstractC2327j<Void> p(Executor executor) {
        return o(e.USE_CACHE, executor);
    }
}
