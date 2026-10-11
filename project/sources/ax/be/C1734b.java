package ax.be;

import java.io.InputStream;

/* renamed from: ax.be.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1734b extends AbstractC1738f {
    public C1734b() {
        super(2);
    }

    @Override // ax.be.r
    public InputStream c(InputStream inputStream, C1735c c1735c) {
        return new H(inputStream, new ax.je.b(false, this.c0));
    }

    @Override // ax.be.AbstractC1738f
    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    @Override // ax.be.r
    public s f(s sVar, C1735c c1735c) {
        return new I(sVar, new ax.je.b(true, this.c0));
    }
}
