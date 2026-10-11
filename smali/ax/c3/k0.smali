.class public Lax/c3/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:J

.field public c:I

.field public d:J


# direct methods
.method public constructor <init>(JJ)V
    .registers 13

    sub-long v5, p1, p3

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    .line 1
    invoke-direct/range {v0 .. v7}, Lax/c3/k0;-><init>(JJJI)V

    return-void
.end method

.method public constructor <init>(JJI)V
    .registers 14

    sub-long v5, p1, p3

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move v7, p5

    .line 2
    invoke-direct/range {v0 .. v7}, Lax/c3/k0;-><init>(JJJI)V

    return-void
.end method

.method public constructor <init>(JJJI)V
    .registers 8

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-wide p1, p0, Lax/c3/k0;->b:J

    .line 5
    iput-wide p3, p0, Lax/c3/k0;->a:J

    .line 6
    iput-wide p5, p0, Lax/c3/k0;->d:J

    .line 7
    iput p7, p0, Lax/c3/k0;->c:I

    return-void
.end method
