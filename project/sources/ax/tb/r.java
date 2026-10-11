package ax.tb;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class r extends C3141q {
    public static <T> int s(Iterable<? extends T> iterable, int i) {
        ax.Gb.l.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
