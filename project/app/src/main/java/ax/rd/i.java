/*
 * Decompiled with CFR 0.152.
 */
package ax.rd;

import ax.Nd.j;
import ax.Wc.A;
import ax.Wc.t;
import ax.Wc.x0;
import ax.rd.h;

public class i
extends t {
    private final h[] q;

    public i(h[] hArray) {
        this.q = i.r(hArray);
    }

    private static h[] r(h[] hArray) {
        h[] hArray2 = new h[hArray.length];
        System.arraycopy(hArray, 0, hArray2, 0, hArray.length);
        return hArray2;
    }

    @Override
    public A g() {
        return new x0(this.q);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = j.d();
        stringBuffer.append("GeneralNames:");
        stringBuffer.append(string);
        for (int i8 = 0; i8 != this.q.length; ++i8) {
            stringBuffer.append("    ");
            stringBuffer.append(this.q[i8]);
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }
}

