package ax.O3;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import ax.M3.f;
import ax.M3.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
class e {
    private static final a f = new a();
    private final a a;
    private final d b;
    private final ax.Q3.b c;
    private final ContentResolver d;
    private final List<f> e;

    public e(List<f> list, d dVar, ax.Q3.b bVar, ContentResolver contentResolver) {
        this(list, f, dVar, bVar, contentResolver);
    }

    public int a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.d.openInputStream(uri);
                int a = g.a(this.e, inputStream, this.c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return a;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        }
    }

    public InputStream b(Uri uri) throws FileNotFoundException {
        Cursor a = this.b.a(uri);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    String string = a.getString(0);
                    if (TextUtils.isEmpty(string)) {
                        return null;
                    }
                    File b = this.a.b(string);
                    Uri fromFile = (!this.a.a(b) || this.a.c(b) <= 0) ? null : Uri.fromFile(b);
                    if (fromFile == null) {
                        return null;
                    }
                    try {
                        return this.d.openInputStream(fromFile);
                    } catch (NullPointerException e) {
                        throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + fromFile).initCause(e));
                    }
                }
            } finally {
                a.close();
            }
        }
        if (a != null) {
        }
        return null;
    }

    public e(List<f> list, a aVar, d dVar, ax.Q3.b bVar, ContentResolver contentResolver) {
        this.a = aVar;
        this.b = dVar;
        this.c = bVar;
        this.d = contentResolver;
        this.e = list;
    }
}
