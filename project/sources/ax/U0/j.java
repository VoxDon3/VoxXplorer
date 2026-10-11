package ax.U0;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j {
    public static void a(g gVar) {
        if (gVar != null) {
            try {
                gVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
