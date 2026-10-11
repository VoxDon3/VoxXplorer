/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.j;
import ax.pb.s;
import ax.qb.d;
import java.util.Date;

class J
extends s
implements j {
    private int C0 = 0;
    private long D0 = 0L;
    private long E0;
    private int F0 = 0;

    J(long l8) {
        this.E0 = l8;
        this.d0 = (byte)8;
    }

    @Override
    public long a() {
        return this.D0 + this.E0;
    }

    @Override
    public int b() {
        return this.C0;
    }

    @Override
    public long c() {
        return this.D0 + this.E0;
    }

    @Override
    int g(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    public long getSize() {
        return this.F0;
    }

    @Override
    int l(byte[] byArray, int n8) {
        if (this.o0 == 0) {
            return 0;
        }
        this.C0 = s.i(byArray, n8);
        this.D0 = s.r(byArray, n8 + 2);
        this.F0 = s.j(byArray, n8 + 6);
        return 20;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbComQueryInformationResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",fileAttributes=0x");
        stringBuilder.append(d.c(this.C0, 4));
        stringBuilder.append(",lastWriteTime=");
        stringBuilder.append(new Date(this.D0));
        stringBuilder.append(",fileSize=");
        stringBuilder.append(this.F0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int z(byte[] byArray, int n8) {
        return 0;
    }
}

