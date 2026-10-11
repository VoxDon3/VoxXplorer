/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.database.Cursor;
import android.text.TextUtils;

public class l {
    public static final String[] g = new String[]{"document_id", "_display_name", "mime_type", "last_modified", "_size", "flags"};
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;

    public l(Cursor cursor) {
        this.a = cursor.getString(0);
        this.b = cursor.getString(1);
        this.c = cursor.getString(2);
        this.d = cursor.isNull(3) ? 0L : cursor.getLong(3);
        this.e = cursor.isNull(4) ? 0L : cursor.getLong(4);
        if (cursor.isNull(5)) {
            this.f = 0;
            return;
        }
        this.f = cursor.getInt(5);
    }

    public l(String string, String string2) {
        this.a = string;
        this.b = string2;
        this.c = "vnd.android.document/directory";
        this.d = 0L;
        this.e = 0L;
        this.f = 0;
    }

    static boolean c(String string, int n8) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return false;
        }
        if ((n8 & 4) != 0) {
            return true;
        }
        if ("vnd.android.document/directory".equals(string) && (n8 & 8) != 0) {
            return true;
        }
        return !TextUtils.isEmpty((CharSequence)string) && (n8 & 2) != 0;
    }

    public boolean a() {
        return TextUtils.isEmpty((CharSequence)this.c) ^ true;
    }

    public boolean b() {
        return l.c(this.c, this.f);
    }

    public boolean d() {
        return "vnd.android.document/directory".equals(this.c);
    }
}

