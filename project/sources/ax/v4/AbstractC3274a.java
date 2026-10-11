package ax.v4;

import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import java.io.IOException;

/* renamed from: ax.v4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3274a<T> extends AbstractC3276c<T> {
    protected static boolean p(j jVar) throws IOException, i {
        return jVar.j() == m.FIELD_NAME && ".tag".equals(jVar.g());
    }

    protected static String q(j jVar) throws IOException, i {
        if (!p(jVar)) {
            return null;
        }
        jVar.H();
        String i = AbstractC3276c.i(jVar);
        jVar.H();
        return i;
    }

    protected void r(String str, ax.T4.g gVar) throws IOException, ax.T4.f {
        if (str != null) {
            gVar.u0(".tag", str);
        }
    }
}
