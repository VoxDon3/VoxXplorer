package ax.c3;

import android.database.Cursor;
import android.text.TextUtils;

/* renamed from: ax.c3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1824l {
    public static final String[] g = {"document_id", "_display_name", "mime_type", "last_modified", "_size", "flags"};
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;

    public C1824l(Cursor cursor) {
        this.a = cursor.getString(0);
        this.b = cursor.getString(1);
        this.c = cursor.getString(2);
        if (cursor.isNull(3)) {
            this.d = 0L;
        } else {
            this.d = cursor.getLong(3);
        }
        if (cursor.isNull(4)) {
            this.e = 0L;
        } else {
            this.e = cursor.getLong(4);
        }
        if (cursor.isNull(5)) {
            this.f = 0;
        } else {
            this.f = cursor.getInt(5);
        }
    }

    static boolean c(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ((i & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(str) || (i & 8) == 0) {
            return (TextUtils.isEmpty(str) || (i & 2) == 0) ? false : true;
        }
        return true;
    }

    public boolean a() {
        return !TextUtils.isEmpty(this.c);
    }

    public boolean b() {
        return c(this.c, this.f);
    }

    public boolean d() {
        return "vnd.android.document/directory".equals(this.c);
    }

    public C1824l(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = "vnd.android.document/directory";
        this.d = 0L;
        this.e = 0L;
        this.f = 0;
    }
}
