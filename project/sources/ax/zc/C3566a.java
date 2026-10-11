package ax.zc;

import java.io.IOException;

/* renamed from: ax.zc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3566a extends IOException {
    private final int c0;
    private final long q;

    public C3566a(long j, int i) {
        super(a(j, i));
        this.q = j;
        this.c0 = i;
    }

    private static String a(long j, int i) {
        return j + " kb of memory would be needed; limit was " + i + " kb. If the file is not corrupt, consider increasing the memory limit.";
    }

    public C3566a(long j, int i, Exception exc) {
        super(a(j, i), exc);
        this.q = j;
        this.c0 = i;
    }
}
