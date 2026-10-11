package ax.tb;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class u extends t {
    public static <T extends Comparable<? super T>> void t(List<T> list) {
        ax.Gb.l.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final <T> void u(List<T> list, Comparator<? super T> comparator) {
        ax.Gb.l.f(list, "<this>");
        ax.Gb.l.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
