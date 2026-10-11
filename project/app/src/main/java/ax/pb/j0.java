/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.h;
import ax.qb.d;

public class j0
implements h {
    protected String a;
    protected int b;
    protected String c;

    public j0() {
    }

    public j0(String string, int n8, String string2) {
        this.a = string;
        this.b = n8;
        this.c = string2;
    }

    @Override
    public int a() {
        int n8 = this.b & 0xFFFF;
        if (n8 != 1) {
            if (n8 != 3) {
                return 8;
            }
            return 16;
        }
        return 32;
    }

    @Override
    public int b() {
        return 17;
    }

    @Override
    public long c() {
        return 0L;
    }

    public boolean equals(Object object) {
        if (object instanceof j0) {
            object = (j0)object;
            return this.a.equals(((j0)object).a);
        }
        return false;
    }

    @Override
    public String getName() {
        return this.a;
    }

    @Override
    public long h() {
        return 0L;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public long length() {
        return 0L;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbShareInfo[netName=");
        stringBuilder.append(this.a);
        stringBuilder.append(",type=0x");
        stringBuilder.append(d.c(this.b, 8));
        stringBuilder.append(",remark=");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

