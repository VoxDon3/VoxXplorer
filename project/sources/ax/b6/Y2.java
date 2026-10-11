package ax.b6;

import android.content.Context;
import ax.q7.AbstractC2884k;
import ax.q7.InterfaceC2879f;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class Y2<T> {
    private static final Object h = new Object();
    private static volatile AbstractC1562g3 i;
    private static C1598k3 j;
    private static final AtomicInteger k;
    private final C1571h3 a;
    private final String b;
    private Object c;
    private volatile int d;
    private volatile T e;
    private final boolean f;
    private volatile boolean g;

    static {
        new AtomicReference();
        j = new C1598k3(new InterfaceC1623n3() { // from class: ax.b6.a3
            @Override // ax.b6.InterfaceC1623n3
            public final boolean a() {
                return Y2.n();
            }
        });
        k = new AtomicInteger();
    }

    static /* synthetic */ Y2 a(C1571h3 c1571h3, String str, Boolean bool, boolean z) {
        return new C1526c3(c1571h3, str, bool, true);
    }

    static /* synthetic */ Y2 b(C1571h3 c1571h3, String str, Double d, boolean z) {
        return new C1553f3(c1571h3, str, d, true);
    }

    static /* synthetic */ Y2 c(C1571h3 c1571h3, String str, Long l, boolean z) {
        return new C1535d3(c1571h3, str, l, true);
    }

    static /* synthetic */ Y2 d(C1571h3 c1571h3, String str, String str2, boolean z) {
        return new C1544e3(c1571h3, str, str2, true);
    }

    private final T g(AbstractC1562g3 abstractC1562g3) {
        InterfaceC2879f<Context, Boolean> interfaceC2879f;
        C1571h3 c1571h3 = this.a;
        if (!c1571h3.e && ((interfaceC2879f = c1571h3.i) == null || interfaceC2879f.apply(abstractC1562g3.a()).booleanValue())) {
            R2 a = R2.a(abstractC1562g3.a());
            C1571h3 c1571h32 = this.a;
            Object h2 = a.h(c1571h32.e ? null : i(c1571h32.c));
            if (h2 != null) {
                return h(h2);
            }
        }
        return null;
    }

    private final String i(String str) {
        if (str != null && str.isEmpty()) {
            return this.b;
        }
        return str + this.b;
    }

    private final T j(AbstractC1562g3 abstractC1562g3) {
        Object h2;
        M2 a = this.a.b != null ? W2.b(abstractC1562g3.a(), this.a.b) ? this.a.h ? J2.a(abstractC1562g3.a().getContentResolver(), V2.a(V2.b(abstractC1562g3.a(), this.a.b.getLastPathSegment())), new Runnable() { // from class: ax.b6.X2
            @Override // java.lang.Runnable
            public final void run() {
                Y2.m();
            }
        }) : J2.a(abstractC1562g3.a().getContentResolver(), this.a.b, new Runnable() { // from class: ax.b6.X2
            @Override // java.lang.Runnable
            public final void run() {
                Y2.m();
            }
        }) : null : C1580i3.b(abstractC1562g3.a(), this.a.a, new Runnable() { // from class: ax.b6.X2
            @Override // java.lang.Runnable
            public final void run() {
                Y2.m();
            }
        });
        if (a == null || (h2 = a.h(k())) == null) {
            return null;
        }
        return h(h2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(final android.content.Context r3) {
        /*
            ax.b6.g3 r0 = ax.b6.Y2.i
            if (r0 != 0) goto L4e
            if (r3 != 0) goto L7
            goto L4e
        L7:
            java.lang.Object r0 = ax.b6.Y2.h
            monitor-enter(r0)
            ax.b6.g3 r1 = ax.b6.Y2.i     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L4a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L48
            ax.b6.g3 r1 = ax.b6.Y2.i     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L18
            goto L19
        L18:
            r3 = r2
        L19:
            if (r1 == 0) goto L24
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> L22
            if (r2 == r3) goto L44
            goto L24
        L22:
            r3 = move-exception
            goto L46
        L24:
            if (r1 == 0) goto L2f
            ax.b6.J2.d()     // Catch: java.lang.Throwable -> L22
            ax.b6.C1580i3.c()     // Catch: java.lang.Throwable -> L22
            ax.b6.R2.b()     // Catch: java.lang.Throwable -> L22
        L2f:
            ax.b6.b3 r1 = new ax.b6.b3     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            ax.q7.u r1 = ax.q7.v.a(r1)     // Catch: java.lang.Throwable -> L22
            ax.b6.G2 r2 = new ax.b6.G2     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            ax.b6.Y2.i = r2     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.atomic.AtomicInteger r3 = ax.b6.Y2.k     // Catch: java.lang.Throwable -> L22
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L22
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L4a
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L48
        L48:
            r3 = move-exception
            goto L4c
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r3
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.b6.Y2.l(android.content.Context):void");
    }

    public static void m() {
        k.incrementAndGet();
    }

    static /* synthetic */ boolean n() {
        return true;
    }

    private final T o() {
        return (T) this.c;
    }

    public final T f() {
        T j2;
        if (!this.f) {
            ax.q7.n.u(j.a(this.b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i2 = k.get();
        if (this.d < i2) {
            synchronized (this) {
                try {
                    if (this.d < i2) {
                        AbstractC1562g3 abstractC1562g3 = i;
                        AbstractC2884k<S2> a = AbstractC2884k.a();
                        String str = null;
                        if (abstractC1562g3 != null) {
                            a = abstractC1562g3.b().get();
                            if (a.c()) {
                                S2 b = a.b();
                                C1571h3 c1571h3 = this.a;
                                str = b.a(c1571h3.b, c1571h3.a, c1571h3.d, this.b);
                            }
                        }
                        ax.q7.n.u(abstractC1562g3 != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        if (!this.a.f ? (j2 = j(abstractC1562g3)) == null && (j2 = g(abstractC1562g3)) == null : (j2 = g(abstractC1562g3)) == null && (j2 = j(abstractC1562g3)) == null) {
                            j2 = o();
                        }
                        if (a.c()) {
                            j2 = str == null ? o() : h(str);
                        }
                        this.e = j2;
                        this.d = i2;
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    abstract T h(Object obj);

    public final String k() {
        return i(this.a.d);
    }

    private Y2(C1571h3 c1571h3, String str, T t, boolean z) {
        this.d = -1;
        String str2 = c1571h3.a;
        if (str2 == null && c1571h3.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && c1571h3.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.a = c1571h3;
        this.b = str;
        this.c = t;
        this.f = z;
        this.g = false;
    }
}
