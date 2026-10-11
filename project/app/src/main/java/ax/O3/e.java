/*
 * Decompiled with CFR 0.152.
 */
package ax.O3;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import ax.M3.f;
import ax.M3.g;
import ax.O3.a;
import ax.O3.d;
import ax.Q3.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

class e {
    private static final a f = new a();
    private final a a;
    private final d b;
    private final b c;
    private final ContentResolver d;
    private final List<f> e;

    public e(List<f> list, a a8, d d8, b b8, ContentResolver contentResolver) {
        this.a = a8;
        this.b = d8;
        this.c = b8;
        this.d = contentResolver;
        this.e = list;
    }

    public e(List<f> list, d d8, b b8, ContentResolver contentResolver) {
        this(list, f, d8, b8, contentResolver);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int a(Uri uri) {
        Throwable throwable2;
        InputStream inputStream;
        block12: {
            Object object;
            InputStream inputStream2;
            block13: {
                int n8;
                InputStream inputStream3;
                inputStream2 = null;
                object = null;
                inputStream = null;
                try {
                    inputStream = inputStream3 = this.d.openInputStream(uri);
                    inputStream2 = inputStream3;
                    object = inputStream3;
                    n8 = g.a(this.e, inputStream3, this.c);
                    if (inputStream3 == null) return n8;
                }
                catch (Throwable throwable2) {
                    break block12;
                }
                catch (NullPointerException nullPointerException) {
                    break block13;
                }
                catch (IOException iOException) {
                    inputStream2 = object;
                    break block13;
                }
                try {
                    inputStream3.close();
                    return n8;
                }
                catch (IOException iOException) {
                    return n8;
                }
            }
            inputStream = inputStream2;
            {
                if (Log.isLoggable((String)"ThumbStreamOpener", (int)3)) {
                    Throwable var6_12;
                    inputStream = inputStream2;
                    inputStream = inputStream2;
                    object = new StringBuilder();
                    inputStream = inputStream2;
                    ((StringBuilder)object).append("Failed to open uri: ");
                    inputStream = inputStream2;
                    ((StringBuilder)object).append(uri);
                    inputStream = inputStream2;
                    Log.d((String)"ThumbStreamOpener", (String)((StringBuilder)object).toString(), (Throwable)var6_12);
                }
                if (inputStream2 == null) return -1;
            }
            try {
                inputStream2.close();
                return -1;
            }
            catch (IOException iOException) {
                return -1;
            }
        }
        if (inputStream == null) throw throwable2;
        try {}
        catch (IOException iOException) {
            throw throwable2;
        }
        inputStream.close();
        throw throwable2;
    }

    public InputStream b(Uri object) throws FileNotFoundException {
        Object object2;
        block7: {
            Throwable throwable2;
            block9: {
                block8: {
                    object2 = this.b.a((Uri)object);
                    if (object2 == null) break block7;
                    try {
                        if (!object2.moveToFirst()) break block7;
                        object = object2.getString(0);
                        boolean bl = TextUtils.isEmpty((CharSequence)object);
                        if (!bl) break block8;
                    }
                    catch (Throwable throwable2) {}
                    object2.close();
                    return null;
                }
                object = this.a.b((String)object);
                object = this.a.a((File)object) && this.a.c((File)object) > 0L ? Uri.fromFile((File)object) : null;
                break block9;
                object2.close();
                if (object != null) {
                    try {
                        object2 = this.d.openInputStream(object);
                        return object2;
                    }
                    catch (NullPointerException nullPointerException) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("NPE opening uri: ");
                        ((StringBuilder)object2).append(object);
                        throw (FileNotFoundException)new FileNotFoundException(((StringBuilder)object2).toString()).initCause(nullPointerException);
                    }
                }
                return null;
            }
            object2.close();
            throw throwable2;
        }
        if (object2 != null) {
            object2.close();
        }
        return null;
    }
}

