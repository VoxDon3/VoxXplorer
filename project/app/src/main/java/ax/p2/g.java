/*
 * Decompiled with CFR 0.152.
 */
package ax.p2;

import android.database.sqlite.SQLiteProgram;
import ax.Gb.l;
import ax.o2.i;

public class g
implements i,
AutoCloseable {
    private final SQLiteProgram q;

    public g(SQLiteProgram sQLiteProgram) {
        l.f(sQLiteProgram, "delegate");
        this.q = sQLiteProgram;
    }

    @Override
    public void D(int n8, String string) {
        l.f(string, "value");
        this.q.bindString(n8, string);
    }

    @Override
    public void N(int n8, double d8) {
        this.q.bindDouble(n8, d8);
    }

    @Override
    public void X(int n8, long l8) {
        this.q.bindLong(n8, l8);
    }

    @Override
    public void close() {
        this.q.close();
    }

    @Override
    public void e0(int n8, byte[] byArray) {
        l.f(byArray, "value");
        this.q.bindBlob(n8, byArray);
    }

    @Override
    public void t0(int n8) {
        this.q.bindNull(n8);
    }
}

