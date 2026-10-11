/*
 * Decompiled with CFR 0.152.
 */
package ax.o2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import ax.o2.j;
import ax.o2.k;
import java.io.Closeable;
import java.util.List;

public interface g
extends Closeable {
    public void C(String var1) throws SQLException;

    public boolean E0();

    public k J(String var1);

    public void Y();

    public void Z(String var1, Object[] var2) throws SQLException;

    public void a0();

    public int b0(String var1, int var2, ContentValues var3, String var4, Object[] var5);

    public String getPath();

    public Cursor h0(String var1);

    public boolean isOpen();

    public void j0();

    public Cursor n0(j var1);

    public void r();

    public List<Pair<String, String>> x();

    public Cursor y(j var1, CancellationSignal var2);

    public boolean z0();
}

