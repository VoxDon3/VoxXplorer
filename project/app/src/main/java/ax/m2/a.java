/*
 * Decompiled with CFR 0.152.
 */
package ax.m2;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import ax.Gb.l;
import ax.Ob.h;
import ax.tb.i;
import java.io.Closeable;

public final class a {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Cursor a(Cursor cursor) {
        Throwable throwable2;
        block12: {
            Object object;
            l.f(cursor, "c");
            try {
                object = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
                while (cursor.moveToNext()) {
                    Object[] objectArray = new Object[cursor.getColumnCount()];
                    int n8 = cursor.getColumnCount();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        int n9 = cursor.getType(i8);
                        if (n9 != 0) {
                            if (n9 != 1) {
                                if (n9 != 2) {
                                    if (n9 != 3) {
                                        if (n9 != 4) {
                                            object = new IllegalStateException();
                                            throw object;
                                        }
                                        objectArray[i8] = cursor.getBlob(i8);
                                        continue;
                                    }
                                    objectArray[i8] = cursor.getString(i8);
                                    continue;
                                }
                                objectArray[i8] = cursor.getDouble(i8);
                                continue;
                            }
                            objectArray[i8] = cursor.getLong(i8);
                            continue;
                        }
                        objectArray[i8] = null;
                    }
                    object.addRow(objectArray);
                }
            }
            catch (Throwable throwable2) {
                break block12;
            }
            ax.Db.a.a((Closeable)cursor, null);
            return object;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            ax.Db.a.a((Closeable)cursor, throwable2);
            throw throwable3;
        }
    }

    private static final int b(Cursor stringArray, String string) {
        if (Build.VERSION.SDK_INT > 25) {
            return -1;
        }
        if (string.length() == 0) {
            return -1;
        }
        stringArray = stringArray.getColumnNames();
        l.e(stringArray, "columnNames");
        return a.c(stringArray, string);
    }

    public static final int c(String[] stringArray, String string) {
        l.f(stringArray, "columnNames");
        l.f(string, "name");
        CharSequence charSequence = new StringBuilder();
        charSequence.append('.');
        charSequence.append(string);
        charSequence = charSequence.toString();
        CharSequence charSequence2 = new StringBuilder();
        charSequence2.append('.');
        charSequence2.append(string);
        charSequence2.append('`');
        charSequence2 = charSequence2.toString();
        int n8 = stringArray.length;
        int n9 = 0;
        int n10 = 0;
        while (n9 < n8) {
            String string2 = stringArray[n9];
            if (string2.length() >= string.length() + 2 && (h.u(string2, (String)charSequence, false, 2, null) || string2.charAt(0) == '`' && h.u(string2, (String)charSequence2, false, 2, null))) {
                return n10;
            }
            ++n9;
            ++n10;
        }
        return -1;
    }

    public static final int d(Cursor cursor, String string) {
        l.f(cursor, "c");
        l.f(string, "name");
        int n8 = cursor.getColumnIndex(string);
        if (n8 >= 0) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('`');
        stringBuilder.append(string);
        stringBuilder.append('`');
        n8 = cursor.getColumnIndex(stringBuilder.toString());
        if (n8 >= 0) {
            return n8;
        }
        return a.b(cursor, string);
    }

    public static final int e(Cursor object, String string) {
        l.f(object, "c");
        l.f(string, "name");
        int n8 = a.d((Cursor)object, string);
        if (n8 >= 0) {
            return n8;
        }
        try {
            object = object.getColumnNames();
            l.e(object, "c.columnNames");
            object = i.A(object, null, null, null, 0, null, null, 63, null);
        }
        catch (Exception exception) {
            Log.d((String)"RoomCursorUtil", (String)"Cannot collect column names for debug purposes", (Throwable)exception);
            object = "unknown";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("column '");
        stringBuilder.append(string);
        stringBuilder.append("' does not exist. Available columns: ");
        stringBuilder.append((String)object);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

