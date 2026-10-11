package ax.V9;

import android.graphics.Bitmap;
import ax.ka.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public interface a {
    boolean a(String str, InputStream inputStream, c.a aVar) throws IOException;

    boolean b(String str, Bitmap bitmap) throws IOException;

    void close();

    File i(String str);
}
