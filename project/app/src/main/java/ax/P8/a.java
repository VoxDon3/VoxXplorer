/*
 * Decompiled with CFR 0.152.
 */
package ax.P8;

import ax.O8.c;
import ax.Q8.g;
import ax.h9.b;
import java.util.ArrayList;
import java.util.Set;

public class a
extends c {
    private Set<g> c;

    public a(Set<g> set) {
        this.c = set;
    }

    @Override
    public void e(b b8) {
        Object object;
        int n8 = 0;
        b8.j((byte)0);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("SMB 2.002");
        if (this.c.size() > 1 || !this.c.contains((Object)g.d0)) {
            arrayList.add("SMB 2.???");
        }
        int n9 = arrayList.size();
        int n10 = 0;
        int n11 = 0;
        while (n11 < n9) {
            object = arrayList.get(n11);
            ++n11;
            n10 += ((String)object).length() + 2;
        }
        b8.s(n10);
        n10 = arrayList.size();
        for (n11 = n8; n11 < n10; ++n11) {
            object = arrayList.get(n11);
            object = (String)object;
            b8.j((byte)2);
            b8.m((String)object, ax.Y8.b.a);
        }
        ((ax.O8.a)this.a).d(b8.V());
    }

    public String toString() {
        return "SMB_COM_NEGOTIATE";
    }
}

