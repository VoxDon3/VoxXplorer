.class final Lax/a1/f0$k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a1/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "k"
.end annotation


# instance fields
.field public final a:Lax/P0/G;

.field public final b:J

.field public final c:J

.field public d:J


# direct methods
.method private constructor <init>(Lax/P0/G;JJ)V
    .registers 6

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/a1/f0$k;->a:Lax/P0/G;

    .line 4
    iput-wide p2, p0, Lax/a1/f0$k;->b:J

    .line 5
    iput-wide p4, p0, Lax/a1/f0$k;->c:J

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/G;JJLax/a1/f0$a;)V
    .registers 7

    .line 1
    invoke-direct/range {p0 .. p5}, Lax/a1/f0$k;-><init>(Lax/P0/G;JJ)V

    return-void
.end method
