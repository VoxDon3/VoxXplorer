package ax.n8;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import ax.Qb.C0939i;
import ax.x7.C3471f;

/* renamed from: ax.n8.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2609l {
    public static final b c = new b(null);
    private final C3471f a;
    private final ax.p8.f b;

    @ax.yb.f(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {45, 49}, m = "invokeSuspend")
    /* renamed from: ax.n8.l$a */
    static final class a extends ax.yb.l implements ax.Fb.p<ax.Qb.J, ax.wb.e<? super ax.sb.t>, Object> {
        int f0;
        final /* synthetic */ ax.wb.i h0;
        final /* synthetic */ InterfaceC2593G i0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ax.wb.i iVar, InterfaceC2593G interfaceC2593G, ax.wb.e<? super a> eVar) {
            super(2, eVar);
            this.h0 = iVar;
            this.i0 = interfaceC2593G;
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<ax.sb.t> a(Object obj, ax.wb.e<?> eVar) {
            return C2609l.this.new a(this.h0, this.i0, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        
            if (r6.g(r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x002b, code lost:
        
            if (r6 == r0) goto L25;
         */
        @Override // ax.yb.AbstractC3520a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object p(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ax.xb.C3479b.c()
                int r1 = r5.f0
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                ax.sb.C3083o.b(r6)
                goto L69
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                ax.sb.C3083o.b(r6)
                goto L2e
            L20:
                ax.sb.C3083o.b(r6)
                ax.o8.a r6 = ax.o8.C2732a.a
                r5.f0 = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L2e
                goto L68
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L44
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L44
                goto L9b
            L44:
                java.util.Iterator r6 = r6.iterator()
            L48:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L9b
                java.lang.Object r1 = r6.next()
                ax.o8.b r1 = (ax.o8.InterfaceC2733b) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L48
                ax.n8.l r6 = ax.n8.C2609l.this
                ax.p8.f r6 = ax.n8.C2609l.b(r6)
                r5.f0 = r3
                java.lang.Object r6 = r6.g(r5)
                if (r6 != r0) goto L69
            L68:
                return r0
            L69:
                ax.n8.l r6 = ax.n8.C2609l.this
                ax.p8.f r6 = ax.n8.C2609l.b(r6)
                boolean r6 = r6.d()
                if (r6 != 0) goto L7b
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
                goto La0
            L7b:
                ax.n8.E r6 = new ax.n8.E
                ax.wb.i r0 = r5.h0
                r6.<init>(r0)
                ax.n8.G r0 = r5.i0
                r6.i(r0)
                ax.n8.I r0 = ax.n8.C2595I.a
                r0.a(r6)
                ax.n8.l r6 = ax.n8.C2609l.this
                ax.x7.f r6 = ax.n8.C2609l.a(r6)
                ax.n8.k r0 = new ax.n8.k
                r0.<init>()
                r6.h(r0)
                goto La0
            L9b:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
            La0:
                ax.sb.t r6 = ax.sb.t.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.n8.C2609l.a.p(java.lang.Object):java.lang.Object");
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(ax.Qb.J j, ax.wb.e<? super ax.sb.t> eVar) {
            return ((a) a(j, eVar)).p(ax.sb.t.a);
        }
    }

    /* renamed from: ax.n8.l$b */
    public static final class b {
        public /* synthetic */ b(ax.Gb.g gVar) {
            this();
        }

        private b() {
        }
    }

    public C2609l(C3471f c3471f, ax.p8.f fVar, ax.wb.i iVar, InterfaceC2593G interfaceC2593G) {
        ax.Gb.l.f(c3471f, "firebaseApp");
        ax.Gb.l.f(fVar, "settings");
        ax.Gb.l.f(iVar, "backgroundDispatcher");
        ax.Gb.l.f(interfaceC2593G, "lifecycleServiceBinder");
        this.a = c3471f;
        this.b = fVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = c3471f.k().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(C2595I.a);
            C0939i.d(ax.Qb.K.a(iVar), null, null, new a(iVar, interfaceC2593G, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
