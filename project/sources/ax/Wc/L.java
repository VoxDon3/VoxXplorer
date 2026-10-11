package ax.Wc;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes3.dex */
public class L extends A {
    static final O c0 = new a(L.class, 23);
    final byte[] q;

    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return L.C(c1127t0.G());
        }
    }

    public L(String str) {
        this.q = ax.Nd.j.e(str);
        try {
            E();
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: " + e.getMessage());
        }
    }

    static L C(byte[] bArr) {
        return new L(bArr);
    }

    private boolean I(int i) {
        byte b;
        byte[] bArr = this.q;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    public String D() {
        StringBuilder sb;
        String str;
        String G = G();
        if (G.charAt(0) < '5') {
            sb = new StringBuilder();
            str = "20";
        } else {
            sb = new StringBuilder();
            str = "19";
        }
        sb.append(str);
        sb.append(G);
        return sb.toString();
    }

    public Date E() throws ParseException {
        return S0.a(new SimpleDateFormat("yyMMddHHmmssz").parse(G()));
    }

    public String G() {
        StringBuilder sb;
        String substring;
        String b = ax.Nd.j.b(this.q);
        if (b.indexOf(45) >= 0 || b.indexOf(43) >= 0) {
            int indexOf = b.indexOf(45);
            if (indexOf < 0) {
                indexOf = b.indexOf(43);
            }
            if (indexOf == b.length() - 3) {
                b = b + "00";
            }
            if (indexOf == 10) {
                sb = new StringBuilder();
                sb.append(b.substring(0, 10));
                sb.append("00GMT");
                sb.append(b.substring(10, 13));
                sb.append(":");
                substring = b.substring(13, 15);
            } else {
                sb = new StringBuilder();
                sb.append(b.substring(0, 12));
                sb.append("GMT");
                sb.append(b.substring(12, 15));
                sb.append(":");
                substring = b.substring(15, 17);
            }
        } else if (b.length() == 11) {
            sb = new StringBuilder();
            sb.append(b.substring(0, 10));
            substring = "00GMT+00:00";
        } else {
            sb = new StringBuilder();
            sb.append(b.substring(0, 12));
            substring = "GMT+00:00";
        }
        sb.append(substring);
        return sb.toString();
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        return ax.Nd.a.l(this.q);
    }

    @Override // ax.Wc.A
    boolean r(A a2) {
        if (a2 instanceof L) {
            return ax.Nd.a.b(this.q, ((L) a2).q);
        }
        return false;
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.o(z, 23, this.q);
    }

    @Override // ax.Wc.A
    final boolean t() {
        return false;
    }

    public String toString() {
        return ax.Nd.j.b(this.q);
    }

    @Override // ax.Wc.A
    int w(boolean z) {
        return C1136y.g(z, this.q.length);
    }

    L(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.q = bArr;
        if (!I(0) || !I(1)) {
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
    }
}
