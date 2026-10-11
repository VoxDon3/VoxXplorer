package ax.n0;

import ax.Gb.v;
import ax.Qb.C0963w;
import ax.Qb.InterfaceC0961u;
import ax.Qb.J;
import ax.sb.C3077i;
import ax.sb.C3083o;
import ax.sb.InterfaceC3076h;
import ax.sb.t;
import ax.tb.C3139o;
import ax.xb.C3479b;
import ax.yb.AbstractC3523d;
import ax.yb.C3521b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class m<T> implements ax.n0.f<T> {
    public static final a k = new a(null);
    private static final Set<String> l = new LinkedHashSet();
    private static final Object m = new Object();
    private final ax.Fb.a<File> a;
    private final ax.n0.k<T> b;
    private final InterfaceC2568b<T> c;
    private final J d;
    private final ax.Tb.b<T> e;
    private final String f;
    private final InterfaceC3076h g;
    private final ax.Tb.k<ax.n0.n<T>> h;
    private List<? extends ax.Fb.p<? super ax.n0.i<T>, ? super ax.wb.e<? super t>, ? extends Object>> i;
    private final ax.n0.l<b<T>> j;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        public final Set<String> a() {
            return m.l;
        }

        public final Object b() {
            return m.m;
        }

        private a() {
        }
    }

    private static abstract class b<T> {

        public static final class a<T> extends b<T> {
            private final ax.n0.n<T> a;

            public a(ax.n0.n<T> nVar) {
                super(null);
                this.a = nVar;
            }

            public ax.n0.n<T> a() {
                return this.a;
            }
        }

        /* renamed from: ax.n0.m$b$b, reason: collision with other inner class name */
        public static final class C0382b<T> extends b<T> {
            private final ax.Fb.p<T, ax.wb.e<? super T>, Object> a;
            private final InterfaceC0961u<T> b;
            private final ax.n0.n<T> c;
            private final ax.wb.i d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0382b(ax.Fb.p<? super T, ? super ax.wb.e<? super T>, ? extends Object> pVar, InterfaceC0961u<T> interfaceC0961u, ax.n0.n<T> nVar, ax.wb.i iVar) {
                super(null);
                ax.Gb.l.f(pVar, "transform");
                ax.Gb.l.f(interfaceC0961u, "ack");
                ax.Gb.l.f(iVar, "callerContext");
                this.a = pVar;
                this.b = interfaceC0961u;
                this.c = nVar;
                this.d = iVar;
            }

            public final InterfaceC0961u<T> a() {
                return this.b;
            }

            public final ax.wb.i b() {
                return this.d;
            }

            public ax.n0.n<T> c() {
                return this.c;
            }

            public final ax.Fb.p<T, ax.wb.e<? super T>, Object> d() {
                return this.a;
            }
        }

        public /* synthetic */ b(ax.Gb.g gVar) {
            this();
        }

        private b() {
        }
    }

    private static final class c extends OutputStream implements AutoCloseable {
        private final FileOutputStream q;

        public c(FileOutputStream fileOutputStream) {
            ax.Gb.l.f(fileOutputStream, "fileOutputStream");
            this.q = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.q.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.q.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            ax.Gb.l.f(bArr, "b");
            this.q.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            ax.Gb.l.f(bArr, "bytes");
            this.q.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    static final class d extends ax.Gb.m implements ax.Fb.l<Throwable, t> {
        final /* synthetic */ m<T> q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m<T> mVar) {
            super(1);
            this.q = mVar;
        }

        public final void a(Throwable th) {
            if (th != null) {
                ((m) this.q).h.setValue(new ax.n0.h(th));
            }
            a aVar = m.k;
            Object b = aVar.b();
            m<T> mVar = this.q;
            synchronized (b) {
                aVar.a().remove(mVar.r().getAbsolutePath());
                t tVar = t.a;
            }
        }

        @Override // ax.Fb.l
        public /* bridge */ /* synthetic */ t invoke(Throwable th) {
            a(th);
            return t.a;
        }
    }

    static final class e extends ax.Gb.m implements ax.Fb.p<b<T>, Throwable, t> {
        public static final e q = new e();

        e() {
            super(2);
        }

        public final void a(b<T> bVar, Throwable th) {
            ax.Gb.l.f(bVar, "msg");
            if (bVar instanceof b.C0382b) {
                InterfaceC0961u<T> a = ((b.C0382b) bVar).a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                a.o0(th);
            }
        }

        @Override // ax.Fb.p
        public /* bridge */ /* synthetic */ t j(Object obj, Throwable th) {
            a((b) obj, th);
            return t.a;
        }
    }

    @ax.yb.f(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
    static final class f extends ax.yb.l implements ax.Fb.p<b<T>, ax.wb.e<? super t>, Object> {
        int f0;
        /* synthetic */ Object g0;
        final /* synthetic */ m<T> h0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m<T> mVar, ax.wb.e<? super f> eVar) {
            super(2, eVar);
            this.h0 = mVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
            f fVar = new f(this.h0, eVar);
            fVar.g0 = obj;
            return fVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        
            if (r4.h0.s((ax.n0.m.b.a) r5, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        
            if (r4.h0.t((ax.n0.m.b.C0382b) r5, r4) == r0) goto L19;
         */
        @Override // ax.yb.AbstractC3520a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object p(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ax.xb.C3479b.c()
                int r1 = r4.f0
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                ax.sb.C3083o.b(r5)
                goto L44
            L1b:
                ax.sb.C3083o.b(r5)
                java.lang.Object r5 = r4.g0
                ax.n0.m$b r5 = (ax.n0.m.b) r5
                boolean r1 = r5 instanceof ax.n0.m.b.a
                if (r1 == 0) goto L33
                ax.n0.m<T> r1 = r4.h0
                ax.n0.m$b$a r5 = (ax.n0.m.b.a) r5
                r4.f0 = r3
                java.lang.Object r5 = ax.n0.m.i(r1, r5, r4)
                if (r5 != r0) goto L44
                goto L43
            L33:
                boolean r1 = r5 instanceof ax.n0.m.b.C0382b
                if (r1 == 0) goto L44
                ax.n0.m<T> r1 = r4.h0
                ax.n0.m$b$b r5 = (ax.n0.m.b.C0382b) r5
                r4.f0 = r2
                java.lang.Object r5 = ax.n0.m.j(r1, r5, r4)
                if (r5 != r0) goto L44
            L43:
                return r0
            L44:
                ax.sb.t r5 = ax.sb.t.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.n0.m.f.p(java.lang.Object):java.lang.Object");
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(b<T> bVar, ax.wb.e<? super t> eVar) {
            return ((f) a(bVar, eVar)).p(t.a);
        }
    }

    @ax.yb.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
    static final class g extends ax.yb.l implements ax.Fb.p<ax.Tb.c<? super T>, ax.wb.e<? super t>, Object> {
        int f0;
        private /* synthetic */ Object g0;
        final /* synthetic */ m<T> h0;

        @ax.yb.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
        static final class a extends ax.yb.l implements ax.Fb.p<ax.n0.n<T>, ax.wb.e<? super Boolean>, Object> {
            int f0;
            /* synthetic */ Object g0;
            final /* synthetic */ ax.n0.n<T> h0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ax.n0.n<T> nVar, ax.wb.e<? super a> eVar) {
                super(2, eVar);
                this.h0 = nVar;
            }

            @Override // ax.yb.AbstractC3520a
            public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
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
                ax.n0.n<T> nVar = (ax.n0.n) this.g0;
                ax.n0.n<T> nVar2 = this.h0;
                boolean z = false;
                if (!(nVar2 instanceof C2569c) && !(nVar2 instanceof ax.n0.h) && nVar == nVar2) {
                    z = true;
                }
                return C3521b.a(z);
            }

            @Override // ax.Fb.p
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object j(ax.n0.n<T> nVar, ax.wb.e<? super Boolean> eVar) {
                return ((a) a(nVar, eVar)).p(t.a);
            }
        }

        public static final class b implements ax.Tb.b<T> {
            final /* synthetic */ ax.Tb.b q;

            public static final class a implements ax.Tb.c<ax.n0.n<T>> {
                final /* synthetic */ ax.Tb.c q;

                @ax.yb.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
                /* renamed from: ax.n0.m$g$b$a$a, reason: collision with other inner class name */
                public static final class C0383a extends AbstractC3523d {
                    /* synthetic */ Object e0;
                    int f0;

                    public C0383a(ax.wb.e eVar) {
                        super(eVar);
                    }

                    @Override // ax.yb.AbstractC3520a
                    public final Object p(Object obj) {
                        this.e0 = obj;
                        this.f0 |= Integer.MIN_VALUE;
                        return a.this.e(null, this);
                    }
                }

                public a(ax.Tb.c cVar) {
                    this.q = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // ax.Tb.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object e(java.lang.Object r5, ax.wb.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof ax.n0.m.g.b.a.C0383a
                        if (r0 == 0) goto L13
                        r0 = r6
                        ax.n0.m$g$b$a$a r0 = (ax.n0.m.g.b.a.C0383a) r0
                        int r1 = r0.f0
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f0 = r1
                        goto L18
                    L13:
                        ax.n0.m$g$b$a$a r0 = new ax.n0.m$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.e0
                        java.lang.Object r1 = ax.xb.C3479b.c()
                        int r2 = r0.f0
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        ax.sb.C3083o.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        ax.sb.C3083o.b(r6)
                        ax.Tb.c r6 = r4.q
                        ax.n0.n r5 = (ax.n0.n) r5
                        boolean r2 = r5 instanceof ax.n0.j
                        if (r2 != 0) goto L6f
                        boolean r2 = r5 instanceof ax.n0.h
                        if (r2 != 0) goto L68
                        boolean r2 = r5 instanceof ax.n0.C2569c
                        if (r2 == 0) goto L56
                        ax.n0.c r5 = (ax.n0.C2569c) r5
                        java.lang.Object r5 = r5.b()
                        r0.f0 = r3
                        java.lang.Object r5 = r6.e(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        ax.sb.t r5 = ax.sb.t.a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof ax.n0.o
                        if (r5 == 0) goto L62
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L62:
                        ax.sb.l r5 = new ax.sb.l
                        r5.<init>()
                        throw r5
                    L68:
                        ax.n0.h r5 = (ax.n0.h) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L6f:
                        ax.n0.j r5 = (ax.n0.j) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ax.n0.m.g.b.a.e(java.lang.Object, ax.wb.e):java.lang.Object");
                }
            }

            public b(ax.Tb.b bVar) {
                this.q = bVar;
            }

            @Override // ax.Tb.b
            public Object a(ax.Tb.c cVar, ax.wb.e eVar) {
                Object a2 = this.q.a(new a(cVar), eVar);
                return a2 == C3479b.c() ? a2 : t.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m<T> mVar, ax.wb.e<? super g> eVar) {
            super(2, eVar);
            this.h0 = mVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
            g gVar = new g(this.h0, eVar);
            gVar.g0 = obj;
            return gVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            Object c = C3479b.c();
            int i = this.f0;
            if (i == 0) {
                C3083o.b(obj);
                ax.Tb.c cVar = (ax.Tb.c) this.g0;
                ax.n0.n nVar = (ax.n0.n) ((m) this.h0).h.getValue();
                if (!(nVar instanceof C2569c)) {
                    ((m) this.h0).j.e(new b.a(nVar));
                }
                b bVar = new b(ax.Tb.d.c(((m) this.h0).h, new a(nVar, null)));
                this.f0 = 1;
                if (ax.Tb.d.d(cVar, bVar, this) == c) {
                    return c;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C3083o.b(obj);
            }
            return t.a;
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(ax.Tb.c<? super T> cVar, ax.wb.e<? super t> eVar) {
            return ((g) a(cVar, eVar)).p(t.a);
        }
    }

    static final class h extends ax.Gb.m implements ax.Fb.a<File> {
        final /* synthetic */ m<T> q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(m<T> mVar) {
            super(0);
            this.q = mVar;
        }

        @Override // ax.Fb.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) ((m) this.q).a.invoke();
            String absolutePath = file.getAbsolutePath();
            a aVar = m.k;
            synchronized (aVar.b()) {
                if (aVar.a().contains(absolutePath)) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set<String> a = aVar.a();
                ax.Gb.l.e(absolutePath, "it");
                a.add(absolutePath);
            }
            return file;
        }
    }

    @ax.yb.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
    static final class i extends AbstractC3523d {
        Object e0;
        Object f0;
        Object g0;
        /* synthetic */ Object h0;
        final /* synthetic */ m<T> i0;
        int j0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(m<T> mVar, ax.wb.e<? super i> eVar) {
            super(eVar);
            this.i0 = mVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.h0 = obj;
            this.j0 |= Integer.MIN_VALUE;
            return this.i0.t(null, this);
        }
    }

    @ax.yb.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
    static final class j extends AbstractC3523d {
        Object e0;
        Object f0;
        Object g0;
        Object h0;
        Object i0;
        Object j0;
        /* synthetic */ Object k0;
        final /* synthetic */ m<T> l0;
        int m0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(m<T> mVar, ax.wb.e<? super j> eVar) {
            super(eVar);
            this.l0 = mVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.k0 = obj;
            this.m0 |= Integer.MIN_VALUE;
            return this.l0.u(this);
        }
    }

    public static final class k implements ax.n0.i<T> {
        final /* synthetic */ ax.Zb.a a;
        final /* synthetic */ ax.Gb.t b;
        final /* synthetic */ v<T> c;
        final /* synthetic */ m<T> d;

        @ax.yb.f(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
        static final class a extends AbstractC3523d {
            Object e0;
            Object f0;
            Object g0;
            Object h0;
            Object i0;
            /* synthetic */ Object j0;
            int l0;

            a(ax.wb.e<? super a> eVar) {
                super(eVar);
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                this.j0 = obj;
                this.l0 |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        k(ax.Zb.a aVar, ax.Gb.t tVar, v<T> vVar, m<T> mVar) {
            this.a = aVar;
            this.b = tVar;
            this.c = vVar;
            this.d = mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #1 {all -> 0x00d7, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00da, B:46:0x00e1), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00da A[Catch: all -> 0x00d7, TRY_ENTER, TryCatch #1 {all -> 0x00d7, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00da, B:46:0x00e1), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // ax.n0.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(ax.Fb.p<? super T, ? super ax.wb.e<? super T>, ? extends java.lang.Object> r10, ax.wb.e<? super T> r11) {
            /*
                Method dump skipped, instructions count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.n0.m.k.a(ax.Fb.p, ax.wb.e):java.lang.Object");
        }
    }

    @ax.yb.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    static final class l extends AbstractC3523d {
        Object e0;
        /* synthetic */ Object f0;
        final /* synthetic */ m<T> g0;
        int h0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(m<T> mVar, ax.wb.e<? super l> eVar) {
            super(eVar);
            this.g0 = mVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.f0 = obj;
            this.h0 |= Integer.MIN_VALUE;
            return this.g0.v(this);
        }
    }

    @ax.yb.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    /* renamed from: ax.n0.m$m, reason: collision with other inner class name */
    static final class C0384m extends AbstractC3523d {
        Object e0;
        /* synthetic */ Object f0;
        final /* synthetic */ m<T> g0;
        int h0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0384m(m<T> mVar, ax.wb.e<? super C0384m> eVar) {
            super(eVar);
            this.g0 = mVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.f0 = obj;
            this.h0 |= Integer.MIN_VALUE;
            return this.g0.w(this);
        }
    }

    @ax.yb.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    static final class n extends AbstractC3523d {
        Object e0;
        Object f0;
        Object g0;
        /* synthetic */ Object h0;
        final /* synthetic */ m<T> i0;
        int j0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(m<T> mVar, ax.wb.e<? super n> eVar) {
            super(eVar);
            this.i0 = mVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.h0 = obj;
            this.j0 |= Integer.MIN_VALUE;
            return this.i0.x(this);
        }
    }

    @ax.yb.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    static final class o extends AbstractC3523d {
        Object e0;
        Object f0;
        /* synthetic */ Object g0;
        final /* synthetic */ m<T> h0;
        int i0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(m<T> mVar, ax.wb.e<? super o> eVar) {
            super(eVar);
            this.h0 = mVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.g0 = obj;
            this.i0 |= Integer.MIN_VALUE;
            return this.h0.y(this);
        }
    }

    @ax.yb.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
    static final class p extends AbstractC3523d {
        Object e0;
        Object f0;
        Object g0;
        /* synthetic */ Object h0;
        final /* synthetic */ m<T> i0;
        int j0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(m<T> mVar, ax.wb.e<? super p> eVar) {
            super(eVar);
            this.i0 = mVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.h0 = obj;
            this.j0 |= Integer.MIN_VALUE;
            return this.i0.z(null, null, this);
        }
    }

    @ax.yb.f(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
    static final class q extends ax.yb.l implements ax.Fb.p<J, ax.wb.e<? super T>, Object> {
        int f0;
        final /* synthetic */ ax.Fb.p<T, ax.wb.e<? super T>, Object> g0;
        final /* synthetic */ T h0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(ax.Fb.p<? super T, ? super ax.wb.e<? super T>, ? extends Object> pVar, T t, ax.wb.e<? super q> eVar) {
            super(2, eVar);
            this.g0 = pVar;
            this.h0 = t;
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
            return new q(this.g0, this.h0, eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            Object c = C3479b.c();
            int i = this.f0;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C3083o.b(obj);
                return obj;
            }
            C3083o.b(obj);
            ax.Fb.p<T, ax.wb.e<? super T>, Object> pVar = this.g0;
            T t = this.h0;
            this.f0 = 1;
            Object j = pVar.j(t, this);
            return j == c ? c : j;
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(J j, ax.wb.e<? super T> eVar) {
            return ((q) a(j, eVar)).p(t.a);
        }
    }

    @ax.yb.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
    static final class r extends AbstractC3523d {
        Object e0;
        Object f0;
        Object g0;
        Object h0;
        Object i0;
        /* synthetic */ Object j0;
        final /* synthetic */ m<T> k0;
        int l0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(m<T> mVar, ax.wb.e<? super r> eVar) {
            super(eVar);
            this.k0 = mVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.j0 = obj;
            this.l0 |= Integer.MIN_VALUE;
            return this.k0.A(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(ax.Fb.a<? extends File> aVar, ax.n0.k<T> kVar, List<? extends ax.Fb.p<? super ax.n0.i<T>, ? super ax.wb.e<? super t>, ? extends Object>> list, InterfaceC2568b<T> interfaceC2568b, J j2) {
        ax.Gb.l.f(aVar, "produceFile");
        ax.Gb.l.f(kVar, "serializer");
        ax.Gb.l.f(list, "initTasksList");
        ax.Gb.l.f(interfaceC2568b, "corruptionHandler");
        ax.Gb.l.f(j2, "scope");
        this.a = aVar;
        this.b = kVar;
        this.c = interfaceC2568b;
        this.d = j2;
        this.e = ax.Tb.d.g(new g(this, null));
        this.f = ".tmp";
        this.g = C3077i.a(new h(this));
        this.h = ax.Tb.n.a(ax.n0.o.a);
        this.i = C3139o.V(list);
        this.j = new ax.n0.l<>(j2, new d(this), e.q, new f(this, null));
    }

    private final void q(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(ax.Gb.l.m("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File r() {
        return (File) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(b.a<T> aVar, ax.wb.e<? super t> eVar) {
        ax.n0.n<T> value = this.h.getValue();
        if (!(value instanceof C2569c)) {
            if (value instanceof ax.n0.j) {
                if (value == aVar.a()) {
                    Object w = w(eVar);
                    return w == C3479b.c() ? w : t.a;
                }
            } else {
                if (ax.Gb.l.a(value, ax.n0.o.a)) {
                    Object w2 = w(eVar);
                    return w2 == C3479b.c() ? w2 : t.a;
                }
                if (value instanceof ax.n0.h) {
                    throw new IllegalStateException("Can't read in final state.");
                }
            }
        }
        return t.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(5:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53)))|27)|24))|59|6|7|(0)(0)|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        if (r9 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0034, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r8v0, types: [ax.n0.m, ax.n0.m<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [ax.Qb.u] */
    /* JADX WARN: Type inference failed for: r9v3, types: [ax.Qb.u] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(ax.n0.m.b.C0382b<T> r9, ax.wb.e<? super ax.sb.t> r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n0.m.t(ax.n0.m$b$b, ax.wb.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(ax.wb.e<? super ax.sb.t> r14) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n0.m.u(ax.wb.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(ax.wb.e<? super ax.sb.t> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ax.n0.m.l
            if (r0 == 0) goto L13
            r0 = r5
            ax.n0.m$l r0 = (ax.n0.m.l) r0
            int r1 = r0.h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h0 = r1
            goto L18
        L13:
            ax.n0.m$l r0 = new ax.n0.m$l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.h0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.e0
            ax.n0.m r0 = (ax.n0.m) r0
            ax.sb.C3083o.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            ax.sb.C3083o.b(r5)
            r0.e0 = r4     // Catch: java.lang.Throwable -> L48
            r0.h0 = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.u(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            ax.sb.t r5 = ax.sb.t.a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            ax.Tb.k<ax.n0.n<T>> r0 = r0.h
            ax.n0.j r1 = new ax.n0.j
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n0.m.v(ax.wb.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(ax.wb.e<? super ax.sb.t> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ax.n0.m.C0384m
            if (r0 == 0) goto L13
            r0 = r5
            ax.n0.m$m r0 = (ax.n0.m.C0384m) r0
            int r1 = r0.h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h0 = r1
            goto L18
        L13:
            ax.n0.m$m r0 = new ax.n0.m$m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.h0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.e0
            ax.n0.m r0 = (ax.n0.m) r0
            ax.sb.C3083o.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            ax.sb.C3083o.b(r5)
            r0.e0 = r4     // Catch: java.lang.Throwable -> L45
            r0.h0 = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.u(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            ax.Tb.k<ax.n0.n<T>> r0 = r0.h
            ax.n0.j r1 = new ax.n0.j
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            ax.sb.t r5 = ax.sb.t.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n0.m.w(ax.wb.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v11, types: [ax.n0.m] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [ax.n0.m$n, ax.wb.e] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [ax.n0.m] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [ax.n0.k, ax.n0.k<T>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(ax.wb.e<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ax.n0.m.n
            if (r0 == 0) goto L13
            r0 = r6
            ax.n0.m$n r0 = (ax.n0.m.n) r0
            int r1 = r0.j0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j0 = r1
            goto L18
        L13:
            ax.n0.m$n r0 = new ax.n0.m$n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.h0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.j0
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.g0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f0
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.e0
            ax.n0.m r0 = (ax.n0.m) r0
            ax.sb.C3083o.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L5f
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            ax.sb.C3083o.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6d
            java.io.File r6 = r5.r()     // Catch: java.io.FileNotFoundException -> L6d
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6d
            ax.n0.k<T> r6 = r5.b     // Catch: java.lang.Throwable -> L65
            r0.e0 = r5     // Catch: java.lang.Throwable -> L65
            r0.f0 = r2     // Catch: java.lang.Throwable -> L65
            r4 = 0
            r0.g0 = r4     // Catch: java.lang.Throwable -> L65
            r0.j0 = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.c(r2, r0)     // Catch: java.lang.Throwable -> L65
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
            r1 = r4
        L5f:
            ax.Db.a.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L63
            return r6
        L63:
            r6 = move-exception
            goto L6f
        L65:
            r6 = move-exception
            r0 = r5
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            ax.Db.a.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L63
            throw r1     // Catch: java.io.FileNotFoundException -> L63
        L6d:
            r6 = move-exception
            r0 = r5
        L6f:
            java.io.File r1 = r0.r()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L80
            ax.n0.k<T> r6 = r0.b
            java.lang.Object r6 = r6.b()
            return r6
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n0.m.x(ax.wb.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(ax.wb.e<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ax.n0.m.o
            if (r0 == 0) goto L13
            r0 = r8
            ax.n0.m$o r0 = (ax.n0.m.o) r0
            int r1 = r0.i0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i0 = r1
            goto L18
        L13:
            ax.n0.m$o r0 = new ax.n0.m$o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.g0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.i0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f0
            java.lang.Object r0 = r0.e0
            ax.n0.a r0 = (ax.n0.C2567a) r0
            ax.sb.C3083o.b(r8)     // Catch: java.io.IOException -> L35
            return r1
        L35:
            r8 = move-exception
            goto L89
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f0
            ax.n0.a r2 = (ax.n0.C2567a) r2
            java.lang.Object r4 = r0.e0
            ax.n0.m r4 = (ax.n0.m) r4
            ax.sb.C3083o.b(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.e0
            ax.n0.m r2 = (ax.n0.m) r2
            ax.sb.C3083o.b(r8)     // Catch: ax.n0.C2567a -> L53
            return r8
        L53:
            r8 = move-exception
            goto L66
        L55:
            ax.sb.C3083o.b(r8)
            r0.e0 = r7     // Catch: ax.n0.C2567a -> L64
            r0.i0 = r5     // Catch: ax.n0.C2567a -> L64
            java.lang.Object r8 = r7.x(r0)     // Catch: ax.n0.C2567a -> L64
            if (r8 != r1) goto L63
            goto L85
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            ax.n0.b<T> r5 = r2.c
            r0.e0 = r2
            r0.f0 = r8
            r0.i0 = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L75
            goto L85
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.e0 = r2     // Catch: java.io.IOException -> L87
            r0.f0 = r8     // Catch: java.io.IOException -> L87
            r0.i0 = r3     // Catch: java.io.IOException -> L87
            java.lang.Object r0 = r4.A(r8, r0)     // Catch: java.io.IOException -> L87
            if (r0 != r1) goto L86
        L85:
            return r1
        L86:
            return r8
        L87:
            r8 = move-exception
            r0 = r2
        L89:
            ax.sb.C3069a.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n0.m.y(ax.wb.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(ax.Fb.p<? super T, ? super ax.wb.e<? super T>, ? extends java.lang.Object> r8, ax.wb.i r9, ax.wb.e<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ax.n0.m.p
            if (r0 == 0) goto L13
            r0 = r10
            ax.n0.m$p r0 = (ax.n0.m.p) r0
            int r1 = r0.j0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j0 = r1
            goto L18
        L13:
            ax.n0.m$p r0 = new ax.n0.m$p
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.h0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.j0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f0
            java.lang.Object r9 = r0.e0
            ax.n0.m r9 = (ax.n0.m) r9
            ax.sb.C3083o.b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.g0
            java.lang.Object r9 = r0.f0
            ax.n0.c r9 = (ax.n0.C2569c) r9
            java.lang.Object r2 = r0.e0
            ax.n0.m r2 = (ax.n0.m) r2
            ax.sb.C3083o.b(r10)
            goto L73
        L49:
            ax.sb.C3083o.b(r10)
            ax.Tb.k<ax.n0.n<T>> r10 = r7.h
            java.lang.Object r10 = r10.getValue()
            ax.n0.c r10 = (ax.n0.C2569c) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            ax.n0.m$q r6 = new ax.n0.m$q
            r6.<init>(r8, r2, r3)
            r0.e0 = r7
            r0.f0 = r10
            r0.g0 = r2
            r0.j0 = r5
            java.lang.Object r8 = ax.Qb.C0935g.g(r9, r6, r0)
            if (r8 != r1) goto L6f
            goto L8b
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.a()
            boolean r9 = ax.Gb.l.a(r8, r10)
            if (r9 == 0) goto L7d
            return r8
        L7d:
            r0.e0 = r2
            r0.f0 = r10
            r0.g0 = r3
            r0.j0 = r4
            java.lang.Object r8 = r2.A(r10, r0)
            if (r8 != r1) goto L8c
        L8b:
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            ax.Tb.k<ax.n0.n<T>> r9 = r9.h
            ax.n0.c r10 = new ax.n0.c
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n0.m.z(ax.Fb.p, ax.wb.i, ax.wb.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2 A[Catch: IOException -> 0x00be, TRY_ENTER, TryCatch #3 {IOException -> 0x00be, blocks: (B:14:0x0092, B:19:0x00a2, B:20:0x00bd, B:27:0x00c5, B:28:0x00c8, B:24:0x00c3), top: B:7:0x0021, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(T r8, ax.wb.e<? super ax.sb.t> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ax.n0.m.r
            if (r0 == 0) goto L13
            r0 = r9
            ax.n0.m$r r0 = (ax.n0.m.r) r0
            int r1 = r0.l0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l0 = r1
            goto L18
        L13:
            ax.n0.m$r r0 = new ax.n0.m$r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.j0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.l0
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.i0
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.h0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.g0
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f0
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.e0
            ax.n0.m r0 = (ax.n0.m) r0
            ax.sb.C3083o.b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r8 = move-exception
            goto Lc3
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            ax.sb.C3083o.b(r9)
            java.io.File r9 = r7.r()
            r7.q(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.r()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f
            java.lang.String r2 = ax.Gb.l.m(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc9
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc9
            ax.n0.k<T> r4 = r7.b     // Catch: java.lang.Throwable -> Lc1
            ax.n0.m$c r5 = new ax.n0.m$c     // Catch: java.lang.Throwable -> Lc1
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lc1
            r0.e0 = r7     // Catch: java.lang.Throwable -> Lc1
            r0.f0 = r9     // Catch: java.lang.Throwable -> Lc1
            r0.g0 = r2     // Catch: java.lang.Throwable -> Lc1
            r6 = 0
            r0.h0 = r6     // Catch: java.lang.Throwable -> Lc1
            r0.i0 = r2     // Catch: java.lang.Throwable -> Lc1
            r0.l0 = r3     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r8 = r4.a(r8, r5, r0)     // Catch: java.lang.Throwable -> Lc1
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r6
        L89:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L3d
            r8.sync()     // Catch: java.lang.Throwable -> L3d
            ax.sb.t r8 = ax.sb.t.a     // Catch: java.lang.Throwable -> L3d
            ax.Db.a.a(r2, r1)     // Catch: java.io.IOException -> Lbe
            java.io.File r8 = r0.r()     // Catch: java.io.IOException -> Lbe
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lbe
            if (r8 == 0) goto La2
            ax.sb.t r8 = ax.sb.t.a
            return r8
        La2:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lbe
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbe
            r9.<init>()     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            r9.append(r3)     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lbe
            r8.<init>(r9)     // Catch: java.io.IOException -> Lbe
            throw r8     // Catch: java.io.IOException -> Lbe
        Lbe:
            r8 = move-exception
            r9 = r3
            goto Lca
        Lc1:
            r8 = move-exception
            r3 = r9
        Lc3:
            throw r8     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r9 = move-exception
            ax.Db.a.a(r2, r8)     // Catch: java.io.IOException -> Lbe
            throw r9     // Catch: java.io.IOException -> Lbe
        Lc9:
            r8 = move-exception
        Lca:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Ld3
            r9.delete()
        Ld3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n0.m.A(java.lang.Object, ax.wb.e):java.lang.Object");
    }

    @Override // ax.n0.f
    public Object a(ax.Fb.p<? super T, ? super ax.wb.e<? super T>, ? extends Object> pVar, ax.wb.e<? super T> eVar) {
        InterfaceC0961u b2 = C0963w.b(null, 1, null);
        this.j.e(new b.C0382b(pVar, b2, this.h.getValue(), eVar.b()));
        return b2.T0(eVar);
    }

    @Override // ax.n0.f
    public ax.Tb.b<T> b() {
        return this.e;
    }
}
