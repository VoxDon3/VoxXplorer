package ax.J9;

/* loaded from: classes3.dex */
public class b {
    public static Class a(String str) {
        return b(str, true);
    }

    public static Class b(String str, boolean z) {
        try {
            try {
                return Class.forName(str);
            } catch (Throwable unused) {
                return Class.forName(str, true, ClassLoader.getSystemClassLoader());
            }
        } catch (Throwable th) {
            if (z) {
                System.err.println("Caught " + th);
            }
            return null;
        }
    }
}
