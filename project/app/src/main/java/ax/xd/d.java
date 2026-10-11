/*
 * Decompiled with CFR 0.152.
 */
package ax.xd;

import ax.Dd.k;
import ax.vd.f;
import ax.vd.n;
import ax.vd.t;

public class d
implements t {
    private byte[] a = null;
    private int b = 0;
    private int c = 0;
    private byte[] d = null;

    private void b(byte[] byArray) {
        int n8;
        this.d = byArray;
        int n9 = 0;
        this.b = 0;
        this.c = 0;
        if (this.a == null) {
            this.a = new byte[256];
        }
        for (n8 = 0; n8 < 256; ++n8) {
            this.a[n8] = (byte)n8;
        }
        int n10 = 0;
        int n11 = 0;
        for (n8 = n9; n8 < 256; ++n8) {
            n9 = byArray[n10];
            byte[] byArray2 = this.a;
            byte by = byArray2[n8];
            n11 = (n9 & 0xFF) + by + n11 & 0xFF;
            byArray2[n8] = byArray2[n11];
            byArray2[n11] = by;
            n10 = (n10 + 1) % byArray.length;
        }
    }

    @Override
    public void a() {
        this.b(this.d);
    }

    @Override
    public void e(boolean bl, ax.vd.d object) {
        if (object instanceof k) {
            object = ((k)object).a();
            this.d = (byte[])object;
            this.b((byte[])object);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("invalid parameter passed to RC4 init - ");
        stringBuilder.append(object.getClass().getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public int g(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) {
        if (n8 + n9 <= byArray.length) {
            if (n10 + n9 <= byArray2.length) {
                for (int i8 = 0; i8 < n9; ++i8) {
                    int n11;
                    int n12;
                    this.b = n12 = this.b + 1 & 0xFF;
                    byte[] byArray3 = this.a;
                    byte by = byArray3[n12];
                    this.c = n11 = this.c + by & 0xFF;
                    byArray3[n12] = byArray3[n11];
                    byArray3[n11] = by;
                    n11 = byArray[i8 + n8];
                    byArray2[i8 + n10] = (byte)(byArray3[byArray3[n12] + by & 0xFF] ^ n11);
                }
                return n9;
            }
            throw new n("output buffer too short");
        }
        throw new f("input buffer too short");
    }
}

