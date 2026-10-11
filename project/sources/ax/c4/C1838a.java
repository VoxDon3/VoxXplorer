package ax.c4;

import android.graphics.Bitmap;
import ax.P3.s;
import java.io.ByteArrayOutputStream;

/* renamed from: ax.c4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1838a implements InterfaceC1841d<Bitmap, byte[]> {
    private final Bitmap.CompressFormat a;
    private final int b;

    public C1838a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // ax.c4.InterfaceC1841d
    public s<byte[]> a(s<Bitmap> sVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sVar.get().compress(this.a, this.b, byteArrayOutputStream);
        sVar.recycle();
        return new ax.Y3.b(byteArrayOutputStream.toByteArray());
    }

    public C1838a(Bitmap.CompressFormat compressFormat, int i) {
        this.a = compressFormat;
        this.b = i;
    }
}
