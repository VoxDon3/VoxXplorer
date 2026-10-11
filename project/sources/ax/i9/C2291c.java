package ax.i9;

import ax.Xd.f;
import ax.Y8.e;
import ax.l9.C2483a;
import ax.n9.C2624a;
import ax.n9.C2626c;
import ax.q9.C2890b;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;

/* renamed from: ax.i9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2291c implements Closeable, AutoCloseable {
    private static final ax.Xd.d f0 = f.k(C2291c.class);
    private C2890b c0;
    private C2292d d0;
    private C2626c e0;
    private Map<String, C2483a> q;

    public C2291c() {
        this(C2292d.A());
    }

    @ax.jc.c
    private void c(C2624a c2624a) {
        synchronized (this) {
            String str = c2624a.a() + ":" + c2624a.b();
            this.q.remove(str);
            this.c0.c(c2624a.a());
            f0.s("Connection to << {} >> closed", str);
        }
    }

    private C2483a d(String str, int i) throws IOException {
        synchronized (this) {
            try {
                String str2 = str + ":" + i;
                C2483a c2483a = this.q.get(str2);
                if (c2483a != null) {
                    c2483a = c2483a.d();
                }
                if (c2483a != null && c2483a.G0()) {
                    return c2483a;
                }
                C2483a c2483a2 = new C2483a(this.d0, this, this.e0, this.c0);
                try {
                    c2483a2.H(str, i);
                    this.q.put(str2, c2483a2);
                    return c2483a2;
                } catch (IOException e) {
                    e.a(c2483a2);
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C2483a a(String str) throws IOException {
        return d(str, 445);
    }

    public C2483a b(String str, int i) throws IOException {
        return d(str, i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f0.z("Going to close all remaining connections");
        for (C2483a c2483a : this.q.values()) {
            try {
                c2483a.F(true);
            } catch (Exception e) {
                f0.s("Error closing connection to host {}", c2483a.A0());
                f0.y("Exception was: ", e);
            }
        }
    }

    public boolean e(String str, int i) {
        String str2;
        boolean z;
        synchronized (this) {
            try {
                if (i == 0) {
                    str2 = str + ":445";
                } else {
                    str2 = str + ":" + i;
                }
                C2483a c2483a = this.q.get(str2);
                z = c2483a != null && c2483a.c() && c2483a.G0();
            } finally {
            }
        }
        return z;
    }

    public C2291c(C2292d c2292d) {
        this(c2292d, new C2626c());
    }

    public C2291c(C2292d c2292d, C2626c c2626c) {
        this.q = new ConcurrentHashMap();
        this.c0 = new C2890b();
        this.d0 = c2292d;
        this.e0 = c2626c;
        c2626c.c(this);
    }
}
