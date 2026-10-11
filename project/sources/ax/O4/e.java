package ax.O4;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes.dex */
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

    e(String str) {
        this(new StringReader(str), Math.max(10, Math.min(1024, str.length())));
    }

    private void A() throws IOException {
        while (g()) {
            j();
        }
    }

    private void B() {
        if (this.i == null) {
            this.i = new StringBuilder();
        }
        this.j = this.d - 1;
    }

    private String a() {
        String str;
        int i = this.h == -1 ? this.d : this.d - 1;
        if (this.i.length() > 0) {
            StringBuilder sb = this.i;
            char[] cArr = this.b;
            int i2 = this.j;
            sb.append(cArr, i2, i - i2);
            str = this.i.toString();
            this.i.setLength(0);
        } else {
            char[] cArr2 = this.b;
            int i3 = this.j;
            str = new String(cArr2, i3, i - i3);
        }
        this.j = -1;
        return str;
    }

    private i b(String str) {
        int i = this.c + this.d;
        int i2 = i - this.g;
        if (!e()) {
            i--;
        }
        return new i(str, i, this.f, i2 - 1);
    }

    private i c(String str) {
        if (e()) {
            return b("Unexpected end of input");
        }
        return b("Expected " + str);
    }

    private boolean d() {
        int i = this.h;
        return i >= 48 && i <= 57;
    }

    private boolean e() {
        return this.h == -1;
    }

    private boolean f() {
        int i = this.h;
        if (i >= 48 && i <= 57) {
            return true;
        }
        if (i < 97 || i > 102) {
            return i >= 65 && i <= 70;
        }
        return true;
    }

    private boolean g() {
        int i = this.h;
        return i == 32 || i == 9 || i == 10 || i == 13;
    }

    private void i() {
        int i = this.h == -1 ? this.d : this.d - 1;
        StringBuilder sb = this.i;
        char[] cArr = this.b;
        int i2 = this.j;
        sb.append(cArr, i2, i - i2);
        this.j = -1;
    }

    private void j() throws IOException {
        if (e()) {
            throw b("Unexpected end of input");
        }
        int i = this.d;
        int i2 = this.e;
        if (i == i2) {
            int i3 = this.j;
            if (i3 != -1) {
                this.i.append(this.b, i3, i2 - i3);
                this.j = 0;
            }
            this.c += this.e;
            Reader reader = this.a;
            char[] cArr = this.b;
            int read = reader.read(cArr, 0, cArr.length);
            this.e = read;
            this.d = 0;
            if (read == -1) {
                this.h = -1;
                return;
            }
        }
        if (this.h == 10) {
            this.f++;
            this.g = this.c + this.d;
        }
        char[] cArr2 = this.b;
        int i4 = this.d;
        this.d = i4 + 1;
        this.h = cArr2[i4];
    }

    private a k() throws IOException {
        j();
        a aVar = new a();
        A();
        if (!l(']')) {
            do {
                A();
                aVar.B(z());
                A();
            } while (l(','));
            if (!l(']')) {
                throw c("',' or ']'");
            }
        }
        return aVar;
    }

    private boolean l(char c) throws IOException {
        if (this.h != c) {
            return false;
        }
        j();
        return true;
    }

    private boolean m() throws IOException {
        if (!d()) {
            return false;
        }
        j();
        return true;
    }

    private void n() throws IOException {
        j();
        int i = this.h;
        if (i == 34 || i == 47 || i == 92) {
            this.i.append((char) i);
        } else if (i == 98) {
            this.i.append('\b');
        } else if (i == 102) {
            this.i.append('\f');
        } else if (i == 110) {
            this.i.append('\n');
        } else if (i == 114) {
            this.i.append('\r');
        } else if (i == 116) {
            this.i.append('\t');
        } else {
            if (i != 117) {
                throw c("valid escape sequence");
            }
            char[] cArr = new char[4];
            for (int i2 = 0; i2 < 4; i2++) {
                j();
                if (!f()) {
                    throw c("hexadecimal digit");
                }
                cArr[i2] = (char) this.h;
            }
            this.i.append((char) Integer.parseInt(String.valueOf(cArr), 16));
        }
        j();
    }

    private boolean o() throws IOException {
        if (!l('e') && !l('E')) {
            return false;
        }
        if (!l('+')) {
            l('-');
        }
        if (!m()) {
            throw c("digit");
        }
        while (m()) {
        }
        return true;
    }

    private g p() throws IOException {
        j();
        v('a');
        v('l');
        v('s');
        v('e');
        return g.c0;
    }

    private boolean q() throws IOException {
        if (!l('.')) {
            return false;
        }
        if (!m()) {
            throw c("digit");
        }
        while (m()) {
        }
        return true;
    }

    private String r() throws IOException {
        if (this.h == 34) {
            return x();
        }
        throw c("name");
    }

    private g s() throws IOException {
        j();
        v('u');
        v('l');
        v('l');
        return g.d0;
    }

    private g t() throws IOException {
        B();
        l('-');
        int i = this.h;
        if (!m()) {
            throw c("digit");
        }
        if (i != 48) {
            while (m()) {
            }
        }
        q();
        o();
        return new c(a());
    }

    private d u() throws IOException {
        j();
        d dVar = new d();
        A();
        if (!l('}')) {
            do {
                A();
                String r = r();
                A();
                if (!l(':')) {
                    throw c("':'");
                }
                A();
                dVar.B(r, z());
                A();
            } while (l(','));
            if (!l('}')) {
                throw c("',' or '}'");
            }
        }
        return dVar;
    }

    private void v(char c) throws IOException {
        if (l(c)) {
            return;
        }
        throw c("'" + c + "'");
    }

    private g w() throws IOException {
        return new f(x());
    }

    private String x() throws IOException {
        j();
        B();
        while (true) {
            int i = this.h;
            if (i == 34) {
                String a = a();
                j();
                return a;
            }
            if (i == 92) {
                i();
                n();
                B();
            } else {
                if (i < 32) {
                    throw c("valid string character");
                }
                j();
            }
        }
    }

    private g y() throws IOException {
        j();
        v('r');
        v('u');
        v('e');
        return g.q;
    }

    private g z() throws IOException {
        int i = this.h;
        if (i == 34) {
            return w();
        }
        if (i != 45) {
            if (i == 91) {
                return k();
            }
            if (i == 102) {
                return p();
            }
            if (i == 110) {
                return s();
            }
            if (i == 116) {
                return y();
            }
            if (i == 123) {
                return u();
            }
            switch (i) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    break;
                default:
                    throw c("value");
            }
        }
        return t();
    }

    g h() throws IOException {
        j();
        A();
        g z = z();
        A();
        if (e()) {
            return z;
        }
        throw b("Unexpected character");
    }

    e(Reader reader) {
        this(reader, 1024);
    }

    e(Reader reader, int i) {
        this.a = reader;
        this.b = new char[i];
        this.f = 1;
        this.j = -1;
    }
}
