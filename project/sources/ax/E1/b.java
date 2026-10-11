package ax.E1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends i {
    public final byte[] b;

    public b(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && Arrays.equals(this.b, bVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.a.hashCode()) * 31) + Arrays.hashCode(this.b);
    }
}
