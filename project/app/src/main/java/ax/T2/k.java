/*
 * Decompiled with CFR 0.152.
 */
package ax.T2;

import ax.u3.b;
import com.voxdon.xplorer.file.A;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class k {
    List<A> a = new ArrayList<A>();

    void a(A a8) {
        this.a.add(a8);
    }

    public List<A> b() {
        return this.a;
    }

    long c() {
        if (this.a.size() <= 1) {
            b.f();
            return 0L;
        }
        return this.a.get((int)0).d * (long)(this.a.size() - 1);
    }

    A d() {
        if (this.a.size() == 0) {
            return null;
        }
        return this.a.get(0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void e(Comparator<A> comparator) {
        try {
            Collections.sort(this.a, comparator);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }
}

