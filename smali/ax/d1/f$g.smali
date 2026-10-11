.class public Lax/d1/f$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final c0:Lax/d1/f$f;

.field public final d0:J

.field public final e0:I

.field public final f0:J

.field public final g0:Lax/P0/o;

.field public final h0:Ljava/lang/String;

.field public final i0:Ljava/lang/String;

.field public final j0:J

.field public final k0:J

.field public final l0:Z

.field public final q:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lax/d1/f$f;JIJLax/P0/o;Ljava/lang/String;Ljava/lang/String;JJZ)V
    .registers 16

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/d1/f$g;->q:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lax/d1/f$g;->c0:Lax/d1/f$f;

    .line 5
    iput-wide p3, p0, Lax/d1/f$g;->d0:J

    .line 6
    iput p5, p0, Lax/d1/f$g;->e0:I

    .line 7
    iput-wide p6, p0, Lax/d1/f$g;->f0:J

    .line 8
    iput-object p8, p0, Lax/d1/f$g;->g0:Lax/P0/o;

    .line 9
    iput-object p9, p0, Lax/d1/f$g;->h0:Ljava/lang/String;

    .line 10
    iput-object p10, p0, Lax/d1/f$g;->i0:Ljava/lang/String;

    .line 11
    iput-wide p11, p0, Lax/d1/f$g;->j0:J

    .line 12
    iput-wide p13, p0, Lax/d1/f$g;->k0:J

    .line 13
    iput-boolean p15, p0, Lax/d1/f$g;->l0:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lax/d1/f$f;JIJLax/P0/o;Ljava/lang/String;Ljava/lang/String;JJZLax/d1/f$a;)V
    .registers 17

    .line 1
    invoke-direct/range {p0 .. p15}, Lax/d1/f$g;-><init>(Ljava/lang/String;Lax/d1/f$f;JIJLax/P0/o;Ljava/lang/String;Ljava/lang/String;JJZ)V

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/d1/f$g;->d(Ljava/lang/Long;)I

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

.method public d(Ljava/lang/Long;)I
    .registers 7

    .line 1
    iget-wide v0, p0, Lax/d1/f$g;->f0:J

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    cmp-long v4, v0, v2

    .line 8
    .line 9
    if-lez v4, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_c
    iget-wide v0, p0, Lax/d1/f$g;->f0:J

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    cmp-long p1, v0, v2

    .line 20
    .line 21
    if-gez p1, :cond_18

    .line 22
    .line 23
    const/4 p1, -0x1

    .line 24
    return p1

    .line 25
    :cond_18
    const/4 p1, 0x0

    .line 26
    return p1
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
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
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
