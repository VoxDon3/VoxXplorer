package ax.Wc;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* renamed from: ax.Wc.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1113m extends A {
    static final O c0 = new a(C1113m.class, 24);
    final byte[] q;

    /* renamed from: ax.Wc.m$a */
    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return C1113m.G(c1127t0.G());
        }
    }

    public C1113m(String str) {
        this.q = ax.Nd.j.e(str);
        try {
            I();
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: " + e.getMessage());
        }
    }

    private SimpleDateFormat C() {
        SimpleDateFormat simpleDateFormat = K() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : N() ? new SimpleDateFormat("yyyyMMddHHmmssz") : M() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    private String D(String str) {
        String str2;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str2 = "-";
        } else {
            str2 = "+";
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (3600000 * i)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (K()) {
                    str = P(str);
                }
                if (timeZone.inDaylightTime(C().parse(str + "GMT" + str2 + E(i) + ":" + E(i2)))) {
                    i += str2.equals("+") ? 1 : -1;
                }
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str2 + E(i) + ":" + E(i2);
    }

    private String E(int i) {
        if (i >= 10) {
            return Integer.toString(i);
        }
        return "0" + i;
    }

    static C1113m G(byte[] bArr) {
        return new C1113m(bArr);
    }

    private boolean O(int i) {
        byte b;
        byte[] bArr = this.q;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    private String P(String str) {
        String str2;
        StringBuilder sb;
        char charAt;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (charAt = substring.charAt(i)) && charAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            str2 = substring.substring(0, 4) + substring.substring(i);
            sb = new StringBuilder();
        } else if (i2 == 1) {
            str2 = substring.substring(0, i) + "00" + substring.substring(i);
            sb = new StringBuilder();
        } else {
            if (i2 != 2) {
                return str;
            }
            str2 = substring.substring(0, i) + "0" + substring.substring(i);
            sb = new StringBuilder();
        }
        sb.append(str.substring(0, 14));
        sb.append(str2);
        return sb.toString();
    }

    @Override // ax.Wc.A
    A A() {
        return new C1118o0(this.q);
    }

    @Override // ax.Wc.A
    A B() {
        return new C1118o0(this.q);
    }

    public Date I() throws ParseException {
        SimpleDateFormat C;
        String b = ax.Nd.j.b(this.q);
        if (b.endsWith("Z")) {
            C = K() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : N() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'") : M() ? new SimpleDateFormat("yyyyMMddHHmm'Z'") : new SimpleDateFormat("yyyyMMddHH'Z'");
            C.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (b.indexOf(45) > 0 || b.indexOf(43) > 0) {
            b = J();
            C = C();
        } else {
            C = K() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : N() ? new SimpleDateFormat("yyyyMMddHHmmss") : M() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            C.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (K()) {
            b = P(b);
        }
        return S0.a(C.parse(b));
    }

    public String J() {
        String b = ax.Nd.j.b(this.q);
        if (b.charAt(b.length() - 1) == 'Z') {
            return b.substring(0, b.length() - 1) + "GMT+00:00";
        }
        int length = b.length();
        char charAt = b.charAt(length - 6);
        if ((charAt == '-' || charAt == '+') && b.indexOf("GMT") == length - 9) {
            return b;
        }
        int length2 = b.length();
        int i = length2 - 5;
        char charAt2 = b.charAt(i);
        if (charAt2 == '-' || charAt2 == '+') {
            StringBuilder sb = new StringBuilder();
            sb.append(b.substring(0, i));
            sb.append("GMT");
            int i2 = length2 - 2;
            sb.append(b.substring(i, i2));
            sb.append(":");
            sb.append(b.substring(i2));
            return sb.toString();
        }
        int length3 = b.length() - 3;
        char charAt3 = b.charAt(length3);
        if (charAt3 != '-' && charAt3 != '+') {
            return b + D(b);
        }
        return b.substring(0, length3) + "GMT" + b.substring(length3) + ":00";
    }

    protected boolean K() {
        int i = 0;
        while (true) {
            byte[] bArr = this.q;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    protected boolean M() {
        return O(10) && O(11);
    }

    protected boolean N() {
        return O(12) && O(13);
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        return ax.Nd.a.l(this.q);
    }

    @Override // ax.Wc.A
    boolean r(A a2) {
        if (a2 instanceof C1113m) {
            return ax.Nd.a.b(this.q, ((C1113m) a2).q);
        }
        return false;
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.o(z, 24, this.q);
    }

    @Override // ax.Wc.A
    final boolean t() {
        return false;
    }

    @Override // ax.Wc.A
    int w(boolean z) {
        return C1136y.g(z, this.q.length);
    }

    C1113m(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.q = bArr;
        if (!O(0) || !O(1) || !O(2) || !O(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }
}
