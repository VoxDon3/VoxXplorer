/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.F;
import ax.r0.G;
import ax.r0.b0;
import ax.r0.r0;
import ax.r0.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class H {
    private static final H a = new b();
    private static final H b = new c();

    private H() {
    }

    static H a() {
        return a;
    }

    static H b() {
        return b;
    }

    abstract void c(Object var1, long var2);

    abstract <L> void d(Object var1, Object var2, long var3);

    abstract <L> List<L> e(Object var1, long var2);

    private static final class b
    extends H {
        private static final Class<?> c = java.util.DesugarCollections.unmodifiableList((List)Collections.EMPTY_LIST).getClass();

        private b() {
        }

        static <E> List<E> f(Object object, long l8) {
            return (List)s0.A(object, l8);
        }

        private static <L> List<L> g(Object object, long l8, int n8) {
            A.i i8;
            List list = ax.r0.H$b.f(object, l8);
            if (list.isEmpty()) {
                list = list instanceof G ? new F(n8) : (list instanceof b0 && list instanceof A.i ? ((A.i)list).L(n8) : new ArrayList(n8));
                s0.O(object, l8, list);
                return list;
            }
            if (c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + n8);
                arrayList.addAll(list);
                s0.O(object, l8, arrayList);
                return arrayList;
            }
            if (list instanceof r0) {
                F f8 = new F(list.size() + n8);
                f8.addAll((r0)list);
                s0.O(object, l8, f8);
                return f8;
            }
            if (list instanceof b0 && list instanceof A.i && !(i8 = (A.i)list).G0()) {
                list = i8.L(list.size() + n8);
                s0.O(object, l8, list);
                return list;
            }
            return list;
        }

        @Override
        void c(Object object, long l8) {
            List list;
            block5: {
                block7: {
                    block6: {
                        block4: {
                            list = (List)s0.A(object, l8);
                            if (!(list instanceof G)) break block4;
                            list = ((G)list).A0();
                            break block5;
                        }
                        if (c.isAssignableFrom(list.getClass())) break block6;
                        if (!(list instanceof b0) || !(list instanceof A.i)) break block7;
                        object = (A.i)list;
                        if (object.G0()) {
                            object.F();
                        }
                    }
                    return;
                }
                list = java.util.DesugarCollections.unmodifiableList((List)list);
            }
            s0.O(object, l8, list);
        }

        @Override
        <E> void d(Object object, Object list, long l8) {
            list = ax.r0.H$b.f(list, l8);
            List list2 = ax.r0.H$b.g(object, l8, list.size());
            int n8 = list2.size();
            int n9 = list.size();
            if (n8 > 0 && n9 > 0) {
                list2.addAll(list);
            }
            if (n8 > 0) {
                list = list2;
            }
            s0.O(object, l8, list);
        }

        @Override
        <L> List<L> e(Object object, long l8) {
            return ax.r0.H$b.g(object, l8, 10);
        }
    }

    private static final class c
    extends H {
        private c() {
        }

        static <E> A.i<E> f(Object object, long l8) {
            return (A.i)s0.A(object, l8);
        }

        @Override
        void c(Object object, long l8) {
            c.f(object, l8).F();
        }

        @Override
        <E> void d(Object object, Object i8, long l8) {
            A.i<E> i9 = c.f(object, l8);
            A.i<E> i10 = c.f(i8, l8);
            int n8 = i9.size();
            int n9 = i10.size();
            i8 = i9;
            if (n8 > 0) {
                i8 = i9;
                if (n9 > 0) {
                    i8 = i9;
                    if (!i9.G0()) {
                        i8 = i9.L(n9 + n8);
                    }
                    i8.addAll(i10);
                }
            }
            i9 = i10;
            if (n8 > 0) {
                i9 = i8;
            }
            s0.O(object, l8, i9);
        }

        @Override
        <L> List<L> e(Object object, long l8) {
            A.i i8;
            A.i i9 = i8 = c.f(object, l8);
            if (!i8.G0()) {
                int n8 = i8.size();
                n8 = n8 == 0 ? 10 : (n8 *= 2);
                i9 = i8.L(n8);
                s0.O(object, l8, i9);
            }
            return i9;
        }
    }
}

