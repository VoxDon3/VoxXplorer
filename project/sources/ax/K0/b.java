package ax.K0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import ax.K0.c;
import ax.Y.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* loaded from: classes.dex */
public class b extends a<Cursor> {
    private final c<Cursor>.a o;
    private Uri p;
    private String[] q;
    private String r;
    private String[] s;
    private String t;
    private Cursor u;
    private ax.Y.d v;

    public b(Context context) {
        super(context);
        this.o = new c.a();
    }

    @Override // ax.K0.a
    public void C() {
        super.C();
        synchronized (this) {
            try {
                ax.Y.d dVar = this.v;
                if (dVar != null) {
                    dVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.K0.c
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void h(Cursor cursor) {
        if (m()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.u;
        this.u = cursor;
        if (n()) {
            super.h(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    public Cursor M() {
        synchronized (this) {
            if (H()) {
                throw new r();
            }
            this.v = new ax.Y.d();
        }
        try {
            Cursor b = ax.Q.a.b(j().getContentResolver(), this.p, this.q, this.r, this.s, this.t, this.v);
            if (b != null) {
                try {
                    b.getCount();
                    b.registerContentObserver(this.o);
                } catch (RuntimeException e) {
                    b.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.v = null;
            }
            return b;
        } catch (Throwable th) {
            synchronized (this) {
                this.v = null;
                throw th;
            }
        }
    }

    @Override // ax.K0.a
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void J(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public void O(String[] strArr) {
        this.q = strArr;
    }

    public void P(Uri uri) {
        this.p = uri;
    }

    @Override // ax.K0.a, ax.K0.c
    @Deprecated
    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.q));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.s));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.u);
    }

    @Override // ax.K0.c
    protected void s() {
        super.s();
        u();
        Cursor cursor = this.u;
        if (cursor != null && !cursor.isClosed()) {
            this.u.close();
        }
        this.u = null;
    }

    @Override // ax.K0.c
    protected void t() {
        Cursor cursor = this.u;
        if (cursor != null) {
            h(cursor);
        }
        if (A() || this.u == null) {
            a();
        }
    }

    @Override // ax.K0.c
    protected void u() {
        d();
    }
}
