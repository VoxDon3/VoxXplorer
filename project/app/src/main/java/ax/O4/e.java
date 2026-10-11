/*
 * Decompiled with CFR 0.152.
 */
package ax.O4;

import ax.O4.a;
import ax.O4.c;
import ax.O4.d;
import ax.O4.f;
import ax.O4.g;
import ax.O4.i;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

class e {
    private final Reader a;
    private final char[] b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private StringBuilder i;
    private int j;

    e(Reader reader) {
        this(reader, 1024);
    }

    e(Reader reader, int n8) {
        this.a = reader;
        this.b = new char[n8];
        this.f = 1;
        this.j = -1;
    }

    e(String string) {
        this(new StringReader(string), Math.max(10, Math.min(1024, string.length())));
    }

    private void A() throws IOException {
        while (this.g()) {
            this.j();
        }
    }

    private void B() {
        if (this.i == null) {
            this.i = new StringBuilder();
        }
        this.j = this.d - 1;
    }

    private String a() {
        Object object;
        int n8 = this.h == -1 ? this.d : this.d - 1;
        if (this.i.length() > 0) {
            StringBuilder stringBuilder = this.i;
            object = this.b;
            int n9 = this.j;
            stringBuilder.append((char[])object, n9, n8 - n9);
            object = this.i.toString();
            this.i.setLength(0);
        } else {
            object = this.b;
            int n10 = this.j;
            object = new String((char[])object, n10, n8 - n10);
        }
        this.j = -1;
        return object;
    }

    private i b(String string) {
        int n8 = this.c + this.d;
        int n9 = this.g;
        int n10 = this.e() ? n8 : n8 - 1;
        return new i(string, n10, this.f, n8 - n9 - 1);
    }

