/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import ax.c3.d0;
import ax.c3.v;
import ax.u3.b;
import com.voxdon.xplorer.file.d;
import com.voxdon.xplorer.file.n;
import com.box.androidsdk.content.models.BoxFile;
import com.box.androidsdk.content.models.BoxFolder;
import com.box.androidsdk.content.models.BoxItem;
import java.util.EnumSet;

public class c
extends n {
    private String k0;
    private Long l0;
    private boolean m0;
    private String n0;
    private String o0;
    private BoxItem p0;
    private Long q0;

    public c(d d8, c c8, String string) {
        this(d8, c8.t(), null, string);
    }

    public c(d d8, String string) {
        this(d8, null, null, string);
    }

    public c(d d8, String string, BoxItem boxItem, String string2) {
        super(d8);
        this.o0 = string;
        this.p0 = boxItem;
        this.k0 = string2;
        if ("/".equals(string2)) {
            this.m0 = true;
            return;
        }
        if (boxItem instanceof BoxFolder) {
            this.m0 = true;
            return;
        }
        this.m0 = false;
    }

    @Override
    protected String C() {
        BoxItem boxItem = this.p0;
        if (boxItem != null) {
            return boxItem.M();
        }
        return d0.h(this.k0);
    }

    @Override
    protected String F() {
        return this.k0;
    }

    @Override
    protected String U() {
        return d0.r(this.k0);
    }

    @Override
    public boolean d() {
        EnumSet<BoxItem.Permission> enumSet = this.p0.P();
        if (enumSet != null) {
            return enumSet.contains((Object)BoxItem.Permission.c0);
        }
        return true;
    }

    public int e0(n n8) {
        try {
            int n9 = this.t().compareTo(n8.t());
            return n9;
        }
        catch (Exception exception) {
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
        Object object = this.o0;
        if (object != null) {
            return object;
        }
        object = this.p0;
        if (object != null && ((BoxItem)object).N() != null) {
            return this.p0.N().G();
        }
        return null;
    }

    @Override
    public boolean h() {
        String string = this.C();
        return string != null && string.startsWith(".");
    }

    @Override
    public boolean isDirectory() {
        return this.m0;
    }

    @Override
    public boolean j() {
        EnumSet<BoxItem.Permission> enumSet = this.p0.P();
        return enumSet == null || enumSet.contains((Object)BoxItem.Permission.d0) || enumSet.contains((Object)BoxItem.Permission.g0);
        {
        }
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean n() {
        BoxItem boxItem = this.p0;
        if (boxItem == null) {
            return "/".equals(this.k0);
        }
        return "active".equals(boxItem.J());
    }

    @Override
    public long p() {
        if (this.q0 == null) {
            BoxItem boxItem = this.p0;
            this.q0 = boxItem != null && boxItem.Q() != null ? this.p0.Q() : Long.valueOf(0L);
        }
        return this.q0;
    }

    @Override
    public long q() {
        if (this.l0 == null) {
            BoxItem boxItem = this.p0;
            this.l0 = boxItem instanceof BoxFile && ((BoxFile)boxItem).I() != null ? Long.valueOf(((BoxFile)this.p0).I().getTime()) : ((boxItem = this.p0) != null && boxItem.K() != null ? Long.valueOf(this.p0.K().getTime()) : Long.valueOf(-1L));
        }
        return this.l0;
    }

    @Override
    public int r(boolean bl) {
        if (!this.m0) {
            return -2;
        }
        return this.X();
    }

    @Override
    public String s() {
        if (this.n0 == null) {
            this.n0 = v.e(this, "application/octet-stream");
        }
        return this.n0;
    }

    @Override
    public String t() {
        if ("/".equals(this.k0)) {
            return "0";
        }
        BoxItem boxItem = this.p0;
        if (boxItem != null) {
            return boxItem.G();
        }
        b.g("getFileId called but file is not exists.");
        return null;
    }
}

