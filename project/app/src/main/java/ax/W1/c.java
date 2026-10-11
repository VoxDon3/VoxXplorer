/*
 * Decompiled with CFR 0.152.
 */
package ax.W1;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class c {
    private String a = "";
    private String b = "";
    private Set<String> c = Collections.EMPTY_SET;
    private String d = "";
    private String e = null;
    private int f;
    private boolean g = false;
    private int h;
    private boolean i = false;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private float o;
    private int p = -1;
    private boolean q = false;

    private static int B(int n8, String string, String string2, int n9) {
        if (!string.isEmpty() && n8 != -1) {
            if (string.equals(string2)) {
                return n8 + n9;
            }
            return -1;
        }
        return n8;
    }

    public c A(boolean bl) {
        this.k = bl ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.i) {
            return this.h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.q;
    }

    public int c() {
        if (this.g) {
            return this.f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.e;
    }

    public float e() {
        return this.o;
    }

    public int f() {
        return this.n;
    }

    public int g() {
        return this.p;
    }

    public int h(String string, String string2, Set<String> set, String string3) {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return TextUtils.isEmpty((CharSequence)string2) ? 1 : 0;
        }
        int n8 = ax.W1.c.B(ax.W1.c.B(ax.W1.c.B(0, this.a, string, 0x40000000), this.b, string2, 2), this.d, string3, 4);
        if (n8 != -1 && set.containsAll(this.c)) {
            return n8 + this.c.size() * 4;
        }
        return 0;
    }

    public int i() {
        int n8 = this.l;
        if (n8 == -1 && this.m == -1) {
            return -1;
        }
        int n9 = 0;
        n8 = n8 == 1 ? 1 : 0;
        if (this.m == 1) {
            n9 = 2;
        }
        return n8 | n9;
    }

    public boolean j() {
        return this.i;
    }

    public boolean k() {
        return this.g;
    }

    public boolean l() {
        return this.j == 1;
    }

    public boolean m() {
        return this.k == 1;
    }

    public c n(int n8) {
        this.h = n8;
        this.i = true;
        return this;
    }

    public c o(boolean bl) {
        this.l = bl ? 1 : 0;
        return this;
    }

    public c p(boolean bl) {
        this.q = bl;
        return this;
    }

    public c q(int n8) {
        this.f = n8;
        this.g = true;
        return this;
    }

    public c r(String string) {
        string = string == null ? null : ax.q7.c.e(string);
        this.e = string;
        return this;
    }

    public c s(float f8) {
        this.o = f8;
        return this;
    }

    public c t(int n8) {
        this.n = n8;
        return this;
    }

    public c u(boolean bl) {
        this.m = bl ? 1 : 0;
        return this;
    }

    public c v(int n8) {
        this.p = n8;
        return this;
    }

    public void w(String[] stringArray) {
        this.c = new HashSet<String>(Arrays.asList(stringArray));
    }

    public void x(String string) {
        this.a = string;
    }

    public void y(String string) {
        this.b = string;
    }

    public void z(String string) {
        this.d = string;
    }
}

