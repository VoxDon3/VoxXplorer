/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.Gb.l;
import ax.Qb.Y;
import ax.ke.D;
import ax.ke.b;
import ax.ke.d;
import ax.ke.m;
import ax.ke.o;
import ax.sb.e;
import ax.sb.n;
import ax.sb.t;
import java.lang.reflect.Method;

public final class p {
    public static final <T> Object a(b<T> object, ax.wb.e<? super T> e8) {
        ax.Qb.m<T> m8 = new ax.Qb.m<T>(ax.xb.b.b(e8), 1);
        m8.r(new ax.Fb.l<Throwable, t>(object){
            final b q;
            {
                this.q = b8;
                super(1);
            }

            public final void a(Throwable throwable) {
                this.q.cancel();
            }
        });
        object.u(new d<T>(m8){
            final ax.Qb.l a;
            {
                this.a = l8;
            }

            @Override
            public void a(b<T> object, D<T> object2) {
                l.g(object, "call");
                l.g(object2, "response");
                if (((D)object2).e()) {
                    if ((object2 = ((D)object2).a()) == null) {
                        if ((object = object.request().tag(o.class)) == null) {
                            l.p();
                        }
                        l.b(object, "call.request().tag(Invocation::class.java)!!");
                        object2 = ((o)object).a();
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Response from ");
                        l.b(object2, "method");
                        Object object3 = ((Method)object2).getDeclaringClass();
                        l.b(object3, "method.declaringClass");
                        ((StringBuilder)object).append(((Class)object3).getName());
                        ((StringBuilder)object).append('.');
                        ((StringBuilder)object).append(((Method)object2).getName());
                        ((StringBuilder)object).append(" was null but response body type was declared as non-null");
                        object2 = new e(((StringBuilder)object).toString());
                        object3 = this.a;
                        object = n.q;
                        object3.f(n.a(ax.sb.o.a((Throwable)object2)));
                        return;
                    }
                    this.a.f(n.a(object2));
                    return;
                }
                object = this.a;
                object2 = new m((D<?>)object2);
                n.a a8 = n.q;
                object.f(n.a(ax.sb.o.a((Throwable)object2)));
            }

            @Override
            public void b(b<T> object, Throwable throwable) {
                l.g(object, "call");
                l.g(throwable, "t");
                ax.Qb.l l8 = this.a;
                object = n.q;
                l8.f(n.a(ax.sb.o.a(throwable)));
            }
        });
        object = m8.z();
        if (object == ax.xb.b.c()) {
            ax.yb.h.c(e8);
        }
        return object;
    }

    public static final <T> Object b(b<T> object, ax.wb.e<? super T> e8) {
        ax.Qb.m<T> m8 = new ax.Qb.m<T>(ax.xb.b.b(e8), 1);
        m8.r(new ax.Fb.l<Throwable, t>(object){
            final b q;
            {
                this.q = b8;
                super(1);
            }

            public final void a(Throwable throwable) {
                this.q.cancel();
            }
        });
        object.u(new d<T>(m8){
            final ax.Qb.l a;
            {
                this.a = l8;
            }

            @Override
            public void a(b<T> object, D<T> object2) {
                l.g(object, "call");
                l.g(object2, "response");
                if (((D)object2).e()) {
                    this.a.f(n.a(((D)object2).a()));
                    return;
                }
                object = this.a;
                m m8 = new m((D<?>)object2);
                object2 = n.q;
                object.f(n.a(ax.sb.o.a(m8)));
            }

            @Override
            public void b(b<T> object, Throwable throwable) {
                l.g(object, "call");
                l.g(throwable, "t");
                object = this.a;
                n.a a8 = n.q;
                object.f(n.a(ax.sb.o.a(throwable)));
            }
        });
        object = m8.z();
        if (object == ax.xb.b.c()) {
            ax.yb.h.c(e8);
        }
        return object;
    }

    public static final <T> Object c(b<T> object, ax.wb.e<? super D<T>> e8) {
        ax.Qb.m<D<T>> m8 = new ax.Qb.m<D<T>>(ax.xb.b.b(e8), 1);
        m8.r(new ax.Fb.l<Throwable, t>(object){
            final b q;
            {
                this.q = b8;
                super(1);
            }

            public final void a(Throwable throwable) {
                this.q.cancel();
            }
        });
        object.u(new d<T>(m8){
            final ax.Qb.l a;
            {
                this.a = l8;
            }

            @Override
            public void a(b<T> b8, D<T> d8) {
                l.g(b8, "call");
                l.g(d8, "response");
                this.a.f(n.a(d8));
            }

            @Override
            public void b(b<T> object, Throwable throwable) {
                l.g(object, "call");
                l.g(throwable, "t");
                ax.Qb.l l8 = this.a;
                object = n.q;
                l8.f(n.a(ax.sb.o.a(throwable)));
            }
        });
        object = m8.z();
        if (object == ax.xb.b.c()) {
            ax.yb.h.c(e8);
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object d(Exception var0, ax.wb.e<?> var1_1) {
        if (!(var1_1 instanceof h)) ** GOTO lbl-1000
        var3_2 = var1_1;
        var2_3 = var3_2.f0;
        if ((var2_3 & -2147483648) != 0) {
            var3_2.f0 = var2_3 + -2147483648;
            var1_1 = var3_2;
        } else lbl-1000:
        // 2 sources

        {
            var1_1 = new ax.yb.d((ax.wb.e)var1_1){
                Object e0;
                int f0;
                Object g0;

                @Override
                public final Object p(Object object) {
                    this.e0 = object;
                    this.f0 |= Integer.MIN_VALUE;
                    return p.d(null, this);
                }
            };
        }
        var4_4 = var1_1.e0;
        var3_2 = ax.xb.b.c();
        var2_3 = var1_1.f0;
        if (var2_3 == 0) ** GOTO lbl18
        if (var2_3 == 1) {
            var0 = (Exception)var1_1.g0;
            ax.sb.o.b(var4_4);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl18:
            // 1 sources

            ax.sb.o.b(var4_4);
            var1_1.g0 = var0;
            var1_1.f0 = 1;
            Y.a().b(var1_1.b(), new Runnable((ax.wb.e)var1_1, (Exception)var0){
                final Exception c0;
                final ax.wb.e q;
                {
                    this.q = e8;
                    this.c0 = exception;
                }

                @Override
                public final void run() {
                    ax.wb.e e8 = ax.xb.b.b(this.q);
                    Exception exception = this.c0;
                    n.a a8 = n.q;
                    e8.f(n.a(ax.sb.o.a(exception)));
                }
            });
            var0 = ax.xb.b.c();
            if (var0 == ax.xb.b.c()) {
                ax.yb.h.c(var1_1);
            }
            if (var0 == var3_2) {
                return var3_2;
            }
        }
        return t.a;
    }
}

