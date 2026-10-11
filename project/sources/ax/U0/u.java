package ax.U0;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class u extends s {
    public final int e0;
    public final String f0;
    public final Map<String, List<String>> g0;
    public final byte[] h0;

    public u(int i, String str, IOException iOException, Map<String, List<String>> map, k kVar, byte[] bArr) {
        super("Response code: " + i, iOException, kVar, 2004, 1);
        this.e0 = i;
        this.f0 = str;
        this.g0 = map;
        this.h0 = bArr;
    }
}
