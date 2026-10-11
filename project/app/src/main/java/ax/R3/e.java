/*
 * Decompiled with CFR 0.152.
 */
package ax.R3;

import android.util.Log;
import ax.K3.a;
import ax.M3.h;
import ax.R3.a;
import ax.R3.c;
import ax.R3.j;
import java.io.File;
import java.io.IOException;

public class e
implements a {
    private static e f;
    private final j a;
    private final File b;
    private final int c;
    private final c d = new c();
    private ax.K3.a e;

    protected e(File file, int n8) {
        this.b = file;
        this.c = n8;
        this.a = new j();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a c(File object, int n8) {
        synchronized (e.class) {
            try {
                e e8;
                if (f != null) return f;
                f = e8 = new e((File)object, n8);
                return f;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ax.K3.a d() throws IOException {
        synchronized (this) {
            try {
                if (this.e != null) return this.e;
                this.e = ax.K3.a.F(this.b, 1, 1, this.c);
                return this.e;
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
    @Override
    public void a(h h8, a.b object) {
        Throwable throwable3;
        block13: {
            block17: {
                IOException iOException2;
                block12: {
                    Object object2;
                    String string;
                    block14: {
                        Throwable throwable22;
                        block16: {
                            block15: {
                                this.d.a(h8);
                                try {
                                    string = this.a.b(h8);
                                    if (Log.isLoggable((String)"DiskLruCacheWrapper", (int)2)) {
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append("Put: Obtained: ");
                                        ((StringBuilder)object2).append(string);
                                        ((StringBuilder)object2).append(" for for Key: ");
                                        ((StringBuilder)object2).append(h8);
                                        Log.v((String)"DiskLruCacheWrapper", (String)((StringBuilder)object2).toString());
                                    }
                                    try {
                                        object2 = this.d();
                                        a.e e8 = ((ax.K3.a)object2).v(string);
                                        if (e8 != null) {
                                            this.d.b(h8);
                                            return;
                                        }
                                    }
                                    catch (IOException iOException2) {
                                        break block12;
                                    }
                                }
                                catch (Throwable throwable3) {
                                    break block13;
                                }
                                {
                                    object2 = ((ax.K3.a)object2).q(string);
                                    if (object2 == null) break block14;
                                }
                                try {
                                    if (!object.a(((a.c)object2).f(0))) break block15;
                                    ((a.c)object2).e();
                                }
                                catch (Throwable throwable22) {
                                    break block16;
                                }
                            }
                            ((a.c)object2).b();
                            break block17;
                        }
                        ((a.c)object2).b();
                        throw throwable22;
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Had two simultaneous puts for: ");
                    ((StringBuilder)object2).append(string);
                    object = new IllegalStateException(((StringBuilder)object2).toString());
                    throw object;
                }
                if (Log.isLoggable((String)"DiskLruCacheWrapper", (int)5)) {
                    Log.w((String)"DiskLruCacheWrapper", (String)"Unable to put to disk cache", (Throwable)iOException2);
                }
            }
            this.d.b(h8);
            return;
        }
        this.d.b(h8);
        throw throwable3;
    }

    @Override
    public File b(h object) {
        block4: {
            String string = this.a.b((h)object);
            if (Log.isLoggable((String)"DiskLruCacheWrapper", (int)2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Get: Obtained: ");
                stringBuilder.append(string);
                stringBuilder.append(" for for Key: ");
                stringBuilder.append(object);
                Log.v((String)"DiskLruCacheWrapper", (String)stringBuilder.toString());
            }
            object = this.d().v(string);
            if (object == null) break block4;
            try {
                object = ((a.e)object).a(0);
                return object;
            }
            catch (IOException iOException) {
                if (!Log.isLoggable((String)"DiskLruCacheWrapper", (int)5)) break block4;
                Log.w((String)"DiskLruCacheWrapper", (String)"Unable to get from disk cache", (Throwable)iOException);
            }
        }
        return null;
    }
}

