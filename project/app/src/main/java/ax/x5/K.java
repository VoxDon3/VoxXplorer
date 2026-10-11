/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import android.database.sqlite.SQLiteDatabase;
import ax.x5.M;

public final class K
implements M.b {
    public final M a;
    public final String b;
    public final String c;

    public /* synthetic */ K(M m8, String string, String string2) {
        this.a = m8;
        this.b = string;
        this.c = string2;
    }

    public final Object apply(Object object) {
        return M.p(this.a, this.b, this.c, (SQLiteDatabase)object);
    }
}

