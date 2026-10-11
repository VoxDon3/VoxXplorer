/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import android.database.Cursor;
import ax.s5.a;
import ax.x5.M;
import java.util.Map;

public final class A
implements M.b {
    public final M a;
    public final Map b;
    public final a.a c;

    public /* synthetic */ A(M m8, Map map, a.a a8) {
        this.a = m8;
        this.b = map;
        this.c = a8;
    }

    public final Object apply(Object object) {
        return M.F(this.a, this.b, this.c, (Cursor)object);
    }
}

