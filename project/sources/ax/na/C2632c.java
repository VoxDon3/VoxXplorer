package ax.na;

import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import java.util.Date;
import java.util.List;

/* renamed from: ax.na.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2632c extends C2631b {

    @InterfaceC3059a
    @InterfaceC3061c("path")
    private String c;

    @InterfaceC3059a
    @InterfaceC3061c("expires")
    private Date d;

    @InterfaceC3059a
    @InterfaceC3061c("hosts")
    private List<String> e;

    protected C2632c() {
    }

    public Date d() {
        return this.d;
    }

    public List<String> e() {
        return this.e;
    }

    public String f() {
        return this.c;
    }
}
