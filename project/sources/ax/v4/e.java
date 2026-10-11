package ax.v4;

import ax.T4.i;
import ax.T4.j;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class e<T> extends AbstractC3274a<T> {
    @Override // ax.v4.AbstractC3276c
    public T a(j jVar) throws IOException, i {
        return s(jVar, false);
    }

    @Override // ax.v4.AbstractC3276c
    public void k(T t, ax.T4.g gVar) throws IOException, ax.T4.f {
        t(t, gVar, false);
    }

    public abstract T s(j jVar, boolean z) throws IOException, i;

    public abstract void t(T t, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f;
}
