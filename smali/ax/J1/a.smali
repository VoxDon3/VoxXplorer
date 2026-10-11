.class final Lax/J1/a;
.super Lax/q1/j;
.source "SourceFile"

# interfaces
.implements Lax/J1/g;


# instance fields
.field private final h:J

.field private final i:I

.field private final j:I

.field private final k:Z

.field private final l:J


# direct methods
.method public constructor <init>(JJIIZ)V
    .registers 9

    .line 2
    invoke-direct/range {p0 .. p7}, Lax/q1/j;-><init>(JJIIZ)V

    move v0, p7

    move p7, p6

    move p6, p5

    move-wide p4, p3

    move-wide p2, p1

    move-object p1, p0

    .line 3
    iput-wide p4, p1, Lax/J1/a;->h:J

    .line 4
    iput p6, p1, Lax/J1/a;->i:I

    .line 5
    iput p7, p1, Lax/J1/a;->j:I

    .line 6
    iput-boolean v0, p1, Lax/J1/a;->k:Z

    const-wide/16 p4, -0x1

    cmp-long p6, p2, p4

    if-eqz p6, :cond_18

    goto :goto_19

    :cond_18
    move-wide p2, p4

    .line 7
    :goto_19
    iput-wide p2, p1, Lax/J1/a;->l:J

    return-void
.end method

.method public constructor <init>(JJLax/q1/J$a;Z)V
    .registers 15

    .line 1
    iget v5, p5, Lax/q1/J$a;->f:I

    iget v6, p5, Lax/q1/J$a;->c:I

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move v7, p6

    invoke-direct/range {v0 .. v7}, Lax/J1/a;-><init>(JJIIZ)V

    return-void
.end method


# virtual methods
.method public d(J)Lax/J1/a;
    .registers 11

    .line 1
    new-instance v0, Lax/J1/a;

    .line 2
    .line 3
    iget-wide v3, p0, Lax/J1/a;->h:J

    .line 4
    .line 5
    iget v5, p0, Lax/J1/a;->i:I

    .line 6
    .line 7
    iget v6, p0, Lax/J1/a;->j:I

    .line 8
    .line 9
    iget-boolean v7, p0, Lax/J1/a;->k:Z

    .line 10
    .line 11
    move-wide v1, p1

    .line 12
    invoke-direct/range {v0 .. v7}, Lax/J1/a;-><init>(JJIIZ)V

    .line 13
    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public g()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/J1/a;->l:J

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
.end method

.method public h()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/J1/a;->h:J

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
.end method

.method public j(J)J
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lax/q1/j;->b(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
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

.method public m()I
    .registers 2

    .line 1
    iget v0, p0, Lax/J1/a;->i:I

    .line 2
    .line 3
    return v0
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
.end method
