/*
 * Decompiled with CFR 0.152.
 */
package ax.m2;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import ax.Gb.l;
import ax.Ob.h;
import ax.k2.u;
import ax.m2.a;
import ax.o2.g;
import ax.o2.j;
import ax.sb.t;
import ax.tb.o;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class b {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(g g8) {
        Throwable throwable2;
        Object object;
        block7: {
            l.f(g8, "db");
            Object object2 = o.c();
            object = g8.h0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
            try {
                while (object.moveToNext()) {
                    object2.add(object.getString(0));
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            Object object3 = t.a;
            ax.Db.a.a((Closeable)object, null);
            object3 = ((Iterable)o.a(object2)).iterator();
            while (true) {
                if (!object3.hasNext()) {
                    return;
                }
                object = (String)object3.next();
                l.e(object, "triggerName");
                if (!h.H((String)object, "room_fts_content_sync_", false, 2, null)) continue;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("DROP TRIGGER IF EXISTS ");
                ((StringBuilder)object2).append((String)object);
                g8.C(((StringBuilder)object2).toString());
            }
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            ax.Db.a.a((Closeable)object, throwable2);
            throw throwable3;
        }
    }

    public static final Cursor b(u object, j j8, boolean bl, CancellationSignal cancellationSignal) {
        block2: {
            block3: {
                l.f(object, "db");
                l.f(j8, "sqLiteQuery");
                j8 = ((u)object).x(j8, cancellationSignal);
                object = j8;
                if (!bl) break block2;
                object = j8;
                if (!(j8 instanceof AbstractWindowedCursor)) break block2;
                object = (AbstractWindowedCursor)j8;
                int n8 = object.getCount();
                int n9 = object.hasWindow() ? object.getWindow().getNumRows() : n8;
                if (Build.VERSION.SDK_INT < 23) break block3;
                object = j8;
                if (n9 >= n8) break block2;
            }
            object = a.a((Cursor)j8);
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int c(File object) throws IOException {
        Throwable throwable2;
        Object object2;
        block5: {
            int n8;
            l.f(object, "databaseFile");
            object = ax.T.l.a(new FileInputStream((File)object));
            try {
                object2 = ByteBuffer.allocate(4);
                ((FileChannel)object).tryLock(60L, 4L, true);
                ((FileChannel)object).position(60L);
                if (((FileChannel)object).read((ByteBuffer)object2) != 4) break block5;
                ((ByteBuffer)object2).rewind();
                n8 = ((ByteBuffer)object2).getInt();
            }
            catch (Throwable throwable2) {}
            ax.Db.a.a((Closeable)object, null);
            return n8;
        }
        object2 = new IOException("Bad database header, unable to read 4 bytes at offset 60");
        throw object2;
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            ax.Db.a.a((Closeable)object, throwable2);
            throw throwable3;
        }
    }
}

