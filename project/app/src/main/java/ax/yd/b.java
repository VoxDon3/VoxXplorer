/*
 * Decompiled with CFR 0.152.
 */
package ax.yd;

import ax.Dd.j;
import ax.Dd.k;
import ax.vd.f;
import ax.vd.g;
import ax.vd.h;
import ax.vd.l;
import java.math.BigInteger;

public class b
implements g {
    private static final BigInteger i = BigInteger.valueOf(Integer.MAX_VALUE);
    private static final BigInteger j = BigInteger.valueOf(2L);
    private final l a;
    private final int b;
    private byte[] c;
    private byte[] d;
    private int e;
    private byte[] f;
    private int g;
    private byte[] h;

    public b(l l8) {
        int n8;
        this.a = l8;
        this.b = n8 = l8.a();
        this.h = new byte[n8];
    }

    private void c() {
        int n8 = this.g / this.b + 1;
        Object object = this.f;
        int n9 = ((byte[])object).length;
        if (n9 != 1) {
            if (n9 != 2) {
                if (n9 != 3) {
                    if (n9 == 4) {
                        object[0] = (byte)(n8 >>> 24);
                    } else {
                        throw new IllegalStateException("Unsupported size of counter i");
                    }
                }
                object[((byte[])object).length - 3] = (byte)(n8 >>> 16);
            }
            object[((byte[])object).length - 2] = (byte)(n8 >>> 8);
        }
        object[((byte[])object).length - 1] = (byte)n8;
        Object object2 = this.a;
        object = this.c;
        object2.b((byte[])object, 0, ((byte[])object).length);
        object = this.a;
        object2 = this.f;
        object.b((byte[])object2, 0, ((Object)object2).length);
        object2 = this.a;
        object = this.d;
        object2.b((byte[])object, 0, ((byte[])object).length);
        this.a.c(this.h, 0);
    }

    @Override
    public int a(byte[] object, int n8, int n9) throws f, IllegalArgumentException {
        int n10 = this.g;
        int n11 = n10 + n9;
        if (n11 >= 0 && n11 < this.e) {
            if (n10 % this.b == 0) {
                this.c();
            }
            n11 = this.g;
            int n12 = this.b;
            n10 = Math.min(n12 - n11 % n12, n9);
            System.arraycopy(this.h, n11 % n12, object, n8, n10);
            this.g += n10;
            n12 = n9 - n10;
            n11 = n8;
            n8 = n12;
            while (true) {
                n11 += n10;
                if (n8 <= 0) break;
                this.c();
                n10 = Math.min(this.b, n8);
                System.arraycopy(this.h, 0, object, n11, n10);
                this.g += n10;
                n8 -= n10;
            }
            return n9;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Current KDFCTR may only be used for ");
        ((StringBuilder)object).append(this.e);
        ((StringBuilder)object).append(" bytes");
        throw new f(((StringBuilder)object).toString());
    }

    @Override
    public void b(h object) {
        if (object instanceof j) {
            object = (j)object;
            this.a.e(new k(((j)object).c()));
            this.c = ((j)object).a();
            this.d = ((j)object).b();
            int n8 = ((j)object).d();
            this.f = new byte[n8 / 8];
            object = j.pow(n8).multiply(BigInteger.valueOf(this.b));
            n8 = ((BigInteger)object).compareTo(i) == 1 ? Integer.MAX_VALUE : ((BigInteger)object).intValue();
            this.e = n8;
            this.g = 0;
            return;
        }
        throw new IllegalArgumentException("Wrong type of arguments given");
    }
}

