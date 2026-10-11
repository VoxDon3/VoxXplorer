package ax.C1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.C0912v;
import ax.q7.C2876c;
import ax.u7.C3218f;

@Deprecated
/* loaded from: classes.dex */
public class b implements C.a {
    public final String a;
    public final String b;

    public b(String str, String str2) {
        this.a = C2876c.f(str);
        this.b = str2;
    }

    @Override // ax.P0.C.a
    public /* synthetic */ C0912v a() {
        return B.b(this);
    }

    @Override // ax.P0.C.a
    public void b(A.b bVar) {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer p = C3218f.p(this.b);
                if (p != null) {
                    bVar.r0(p);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer p2 = C3218f.p(this.b);
                if (p2 != null) {
                    bVar.q0(p2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer p3 = C3218f.p(this.b);
                if (p3 != null) {
                    bVar.s0(p3);
                    break;
                }
                break;
            case "ALBUM":
                bVar.P(this.b);
                break;
            case "GENRE":
                bVar.c0(this.b);
                break;
            case "TITLE":
                bVar.p0(this.b);
                break;
            case "DESCRIPTION":
                bVar.W(this.b);
                break;
            case "DISCNUMBER":
                Integer p4 = C3218f.p(this.b);
                if (p4 != null) {
                    bVar.X(p4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                bVar.O(this.b);
                break;
            case "ARTIST":
                bVar.Q(this.b);
                break;
        }
    }

    @Override // ax.P0.C.a
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
