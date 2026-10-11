package ax.Z2;

import com.voxdon.xplorer.file.AbstractC3595n;
import java.io.Serializable;

/* loaded from: classes.dex */
public class p implements Serializable {
    public String j0;
    public String k0;
    public String l0;
    public long q = -1;
    public long c0 = -1;
    public long d0 = -1;
    public long e0 = -1;
    public String f0 = null;
    public int g0 = -1;
    public int h0 = -1;
    public int i0 = -1;

    public boolean a() {
        return this.q < 0 && this.c0 < 0 && this.d0 < 0 && this.e0 < 0 && this.f0 == null;
    }

    public boolean b() {
        return this.d0 >= 0 || this.e0 >= 0;
    }

    public boolean c() {
        return this.q >= 0 || this.c0 >= 0;
    }

    public boolean d() {
        return this.f0 != null;
    }

    public boolean e(AbstractC3595n abstractC3595n) {
        if (c()) {
            long q = abstractC3595n.q();
            long j = this.q;
            if (j >= 0 && q < j) {
                return false;
            }
            long j2 = this.c0;
            if (j2 >= 0 && q > j2) {
                return false;
            }
        }
        if (b()) {
            if (abstractC3595n.isDirectory()) {
                return false;
            }
            long p = abstractC3595n.p();
            long j3 = this.d0;
            if (j3 >= 0 && p < j3) {
                return false;
            }
            long j4 = this.e0;
            if (j4 >= 0 && p > j4) {
                return false;
            }
        }
        if (!d()) {
            return true;
        }
        if (abstractC3595n.isDirectory()) {
            return false;
        }
        String A = abstractC3595n.A();
        String str = this.f0;
        return str == null || str.equals(A);
    }

    public void f(p pVar) {
        this.q = pVar.q;
        this.c0 = pVar.c0;
        this.d0 = pVar.d0;
        this.e0 = pVar.e0;
        this.f0 = pVar.f0;
        this.g0 = pVar.g0;
        this.h0 = pVar.h0;
        this.i0 = pVar.i0;
        this.j0 = pVar.j0;
        this.k0 = pVar.k0;
        this.l0 = pVar.l0;
    }
}
