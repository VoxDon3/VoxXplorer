/*
 * Decompiled with CFR 0.152.
 */
package ax.wb;

import ax.Gb.l;
import ax.i.s;
import ax.wb.e;
import ax.wb.i;
import ax.wb.j;

public interface f
extends i.b {
    public static final b b0 = b.q;

    public <T> e<T> A(e<? super T> var1);

    public void s0(e<?> var1);

    public static final class a {
        public static <E extends i.b> E a(f f8, i.c<E> b8) {
            l.f(b8, "key");
            if (b8 instanceof ax.wb.b) {
                if ((b8 = (ax.wb.b)b8).a(f8.getKey()) && s.a(f8 = b8.b(f8))) {
                    return (E)f8;
                }
                return null;
            }
            if (b0 == b8) {
                l.d(f8, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return (E)f8;
            }
            return null;
        }

        public static i b(f i8, i.c<?> object) {
            l.f(object, "key");
            if (object instanceof ax.wb.b) {
                ax.wb.b b8 = (ax.wb.b)object;
                object = i8;
                if (b8.a(i8.getKey())) {
                    object = i8;
                    if (b8.b((i.b)i8) != null) {
                        object = j.q;
                    }
                }
                return object;
            }
            if (b0 == object) {
                i8 = j.q;
            }
            return i8;
        }
    }

    public static final class b
    implements i.c<f> {
        static final b q = new b();

        private b() {
        }
    }
}

