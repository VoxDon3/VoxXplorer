package ax.T2;

import ax.u3.C3184b;
import com.voxdon.xplorer.file.A;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class k {
    List<A> a = new ArrayList();

    void a(A a) {
        this.a.add(a);
    }

    public List<A> b() {
        return this.a;
    }

    long c() {
        if (this.a.size() > 1) {
            return this.a.get(0).d * (this.a.size() - 1);
        }
        C3184b.f();
        return 0L;
    }

    A d() {
        if (this.a.size() == 0) {
            return null;
        }
        return this.a.get(0);
    }

    void e(Comparator<A> comparator) {
        try {
            Collections.sort(this.a, comparator);
        } catch (IllegalArgumentException unused) {
        }
    }
}
