package ax.m2;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import ax.Gb.l;
import ax.Ob.h;
import ax.k2.AbstractC2390u;
import ax.o2.g;
import ax.o2.j;
import ax.sb.t;
import ax.tb.C3139o;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* renamed from: ax.m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2512b {
    public static final void a(g gVar) {
        l.f(gVar, "db");
        List c = C3139o.c();
        Cursor h0 = gVar.h0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (h0.moveToNext()) {
            try {
                c.add(h0.getString(0));
            } finally {
            }
        }
        t tVar = t.a;
        ax.Db.a.a(h0, null);
        for (String str : C3139o.a(c)) {
            l.e(str, "triggerName");
            if (h.H(str, "room_fts_content_sync_", false, 2, null)) {
                gVar.C("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static final Cursor b(AbstractC2390u abstractC2390u, j jVar, boolean z, CancellationSignal cancellationSignal) {
        l.f(abstractC2390u, "db");
        l.f(jVar, "sqLiteQuery");
        Cursor x = abstractC2390u.x(jVar, cancellationSignal);
        if (!z || !(x instanceof AbstractWindowedCursor)) {
            return x;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) x;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? C2511a.a(x) : x;
    }

    public static final int c(File file) throws IOException {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        l.f(file, "databaseFile");
        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileInputStream(file).getChannel());
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            convertMaybeLegacyFileChannelFromLibrary.tryLock(60L, 4L, true);
            convertMaybeLegacyFileChannelFromLibrary.position(60L);
            if (convertMaybeLegacyFileChannelFromLibrary.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i = allocate.getInt();
            ax.Db.a.a(convertMaybeLegacyFileChannelFromLibrary, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ax.Db.a.a(convertMaybeLegacyFileChannelFromLibrary, th);
                throw th2;
            }
        }
    }
}
