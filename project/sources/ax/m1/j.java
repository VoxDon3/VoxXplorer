package ax.m1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import ax.S0.C0968a;
import ax.S0.C0969b;
import ax.S0.C0992z;
import ax.S0.InterfaceC0975h;
import ax.S0.d0;
import ax.U0.z;
import ax.m1.e;
import ax.q7.t;
import ax.r7.AbstractC2962A;
import ax.r7.AbstractC2991z;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements e, z {
    public static final AbstractC2991z<Long> r = AbstractC2991z.D(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final AbstractC2991z<Long> s = AbstractC2991z.D(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final AbstractC2991z<Long> t = AbstractC2991z.D(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final AbstractC2991z<Long> u = AbstractC2991z.D(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final AbstractC2991z<Long> v = AbstractC2991z.D(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final AbstractC2991z<Long> w = AbstractC2991z.D(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    @SuppressLint({"NonFinalStaticField", "StaticFieldLeak"})
    private static j x;
    private final Context a;
    private final AbstractC2962A<Integer, Long> b;
    private final e.a.C0368a c;
    private final InterfaceC0975h d;
    private final boolean e;
    private final s f;
    private int g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private int n;
    private boolean o;
    private int p;
    private String q;

    public static final class b {
        private final Context a;
        private final Map<Integer, Long> b;
        private int c;
        private InterfaceC0975h d;
        private boolean e;

        public b(Context context) {
            this.a = context == null ? null : context.getApplicationContext();
            this.c = 2000;
            this.d = InterfaceC0975h.a;
            this.e = true;
            HashMap hashMap = new HashMap(8);
            this.b = hashMap;
            hashMap.put(0, 1000000L);
            hashMap.put(2, -9223372036854775807L);
            hashMap.put(3, -9223372036854775807L);
            hashMap.put(4, -9223372036854775807L);
            hashMap.put(5, -9223372036854775807L);
            hashMap.put(10, -9223372036854775807L);
            hashMap.put(9, -9223372036854775807L);
            hashMap.put(7, -9223372036854775807L);
        }

        public j a() {
            return new j(this.a, this.b, this.c, this.d, this.e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1041:0x0cd6, code lost:
    
        if (r8.equals("AI") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int[] k(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.m1.j.k(java.lang.String):int[]");
    }

    private long l(int i) {
        Long l = this.b.get(Integer.valueOf(i));
        if (l == null) {
            l = this.b.get(0);
        } else if (l.longValue() == -9223372036854775807L) {
            l = Long.valueOf(m(this.q, i));
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private static long m(String str, int i) {
        int[] k = k(t.d(str));
        if (i != 2) {
            if (i == 3) {
                return s.get(k[1]).longValue();
            }
            if (i == 4) {
                return t.get(k[2]).longValue();
            }
            if (i == 5) {
                return u.get(k[3]).longValue();
            }
            if (i != 7) {
                if (i == 9) {
                    return w.get(k[5]).longValue();
                }
                if (i != 10) {
                    return 1000000L;
                }
                return v.get(k[4]).longValue();
            }
        }
        return r.get(k[0]).longValue();
    }

    public static synchronized j n(Context context) {
        j jVar;
        synchronized (j.class) {
            try {
                if (x == null) {
                    x = new b(context).a();
                }
                jVar = x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    private static boolean o(ax.U0.k kVar, boolean z) {
        return z && !kVar.d(8);
    }

    private void p(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        this.c.c(i, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q(int i) {
        Throwable th;
        try {
            try {
                int i2 = this.n;
                if (i2 != 0) {
                    try {
                        if (!this.e) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (this.o) {
                    i = this.p;
                }
                if (i2 != i || this.q == null) {
                    this.n = i;
                    if (i == 1 || i == 0 || i == 8) {
                        return;
                    }
                    if (this.q == null) {
                        this.q = d0.U(this.a);
                    }
                    this.l = l(i);
                    long b2 = this.d.b();
                    p(this.g > 0 ? (int) (b2 - this.h) : 0, this.i, this.l);
                    this.h = b2;
                    this.i = 0L;
                    this.k = 0L;
                    this.j = 0L;
                    this.f.g();
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // ax.m1.e
    public /* synthetic */ long a() {
        return c.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r10.k >= 524288) goto L22;
     */
    @Override // ax.U0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void b(ax.U0.g r11, ax.U0.k r12, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = o(r12, r13)     // Catch: java.lang.Throwable -> L73
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.g     // Catch: java.lang.Throwable -> L73
            r12 = 1
            if (r11 <= 0) goto L10
            r11 = 1
            goto L11
        L10:
            r11 = 0
        L11:
            ax.S0.C0968a.g(r11)     // Catch: java.lang.Throwable -> L73
            ax.S0.h r11 = r10.d     // Catch: java.lang.Throwable -> L73
            long r0 = r11.b()     // Catch: java.lang.Throwable -> L73
            long r2 = r10.h     // Catch: java.lang.Throwable -> L73
            long r2 = r0 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L73
            long r2 = r10.j     // Catch: java.lang.Throwable -> L73
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L73
            long r2 = r2 + r6
            r10.j = r2     // Catch: java.lang.Throwable -> L73
            long r2 = r10.k     // Catch: java.lang.Throwable -> L73
            long r6 = r10.i     // Catch: java.lang.Throwable -> L73
            long r2 = r2 + r6
            r10.k = r2     // Catch: java.lang.Throwable -> L73
            if (r5 <= 0) goto L76
            float r11 = (float) r6     // Catch: java.lang.Throwable -> L73
            r13 = 1174011904(0x45fa0000, float:8000.0)
            float r11 = r11 * r13
            float r13 = (float) r5     // Catch: java.lang.Throwable -> L73
            float r11 = r11 / r13
            ax.m1.s r13 = r10.f     // Catch: java.lang.Throwable -> L73
            double r2 = (double) r6     // Catch: java.lang.Throwable -> L73
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L73
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L73
            r13.c(r2, r11)     // Catch: java.lang.Throwable -> L73
            long r2 = r10.j     // Catch: java.lang.Throwable -> L73
            r6 = 2000(0x7d0, double:9.88E-321)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 >= 0) goto L56
            long r2 = r10.k     // Catch: java.lang.Throwable -> L52
            r6 = 524288(0x80000, double:2.590327E-318)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 < 0) goto L61
            goto L56
        L52:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7e
        L56:
            ax.m1.s r11 = r10.f     // Catch: java.lang.Throwable -> L73
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11.f(r13)     // Catch: java.lang.Throwable -> L73
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L73
            r10.l = r2     // Catch: java.lang.Throwable -> L73
        L61:
            long r6 = r10.i     // Catch: java.lang.Throwable -> L73
            long r8 = r10.l     // Catch: java.lang.Throwable -> L73
            r4 = r10
            r4.p(r5, r6, r8)     // Catch: java.lang.Throwable -> L70
            r4.h = r0     // Catch: java.lang.Throwable -> L70
            r0 = 0
            r4.i = r0     // Catch: java.lang.Throwable -> L70
            goto L77
        L70:
            r0 = move-exception
        L71:
            r11 = r0
            goto L7e
        L73:
            r0 = move-exception
            r4 = r10
            goto L71
        L76:
            r4 = r10
        L77:
            int r11 = r4.g     // Catch: java.lang.Throwable -> L70
            int r11 = r11 - r12
            r4.g = r11     // Catch: java.lang.Throwable -> L70
            monitor-exit(r10)
            return
        L7e:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L70
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.m1.j.b(ax.U0.g, ax.U0.k, boolean):void");
    }

    @Override // ax.U0.z
    public synchronized void c(ax.U0.g gVar, ax.U0.k kVar, boolean z) {
        try {
            if (o(kVar, z)) {
                if (this.g == 0) {
                    this.h = this.d.b();
                }
                this.g++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ax.m1.e
    public void e(Handler handler, e.a aVar) {
        C0968a.e(handler);
        C0968a.e(aVar);
        this.c.b(handler, aVar);
    }

    @Override // ax.m1.e
    public synchronized long f() {
        return this.l;
    }

    @Override // ax.m1.e
    public void g(e.a aVar) {
        this.c.d(aVar);
    }

    @Override // ax.U0.z
    public synchronized void h(ax.U0.g gVar, ax.U0.k kVar, boolean z, int i) {
        if (o(kVar, z)) {
            this.i += i;
        }
    }

    private j(Context context, Map<Integer, Long> map, int i, InterfaceC0975h interfaceC0975h, boolean z) {
        this.a = context == null ? null : context.getApplicationContext();
        this.b = AbstractC2962A.c(map);
        this.c = new e.a.C0368a();
        this.f = new s(i);
        this.d = interfaceC0975h;
        this.e = z;
        if (context == null) {
            this.n = 0;
            this.l = 1000000L;
            return;
        }
        C0992z e = C0992z.e(context);
        int g = e.g();
        this.n = g;
        this.l = l(g);
        e.k(new C0992z.c() { // from class: ax.m1.i
            @Override // ax.S0.C0992z.c
            public final void a(int i2) {
                j.this.q(i2);
            }
        }, C0969b.a());
    }

    @Override // ax.m1.e
    public z d() {
        return this;
    }

    @Override // ax.U0.z
    public void i(ax.U0.g gVar, ax.U0.k kVar, boolean z) {
    }
}
