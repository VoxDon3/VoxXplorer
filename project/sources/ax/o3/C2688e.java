package ax.o3;

import ax.c3.K;
import com.voxdon.xplorer.file.AbstractC3595n;

/* renamed from: ax.o3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2688e {
    private static C2688e d;
    private K a;
    private String b;
    private long c;

    public static C2688e b() {
        if (d == null) {
            d = new C2688e();
        }
        return d;
    }

    private boolean e() {
        return this.b == null;
    }

    private boolean f(K k, String str) {
        String str2;
        return k == this.a && (str2 = this.b) != null && str2.equals(str);
    }

    public void a() {
        this.a = null;
        this.b = null;
        this.c = 0L;
    }

    public long c(K k, String str) {
        if (f(k, str)) {
            return this.c;
        }
        return 0L;
    }

    public long d(AbstractC3595n abstractC3595n) {
        return c(abstractC3595n.R(), abstractC3595n.E());
    }

    public void g(K k, String str, long j) {
        if (f(k, str)) {
            if (j > this.c) {
                this.c = j;
            }
        } else {
            this.a = k;
            this.b = str;
            this.c = j;
        }
    }

    public void h(AbstractC3595n abstractC3595n, long j) {
        g(abstractC3595n.R(), abstractC3595n.E(), j);
    }

    public void i(K k, String str, long j) {
        if (f(k, str)) {
            if (j > this.c) {
                this.c = j;
            }
        } else if (e()) {
            g(k, str, j);
        }
    }

    public void j(AbstractC3595n abstractC3595n, long j) {
        i(abstractC3595n.R(), abstractC3595n.E(), j);
    }
}
