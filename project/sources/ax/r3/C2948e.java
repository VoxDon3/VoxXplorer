package ax.r3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ax.ea.C1992a;
import ax.y0.C3495a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ax.r3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2948e extends C1992a {

    /* renamed from: ax.r3.e$a */
    class a extends C1992a.C0306a {
        public a() {
        }

        public a(int i, boolean z) {
            super(i, z);
        }
    }

    /* renamed from: ax.r3.e$b */
    class b extends C1992a.b {
        public b(ax.ca.e eVar, C1992a.C0306a c0306a) {
            super(eVar, c0306a);
        }
    }

    public C2948e(boolean z) {
        super(z);
    }

    @Override // ax.ea.C1992a, ax.ea.InterfaceC1993b
    public Bitmap a(ax.ea.c cVar) throws IOException {
        return super.a(cVar);
    }

    @Override // ax.ea.C1992a
    protected C1992a.b e(InputStream inputStream, ax.ea.c cVar) throws IOException {
        a aVar;
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (cVar.l()) {
            InputStream h = h(inputStream, cVar);
            try {
                try {
                    C3495a c3495a = new C3495a(h);
                    int y = c3495a.y();
                    if (c3495a.l("Orientation", 1) != 2) {
                        z = false;
                    }
                    aVar = new a(y, z);
                } catch (RuntimeException unused) {
                    h = h(h, cVar);
                    aVar = new a(ax.C3.a.a(h, -1L), false);
                }
            } finally {
                ax.ka.c.a(h);
            }
        } else {
            aVar = new a();
        }
        return new b(new ax.ca.e(options.outWidth, options.outHeight, aVar.a), aVar);
    }
}
