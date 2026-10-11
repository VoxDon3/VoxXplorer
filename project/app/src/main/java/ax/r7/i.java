/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;

final class i {
    static void a(Object object, Object object2) {
        if (object != null) {
            if (object2 != null) {
                return;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("null value in entry: ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append("=null");
            throw new NullPointerException(((StringBuilder)object2).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("null key in entry: null=");
        ((StringBuilder)object).append(object2);
        throw new NullPointerException(((StringBuilder)object).toString());
    }

    static int b(int n8, String string) {
        if (n8 >= 0) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" cannot be negative but was: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static void c(boolean bl) {
        n.u(bl, "no calls to next() since the last call to remove()");
    }
}

