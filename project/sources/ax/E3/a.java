package ax.E3;

import com.box.androidsdk.content.models.BoxSession;

/* loaded from: classes.dex */
public class a {
    protected BoxSession a;
    protected String b = "https://api.box.com/2.0";
    protected String c = "https://upload.box.com/api/2.0";

    public a(BoxSession boxSession) {
        this.a = boxSession;
    }

    protected String a() {
        BoxSession boxSession = this.a;
        return (boxSession == null || boxSession.r() == null || this.a.r().I() == null) ? this.c : String.format("https://upload.%s/api/2.0", this.a.r().I());
    }

    protected String b() {
        BoxSession boxSession = this.a;
        return (boxSession == null || boxSession.r() == null || this.a.r().I() == null) ? this.b : String.format("https://api.%s/2.0", this.a.r().I());
    }
}
