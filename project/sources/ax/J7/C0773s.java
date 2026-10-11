package ax.J7;

import java.io.File;
import java.io.IOException;

/* renamed from: ax.J7.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0773s {
    private final String a;
    private final ax.O7.g b;

    public C0773s(String str, ax.O7.g gVar) {
        this.a = str;
        this.b = gVar;
    }

    private File b() {
        return this.b.g(this.a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e) {
            ax.G7.g.f().e("Error creating marker: " + this.a, e);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
