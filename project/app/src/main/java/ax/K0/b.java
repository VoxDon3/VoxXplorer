/*
 * Decompiled with CFR 0.152.
 */
package ax.K0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import ax.K0.a;
import ax.K0.c;
import ax.Y.d;
import ax.Y.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class b
extends a<Cursor> {
    private final c.a o = new c.a(this);
    private Uri p;
    private String[] q;
    private String r;
    private String[] s;
    private String t;
    private Cursor u;
    private d v;

    public b(Context context) {
        super(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void C() {
        super.C();
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        d d8 = this.v;
                        if (d8 == null) break block3;
                        d8.a();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public void L(Cursor cursor) {
        if (this.m()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
        } else {
            Cursor cursor2 = this.u;
            this.u = cursor;
            if (this.n()) {
                super.h(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public Cursor M() {
        block13: {
            Throwable throwable22;
            block15: {
                Cursor cursor;
                block14: {
                    d d8;
                    // MONITORENTER : this
                    if (this.H()) break block13;
                    this.v = d8 = new d();
                    // MONITOREXIT : this
                    try {
                        cursor = ax.Q.a.b(this.j().getContentResolver(), this.p, this.q, this.r, this.s, this.t, this.v);
                        if (cursor == null) break block14;
                        cursor.getCount();
                        cursor.registerContentObserver((ContentObserver)this.o);
                        break block14;
                    }
                    catch (Throwable throwable22) {
                        break block15;
                    }
                    catch (RuntimeException runtimeException) {
                        cursor.close();
                        throw runtimeException;
                    }
                }
                // MONITORENTER : this
                this.v = null;
                // MONITOREXIT : this
                return cursor;
            }
            // MONITORENTER : this
            this.v = null;
            // MONITOREXIT : this
            throw throwable22;
        }
        r r8 = new r();
        throw r8;
    }

    public void N(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public void O(String[] stringArray) {
        this.q = stringArray;
    }

    public void P(Uri uri) {
        this.p = uri;
    }

    @Override
    @Deprecated
    public void i(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        super.i(string, fileDescriptor, printWriter, stringArray);
        printWriter.print(string);
        printWriter.print("mUri=");
        printWriter.println(this.p);
        printWriter.print(string);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.q));
        printWriter.print(string);
        printWriter.print("mSelection=");
        printWriter.println(this.r);
        printWriter.print(string);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.s));
        printWriter.print(string);
        printWriter.print("mSortOrder=");
        printWriter.println(this.t);
        printWriter.print(string);
        printWriter.print("mCursor=");
        printWriter.println(this.u);
    }

    @Override
    protected void s() {
        super.s();
        this.u();
        Cursor cursor = this.u;
        if (cursor != null && !cursor.isClosed()) {
            this.u.close();
        }
        this.u = null;
    }

    @Override
    protected void t() {
        Cursor cursor = this.u;
        if (cursor != null) {
            this.L(cursor);
        }
        if (!this.A() && this.u != null) {
            return;
        }
        this.a();
    }

    @Override
    protected void u() {
        this.d();
    }
}

