package ax.n8;

import android.content.Context;
import android.util.Log;
import ax.Qb.C0939i;
import ax.n0.C2567a;
import ax.o0.C2655b;
import ax.p0.C2750a;
import ax.q0.AbstractC2835d;
import ax.q0.C2832a;
import ax.q0.C2836e;
import ax.q0.C2837f;
import ax.q0.C2838g;
import ax.sb.C3083o;
import ax.xb.C3479b;
import ax.yb.AbstractC3523d;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ax.n8.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2622y implements com.google.firebase.sessions.a {
    private static final c f = new c(null);
    private static final ax.Ib.a<Context, ax.n0.f<AbstractC2835d>> g = C2750a.b(C2621x.a.a(), new C2655b(b.q), null, null, 12, null);
    private final Context b;
    private final ax.wb.i c;
    private final AtomicReference<C2610m> d;
    private final ax.Tb.b<C2610m> e;

    @ax.yb.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {82}, m = "invokeSuspend")
    /* renamed from: ax.n8.y$a */
    static final class a extends ax.yb.l implements ax.Fb.p<ax.Qb.J, ax.wb.e<? super ax.sb.t>, Object> {
        int f0;

        /* renamed from: ax.n8.y$a$a, reason: collision with other inner class name */
        static final class C0389a<T> implements ax.Tb.c {
            final /* synthetic */ C2622y q;

            C0389a(C2622y c2622y) {
                this.q = c2622y;
            }

            @Override // ax.Tb.c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object e(C2610m c2610m, ax.wb.e<? super ax.sb.t> eVar) {
                this.q.d.set(c2610m);
                return ax.sb.t.a;
            }
        }

        a(ax.wb.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<ax.sb.t> a(Object obj, ax.wb.e<?> eVar) {
            return C2622y.this.new a(eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            Object c = C3479b.c();
            int i = this.f0;
            if (i == 0) {
                C3083o.b(obj);
                ax.Tb.b bVar = C2622y.this.e;
                C0389a c0389a = new C0389a(C2622y.this);
                this.f0 = 1;
                if (bVar.a(c0389a, this) == c) {
                    return c;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C3083o.b(obj);
            }
            return ax.sb.t.a;
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(ax.Qb.J j, ax.wb.e<? super ax.sb.t> eVar) {
            return ((a) a(j, eVar)).p(ax.sb.t.a);
        }
    }

    /* renamed from: ax.n8.y$b */
    static final class b extends ax.Gb.m implements ax.Fb.l<C2567a, AbstractC2835d> {
        public static final b q = new b();

        b() {
            super(1);
        }

        @Override // ax.Fb.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC2835d invoke(C2567a c2567a) {
            ax.Gb.l.f(c2567a, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + C2620w.a.e() + '.', c2567a);
            return C2836e.a();
        }
    }

    /* renamed from: ax.n8.y$c */
    private static final class c {
        static final /* synthetic */ ax.Mb.g<Object>[] a = {ax.Gb.w.e(new ax.Gb.r(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ c(ax.Gb.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ax.n0.f<AbstractC2835d> b(Context context) {
            return (ax.n0.f) C2622y.g.a(context, a[0]);
        }

        private c() {
        }
    }

    /* renamed from: ax.n8.y$d */
    private static final class d {
        public static final d a = new d();
        private static final AbstractC2835d.a<String> b = C2837f.f("session_id");

        private d() {
        }

        public final AbstractC2835d.a<String> a() {
            return b;
        }
    }

    @ax.yb.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {76}, m = "invokeSuspend")
    /* renamed from: ax.n8.y$e */
    static final class e extends ax.yb.l implements ax.Fb.q<ax.Tb.c<? super AbstractC2835d>, Throwable, ax.wb.e<? super ax.sb.t>, Object> {
        int f0;
        private /* synthetic */ Object g0;
        /* synthetic */ Object h0;

        e(ax.wb.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            Object c = C3479b.c();
            int i = this.f0;
            if (i == 0) {
                C3083o.b(obj);
                ax.Tb.c cVar = (ax.Tb.c) this.g0;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.h0);
                AbstractC2835d a = C2836e.a();
                this.g0 = null;
                this.f0 = 1;
                if (cVar.e(a, this) == c) {
                    return c;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C3083o.b(obj);
            }
            return ax.sb.t.a;
        }

        @Override // ax.Fb.q
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object c(ax.Tb.c<? super AbstractC2835d> cVar, Throwable th, ax.wb.e<? super ax.sb.t> eVar) {
            e eVar2 = new e(eVar);
            eVar2.g0 = cVar;
            eVar2.h0 = th;
            return eVar2.p(ax.sb.t.a);
        }
    }

    /* renamed from: ax.n8.y$f */
    public static final class f implements ax.Tb.b<C2610m> {
        final /* synthetic */ C2622y c0;
        final /* synthetic */ ax.Tb.b q;

        /* renamed from: ax.n8.y$f$a */
        public static final class a<T> implements ax.Tb.c {
            final /* synthetic */ C2622y c0;
            final /* synthetic */ ax.Tb.c q;

            @ax.yb.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", l = {223}, m = "emit")
            /* renamed from: ax.n8.y$f$a$a, reason: collision with other inner class name */
            public static final class C0390a extends AbstractC3523d {
                /* synthetic */ Object e0;
                int f0;

                public C0390a(ax.wb.e eVar) {
                    super(eVar);
                }

                @Override // ax.yb.AbstractC3520a
                public final Object p(Object obj) {
                    this.e0 = obj;
                    this.f0 |= Integer.MIN_VALUE;
                    return a.this.e(null, this);
                }
            }

            public a(ax.Tb.c cVar, C2622y c2622y) {
                this.q = cVar;
                this.c0 = c2622y;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // ax.Tb.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object e(java.lang.Object r5, ax.wb.e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ax.n8.C2622y.f.a.C0390a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ax.n8.y$f$a$a r0 = (ax.n8.C2622y.f.a.C0390a) r0
                    int r1 = r0.f0
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f0 = r1
                    goto L18
                L13:
                    ax.n8.y$f$a$a r0 = new ax.n8.y$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.e0
                    java.lang.Object r1 = ax.xb.C3479b.c()
                    int r2 = r0.f0
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ax.sb.C3083o.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    ax.sb.C3083o.b(r6)
                    ax.Tb.c r6 = r4.q
                    ax.q0.d r5 = (ax.q0.AbstractC2835d) r5
                    ax.n8.y r2 = r4.c0
                    ax.n8.m r5 = ax.n8.C2622y.h(r2, r5)
                    r0.f0 = r3
                    java.lang.Object r5 = r6.e(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    ax.sb.t r5 = ax.sb.t.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ax.n8.C2622y.f.a.e(java.lang.Object, ax.wb.e):java.lang.Object");
            }
        }

        public f(ax.Tb.b bVar, C2622y c2622y) {
            this.q = bVar;
            this.c0 = c2622y;
        }

        @Override // ax.Tb.b
        public Object a(ax.Tb.c<? super C2610m> cVar, ax.wb.e eVar) {
            Object a2 = this.q.a(new a(cVar, this.c0), eVar);
            return a2 == C3479b.c() ? a2 : ax.sb.t.a;
        }
    }

    @ax.yb.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {89}, m = "invokeSuspend")
    /* renamed from: ax.n8.y$g */
    static final class g extends ax.yb.l implements ax.Fb.p<ax.Qb.J, ax.wb.e<? super ax.sb.t>, Object> {
        int f0;
        final /* synthetic */ String h0;

        @ax.yb.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ax.n8.y$g$a */
        static final class a extends ax.yb.l implements ax.Fb.p<C2832a, ax.wb.e<? super ax.sb.t>, Object> {
            int f0;
            /* synthetic */ Object g0;
            final /* synthetic */ String h0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, ax.wb.e<? super a> eVar) {
                super(2, eVar);
                this.h0 = str;
            }

            @Override // ax.yb.AbstractC3520a
            public final ax.wb.e<ax.sb.t> a(Object obj, ax.wb.e<?> eVar) {
                a aVar = new a(this.h0, eVar);
                aVar.g0 = obj;
                return aVar;
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                C3479b.c();
                if (this.f0 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C3083o.b(obj);
                ((C2832a) this.g0).i(d.a.a(), this.h0);
                return ax.sb.t.a;
            }

            @Override // ax.Fb.p
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object j(C2832a c2832a, ax.wb.e<? super ax.sb.t> eVar) {
                return ((a) a(c2832a, eVar)).p(ax.sb.t.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, ax.wb.e<? super g> eVar) {
            super(2, eVar);
            this.h0 = str;
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<ax.sb.t> a(Object obj, ax.wb.e<?> eVar) {
            return C2622y.this.new g(this.h0, eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            Object c = C3479b.c();
            int i = this.f0;
            try {
                if (i == 0) {
                    C3083o.b(obj);
                    ax.n0.f b = C2622y.f.b(C2622y.this.b);
                    a aVar = new a(this.h0, null);
                    this.f0 = 1;
                    if (C2838g.a(b, aVar, this) == c) {
                        return c;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C3083o.b(obj);
                }
            } catch (IOException e) {
                Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e);
            }
            return ax.sb.t.a;
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(ax.Qb.J j, ax.wb.e<? super ax.sb.t> eVar) {
            return ((g) a(j, eVar)).p(ax.sb.t.a);
        }
    }

    public C2622y(Context context, ax.wb.i iVar) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(iVar, "backgroundDispatcher");
        this.b = context;
        this.c = iVar;
        this.d = new AtomicReference<>();
        this.e = new f(ax.Tb.d.a(f.b(context).b(), new e(null)), this);
        C0939i.d(ax.Qb.K.a(iVar), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2610m i(AbstractC2835d abstractC2835d) {
        return new C2610m((String) abstractC2835d.b(d.a.a()));
    }

    @Override // com.google.firebase.sessions.a
    public String a() {
        C2610m c2610m = this.d.get();
        if (c2610m != null) {
            return c2610m.a();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.a
    public void b(String str) {
        ax.Gb.l.f(str, "sessionId");
        C0939i.d(ax.Qb.K.a(this.c), null, null, new g(str, null), 3, null);
    }
}
