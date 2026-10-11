.class Lax/X4/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/X4/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field final a:J

.field final b:J


# direct methods
.method private constructor <init>(JJ)V
    .registers 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lax/X4/k$b;->a:J

    .line 4
    iput-wide p3, p0, Lax/X4/k$b;->b:J

    return-void
.end method

.method synthetic constructor <init>(JJLax/X4/k$a;)V
    .registers 6

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lax/X4/k$b;-><init>(JJ)V

    return-void
.end method
