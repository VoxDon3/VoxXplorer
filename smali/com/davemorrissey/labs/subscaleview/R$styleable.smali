.class public final Lcom/davemorrissey/labs/subscaleview/R$styleable;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/davemorrissey/labs/subscaleview/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final SubsamplingScaleImageView:[I

.field public static final SubsamplingScaleImageView_assetName:I = 0x0

.field public static final SubsamplingScaleImageView_panEnabled:I = 0x1

.field public static final SubsamplingScaleImageView_quickScaleEnabled:I = 0x2

.field public static final SubsamplingScaleImageView_src:I = 0x3

.field public static final SubsamplingScaleImageView_tileBackgroundColor:I = 0x4

.field public static final SubsamplingScaleImageView_zoomEnabled:I = 0x5


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_a

    sput-object v0, Lcom/davemorrissey/labs/subscaleview/R$styleable;->SubsamplingScaleImageView:[I

    return-void

    nop

    :array_a
    .array-data 4
        0x7f040048
        0x7f040412
        0x7f04044d
        0x7f0404d5
        0x7f04059f
        0x7f040615
    .end array-data
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
