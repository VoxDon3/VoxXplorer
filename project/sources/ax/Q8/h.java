package ax.Q8;

import ax.Z8.a;
import ax.h9.C2171b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class h {
    private List<c> a = new ArrayList();

    public static class b implements c {
        private long a;

        public b a(C2171b c2171b) throws a.b {
            this.a = c2171b.N();
            return this;
        }

        private b() {
        }
    }

    public interface c {
    }

    public static class d implements c {
        private boolean a;
        private int b;
        private String c;
        private String d;

        /* JADX INFO: Access modifiers changed from: private */
        public d e(C2171b c2171b) throws a.b {
            int S = c2171b.S() + c2171b.P();
            c2171b.U(4);
            c2171b.U(4);
            c2171b.U(2);
            this.b = c2171b.J();
            int J = c2171b.J();
            int J2 = c2171b.J();
            int J3 = c2171b.J();
            int J4 = c2171b.J();
            this.a = c2171b.N() == 0;
            this.c = f(c2171b, J, J2);
            this.d = f(c2171b, J3, J4);
            c2171b.T(S);
            return this;
        }

        private String f(C2171b c2171b, int i, int i2) throws a.b {
            String str;
            int S = c2171b.S();
            if (i2 > 0) {
                c2171b.T(i + S);
                str = c2171b.H(ax.Y8.b.d, i2 / 2);
            } else {
                str = null;
            }
            c2171b.T(S);
            return str;
        }

        public String b() {
            return this.c;
        }

        public int c() {
            return this.b;
        }

        public boolean d() {
            return this.a;
        }

        private d() {
        }
    }

    private void c(t tVar, C2171b c2171b, int i) throws a.b {
        for (int i2 = 0; i2 < i && c2171b.c() > 0; i2++) {
            c2171b.P();
            c2171b.U(4);
            d(tVar, c2171b);
        }
    }

    private void d(t tVar, C2171b c2171b) throws a.b {
        long m = tVar.m();
        if (m == ax.K8.a.STATUS_BUFFER_TOO_SMALL.getValue()) {
            this.a.add(new b().a(c2171b));
        } else if (m == ax.K8.a.STATUS_STOPPED_ON_SYMLINK.getValue()) {
            this.a.add(new d().e(c2171b));
        }
    }

    public List<c> a() {
        return this.a;
    }

    h b(t tVar, C2171b c2171b) throws a.b {
        c2171b.U(2);
        byte z = c2171b.z();
        c2171b.U(1);
        int P = c2171b.P();
        if (z > 0) {
            c(tVar, c2171b, z);
            return this;
        }
        if (P > 0) {
            d(tVar, c2171b);
            return this;
        }
        if (P == 0 && c2171b.c() > 0) {
            c2171b.U(1);
        }
        return this;
    }
}
