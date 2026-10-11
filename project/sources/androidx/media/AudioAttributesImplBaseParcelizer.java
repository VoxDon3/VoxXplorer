package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(androidx.versionedparcelable.a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = aVar.p(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = aVar.p(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = aVar.p(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = aVar.p(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.a, 1);
        aVar.F(audioAttributesImplBase.b, 2);
        aVar.F(audioAttributesImplBase.c, 3);
        aVar.F(audioAttributesImplBase.d, 4);
    }
}
