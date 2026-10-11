package ax.yb;

import ax.Gb.w;

/* loaded from: classes3.dex */
public abstract class l extends AbstractC3523d implements ax.Gb.h<Object> {
    private final int e0;

    public l(int i, ax.wb.e<Object> eVar) {
        super(eVar);
        this.e0 = i;
    }

    @Override // ax.Gb.h
    public int getArity() {
        return this.e0;
    }

    @Override // ax.yb.AbstractC3520a
    public String toString() {
        if (h() != null) {
            return super.toString();
        }
        String f = w.f(this);
        ax.Gb.l.e(f, "renderLambdaToString(...)");
        return f;
    }
}
