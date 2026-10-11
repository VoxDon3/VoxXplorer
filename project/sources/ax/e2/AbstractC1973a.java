package ax.e2;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import ax.Fb.p;
import ax.Gb.g;
import ax.Qb.C0939i;
import ax.Qb.J;
import ax.Qb.K;
import ax.Qb.Q;
import ax.Qb.Y;
import ax.d2.C1883b;
import ax.f2.C2032a;
import ax.f2.n;
import ax.f2.o;
import ax.sb.C3083o;
import ax.sb.t;
import ax.v7.e;
import ax.xb.C3479b;
import ax.yb.l;

/* renamed from: ax.e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1973a {
    public static final b a = new b(null);

    /* renamed from: ax.e2.a$a, reason: collision with other inner class name */
    private static final class C0294a extends AbstractC1973a {
        private final n b;

        @ax.yb.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {122}, m = "invokeSuspend")
        /* renamed from: ax.e2.a$a$a, reason: collision with other inner class name */
        static final class C0295a extends l implements p<J, ax.wb.e<? super t>, Object> {
            int f0;

            C0295a(C2032a c2032a, ax.wb.e<? super C0295a> eVar) {
                super(2, eVar);
            }

            @Override // ax.yb.AbstractC3520a
            public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
                return C0294a.this.new C0295a(null, eVar);
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                Object c = C3479b.c();
                int i = this.f0;
                if (i == 0) {
                    C3083o.b(obj);
                    n nVar = C0294a.this.b;
                    this.f0 = 1;
                    if (nVar.a(null, this) == c) {
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
            public final Object j(J j, ax.wb.e<? super t> eVar) {
                return ((C0295a) a(j, eVar)).p(t.a);
            }
        }

        @ax.yb.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {169}, m = "invokeSuspend")
        /* renamed from: ax.e2.a$a$b */
        static final class b extends l implements p<J, ax.wb.e<? super Integer>, Object> {
            int f0;

            b(ax.wb.e<? super b> eVar) {
                super(2, eVar);
            }

            @Override // ax.yb.AbstractC3520a
            public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
                return C0294a.this.new b(eVar);
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
                n nVar = C0294a.this.b;
                this.f0 = 1;
                Object b = nVar.b(this);
                return b == c ? c : b;
            }

            @Override // ax.Fb.p
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object j(J j, ax.wb.e<? super Integer> eVar) {
                return ((b) a(j, eVar)).p(t.a);
            }
        }

        @ax.yb.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {133}, m = "invokeSuspend")
        /* renamed from: ax.e2.a$a$c */
        static final class c extends l implements p<J, ax.wb.e<? super t>, Object> {
            int f0;
            final /* synthetic */ Uri h0;
            final /* synthetic */ InputEvent i0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, ax.wb.e<? super c> eVar) {
                super(2, eVar);
                this.h0 = uri;
                this.i0 = inputEvent;
            }

            @Override // ax.yb.AbstractC3520a
            public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
                return C0294a.this.new c(this.h0, this.i0, eVar);
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                Object c = C3479b.c();
                int i = this.f0;
                if (i == 0) {
                    C3083o.b(obj);
                    n nVar = C0294a.this.b;
                    Uri uri = this.h0;
                    InputEvent inputEvent = this.i0;
                    this.f0 = 1;
                    if (nVar.c(uri, inputEvent, this) == c) {
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
            public final Object j(J j, ax.wb.e<? super t> eVar) {
                return ((c) a(j, eVar)).p(t.a);
            }
        }

        @ax.yb.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {141}, m = "invokeSuspend")
        /* renamed from: ax.e2.a$a$d */
        static final class d extends l implements p<J, ax.wb.e<? super t>, Object> {
            int f0;
            final /* synthetic */ Uri h0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Uri uri, ax.wb.e<? super d> eVar) {
                super(2, eVar);
                this.h0 = uri;
            }

            @Override // ax.yb.AbstractC3520a
            public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
                return C0294a.this.new d(this.h0, eVar);
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                Object c = C3479b.c();
                int i = this.f0;
                if (i == 0) {
                    C3083o.b(obj);
                    n nVar = C0294a.this.b;
                    Uri uri = this.h0;
                    this.f0 = 1;
                    if (nVar.d(uri, this) == c) {
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
            public final Object j(J j, ax.wb.e<? super t> eVar) {
                return ((d) a(j, eVar)).p(t.a);
            }
        }

        @ax.yb.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {151}, m = "invokeSuspend")
        /* renamed from: ax.e2.a$a$e */
        static final class e extends l implements p<J, ax.wb.e<? super t>, Object> {
            int f0;

            e(o oVar, ax.wb.e<? super e> eVar) {
                super(2, eVar);
            }

            @Override // ax.yb.AbstractC3520a
            public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
                return C0294a.this.new e(null, eVar);
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                Object c = C3479b.c();
                int i = this.f0;
                if (i == 0) {
                    C3083o.b(obj);
                    n nVar = C0294a.this.b;
                    this.f0 = 1;
                    if (nVar.e(null, this) == c) {
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
            public final Object j(J j, ax.wb.e<? super t> eVar) {
                return ((e) a(j, eVar)).p(t.a);
            }
        }

        @ax.yb.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {161}, m = "invokeSuspend")
        /* renamed from: ax.e2.a$a$f */
        static final class f extends l implements p<J, ax.wb.e<? super t>, Object> {
            int f0;

            f(ax.f2.p pVar, ax.wb.e<? super f> eVar) {
                super(2, eVar);
            }

            @Override // ax.yb.AbstractC3520a
            public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
                return C0294a.this.new f(null, eVar);
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                Object c = C3479b.c();
                int i = this.f0;
                if (i == 0) {
                    C3083o.b(obj);
                    n nVar = C0294a.this.b;
                    this.f0 = 1;
                    if (nVar.f(null, this) == c) {
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
            public final Object j(J j, ax.wb.e<? super t> eVar) {
                return ((f) a(j, eVar)).p(t.a);
            }
        }

        public C0294a(n nVar) {
            ax.Gb.l.f(nVar, "mMeasurementManager");
            this.b = nVar;
        }

        @Override // ax.e2.AbstractC1973a
        public ax.v7.e<Integer> b() {
            Q b2;
            b2 = C0939i.b(K.a(Y.a()), null, null, new b(null), 3, null);
            return C1883b.c(b2, null, 1, null);
        }

        @Override // ax.e2.AbstractC1973a
        public ax.v7.e<t> c(Uri uri) {
            Q b2;
            ax.Gb.l.f(uri, "trigger");
            b2 = C0939i.b(K.a(Y.a()), null, null, new d(uri, null), 3, null);
            return C1883b.c(b2, null, 1, null);
        }

        public ax.v7.e<t> e(C2032a c2032a) {
            Q b2;
            ax.Gb.l.f(c2032a, "deletionRequest");
            b2 = C0939i.b(K.a(Y.a()), null, null, new C0295a(c2032a, null), 3, null);
            return C1883b.c(b2, null, 1, null);
        }

        public ax.v7.e<t> f(Uri uri, InputEvent inputEvent) {
            Q b2;
            ax.Gb.l.f(uri, "attributionSource");
            b2 = C0939i.b(K.a(Y.a()), null, null, new c(uri, inputEvent, null), 3, null);
            return C1883b.c(b2, null, 1, null);
        }

        public ax.v7.e<t> g(o oVar) {
            Q b2;
            ax.Gb.l.f(oVar, "request");
            b2 = C0939i.b(K.a(Y.a()), null, null, new e(oVar, null), 3, null);
            return C1883b.c(b2, null, 1, null);
        }

        public ax.v7.e<t> h(ax.f2.p pVar) {
            Q b2;
            ax.Gb.l.f(pVar, "request");
            b2 = C0939i.b(K.a(Y.a()), null, null, new f(pVar, null), 3, null);
            return C1883b.c(b2, null, 1, null);
        }
    }

    /* renamed from: ax.e2.a$b */
    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public final AbstractC1973a a(Context context) {
            ax.Gb.l.f(context, "context");
            n a = n.a.a(context);
            if (a != null) {
                return new C0294a(a);
            }
            return null;
        }

        private b() {
        }
    }

    public static final AbstractC1973a a(Context context) {
        return a.a(context);
    }

    public abstract e<Integer> b();

    public abstract e<t> c(Uri uri);
}
