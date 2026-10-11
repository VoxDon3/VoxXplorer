/*
 * Decompiled with CFR 0.152.
 */
package ax.rd;

import ax.Wc.A;
import ax.Wc.A0;
import ax.Wc.f;
import ax.Wc.g;
import ax.Wc.o;
import ax.Wc.q0;
import ax.Wc.t;
import ax.Wc.t0;
import ax.Wc.v;
import ax.pd.c;
import java.util.StringTokenizer;

public class h
extends t
implements f {
    private int c0;
    private g q;

    public h(int n8, String object) {
        this.c0 = n8;
        if (n8 != 1 && n8 != 2 && n8 != 6) {
            if (n8 == 8) {
                this.q = new v((String)object);
                return;
            }
            if (n8 == 4) {
                this.q = new c((String)object);
                return;
            }
            if (n8 == 7) {
                if ((object = (Object)this.x((String)object)) != null) {
                    this.q = new t0((byte[])object);
                    return;
                }
                throw new IllegalArgumentException("IP Address is invalid");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("can't process String for tag: ");
            ((StringBuilder)object).append(n8);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        this.q = new q0((String)object);
    }

    private void r(int[] nArray, byte[] byArray, int n8) {
        for (int i8 = 0; i8 != nArray.length; ++i8) {
            int n9 = i8 * 2;
            int n10 = nArray[i8];
            byArray[n9 + n8] = (byte)(n10 >> 8);
            byArray[n9 + 1 + n8] = (byte)n10;
        }
    }

    private void s(String object, byte[] byArray, int n8) {
        object = new StringTokenizer((String)object, "./");
        int n9 = 0;
        while (((StringTokenizer)object).hasMoreTokens()) {
            byArray[n9 + n8] = (byte)Integer.parseInt(((StringTokenizer)object).nextToken());
            ++n9;
        }
    }

    private void t(String string, byte[] byArray, int n8) {
        int n9 = Integer.parseInt(string);
        for (int i8 = 0; i8 != n9; ++i8) {
            int n10 = i8 / 8 + n8;
            byArray[n10] = (byte)(byArray[n10] | 1 << 7 - i8 % 8);
        }
    }

    private int[] u(String object) {
        int n8;
        StringTokenizer stringTokenizer = new StringTokenizer((String)object, ":", true);
        int[] nArray = new int[8];
        if (((String)object).charAt(0) == ':' && ((String)object).charAt(1) == ':') {
            stringTokenizer.nextToken();
        }
        int n9 = -1;
        int n10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            object = stringTokenizer.nextToken();
            if (((String)object).equals(":")) {
                nArray[n10] = 0;
                n8 = n10 + 1;
                n9 = n10;
                n10 = n8;
                continue;
            }
            if (((String)object).indexOf(46) < 0) {
                nArray[n10] = Integer.parseInt((String)object, 16);
                if (stringTokenizer.hasMoreTokens()) {
                    stringTokenizer.nextToken();
                }
                ++n10;
                continue;
            }
            object = new StringTokenizer((String)object, ".");
            nArray[n10] = Integer.parseInt(((StringTokenizer)object).nextToken()) << 8 | Integer.parseInt(((StringTokenizer)object).nextToken());
            n8 = n10 + 2;
            int n11 = Integer.parseInt(((StringTokenizer)object).nextToken());
            nArray[n10 + 1] = Integer.parseInt(((StringTokenizer)object).nextToken()) | n11 << 8;
            n10 = n8;
        }
        if (n10 != 8) {
            n8 = n10 - n9;
            n10 = 8 - n8;
            System.arraycopy(nArray, n9, nArray, n10, n8);
            while (n9 != n10) {
                nArray[n9] = 0;
                ++n9;
            }
        }
        return nArray;
    }

    private int[] w(String string) {
        int[] nArray = new int[8];
        int n8 = Integer.parseInt(string);
        for (int i8 = 0; i8 != n8; ++i8) {
            int n9 = i8 / 16;
            nArray[n9] = nArray[n9] | 1 << 15 - i8 % 16;
        }
        return nArray;
    }

    private byte[] x(String object) {
        if (!ax.Nd.c.e((String)object) && !ax.Nd.c.d((String)object)) {
            if (!ax.Nd.c.c((String)object) && !ax.Nd.c.b((String)object)) {
                return null;
            }
            int n8 = ((String)object).indexOf(47);
            if (n8 < 0) {
                byte[] byArray = new byte[4];
                this.s((String)object, byArray, 0);
                return byArray;
            }
            byte[] byArray = new byte[8];
            this.s(((String)object).substring(0, n8), byArray, 0);
            object = ((String)object).substring(n8 + 1);
            if (((String)object).indexOf(46) > 0) {
                this.s((String)object, byArray, 4);
                return byArray;
            }
            this.t((String)object, byArray, 4);
            return byArray;
        }
        int n9 = ((String)object).indexOf(47);
        if (n9 < 0) {
            byte[] byArray = new byte[16];
            this.r(this.u((String)object), byArray, 0);
            return byArray;
        }
        byte[] byArray = new byte[32];
        this.r(this.u(((String)object).substring(0, n9)), byArray, 0);
        object = ((String)object).substring(n9 + 1);
        object = ((String)object).indexOf(58) > 0 ? (Object)this.u((String)object) : (Object)this.w((String)object);
        this.r((int[])object, byArray, 16);
        return byArray;
    }

    @Override
    public A g() {
        int n8 = this.c0;
        boolean bl = n8 == 4;
        return new A0(bl, n8, this.q);
    }

    /*
     * Unable to fully structure code
     */
    public String toString() {
        block2: {
            block3: {
                var3_1 = new StringBuffer();
                var3_1.append(this.c0);
                var3_1.append(": ");
                var1_2 = this.c0;
                if (var1_2 == 1 || var1_2 == 2) break block2;
                if (var1_2 == 4) break block3;
                if (var1_2 != 6) {
                    var2_3 = this.q.toString();
lbl11:
                    // 3 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                break block2;
            }
            var2_3 = c.r(this.q).toString();
            ** GOTO lbl11
        }
        var2_3 = o.D(this.q).h();
        ** while (true)
        var3_1.append(var2_3);
        return var3_1.toString();
    }
}

