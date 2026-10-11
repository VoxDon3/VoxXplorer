package ax.P9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes3.dex */
public interface l {
    Map<String, String> a();

    OutputStream b() throws IOException;

    InputStream c() throws IOException;

    void close();

    String d();

    void e(String str, String str2);

    int f() throws IOException;

    String g() throws IOException;

    void h(int i);
}
