/*
 * Decompiled with CFR 0.152.
 */
package ax.C9;

import ax.C9.c;
import ax.J9.b;
import java.io.PrintStream;
import java.io.Serializable;

public class a {
    private static c a;

    public static c a() {
        return ax.C9.a.b(false);
    }

    public static c b(boolean bl) {
        if (bl) {
            ax.C9.a.d();
            ax.C9.a.c();
        } else {
            ax.C9.a.c();
            ax.C9.a.d();
        }
        return a;
    }

    private static void c() {
        if (a == null) {
            try {
                if (b.b("com.portaudio.PortAudio", false) != null) {
                    a = (c)b.a("com.jsyn.devices.jportaudio.JPortAudioDevice").newInstance();
                    return;
                }
            }
            catch (Throwable throwable) {
                PrintStream printStream = System.err;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not load JPortAudio device. ");
                stringBuilder.append(throwable);
                printStream.println(stringBuilder.toString());
            }
        }
    }

    private static void d() {
        block4: {
            if (a == null) {
                Serializable serializable = b.b("com.jsyn.devices.javasound.JavaSoundAudioDevice", false);
                if (serializable == null) break block4;
                try {
                    a = (c)((Class)serializable).newInstance();
                    return;
                }
                catch (Throwable throwable) {
                    PrintStream printStream = System.err;
                    serializable = new StringBuilder();
                    ((StringBuilder)serializable).append("Could not load JavaSound device. ");
                    ((StringBuilder)serializable).append(throwable);
                    printStream.println(((StringBuilder)serializable).toString());
                }
            }
        }
    }
}

