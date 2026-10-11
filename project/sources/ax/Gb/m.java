package ax.Gb;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class m<R> implements h<R>, Serializable {
    private final int arity;

    public m(int i) {
        this.arity = i;
    }

    @Override // ax.Gb.h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String g = w.g(this);
        l.e(g, "renderLambdaToString(...)");
        return g;
    }
}
