/*
 * Decompiled with CFR 0.152.
 */
package ax.T2;

import ax.T2.h;
import ax.T2.k;
import ax.c3.K;
import ax.c3.d0;
import com.alphainventor.filemanager.file.A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class j {
    List<k> a;
    long b;

    public j(List<k> list, long l8) {
        this.a = list;
        this.b = l8;
    }

    private String d(K k8, String string) {
        return d0.v(k8, string, Boolean.FALSE);
    }

    public List<k> a() {
        return this.a;
    }

    public List<h.h> b(K k8, int n8) {
        ArrayList<h.h> arrayList = new ArrayList<h.h>();
        Iterator<k> iterator = this.a.iterator();
        int n9 = 0;
        while (iterator.hasNext()) {
            int n10;
            A a8 = iterator.next().d();
            if (a8 != null) {
                arrayList.add(new h.h(this.d(k8, a8.a), a8.d, a8.b));
            }
            n9 = n10 = n9 + 1;
            if (n10 < n8) continue;
        }
        return arrayList;
    }

    public List<h.h> c(K k8) {
        ArrayList<h.h> arrayList = new ArrayList<h.h>();
        for (k k9 : this.a) {
            for (int i8 = 1; i8 < k9.a.size(); ++i8) {
                A a8 = k9.a.get(i8);
                if (a8 == null) continue;
                arrayList.add(new h.h(this.d(k8, a8.a), a8.d, a8.b));
            }
        }
        return arrayList;
    }

    public void e(String string) {
        Iterator<k> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            k k8 = iterator.next();
            Iterator<A> iterator2 = k8.a.iterator();
            while (iterator2.hasNext()) {
                A a8 = iterator2.next();
                if (!a8.a.equals(string)) continue;
                iterator2.remove();
                this.b -= a8.d;
            }
            if (k8.a.size() > 1) continue;
            iterator.remove();
        }
    }
}

