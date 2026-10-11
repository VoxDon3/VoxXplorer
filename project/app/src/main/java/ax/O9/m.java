/*
 * Decompiled with CFR 0.152.
 */
package ax.O9;

import ax.M9.d;
import ax.M9.f;
import ax.O9.D;
import ax.P9.b;
import ax.P9.k;
import ax.S9.c;
import com.microsoft.graph.extensions.Drive;
import java.util.List;

public class m
extends b
implements D {
    public m(String string, f f8, List<c> list, Class clazz) {
        super(string, f8, list, clazz);
    }

    @Override
    public void c(ax.L9.c<Drive> c8) {
        this.s(k.q, c8, null);
    }

    @Override
    public Drive get() throws d {
        return (Drive)this.r(k.q, null);
    }
}

