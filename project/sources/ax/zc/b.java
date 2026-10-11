package ax.zc;

import java.io.IOException;

/* loaded from: classes3.dex */
public class b extends IOException {
    public b(String str) {
        super("Cannot read encrypted content from " + str + " without a password.");
    }
}
