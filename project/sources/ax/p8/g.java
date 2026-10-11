package ax.p8;

import ax.Fb.p;
import ax.Qb.C0937h;
import ax.Qb.J;
import ax.q0.AbstractC2835d;
import ax.q0.C2832a;
import ax.q0.C2837f;
import ax.sb.C3083o;
import ax.sb.t;
import ax.xb.C3479b;
import ax.yb.AbstractC3523d;
import ax.yb.l;

/* loaded from: classes3.dex */
public final class g {
    private static final b c = new b(null);
    private static final AbstractC2835d.a<Boolean> d = C2837f.a("firebase_sessions_enabled");
    private static final AbstractC2835d.a<Double> e = C2837f.b("firebase_sessions_sampling_rate");
    private static final AbstractC2835d.a<Integer> f = C2837f.d("firebase_sessions_restart_timeout");
    private static final AbstractC2835d.a<Integer> g = C2837f.d("firebase_sessions_cache_duration");
    private static final AbstractC2835d.a<Long> h = C2837f.e("firebase_sessions_cache_updated_time");
    private final ax.n0.f<AbstractC2835d> a;
    private e b;

    @ax.yb.f(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {46}, m = "invokeSuspend")
    static final class a extends l implements p<J, ax.wb.e<? super t>, Object> {
        Object f0;
        int g0;

        a(ax.wb.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
            return g.this.new a(eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            g gVar;
            Object c = C3479b.c();
            int i = this.g0;
            if (i == 0) {
                C3083o.b(obj);
                g gVar2 = g.this;
                ax.Tb.b b = gVar2.a.b();
                this.f0 = gVar2;
                this.g0 = 1;
                Object f = ax.Tb.d.f(b, this);
                if (f == c) {
                    return c;
                }
                gVar = gVar2;
                obj = f;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (g) this.f0;
                C3083o.b(obj);
            }
            gVar.l(((AbstractC2835d) obj).d());
            return t.a;
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(J j, ax.wb.e<? super t> eVar) {
            return ((a) a(j, eVar)).p(t.a);
        }
    }

    private static final class b {
        public /* synthetic */ b(ax.Gb.g gVar) {
            this();
        }

        private b() {
        }
    }

    @ax.yb.f(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {119}, m = "updateConfigValue")
    static final class c<T> extends AbstractC3523d {
        /* synthetic */ Object e0;
        int g0;

        c(ax.wb.e<? super c> eVar) {
            super(eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.e0 = obj;
            this.g0 |= Integer.MIN_VALUE;
            return g.this.h(null, null, this);
        }
    }

    @ax.yb.f(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<C2832a, ax.wb.e<? super t>, Object> {
        int f0;
        /* synthetic */ Object g0;
        final /* synthetic */ T h0;
        final /* synthetic */ AbstractC2835d.a<T> i0;
        final /* synthetic */ g j0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(T t, AbstractC2835d.a<T> aVar, g gVar, ax.wb.e<? super d> eVar) {
            super(2, eVar);
            this.h0 = t;
            this.i0 = aVar;
            this.j0 = gVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
            d dVar = new d(this.h0, this.i0, this.j0, eVar);
            dVar.g0 = obj;
            return dVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            C3479b.c();
            if (this.f0 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C3083o.b(obj);
            C2832a c2832a = (C2832a) this.g0;
            T t = this.h0;
            if (t != 0) {
                c2832a.i(this.i0, t);
            } else {
                c2832a.h(this.i0);
            }
            this.j0.l(c2832a);
            return t.a;
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(C2832a c2832a, ax.wb.e<? super t> eVar) {
            return ((d) a(c2832a, eVar)).p(t.a);
        }
    }

    public g(ax.n0.f<AbstractC2835d> fVar) {
        ax.Gb.l.f(fVar, "dataStore");
        this.a = fVar;
        C0937h.b(null, new a(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object h(ax.q0.AbstractC2835d.a<T> r6, T r7, ax.wb.e<? super ax.sb.t> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ax.p8.g.c
            if (r0 == 0) goto L13
            r0 = r8
            ax.p8.g$c r0 = (ax.p8.g.c) r0
            int r1 = r0.g0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g0 = r1
            goto L18
        L13:
            ax.p8.g$c r0 = new ax.p8.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.e0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.g0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ax.sb.C3083o.b(r8)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            ax.sb.C3083o.b(r8)
            ax.n0.f<ax.q0.d> r8 = r5.a     // Catch: java.io.IOException -> L29
            ax.p8.g$d r2 = new ax.p8.g$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.g0 = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = ax.q0.C2838g.a(r8, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            ax.sb.t r6 = ax.sb.t.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.p8.g.h(ax.q0.d$a, java.lang.Object, ax.wb.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(AbstractC2835d abstractC2835d) {
        this.b = new e((Boolean) abstractC2835d.b(d), (Double) abstractC2835d.b(e), (Integer) abstractC2835d.b(f), (Integer) abstractC2835d.b(g), (Long) abstractC2835d.b(h));
    }

    public final boolean d() {
        e eVar = this.b;
        e eVar2 = null;
        if (eVar == null) {
            ax.Gb.l.t("sessionConfigs");
            eVar = null;
        }
        Long b2 = eVar.b();
        e eVar3 = this.b;
        if (eVar3 == null) {
            ax.Gb.l.t("sessionConfigs");
        } else {
            eVar2 = eVar3;
        }
        Integer a2 = eVar2.a();
        return b2 == null || a2 == null || (System.currentTimeMillis() - b2.longValue()) / ((long) 1000) >= ((long) a2.intValue());
    }

    public final Integer e() {
        e eVar = this.b;
        if (eVar == null) {
            ax.Gb.l.t("sessionConfigs");
            eVar = null;
        }
        return eVar.d();
    }

    public final Double f() {
        e eVar = this.b;
        if (eVar == null) {
            ax.Gb.l.t("sessionConfigs");
            eVar = null;
        }
        return eVar.e();
    }

    public final Boolean g() {
        e eVar = this.b;
        if (eVar == null) {
            ax.Gb.l.t("sessionConfigs");
            eVar = null;
        }
        return eVar.c();
    }

    public final Object i(Double d2, ax.wb.e<? super t> eVar) {
        Object h2 = h(e, d2, eVar);
        return h2 == C3479b.c() ? h2 : t.a;
    }

    public final Object j(Integer num, ax.wb.e<? super t> eVar) {
        Object h2 = h(g, num, eVar);
        return h2 == C3479b.c() ? h2 : t.a;
    }

    public final Object k(Long l, ax.wb.e<? super t> eVar) {
        Object h2 = h(h, l, eVar);
        return h2 == C3479b.c() ? h2 : t.a;
    }

    public final Object m(Integer num, ax.wb.e<? super t> eVar) {
        Object h2 = h(f, num, eVar);
        return h2 == C3479b.c() ? h2 : t.a;
    }

    public final Object n(Boolean bool, ax.wb.e<? super t> eVar) {
        Object h2 = h(d, bool, eVar);
        return h2 == C3479b.c() ? h2 : t.a;
    }
}
