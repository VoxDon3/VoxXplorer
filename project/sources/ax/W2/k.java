package ax.W2;

import ax.W2.h;
import ax.b3.C1495j;
import ax.c3.d0;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class k extends h {
    private C3596o d;
    private a e;
    private List<AbstractC3595n> f;
    private String g;
    private String h;

    public enum a {
        ZIP,
        SEVENZ
    }

    public static k n() {
        return new k();
    }

    @Override // ax.W2.h
    protected j b() {
        return new l(f(), this.e, this.d, this.f, this.h, l());
    }

    public void k(C3596o c3596o, List<AbstractC3595n> list, h.a aVar) {
        i(aVar);
        this.d = c3596o;
        ArrayList arrayList = new ArrayList(list);
        this.f = arrayList;
        if (arrayList.size() > 0) {
            try {
                AbstractC3595n abstractC3595n = this.f.get(0);
                AbstractC3595n z = this.d.z(abstractC3595n.T());
                if (z != null) {
                    this.h = z.E();
                }
                if (this.f.size() > 1) {
                    if (z != null) {
                        if (this.h.equals(c3596o.V())) {
                            this.g = m(abstractC3595n);
                        } else {
                            this.g = m(z);
                        }
                    }
                } else if (this.f.size() == 1) {
                    this.g = m(abstractC3595n);
                }
            } catch (C1495j e) {
                e.printStackTrace();
            }
        }
        j(h.c.FILLED);
    }

    public String l() {
        return this.g;
    }

    public String m(AbstractC3595n abstractC3595n) {
        return abstractC3595n.isDirectory() ? abstractC3595n.B() : d0.g(abstractC3595n.B());
    }

    public void o(a aVar) {
        this.e = aVar;
    }

    public void p(String str) {
        this.g = str;
    }
}
