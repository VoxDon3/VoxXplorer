.class public final Lax/G1/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/G1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:I

.field public final b:J


# direct methods
.method private constructor <init>(IJ)V
    .registers 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lax/G1/f$b;->a:I

    .line 4
    iput-wide p2, p0, Lax/G1/f$b;->b:J

    return-void
.end method

.method synthetic constructor <init>(IJLax/G1/f$a;)V
    .registers 5

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/G1/f$b;-><init>(IJ)V

    return-void
.end method
