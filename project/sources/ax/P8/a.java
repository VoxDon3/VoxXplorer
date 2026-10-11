package ax.P8;

import ax.O8.c;
import ax.Q8.g;
import ax.Y8.b;
import ax.h9.C2171b;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes3.dex */
public class a extends c {
    private Set<g> c;

    public a(Set<g> set) {
        this.c = set;
    }

    @Override // ax.O8.c
    public void e(C2171b c2171b) {
        int i = 0;
        c2171b.j((byte) 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add("SMB 2.002");
        if (this.c.size() > 1 || !this.c.contains(g.SMB_2_0_2)) {
            arrayList.add("SMB 2.???");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            i2 += ((String) obj).length() + 2;
        }
        c2171b.s(i2);
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            c2171b.j((byte) 2);
            c2171b.m((String) obj2, b.a);
        }
        ((ax.O8.a) this.a).d(c2171b.V());
    }

    public String toString() {
        return "SMB_COM_NEGOTIATE";
    }
}
