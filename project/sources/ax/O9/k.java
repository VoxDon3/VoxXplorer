package ax.O9;

import com.microsoft.graph.extensions.DriveItem;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes3.dex */
public class k extends ax.P9.d<DriveItem> implements B {
    public k(String str, ax.M9.f fVar, List<ax.S9.c> list, Class cls) {
        super(str, fVar, list, cls);
    }

    @Override // ax.O9.B
    public InputStream get() throws ax.M9.d {
        return e();
    }

    @Override // ax.O9.B
    public DriveItem i(byte[] bArr) throws ax.M9.d {
        return l(bArr);
    }
}
