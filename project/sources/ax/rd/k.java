package ax.rd;

import ax.Wc.A;
import ax.Wc.AbstractC1093c;
import ax.Wc.AbstractC1126t;
import ax.Wc.C1110k0;

/* loaded from: classes3.dex */
public class k extends AbstractC1126t {
    private AbstractC1093c q;

    public k(int i) {
        this.q = new C1110k0(i);
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        return this.q;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        byte[] D = this.q.D();
        if (D.length == 1) {
            sb = new StringBuilder();
            sb.append("KeyUsage: 0x");
            i = D[0] & 255;
        } else {
            sb = new StringBuilder();
            sb.append("KeyUsage: 0x");
            i = (D[0] & 255) | ((D[1] & 255) << 8);
        }
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }
}
