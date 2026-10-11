package ax.I0;

import androidx.lifecycle.p;
import androidx.lifecycle.q;
import ax.Fb.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class c {
    private final List<f<?>> a = new ArrayList();

    public final <T extends p> void a(ax.Mb.b<T> bVar, l<? super a, ? extends T> lVar) {
        ax.Gb.l.f(bVar, "clazz");
        ax.Gb.l.f(lVar, "initializer");
        this.a.add(new f<>(ax.Eb.a.a(bVar), lVar));
    }

    public final q.b b() {
        f[] fVarArr = (f[]) this.a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
