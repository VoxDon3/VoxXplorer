.class final Lax/O1/e$b;
.super Lax/N1/p;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/O1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/N1/p;",
        "Ljava/lang/Comparable<",
        "Lax/O1/e$b;",
        ">;"
    }
.end annotation


# instance fields
.field private l0:J


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/N1/p;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lax/O1/e$a;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Lax/O1/e$b;-><init>()V

    return-void
.end method

.method static synthetic H(Lax/O1/e$b;J)J
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/O1/e$b;->l0:J

    .line 2
    .line 3
    return-wide p1
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
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method


# virtual methods
.method public I(Lax/O1/e$b;)I
    .registers 10

    .line 1
    invoke-virtual {p0}, Lax/V0/a;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lax/V0/a;->s()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eq v0, v1, :cond_14

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/V0/a;->s()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_13

    .line 18
    .line 19
    return v3

    .line 20
    :cond_13
    return v2

    .line 21
    :cond_14
    iget-wide v0, p0, Lax/V0/i;->g0:J

    .line 22
    .line 23
    iget-wide v4, p1, Lax/V0/i;->g0:J

    .line 24
    .line 25
    sub-long/2addr v0, v4

    .line 26
    const-wide/16 v4, 0x0

    .line 27
    .line 28
    cmp-long v6, v0, v4

    .line 29
    .line 30
    if-nez v6, :cond_2a

    .line 31
    .line 32
    iget-wide v0, p0, Lax/O1/e$b;->l0:J

    .line 33
    .line 34
    iget-wide v6, p1, Lax/O1/e$b;->l0:J

    .line 35
    .line 36
    sub-long/2addr v0, v6

    .line 37
    cmp-long p1, v0, v4

    .line 38
    .line 39
    if-nez p1, :cond_2a

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    return p1

    .line 43
    :cond_2a
    cmp-long p1, v0, v4

    .line 44
    .line 45
    if-lez p1, :cond_2f

    .line 46
    .line 47
    return v3

    .line 48
    :cond_2f
    return v2
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    .line 1
    check-cast p1, Lax/O1/e$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/O1/e$b;->I(Lax/O1/e$b;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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
