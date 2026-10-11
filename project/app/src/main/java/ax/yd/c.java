/*
 * Decompiled with CFR 0.152.
 */
package ax.yd;

import ax.Dd.k;
import ax.vd.d;
import ax.vd.i;
import ax.vd.l;
import ax.vd.o;

public class c
extends o {
    private l d;
    private byte[] e;

    public c(i object) {
        this.d = object = new ax.zd.c((i)object);
        this.e = new byte[object.a()];
    }

    private void c(byte[] object, int n8, byte[] byArray, byte[] byArray2, int n9) {
        if (n8 != 0) {
            if (object != null) {
                this.d.b((byte[])object, 0, ((byte[])object).length);
            }
            this.d.b(byArray, 0, byArray.length);
            this.d.c(this.e, 0);
            object = this.e;
            System.arraycopy(object, 0, byArray2, n9, ((byte[])object).length);
            for (int i8 = 1; i8 < n8; ++i8) {
                object = this.d;
                byArray = this.e;
                object.b(byArray, 0, byArray.length);
                this.d.c(this.e, 0);
                for (int i9 = 0; i9 != ((byte[])(object = (Object)this.e)).length; ++i9) {
                    int n10 = n9 + i9;
                    byte by = byArray2[n10];
                    byArray2[n10] = (byte)(object[i9] ^ by);
                }
            }
            return;
        }
        throw new IllegalArgumentException("iteration count must be at least 1.");
    }

    private byte[] d(int n8) {
        int n9 = this.d.a();
        int n10 = (n8 + n9 - 1) / n9;
        byte[] byArray = new byte[4];
        byte[] byArray2 = new byte[n10 * n9];
        k k8 = new k(this.a);
        this.d.e(k8);
        int n11 = 0;
        for (n8 = 1; n8 <= n10; ++n8) {
            int n12 = 3;
            while (true) {
                byte by;
                byArray[n12] = by = (byte)(byArray[n12] + 1);
                if (by != 0) break;
                --n12;
            }
            this.c(this.b, this.c, byArray, byArray2, n11);
            n11 += n9;
        }
        return byArray2;
    }

    @Override
    public d a(int n8) {
        return this.e(n8);
    }

    public d e(int n8) {
        return new k(this.d(n8 /= 8), 0, n8);
    }
}

