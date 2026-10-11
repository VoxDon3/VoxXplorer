package ax.X3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import ax.P3.s;
import java.io.File;

/* loaded from: classes.dex */
public class b implements ax.M3.l<BitmapDrawable> {
    private final ax.Q3.d a;
    private final ax.M3.l<Bitmap> b;

    public b(ax.Q3.d dVar, ax.M3.l<Bitmap> lVar) {
        this.a = dVar;
        this.b = lVar;
    }

    @Override // ax.M3.l
    public ax.M3.c b(ax.M3.j jVar) {
        return this.b.b(jVar);
    }

    @Override // ax.M3.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(s<BitmapDrawable> sVar, File file, ax.M3.j jVar) {
        return this.b.a(new e(sVar.get().getBitmap(), this.a), file, jVar);
    }
}
