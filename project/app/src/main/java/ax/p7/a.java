/*
 * Decompiled with CFR 0.152.
 */
package ax.p7;

import ax.l7.h;
import ax.m7.g;
import ax.m7.n;
import ax.p7.e;
import java.util.List;
import java.util.Map;

public final class a
extends ax.l7.b {
    @n
    private Boolean appInstalled;
    @n
    private Boolean canCreateDrives;
    @n
    private Boolean canCreateTeamDrives;
    @n
    private List<a> driveThemes;
    @n
    private Map<String, List<String>> exportFormats;
    @n
    private List<String> folderColorPalette;
    @n
    private Map<String, List<String>> importFormats;
    @n
    private String kind;
    @h
    @n
    private Map<String, Long> maxImportSizes;
    @h
    @n
    private Long maxUploadSize;
    @n
    private b storageQuota;
    @n
    private List<c> teamDriveThemes;
    @n
    private e user;

    static {
        g.j(a.class);
        g.j(c.class);
    }

    public a m() {
        return (a)super.i();
    }

    public b n() {
        return this.storageQuota;
    }

    public e o() {
        return this.user;
    }

    public a r(String string, Object object) {
        return (a)super.j(string, object);
    }

    public static final class a
    extends ax.l7.b {
        @n
        private String backgroundImageLink;
        @n
        private String colorRgb;
        @n
        private String id;

        public a m() {
            return (a)super.i();
        }

        public a n(String string, Object object) {
            return (a)super.j(string, object);
        }
    }

    public static final class b
    extends ax.l7.b {
        @h
        @n
        private Long limit;
        @h
        @n
        private Long usage;
        @h
        @n
        private Long usageInDrive;
        @h
        @n
        private Long usageInDriveTrash;

        public b m() {
            return (b)super.i();
        }

        public Long n() {
            return this.limit;
        }

        public Long o() {
            return this.usage;
        }

        public b r(String string, Object object) {
            return (b)super.j(string, object);
        }
    }

    public static final class c
    extends ax.l7.b {
        @n
        private String backgroundImageLink;
        @n
        private String colorRgb;
        @n
        private String id;

        public c m() {
            return (c)super.i();
        }

        public c n(String string, Object object) {
            return (c)super.j(string, object);
        }
    }
}

