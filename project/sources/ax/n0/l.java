package ax.n0;

import ax.Fb.p;
import ax.Qb.C0939i;
import ax.Qb.InterfaceC0959s0;
import ax.Qb.J;
import ax.Sb.f;
import ax.sb.t;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class l<T> {
    private final J a;
    private final p<T, ax.wb.e<? super t>, Object> b;
    private final ax.Sb.d<T> c;
    private final AtomicInteger d;

    static final class a extends ax.Gb.m implements ax.Fb.l<Throwable, t> {
        final /* synthetic */ l<T> c0;
        final /* synthetic */ p<T, Throwable, t> d0;
        final /* synthetic */ ax.Fb.l<Throwable, t> q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ax.Fb.l<? super Throwable, t> lVar, l<T> lVar2, p<? super T, ? super Throwable, t> pVar) {
            super(1);
            this.q = lVar;
            this.c0 = lVar2;
            this.d0 = pVar;
        }

        public final void a(Throwable th) {
            t tVar;
            this.q.invoke(th);
            ((l) this.c0).c.c(th);
            do {
                Object f = ax.Sb.f.f(((l) this.c0).c.b());
                if (f == null) {
                    tVar = null;
                } else {
                    this.d0.j(f, th);
                    tVar = t.a;
                }
            } while (tVar != null);
        }

        @Override // ax.Fb.l
        public /* bridge */ /* synthetic */ t invoke(Throwable th) {
            a(th);
            return t.a;
        }
    }

    @ax.yb.f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
    static final class b extends ax.yb.l implements p<J, ax.wb.e<? super t>, Object> {
        Object f0;
        int g0;
        final /* synthetic */ l<T> h0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l<T> lVar, ax.wb.e<? super b> eVar) {
            super(2, eVar);
            this.h0 = lVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
            return new b(this.h0, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
        
            if (r1.j(r6, r5) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
        
            if (r6 != r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005f -> B:6:0x0062). Please report as a decompilation issue!!! */
        @Override // ax.yb.AbstractC3520a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object p(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ax.xb.C3479b.c()
                int r1 = r5.g0
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                ax.sb.C3083o.b(r6)
                goto L62
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f0
                ax.Fb.p r1 = (ax.Fb.p) r1
                ax.sb.C3083o.b(r6)
                goto L56
            L22:
                ax.sb.C3083o.b(r6)
                ax.n0.l<T> r6 = r5.h0
                java.util.concurrent.atomic.AtomicInteger r6 = ax.n0.l.c(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L33
                r6 = 1
                goto L34
            L33:
                r6 = 0
            L34:
                if (r6 == 0) goto L71
            L36:
                ax.n0.l<T> r6 = r5.h0
                ax.Qb.J r6 = ax.n0.l.d(r6)
                ax.Qb.K.c(r6)
                ax.n0.l<T> r6 = r5.h0
                ax.Fb.p r1 = ax.n0.l.a(r6)
                ax.n0.l<T> r6 = r5.h0
                ax.Sb.d r6 = ax.n0.l.b(r6)
                r5.f0 = r1
                r5.g0 = r3
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L56
                goto L61
            L56:
                r4 = 0
                r5.f0 = r4
                r5.g0 = r2
                java.lang.Object r6 = r1.j(r6, r5)
                if (r6 != r0) goto L62
            L61:
                return r0
            L62:
                ax.n0.l<T> r6 = r5.h0
                java.util.concurrent.atomic.AtomicInteger r6 = ax.n0.l.c(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L36
                ax.sb.t r6 = ax.sb.t.a
                return r6
            L71:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.n0.l.b.p(java.lang.Object):java.lang.Object");
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(J j, ax.wb.e<? super t> eVar) {
            return ((b) a(j, eVar)).p(t.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(J j, ax.Fb.l<? super Throwable, t> lVar, p<? super T, ? super Throwable, t> pVar, p<? super T, ? super ax.wb.e<? super t>, ? extends Object> pVar2) {
        ax.Gb.l.f(j, "scope");
        ax.Gb.l.f(lVar, "onComplete");
        ax.Gb.l.f(pVar, "onUndeliveredElement");
        ax.Gb.l.f(pVar2, "consumeMessage");
        this.a = j;
        this.b = pVar2;
        this.c = ax.Sb.e.b(SubsamplingScaleImageView.TILE_SIZE_AUTO, null, null, 6, null);
        this.d = new AtomicInteger(0);
        InterfaceC0959s0 interfaceC0959s0 = (InterfaceC0959s0) j.h().a(InterfaceC0959s0.c);
        if (interfaceC0959s0 == null) {
            return;
        }
        interfaceC0959s0.F(new a(lVar, this, pVar));
    }

    public final void e(T t) {
        Object d = this.c.d(t);
        if (d instanceof f.a) {
            Throwable e = ax.Sb.f.e(d);
            if (e != null) {
                throw e;
            }
            throw new ax.Sb.j("Channel was closed normally");
        }
        if (!ax.Sb.f.i(d)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.d.getAndIncrement() == 0) {
            C0939i.d(this.a, null, null, new b(this, null), 3, null);
        }
    }
}
