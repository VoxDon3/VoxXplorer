package ax.Q8;

import ax.Z8.a;
import ax.c9.InterfaceC1848a;
import java.io.IOException;

/* loaded from: classes3.dex */
public class z implements InterfaceC1848a<y> {
    @Override // ax.c9.InterfaceC1848a
    public boolean b(byte[] bArr) {
        return bArr != null && bArr.length >= 4 && bArr[0] == -4 && bArr[1] == 83 && bArr[2] == 77 && bArr[3] == 66;
    }

    @Override // ax.c9.InterfaceC1848a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public y a(byte[] bArr) throws a.b, IOException {
        return new y(bArr);
    }
}
