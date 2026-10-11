/*
 * Decompiled with CFR 0.152.
 */
package ax.p7;

import ax.l7.h;
import ax.m7.i;
import ax.m7.n;
import java.util.List;
import java.util.Map;

public final class c
extends ax.l7.b {
    @n
    private Map<String, String> appProperties;
    @n
    private a capabilities;
    @n
    private b contentHints;
    @n
    private List<ax.p7.b> contentRestrictions;
    @n
    private Boolean copyRequiresWriterPermission;
    @n
    private i createdTime;
    @n
    private String description;
    @n
    private String driveId;
    @n
    private Boolean explicitlyTrashed;
    @n
    private Map<String, String> exportLinks;
    @n
    private String fileExtension;
    @n
    private String folderColorRgb;
    @n
    private String fullFileExtension;
    @n
    private Boolean hasAugmentedPermissions;
    @n
    private Boolean hasThumbnail;
    @n
    private String headRevisionId;
    @n
    private String iconLink;
    @n
    private String id;
    @n
    private c imageMediaMetadata;
    @n
    private Boolean isAppAuthorized;
    @n
    private String kind;
    @n
    private d labelInfo;
    @n
    private ax.p7.e lastModifyingUser;
    @n
    private e linkShareMetadata;
    @n
    private String md5Checksum;
    @n
    private String mimeType;
    @n
    private Boolean modifiedByMe;
    @n
    private i modifiedByMeTime;
    @n
    private i modifiedTime;
    @n
    private String name;
    @n
    private String originalFilename;
    @n
    private Boolean ownedByMe;
    @n
    private List<ax.p7.e> owners;
    @n
    private List<String> parents;
    @n
    private List<String> permissionIds;
    @n
    private List<Object> permissions;
    @n
    private Map<String, String> properties;
    @h
    @n
    private Long quotaBytesUsed;
    @n
    private String resourceKey;
    @n
    private Boolean shared;
    @n
    private i sharedWithMeTime;
    @n
    private ax.p7.e sharingUser;
    @n
    private f shortcutDetails;
    @h
    @n
    private Long size;
    @n
    private List<String> spaces;
    @n
    private Boolean starred;
    @n
    private String teamDriveId;
    @n
    private String thumbnailLink;
    @h
    @n
    private Long thumbnailVersion;
    @n
    private Boolean trashed;
    @n
    private i trashedTime;
    @n
    private ax.p7.e trashingUser;
    @h
    @n
    private Long version;
    @n
    private g videoMediaMetadata;
    @n
    private Boolean viewedByMe;
    @n
    private i viewedByMeTime;
    @n
    private Boolean viewersCanCopyContent;
    @n
    private String webContentLink;
    @n
    private String webViewLink;
    @n
    private Boolean writersCanShare;

    static {
        ax.m7.g.j(ax.p7.b.class);
    }

    public Boolean B() {
        return this.trashed;
    }

    public String C() {
        return this.webViewLink;
    }

    public c D(String string, Object object) {
        return (c)super.j(string, object);
    }

    public c E(String string) {
        this.mimeType = string;
        return this;
    }

    public c F(i i8) {
        this.modifiedTime = i8;
        return this;
    }

    public c G(String string) {
        this.name = string;
        return this;
    }

    public c H(List<String> list) {
        this.parents = list;
        return this;
    }

    public c I(Boolean bl) {
        this.trashed = bl;
        return this;
    }

    public c m() {
        return (c)super.i();
    }

    public a n() {
        return this.capabilities;
    }

    public i o() {
        return this.createdTime;
    }

    public String r() {
        return this.id;
    }

    public String s() {
        return this.mimeType;
    }

    public i t() {
        return this.modifiedTime;
    }

    public String v() {
        return this.name;
    }

    public List<String> w() {
        return this.parents;
    }

    public f x() {
        return this.shortcutDetails;
    }

    public Long y() {
        return this.size;
    }

    public String z() {
        return this.thumbnailLink;
    }

    public static final class a
    extends ax.l7.b {
        @n
        private Boolean canAcceptOwnership;
        @n
        private Boolean canAddChildren;
        @n
        private Boolean canAddFolderFromAnotherDrive;
        @n
        private Boolean canAddMyDriveParent;
        @n
        private Boolean canChangeCopyRequiresWriterPermission;
        @n
        private Boolean canChangeSecurityUpdateEnabled;
        @n
        private Boolean canChangeViewersCanCopyContent;
        @n
        private Boolean canComment;
        @n
        private Boolean canCopy;
        @n
        private Boolean canDelete;
        @n
        private Boolean canDeleteChildren;
        @n
        private Boolean canDownload;
        @n
        private Boolean canEdit;
        @n
        private Boolean canListChildren;
        @n
        private Boolean canModifyContent;
        @n
        private Boolean canModifyContentRestriction;
        @n
        private Boolean canModifyLabels;
        @n
        private Boolean canMoveChildrenOutOfDrive;
        @n
        private Boolean canMoveChildrenOutOfTeamDrive;
        @n
        private Boolean canMoveChildrenWithinDrive;
        @n
        private Boolean canMoveChildrenWithinTeamDrive;
        @n
        private Boolean canMoveItemIntoTeamDrive;
        @n
        private Boolean canMoveItemOutOfDrive;
        @n
        private Boolean canMoveItemOutOfTeamDrive;
        @n
        private Boolean canMoveItemWithinDrive;
        @n
        private Boolean canMoveItemWithinTeamDrive;
        @n
        private Boolean canMoveTeamDriveItem;
        @n
        private Boolean canReadDrive;
        @n
        private Boolean canReadLabels;
        @n
        private Boolean canReadRevisions;
        @n
        private Boolean canReadTeamDrive;
        @n
        private Boolean canRemoveChildren;
        @n
        private Boolean canRemoveMyDriveParent;
        @n
        private Boolean canRename;
        @n
        private Boolean canShare;
        @n
        private Boolean canTrash;
        @n
        private Boolean canTrashChildren;
        @n
        private Boolean canUntrash;

        public a m() {
            return (a)super.i();
        }

        public Boolean n() {
            return this.canDownload;
        }

        public Boolean o() {
            return this.canEdit;
        }

        public a r(String string, Object object) {
            return (a)super.j(string, object);
        }
    }

    public static final class b
    extends ax.l7.b {
        @n
        private String indexableText;
        @n
        private a thumbnail;

        public b m() {
            return (b)super.i();
        }

        public b n(String string, Object object) {
            return (b)super.j(string, object);
        }

        public static final class a
        extends ax.l7.b {
            @n
            private String image;
            @n
            private String mimeType;

            public a m() {
                return (a)super.i();
            }

            public a n(String string, Object object) {
                return (a)super.j(string, object);
            }
        }
    }

    public static final class c
    extends ax.l7.b {
        @n
        private Float aperture;
        @n
        private String cameraMake;
        @n
        private String cameraModel;
        @n
        private String colorSpace;
        @n
        private Float exposureBias;
        @n
        private String exposureMode;
        @n
        private Float exposureTime;
        @n
        private Boolean flashUsed;
        @n
        private Float focalLength;
        @n
        private Integer height;
        @n
        private Integer isoSpeed;
        @n
        private String lens;
        @n
        private a location;
        @n
        private Float maxApertureValue;
        @n
        private String meteringMode;
        @n
        private Integer rotation;
        @n
        private String sensor;
        @n
        private Integer subjectDistance;
        @n
        private String time;
        @n
        private String whiteBalance;
        @n
        private Integer width;

        public c m() {
            return (c)super.i();
        }

        public c n(String string, Object object) {
            return (c)super.j(string, object);
        }

        public static final class a
        extends ax.l7.b {
            @n
            private Double altitude;
            @n
            private Double latitude;
            @n
            private Double longitude;

            public a m() {
                return (a)super.i();
            }

            public a n(String string, Object object) {
                return (a)super.j(string, object);
            }
        }
    }

    public static final class d
    extends ax.l7.b {
        @n
        private List<Object> labels;

        public d m() {
            return (d)super.i();
        }

        public d n(String string, Object object) {
            return (d)super.j(string, object);
        }
    }

    public static final class e
    extends ax.l7.b {
        @n
        private Boolean securityUpdateEligible;
        @n
        private Boolean securityUpdateEnabled;

        public e m() {
            return (e)super.i();
        }

        public e n(String string, Object object) {
            return (e)super.j(string, object);
        }
    }

    public static final class f
    extends ax.l7.b {
        @n
        private String targetId;
        @n
        private String targetMimeType;
        @n
        private String targetResourceKey;

        public f m() {
            return (f)super.i();
        }

        public String n() {
            return this.targetId;
        }

        public String o() {
            return this.targetMimeType;
        }

        public f r(String string, Object object) {
            return (f)super.j(string, object);
        }
    }

    public static final class g
    extends ax.l7.b {
        @h
        @n
        private Long durationMillis;
        @n
        private Integer height;
        @n
        private Integer width;

        public g m() {
            return (g)super.i();
        }

        public g n(String string, Object object) {
            return (g)super.j(string, object);
        }
    }
}

