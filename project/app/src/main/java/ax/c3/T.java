/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.text.TextUtils;
import ax.Ha.b;
import ax.Ha.c;
import ax.T9.d;
import ax.c3.d0;
import ax.c3.v;
import com.voxdon.xplorer.file.OneDriveFileHelper;
import com.voxdon.xplorer.file.n;
import com.microsoft.graph.extensions.DriveItem;
import com.microsoft.graph.extensions.Folder;
import com.microsoft.graph.extensions.ThumbnailSet;
import com.microsoft.graph.generated.BaseBaseItem;
import com.microsoft.graph.generated.BaseDriveItem;
import com.microsoft.graph.generated.BaseFile;
import com.microsoft.graph.generated.BaseFileSystemInfo;
import com.microsoft.graph.generated.BaseFolder;
import com.microsoft.graph.generated.BaseRemoteItem;
import com.microsoft.graph.http.BaseCollectionPage;
import java.util.Calendar;

public class T
extends n {
    private DriveItem k0;
    private String l0;

    public T(OneDriveFileHelper oneDriveFileHelper, DriveItem driveItem, String string) {
        super(oneDriveFileHelper);
        this.k0 = driveItem;
        this.l0 = string;
    }

    public T(OneDriveFileHelper oneDriveFileHelper, String string) {
        super(oneDriveFileHelper);
        this.k0 = null;
        this.l0 = string;
    }

    private boolean h0() {
        d d8 = this.k0;
        return d8 != null && (d8 = ((BaseDriveItem)d8).P) != null && ((BaseCollectionPage)d8).b() != null && !this.k0.P.b().isEmpty() && ((ThumbnailSet)this.k0.P.b().get((int)0)).h != null && ((ThumbnailSet)this.k0.P.b().get((int)0)).h.e != null;
    }

    @Override
    public String C() {
        DriveItem driveItem = this.k0;
        if (driveItem != null) {
            return driveItem.l;
        }
        return d0.h(this.l0);
    }

    @Override
    public String F() {
        return this.l0;
    }

    @Override
    public String U() {
        return d0.r(this.l0);
    }

    @Override
    public boolean d() {
        return this.k0 != null;
    }

    public int e0(n n8) {
        try {
            int n9 = this.k0.c.compareTo(((T)n8).k0.c);
            return n9;
        }
        catch (ClassCastException classCastException) {
            return -1;
        }
    }

    public DriveItem f0() {
        return this.k0;
    }

    public String g0() {
        if (this.h0()) {
            return ((ThumbnailSet)this.k0.P.b().get((int)0)).h.e;
        }
        return null;
    }

    @Override
    public boolean h() {
        return false;
    }

    public int hashCode() {
        DriveItem driveItem = this.k0;
        if (driveItem != null) {
            return driveItem.hashCode();
        }
        return this.l0.hashCode();
    }

    @Override
    public boolean isDirectory() {
        d d8 = this.k0;
        if (d8 == null) {
            return false;
        }
        if (d8.x == null && d8.J == null) {
            if (d8.v != null) {
                return false;
            }
            d8 = d8.D;
            return d8 != null && (((BaseRemoteItem)d8).g != null || ((BaseRemoteItem)d8).q != null);
        }
        return true;
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean l() {
        return this.k0.D != null;
    }

    @Override
    public boolean n() {
        DriveItem driveItem = this.k0;
        return driveItem != null && driveItem.u == null;
    }

    @Override
    public long p() {
        Object object = this.k0;
        if (object == null) {
            return 0L;
        }
        Object object2 = ((BaseDriveItem)object).I;
        if (object2 == null) {
            object2 = ((BaseDriveItem)object).D;
            if (object2 != null && (object2 = ((BaseRemoteItem)object2).p) != null) {
                return (Long)object2;
            }
            object = ((BaseDriveItem)object).e() != null ? this.k0.e().toString() : "";
            object2 = c.h().f().b("OneDriveFileInfo size == null").j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DIR:");
            stringBuilder.append(this.isDirectory());
            stringBuilder.append(":EXIST:");
            stringBuilder.append(this.n());
            stringBuilder.append(":RAW:");
            stringBuilder.append((String)object);
            ((b)object2).g(stringBuilder.toString()).h();
            return 0L;
        }
        return (Long)object2;
    }

    @Override
    public long q() {
        Object object;
        Object object2 = this.k0;
        if (object2 != null && (object = ((BaseDriveItem)object2).w) != null && (object = ((BaseFileSystemInfo)object).e) != null) {
            return ((Calendar)object).getTime().getTime();
        }
        if (object2 != null && (object2 = ((BaseBaseItem)object2).k) != null) {
            return ((Calendar)object2).getTime().getTime();
        }
        return -1L;
    }

    @Override
    public int r(boolean bl) {
        if (this.X() >= 0) {
            return this.X();
        }
        d d8 = this.k0;
        if (d8 == null) {
            return -2;
        }
        Folder folder = d8.x;
        if (folder != null) {
            return folder.c;
        }
        d8 = d8.D;
        if (d8 != null && (d8 = ((BaseRemoteItem)d8).g) != null) {
            return ((BaseFolder)d8).c;
        }
        return -2;
    }

    @Override
    public String s() {
        Object object = this.k0;
        object = object != null && (object = ((BaseDriveItem)object).v) != null ? ((BaseFile)object).d : "";
        if (TextUtils.isEmpty((CharSequence)object)) {
            return v.e(this, "");
        }
        Object object2 = object;
        if ("application/octet-stream".equals(object)) {
            object2 = v.e(this, "application/octet-stream");
        }
        return object2;
    }

    @Override
    public String t() {
        DriveItem driveItem = this.k0;
        if (driveItem != null) {
            return driveItem.c;
        }
        return this.l0;
    }
}

