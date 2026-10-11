package ax.yc;

import ax.Gb.l;
import ax.xc.C3487e;
import ax.xc.h;

/* loaded from: classes3.dex */
public final class b {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ae, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.yc.b.c(byte[], int):int");
    }

    public static final void d(h hVar, C3487e c3487e, int i, int i2) {
        l.f(hVar, "<this>");
        l.f(c3487e, "buffer");
        c3487e.write(hVar.p(), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final char[] f() {
        return a;
    }
}
