package ax.p2;

import android.database.sqlite.SQLiteProgram;
import ax.Gb.l;
import ax.o2.i;

/* loaded from: classes.dex */
public class g implements i, AutoCloseable {
    private final SQLiteProgram q;

    public g(SQLiteProgram sQLiteProgram) {
        l.f(sQLiteProgram, "delegate");
        this.q = sQLiteProgram;
    }

    @Override // ax.o2.i
    public void D(int i, String str) {
        l.f(str, "value");
        this.q.bindString(i, str);
    }

    @Override // ax.o2.i
    public void N(int i, double d) {
        this.q.bindDouble(i, d);
    }

    @Override // ax.o2.i
    public void X(int i, long j) {
        this.q.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.q.close();
    }

    @Override // ax.o2.i
    public void e0(int i, byte[] bArr) {
        l.f(bArr, "value");
        this.q.bindBlob(i, bArr);
    }

    @Override // ax.o2.i
    public void t0(int i) {
        this.q.bindNull(i);
    }
}
