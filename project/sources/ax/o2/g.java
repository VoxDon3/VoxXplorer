package ax.o2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface g extends Closeable {
    void C(String str) throws SQLException;

    boolean E0();

    k J(String str);

    void Y();

    void Z(String str, Object[] objArr) throws SQLException;

    void a0();

    int b0(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    String getPath();

    Cursor h0(String str);

    boolean isOpen();

    void j0();

    Cursor n0(j jVar);

    void r();

    List<Pair<String, String>> x();

    Cursor y(j jVar, CancellationSignal cancellationSignal);

    boolean z0();
}
