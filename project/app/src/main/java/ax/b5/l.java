/*
 * Decompiled with CFR 0.152.
 */
package ax.b5;

import ax.W4.i;
import ax.b5.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class l {
    static final char[] l = new char[0];
    private final a a;
    private char[] b;
    private int c;
    private int d;
    private ArrayList<char[]> e;
    private boolean f;
    private int g;
    private char[] h;
    private int i;
    private String j;
    private char[] k;

    public l(a a8) {
        this.a = a8;
    }

    private char[] b(int n8) {
        a a8 = this.a;
        if (a8 != null) {
            return a8.d(2, n8);
        }
        return new char[Math.max(n8, 500)];
    }

    private char[] c(int n8) {
        return new char[n8];
    }

    private void d() {
        this.f = false;
        this.e.clear();
        this.g = 0;
        this.i = 0;
    }

    private void j() {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        char[] cArray = this.h;
        this.f = true;
        this.e.add(cArray);
        this.g += cArray.length;
        this.i = 0;
        int n8 = cArray.length;
        int n9 = n8 + (n8 >> 1);
        if (n9 < 500) {
            n8 = 500;
        } else {
            n8 = n9;
            if (n9 > 65536) {
                n8 = 65536;
            }
        }
        this.h = this.c(n8);
    }

    private char[] u() throws IOException {
        int n8;
        Object object = this.j;
        if (object != null) {
            return ((String)object).toCharArray();
        }
        if (this.c >= 0) {
            int n9 = this.d;
            if (n9 < 1) {
                return l;
            }
            this.A(n9);
            int n10 = this.c;
            if (n10 == 0) {
                return Arrays.copyOf(this.b, n9);
            }
            return Arrays.copyOfRange(this.b, n10, n9 + n10);
        }
        int n11 = this.x();
        if (n11 < 1) {
            return l;
        }
        this.A(n11);
        object = this.c(n11);
        Object object2 = this.e;
        if (object2 != null) {
            int n12 = ((ArrayList)object2).size();
            int n13 = 0;
            n11 = 0;
            while (true) {
                n8 = n11;
                if (n13 < n12) {
                    object2 = this.e.get(n13);
                    n8 = ((Object)object2).length;
                    System.arraycopy(object2, 0, object, n11, n8);
                    n11 += n8;
                    ++n13;
                    continue;
                }
                break;
            }
        } else {
            n8 = 0;
        }
        System.arraycopy(this.h, 0, object, n8, this.i);
        return object;
    }

    private void y(int n8) {
        int n9 = this.d;
        this.d = 0;
        char[] cArray = this.b;
        this.b = null;
        int n10 = this.c;
        this.c = -1;
        char[] cArray2 = this.h;
        if (cArray2 == null || (n8 += n9) > cArray2.length) {
            this.h = this.b(n8);
        }
        if (n9 > 0) {
            System.arraycopy(cArray, n10, this.h, 0, n9);
        }
        this.g = 0;
        this.i = n9;
    }

    private void z(int n8) throws IOException {
        int n9;
        n8 = n9 = this.g + this.i + n8;
        if (n9 < 0) {
            n8 = Integer.MAX_VALUE;
        }
        this.A(n8);
    }

    protected void A(int n8) throws IOException {
        throw null;
    }

    public void a(char[] cArray, int n8, int n9) throws IOException {
        if (this.c >= 0) {
            this.y(n9);
        }
        this.j = null;
        this.k = null;
        char[] cArray2 = this.h;
        int n10 = cArray2.length;
        int n11 = this.i;
        int n12 = n10 - n11;
        if (n12 >= n9) {
            System.arraycopy(cArray, n8, cArray2, n11, n9);
            this.i += n9;
            return;
        }
        this.z(n9);
        n10 = n8;
        n11 = n9;
        if (n12 > 0) {
            System.arraycopy(cArray, n8, cArray2, this.i, n12);
            n10 = n8 + n12;
            n11 = n9 - n12;
        }
        do {
            this.j();
            n8 = Math.min(this.h.length, n11);
            System.arraycopy(cArray, n10, this.h, 0, n8);
            this.i += n8;
            n10 += n8;
            n11 = n8 = n11 - n8;
        } while (n8 > 0);
    }

    public char[] e() throws IOException {
        char[] cArray;
        char[] cArray2 = cArray = this.k;
        if (cArray == null) {
            this.k = cArray2 = this.u();
        }
        return cArray2;
    }

    public int f(boolean bl) {
        char[] cArray;
        int n8 = this.c;
        if (n8 >= 0 && (cArray = this.b) != null) {
            if (bl) {
                return -ax.W4.i.g(cArray, n8 + 1, this.d - 1);
            }
            return ax.W4.i.g(cArray, n8, this.d);
        }
        if (bl) {
            return -ax.W4.i.g(this.h, 1, this.i - 1);
        }
        return ax.W4.i.g(this.h, 0, this.i);
    }

    public long g(boolean bl) {
        char[] cArray;
        int n8 = this.c;
        if (n8 >= 0 && (cArray = this.b) != null) {
            if (bl) {
                return -ax.W4.i.h(cArray, n8 + 1, this.d - 1);
            }
            return ax.W4.i.h(cArray, n8, this.d);
        }
        if (bl) {
            return -ax.W4.i.h(this.h, 1, this.i - 1);
        }
        return ax.W4.i.h(this.h, 0, this.i);
    }

    public String h() throws IOException {
        if (this.j == null) {
            Object object = this.k;
            if (object != null) {
                this.j = new String((char[])object);
            } else if (this.c >= 0) {
                int n8 = this.d;
                if (n8 < 1) {
                    this.j = "";
                    return "";
                }
                this.A(n8);
                this.j = new String(this.b, this.c, this.d);
            } else {
                int n9 = this.g;
                int n10 = this.i;
                if (n9 == 0) {
                    if (n10 == 0) {
                        this.j = "";
                    } else {
                        this.A(n10);
                        this.j = new String(this.h, 0, n10);
                    }
                } else {
                    n10 = n9 + n10;
                    this.A(n10);
                    object = new StringBuilder(n10);
                    Object object2 = this.e;
                    if (object2 != null) {
                        n9 = ((ArrayList)object2).size();
                        for (n10 = 0; n10 < n9; ++n10) {
                            object2 = this.e.get(n10);
                            object.append((char[])object2, 0, ((Object)object2).length);
                        }
                    }
                    object.append(this.h, 0, this.i);
                    this.j = object.toString();
                }
            }
        }
        return this.j;
    }

    public char[] i() {
        char[] cArray;
        this.c = -1;
        this.i = 0;
        this.d = 0;
        this.b = null;
        this.j = null;
        this.k = null;
        if (this.f) {
            this.d();
        }
        if ((cArray = this.h) == null) {
            this.h = cArray = this.b(0);
            return cArray;
        }
        return cArray;
    }

    public char[] k() {
        int n8;
        char[] cArray = this.h;
        int n9 = cArray.length;
        int n10 = n8 = (n9 >> 1) + n9;
        if (n8 > 65536) {
            n10 = (n9 >> 2) + n9;
        }
        this.h = cArray = Arrays.copyOf(cArray, n10);
        return cArray;
    }

    public char[] l() throws IOException {
        int n8;
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.f = true;
        this.e.add(this.h);
        int n9 = this.h.length;
        this.g = n8 = this.g + n9;
        this.i = 0;
        this.A(n8);
        n8 = n9 + (n9 >> 1);
        if (n8 < 500) {
            n9 = 500;
        } else {
            n9 = n8;
            if (n8 > 65536) {
                n9 = 65536;
            }
        }
        char[] cArray = this.c(n9);
        this.h = cArray;
        return cArray;
    }

    public char[] m() {
        if (this.c >= 0) {
            this.y(1);
        } else {
            char[] cArray = this.h;
            if (cArray == null) {
                this.h = this.b(0);
            } else if (this.i >= cArray.length) {
                this.j();
            }
        }
        return this.h;
    }

    public int n() {
        return this.i;
    }

    public char[] o() throws IOException {
        if (this.c >= 0) {
            return this.b;
        }
        Object object = this.k;
        if (object != null) {
            return object;
        }
        object = this.j;
        if (object != null) {
            this.k = object = (Object)object.toCharArray();
            return object;
        }
        if (!this.f) {
            char[] cArray = this.h;
            object = cArray;
            if (cArray == null) {
                object = l;
            }
            return object;
        }
        return this.e();
    }

    public int p() {
        int n8 = this.c;
        if (n8 >= 0) {
            return n8;
        }
        return 0;
    }

    public void q() {
        char[] cArray;
        a a8;
        this.c = -1;
        this.i = 0;
        this.d = 0;
        this.b = null;
        this.k = null;
        if (this.f) {
            this.d();
        }
        if ((a8 = this.a) != null && (cArray = this.h) != null) {
            this.h = null;
            a8.j(2, cArray);
        }
    }

    public void r(char[] cArray, int n8, int n9) throws IOException {
        this.b = null;
        this.c = -1;
        this.d = 0;
        this.j = null;
        this.k = null;
        if (this.f) {
            this.d();
        } else if (this.h == null) {
            this.h = this.b(n9);
        }
        this.g = 0;
        this.i = 0;
        this.a(cArray, n8, n9);
    }

    public void s(char[] cArray, int n8, int n9) {
        this.j = null;
        this.k = null;
        this.b = cArray;
        this.c = n8;
        this.d = n9;
        if (this.f) {
            this.d();
        }
    }

    public void t(String string) throws IOException {
        this.b = null;
        this.c = -1;
        this.d = 0;
        this.A(string.length());
        this.j = string;
        this.k = null;
        if (this.f) {
            this.d();
        }
        this.i = 0;
    }

    public String toString() {
        try {
            String string = this.h();
            return string;
        }
        catch (IOException iOException) {
            return "TextBuffer: Exception when reading contents";
        }
    }

    public String v(int n8) throws IOException {
        this.i = n8;
        if (this.g > 0) {
            return this.h();
        }
        this.A(n8);
        String string = n8 == 0 ? "" : new String(this.h, 0, n8);
        this.j = string;
        return string;
    }

    public void w(int n8) {
        this.i = n8;
    }

    public int x() {
        if (this.c >= 0) {
            return this.d;
        }
        Object object = this.k;
        if (object != null) {
            return ((char[])object).length;
        }
        object = this.j;
        if (object != null) {
            return object.length();
        }
        return this.g + this.i;
    }
}

