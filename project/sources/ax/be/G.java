package ax.be;

import java.io.InputStream;

/* loaded from: classes3.dex */
public class G extends AbstractC1738f {
    public G() {
        super(4);
    }

    @Override // ax.be.r
    public InputStream c(InputStream inputStream, C1735c c1735c) {
        return new H(inputStream, new ax.je.e(false, this.c0));
    }

    @Override // ax.be.AbstractC1738f
    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    @Override // ax.be.r
    public s f(s sVar, C1735c c1735c) {
        return new I(sVar, new ax.je.e(true, this.c0));
    }
}
