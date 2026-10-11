/*
 * Decompiled with CFR 0.152.
 */
package ax.A7;

import android.content.Context;
import android.os.Bundle;
import ax.A7.a;
import ax.A7.c;
import ax.A7.d;
import ax.M5.p;
import ax.b6.W0;
import ax.x7.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class b
implements a {
    private static volatile a c;
    private final ax.e6.a a;
    final Map<String, Object> b;

    private b(ax.e6.a a8) {
        p.l(a8);
        this.a = a8;
        this.b = new j.ConcurrentHashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a g(f object, Context context, ax.Y7.d d8) {
        p.l(object);
        p.l(context);
        p.l(d8);
        p.l(context.getApplicationContext());
        if (c != null) return c;
        synchronized (b.class) {
            Throwable throwable2;
            block4: {
                Bundle bundle;
                block3: {
                    try {
                        if (c != null) return c;
                        bundle = new Bundle(1);
                        if (!((f)object).u()) break block3;
                        d d9 = new d();
                        c c8 = new c();
                        d8.a(ax.x7.b.class, d9, c8);
                        bundle.putBoolean("dataCollectionDefaultEnabled", ((f)object).t());
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                c = object = new b(W0.f(context, null, null, null, bundle).y());
                return c;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static /* synthetic */ void h(ax.Y7.a a8) {
        boolean bl = ((ax.x7.b)a8.a()).a;
        synchronized (b.class) {
            ((b)p.l(ax.A7.b.c)).a.h(bl);
            return;
        }
    }

    private final boolean i(String string) {
        return !string.isEmpty() && this.b.containsKey(string) && this.b.get(string) != null;
    }

    @Override
    public Map<String, Object> a(boolean bl) {
        return this.a.d(null, null, bl);
    }

    @Override
    public void b(a.c c8) {
        if (!ax.B7.b.g(c8)) {
            return;
        }
        this.a.g(ax.B7.b.a(c8));
    }

    @Override
    public a.a c(String string, a.b object) {
        p.l(object);
        if (!ax.B7.b.j(string)) {
            return null;
        }
        if (this.i(string)) {
            return null;
        }
        ax.e6.a a8 = this.a;
        object = "fiam".equals(string) ? new ax.B7.a(a8, (a.b)object) : ("clx".equals(string) ? new ax.B7.c(a8, (a.b)object) : null);
        if (object != null) {
            this.b.put(string, object);
            return new a.a(){
                private final String a;
                private final b b;
                {
                    this.a = string;
                    this.b = b8;
                }
            };
        }
        return null;
    }

    @Override
    public void clearConditionalUserProperty(String string, String string2, Bundle bundle) {
        if (string2 != null && !ax.B7.b.e(string2, bundle)) {
            return;
        }
        this.a.a(string, string2, bundle);
    }

    @Override
    public void d(String string, String string2, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        if (!(ax.B7.b.j(string) && ax.B7.b.e(string2, bundle2) && ax.B7.b.h(string, string2, bundle2))) {
            return;
        }
        ax.B7.b.d(string, string2, bundle2);
        this.a.e(string, string2, bundle2);
    }

    @Override
    public int e(String string) {
        return this.a.c(string);
    }

    @Override
    public List<a.c> f(String object, String string) {
        ArrayList<a.c> arrayList = new ArrayList<a.c>();
        object = this.a.b((String)object, string).iterator();
        while (object.hasNext()) {
            arrayList.add(ax.B7.b.b((Bundle)object.next()));
        }
        return arrayList;
    }
}

