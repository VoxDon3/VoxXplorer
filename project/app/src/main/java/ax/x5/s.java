/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import android.database.sqlite.SQLiteDatabase;
import ax.s5.a;
import ax.x5.M;
import java.util.Map;

public final class s
implements M.b {
    public final M a;
    public final String b;
    public final Map c;
    public final a.a d;

    public /* synthetic */ s(M m8, String string, Map map, a.a a8) {
        this.a = m8;
        this.b = string;
        this.c = map;
        this.d = a8;
    }

    public final Object apply(Object object) {
        return M.F0(this.a, this.b, this.c, this.d, (SQLiteDatabase)object);
    }
}

