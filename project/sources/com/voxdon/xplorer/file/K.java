package com.voxdon.xplorer.file;

import ax.b3.C1495j;
import ax.c3.d0;
import com.voxdon.xplorer.file.J;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class K extends C3605y {
    private static final Logger a1 = Logger.getLogger("FileManager.RecycleBinFileInfo");
    private boolean S0;
    private String T0;
    private String U0;
    private String V0;
    private String W0;
    private boolean X0;
    private long Y0;
    private long Z0;

    public K(J j, C3605y c3605y, ax.c3.K k, boolean z) throws C1495j {
        super(j, c3605y.F0(), k);
        this.S0 = z;
        this.T0 = c3605y.E();
        D1(c3605y);
    }

    private void D1(AbstractC3595n abstractC3595n) throws C1495j {
        String str;
        String B = abstractC3595n.B();
        int indexOf = B.indexOf("_");
        String substring = B.substring(0, indexOf);
        String substring2 = B.substring(indexOf + 1);
        int indexOf2 = substring2.indexOf("_");
        String substring3 = substring2.substring(0, indexOf2);
        String substring4 = substring2.substring(indexOf2 + 1);
        String substring5 = substring4.substring(0, substring4.indexOf("_"));
        try {
            this.Y0 = Long.valueOf(substring3).longValue();
        } catch (NumberFormatException unused) {
        }
        try {
            this.Z0 = Long.valueOf(substring5).longValue();
        } catch (NumberFormatException unused2) {
        }
        if ("D".equals(substring)) {
            this.X0 = true;
        } else {
            this.X0 = false;
        }
        J.c o2 = J.o2(abstractC3595n, B0());
        if (o2.a()) {
            String str2 = o2.b;
            this.V0 = str2;
            this.W0 = o2.c;
            if (str2 != null) {
                this.U0 = d0.h(str2);
                return;
            }
            return;
        }
        a1.fine("INVALID INDEX : " + o2.a + "," + o2.b);
        if (B0() != null) {
            str = B0().toString() + "," + abstractC3595n.p();
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET + abstractC3595n.p();
        }
        throw new C1495j("Invalid RecycleBin Index File : " + str);
    }

    public String A1() {
        return this.V0;
    }

    public String B1() {
        return this.W0;
    }

    @Override // com.voxdon.xplorer.file.C3605y, com.voxdon.xplorer.file.AbstractC3595n
    public String C() {
        return this.S0 ? this.U0 : super.C();
    }

    public boolean C1() {
        return this.S0;
    }

    @Override // com.voxdon.xplorer.file.C3605y, com.voxdon.xplorer.file.AbstractC3595n
    public String F() {
        return this.S0 ? this.V0 : super.F();
    }

    @Override // com.voxdon.xplorer.file.C3605y, com.voxdon.xplorer.file.AbstractC3595n
    public String U() {
        return this.S0 ? d0.r(this.V0) : super.U();
    }

    @Override // com.voxdon.xplorer.file.C3605y, ax.c3.InterfaceC1814b
    public boolean isDirectory() {
        return this.S0 ? this.X0 : super.isDirectory();
    }

    @Override // com.voxdon.xplorer.file.C3605y, ax.c3.InterfaceC1814b
    public long p() {
        return this.S0 ? this.Z0 : super.p();
    }

    @Override // com.voxdon.xplorer.file.C3605y, ax.c3.InterfaceC1814b
    public long q() {
        return this.S0 ? this.Y0 : super.q();
    }

    @Override // com.voxdon.xplorer.file.C3605y, ax.c3.InterfaceC1814b
    public int r(boolean z) {
        return this.S0 ? this.Z0 > 0 ? 1 : -1 : super.r(z);
    }

    public String z1() {
        return this.T0;
    }
}
