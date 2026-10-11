package ax.i7;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class z {
    private long a = -1;
    private String b;
    private String c;
    private ax.m7.y d;

    public abstract void a(String str, String str2) throws IOException;

    public abstract AbstractC2274A b() throws IOException;

    public final String c() {
        return this.b;
    }

    public final long d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public final ax.m7.y f() {
        return this.d;
    }

    public final void g(String str) throws IOException {
        this.b = str;
    }

    public final void h(long j) throws IOException {
        this.a = j;
    }

    public final void i(String str) throws IOException {
        this.c = str;
    }

    public final void j(ax.m7.y yVar) throws IOException {
        this.d = yVar;
    }

    public void l(int i) throws IOException {
    }

    public void k(int i, int i2) throws IOException {
    }
}
