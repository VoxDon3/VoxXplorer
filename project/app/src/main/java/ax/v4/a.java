/*
 * Decompiled with CFR 0.152.
 */
package ax.v4;

import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import java.io.IOException;

public abstract class a<T>
extends c<T> {
    protected static boolean p(j j8) throws IOException, i {
        return j8.j() == m.p0 && ".tag".equals(j8.g());
    }

    protected static String q(j j8) throws IOException, i {
        if (!a.p(j8)) {
            return null;
        }
        j8.H();
        String string = c.i(j8);
        j8.H();
        return string;
    }

    protected void r(String string, g g8) throws IOException, f {
        if (string != null) {
            g8.u0(".tag", string);
        }
    }
}

