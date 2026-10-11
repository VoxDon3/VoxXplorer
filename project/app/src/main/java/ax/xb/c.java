/*
 * Decompiled with CFR 0.152.
 */
package ax.xb;

import ax.Fb.p;
import ax.Gb.l;
import ax.Gb.z;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;
import ax.wb.i;
import ax.yb.a;
import ax.yb.d;
import ax.yb.h;
import ax.yb.j;

class c {
    public static <R, T> e<t> a(p<? super R, ? super e<? super T>, ? extends Object> p8, R r8, e<? super T> e8) {
        l.f(p8, "<this>");
        l.f(e8, "completion");
        e8 = h.a(e8);
        if (p8 instanceof a) {
            return ((a)((Object)p8)).a(r8, e8);
        }
        i i8 = e8.b();
        if (i8 == ax.wb.j.q) {
            return new j(e8, p8, r8){
                private int c0;
                final p d0;
                final Object e0;
                {
                    this.d0 = p8;
                    this.e0 = object;
                    l.d(e8, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                    super(e8);
                }

                @Override
                protected Object p(Object object) {
                    int n8 = this.c0;
                    if (n8 != 0) {
                        if (n8 == 1) {
                            this.c0 = 2;
                            o.b(object);
                            return object;
                        }
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.c0 = 1;
                    o.b(object);
                    l.d(this.d0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((p)z.c(this.d0, 2)).j(this.e0, this);
                }
            };
        }
        return new d(e8, i8, p8, r8){
            private int e0;
            final p f0;
            final Object g0;
            {
                this.f0 = p8;
                this.g0 = object;
                l.d(e8, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super(e8, i8);
            }

            @Override
            protected Object p(Object object) {
                int n8 = this.e0;
                if (n8 != 0) {
                    if (n8 == 1) {
                        this.e0 = 2;
                        o.b(object);
                        return object;
                    }
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.e0 = 1;
                o.b(object);
                l.d(this.f0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p)z.c(this.f0, 2)).j(this.g0, this);
            }
        };
    }

    public static <T> e<T> b(e<? super T> e8) {
        l.f(e8, "<this>");
        e<Object> e9 = e8 instanceof d ? (d)e8 : null;
        if (e9 != null && (e9 = e9.t()) != null) {
            return e9;
        }
        return e8;
    }
}

