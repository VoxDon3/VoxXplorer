/*
 * Decompiled with CFR 0.152.
 */
package ax.n0;

import ax.Fb.p;
import ax.Qb.J;
import ax.Qb.K;
import ax.Qb.g;
import ax.Qb.s0;
import ax.Sb.d;
import ax.Sb.e;
import ax.Sb.f;
import ax.Sb.j;
import ax.sb.o;
import ax.sb.t;
import ax.xb.b;
import java.util.concurrent.atomic.AtomicInteger;

public final class l<T> {
    private final J a;
    private final p<T, ax.wb.e<? super t>, Object> b;
    private final d<T> c;
    private final AtomicInteger d;

    public l(J object, ax.Fb.l<? super Throwable, t> l8, p<? super T, ? super Throwable, t> p8, p<? super T, ? super ax.wb.e<? super t>, ? extends Object> p9) {
        ax.Gb.l.f(object, "scope");
        ax.Gb.l.f(l8, "onComplete");
        ax.Gb.l.f(p8, "onUndeliveredElement");
        ax.Gb.l.f(p9, "consumeMessage");
        this.a = object;
        this.b = p9;
        this.c = e.b(Integer.MAX_VALUE, null, null, 6, null);
        this.d = new AtomicInteger(0);
        object = object.h().a(s0.c);
        if (object == null) {
            return;
        }
        object.F((ax.Fb.l<? super Throwable, t>)new ax.Fb.l<Throwable, t>(l8, this, p8){
            final l<T> c0;
            final p<T, Throwable, t> d0;
            final ax.Fb.l<Throwable, t> q;
            {
                this.q = l8;
                this.c0 = l9;
                this.d0 = p8;
                super(1);
            }

            public final void a(Throwable throwable) {
                Object object;
                this.q.invoke(throwable);
                this.c0.c.c(throwable);
                do {
                    if ((object = f.f(this.c0.c.b())) == null) {
                        object = null;
                        continue;
                    }
                    this.d0.j(object, throwable);
                    object = t.a;
                } while (object != null);
            }
        });
    }

    public static final /* synthetic */ p a(l l8) {
        return l8.b;
    }

    public static final /* synthetic */ AtomicInteger c(l l8) {
        return l8.d;
    }

    public static final /* synthetic */ J d(l l8) {
        return l8.a;
    }

    public final void e(T object) {
        if ((object = this.c.d(object)) instanceof f.a) {
            Throwable throwable = f.e(object);
            object = throwable;
            if (throwable == null) {
                object = new j("Channel was closed normally");
            }
            throw object;
        }
        if (f.i(object)) {
            if (this.d.getAndIncrement() == 0) {
                g.d(this.a, null, null, new p<J, ax.wb.e<? super t>, Object>(this, null){
                    Object f0;
                    int g0;
                    final l<T> h0;
                    {
                        this.h0 = l8;
                        super(2, e8);
                    }

                    @Override
                    public final ax.wb.e<t> a(Object object, ax.wb.e<?> e8) {
                        return new /* invalid duplicate definition of identical inner class */;
                    }

                    /*
                     * Unable to fully structure code
                     */
                    @Override
                    public final Object p(Object var1_1) {
                        block6: {
                            block3: {
                                block4: {
                                    block5: {
                                        var5_2 = ax.xb.b.c();
                                        var2_3 = this.g0;
                                        if (var2_3 == 0) break block3;
                                        if (var2_3 == 1) break block4;
                                        if (var2_3 != 2) break block5;
                                        o.b(var1_1);
                                        ** GOTO lbl31
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                var3_4 = (p)this.f0;
                                o.b(var1_1);
                                ** GOTO lbl26
                            }
                            o.b(var1_1);
                            var2_3 = l.c(this.h0).get() > 0 ? 1 : 0;
                            if (var2_3 == 0) break block6;
                            do {
                                block7: {
                                    K.c(l.d(this.h0));
                                    var3_4 = l.a(this.h0);
                                    var1_1 = l.b(this.h0);
                                    this.f0 = var3_4;
                                    this.g0 = 1;
                                    var1_1 = var4_5 = var1_1.a(this);
                                    if (var4_5 == var5_2) break block7;
lbl26:
                                    // 2 sources

                                    this.f0 = null;
                                    this.g0 = 2;
                                    if (var3_4.j(var1_1, this) != var5_2) continue;
                                }
                                return var5_2;
lbl31:
                                // 2 sources

                            } while (l.c(this.h0).decrementAndGet() != 0);
                            return t.a;
                        }
                        throw new IllegalStateException("Check failed.");
                    }

                    public final Object u(J j8, ax.wb.e<? super t> e8) {
                        return (this.a(j8, e8)).p(t.a);
                    }
                }, 3, null);
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}

