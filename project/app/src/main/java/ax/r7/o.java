/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.r7.T;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

final class o<T>
extends T<T>
implements Serializable {
    final Comparator<? super T>[] q;

    o(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.q = new Comparator[]{comparator, comparator2};
    }

    @Override
    public int compare(T t8, T t9) {
        Comparator<? super T>[] comparatorArray;
        for (int i8 = 0; i8 < (comparatorArray = this.q).length; ++i8) {
            int n8 = comparatorArray[i8].compare(t8, t9);
            if (n8 == 0) continue;
            return n8;
        }
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof o) {
            object = (o)object;
            return Arrays.equals(this.q, ((o)object).q);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.q);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ordering.compound(");
        stringBuilder.append(Arrays.toString(this.q));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

