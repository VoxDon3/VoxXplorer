package ax.V2;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.bookmark.Bookmark;

/* loaded from: classes.dex */
public class a {
    private static a b;
    private Context a;

    /* renamed from: ax.V2.a$a, reason: collision with other inner class name */
    static class C0213a extends AbstractC3199q<Void, Void, Boolean> {
        Context h;
        Bookmark i;

        public C0213a(Context context, Bookmark bookmark) {
            super(AbstractC3199q.e.NORMAL);
            this.h = context;
            this.i = bookmark;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            try {
                b.a(this.h, this.i, false);
            } catch (SQLiteFullException unused) {
                ax.Ha.c.h().d("ADD_HISTORY_ERROR! SQLITEFULL").h();
            } catch (SQLiteException unused2) {
            }
            return Boolean.TRUE;
        }
    }

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
        new C0213a(this.a, bookmark).h(new Void[0]);
    }
}
