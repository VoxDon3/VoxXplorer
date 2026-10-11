package ax.tb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ax.tb.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3137m extends C3136l {
    public static /* synthetic */ String A(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ax.Fb.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if ((i2 & 4) != 0) {
            charSequence3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ax.Fb.l lVar2 = lVar;
        return z(objArr, charSequence, charSequence2, charSequence3, i, charSequence5, lVar2);
    }

    public static char B(char[] cArr) {
        ax.Gb.l.f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T C(T[] tArr) {
        ax.Gb.l.f(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T, C extends Collection<? super T>> C D(T[] tArr, C c) {
        ax.Gb.l.f(tArr, "<this>");
        ax.Gb.l.f(c, "destination");
        for (T t : tArr) {
            c.add(t);
        }
        return c;
    }

    public static <T> List<T> E(T[] tArr) {
        ax.Gb.l.f(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? F(tArr) : C3140p.d(tArr[0]) : C3141q.j();
    }

    public static <T> List<T> F(T[] tArr) {
        ax.Gb.l.f(tArr, "<this>");
        return new ArrayList(C3141q.g(tArr));
    }

    public static final <T> boolean s(T[] tArr, T t) {
        ax.Gb.l.f(tArr, "<this>");
        return x(tArr, t) >= 0;
    }

    public static <T> List<T> t(T[] tArr) {
        ax.Gb.l.f(tArr, "<this>");
        return (List) u(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C u(T[] tArr, C c) {
        ax.Gb.l.f(tArr, "<this>");
        ax.Gb.l.f(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static <T> int v(T[] tArr) {
        ax.Gb.l.f(tArr, "<this>");
        return tArr.length - 1;
    }

    public static <T> T w(T[] tArr, int i) {
        ax.Gb.l.f(tArr, "<this>");
        if (i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    public static final <T> int x(T[] tArr, T t) {
        ax.Gb.l.f(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (ax.Gb.l.a(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A y(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ax.Fb.l<? super T, ? extends CharSequence> lVar) {
        ax.Gb.l.f(tArr, "<this>");
        ax.Gb.l.f(a, "buffer");
        ax.Gb.l.f(charSequence, "separator");
        ax.Gb.l.f(charSequence2, "prefix");
        ax.Gb.l.f(charSequence3, "postfix");
        ax.Gb.l.f(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            ax.Ob.h.a(a, t, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <T> String z(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ax.Fb.l<? super T, ? extends CharSequence> lVar) {
        ax.Gb.l.f(tArr, "<this>");
        ax.Gb.l.f(charSequence, "separator");
        ax.Gb.l.f(charSequence2, "prefix");
        ax.Gb.l.f(charSequence3, "postfix");
        ax.Gb.l.f(charSequence4, "truncated");
        return ((StringBuilder) y(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
    }
}
