.class public final Lax/K1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:Lax/P0/v;

.field public final h:I

.field public final i:[J

.field public final j:[J

.field public final k:I

.field private final l:[Lax/K1/u;


# direct methods
.method public constructor <init>(IIJJJJLax/P0/v;I[Lax/K1/u;I[J[J)V
    .registers 17

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lax/K1/t;->a:I

    .line 5
    .line 6
    iput p2, p0, Lax/K1/t;->b:I

    .line 7
    .line 8
    iput-wide p3, p0, Lax/K1/t;->c:J

    .line 9
    .line 10
    iput-wide p5, p0, Lax/K1/t;->d:J

    .line 11
    .line 12
    iput-wide p7, p0, Lax/K1/t;->e:J

    .line 13
    .line 14
    iput-wide p9, p0, Lax/K1/t;->f:J

    .line 15
    .line 16
    iput-object p11, p0, Lax/K1/t;->g:Lax/P0/v;

    .line 17
    .line 18
    iput p12, p0, Lax/K1/t;->h:I

    .line 19
    .line 20
    iput-object p13, p0, Lax/K1/t;->l:[Lax/K1/u;

    .line 21
    .line 22
    iput p14, p0, Lax/K1/t;->k:I

    .line 23
    .line 24
    iput-object p15, p0, Lax/K1/t;->i:[J

    .line 25
    .line 26
    move-object/from16 p1, p16

    .line 27
    .line 28
    iput-object p1, p0, Lax/K1/t;->j:[J

    .line 29
    .line 30
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method


# virtual methods
.method public a(Lax/P0/v;)Lax/K1/t;
    .registers 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lax/K1/t;

    .line 4
    .line 5
    iget v2, v0, Lax/K1/t;->a:I

    .line 6
    .line 7
    iget v3, v0, Lax/K1/t;->b:I

    .line 8
    .line 9
    iget-wide v4, v0, Lax/K1/t;->c:J

    .line 10
    .line 11
    iget-wide v6, v0, Lax/K1/t;->d:J

    .line 12
    .line 13
    iget-wide v8, v0, Lax/K1/t;->e:J

    .line 14
    .line 15
    iget-wide v10, v0, Lax/K1/t;->f:J

    .line 16
    .line 17
    iget v13, v0, Lax/K1/t;->h:I

    .line 18
    .line 19
    iget-object v14, v0, Lax/K1/t;->l:[Lax/K1/u;

    .line 20
    .line 21
    iget v15, v0, Lax/K1/t;->k:I

    .line 22
    .line 23
    iget-object v12, v0, Lax/K1/t;->i:[J

    .line 24
    .line 25
    move-object/from16 v16, v1

    .line 26
    .line 27
    iget-object v1, v0, Lax/K1/t;->j:[J

    .line 28
    .line 29
    move-object/from16 v17, v1

    .line 30
    .line 31
    move-object/from16 v1, v16

    .line 32
    .line 33
    move-object/from16 v16, v12

    .line 34
    .line 35
    move-object/from16 v12, p1

    .line 36
    .line 37
    invoke-direct/range {v1 .. v17}, Lax/K1/t;-><init>(IIJJJJLax/P0/v;I[Lax/K1/u;I[J[J)V

    .line 38
    .line 39
    .line 40
    move-object/from16 v16, v1

    .line 41
    .line 42
    return-object v16
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

.method public b(I)Lax/K1/u;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/K1/t;->l:[Lax/K1/u;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_6
    aget-object p1, v0, p1

    .line 8
    .line 9
    return-object p1
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
