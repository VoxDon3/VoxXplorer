/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import ax.G7.g;
import ax.J7.j;
import ax.J7.k;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

class l {
    private static final FilenameFilter d = new j();
    private static final Comparator<File> e = new k();
    private final ax.O7.g a;
    private String b = null;
    private String c = null;

    l(ax.O7.g g8) {
        this.a = g8;
    }

    public static /* synthetic */ boolean a(File file, String string) {
        return string.startsWith("aqs.");
    }

    public static /* synthetic */ int b(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void d(ax.O7.g g8, String string, String string2) {
        if (string != null && string2 != null) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("aqs.");
                stringBuilder.append(string2);
                g8.q(string, stringBuilder.toString()).createNewFile();
                return;
            }
            catch (IOException iOException) {
                g.f().l("Failed to persist App Quality Sessions session id.", iOException);
            }
        }
    }

    static String e(ax.O7.g object, String string) {
        if ((object = ((ax.O7.g)object).r(string, d)).isEmpty()) {
            g.f().k("Unable to read App Quality Sessions session id.");
            return null;
        }
        return Collections.min(object, e).getName().substring(4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String c(String string) {
        synchronized (this) {
            try {
                if (!j.Objects.equals((Object)this.b, (Object)string)) return l.e(this.a, string);
                return this.c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f(String string) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (j.Objects.equals((Object)this.c, (Object)string)) break block4;
                        l.d(this.a, this.b, string);
                        this.c = string;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(String string) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (j.Objects.equals((Object)this.b, (Object)string)) break block4;
                        l.d(this.a, string, this.c);
                        this.b = string;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

