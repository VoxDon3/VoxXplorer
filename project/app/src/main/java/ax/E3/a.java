/*
 * Decompiled with CFR 0.152.
 */
package ax.E3;

import com.box.androidsdk.content.models.BoxSession;

public class a {
    protected BoxSession a;
    protected String b = "https://api.box.com/2.0";
    protected String c = "https://upload.box.com/api/2.0";

    public a(BoxSession boxSession) {
        this.a = boxSession;
    }

    protected String a() {
        BoxSession boxSession = this.a;
        if (boxSession != null && boxSession.r() != null && this.a.r().I() != null) {
            return String.format("https://upload.%s/api/2.0", this.a.r().I());
        }
        return this.c;
    }

    protected String b() {
        BoxSession boxSession = this.a;
        if (boxSession != null && boxSession.r() != null && this.a.r().I() != null) {
            return String.format("https://api.%s/2.0", this.a.r().I());
        }
        return this.b;
    }
}

