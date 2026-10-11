/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import android.database.sqlite.SQLiteDatabase;
import ax.p5.p;
import ax.x5.M;

public final class n
implements M.b {
    public final M a;
    public final p b;

    public /* synthetic */ n(M m8, p p8) {
        this.a = m8;
        this.b = p8;
    }

    public final Object apply(Object object) {
        return M.q(this.a, this.b, (SQLiteDatabase)object);
    }
}

