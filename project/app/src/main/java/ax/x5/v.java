/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import android.database.Cursor;
import ax.p5.p;
import ax.x5.M;
import java.util.List;

public final class v
implements M.b {
    public final M a;
    public final List b;
    public final p c;

    public /* synthetic */ v(M m8, List list, p p8) {
        this.a = m8;
        this.b = list;
        this.c = p8;
    }

    public final Object apply(Object object) {
        return M.C0(this.a, this.b, this.c, (Cursor)object);
    }
}

