package ax.f1;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import ax.S0.C0968a;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ax.f1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2025t {
    private final HashSet<MediaCodec> a;
    private final b b;
    private LoudnessCodecController c;

    /* renamed from: ax.f1.t$a */
    class a implements LoudnessCodecController.OnLoudnessCodecUpdateListener {
        a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return C2025t.this.b.a(bundle);
        }
    }

    /* renamed from: ax.f1.t$b */
    public interface b {
        public static final b a = new b() { // from class: ax.f1.u
            @Override // ax.f1.C2025t.b
            public final Bundle a(Bundle bundle) {
                return C2027v.a(bundle);
            }
        };

        Bundle a(Bundle bundle);
    }

    public C2025t() {
        this(b.a);
    }

    public void b(MediaCodec mediaCodec) {
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        C0968a.g(this.a.add(mediaCodec));
    }

    public void c() {
        this.a.clear();
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.a.remove(mediaCodec) || (loudnessCodecController = this.c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void e(int i) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.c = null;
        }
        create = LoudnessCodecController.create(i, ax.v7.f.a(), new a());
        this.c = create;
        Iterator<MediaCodec> it = this.a.iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec(it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    public C2025t(b bVar) {
        this.a = new HashSet<>();
        this.b = bVar;
    }
}
