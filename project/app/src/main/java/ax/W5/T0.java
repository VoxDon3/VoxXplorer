/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.M0;
import ax.W5.Q0;
import ax.W5.R0;
import ax.W5.S0;
import ax.W5.S1;
import ax.W5.X0;
import ax.W5.X1;
import ax.W5.e0;
import ax.W5.r1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class T0
extends X0 {
    private static final Class c = java.util.DesugarCollections.unmodifiableList((List)Collections.EMPTY_LIST).getClass();

    /* synthetic */ T0(S0 s02) {
        super(null);
    }

    @Override
    final void a(Object object, long l8) {
        List list;
        block5: {
            block7: {
                block6: {
                    block4: {
                        list = (List)X1.f(object, l8);
                        if (!(list instanceof R0)) break block4;
                        list = ((R0)list).f();
                        break block5;
                    }
                    if (c.isAssignableFrom(list.getClass())) break block6;
                    if (!(list instanceof r1) || !(list instanceof M0)) break block7;
                    object = (M0)list;
                    if (object.c()) {
                        object.b();
                    }
                }
                return;
            }
            list = java.util.DesugarCollections.unmodifiableList((List)list);
        }
        X1.p(object, l8, list);
    }

    @Override
    final void b(Object object, Object list, long l8) {
        List list2 = (List)X1.f(list, l8);
        int n8 = list2.size();
        List list3 = (List)X1.f(object, l8);
        if (list3.isEmpty()) {
            list = list3 instanceof R0 ? new Q0(n8) : (list3 instanceof r1 && list3 instanceof M0 ? ((M0)list3).v(n8) : new ArrayList(n8));
            X1.p(object, l8, list);
        } else if (c.isAssignableFrom(list3.getClass())) {
            list = new ArrayList(list3.size() + n8);
            ((ArrayList)list).addAll(list3);
            X1.p(object, l8, list);
        } else if (list3 instanceof S1) {
            list = new Q0(list3.size() + n8);
            list3 = (S1)list3;
            ((e0)list).addAll(((Q0)list).size(), (Collection)list3);
            X1.p(object, l8, list);
        } else {
            list = list3;
            if (list3 instanceof r1) {
                list = list3;
                if (list3 instanceof M0) {
                    M0 m02 = (M0)list3;
                    list = list3;
                    if (!m02.c()) {
                        list = m02.v(list3.size() + n8);
                        X1.p(object, l8, list);
                    }
                }
            }
        }
        n8 = list.size();
        int n9 = list2.size();
        if (n8 > 0 && n9 > 0) {
            list.addAll(list2);
        }
        if (n8 <= 0) {
            list = list2;
        }
        X1.p(object, l8, list);
    }
}

