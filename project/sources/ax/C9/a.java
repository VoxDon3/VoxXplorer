package ax.C9;

/* loaded from: classes3.dex */
public class a {
    private static c a;

    public static c a() {
        return b(false);
    }

    public static c b(boolean z) {
        if (z) {
            d();
            c();
        } else {
            c();
            d();
        }
        return a;
    }

    private static void c() {
        if (a == null) {
            try {
                if (ax.J9.b.b("com.portaudio.PortAudio", false) != null) {
                    a = (c) ax.J9.b.a("com.jsyn.devices.jportaudio.JPortAudioDevice").newInstance();
                }
            } catch (Throwable th) {
                System.err.println("Could not load JPortAudio device. " + th);
            }
        }
    }

    private static void d() {
        if (a == null) {
            try {
                Class b = ax.J9.b.b("com.jsyn.devices.javasound.JavaSoundAudioDevice", false);
                if (b != null) {
                    a = (c) b.newInstance();
                }
            } catch (Throwable th) {
                System.err.println("Could not load JavaSound device. " + th);
            }
        }
    }
}
