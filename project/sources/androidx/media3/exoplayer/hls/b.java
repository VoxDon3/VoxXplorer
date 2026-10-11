package androidx.media3.exoplayer.hls;

import android.net.Uri;
import ax.S0.C0968a;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class b {
    private final LinkedHashMap<Uri, byte[]> a;

    class a extends LinkedHashMap<Uri, byte[]> {
        final /* synthetic */ int q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i, float f, boolean z, int i2) {
            super(i, f, z);
            this.q = i2;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.q;
        }
    }

    public b(int i) {
        this.a = new a(i + 1, 1.0f, false, i);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return this.a.put((Uri) C0968a.e(uri), (byte[]) C0968a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return this.a.remove(C0968a.e(uri));
    }
}
