package ax.E1;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends i {
    public final String b;
    public final byte[] c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.b, mVar.b) && Arrays.equals(this.c, mVar.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.c);
    }

    @Override // ax.E1.i
    public String toString() {
        return this.a + ": owner=" + this.b;
    }
}
