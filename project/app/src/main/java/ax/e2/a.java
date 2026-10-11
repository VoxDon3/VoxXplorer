/*
 * Decompiled with CFR 0.152.
 */
package ax.e2;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import ax.Gb.g;
import ax.Gb.l;
import ax.Qb.J;
import ax.Qb.K;
import ax.Qb.Y;
import ax.f2.n;
import ax.f2.p;
import ax.sb.o;
import ax.sb.t;
import ax.v7.e;

public abstract class a {
    public static final b a = new b(null);

    public static final a a(Context context) {
        return a.a(context);
    }

    public abstract e<Integer> b();

    public abstract e<t> c(Uri var1);

    private static final class a
    extends a {
        private final n b;

        public a(n n8) {
            l.f(n8, "mMeasurementManager");
            this.b = n8;
        }

        @Override
        public e<Integer> b() {
            return ax.d2.b.c(ax.Qb.g.b(K.a(Y.a()), null, null, new ax.Fb.p<J, ax.wb.e<? super Integer>, Object>(this, null){
                int f0;
                final a g0;
                {
                    this.g0 = a8;
                    super(2, e8);
                }

                @Override
                public final ax.wb.e<t> a(Object object, ax.wb.e<?> e8) {
                    return new /* invalid duplicate definition of identical inner class */;
                }

                @Override
                public final Object p(Object object) {
                    Object object2 = ax.xb.b.c();
                    int n8 = this.f0;
                    if (n8 != 0) {
                        if (n8 == 1) {
                            o.b(object);
                            return object;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(object);
                    object = this.g0.b;
                    this.f0 = 1;
                    object = ((n)object).b(this);
                    if (object == object2) {
                        return object2;
                    }
                    return object;
                }

                public final Object u(J j8, ax.wb.e<? super Integer> e8) {
                    return (this.a(j8, e8)).p(t.a);
                }
            }, 3, null), null, 1, null);
        }

        @Override
        public e<t> c(Uri uri) {
            l.f(uri, "trigger");
            return ax.d2.b.c(ax.Qb.g.b(K.a(Y.a()), null, null, new ax.Fb.p<J, ax.wb.e<? super t>, Object>(this, uri, null){
                int f0;
                final a g0;
                final Uri h0;
                {
                    this.g0 = a8;
                    this.h0 = uri;
                    super(2, e8);
                }

                @Override
                public final ax.wb.e<t> a(Object object, ax.wb.e<?> e8) {
                    return new /* invalid duplicate definition of identical inner class */;
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object p(Object object) {
                    Object object2 = ax.xb.b.c();
                    int n8 = this.f0;
                    if (n8 != 0) {
                        if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        o.b(object);
                        return t.a;
                    } else {
                        o.b(object);
                        n n9 = this.g0.b;
                        object = this.h0;
                        this.f0 = 1;
                        if (n9.d((Uri)object, this) != object2) return t.a;
                        return object2;
                    }
                }

                public final Object u(J j8, ax.wb.e<? super t> e8) {
                    return (this.a(j8, e8)).p(t.a);
                }
            }, 3, null), null, 1, null);
        }

        public e<t> e(ax.f2.a a8) {
            l.f(a8, "deletionRequest");
            return ax.d2.b.c(ax.Qb.g.b(K.a(Y.a()), null, null, new ax.Fb.p<J, ax.wb.e<? super t>, Object>(this, a8, null){
                int f0;
                final a g0;
                {
                    this.g0 = a8;
                    super(2, e8);
                }

                @Override
                public final ax.wb.e<t> a(Object object, ax.wb.e<?> e8) {
                    return new /* invalid duplicate definition of identical inner class */;
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object p(Object object) {
                    Object object2 = ax.xb.b.c();
                    int n8 = this.f0;
                    if (n8 != 0) {
                        if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        o.b(object);
                        return t.a;
                    } else {
                        o.b(object);
                        object = this.g0.b;
                        this.f0 = 1;
                        if (((n)object).a(null, this) != object2) return t.a;
                        return object2;
                    }
                }

                public final Object u(J j8, ax.wb.e<? super t> e8) {
                    return (this.a(j8, e8)).p(t.a);
                }
            }, 3, null), null, 1, null);
        }

        public e<t> f(Uri uri, InputEvent inputEvent) {
            l.f(uri, "attributionSource");
            return ax.d2.b.c(ax.Qb.g.b(K.a(Y.a()), null, null, new ax.Fb.p<J, ax.wb.e<? super t>, Object>(this, uri, inputEvent, null){
                int f0;
                final a g0;
                final Uri h0;
                final InputEvent i0;
                {
                    this.g0 = a8;
                    this.h0 = uri;
                    this.i0 = inputEvent;
                    super(2, e8);
                }

                @Override
                public final ax.wb.e<t> a(Object object, ax.wb.e<?> e8) {
                    return new /* invalid duplicate definition of identical inner class */;
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object p(Object object) {
                    Object object2 = ax.xb.b.c();
                    int n8 = this.f0;
                    if (n8 != 0) {
                        if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        o.b(object);
                        return t.a;
                    } else {
                        o.b(object);
                        n n9 = this.g0.b;
                        Uri uri = this.h0;
                        object = this.i0;
                        this.f0 = 1;
                        if (n9.c(uri, (InputEvent)object, this) != object2) return t.a;
                        return object2;
                    }
                }

                public final Object u(J j8, ax.wb.e<? super t> e8) {
                    return (this.a(j8, e8)).p(t.a);
                }
            }, 3, null), null, 1, null);
        }

        public e<t> g(ax.f2.o o8) {
            l.f(o8, "request");
            return ax.d2.b.c(ax.Qb.g.b(K.a(Y.a()), null, null, new ax.Fb.p<J, ax.wb.e<? super t>, Object>(this, o8, null){
                int f0;
                final a g0;
                {
                    this.g0 = a8;
                    super(2, e8);
                }

                @Override
                public final ax.wb.e<t> a(Object object, ax.wb.e<?> e8) {
                    return new /* invalid duplicate definition of identical inner class */;
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object p(Object object) {
                    Object object2 = ax.xb.b.c();
                    int n8 = this.f0;
                    if (n8 != 0) {
                        if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        o.b(object);
                        return t.a;
                    } else {
                        o.b(object);
                        object = this.g0.b;
                        this.f0 = 1;
                        if (((n)object).e(null, this) != object2) return t.a;
                        return object2;
                    }
                }

                public final Object u(J j8, ax.wb.e<? super t> e8) {
                    return (this.a(j8, e8)).p(t.a);
                }
            }, 3, null), null, 1, null);
        }

        public e<t> h(p p8) {
            l.f(p8, "request");
            return ax.d2.b.c(ax.Qb.g.b(K.a(Y.a()), null, null, new ax.Fb.p<J, ax.wb.e<? super t>, Object>(this, p8, null){
                int f0;
                final a g0;
                {
                    this.g0 = a8;
                    super(2, e8);
                }

                @Override
                public final ax.wb.e<t> a(Object object, ax.wb.e<?> e8) {
                    return new /* invalid duplicate definition of identical inner class */;
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object p(Object object) {
                    Object object2 = ax.xb.b.c();
                    int n8 = this.f0;
                    if (n8 != 0) {
                        if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        o.b(object);
                        return t.a;
                    } else {
                        o.b(object);
                        object = this.g0.b;
                        this.f0 = 1;
                        if (((n)object).f(null, this) != object2) return t.a;
                        return object2;
                    }
                }

                public final Object u(J j8, ax.wb.e<? super t> e8) {
                    return (this.a(j8, e8)).p(t.a);
                }
            }, 3, null), null, 1, null);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        public final a a(Context object) {
            l.f(object, "context");
            object = n.a.a((Context)object);
            if (object != null) {
                return new a((n)object);
            }
            return null;
        }
    }
}

