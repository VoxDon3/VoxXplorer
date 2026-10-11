/*
 * Decompiled with CFR 0.152.
 */
package ax.wb;

import ax.Fb.p;
import ax.Gb.l;
import ax.wb.d;
import ax.wb.f;
import ax.wb.h;
import ax.wb.j;

public interface i {
    public <E extends b> E a(c<E> var1);

    public i m(c<?> var1);

    public i p(i var1);

    public <R> R v(R var1, p<? super R, ? super b, ? extends R> var2);

    public static final class a {
        public static /* synthetic */ i a(i i8, b b8) {
            return a.c(i8, b8);
        }

        public static i b(i i8, i i9) {
            l.f(i9, "context");
            if (i9 == j.q) {
                return i8;
            }
            return i9.v(i8, new h());
        }

        private static i c(i i8, b b8) {
            l.f(i8, "acc");
            l.f(b8, "element");
            i i9 = i8.m(b8.getKey());
            i8 = j.q;
            if (i9 == i8) {
                return b8;
            }
            f.b b9 = f.b0;
            f f8 = i9.a(b9);
            if (f8 == null) {
                return new d(i9, b8);
            }
            if ((i9 = i9.m(b9)) == i8) {
                return new d(b8, f8);
            }
            return new d(new d(i9, b8), f8);
        }
    }

    public static interface b
    extends i {
        @Override
        public <E extends b> E a(c<E> var1);

        public c<?> getKey();

        public static final class a {
            public static <R> R a(b b8, R r8, p<? super R, ? super b, ? extends R> p8) {
                l.f(p8, "operation");
                return p8.j(r8, b8);
            }

            public static <E extends b> E b(b b8, c<E> c8) {
                l.f(c8, "key");
                if (l.a(b8.getKey(), c8)) {
                    l.d(b8, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return (E)b8;
                }
                return null;
            }

            public static i c(b b8, c<?> c8) {
                l.f(c8, "key");
                i i8 = b8;
                if (l.a(b8.getKey(), c8)) {
                    i8 = j.q;
                }
                return i8;
            }

            public static i d(b b8, i i8) {
                l.f(i8, "context");
                return ax.wb.i$a.b(b8, i8);
            }
        }
    }

    public static interface c<E extends b> {
    }
}

