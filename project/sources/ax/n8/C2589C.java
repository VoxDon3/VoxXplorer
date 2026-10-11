package ax.n8;

import android.util.Log;
import ax.Qb.C0939i;
import ax.x7.C3471f;
import ax.yb.AbstractC3523d;

/* renamed from: ax.n8.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2589C implements com.google.firebase.sessions.b {
    public static final a g = new a(null);
    private static final double h = Math.random();
    private final C3471f b;
    private final ax.b8.e c;
    private final ax.p8.f d;
    private final InterfaceC2606i e;
    private final ax.wb.i f;

    /* renamed from: ax.n8.C$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    @ax.yb.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {63, 64, 70}, m = "invokeSuspend")
    /* renamed from: ax.n8.C$b */
    static final class b extends ax.yb.l implements ax.Fb.p<ax.Qb.J, ax.wb.e<? super ax.sb.t>, Object> {
        Object f0;
        Object g0;
        Object h0;
        Object i0;
        Object j0;
        Object k0;
        int l0;
        final /* synthetic */ C2623z n0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2623z c2623z, ax.wb.e<? super b> eVar) {
            super(2, eVar);
            this.n0 = c2623z;
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<ax.sb.t> a(Object obj, ax.wb.e<?> eVar) {
            return C2589C.this.new b(this.n0, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        
            if (r9 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
        
            if (r9 == r0) goto L23;
         */
        @Override // ax.yb.AbstractC3520a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object p(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ax.xb.C3479b.c()
                int r1 = r8.l0
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L41
                if (r1 == r3) goto L3d
                if (r1 != r2) goto L35
                java.lang.Object r0 = r8.k0
                ax.p8.f r0 = (ax.p8.f) r0
                java.lang.Object r1 = r8.j0
                ax.n8.z r1 = (ax.n8.C2623z) r1
                java.lang.Object r2 = r8.i0
                ax.x7.f r2 = (ax.x7.C3471f) r2
                java.lang.Object r3 = r8.h0
                ax.n8.B r3 = (ax.n8.C2588B) r3
                java.lang.Object r4 = r8.g0
                ax.n8.C r4 = (ax.n8.C2589C) r4
                java.lang.Object r5 = r8.f0
                ax.n8.t r5 = (ax.n8.C2617t) r5
                ax.sb.C3083o.b(r9)
                r7 = r3
                r3 = r0
                r0 = r7
                r7 = r2
                r2 = r1
                r1 = r7
            L32:
                r7 = r4
                goto L9d
            L35:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L3d:
                ax.sb.C3083o.b(r9)
                goto L6c
            L41:
                ax.sb.C3083o.b(r9)
                goto L53
            L45:
                ax.sb.C3083o.b(r9)
                ax.n8.C r9 = ax.n8.C2589C.this
                r8.l0 = r4
                java.lang.Object r9 = ax.n8.C2589C.f(r9, r8)
                if (r9 != r0) goto L53
                goto L95
            L53:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto Lb0
                ax.n8.t$a r9 = ax.n8.C2617t.c
                ax.n8.C r1 = ax.n8.C2589C.this
                ax.b8.e r1 = ax.n8.C2589C.d(r1)
                r8.l0 = r3
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto L6c
                goto L95
            L6c:
                r5 = r9
                ax.n8.t r5 = (ax.n8.C2617t) r5
                ax.n8.C r4 = ax.n8.C2589C.this
                ax.n8.B r3 = ax.n8.C2588B.a
                ax.x7.f r9 = ax.n8.C2589C.c(r4)
                ax.n8.z r1 = r8.n0
                ax.n8.C r6 = ax.n8.C2589C.this
                ax.p8.f r6 = ax.n8.C2589C.e(r6)
                ax.o8.a r7 = ax.o8.C2732a.a
                r8.f0 = r5
                r8.g0 = r4
                r8.h0 = r3
                r8.i0 = r9
                r8.j0 = r1
                r8.k0 = r6
                r8.l0 = r2
                java.lang.Object r2 = r7.c(r8)
                if (r2 != r0) goto L96
            L95:
                return r0
            L96:
                r0 = r1
                r1 = r9
                r9 = r2
                r2 = r0
                r0 = r3
                r3 = r6
                goto L32
            L9d:
                r4 = r9
                java.util.Map r4 = (java.util.Map) r4
                r9 = r5
                java.lang.String r5 = r9.b()
                java.lang.String r6 = r9.a()
                ax.n8.A r9 = r0.a(r1, r2, r3, r4, r5, r6)
                ax.n8.C2589C.b(r7, r9)
            Lb0:
                ax.sb.t r9 = ax.sb.t.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.n8.C2589C.b.p(java.lang.Object):java.lang.Object");
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(ax.Qb.J j, ax.wb.e<? super ax.sb.t> eVar) {
            return ((b) a(j, eVar)).p(ax.sb.t.a);
        }
    }

    @ax.yb.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {94}, m = "shouldLogSession")
    /* renamed from: ax.n8.C$c */
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
            return C2589C.this.i(this);
        }
    }

    public C2589C(C3471f c3471f, ax.b8.e eVar, ax.p8.f fVar, InterfaceC2606i interfaceC2606i, ax.wb.i iVar) {
        ax.Gb.l.f(c3471f, "firebaseApp");
        ax.Gb.l.f(eVar, "firebaseInstallations");
        ax.Gb.l.f(fVar, "sessionSettings");
        ax.Gb.l.f(interfaceC2606i, "eventGDTLogger");
        ax.Gb.l.f(iVar, "backgroundDispatcher");
        this.b = c3471f;
        this.c = eVar;
        this.d = fVar;
        this.e = interfaceC2606i;
        this.f = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(C2587A c2587a) {
        try {
            this.e.a(c2587a);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + c2587a.c().f());
        } catch (RuntimeException e) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e);
        }
    }

    private final boolean h() {
        return h <= this.d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(ax.wb.e<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ax.n8.C2589C.c
            if (r0 == 0) goto L13
            r0 = r6
            ax.n8.C$c r0 = (ax.n8.C2589C.c) r0
            int r1 = r0.h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h0 = r1
            goto L18
        L13:
            ax.n8.C$c r0 = new ax.n8.C$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.h0
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.e0
            ax.n8.C r0 = (ax.n8.C2589C) r0
            ax.sb.C3083o.b(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            ax.sb.C3083o.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            ax.p8.f r6 = r5.d
            r0.e0 = r5
            r0.h0 = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            ax.p8.f r6 = r0.d
            boolean r6 = r6.d()
            r1 = 0
            if (r6 != 0) goto L60
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = ax.yb.C3521b.a(r1)
            return r6
        L60:
            boolean r6 = r0.h()
            if (r6 != 0) goto L70
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = ax.yb.C3521b.a(r1)
            return r6
        L70:
            java.lang.Boolean r6 = ax.yb.C3521b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n8.C2589C.i(ax.wb.e):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.b
    public void a(C2623z c2623z) {
        ax.Gb.l.f(c2623z, "sessionDetails");
        C0939i.d(ax.Qb.K.a(this.f), null, null, new b(c2623z, null), 3, null);
    }
}
