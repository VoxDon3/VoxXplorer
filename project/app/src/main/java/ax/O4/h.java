/*
 * Decompiled with CFR 0.152.
 */
package ax.O4;

import ax.O4.a;
import ax.O4.d;
import ax.O4.g;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

class h {
    private static final char[] b = new char[]{'\\', '\"'};
    private static final char[] c = new char[]{'\\', '\\'};
    private static final char[] d = new char[]{'\\', 'n'};
    private static final char[] e = new char[]{'\\', 'r'};
    private static final char[] f = new char[]{'\\', 't'};
    private static final char[] g = new char[]{'\\', 'u', '2', '0', '2', '8'};
    private static final char[] h = new char[]{'\\', 'u', '2', '0', '2', '9'};
    private static final char[] i = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    protected final Writer a;

    h(Writer writer) {
        this.a = writer;
    }

    private static char[] a(char c8) {
        if (c8 == '\"') {
            return b;
        }
        if (c8 == '\\') {
            return c;
        }
        if (c8 == '\n') {
            return d;
        }
        if (c8 == '\r') {
            return e;
        }
        if (c8 == '\t') {
            return f;
        }
        if (c8 == '\u2028') {
            return g;
        }
        if (c8 == '\u2029') {
            return h;
        }
        if (c8 >= '\u0000' && c8 <= '\u001f') {
            char[] cArray = new char[]{'\\', 'u', '0', '0', '0', '0'};
            char[] cArray2 = i;
            cArray[4] = cArray2[c8 >> 4 & 0xF];
            cArray[5] = cArray2[c8 & 0xF];
            return cArray;
        }
        return null;
    }

    void b(String string) throws IOException {
        this.a.write(string);
    }

    protected void c(a object) throws IOException {
        this.e();
        object = ((a)object).iterator();
        boolean bl = true;
        while (object.hasNext()) {
            g g8 = (g)object.next();
            if (!bl) {
                this.d();
            }
            g8.z(this);
            bl = false;
        }
        this.g();
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
        this.a.write(125);
    }

    protected void i() throws IOException {
        this.a.write(58);
    }

    protected void j(d object) throws IOException {
        this.f();
        Iterator<d.c> iterator = ((d)object).iterator();
        boolean bl = true;
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!bl) {
                this.k();
            }
            this.l(((d.c)object).a());
            this.i();
            ((d.c)object).b().z(this);
            bl = false;
        }
        this.h();
    }

    protected void k() throws IOException {
        this.a.write(44);
    }

    void l(String object) throws IOException {
        this.a.write(34);
        int n8 = ((String)object).length();
        char[] cArray = new char[n8];
        ((String)object).getChars(0, n8, cArray, 0);
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            object = ax.O4.h.a(cArray[i8]);
            int n10 = n9;
            if (object != null) {
                this.a.write(cArray, n9, i8 - n9);
                this.a.write((char[])object);
                n10 = i8 + 1;
            }
            n9 = n10;
        }
        this.a.write(cArray, n9, n8 - n9);
        this.a.write(34);
    }
}

