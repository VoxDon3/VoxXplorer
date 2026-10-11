/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.Fb.p;
import ax.G0.h;
import ax.Gb.l;
import ax.Gb.v;
import ax.Qb.J;
import ax.Qb.K;
import ax.Qb.g;
import ax.Qb.s0;
import ax.Zb.a;
import ax.sb.n;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;
import ax.xb.b;

final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1
implements f {
    final v<s0> c0;
    final J d0;
    final d.a e0;
    final ax.Qb.l<t> f0;
    final a g0;
    final p<J, e<? super t>, Object> h0;
    final d.a q;

    @Override
    public final void b(h object, d.a object2) {
        l.f(object, "<anonymous parameter 0>");
        l.f(object2, "event");
        if (object2 == this.q) {
            this.c0.q = g.d(this.d0, null, null, new p<J, e<? super t>, Object>(this.g0, this.h0, null){
                Object f0;
                Object g0;
                int h0;
                final a i0;
                final p<J, e<? super t>, Object> j0;
                {
                    this.i0 = a8;
                    this.j0 = p8;
                    super(2, e8);
                }

                @Override
                public final e<t> a(Object object, e<?> e8) {
                    return new /* invalid duplicate definition of identical inner class */;
                }

                /*
                 * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
                 * WARNING - void declaration
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                @Override
                public final Object p(Object object) {
                    RuntimeException var4_7;
                    block10: {
                        Object object2;
                        p<J, e<? super t>, Object> p8;
                        block9: {
                            Object object3 = b.c();
                            int n8 = this.h0;
                            if (n8 != 0) {
                                if (n8 != 1) {
                                    if (n8 != 2) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    p8 = (a)this.f0;
                                    object2 = p8;
                                    try {
                                        o.b(object);
                                        object = p8;
                                        break block9;
                                    }
                                    catch (Throwable throwable) {
                                        object = object2;
                                        break block10;
                                    }
                                }
                                object2 = (p<J, e<? super t>, Object>)this.g0;
                                p8 = (a)this.f0;
                                o.b(object);
                                object = p8;
                            } else {
                                o.b(object);
                                p8 = this.i0;
                                object2 = this.j0;
                                this.f0 = p8;
                                this.g0 = object2;
                                this.h0 = 1;
                                object = p8;
                                if (p8.a(null, this) == object3) {
                                    return object3;
                                }
                            }
                            try {
                                p8 = new p<J, e<? super t>, Object>((p<? super J, ? super e<? super t>, ? extends Object>)object2, null){
                                    int f0;
                                    private Object g0;
                                    final p<J, e<? super t>, Object> h0;
                                    {
                                        this.h0 = p8;
                                        super(2, e8);
                                    }

                                    @Override
                                    public final e<t> a(Object object, e<?> p8) {
                                        p8 = new /* invalid duplicate definition of identical inner class */;
                                        p8.g0 = object;
                                        return p8;
                                    }

                                    /*
                                     * Enabled force condition propagation
                                     * Lifted jumps to return sites
                                     */
                                    @Override
                                    public final Object p(Object object) {
                                        Object object2 = b.c();
                                        int n8 = this.f0;
                                        if (n8 != 0) {
                                            if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            o.b(object);
                                            return t.a;
                                        } else {
                                            o.b(object);
                                            object = (J)this.g0;
                                            p<J, e<? super t>, Object> p8 = this.h0;
                                            this.f0 = 1;
                                            if (p8.j((J)object, this) != object2) return t.a;
                                            return object2;
                                        }
                                    }

                                    public final Object u(J j8, e<? super t> e8) {
                                        return (this.a(j8, e8)).p(t.a);
                                    }
                                };
                                this.f0 = object;
                                this.g0 = null;
                                this.h0 = 2;
                                object2 = K.b(p8, this);
                                if (object2 != object3) break block9;
                                return object3;
                            }
                            catch (Throwable throwable) {
                                // empty catch block
                                break block10;
                            }
                        }
                        object2 = object;
                        {
                            p8 = t.a;
                            object.c(null);
                            return t.a;
                        }
                    }
                    object.c(null);
                    throw var4_7;
                }

                public final Object u(J j8, e<? super t> e8) {
                    return (this.a(j8, e8)).p(t.a);
                }
            }, 3, null);
            return;
        }
        if (object2 == this.e0) {
            object = (s0)this.c0.q;
            if (object != null) {
                s0.a.a((s0)object, null, 1, null);
            }
            this.c0.q = null;
        }
        if (object2 == d.a.ON_DESTROY) {
            object2 = this.f0;
            object = n.q;
            object2.f(n.a(t.a));
        }
    }
}

