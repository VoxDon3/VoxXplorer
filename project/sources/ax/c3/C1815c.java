package ax.c3;

import ax.u3.C3184b;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3585d;
import com.box.androidsdk.content.models.BoxFile;
import com.box.androidsdk.content.models.BoxFolder;
import com.box.androidsdk.content.models.BoxItem;
import java.util.EnumSet;

/* renamed from: ax.c3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1815c extends AbstractC3595n {
    private String k0;
    private Long l0;
    private boolean m0;
    private String n0;
    private String o0;
    private BoxItem p0;
    private Long q0;

    public C1815c(C3585d c3585d, String str) {
        this(c3585d, null, null, str);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected String C() {
        BoxItem boxItem = this.p0;
        return boxItem != null ? boxItem.M() : d0.h(this.k0);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected String F() {
        return this.k0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected String U() {
        return d0.r(this.k0);
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean d() {
        EnumSet<BoxItem.Permission> P = this.p0.P();
        if (P != null) {
            return P.contains(BoxItem.Permission.CAN_DOWNLOAD);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3595n abstractC3595n) {
        try {
            return t().compareTo(abstractC3595n.t());
        } catch (Exception unused) {
            return -1;
        }
    }

    public String f0() {
        BoxItem boxItem = this.p0;
        if (boxItem == null) {
            return null;
        }
        return boxItem.J();
    }

    public String g0() {
        String str = this.o0;
        if (str != null) {
            return str;
        }
        BoxItem boxItem = this.p0;
        if (boxItem == null || boxItem.N() == null) {
            return null;
        }
        return this.p0.N().G();
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean h() {
        String C = C();
        return C != null && C.startsWith(".");
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean isDirectory() {
        return this.m0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean j() {
        EnumSet<BoxItem.Permission> P = this.p0.P();
        return P == null || P.contains(BoxItem.Permission.CAN_UPLOAD) || P.contains(BoxItem.Permission.CAN_DELETE);
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean l() {
        return false;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean n() {
        BoxItem boxItem = this.p0;
        return boxItem == null ? "/".equals(this.k0) : "active".equals(boxItem.J());
    }

    @Override // ax.c3.InterfaceC1814b
    public long p() {
        if (this.q0 == null) {
            BoxItem boxItem = this.p0;
            if (boxItem == null || boxItem.Q() == null) {
                this.q0 = 0L;
            } else {
                this.q0 = this.p0.Q();
            }
        }
        return this.q0.longValue();
    }

    @Override // ax.c3.InterfaceC1814b
    public long q() {
        if (this.l0 == null) {
            BoxItem boxItem = this.p0;
            if (!(boxItem instanceof BoxFile) || ((BoxFile) boxItem).I() == null) {
                BoxItem boxItem2 = this.p0;
                if (boxItem2 == null || boxItem2.K() == null) {
                    this.l0 = -1L;
                } else {
                    this.l0 = Long.valueOf(this.p0.K().getTime());
                }
            } else {
                this.l0 = Long.valueOf(((BoxFile) this.p0).I().getTime());
            }
        }
        return this.l0.longValue();
    }

    @Override // ax.c3.InterfaceC1814b
    public int r(boolean z) {
        if (this.m0) {
            return X();
        }
        return -2;
    }

    @Override // ax.c3.InterfaceC1814b
    public String s() {
        if (this.n0 == null) {
            this.n0 = C1833v.e(this, "application/octet-stream");
        }
        return this.n0;
    }

    @Override // ax.c3.InterfaceC1814b
    public String t() {
        if ("/".equals(this.k0)) {
            return "0";
        }
        BoxItem boxItem = this.p0;
        if (boxItem != null) {
            return boxItem.G();
        }
        C3184b.g("getFileId called but file is not exists.");
        return null;
    }

    public C1815c(C3585d c3585d, C1815c c1815c, String str) {
        this(c3585d, c1815c.t(), null, str);
    }

    public C1815c(C3585d c3585d, String str, BoxItem boxItem, String str2) {
        super(c3585d);
        this.o0 = str;
        this.p0 = boxItem;
        this.k0 = str2;
        if ("/".equals(str2)) {
            this.m0 = true;
        } else if (boxItem instanceof BoxFolder) {
            this.m0 = true;
        } else {
            this.m0 = false;
        }
    }
}
