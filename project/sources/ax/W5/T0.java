package ax.W5;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class T0 extends X0 {
    private static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* synthetic */ T0(S0 s0) {
        super(null);
    }

    @Override // ax.W5.X0
    final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) X1.f(obj, j);
        if (list instanceof R0) {
            unmodifiableList = ((R0) list).f();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC1064r1) && (list instanceof M0)) {
                M0 m0 = (M0) list;
                if (m0.c()) {
                    m0.b();
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        X1.p(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.W5.X0
    final void b(Object obj, Object obj2, long j) {
        Q0 q0;
        List list = (List) X1.f(obj2, j);
        int size = list.size();
        List list2 = (List) X1.f(obj, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof R0 ? new Q0(size) : ((list2 instanceof InterfaceC1064r1) && (list2 instanceof M0)) ? ((M0) list2).v(size) : new ArrayList(size);
            X1.p(obj, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                X1.p(obj, j, arrayList);
                q0 = arrayList;
            } else if (list2 instanceof S1) {
                Q0 q02 = new Q0(list2.size() + size);
                q02.addAll(q02.size(), (S1) list2);
                X1.p(obj, j, q02);
                q0 = q02;
            } else if ((list2 instanceof InterfaceC1064r1) && (list2 instanceof M0)) {
                M0 m0 = (M0) list2;
                if (!m0.c()) {
                    list2 = m0.v(list2.size() + size);
                    X1.p(obj, j, list2);
                }
            }
            list2 = q0;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        X1.p(obj, j, list);
    }
}
