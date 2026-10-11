/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.content.Context;
import android.net.Uri;
import ax.W5.B;
import ax.W5.D;
import ax.W5.E;
import ax.W5.F;
import ax.W5.K;
import ax.W5.M;
import ax.W5.N;
import ax.W5.P;
import ax.W5.Q;
import ax.W5.U;
import ax.W5.W;
import ax.W5.b0;
import ax.W5.o;
import ax.W5.r;
import ax.W5.t;
import ax.W5.z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class O {
    private static final Object f = new Object();
    private static volatile M g;
    private static final AtomicReference h;
    private static final Q i;
    private static final AtomicInteger j;
    public static final int k = 0;
    final K a;
    final String b;
    private final Object c;
    private volatile int d = -1;
    private volatile Object e;

    static {
        h = new AtomicReference();
        i = new Q(F.a);
        j = new AtomicInteger();
    }

    /* synthetic */ O(K k8, String string, Object object, boolean bl, N n8) {
        if (k8.a != null) {
            this.a = k8;
            this.b = string;
            this.c = object;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void c() {
        j.incrementAndGet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void d(Context context) {
        block9: {
            Throwable throwable2;
            block11: {
                block10: {
                    Object object;
                    M m8;
                    if (g != null) return;
                    if (context == null) {
                        return;
                    }
                    Object object2 = f;
                    // MONITORENTER : object2
                    if (g != null) break block9;
                    // MONITORENTER : object2
                    try {
                        m8 = g;
                        object = context.getApplicationContext();
                        if (object != null) {
                            context = object;
                        }
                        if (m8 != null && m8.a() == context) break block10;
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                    r.d();
                    P.c();
                    z.e();
                    object = new E(context);
                    object = b0.a((W)object);
                    g = m8 = new o(context, (W)object);
                    j.incrementAndGet();
                }
                // MONITOREXIT : object2
                return;
            }
            // MONITOREXIT : object2
            throw throwable2;
        }
        // MONITOREXIT : object2
    }

    abstract Object a(Object var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object b() {
        int n8 = j.get();
        if (this.d >= n8) return this.e;
        synchronized (this) {
            Throwable throwable2;
            block11: {
                String string;
                Object object;
                U u8;
                Object var6_5;
                Object object2;
                M m8;
                block10: {
                    block9: {
                        try {
                            if (this.d >= n8) return this.e;
                            m8 = g;
                            object2 = U.c();
                            var6_5 = null;
                            if (m8 == null) break block9;
                            u8 = (U)m8.b().a();
                            object2 = u8;
                            if (!u8.b()) break block9;
                            object = (t)u8.a();
                            object2 = this.a;
                            string = ((t)object).a(((K)object2).a, null, ((K)object2).c, this.b);
                            break block10;
                        }
                        catch (Throwable throwable2) {
                            break block11;
                        }
                    }
                    string = null;
                    u8 = object2;
                }
                if (m8 == null) {
                    object2 = new IllegalStateException("Must call PhenotypeFlag.init() first");
                    throw object2;
                }
                object2 = this.a.a;
                object2 = object2 != null ? (B.a(m8.a(), (Uri)object2) ? r.b(m8.a().getContentResolver(), this.a.a, D.q) : null) : P.b(m8.a(), null, D.q);
                object = object2 != null && (object2 = object2.a(this.b)) != null ? this.a(object2) : null;
                object2 = object;
                if (object == null) {
                    object2 = var6_5;
                    if (!this.a.d) {
                        object = z.b(m8.a());
                        object2 = this.a.d ? null : this.b;
                        object = ((z)object).c((String)object2);
                        object2 = var6_5;
                        if (object != null) {
                            object2 = this.a(object);
                        }
                    }
                    if (object2 == null) {
                        object2 = this.c;
                    }
                }
                if (u8.b()) {
                    object2 = string == null ? this.c : this.a(string);
                }
                this.e = object2;
                this.d = n8;
                return this.e;
            }
            throw throwable2;
        }
    }
}

