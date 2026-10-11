/*
 * Decompiled with CFR 0.152.
 */
package ax.pd;

import ax.Wc.g;
import ax.Wc.v;
import ax.pd.a;
import ax.pd.b;
import ax.pd.c;
import ax.pd.e;
import java.util.Vector;

public class d {
    private e a;
    private Vector b = new Vector();

    public d(e e8) {
        this.a = e8;
    }

    public d a(v[] vArray, g[] gArray) {
        a[] aArray = new a[vArray.length];
        for (int i8 = 0; i8 != vArray.length; ++i8) {
            aArray[i8] = new a(vArray[i8], gArray[i8]);
        }
        return this.c(aArray);
    }

    public d b(v[] vArray, String[] stringArray) {
        int n8 = stringArray.length;
        g[] gArray = new g[n8];
        for (int i8 = 0; i8 != n8; ++i8) {
            gArray[i8] = this.a.a(vArray[i8], stringArray[i8]);
        }
        return this.a(vArray, gArray);
    }

    public d c(a[] aArray) {
        this.b.addElement(new b(aArray));
        return this;
    }

    public d d(v v8, g g8) {
        this.b.addElement(new b(v8, g8));
        return this;
    }

    public d e(v v8, String string) {
        this.d(v8, this.a.a(v8, string));
        return this;
    }

    public c f() {
        int n8 = this.b.size();
        b[] bArray = new b[n8];
        for (int i8 = 0; i8 != n8; ++i8) {
            bArray[i8] = (b)this.b.elementAt(i8);
        }
        return new c(this.a, bArray);
    }
}

