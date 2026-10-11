package androidx.media3.ui;

/* loaded from: classes.dex */
public interface G {

    public interface a {
        void G(G g, long j);

        void K(G g, long j);

        void M(G g, long j, boolean z);
    }

    void a(a aVar);

    void b(long[] jArr, boolean[] zArr, int i);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
