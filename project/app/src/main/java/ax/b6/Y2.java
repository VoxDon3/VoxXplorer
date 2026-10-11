/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.Context;
import ax.b6.G2;
import ax.b6.J2;
import ax.b6.R2;
import ax.b6.S2;
import ax.b6.U2;
import ax.b6.V2;
import ax.b6.W2;
import ax.b6.X2;
import ax.b6.a3;
import ax.b6.b3;
import ax.b6.c3;
import ax.b6.d3;
import ax.b6.e3;
import ax.b6.f3;
import ax.b6.g3;
import ax.b6.h3;
import ax.b6.i3;
import ax.b6.j3;
import ax.b6.k3;
import ax.q7.k;
import ax.q7.n;
import ax.q7.u;
import ax.q7.v;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class Y2<T> {
    private static final Object h = new Object();
    private static volatile g3 i;
    private static k3 j;
    private static final AtomicInteger k;
    private final h3 a;
    private final String b;
    private Object c;
    private volatile int d = -1;
    private volatile T e;
    private final boolean f;
    private volatile boolean g;

    static {
        new AtomicReference();
        j = new k3(new a3());
        k = new AtomicInteger();
    }

    private Y2(h3 h32, String string, T t8, boolean bl) {
        String string2 = h32.a;
        if (string2 == null && h32.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (string2 != null && h32.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.a = h32;
        this.b = string;
        this.c = t8;
        this.f = bl;
        this.g = false;
    }

    /* synthetic */ Y2(h3 h32, String string, Object object, boolean bl, j3 j32) {
        this(h32, string, object, true);
    }

    static /* synthetic */ Y2 a(h3 h32, String string, Boolean bl, boolean bl2) {
        return new c3(h32, string, bl, true);
    }

    static /* synthetic */ Y2 b(h3 h32, String string, Double d8, boolean bl) {
        return new f3(h32, string, d8, true);
    }

    static /* synthetic */ Y2 c(h3 h32, String string, Long l8, boolean bl) {
        return new d3(h32, string, l8, true);
    }

    static /* synthetic */ Y2 d(h3 h32, String string, String string2, boolean bl) {
        return new e3(h32, string, string2, true);
    }

    static /* synthetic */ k e(Context context) {
        return U2.a.a(context);
    }

    private final T g(g3 object) {
        Object object2 = this.a;
        if (!((h3)object2).e && ((object2 = ((h3)object2).i) == null || ((Boolean)object2.apply(((g3)object).a())).booleanValue())) {
            object2 = R2.a(((g3)object).a());
            object = this.a;
            object = ((h3)object).e ? null : this.i(((h3)object).c);
            if ((object = object2.h((String)object)) != null) {
                return this.h(object);
            }
        }
        return null;
    }

    private final String i(String string) {
        if (string != null && string.isEmpty()) {
            return this.b;
        }
        String string2 = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private final T j(g3 object) {
        object = this.a.b != null ? (W2.b(((g3)object).a(), this.a.b) ? (this.a.h ? J2.a(((g3)object).a().getContentResolver(), V2.a(V2.b(((g3)object).a(), this.a.b.getLastPathSegment())), new X2()) : J2.a(((g3)object).a().getContentResolver(), this.a.b, new X2())) : null) : i3.b(((g3)object).a(), this.a.a, new X2());
        if (object != null && (object = object.h(this.k())) != null) {
            return this.h(object);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void l(Context context) {
        block10: {
            Throwable throwable2;
            block12: {
                block11: {
                    Object object;
                    g3 g32;
                    if (i != null) return;
                    if (context == null) {
                        return;
                    }
                    Object object2 = h;
                    // MONITORENTER : object2
                    if (i != null) break block10;
                    // MONITORENTER : object2
                    try {
                        g32 = i;
                        object = context.getApplicationContext();
                        if (object != null) {
                            context = object;
                        }
                        if (g32 != null && g32.a() == context) break block11;
                    }
                    catch (Throwable throwable2) {
                        break block12;
                    }
                    if (g32 != null) {
                        J2.d();
                        i3.c();
                        R2.b();
                    }
                    object = new b3(context);
                    object = v.a(object);
                    i = g32 = new G2(context, (u<k<S2>>)object);
                    k.incrementAndGet();
                }
                // MONITOREXIT : object2
                return;
            }
            // MONITOREXIT : object2
            throw throwable2;
        }
        // MONITOREXIT : object2
    }

    public static void m() {
        k.incrementAndGet();
    }

    static /* synthetic */ boolean n() {
        return true;
    }

    private final T o() {
        return (T)this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final T f() {
        int n8;
        if (!this.f) {
            n.u(j.a(this.b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        if (this.d >= (n8 = k.get())) return this.e;
        synchronized (this) {
            Throwable throwable2;
            block7: {
                k<S2> k8;
                Object object;
                k<S2> k9;
                g3 g32;
                block6: {
                    try {
                        if (this.d >= n8) return this.e;
                        g32 = i;
                        k9 = ax.q7.k.a();
                        h3 h32 = null;
                        object = h32;
                        if (g32 == null) break block6;
                        k9 = k8 = g32.b().get();
                        object = h32;
                        if (!k8.c()) break block6;
                        k9 = k8.b();
                        object = this.a;
                        object = k9.a(((h3)object).b, ((h3)object).a, ((h3)object).d, this.b);
                        k9 = k8;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                boolean bl = g32 != null;
                n.u(bl, "Must call PhenotypeFlagInitializer.maybeInit() first");
                if (!(this.a.f ? (k8 = this.g(g32)) != null || (k8 = this.j(g32)) != null : (k8 = this.j(g32)) != null || (k8 = this.g(g32)) != null)) {
                    k8 = this.o();
                }
                if (k9.c()) {
                    k8 = object == null ? this.o() : this.h(object);
                }
                this.e = k8;
                this.d = n8;
                return this.e;
            }
            throw throwable2;
        }
    }

    abstract T h(Object var1);

    public final String k() {
        return this.i(this.a.d);
    }
}

