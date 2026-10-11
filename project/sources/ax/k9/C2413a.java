package ax.k9;

import java.util.Arrays;

/* renamed from: ax.k9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2413a {
    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void b(byte[] bArr, byte[] bArr2, String str) {
        if (!Arrays.equals(bArr, bArr2)) {
            throw new IllegalArgumentException(str);
        }
    }
}
