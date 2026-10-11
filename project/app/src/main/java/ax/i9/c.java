/*
 * Decompiled with CFR 0.152.
 */
package ax.i9;

import ax.Xd.f;
import ax.Y8.e;
import ax.i9.d;
import ax.k9.b;
import ax.n9.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;

public class c
implements Closeable,
AutoCloseable {
    private static final ax.Xd.d f0 = f.k(c.class);
    private ax.q9.b c0;
    private d d0;
    private ax.n9.c e0;
    private Map<String, ax.l9.a> q = new j.ConcurrentHashMap();

    public c() {
        this(d.A());
    }

    public c(d d8) {
        this(d8, new ax.n9.c());
    }

    public c(d d8, ax.n9.c c8) {
        this.c0 = new ax.q9.b();
        this.d0 = d8;
        this.e0 = c8;
        c8.c(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ax.jc.c
    private void c(a a8) {
        synchronized (this) {
            CharSequence charSequence = new StringBuilder();
            charSequence.append(a8.a());
            charSequence.append(":");
            charSequence.append(a8.b());
            charSequence = charSequence.toString();
            this.q.remove(charSequence);
            this.c0.c(a8.a());
            f0.s("Connection to << {} >> closed", charSequence);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ax.l9.a d(String string, int n8) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                String string2;
                Object object;
                block6: {
                    try {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(string);
                        ((StringBuilder)object).append(":");
                        ((StringBuilder)object).append(n8);
                        string2 = ((StringBuilder)object).toString();
                        ax.l9.a a8 = this.q.get(string2);
                        object = a8;
                        if (a8 == null) break block6;
                        object = (ax.l9.a)a8.d();
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                if (object != null && ((ax.l9.a)object).G0()) {
                    return object;
                }
                object = new ax.l9.a(this.d0, this, this.e0, this.c0);
                try {
                    ((ax.l9.a)object).H(string, n8);
                    this.q.put(string2, (ax.l9.a)object);
                }
                catch (IOException iOException) {
                    e.a(new AutoCloseable[]{object});
                    throw iOException;
                }
                return object;
            }
            throw throwable2;
        }
    }

    public ax.l9.a a(String string) throws IOException {
        return this.d(string, 445);
    }

    public ax.l9.a b(String string, int n8) throws IOException {
        return this.d(string, n8);
    }

    @Override
    public void close() {
        f0.z("Going to close all remaining connections");
        for (ax.l9.a a8 : this.q.values()) {
            try {
                a8.F(true);
            }
            catch (Exception exception) {
                f0.s("Error closing connection to host {}", a8.A0());
                f0.y("Exception was: ", exception);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean e(String object, int n8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    if (n8 == 0) {
                        try {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append((String)object);
                            stringBuilder.append(":");
                            stringBuilder.append(445);
                            object = stringBuilder.toString();
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)object);
                    stringBuilder.append(":");
                    stringBuilder.append(n8);
                    object = stringBuilder.toString();
                }
                object = this.q.get(object);
                if (object == null) return false;
                if (!((b)object).c()) return false;
                if (!((ax.l9.a)object).G0()) return false;
                return true;
            }
            throw throwable2;
        }
    }
}

