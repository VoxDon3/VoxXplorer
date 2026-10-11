package ax.c1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends IOException {
    public i(String str) {
        super("Unable to bind a sample queue to TrackGroup with MIME type " + str + ".");
    }
}
