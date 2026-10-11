package ax.O4;

import ax.O4.d;
import ax.m.j;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

/* loaded from: classes.dex */
class h {
    private static final char[] b = {'\\', '\"'};
    private static final char[] c = {'\\', '\\'};
    private static final char[] d = {'\\', 'n'};
    private static final char[] e = {'\\', 'r'};
    private static final char[] f = {'\\', 't'};
    private static final char[] g = {'\\', 'u', '2', '0', '2', '8'};
    private static final char[] h = {'\\', 'u', '2', '0', '2', '9'};
    private static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    protected final Writer a;

    h(Writer writer) {
        this.a = writer;
    }

    private static char[] a(char c2) {
        if (c2 == '\"') {
            return b;
        }
        if (c2 == '\\') {
            return c;
        }
        if (c2 == '\n') {
            return d;
        }
        if (c2 == '\r') {
            return e;
        }
        if (c2 == '\t') {
            return f;
        }
        if (c2 == 8232) {
            return g;
        }
        if (c2 == 8233) {
            return h;
        }
        if (c2 < 0 || c2 > 31) {
            return null;
        }
        char[] cArr = {'\\', 'u', '0', '0', '0', '0'};
        char[] cArr2 = i;
        cArr[4] = cArr2[(c2 >> 4) & 15];
        cArr[5] = cArr2[c2 & 15];
        return cArr;
    }

    void b(String str) throws IOException {
        this.a.write(str);
    }

    protected void c(a aVar) throws IOException {
        e();
        Iterator<g> it = aVar.iterator();
        boolean z = true;
        while (it.hasNext()) {
            g next = it.next();
            if (!z) {
                d();
            }
            next.z(this);
            z = false;
        }
        g();
    }

    protected void d() throws IOException {
        this.a.write(44);
    }

    protected void e() throws IOException {
        this.a.write(91);
    }

    protected void f() throws IOException {
        this.a.write(123);
    }

    protected void g() throws IOException {
        this.a.write(93);
    }

    protected void h() throws IOException {
        this.a.write(j.L0);
    }

    protected void i() throws IOException {
        this.a.write(58);
    }

    protected void j(d dVar) throws IOException {
        f();
        Iterator<d.c> it = dVar.iterator();
        boolean z = true;
        while (it.hasNext()) {
            d.c next = it.next();
            if (!z) {
                k();
            }
            l(next.a());
            i();
            next.b().z(this);
            z = false;
        }
        h();
    }

    protected void k() throws IOException {
        this.a.write(44);
    }

    void l(String str) throws IOException {
        this.a.write(34);
        int length = str.length();
        char[] cArr = new char[length];
        str.getChars(0, length, cArr, 0);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char[] a = a(cArr[i3]);
            if (a != null) {
                this.a.write(cArr, i2, i3 - i2);
                this.a.write(a);
                i2 = i3 + 1;
            }
        }
        this.a.write(cArr, i2, length - i2);
        this.a.write(34);
    }
}
