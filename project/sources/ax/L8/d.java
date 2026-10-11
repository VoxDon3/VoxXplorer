package ax.L8;

/* loaded from: classes3.dex */
public enum d implements ax.Y8.c<d> {
    FileFsVolumeInformation(1),
    FileFsLabelInformation(2),
    FileFsSizeInformation(3),
    FileFsDeviceInformation(4),
    FileFsAttributeInformation(5),
    FileFsControlInformation(6),
    FileFsFullSizeInformation(7),
    FileFsObjectIdInformation(8),
    FileFsDriverPathInformation(9),
    FileFsVolumeFlagsInformation(10),
    FileFsSectorSizeInformation(11);

    private long q;

    d(long j) {
        this.q = j;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
