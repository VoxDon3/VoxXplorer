/*
 * Decompiled with CFR 0.152.
 */
package ax.Q7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import ax.J7.C;
import ax.J7.T;
import ax.J7.w;
import ax.J7.x;
import ax.J7.y;
import ax.Q7.a;
import ax.Q7.b;
import ax.Q7.c;
import ax.Q7.d;
import ax.Q7.e;
import ax.Q7.g;
import ax.Q7.i;
import ax.Q7.j;
import ax.Q7.k;
import ax.j6.m;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public class f
implements i {
    private final Context a;
    private final j b;
    private final g c;
    private final w d;
    private final a e;
    private final k f;
    private final x g;
    private final AtomicReference<d> h;
    private final AtomicReference<ax.j6.k<d>> i;

    f(Context context, j j8, w w8, g g8, a a8, k k8, x x8) {
        AtomicReference<d> atomicReference = new AtomicReference<d>();
        this.h = atomicReference;
        this.i = new AtomicReference(new ax.j6.k());
        this.a = context;
        this.b = j8;
        this.d = w8;
        this.c = g8;
        this.e = a8;
        this.f = k8;
        this.g = x8;
        atomicReference.set(ax.Q7.b.b(w8));
    }

    public static f l(Context context, String string, C c8, ax.N7.b object, String string2, String string3, ax.O7.g object2, x x8) {
        String string4 = c8.g();
        T t8 = new T();
        g g8 = new g(t8);
        object2 = new a((ax.O7.g)object2);
        object = new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", string), (ax.N7.b)object);
        return new f(context, new j(string, c8.h(), c8.i(), c8.j(), c8, ax.J7.i.h(ax.J7.i.m(context), string, string3, string2), string3, string2, y.h(string4).j()), t8, g8, (a)object2, (k)object, x8);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private d m(e e8) {
        Throwable var1_4;
        d d8;
        block9: {
            block5: {
                block6: {
                    block7: {
                        d d9;
                        block8: {
                            d8 = null;
                            try {
                                if (((Object)((Object)ax.Q7.e.c0)).equals((Object)e8)) break block5;
                                JSONObject jSONObject = this.e.b();
                                if (jSONObject == null) break block6;
                                d9 = this.c.b(jSONObject);
                                if (d9 == null) break block7;
                                this.q(jSONObject, "Loaded cached settings: ");
                                long l8 = this.d.a();
                                if (((Object)((Object)ax.Q7.e.d0)).equals((Object)e8) || !d9.a(l8)) break block8;
                                ax.G7.g.f().i("Cached settings have expired.");
                                return null;
                            }
                            catch (Exception exception) {}
                        }
                        try {
                            ax.G7.g.f().i("Returning cached settings.");
                            return d9;
                        }
                        catch (Exception exception) {
                            d8 = d9;
                        }
                        break block9;
                    }
                    ax.G7.g.f().e("Failed to parse cached settings data.", null);
                    return null;
                    break block9;
                }
                ax.G7.g.f().b("No cached settings data found.");
            }
            return null;
        }
        ax.G7.g.f().e("Failed to get cached settings", (Throwable)var1_4);
        return d8;
    }

    private String n() {
        return ax.J7.i.q(this.a).getString("existing_instance_identifier", "");
    }

    private void q(JSONObject jSONObject, String string) throws JSONException {
        ax.G7.g g8 = ax.G7.g.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(jSONObject.toString());
        g8.b(stringBuilder.toString());
    }

    @SuppressLint(value={"CommitPrefEdits"})
    private boolean r(String string) {
        SharedPreferences.Editor editor = ax.J7.i.q(this.a).edit();
        editor.putString("existing_instance_identifier", string);
        editor.apply();
        return true;
    }

    @Override
    public ax.j6.j<d> a() {
        return this.i.get().a();
    }

    @Override
    public d b() {
        return this.h.get();
    }

    boolean k() {
        return this.n().equals(this.b.f) ^ true;
    }

    public ax.j6.j<Void> o(e object, Executor executor) {
        if (!this.k() && (object = this.m((e)((Object)object))) != null) {
            this.h.set((d)object);
            this.i.get().e((d)object);
            return m.e(null);
        }
        object = this.m(ax.Q7.e.d0);
        if (object != null) {
            this.h.set((d)object);
            this.i.get().e((d)object);
        }
        return this.g.k(executor).o(executor, new ax.j6.i<Void, Void>(this){
            final f a;
            {
                this.a = f8;
            }

            public ax.j6.j<Void> b(Void object) throws Exception {
                Object object2 = this.a.f.a(this.a.b, true);
                if (object2 != null) {
                    object = this.a.c.b((JSONObject)object2);
                    this.a.e.c(((d)object).c, (JSONObject)object2);
                    this.a.q(object2, "Loaded settings: ");
                    object2 = this.a;
                    ((f)object2).r(((f)object2).b.f);
                    this.a.h.set(object);
                    ((ax.j6.k)this.a.i.get()).e(object);
                }
                return m.e(null);
            }
        });
    }

    public ax.j6.j<Void> p(Executor executor) {
        return this.o(ax.Q7.e.q, executor);
    }
}

