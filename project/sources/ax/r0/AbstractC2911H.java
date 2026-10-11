package ax.r0;

import ax.r0.C2904A;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ax.r0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2911H {
    private static final AbstractC2911H a;
    private static final AbstractC2911H b;

    /* renamed from: ax.r0.H$b */
    private static final class b extends AbstractC2911H {
        private static final Class<?> c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j) {
            return (List) s0.A(obj, j);
        }

        private static <L> List<L> g(Object obj, long j, int i) {
            List<L> f = f(obj, j);
            if (f.isEmpty()) {
                List<L> c2909f = f instanceof InterfaceC2910G ? new C2909F(i) : ((f instanceof b0) && (f instanceof C2904A.i)) ? ((C2904A.i) f).L(i) : new ArrayList<>(i);
                s0.O(obj, j, c2909f);
                return c2909f;
            }
            if (c.isAssignableFrom(f.getClass())) {
                ArrayList arrayList = new ArrayList(f.size() + i);
                arrayList.addAll(f);
                s0.O(obj, j, arrayList);
                return arrayList;
            }
            if (f instanceof r0) {
                C2909F c2909f2 = new C2909F(f.size() + i);
                c2909f2.addAll((r0) f);
                s0.O(obj, j, c2909f2);
                return c2909f2;
            }
            if ((f instanceof b0) && (f instanceof C2904A.i)) {
                C2904A.i iVar = (C2904A.i) f;
                if (!iVar.G0()) {
                    C2904A.i L = iVar.L(f.size() + i);
                    s0.O(obj, j, L);
                    return L;
                }
            }
            return f;
        }

        @Override // ax.r0.AbstractC2911H
        void c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) s0.A(obj, j);
            if (list instanceof InterfaceC2910G) {
                unmodifiableList = ((InterfaceC2910G) list).A0();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof b0) && (list instanceof C2904A.i)) {
                    C2904A.i iVar = (C2904A.i) list;
                    if (iVar.G0()) {
                        iVar.F();
                        return;
                    }
                    return;
                }
                unmodifiableList = DesugarCollections.unmodifiableList(list);
            }
            s0.O(obj, j, unmodifiableList);
        }

        @Override // ax.r0.AbstractC2911H
        <E> void d(Object obj, Object obj2, long j) {
            List f = f(obj2, j);
            List g = g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            s0.O(obj, j, f);
        }

        @Override // ax.r0.AbstractC2911H
        <L> List<L> e(Object obj, long j) {
            return g(obj, j, 10);
        }
    }

    /* renamed from: ax.r0.H$c */
    private static final class c extends AbstractC2911H {
        private c() {
            super();
        }

        static <E> C2904A.i<E> f(Object obj, long j) {
            return (C2904A.i) s0.A(obj, j);
        }

        @Override // ax.r0.AbstractC2911H
        void c(Object obj, long j) {
            f(obj, j).F();
        }

        @Override // ax.r0.AbstractC2911H
        <E> void d(Object obj, Object obj2, long j) {
            C2904A.i f = f(obj, j);
            C2904A.i f2 = f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.G0()) {
                    f = f.L(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            s0.O(obj, j, f2);
        }

        @Override // ax.r0.AbstractC2911H
        <L> List<L> e(Object obj, long j) {
            C2904A.i f = f(obj, j);
            if (f.G0()) {
                return f;
            }
            int size = f.size();
            C2904A.i L = f.L(size == 0 ? 10 : size * 2);
            s0.O(obj, j, L);
            return L;
        }
    }

    static {
        a = new b();
        b = new c();
    }

    static AbstractC2911H a() {
        return a;
    }

    static AbstractC2911H b() {
        return b;
    }

    abstract void c(Object obj, long j);

    abstract <L> void d(Object obj, Object obj2, long j);

    abstract <L> List<L> e(Object obj, long j);

    private AbstractC2911H() {
    }
}
