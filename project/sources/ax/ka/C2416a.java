package ax.ka;

import java.io.File;

/* renamed from: ax.ka.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2416a {
    public static boolean a(String str, ax.V9.a aVar) {
        File i = aVar.i(str);
        return i != null && i.exists() && i.delete();
    }
}
