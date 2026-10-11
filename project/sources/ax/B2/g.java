package ax.B2;

import java.util.List;

/* loaded from: classes.dex */
public abstract class g {
    private static final String a = i.i("InputMerger");

    public static g a(String str) {
        try {
            return (g) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            i.e().d(a, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    public abstract androidx.work.b b(List<androidx.work.b> list);
}
