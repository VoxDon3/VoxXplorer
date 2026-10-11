/*
 * Decompiled with CFR 0.152.
 */
package ax.Ob;

import ax.Gb.l;

class i {
    public static <T> void a(Appendable appendable, T t8, ax.Fb.l<? super T, ? extends CharSequence> l8) {
        l.f(appendable, "<this>");
        if (l8 != null) {
            appendable.append(l8.invoke(t8));
            return;
        }
        boolean bl = t8 == null ? true : t8 instanceof CharSequence;
        if (bl) {
            appendable.append((CharSequence)t8);
            return;
        }
        if (t8 instanceof Character) {
            appendable.append(((Character)t8).charValue());
            return;
        }
        appendable.append(t8.toString());
    }
}

