package ax.U0;

import android.net.Uri;
import ax.P0.InterfaceC0902k;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface g extends InterfaceC0902k {

    public interface a {
        g a();
    }

    Uri b();

    void close() throws IOException;

    void d(z zVar);

    long f(k kVar) throws IOException;

    Map<String, List<String>> l();
}
