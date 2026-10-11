package ax.q7;

import java.util.Arrays;

/* renamed from: ax.q7.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2883j extends AbstractC2878e {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
