.class final Lax/I1/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/I1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:J


# direct methods
.method private constructor <init>(IJ)V
    .registers 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lax/I1/a$b;->a:I

    .line 4
    iput-wide p2, p0, Lax/I1/a$b;->b:J

    return-void
.end method

.method synthetic constructor <init>(IJLax/I1/a$a;)V
    .registers 5

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/I1/a$b;-><init>(IJ)V

    return-void
.end method

.method static synthetic a(Lax/I1/a$b;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/I1/a$b;->b:J

    .line 2
    .line 3
    return-wide v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic b(Lax/I1/a$b;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/I1/a$b;->a:I

    .line 2
    .line 3
    return p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
