package ax.Z3;

import android.graphics.drawable.Drawable;
import ax.P3.p;
import ax.P3.s;
import ax.k4.h;

/* loaded from: classes.dex */
public abstract class a<T extends Drawable> implements s<T>, p {
    protected final T q;

    public a(T t) {
        this.q = (T) h.d(t);
    }

    @Override // ax.P3.s
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final T get() {
        return (T) this.q.getConstantState().newDrawable();
    }
}
