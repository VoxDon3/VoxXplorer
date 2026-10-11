package ax.rd;

import ax.Wc.A;
import ax.Wc.A0;
import ax.Wc.AbstractC1117o;
import ax.Wc.AbstractC1126t;
import ax.Wc.C1122q0;
import ax.Wc.C1127t0;
import ax.Wc.C1130v;
import ax.Wc.InterfaceC1099f;
import ax.Wc.InterfaceC1101g;
import java.util.StringTokenizer;

/* loaded from: classes3.dex */
public class h extends AbstractC1126t implements InterfaceC1099f {
    private int c0;
    private InterfaceC1101g q;

    public h(int i, String str) {
        this.c0 = i;
        if (i == 1 || i == 2 || i == 6) {
            this.q = new C1122q0(str);
            return;
        }
        if (i == 8) {
            this.q = new C1130v(str);
            return;
        }
        if (i == 4) {
            this.q = new ax.pd.c(str);
            return;
        }
        if (i != 7) {
            throw new IllegalArgumentException("can't process String for tag: " + i);
        }
        byte[] x = x(str);
        if (x == null) {
            throw new IllegalArgumentException("IP Address is invalid");
        }
        this.q = new C1127t0(x);
    }

    private void r(int[] iArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 != iArr.length; i2++) {
            int i3 = i2 * 2;
            int i4 = iArr[i2];
            bArr[i3 + i] = (byte) (i4 >> 8);
            bArr[i3 + 1 + i] = (byte) i4;
        }
    }

    private void s(String str, byte[] bArr, int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "./");
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            bArr[i2 + i] = (byte) Integer.parseInt(stringTokenizer.nextToken());
            i2++;
        }
    }

    private void t(String str, byte[] bArr, int i) {
        int parseInt = Integer.parseInt(str);
        for (int i2 = 0; i2 != parseInt; i2++) {
            int i3 = (i2 / 8) + i;
            bArr[i3] = (byte) (bArr[i3] | (1 << (7 - (i2 % 8))));
        }
    }

    private int[] u(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ":", true);
        int[] iArr = new int[8];
        if (str.charAt(0) == ':' && str.charAt(1) == ':') {
            stringTokenizer.nextToken();
        }
        int i = -1;
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals(":")) {
                iArr[i2] = 0;
                int i3 = i2;
                i2++;
                i = i3;
            } else if (nextToken.indexOf(46) < 0) {
                int i4 = i2 + 1;
                iArr[i2] = Integer.parseInt(nextToken, 16);
                if (stringTokenizer.hasMoreTokens()) {
                    stringTokenizer.nextToken();
                }
                i2 = i4;
            } else {
                StringTokenizer stringTokenizer2 = new StringTokenizer(nextToken, ".");
                int i5 = i2 + 1;
                iArr[i2] = (Integer.parseInt(stringTokenizer2.nextToken()) << 8) | Integer.parseInt(stringTokenizer2.nextToken());
                i2 += 2;
                iArr[i5] = Integer.parseInt(stringTokenizer2.nextToken()) | (Integer.parseInt(stringTokenizer2.nextToken()) << 8);
            }
        }
        if (i2 != 8) {
            int i6 = i2 - i;
            int i7 = 8 - i6;
            System.arraycopy(iArr, i, iArr, i7, i6);
            while (i != i7) {
                iArr[i] = 0;
                i++;
            }
        }
        return iArr;
    }

    private int[] w(String str) {
        int[] iArr = new int[8];
        int parseInt = Integer.parseInt(str);
        for (int i = 0; i != parseInt; i++) {
            int i2 = i / 16;
            iArr[i2] = iArr[i2] | (1 << (15 - (i % 16)));
        }
        return iArr;
    }

    private byte[] x(String str) {
        if (ax.Nd.c.e(str) || ax.Nd.c.d(str)) {
            int indexOf = str.indexOf(47);
            if (indexOf < 0) {
                byte[] bArr = new byte[16];
                r(u(str), bArr, 0);
                return bArr;
            }
            byte[] bArr2 = new byte[32];
            r(u(str.substring(0, indexOf)), bArr2, 0);
            String substring = str.substring(indexOf + 1);
            r(substring.indexOf(58) > 0 ? u(substring) : w(substring), bArr2, 16);
            return bArr2;
        }
        if (!ax.Nd.c.c(str) && !ax.Nd.c.b(str)) {
            return null;
        }
        int indexOf2 = str.indexOf(47);
        if (indexOf2 < 0) {
            byte[] bArr3 = new byte[4];
            s(str, bArr3, 0);
            return bArr3;
        }
        byte[] bArr4 = new byte[8];
        s(str.substring(0, indexOf2), bArr4, 0);
        String substring2 = str.substring(indexOf2 + 1);
        if (substring2.indexOf(46) > 0) {
            s(substring2, bArr4, 4);
            return bArr4;
        }
        t(substring2, bArr4, 4);
        return bArr4;
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        int i = this.c0;
        return new A0(i == 4, i, this.q);
    }

    public String toString() {
        String h;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.c0);
        stringBuffer.append(": ");
        int i = this.c0;
        if (i != 1 && i != 2) {
            if (i == 4) {
                h = ax.pd.c.r(this.q).toString();
            } else if (i != 6) {
                h = this.q.toString();
            }
            stringBuffer.append(h);
            return stringBuffer.toString();
        }
        h = AbstractC1117o.D(this.q).h();
        stringBuffer.append(h);
        return stringBuffer.toString();
    }
}
