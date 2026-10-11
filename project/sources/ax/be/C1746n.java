package ax.be;

import java.io.InputStream;

/* renamed from: ax.be.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1746n extends r {
    private int q = 1;

    public C1746n(int i) throws L {
        i(i);
    }

    @Override // ax.be.r
    public InputStream c(InputStream inputStream, C1735c c1735c) {
        return new C1745m(inputStream, this.q);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }

    @Override // ax.be.r
    public s f(s sVar, C1735c c1735c) {
        return new C1747o(sVar, this);
    }

    public int h() {
        return this.q;
    }

    public void i(int i) throws L {
        if (i >= 1 && i <= 256) {
            this.q = i;
            return;
        }
        throw new L("Delta distance must be in the range [1, 256]: " + i);
    }
}
