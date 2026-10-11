/*
 * Decompiled with CFR 0.152.
 */
package ax.lc;

import ax.lc.b;
import ax.lc.c;
import ax.oc.a;
import java.util.Arrays;

public class a
implements c {
    private ax.nc.a a;
    private ax.mc.a b;
    private int c = 1;
    private byte[] d = new byte[16];
    private byte[] e = new byte[16];

    public a(ax.rc.a a8, char[] cArray, byte[] byArray, byte[] byArray2, boolean bl) throws ax.oc.a {
        this.c(byArray, byArray2, cArray, a8, bl);
    }

    private void c(byte[] byArray, byte[] byArray2, char[] cArray, ax.rc.a object, boolean bl) throws ax.oc.a {
        if (cArray != null && cArray.length > 0) {
            if (Arrays.equals(byArray2, ax.lc.b.b(byArray = ax.lc.b.a(byArray, cArray, (ax.sc.a)((Object)(object = object.b())), bl), (ax.sc.a)((Object)object)))) {
                this.a = ax.lc.b.c(byArray, (ax.sc.a)((Object)object));
                this.b = ax.lc.b.d(byArray, (ax.sc.a)((Object)object));
                return;
            }
            throw new ax.oc.a("Wrong Password", a.a.q);
        }
        throw new ax.oc.a("empty or null password provided for AES decryption", a.a.q);
    }

    @Override
    public int a(byte[] byArray, int n8, int n9) throws ax.oc.a {
        int n10;
        int n11 = n8;
        while (n11 < (n10 = n8 + n9)) {
            int n12 = n11 + 16;
            n10 = n12 <= n10 ? 16 : (n10 -= n11);
            this.b.f(byArray, n11, n10);
            ax.lc.b.e(this.d, this.c);
            this.a.e(this.d, this.e);
            for (int i8 = 0; i8 < n10; ++i8) {
                int n13 = n11 + i8;
                byArray[n13] = (byte)(byArray[n13] ^ this.e[i8]);
            }
            ++this.c;
            n11 = n12;
        }
        return n9;
    }

    public byte[] b(int n8) {
        return this.b.d(n8);
    }
}

