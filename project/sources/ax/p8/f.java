package ax.p8;

import android.content.Context;
import android.util.Log;
import ax.Fb.l;
import ax.Gb.m;
import ax.Gb.r;
import ax.Gb.w;
import ax.Pb.a;
import ax.n0.C2567a;
import ax.n8.C2599b;
import ax.n8.C2620w;
import ax.n8.C2621x;
import ax.o0.C2655b;
import ax.p0.C2750a;
import ax.q0.AbstractC2835d;
import ax.q0.C2836e;
import ax.wb.i;
import ax.x7.C3468c;
import ax.yb.AbstractC3523d;

/* loaded from: classes3.dex */
public final class f {
    public static final b c = new b(null);
    private static final ax.Ib.a<Context, ax.n0.f<AbstractC2835d>> d = C2750a.b(C2621x.a.b(), new C2655b(a.q), null, null, 12, null);
    private final h a;
    private final h b;

    static final class a extends m implements l<C2567a, AbstractC2835d> {
        public static final a q = new a();

        a() {
            super(1);
        }

        @Override // ax.Fb.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC2835d invoke(C2567a c2567a) {
            ax.Gb.l.f(c2567a, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + C2620w.a.e() + '.', c2567a);
            return C2836e.a();
        }
    }

    public static final class b {
        static final /* synthetic */ ax.Mb.g<Object>[] a = {w.e(new r(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ b(ax.Gb.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ax.n0.f<AbstractC2835d> b(Context context) {
            return (ax.n0.f) f.d.a(context, a[0]);
        }

        public final f c() {
            Object j = ax.x7.m.a(C3468c.a).j(f.class);
            ax.Gb.l.e(j, "Firebase.app[SessionsSettings::class.java]");
            return (f) j;
        }

        private b() {
        }
    }

    @ax.yb.f(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {138, 139}, m = "updateSettings")
    static final class c extends AbstractC3523d {
        Object e0;
        /* synthetic */ Object f0;
        int h0;

        c(ax.wb.e<? super c> eVar) {
            super(eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.f0 = obj;
            this.h0 |= Integer.MIN_VALUE;
            return f.this.g(this);
        }
    }

    public f(h hVar, h hVar2) {
        ax.Gb.l.f(hVar, "localOverrideSettings");
        ax.Gb.l.f(hVar2, "remoteSettings");
        this.a = hVar;
        this.b = hVar2;
    }

    private final boolean e(double d2) {
        return 0.0d <= d2 && d2 <= 1.0d;
    }

    private final boolean f(long j) {
        return ax.Pb.a.L(j) && ax.Pb.a.G(j);
    }

    public final double b() {
        Double d2 = this.a.d();
        if (d2 != null) {
            double doubleValue = d2.doubleValue();
            if (e(doubleValue)) {
                return doubleValue;
            }
        }
        Double d3 = this.b.d();
        if (d3 == null) {
            return 1.0d;
        }
        double doubleValue2 = d3.doubleValue();
        if (e(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        ax.Pb.a b2 = this.a.b();
        if (b2 != null) {
            long P = b2.P();
            if (f(P)) {
                return P;
            }
        }
        ax.Pb.a b3 = this.b.b();
        if (b3 != null) {
            long P2 = b3.P();
            if (f(P2)) {
                return P2;
            }
        }
        a.C0172a c0172a = ax.Pb.a.c0;
        return ax.Pb.c.h(30, ax.Pb.d.g0);
    }

    public final boolean d() {
        Boolean a2 = this.a.a();
        if (a2 != null) {
            return a2.booleanValue();
        }
        Boolean a3 = this.b.a();
        if (a3 != null) {
            return a3.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r6.c(r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(ax.wb.e<? super ax.sb.t> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ax.p8.f.c
            if (r0 == 0) goto L13
            r0 = r6
            ax.p8.f$c r0 = (ax.p8.f.c) r0
            int r1 = r0.h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h0 = r1
            goto L18
        L13:
            ax.p8.f$c r0 = new ax.p8.f$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.h0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ax.sb.C3083o.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.e0
            ax.p8.f r2 = (ax.p8.f) r2
            ax.sb.C3083o.b(r6)
            goto L4d
        L3c:
            ax.sb.C3083o.b(r6)
            ax.p8.h r6 = r5.a
            r0.e0 = r5
            r0.h0 = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L4c
            goto L5a
        L4c:
            r2 = r5
        L4d:
            ax.p8.h r6 = r2.b
            r2 = 0
            r0.e0 = r2
            r0.h0 = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            ax.sb.t r6 = ax.sb.t.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.p8.f.g(ax.wb.e):java.lang.Object");
    }

    private f(Context context, i iVar, i iVar2, ax.b8.e eVar, C2599b c2599b) {
        this(new ax.p8.b(context), new ax.p8.c(iVar2, eVar, c2599b, new d(c2599b, iVar, null, 4, null), c.b(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(ax.x7.C3471f r8, ax.wb.i r9, ax.wb.i r10, ax.b8.e r11) {
        /*
            r7 = this;
            java.lang.String r0 = "firebaseApp"
            ax.Gb.l.f(r8, r0)
            java.lang.String r0 = "blockingDispatcher"
            ax.Gb.l.f(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            ax.Gb.l.f(r10, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            ax.Gb.l.f(r11, r0)
            android.content.Context r2 = r8.k()
            java.lang.String r0 = "firebaseApp.applicationContext"
            ax.Gb.l.e(r2, r0)
            ax.n8.B r0 = ax.n8.C2588B.a
            ax.n8.b r6 = r0.b(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.p8.f.<init>(ax.x7.f, ax.wb.i, ax.wb.i, ax.b8.e):void");
    }
}
