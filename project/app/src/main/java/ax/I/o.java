/*
 * Decompiled with CFR 0.152.
 */
package ax.I;

import ax.E.d;
import ax.H.b;
import ax.H.e;
import ax.H.f;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class o {
    static int g;
    ArrayList<e> a = new ArrayList();
    int b;
    boolean c = false;
    int d;
    ArrayList<a> e = null;
    private int f = -1;

    public o(int n8) {
        int n9 = g;
        g = n9 + 1;
        this.b = n9;
        this.d = n8;
    }

    private String e() {
        int n8 = this.d;
        if (n8 == 0) {
            return "Horizontal";
        }
        if (n8 == 1) {
            return "Vertical";
        }
        if (n8 == 2) {
            return "Both";
        }
        return "Unknown";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int j(d d8, ArrayList<e> arrayList, int n8) {
        int n9;
        int n10 = 0;
        f f8 = (f)arrayList.get(0).K();
        d8.D();
        f8.g(d8, false);
        for (n9 = 0; n9 < arrayList.size(); ++n9) {
            arrayList.get(n9).g(d8, false);
        }
        if (n8 == 0 && f8.W0 > 0) {
            ax.H.b.b(f8, d8, arrayList, 0);
        }
        if (n8 == 1 && f8.X0 > 0) {
            ax.H.b.b(f8, d8, arrayList, 1);
        }
        try {
            d8.z();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.e = new ArrayList();
        for (n9 = n10; n9 < arrayList.size(); ++n9) {
            a a8 = new a(this, arrayList.get(n9), d8, n8);
            this.e.add(a8);
        }
        if (n8 == 0) {
            n9 = d8.x(f8.O);
            n8 = d8.x(f8.Q);
            d8.D();
            return n8 - n9;
        }
        n9 = d8.x(f8.P);
        n8 = d8.x(f8.R);
        d8.D();
        return n8 - n9;
    }

    public boolean a(e e8) {
        if (this.a.contains(e8)) {
            return false;
        }
        this.a.add(e8);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int n8 = this.a.size();
        if (this.f != -1 && n8 > 0) {
            for (int i8 = 0; i8 < arrayList.size(); ++i8) {
                o o8 = arrayList.get(i8);
                if (this.f != o8.b) continue;
                this.g(this.d, o8);
            }
        }
        if (n8 == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public int f(d d8, int n8) {
        if (this.a.size() == 0) {
            return 0;
        }
        return this.j(d8, this.a, n8);
    }

    public void g(int n8, o o8) {
        ArrayList<e> arrayList = this.a;
        int n9 = arrayList.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            e e8 = arrayList.get(i8);
            o8.a(e8);
            if (n8 == 0) {
                e8.I0 = o8.c();
                continue;
            }
            e8.J0 = o8.c();
        }
        this.f = o8.b;
    }

    public void h(boolean bl) {
        this.c = bl;
    }

    public void i(int n8) {
        this.d = n8;
    }

    public String toString() {
        CharSequence charSequence = new StringBuilder();
        charSequence.append(this.e());
        charSequence.append(" [");
        charSequence.append(this.b);
        charSequence.append("] <");
        charSequence = charSequence.toString();
        Serializable serializable = this.a;
        int n8 = ((ArrayList)serializable).size();
        for (int i8 = 0; i8 < n8; ++i8) {
            e e8 = ((ArrayList)serializable).get(i8);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(" ");
            stringBuilder.append(e8.t());
            charSequence = stringBuilder.toString();
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append((String)charSequence);
        ((StringBuilder)serializable).append(" >");
        return ((StringBuilder)serializable).toString();
    }

    class a {
        WeakReference<e> a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        final o h;

        public a(o o8, e e8, d d8, int n8) {
            this.h = o8;
            this.a = new WeakReference<e>(e8);
            this.b = d8.x(e8.O);
            this.c = d8.x(e8.P);
            this.d = d8.x(e8.Q);
            this.e = d8.x(e8.R);
            this.f = d8.x(e8.S);
            this.g = n8;
        }
    }
}

