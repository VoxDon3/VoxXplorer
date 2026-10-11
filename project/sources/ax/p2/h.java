package ax.p2;

import android.database.sqlite.SQLiteStatement;
import ax.Gb.l;
import ax.o2.k;

/* loaded from: classes.dex */
public final class h extends g implements k {
    private final SQLiteStatement c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        l.f(sQLiteStatement, "delegate");
        this.c0 = sQLiteStatement;
    }

    @Override // ax.o2.k
    public int I() {
        return this.c0.executeUpdateDelete();
    }

    @Override // ax.o2.k
    public long S0() {
        return this.c0.executeInsert();
    }
}
