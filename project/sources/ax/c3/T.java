package ax.c3;

import android.text.TextUtils;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.OneDriveFileHelper;
import com.microsoft.graph.extensions.DriveItem;
import com.microsoft.graph.extensions.File;
import com.microsoft.graph.extensions.FileSystemInfo;
import com.microsoft.graph.extensions.Folder;
import com.microsoft.graph.extensions.RemoteItem;
import com.microsoft.graph.extensions.ThumbnailSetCollectionPage;
import java.util.Calendar;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class T extends AbstractC3595n {
    private DriveItem k0;
    private String l0;

    public T(OneDriveFileHelper oneDriveFileHelper, DriveItem driveItem, String str) {
        super(oneDriveFileHelper);
        this.k0 = driveItem;
        this.l0 = str;
    }

    private boolean h0() {
        ThumbnailSetCollectionPage thumbnailSetCollectionPage;
        DriveItem driveItem = this.k0;
        return (driveItem == null || (thumbnailSetCollectionPage = driveItem.P) == null || thumbnailSetCollectionPage.b() == null || this.k0.P.b().isEmpty() || this.k0.P.b().get(0).h == null || this.k0.P.b().get(0).h.e == null) ? false : true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String C() {
        DriveItem driveItem = this.k0;
        return driveItem != null ? driveItem.l : d0.h(this.l0);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String F() {
        return this.l0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String U() {
        return d0.r(this.l0);
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean d() {
        return this.k0 != null;
    }

    @Override // java.lang.Comparable
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3595n abstractC3595n) {
        try {
            return this.k0.c.compareTo(((T) abstractC3595n).k0.c);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public DriveItem f0() {
        return this.k0;
    }

    public String g0() {
        if (h0()) {
            return this.k0.P.b().get(0).h.e;
        }
        return null;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean h() {
        return false;
    }

    public int hashCode() {
        DriveItem driveItem = this.k0;
        return driveItem != null ? driveItem.hashCode() : this.l0.hashCode();
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean isDirectory() {
        RemoteItem remoteItem;
        DriveItem driveItem = this.k0;
        if (driveItem == null) {
            return false;
        }
        if (driveItem.x == null && driveItem.J == null) {
            return (driveItem.v != null || (remoteItem = driveItem.D) == null || (remoteItem.g == null && remoteItem.q == null)) ? false : true;
        }
        return true;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean j() {
        return true;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean l() {
        return this.k0.D != null;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean n() {
        DriveItem driveItem = this.k0;
        return driveItem != null && driveItem.u == null;
    }

    @Override // ax.c3.InterfaceC1814b
    public long p() {
        Long l;
        DriveItem driveItem = this.k0;
        if (driveItem == null) {
            return 0L;
        }
        Long l2 = driveItem.I;
        if (l2 != null) {
            return l2.longValue();
        }
        RemoteItem remoteItem = driveItem.D;
        if (remoteItem != null && (l = remoteItem.p) != null) {
            return l.longValue();
        }
        String abstractC3000i = driveItem.e() != null ? this.k0.e().toString() : HttpUrl.FRAGMENT_ENCODE_SET;
        ax.Ha.c.h().f().b("OneDriveFileInfo size == null").j().g("DIR:" + isDirectory() + ":EXIST:" + n() + ":RAW:" + abstractC3000i).h();
        return 0L;
    }

    @Override // ax.c3.InterfaceC1814b
    public long q() {
        Calendar calendar;
        FileSystemInfo fileSystemInfo;
        Calendar calendar2;
        DriveItem driveItem = this.k0;
        if (driveItem != null && (fileSystemInfo = driveItem.w) != null && (calendar2 = fileSystemInfo.e) != null) {
            return calendar2.getTime().getTime();
        }
        if (driveItem == null || (calendar = driveItem.k) == null) {
            return -1L;
        }
        return calendar.getTime().getTime();
    }

    @Override // ax.c3.InterfaceC1814b
    public int r(boolean z) {
        Folder folder;
        if (X() >= 0) {
            return X();
        }
        DriveItem driveItem = this.k0;
        if (driveItem == null) {
            return -2;
        }
        Folder folder2 = driveItem.x;
        if (folder2 != null) {
            return folder2.c.intValue();
        }
        RemoteItem remoteItem = driveItem.D;
        if (remoteItem == null || (folder = remoteItem.g) == null) {
            return -2;
        }
        return folder.c.intValue();
    }

    @Override // ax.c3.InterfaceC1814b
    public String s() {
        File file;
        DriveItem driveItem = this.k0;
        String str = (driveItem == null || (file = driveItem.v) == null) ? HttpUrl.FRAGMENT_ENCODE_SET : file.d;
        return TextUtils.isEmpty(str) ? C1833v.e(this, HttpUrl.FRAGMENT_ENCODE_SET) : "application/octet-stream".equals(str) ? C1833v.e(this, "application/octet-stream") : str;
    }

    @Override // ax.c3.InterfaceC1814b
    public String t() {
        DriveItem driveItem = this.k0;
        return driveItem != null ? driveItem.c : this.l0;
    }

    public T(OneDriveFileHelper oneDriveFileHelper, String str) {
        super(oneDriveFileHelper);
        this.k0 = null;
        this.l0 = str;
    }
}
