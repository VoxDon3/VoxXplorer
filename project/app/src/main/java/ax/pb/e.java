/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.a0;
import java.util.Map;

public class e
extends a0 {
    public int d0;
    public long e0;
    public String f0;
    public String g0;
    public String h0;
    public String i0;
    public boolean j0;
    public long k0;
    e l0 = this;
    Map m0;
    String n0 = null;

    void f(e e8) {
        e8.l0 = this.l0;
        this.l0 = e8;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DfsReferral[pathConsumed=");
        stringBuilder.append(this.d0);
        stringBuilder.append(",server=");
        stringBuilder.append(this.f0);
        stringBuilder.append(",share=");
        stringBuilder.append(this.g0);
        stringBuilder.append(",link=");
        stringBuilder.append(this.h0);
        stringBuilder.append(",path=");
        stringBuilder.append(this.i0);
        stringBuilder.append(",ttl=");
        stringBuilder.append(this.e0);
        stringBuilder.append(",expiration=");
        stringBuilder.append(this.k0);
        stringBuilder.append(",resolveHashes=");
        stringBuilder.append(this.j0);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

