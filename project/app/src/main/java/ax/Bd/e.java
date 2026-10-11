/*
 * Decompiled with CFR 0.152.
 */
package ax.Bd;

import ax.Bd.c;
import ax.Bd.d;
import ax.Nd.h;

public class e
implements c {
    private byte[] a;
    private long[][] b;

    @Override
    public void a(byte[] object) {
        block5: {
            int n8;
            Object object2;
            block4: {
                block3: {
                    object2 = this.b;
                    n8 = 2;
                    if (object2 != null) break block3;
                    this.b = new long[256][2];
                    break block4;
                }
                if (d.a(this.a, object) != 0) break block5;
            }
            object2 = new byte[16];
            this.a = (byte[])object2;
            d.e(object, (byte[])object2);
            d.c(this.a, this.b[1]);
            object = this.b[1];
            d.k(object, object);
            while (n8 < 256) {
                object = this.b;
                d.g((long[])object[n8 >> 1], (long[])object[n8]);
                object = this.b;
                d.s((long[])object[n8], (long[])object[1], (long[])object[n8 + 1]);
                n8 += 2;
            }
        }
    }

    @Override
    public void b(byte[] byArray) {
        long[] lArray = this.b[byArray[15] & 0xFF];
        long l8 = lArray[0];
        long l9 = lArray[1];
        for (int i8 = 14; i8 >= 0; --i8) {
            lArray = this.b[byArray[i8] & 0xFF];
            long l10 = l9 << 56;
            l9 = (l9 >>> 8 | l8 << 56) ^ lArray[1];
            l8 = l8 >>> 8 ^ lArray[0] ^ l10 ^ l10 >>> 1 ^ l10 >>> 2 ^ l10 >>> 7;
        }
        h.n(l8, byArray, 0);
        h.n(l9, byArray, 8);
    }
}

