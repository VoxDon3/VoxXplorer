/*
 * Decompiled with CFR 0.152.
 */
package ax.qd;

import ax.Wc.C0;
import ax.Wc.g;
import ax.Wc.v;
import ax.Wc.z;
import ax.pd.b;
import ax.pd.e;
import ax.qd.c;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class a
implements e {
    private int g(g g8) {
        return c.d(g8).hashCode();
    }

    public static Hashtable h(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumeration = hashtable.keys();
        while (enumeration.hasMoreElements()) {
            Object k8 = enumeration.nextElement();
            hashtable2.put(k8, hashtable.get(k8));
        }
        return hashtable2;
    }

    private boolean j(boolean bl, b b8, b[] bArray) {
        if (bl) {
            for (int i8 = bArray.length - 1; i8 >= 0; --i8) {
                b b9 = bArray[i8];
                if (b9 == null || !this.k(b8, b9)) continue;
                bArray[i8] = null;
                return true;
            }
        } else {
            for (int i9 = 0; i9 != bArray.length; ++i9) {
                b b10 = bArray[i9];
                if (b10 == null || !this.k(b8, b10)) continue;
                bArray[i9] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public g a(v v8, String object) {
        if (((String)object).length() != 0 && ((String)object).charAt(0) == '#') {
            try {
                object = c.p((String)object, 1);
                return object;
            }
            catch (IOException iOException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("can't recode value for oid ");
                stringBuilder.append(v8.I());
                throw new z(stringBuilder.toString());
            }
        }
        String string = object;
        if (((String)object).length() != 0) {
            string = object;
            if (((String)object).charAt(0) == '\\') {
                string = ((String)object).substring(1);
            }
        }
        return this.i(v8, string);
    }

    @Override
    public int b(ax.pd.c bArray) {
        bArray = bArray.s();
        int n8 = 0;
        block0: for (int i8 = 0; i8 != bArray.length; ++i8) {
            if (bArray[i8].u()) {
                ax.pd.a[] aArray = bArray[i8].t();
                int n9 = 0;
                int n10 = n8;
                while (true) {
                    n8 = n10;
                    if (n9 == aArray.length) continue block0;
                    n10 = n10 ^ aArray[n9].s().hashCode() ^ this.g(aArray[n9].t());
                    ++n9;
                }
            }
            n8 = n8 ^ bArray[i8].r().s().hashCode() ^ this.g(bArray[i8].r().t());
        }
        return n8;
    }

    @Override
    public boolean e(ax.pd.c bArray, ax.pd.c bArray2) {
        if ((bArray = bArray.s()).length != (bArray2 = bArray2.s()).length) {
            return false;
        }
        boolean bl = bArray[0].r() != null && bArray2[0].r() != null ? bArray[0].r().s().y(bArray2[0].r().s()) ^ true : false;
        for (int i8 = 0; i8 != bArray.length; ++i8) {
            if (this.j(bl, bArray[i8], bArray2)) continue;
            return false;
        }
        return true;
    }

    protected g i(v v8, String string) {
        return new C0(string);
    }

    protected boolean k(b b8, b b9) {
        return c.j(b8, b9);
    }
}

