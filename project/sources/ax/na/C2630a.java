package ax.na;

import java.io.IOException;
import java.util.Locale;

/* renamed from: ax.na.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2630a extends IOException {
    private final int q;

    public C2630a(int i, String str) {
        super(String.format(Locale.US, "API returned '%d - %s' HTTP error.", Integer.valueOf(i), str));
        this.q = i;
    }

    public int a() {
        return this.q;
    }
}
