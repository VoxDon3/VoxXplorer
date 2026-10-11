package ax.b4;

import android.util.Log;
import ax.M3.j;
import ax.M3.l;
import ax.P3.s;
import ax.k4.C2397a;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class d implements l<c> {
    @Override // ax.M3.l
    public ax.M3.c b(j jVar) {
        return ax.M3.c.SOURCE;
    }

    @Override // ax.M3.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(s<c> sVar, File file, j jVar) {
        try {
            C2397a.d(sVar.get().b(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }
}
