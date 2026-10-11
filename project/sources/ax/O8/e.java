package ax.O8;

import ax.Z8.a;
import ax.c9.InterfaceC1848a;
import java.io.IOException;

/* loaded from: classes3.dex */
public class e implements InterfaceC1848a<d> {
    @Override // ax.c9.InterfaceC1848a
    public /* bridge */ /* synthetic */ d a(byte[] bArr) throws a.b, IOException {
        c(bArr);
        return null;
    }

    @Override // ax.c9.InterfaceC1848a
    public boolean b(byte[] bArr) {
        return bArr != null && bArr.length >= 4 && bArr[0] == -1 && bArr[1] == 83 && bArr[2] == 77 && bArr[3] == 66;
    }

    public d c(byte[] bArr) throws a.b, IOException {
        throw new b();
    }
}
