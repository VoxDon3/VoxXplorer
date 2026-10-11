package ax.n0;

import ax.Fb.p;
import ax.sb.C3083o;
import ax.sb.t;
import ax.xb.C3479b;
import ax.yb.AbstractC3523d;
import java.util.List;

/* loaded from: classes.dex */
public final class e<T> {
    public static final a a = new a(null);

    public static final class a {

        @ax.yb.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
        /* renamed from: ax.n0.e$a$a, reason: collision with other inner class name */
        static final class C0380a extends ax.yb.l implements p<i<T>, ax.wb.e<? super t>, Object> {
            int f0;
            /* synthetic */ Object g0;
            final /* synthetic */ List<d<T>> h0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0380a(List<? extends d<T>> list, ax.wb.e<? super C0380a> eVar) {
                super(2, eVar);
                this.h0 = list;
            }

            @Override // ax.yb.AbstractC3520a
            public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
                C0380a c0380a = new C0380a(this.h0, eVar);
                c0380a.g0 = obj;
                return c0380a;
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                Object c = C3479b.c();
                int i = this.f0;
                if (i == 0) {
                    C3083o.b(obj);
                    i iVar = (i) this.g0;
                    a aVar = e.a;
                    List<d<T>> list = this.h0;
                    this.f0 = 1;
                    if (aVar.c(list, iVar, this) == c) {
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
            public final Object j(i<T> iVar, ax.wb.e<? super t> eVar) {
                return ((C0380a) a(iVar, eVar)).p(t.a);
            }
        }

        @ax.yb.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
        static final class b<T> extends AbstractC3523d {
            Object e0;
            Object f0;
            /* synthetic */ Object g0;
            int i0;

            b(ax.wb.e<? super b> eVar) {
                super(eVar);
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                this.g0 = obj;
                this.i0 |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        @ax.yb.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
        static final class c extends ax.yb.l implements p<T, ax.wb.e<? super T>, Object> {
            Object f0;
            Object g0;
            Object h0;
            int i0;
            /* synthetic */ Object j0;
            final /* synthetic */ List<d<T>> k0;
            final /* synthetic */ List<ax.Fb.l<ax.wb.e<? super t>, Object>> l0;

            @ax.yb.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
            /* renamed from: ax.n0.e$a$c$a, reason: collision with other inner class name */
            static final class C0381a extends ax.yb.l implements ax.Fb.l<ax.wb.e<? super t>, Object> {
                int f0;
                final /* synthetic */ d<T> g0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0381a(d<T> dVar, ax.wb.e<? super C0381a> eVar) {
                    super(1, eVar);
                    this.g0 = dVar;
                }

                @Override // ax.yb.AbstractC3520a
                public final Object p(Object obj) {
                    Object c = C3479b.c();
                    int i = this.f0;
                    if (i == 0) {
                        C3083o.b(obj);
                        d<T> dVar = this.g0;
                        this.f0 = 1;
                        if (dVar.c(this) == c) {
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

                public final ax.wb.e<t> u(ax.wb.e<?> eVar) {
                    return new C0381a(this.g0, eVar);
                }

                @Override // ax.Fb.l
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public final Object invoke(ax.wb.e<? super t> eVar) {
                    return ((C0381a) u(eVar)).p(t.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends d<T>> list, List<ax.Fb.l<ax.wb.e<? super t>, Object>> list2, ax.wb.e<? super c> eVar) {
                super(2, eVar);
                this.k0 = list;
                this.l0 = list2;
            }

            @Override // ax.yb.AbstractC3520a
            public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
                c cVar = new c(this.k0, this.l0, eVar);
                cVar.j0 = obj;
                return cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x008e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
            @Override // ax.yb.AbstractC3520a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object p(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = ax.xb.C3479b.c()
                    int r1 = r9.i0
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f0
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.j0
                    java.util.List r4 = (java.util.List) r4
                    ax.sb.C3083o.b(r10)
                    goto L46
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.h0
                    java.lang.Object r4 = r9.g0
                    ax.n0.d r4 = (ax.n0.d) r4
                    java.lang.Object r5 = r9.f0
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.j0
                    java.util.List r6 = (java.util.List) r6
                    ax.sb.C3083o.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L68
                L37:
                    ax.sb.C3083o.b(r10)
                    java.lang.Object r10 = r9.j0
                    java.util.List<ax.n0.d<T>> r1 = r9.k0
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<ax.Fb.l<ax.wb.e<? super ax.sb.t>, java.lang.Object>> r4 = r9.l0
                    java.util.Iterator r1 = r1.iterator()
                L46:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8e
                    java.lang.Object r5 = r1.next()
                    ax.n0.d r5 = (ax.n0.d) r5
                    r9.j0 = r4
                    r9.f0 = r1
                    r9.g0 = r5
                    r9.h0 = r10
                    r9.i0 = r3
                    java.lang.Object r6 = r5.a(r10, r9)
                    if (r6 != r0) goto L63
                    goto L89
                L63:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L68:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8c
                    ax.n0.e$a$c$a r10 = new ax.n0.e$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.j0 = r4
                    r9.f0 = r5
                    r9.g0 = r7
                    r9.h0 = r7
                    r9.i0 = r2
                    java.lang.Object r10 = r6.b(r1, r9)
                    if (r10 != r0) goto L8a
                L89:
                    return r0
                L8a:
                    r1 = r5
                    goto L46
                L8c:
                    r10 = r1
                    goto L8a
                L8e:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: ax.n0.e.a.c.p(java.lang.Object):java.lang.Object");
            }

            @Override // ax.Fb.p
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object j(T t, ax.wb.e<? super T> eVar) {
                return ((c) a(t, eVar)).p(t.a);
            }
        }

        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:13:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008b -> B:13:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object c(java.util.List<? extends ax.n0.d<T>> r7, ax.n0.i<T> r8, ax.wb.e<? super ax.sb.t> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof ax.n0.e.a.b
                if (r0 == 0) goto L13
                r0 = r9
                ax.n0.e$a$b r0 = (ax.n0.e.a.b) r0
                int r1 = r0.i0
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.i0 = r1
                goto L18
            L13:
                ax.n0.e$a$b r0 = new ax.n0.e$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.g0
                java.lang.Object r1 = ax.xb.C3479b.c()
                int r2 = r0.i0
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f0
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.e0
                ax.Gb.v r8 = (ax.Gb.v) r8
                ax.sb.C3083o.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L6b
            L34:
                r9 = move-exception
                goto L84
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.e0
                java.util.List r7 = (java.util.List) r7
                ax.sb.C3083o.b(r9)
                goto L60
            L46:
                ax.sb.C3083o.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                ax.n0.e$a$c r2 = new ax.n0.e$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.e0 = r9
                r0.i0 = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                goto L83
            L5f:
                r7 = r9
            L60:
                ax.Gb.v r8 = new ax.Gb.v
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L6b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L96
                java.lang.Object r9 = r7.next()
                ax.Fb.l r9 = (ax.Fb.l) r9
                r0.e0 = r8     // Catch: java.lang.Throwable -> L34
                r0.f0 = r7     // Catch: java.lang.Throwable -> L34
                r0.i0 = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L6b
            L83:
                return r1
            L84:
                T r2 = r8.q
                if (r2 != 0) goto L8b
                r8.q = r9
                goto L6b
            L8b:
                ax.Gb.l.c(r2)
                T r2 = r8.q
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                ax.sb.C3069a.a(r2, r9)
                goto L6b
            L96:
                T r7 = r8.q
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9f
                ax.sb.t r7 = ax.sb.t.a
                return r7
            L9f:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.n0.e.a.c(java.util.List, ax.n0.i, ax.wb.e):java.lang.Object");
        }

        public final <T> p<i<T>, ax.wb.e<? super t>, Object> b(List<? extends d<T>> list) {
            ax.Gb.l.f(list, "migrations");
            return new C0380a(list, null);
        }

        private a() {
        }
    }
}
