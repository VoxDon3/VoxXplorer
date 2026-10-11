package ax.Dc;

import java.util.zip.ZipException;

/* loaded from: classes3.dex */
public class H extends ZipException {
    public H(String str) {
        super(str);
    }

    static String a(I i) {
        return i.getName() + "'s size exceeds the limit of 4GByte.";
    }
}
