.class public final Lax/G1/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/G1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:I

.field public final b:J

.field public final c:J


# direct methods
.method private constructor <init>(IJJ)V
    .registers 6

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lax/G1/d$b;->a:I

    .line 4
    iput-wide p2, p0, Lax/G1/d$b;->b:J

    .line 5
    iput-wide p4, p0, Lax/G1/d$b;->c:J

    return-void
.end method

.method synthetic constructor <init>(IJJLax/G1/d$a;)V
    .registers 7

    .line 1
    invoke-direct/range {p0 .. p5}, Lax/G1/d$b;-><init>(IJJ)V

    return-void
.end method