    private i c(String string) {
        if (this.e()) {
            return this.b("Unexpected end of input");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(string);
        return this.b(stringBuilder.toString());
    }

    private boolean d() {
        int n8 = this.h;
        return n8 >= 48 && n8 <= 57;
    }

    private boolean e() {
        return this.h == -1;
    }

    private boolean f() {
        int n8 = this.h;
        return n8 >= 48 && n8 <= 57 || n8 >= 97 && n8 <= 102 || n8 >= 65 && n8 <= 70;
    }

    private boolean g() {
        int n8 = this.h;
        return n8 == 32 || n8 == 9 || n8 == 10 || n8 == 13;
        {
        }
    }

    private void i() {
        int n8 = this.h == -1 ? this.d : this.d - 1;
        StringBuilder stringBuilder = this.i;
        char[] cArray = this.b;
        int n9 = this.j;
        stringBuilder.append(cArray, n9, n8 - n9);
        this.j = -1;
    }

    private void j() throws IOException {
        if (!this.e()) {
            Object object;
            int n8 = this.d;
            int n9 = this.e;
            if (n8 == n9) {
                n8 = this.j;
                if (n8 != -1) {
                    this.i.append(this.b, n8, n9 - n8);
                    this.j = 0;
                }
                this.c += this.e;
                object = this.a;
                char[] cArray = this.b;
                this.e = n9 = ((Reader)object).read(cArray, 0, cArray.length);
                this.d = 0;
                if (n9 == -1) {
                    this.h = -1;
                    return;
                }
            }
            if (this.h == 10) {
                ++this.f;
                this.g = this.c + this.d;
            }
            object = this.b;
            n9 = this.d;
            this.d = n9 + 1;
            this.h = object[n9];
            return;
        }
        throw this.b("Unexpected end of input");
    }

    private a k() throws IOException {
        block4: {
            a a8;
            block3: {
                this.j();
                a8 = new a();
                this.A();
                if (this.l(']')) break block3;
                do {
                    this.A();
                    a8.B(this.z());
                    this.A();
                } while (this.l(','));
                if (!this.l(']')) break block4;
            }
            return a8;
        }
        throw this.c("',' or ']'");
    }

    private boolean l(char c8) throws IOException {
        if (this.h != c8) {
            return false;
        }
        this.j();
        return true;
    }

    private boolean m() throws IOException {
        if (!this.d()) {
            return false;
        }
        this.j();
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void n() throws IOException {
        this.j();
        int n8 = this.h;
        if (n8 != 34 && n8 != 47 && n8 != 92) {
            if (n8 != 98) {
                if (n8 != 102) {
                    if (n8 != 110) {
                        if (n8 != 114) {
                            if (n8 != 116) {
                                if (n8 != 117) throw this.c("valid escape sequence");
                                char[] cArray = new char[4];
                                for (n8 = 0; n8 < 4; ++n8) {
                                    this.j();
                                    if (!this.f()) throw this.c("hexadecimal digit");
                                    cArray[n8] = (char)this.h;
                                }
                                this.i.append((char)Integer.parseInt(String.valueOf(cArray), 16));
                            } else {
                                this.i.append('\t');
                            }
                        } else {
                            this.i.append('\r');
                        }
                    } else {
                        this.i.append('\n');
                    }
                } else {
                    this.i.append('\f');
                }
            } else {
                this.i.append('\b');
            }
        } else {
            this.i.append((char)n8);
        }
        this.j();
    }

    private boolean o() throws IOException {
        if (!this.l('e') && !this.l('E')) {
            return false;
        }
        if (!this.l('+')) {
            this.l('-');
        }
        if (this.m()) {
            while (this.m()) {
            }
            return true;
        }
        throw this.c("digit");
    }

    private g p() throws IOException {
        this.j();
        this.v('a');
        this.v('l');
        this.v('s');
        this.v('e');
        return ax.O4.g.c0;
    }

    private boolean q() throws IOException {
        if (!this.l('.')) {
            return false;
        }
        if (this.m()) {
            while (this.m()) {
            }
            return true;
        }
        throw this.c("digit");
    }

    private String r() throws IOException {
        if (this.h == 34) {
            return this.x();
        }
        throw this.c("name");
    }

    private g s() throws IOException {
        this.j();
        this.v('u');
        this.v('l');
        this.v('l');
        return ax.O4.g.d0;
    }

    private g t() throws IOException {
        this.B();
        this.l('-');
        int n8 = this.h;
        if (this.m()) {
            if (n8 != 48) {
                while (this.m()) {
                }
            }
            this.q();
            this.o();
            return new c(this.a());
        }
        throw this.c("digit");
    }

    private d u() throws IOException {
        block3: {
            block5: {
                d d8;
                block4: {
                    this.j();
                    d8 = new d();
                    this.A();
                    if (this.l('}')) break block4;
                    do {
                        this.A();
                        String string = this.r();
                        this.A();
                        if (!this.l(':')) break block3;
                        this.A();
                        d8.B(string, this.z());
                        this.A();
                    } while (this.l(','));
                    if (!this.l('}')) break block5;
                }
                return d8;
            }
            throw this.c("',' or '}'");
        }
        throw this.c("':'");
    }

    private void v(char c8) throws IOException {
        if (this.l(c8)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("'");
        stringBuilder.append(c8);
        stringBuilder.append("'");
        throw this.c(stringBuilder.toString());
    }

    private g w() throws IOException {
        return new f(this.x());
    }

    private String x() throws IOException {
        int n8;
        this.j();
        this.B();
        while ((n8 = this.h) != 34) {
            if (n8 == 92) {
                this.i();
                this.n();
                this.B();
                continue;
            }
            if (n8 >= 32) {
                this.j();
                continue;
            }
            throw this.c("valid string character");
        }
        String string = this.a();
        this.j();
        return string;
    }

    private g y() throws IOException {
        this.j();
        this.v('r');
        this.v('u');
        this.v('e');
        return ax.O4.g.q;
    }

    private g z() throws IOException {
        int n8 = this.h;
        if (n8 != 34) {
            if (n8 != 45) {
                if (n8 != 91) {
                    if (n8 != 102) {
                        if (n8 != 110) {
                            if (n8 != 116) {
                                if (n8 != 123) {
                                    switch (n8) {
                                        default: {
                                            throw this.c("value");
                                        }
                                        case 48: 
                                        case 49: 
                                        case 50: 
                                        case 51: 
                                        case 52: 
                                        case 53: 
                                        case 54: 
                                        case 55: 
                                        case 56: 
                                        case 57: {
                                            return this.t();
                                        }
                                    }
                                }
                                return this.u();
                            }
                            return this.y();
                        }
                        return this.s();
                    }
                    return this.p();
                }
                return this.k();
            }
            return this.t();
        }
        return this.w();
    }

    g h() throws IOException {
        this.j();
        this.A();
        g g8 = this.z();
        this.A();
        if (this.e()) {
            return g8;
        }
        throw this.b("Unexpected character");
    }
}

