/*
 * Decompiled with CFR 0.152.
 */
package ax.lc;

import ax.lc.c;
import ax.nc.b;
import ax.oc.a;

public class d
implements c {
    private b a = new b();

    public d(char[] cArray, long l8, long l9, byte[] byArray, boolean bl) throws a {
        this.b(byArray, cArray, l9, l8, bl);
    }

    private void b(byte[] byArray, char[] object, long l8, long l9, boolean bl) throws a {
        if (object != null && ((char[])object).length > 0) {
            this.a.c((char[])object, bl);
            byte by = 0;
            byte by2 = byArray[0];
            while (by < 12) {
                byte by3 = by + 1;
                if (by3 == 12 && (by = (byte)((byte)(this.a.b() ^ by2))) != (byte)(l9 >> 24) && by != (byte)(l8 >> 8)) {
                    throw new a("Wrong password!", a.a.q);
                }
                object = this.a;
                ((b)object).d((byte)(((b)object).b() ^ by2));
                by = by3;
                if (by3 == 12) continue;
                by2 = byArray[by3];
                by = by3;
            }
            return;
        }
        throw new a("Wrong password!", a.a.q);
    }

    @Override
    public int a(byte[] byArray, int n8, int n9) throws a {
        if (n8 >= 0 && n9 >= 0) {
            for (int i8 = n8; i8 < n8 + n9; ++i8) {
                byte by = byArray[i8];
                byte by2 = this.a.b();
                b b8 = this.a;
                byte by3 = (byte)((by & 0xFF ^ by2) & 0xFF);
                b8.d(by3);
                byArray[i8] = by3;
            }
            return n9;
        }
        throw new a("one of the input parameters were null in standard decrypt data");
    }
}

