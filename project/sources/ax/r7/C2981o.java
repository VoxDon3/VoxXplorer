package ax.r7;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: ax.r7.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2981o<T> extends T<T> implements Serializable {
    final Comparator<? super T>[] q;

    C2981o(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.q = new Comparator[]{comparator, comparator2};
    }

    @Override // ax.r7.T, java.util.Comparator
    public int compare(T t, T t2) {
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.q;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2981o) {
            return Arrays.equals(this.q, ((C2981o) obj).q);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.q);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.q) + ")";
    }
}
