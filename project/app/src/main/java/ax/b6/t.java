/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.l;
import ax.b6.m;
import ax.b6.n;
import ax.b6.s;
import ax.b6.v;
import java.util.ArrayList;
import java.util.List;

public final class t
extends n
implements m {
    private final List<String> d0;
    private final List<s> e0;
    private Z2 f0;

    private t(t t8) {
        super(t8.q);
        ArrayList<String> arrayList = new ArrayList<String>(t8.d0.size());
        this.d0 = arrayList;
        arrayList.addAll(t8.d0);
        arrayList = new ArrayList(t8.e0.size());
        this.e0 = arrayList;
        arrayList.addAll(t8.e0);
        this.f0 = t8.f0;
    }

    public t(String object, List<s> object2, List<s> list, Z2 z22) {
        super((String)object);
        this.d0 = new ArrayList<String>();
        this.f0 = z22;
        if (!object2.isEmpty()) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object = (s)object2.next();
                this.d0.add(object.g());
            }
        }
        this.e0 = new ArrayList<s>(list);
    }

    @Override
    public final s a(Z2 object, List<s> object2) {
        Z2 z22 = this.f0.d();
        for (int i8 = 0; i8 < this.d0.size(); ++i8) {
            if (i8 < object2.size()) {
                z22.e(this.d0.get(i8), ((Z2)object).b(object2.get(i8)));
                continue;
            }
            z22.e(this.d0.get(i8), s.f);
        }
        for (s s8 : this.e0) {
            object = object2 = z22.b(s8);
            if (object2 instanceof v) {
                object = z22.b(s8);
            }
            if (!(object instanceof l)) continue;
            return ((l)object).a();
        }
        return s.f;
    }

    @Override
    public final s c() {
        return new t(this);
    }
}

