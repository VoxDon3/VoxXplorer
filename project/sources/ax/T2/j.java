package ax.T2;

import ax.T2.h;
import ax.c3.K;
import ax.c3.d0;
import com.voxdon.xplorer.file.A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class j {
    List<k> a;
    long b;

    public j(List<k> list, long j) {
        this.a = list;
        this.b = j;
    }

    private String d(K k, String str) {
        return d0.v(k, str, Boolean.FALSE);
    }

    public List<k> a() {
        return this.a;
    }

    public List<h.C0194h> b(K k, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator<k> it = this.a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            A d = it.next().d();
            if (d != null) {
                arrayList.add(new h.C0194h(d(k, d.a), d.d, d.b));
            }
            i2++;
            if (i2 >= i) {
                break;
            }
        }
        return arrayList;
    }

    public List<h.C0194h> c(K k) {
        ArrayList arrayList = new ArrayList();
        for (k kVar : this.a) {
            for (int i = 1; i < kVar.a.size(); i++) {
                A a = kVar.a.get(i);
                if (a != null) {
                    arrayList.add(new h.C0194h(d(k, a.a), a.d, a.b));
                }
            }
        }
        return arrayList;
    }

    public void e(String str) {
        Iterator<k> it = this.a.iterator();
        while (it.hasNext()) {
            k next = it.next();
            Iterator<A> it2 = next.a.iterator();
            while (it2.hasNext()) {
                A next2 = it2.next();
                if (next2.a.equals(str)) {
                    it2.remove();
                    this.b -= next2.d;
                }
            }
            if (next.a.size() <= 1) {
                it.remove();
            }
        }
    }
}
