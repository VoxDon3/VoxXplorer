package ax.yb;

import ax.Gb.w;

/* loaded from: classes3.dex */
public abstract class k extends j implements ax.Gb.h<Object> {
    private final int c0;

    public k(int i, ax.wb.e<Object> eVar) {
        super(eVar);
        this.c0 = i;
    }

    @Override // ax.Gb.h
    public int getArity() {
        return this.c0;
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
