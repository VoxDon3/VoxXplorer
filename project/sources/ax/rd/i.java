package ax.rd;

import ax.Wc.A;
import ax.Wc.AbstractC1126t;
import ax.Wc.C1135x0;

/* loaded from: classes3.dex */
public class i extends AbstractC1126t {
    private final h[] q;

    public i(h[] hVarArr) {
        this.q = r(hVarArr);
    }

    private static h[] r(h[] hVarArr) {
        h[] hVarArr2 = new h[hVarArr.length];
        System.arraycopy(hVarArr, 0, hVarArr2, 0, hVarArr.length);
        return hVarArr2;
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        return new C1135x0(this.q);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d = ax.Nd.j.d();
        stringBuffer.append("GeneralNames:");
        stringBuffer.append(d);
        for (int i = 0; i != this.q.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(this.q[i]);
            stringBuffer.append(d);
        }
        return stringBuffer.toString();
    }
}
