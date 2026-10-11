/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import android.database.sqlite.SQLiteDatabase;
import ax.p5.i;
import ax.p5.p;
import ax.x5.M;

public final class m
implements M.b {
    public final M a;
    public final i b;
    public final p c;

    public /* synthetic */ m(M m8, i i8, p p8) {
        this.a = m8;
        this.b = i8;
        this.c = p8;
    }

    public final Object apply(Object object) {
        return M.L(this.a, this.b, this.c, (SQLiteDatabase)object);
    }
}

