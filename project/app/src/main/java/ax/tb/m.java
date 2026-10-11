/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Ob.h;
import ax.tb.l;
import ax.tb.p;
import ax.tb.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

class m
extends l {
    public static /* synthetic */ String A(Object[] objectArray, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n8, CharSequence charSequence4, ax.Fb.l l8, int n9, Object object) {
        if ((n9 & 1) != 0) {
            charSequence = ", ";
        }
        if ((n9 & 2) != 0) {
            charSequence2 = "";
        }
        if ((n9 & 4) != 0) {
            charSequence3 = "";
        }
        if ((n9 & 8) != 0) {
            n8 = -1;
        }
        if ((n9 & 0x10) != 0) {
            charSequence4 = "...";
        }
        if ((n9 & 0x20) != 0) {
            l8 = null;
        }
        return m.z(objectArray, charSequence, charSequence2, charSequence3, n8, charSequence4, l8);
    }

    public static char B(char[] cArray) {
        ax.Gb.l.f(cArray, "<this>");
        int n8 = cArray.length;
        if (n8 != 0) {
            if (n8 == 1) {
                return cArray[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T C(T[] TArray) {
        ax.Gb.l.f(TArray, "<this>");
        if (TArray.length == 1) {
            return TArray[0];
        }
        return null;
    }

    public static final <T, C extends Collection<? super T>> C D(T[] TArray, C c8) {
        ax.Gb.l.f(TArray, "<this>");
        ax.Gb.l.f(c8, "destination");
        int n8 = TArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            c8.add(TArray[i8]);
        }
        return c8;
    }

    public static <T> List<T> E(T[] TArray) {
        ax.Gb.l.f(TArray, "<this>");
        int n8 = TArray.length;
        if (n8 != 0) {
            if (n8 != 1) {
                return m.F(TArray);
            }
            return p.d(TArray[0]);
        }
        return q.j();
    }

    public static <T> List<T> F(T[] TArray) {
        ax.Gb.l.f(TArray, "<this>");
        return new ArrayList<T>(q.g(TArray));
    }

    public static final <T> boolean s(T[] TArray, T t8) {
        ax.Gb.l.f(TArray, "<this>");
        return m.x(TArray, t8) >= 0;
    }

    public static <T> List<T> t(T[] TArray) {
        ax.Gb.l.f(TArray, "<this>");
        return m.u(TArray, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C u(T[] TArray, C c8) {
        ax.Gb.l.f(TArray, "<this>");
        ax.Gb.l.f(c8, "destination");
        for (T t8 : TArray) {
            if (t8 == null) continue;
            c8.add(t8);
        }
        return c8;
    }

    public static <T> int v(T[] TArray) {
        ax.Gb.l.f(TArray, "<this>");
        return TArray.length - 1;
    }

    public static <T> T w(T[] TArray, int n8) {
        ax.Gb.l.f(TArray, "<this>");
        if (n8 >= 0 && n8 < TArray.length) {
            return TArray[n8];
        }
        return null;
    }

    public static final <T> int x(T[] TArray, T t8) {
        int n8;
        ax.Gb.l.f(TArray, "<this>");
        int n9 = 0;
        if (t8 == null) {
            int n10 = TArray.length;
            for (n8 = n9; n8 < n10; ++n8) {
                if (TArray[n8] != null) continue;
                return n8;
            }
        } else {
            n9 = TArray.length;
            for (n8 = 0; n8 < n9; ++n8) {
                if (!ax.Gb.l.a(t8, TArray[n8])) continue;
                return n8;
            }
        }
        return -1;
    }

    public static final <T, A extends Appendable> A y(T[] TArray, A a8, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n8, CharSequence charSequence4, ax.Fb.l<? super T, ? extends CharSequence> l8) {
        int n9;
        ax.Gb.l.f(TArray, "<this>");
        ax.Gb.l.f(a8, "buffer");
        ax.Gb.l.f(charSequence, "separator");
        ax.Gb.l.f(charSequence2, "prefix");
        ax.Gb.l.f(charSequence3, "postfix");
        ax.Gb.l.f(charSequence4, "truncated");
        a8.append(charSequence2);
        int n10 = TArray.length;
        int n11 = 0;
        int n12 = 0;
        while (true) {
            n9 = n12++;
            if (n11 >= n10) break;
            charSequence2 = TArray[n11];
            if (n12 > 1) {
                a8.append(charSequence);
            }
            if (n8 >= 0) {
                n9 = n12;
                if (n12 > n8) break;
            }
            h.a(a8, charSequence2, l8);
            ++n11;
        }
        if (n8 >= 0 && n9 > n8) {
            a8.append(charSequence4);
        }
        a8.append(charSequence3);
        return a8;
    }

    public static final <T> String z(T[] TArray, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n8, CharSequence charSequence4, ax.Fb.l<? super T, ? extends CharSequence> l8) {
        ax.Gb.l.f(TArray, "<this>");
        ax.Gb.l.f(charSequence, "separator");
        ax.Gb.l.f(charSequence2, "prefix");
        ax.Gb.l.f(charSequence3, "postfix");
        ax.Gb.l.f(charSequence4, "truncated");
        return m.y(TArray, new StringBuilder(), charSequence, charSequence2, charSequence3, n8, charSequence4, l8).toString();
    }
}

