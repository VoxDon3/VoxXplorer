/*
 * Decompiled with CFR 0.152.
 */
package ax.V2;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import ax.Ha.c;
import ax.V2.b;
import ax.u3.q;
import com.alphainventor.filemanager.bookmark.Bookmark;

public class a {
    private static a b;
    private Context a;

    private a(Context context) {
        this.a = context.getApplicationContext();
    }

    public static a b(Context context) {
        if (b == null) {
            b = new a(context);
        }
        return b;
    }

    public void a(Bookmark bookmark) {
        new a(this.a, bookmark).h(new Void[0]);
    }

    static class a
    extends q<Void, Void, Boolean> {
        Context h;
        Bookmark i;

        public a(Context context, Bookmark bookmark) {
            super(q.e.f0);
            this.h = context;
            this.i = bookmark;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean w(Void ... voidArray) {
            try {
                ax.V2.b.a(this.h, this.i, false);
                return Boolean.TRUE;
            }
            catch (SQLiteFullException sQLiteFullException) {
                c.h().d("ADD_HISTORY_ERROR! SQLITEFULL").h();
                return Boolean.TRUE;
            }
            catch (SQLiteException sQLiteException) {
                return Boolean.TRUE;
            }
        }
    }
}

