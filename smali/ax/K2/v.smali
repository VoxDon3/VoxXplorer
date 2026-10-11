.class public final Lax/K2/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/K2/v$b;,
        Lax/K2/v$a;
    }
.end annotation


# static fields
.field public static final u:Lax/K2/v$a;

.field private static final v:Ljava/lang/String;

.field public static final w:Lax/x/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/x/a<",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lax/B2/r;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Landroidx/work/b;

.field public f:Landroidx/work/b;

.field public g:J

.field public h:J

.field public i:J

.field public j:Lax/B2/b;

.field public k:I

.field public l:Lax/B2/a;

.field public m:J

.field public n:J

.field public o:J

.field public p:J

.field public q:Z

.field public r:Lax/B2/m;

.field private s:I

.field private final t:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/K2/v$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lax/K2/v$a;-><init>(Lax/Gb/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lax/K2/v;->u:Lax/K2/v$a;

    .line 8
    .line 9
    const-string v0, "WorkSpec"

    .line 10
    .line 11
    invoke-static {v0}, Lax/B2/i;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "tagWithPrefix(\"WorkSpec\")"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lax/K2/v;->v:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v0, Lax/K2/u;

    .line 23
    .line 24
    invoke-direct {v0}, Lax/K2/u;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lax/K2/v;->w:Lax/x/a;

    .line 28
    .line 29
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public constructor <init>(Ljava/lang/String;Lax/B2/r;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLax/B2/b;ILax/B2/a;JJJJZLax/B2/m;II)V
    .registers 32

    move-object/from16 v0, p13

    move-object/from16 v1, p15

    move-object/from16 v2, p25

    const-string v3, "id"

    invoke-static {p1, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "state"

    invoke-static {p2, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "workerClassName"

    invoke-static {p3, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "input"

    invoke-static {p5, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "output"

    invoke-static {p6, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "constraints"

    invoke-static {v0, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "backoffPolicy"

    invoke-static {v1, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "outOfQuotaPolicy"

    invoke-static {v2, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lax/K2/v;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lax/K2/v;->b:Lax/B2/r;

    .line 4
    iput-object p3, p0, Lax/K2/v;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lax/K2/v;->d:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lax/K2/v;->e:Landroidx/work/b;

    .line 7
    iput-object p6, p0, Lax/K2/v;->f:Landroidx/work/b;

    .line 8
    iput-wide p7, p0, Lax/K2/v;->g:J

    .line 9
    iput-wide p9, p0, Lax/K2/v;->h:J

    move-wide p1, p11

    .line 10
    iput-wide p1, p0, Lax/K2/v;->i:J

    .line 11
    iput-object v0, p0, Lax/K2/v;->j:Lax/B2/b;

    move/from16 p1, p14

    .line 12
    iput p1, p0, Lax/K2/v;->k:I

    .line 13
    iput-object v1, p0, Lax/K2/v;->l:Lax/B2/a;

    move-wide/from16 p1, p16

    .line 14
    iput-wide p1, p0, Lax/K2/v;->m:J

    move-wide/from16 p1, p18

    .line 15
    iput-wide p1, p0, Lax/K2/v;->n:J

    move-wide/from16 p1, p20

    .line 16
    iput-wide p1, p0, Lax/K2/v;->o:J

    move-wide/from16 p1, p22

    .line 17
    iput-wide p1, p0, Lax/K2/v;->p:J

    move/from16 p1, p24

    .line 18
    iput-boolean p1, p0, Lax/K2/v;->q:Z

    .line 19
    iput-object v2, p0, Lax/K2/v;->r:Lax/B2/m;

    move/from16 p1, p26

    .line 20
    iput p1, p0, Lax/K2/v;->s:I

    move/from16 p1, p27

    .line 21
    iput p1, p0, Lax/K2/v;->t:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lax/B2/r;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLax/B2/b;ILax/B2/a;JJJJZLax/B2/m;IIILax/Gb/g;)V
    .registers 60

    move/from16 v0, p28

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_a

    .line 22
    sget-object v1, Lax/B2/r;->q:Lax/B2/r;

    move-object v4, v1

    goto :goto_c

    :cond_a
    move-object/from16 v4, p2

    :goto_c
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_13

    const/4 v1, 0x0

    move-object v6, v1

    goto :goto_15

    :cond_13
    move-object/from16 v6, p4

    :goto_15
    and-int/lit8 v1, v0, 0x10

    .line 23
    const-string v2, "EMPTY"

    if-eqz v1, :cond_22

    .line 24
    sget-object v1, Landroidx/work/b;->c:Landroidx/work/b;

    invoke-static {v1, v2}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v1

    goto :goto_24

    :cond_22
    move-object/from16 v7, p5

    :goto_24
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2f

    .line 25
    sget-object v1, Landroidx/work/b;->c:Landroidx/work/b;

    invoke-static {v1, v2}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, v1

    goto :goto_31

    :cond_2f
    move-object/from16 v8, p6

    :goto_31
    and-int/lit8 v1, v0, 0x40

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_39

    move-wide v9, v2

    goto :goto_3b

    :cond_39
    move-wide/from16 v9, p7

    :goto_3b
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_41

    move-wide v11, v2

    goto :goto_43

    :cond_41
    move-wide/from16 v11, p9

    :goto_43
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_49

    move-wide v13, v2

    goto :goto_4b

    :cond_49
    move-wide/from16 v13, p11

    :goto_4b
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_53

    .line 26
    sget-object v1, Lax/B2/b;->j:Lax/B2/b;

    move-object v15, v1

    goto :goto_55

    :cond_53
    move-object/from16 v15, p13

    :goto_55
    and-int/lit16 v1, v0, 0x400

    const/4 v5, 0x0

    if-eqz v1, :cond_5d

    const/16 v16, 0x0

    goto :goto_5f

    :cond_5d
    move/from16 v16, p14

    :goto_5f
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_68

    .line 27
    sget-object v1, Lax/B2/a;->q:Lax/B2/a;

    move-object/from16 v17, v1

    goto :goto_6a

    :cond_68
    move-object/from16 v17, p15

    :goto_6a
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_71

    const-wide/16 v18, 0x7530

    goto :goto_73

    :cond_71
    move-wide/from16 v18, p16

    :goto_73
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_7a

    move-wide/from16 v20, v2

    goto :goto_7c

    :cond_7a
    move-wide/from16 v20, p18

    :goto_7c
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_83

    move-wide/from16 v22, v2

    goto :goto_85

    :cond_83
    move-wide/from16 v22, p20

    :goto_85
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_90

    const-wide/16 v1, -0x1

    move-wide/from16 v24, v1

    goto :goto_92

    :cond_90
    move-wide/from16 v24, p22

    :goto_92
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_9a

    const/16 v26, 0x0

    goto :goto_9c

    :cond_9a
    move/from16 v26, p24

    :goto_9c
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_a6

    .line 28
    sget-object v1, Lax/B2/m;->q:Lax/B2/m;

    move-object/from16 v27, v1

    goto :goto_a8

    :cond_a6
    move-object/from16 v27, p25

    :goto_a8
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_b0

    const/16 v28, 0x0

    goto :goto_b2

    :cond_b0
    move/from16 v28, p26

    :goto_b2
    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_c0

    const/16 v29, 0x0

    :goto_b9
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v5, p3

    goto :goto_c3

    :cond_c0
    move/from16 v29, p27

    goto :goto_b9

    .line 29
    :goto_c3
    invoke-direct/range {v2 .. v29}, Lax/K2/v;-><init>(Ljava/lang/String;Lax/B2/r;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLax/B2/b;ILax/B2/a;JJJJZLax/B2/m;II)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lax/K2/v;)V
    .registers 35

    move-object/from16 v0, p2

    const-string v1, "newId"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "other"

    invoke-static {v0, v1}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iget-object v5, v0, Lax/K2/v;->c:Ljava/lang/String;

    .line 32
    iget-object v4, v0, Lax/K2/v;->b:Lax/B2/r;

    .line 33
    iget-object v6, v0, Lax/K2/v;->d:Ljava/lang/String;

    .line 34
    new-instance v7, Landroidx/work/b;

    iget-object v1, v0, Lax/K2/v;->e:Landroidx/work/b;

    invoke-direct {v7, v1}, Landroidx/work/b;-><init>(Landroidx/work/b;)V

    .line 35
    new-instance v8, Landroidx/work/b;

    iget-object v1, v0, Lax/K2/v;->f:Landroidx/work/b;

    invoke-direct {v8, v1}, Landroidx/work/b;-><init>(Landroidx/work/b;)V

    .line 36
    iget-wide v9, v0, Lax/K2/v;->g:J

    .line 37
    iget-wide v11, v0, Lax/K2/v;->h:J

    .line 38
    iget-wide v13, v0, Lax/K2/v;->i:J

    .line 39
    new-instance v15, Lax/B2/b;

    iget-object v1, v0, Lax/K2/v;->j:Lax/B2/b;

    invoke-direct {v15, v1}, Lax/B2/b;-><init>(Lax/B2/b;)V

    .line 40
    iget v1, v0, Lax/K2/v;->k:I

    .line 41
    iget-object v2, v0, Lax/K2/v;->l:Lax/B2/a;

    move/from16 v16, v1

    move-object/from16 v17, v2

    .line 42
    iget-wide v1, v0, Lax/K2/v;->m:J

    move-wide/from16 v18, v1

    .line 43
    iget-wide v1, v0, Lax/K2/v;->n:J

    move-wide/from16 v20, v1

    .line 44
    iget-wide v1, v0, Lax/K2/v;->o:J

    move-wide/from16 v22, v1

    .line 45
    iget-wide v1, v0, Lax/K2/v;->p:J

    move-wide/from16 v24, v1

    .line 46
    iget-boolean v1, v0, Lax/K2/v;->q:Z

    .line 47
    iget-object v2, v0, Lax/K2/v;->r:Lax/B2/m;

    .line 48
    iget v0, v0, Lax/K2/v;->s:I

    const/high16 v30, 0x80000

    const/16 v31, 0x0

    const/16 v29, 0x0

    move/from16 v28, v0

    move/from16 v26, v1

    move-object/from16 v27, v2

    move-object/from16 v2, p0

    .line 49
    invoke-direct/range {v2 .. v31}, Lax/K2/v;-><init>(Ljava/lang/String;Lax/B2/r;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLax/B2/b;ILax/B2/a;JJJJZLax/B2/m;IIILax/Gb/g;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .registers 34

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerClassName_"

    move-object/from16 v4, p2

    invoke-static {v4, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v29, 0xffffa

    const/16 v30, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v1, p0

    .line 30
    invoke-direct/range {v1 .. v30}, Lax/K2/v;-><init>(Ljava/lang/String;Lax/B2/r;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLax/B2/b;ILax/B2/a;JJJJZLax/B2/m;IIILax/Gb/g;)V

    return-void
.end method

.method public static synthetic c(Lax/K2/v;Ljava/lang/String;Lax/B2/r;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLax/B2/b;ILax/B2/a;JJJJZLax/B2/m;IIILjava/lang/Object;)Lax/K2/v;
    .registers 47

    move-object/from16 v0, p0

    move/from16 v1, p28

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_b

    .line 1
    iget-object v2, v0, Lax/K2/v;->a:Ljava/lang/String;

    goto :goto_d

    :cond_b
    move-object/from16 v2, p1

    :goto_d
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_14

    iget-object v3, v0, Lax/K2/v;->b:Lax/B2/r;

    goto :goto_16

    :cond_14
    move-object/from16 v3, p2

    :goto_16
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_1d

    iget-object v4, v0, Lax/K2/v;->c:Ljava/lang/String;

    goto :goto_1f

    :cond_1d
    move-object/from16 v4, p3

    :goto_1f
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_26

    iget-object v5, v0, Lax/K2/v;->d:Ljava/lang/String;

    goto :goto_28

    :cond_26
    move-object/from16 v5, p4

    :goto_28
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_2f

    iget-object v6, v0, Lax/K2/v;->e:Landroidx/work/b;

    goto :goto_31

    :cond_2f
    move-object/from16 v6, p5

    :goto_31
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_38

    iget-object v7, v0, Lax/K2/v;->f:Landroidx/work/b;

    goto :goto_3a

    :cond_38
    move-object/from16 v7, p6

    :goto_3a
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_41

    iget-wide v8, v0, Lax/K2/v;->g:J

    goto :goto_43

    :cond_41
    move-wide/from16 v8, p7

    :goto_43
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_4a

    iget-wide v10, v0, Lax/K2/v;->h:J

    goto :goto_4c

    :cond_4a
    move-wide/from16 v10, p9

    :goto_4c
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_53

    iget-wide v12, v0, Lax/K2/v;->i:J

    goto :goto_55

    :cond_53
    move-wide/from16 v12, p11

    :goto_55
    and-int/lit16 v14, v1, 0x200

    if-eqz v14, :cond_5c

    iget-object v14, v0, Lax/K2/v;->j:Lax/B2/b;

    goto :goto_5e

    :cond_5c
    move-object/from16 v14, p13

    :goto_5e
    and-int/lit16 v15, v1, 0x400

    if-eqz v15, :cond_65

    iget v15, v0, Lax/K2/v;->k:I

    goto :goto_67

    :cond_65
    move/from16 v15, p14

    :goto_67
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x800

    if-eqz v2, :cond_70

    iget-object v2, v0, Lax/K2/v;->l:Lax/B2/a;

    goto :goto_72

    :cond_70
    move-object/from16 v2, p15

    :goto_72
    move-object/from16 p2, v2

    and-int/lit16 v2, v1, 0x1000

    move-object/from16 p29, v3

    if-eqz v2, :cond_7d

    iget-wide v2, v0, Lax/K2/v;->m:J

    goto :goto_7f

    :cond_7d
    move-wide/from16 v2, p16

    :goto_7f
    move-wide/from16 p3, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_88

    iget-wide v2, v0, Lax/K2/v;->n:J

    goto :goto_8a

    :cond_88
    move-wide/from16 v2, p18

    :goto_8a
    move-wide/from16 p5, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_93

    iget-wide v2, v0, Lax/K2/v;->o:J

    goto :goto_95

    :cond_93
    move-wide/from16 v2, p20

    :goto_95
    const v16, 0x8000

    and-int v16, v1, v16

    move-wide/from16 p7, v2

    if-eqz v16, :cond_a1

    iget-wide v1, v0, Lax/K2/v;->p:J

    goto :goto_a3

    :cond_a1
    move-wide/from16 v1, p22

    :goto_a3
    const/high16 v3, 0x10000

    and-int v3, p28, v3

    if-eqz v3, :cond_ac

    iget-boolean v3, v0, Lax/K2/v;->q:Z

    goto :goto_ae

    :cond_ac
    move/from16 v3, p24

    :goto_ae
    const/high16 v16, 0x20000

    and-int v16, p28, v16

    move-wide/from16 p9, v1

    if-eqz v16, :cond_b9

    iget-object v1, v0, Lax/K2/v;->r:Lax/B2/m;

    goto :goto_bb

    :cond_b9
    move-object/from16 v1, p25

    :goto_bb
    const/high16 v2, 0x40000

    and-int v2, p28, v2

    if-eqz v2, :cond_c4

    iget v2, v0, Lax/K2/v;->s:I

    goto :goto_c6

    :cond_c4
    move/from16 v2, p26

    :goto_c6
    const/high16 v16, 0x80000

    and-int v16, p28, v16

    if-eqz v16, :cond_fb

    move-object/from16 p11, v1

    iget v1, v0, Lax/K2/v;->t:I

    move-object/from16 p26, p11

    move/from16 p28, v1

    :goto_d4
    move-object/from16 p16, p2

    move-wide/from16 p17, p3

    move-wide/from16 p19, p5

    move-wide/from16 p21, p7

    move-wide/from16 p23, p9

    move-object/from16 p3, p29

    move/from16 p27, v2

    move/from16 p25, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-wide/from16 p8, v8

    move-wide/from16 p10, v10

    move-wide/from16 p12, v12

    move-object/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_100

    :cond_fb
    move/from16 p28, p27

    move-object/from16 p26, v1

    goto :goto_d4

    :goto_100
    invoke-virtual/range {p1 .. p28}, Lax/K2/v;->b(Ljava/lang/String;Lax/B2/r;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLax/B2/b;ILax/B2/a;JJJJZLax/B2/m;II)Lax/K2/v;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()J
    .registers 11

    .line 1
    invoke-virtual {p0}, Lax/K2/v;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2b

    .line 6
    .line 7
    iget-object v0, p0, Lax/K2/v;->l:Lax/B2/a;

    .line 8
    .line 9
    sget-object v1, Lax/B2/a;->c0:Lax/B2/a;

    .line 10
    .line 11
    if-ne v0, v1, :cond_14

    .line 12
    .line 13
    iget-wide v0, p0, Lax/K2/v;->m:J

    .line 14
    .line 15
    iget v2, p0, Lax/K2/v;->k:I

    .line 16
    .line 17
    int-to-long v2, v2

    .line 18
    mul-long v0, v0, v2

    .line 19
    .line 20
    goto :goto_20

    .line 21
    :cond_14
    iget-wide v0, p0, Lax/K2/v;->m:J

    .line 22
    .line 23
    long-to-float v0, v0

    .line 24
    iget v1, p0, Lax/K2/v;->k:I

    .line 25
    .line 26
    add-int/lit8 v1, v1, -0x1

    .line 27
    .line 28
    invoke-static {v0, v1}, Ljava/lang/Math;->scalb(FI)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    float-to-long v0, v0

    .line 33
    :goto_20
    iget-wide v2, p0, Lax/K2/v;->n:J

    .line 34
    .line 35
    const-wide/32 v4, 0x112a880

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1, v4, v5}, Lax/Lb/f;->e(JJ)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    add-long/2addr v2, v0

    .line 43
    return-wide v2

    .line 44
    :cond_2b
    invoke-virtual {p0}, Lax/K2/v;->h()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const-wide/16 v1, 0x0

    .line 49
    .line 50
    if-eqz v0, :cond_53

    .line 51
    .line 52
    iget v0, p0, Lax/K2/v;->s:I

    .line 53
    .line 54
    iget-wide v3, p0, Lax/K2/v;->n:J

    .line 55
    .line 56
    if-nez v0, :cond_3c

    .line 57
    .line 58
    iget-wide v5, p0, Lax/K2/v;->g:J

    .line 59
    .line 60
    add-long/2addr v3, v5

    .line 61
    :cond_3c
    iget-wide v5, p0, Lax/K2/v;->i:J

    .line 62
    .line 63
    iget-wide v7, p0, Lax/K2/v;->h:J

    .line 64
    .line 65
    cmp-long v9, v5, v7

    .line 66
    .line 67
    if-eqz v9, :cond_4d

    .line 68
    .line 69
    if-nez v0, :cond_4a

    .line 70
    .line 71
    const/4 v0, -0x1

    .line 72
    int-to-long v0, v0

    .line 73
    mul-long v1, v0, v5

    .line 74
    .line 75
    :cond_4a
    add-long/2addr v3, v7

    .line 76
    add-long/2addr v3, v1

    .line 77
    return-wide v3

    .line 78
    :cond_4d
    if-nez v0, :cond_50

    .line 79
    .line 80
    goto :goto_51

    .line 81
    :cond_50
    move-wide v1, v7

    .line 82
    :goto_51
    add-long/2addr v3, v1

    .line 83
    return-wide v3

    .line 84
    :cond_53
    iget-wide v3, p0, Lax/K2/v;->n:J

    .line 85
    .line 86
    cmp-long v0, v3, v1

    .line 87
    .line 88
    if-nez v0, :cond_5d

    .line 89
    .line 90
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    :cond_5d
    iget-wide v0, p0, Lax/K2/v;->g:J

    .line 95
    .line 96
    add-long/2addr v3, v0

    .line 97
    return-wide v3
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method public final b(Ljava/lang/String;Lax/B2/r;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLax/B2/b;ILax/B2/a;JJJJZLax/B2/m;II)Lax/K2/v;
    .registers 57

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-static {v2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "state"

    .line 9
    .line 10
    move-object/from16 v3, p2

    .line 11
    .line 12
    invoke-static {v3, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "workerClassName"

    .line 16
    .line 17
    move-object/from16 v4, p3

    .line 18
    .line 19
    invoke-static {v4, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v0, "input"

    .line 23
    .line 24
    move-object/from16 v6, p5

    .line 25
    .line 26
    invoke-static {v6, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "output"

    .line 30
    .line 31
    move-object/from16 v7, p6

    .line 32
    .line 33
    invoke-static {v7, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "constraints"

    .line 37
    .line 38
    move-object/from16 v14, p13

    .line 39
    .line 40
    invoke-static {v14, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v0, "backoffPolicy"

    .line 44
    .line 45
    move-object/from16 v1, p15

    .line 46
    .line 47
    invoke-static {v1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v0, "outOfQuotaPolicy"

    .line 51
    .line 52
    move-object/from16 v5, p25

    .line 53
    .line 54
    invoke-static {v5, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v1, Lax/K2/v;

    .line 58
    .line 59
    move-wide/from16 v8, p7

    .line 60
    .line 61
    move-wide/from16 v10, p9

    .line 62
    .line 63
    move-wide/from16 v12, p11

    .line 64
    .line 65
    move/from16 v15, p14

    .line 66
    .line 67
    move-object/from16 v16, p15

    .line 68
    .line 69
    move-wide/from16 v17, p16

    .line 70
    .line 71
    move-wide/from16 v19, p18

    .line 72
    .line 73
    move-wide/from16 v21, p20

    .line 74
    .line 75
    move-wide/from16 v23, p22

    .line 76
    .line 77
    move/from16 v25, p24

    .line 78
    .line 79
    move/from16 v27, p26

    .line 80
    .line 81
    move/from16 v28, p27

    .line 82
    .line 83
    move-object/from16 v26, v5

    .line 84
    .line 85
    move-object/from16 v5, p4

    .line 86
    .line 87
    invoke-direct/range {v1 .. v28}, Lax/K2/v;-><init>(Ljava/lang/String;Lax/B2/r;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLax/B2/b;ILax/B2/a;JJJJZLax/B2/m;II)V

    .line 88
    .line 89
    .line 90
    return-object v1
.end method

.method public final d()I
    .registers 2

    .line 1
    iget v0, p0, Lax/K2/v;->t:I

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

.method public final e()I
    .registers 2

    .line 1
    iget v0, p0, Lax/K2/v;->s:I

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

.method public equals(Ljava/lang/Object;)Z
    .registers 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    instance-of v1, p1, Lax/K2/v;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    return v2

    .line 11
    :cond_a
    check-cast p1, Lax/K2/v;

    .line 12
    .line 13
    iget-object v1, p0, Lax/K2/v;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lax/K2/v;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_17

    .line 22
    .line 23
    return v2

    .line 24
    :cond_17
    iget-object v1, p0, Lax/K2/v;->b:Lax/B2/r;

    .line 25
    .line 26
    iget-object v3, p1, Lax/K2/v;->b:Lax/B2/r;

    .line 27
    .line 28
    if-eq v1, v3, :cond_1e

    .line 29
    .line 30
    return v2

    .line 31
    :cond_1e
    iget-object v1, p0, Lax/K2/v;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p1, Lax/K2/v;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_29

    .line 40
    .line 41
    return v2

    .line 42
    :cond_29
    iget-object v1, p0, Lax/K2/v;->d:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v3, p1, Lax/K2/v;->d:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_34

    .line 51
    .line 52
    return v2

    .line 53
    :cond_34
    iget-object v1, p0, Lax/K2/v;->e:Landroidx/work/b;

    .line 54
    .line 55
    iget-object v3, p1, Lax/K2/v;->e:Landroidx/work/b;

    .line 56
    .line 57
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_3f

    .line 62
    .line 63
    return v2

    .line 64
    :cond_3f
    iget-object v1, p0, Lax/K2/v;->f:Landroidx/work/b;

    .line 65
    .line 66
    iget-object v3, p1, Lax/K2/v;->f:Landroidx/work/b;

    .line 67
    .line 68
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_4a

    .line 73
    .line 74
    return v2

    .line 75
    :cond_4a
    iget-wide v3, p0, Lax/K2/v;->g:J

    .line 76
    .line 77
    iget-wide v5, p1, Lax/K2/v;->g:J

    .line 78
    .line 79
    cmp-long v1, v3, v5

    .line 80
    .line 81
    if-eqz v1, :cond_53

    .line 82
    .line 83
    return v2

    .line 84
    :cond_53
    iget-wide v3, p0, Lax/K2/v;->h:J

    .line 85
    .line 86
    iget-wide v5, p1, Lax/K2/v;->h:J

    .line 87
    .line 88
    cmp-long v1, v3, v5

    .line 89
    .line 90
    if-eqz v1, :cond_5c

    .line 91
    .line 92
    return v2

    .line 93
    :cond_5c
    iget-wide v3, p0, Lax/K2/v;->i:J

    .line 94
    .line 95
    iget-wide v5, p1, Lax/K2/v;->i:J

    .line 96
    .line 97
    cmp-long v1, v3, v5

    .line 98
    .line 99
    if-eqz v1, :cond_65

    .line 100
    .line 101
    return v2

    .line 102
    :cond_65
    iget-object v1, p0, Lax/K2/v;->j:Lax/B2/b;

    .line 103
    .line 104
    iget-object v3, p1, Lax/K2/v;->j:Lax/B2/b;

    .line 105
    .line 106
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-nez v1, :cond_70

    .line 111
    .line 112
    return v2

    .line 113
    :cond_70
    iget v1, p0, Lax/K2/v;->k:I

    .line 114
    .line 115
    iget v3, p1, Lax/K2/v;->k:I

    .line 116
    .line 117
    if-eq v1, v3, :cond_77

    .line 118
    .line 119
    return v2

    .line 120
    :cond_77
    iget-object v1, p0, Lax/K2/v;->l:Lax/B2/a;

    .line 121
    .line 122
    iget-object v3, p1, Lax/K2/v;->l:Lax/B2/a;

    .line 123
    .line 124
    if-eq v1, v3, :cond_7e

    .line 125
    .line 126
    return v2

    .line 127
    :cond_7e
    iget-wide v3, p0, Lax/K2/v;->m:J

    .line 128
    .line 129
    iget-wide v5, p1, Lax/K2/v;->m:J

    .line 130
    .line 131
    cmp-long v1, v3, v5

    .line 132
    .line 133
    if-eqz v1, :cond_87

    .line 134
    .line 135
    return v2

    .line 136
    :cond_87
    iget-wide v3, p0, Lax/K2/v;->n:J

    .line 137
    .line 138
    iget-wide v5, p1, Lax/K2/v;->n:J

    .line 139
    .line 140
    cmp-long v1, v3, v5

    .line 141
    .line 142
    if-eqz v1, :cond_90

    .line 143
    .line 144
    return v2

    .line 145
    :cond_90
    iget-wide v3, p0, Lax/K2/v;->o:J

    .line 146
    .line 147
    iget-wide v5, p1, Lax/K2/v;->o:J

    .line 148
    .line 149
    cmp-long v1, v3, v5

    .line 150
    .line 151
    if-eqz v1, :cond_99

    .line 152
    .line 153
    return v2

    .line 154
    :cond_99
    iget-wide v3, p0, Lax/K2/v;->p:J

    .line 155
    .line 156
    iget-wide v5, p1, Lax/K2/v;->p:J

    .line 157
    .line 158
    cmp-long v1, v3, v5

    .line 159
    .line 160
    if-eqz v1, :cond_a2

    .line 161
    .line 162
    return v2

    .line 163
    :cond_a2
    iget-boolean v1, p0, Lax/K2/v;->q:Z

    .line 164
    .line 165
    iget-boolean v3, p1, Lax/K2/v;->q:Z

    .line 166
    .line 167
    if-eq v1, v3, :cond_a9

    .line 168
    .line 169
    return v2

    .line 170
    :cond_a9
    iget-object v1, p0, Lax/K2/v;->r:Lax/B2/m;

    .line 171
    .line 172
    iget-object v3, p1, Lax/K2/v;->r:Lax/B2/m;

    .line 173
    .line 174
    if-eq v1, v3, :cond_b0

    .line 175
    .line 176
    return v2

    .line 177
    :cond_b0
    iget v1, p0, Lax/K2/v;->s:I

    .line 178
    .line 179
    iget v3, p1, Lax/K2/v;->s:I

    .line 180
    .line 181
    if-eq v1, v3, :cond_b7

    .line 182
    .line 183
    return v2

    .line 184
    :cond_b7
    iget v1, p0, Lax/K2/v;->t:I

    .line 185
    .line 186
    iget p1, p1, Lax/K2/v;->t:I

    .line 187
    .line 188
    if-eq v1, p1, :cond_be

    .line 189
    .line 190
    return v2

    .line 191
    :cond_be
    return v0
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method public final f()Z
    .registers 3

    .line 1
    sget-object v0, Lax/B2/b;->j:Lax/B2/b;

    .line 2
    .line 3
    iget-object v1, p0, Lax/K2/v;->j:Lax/B2/b;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    return v0
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

.method public final g()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/K2/v;->b:Lax/B2/r;

    .line 2
    .line 3
    sget-object v1, Lax/B2/r;->q:Lax/B2/r;

    .line 4
    .line 5
    if-ne v0, v1, :cond_c

    .line 6
    .line 7
    iget v0, p0, Lax/K2/v;->k:I

    .line 8
    .line 9
    if-lez v0, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final h()Z
    .registers 6

    .line 1
    iget-wide v0, p0, Lax/K2/v;->h:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-eqz v4, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    return v0
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

.method public hashCode()I
    .registers 4

    .line 1
    iget-object v0, p0, Lax/K2/v;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lax/K2/v;->b:Lax/B2/r;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, Lax/K2/v;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Lax/K2/v;->d:Ljava/lang/String;

    .line 28
    .line 29
    if-nez v1, :cond_20

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    goto :goto_24

    .line 33
    :cond_20
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    :goto_24
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v1, p0, Lax/K2/v;->e:Landroidx/work/b;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/work/b;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v0, v1

    .line 47
    mul-int/lit8 v0, v0, 0x1f

    .line 48
    .line 49
    iget-object v1, p0, Lax/K2/v;->f:Landroidx/work/b;

    .line 50
    .line 51
    invoke-virtual {v1}, Landroidx/work/b;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/2addr v0, v1

    .line 56
    mul-int/lit8 v0, v0, 0x1f

    .line 57
    .line 58
    iget-wide v1, p0, Lax/K2/v;->g:J

    .line 59
    .line 60
    invoke-static {v1, v2}, Lax/K2/t;->a(J)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/2addr v0, v1

    .line 65
    mul-int/lit8 v0, v0, 0x1f

    .line 66
    .line 67
    iget-wide v1, p0, Lax/K2/v;->h:J

    .line 68
    .line 69
    invoke-static {v1, v2}, Lax/K2/t;->a(J)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    add-int/2addr v0, v1

    .line 74
    mul-int/lit8 v0, v0, 0x1f

    .line 75
    .line 76
    iget-wide v1, p0, Lax/K2/v;->i:J

    .line 77
    .line 78
    invoke-static {v1, v2}, Lax/K2/t;->a(J)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    add-int/2addr v0, v1

    .line 83
    mul-int/lit8 v0, v0, 0x1f

    .line 84
    .line 85
    iget-object v1, p0, Lax/K2/v;->j:Lax/B2/b;

    .line 86
    .line 87
    invoke-virtual {v1}, Lax/B2/b;->hashCode()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    add-int/2addr v0, v1

    .line 92
    mul-int/lit8 v0, v0, 0x1f

    .line 93
    .line 94
    iget v1, p0, Lax/K2/v;->k:I

    .line 95
    .line 96
    add-int/2addr v0, v1

    .line 97
    mul-int/lit8 v0, v0, 0x1f

    .line 98
    .line 99
    iget-object v1, p0, Lax/K2/v;->l:Lax/B2/a;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    add-int/2addr v0, v1

    .line 106
    mul-int/lit8 v0, v0, 0x1f

    .line 107
    .line 108
    iget-wide v1, p0, Lax/K2/v;->m:J

    .line 109
    .line 110
    invoke-static {v1, v2}, Lax/K2/t;->a(J)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    add-int/2addr v0, v1

    .line 115
    mul-int/lit8 v0, v0, 0x1f

    .line 116
    .line 117
    iget-wide v1, p0, Lax/K2/v;->n:J

    .line 118
    .line 119
    invoke-static {v1, v2}, Lax/K2/t;->a(J)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    add-int/2addr v0, v1

    .line 124
    mul-int/lit8 v0, v0, 0x1f

    .line 125
    .line 126
    iget-wide v1, p0, Lax/K2/v;->o:J

    .line 127
    .line 128
    invoke-static {v1, v2}, Lax/K2/t;->a(J)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    add-int/2addr v0, v1

    .line 133
    mul-int/lit8 v0, v0, 0x1f

    .line 134
    .line 135
    iget-wide v1, p0, Lax/K2/v;->p:J

    .line 136
    .line 137
    invoke-static {v1, v2}, Lax/K2/t;->a(J)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    add-int/2addr v0, v1

    .line 142
    mul-int/lit8 v0, v0, 0x1f

    .line 143
    .line 144
    iget-boolean v1, p0, Lax/K2/v;->q:Z

    .line 145
    .line 146
    if-eqz v1, :cond_94

    .line 147
    .line 148
    const/4 v1, 0x1

    .line 149
    :cond_94
    add-int/2addr v0, v1

    .line 150
    mul-int/lit8 v0, v0, 0x1f

    .line 151
    .line 152
    iget-object v1, p0, Lax/K2/v;->r:Lax/B2/m;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    add-int/2addr v0, v1

    .line 159
    mul-int/lit8 v0, v0, 0x1f

    .line 160
    .line 161
    iget v1, p0, Lax/K2/v;->s:I

    .line 162
    .line 163
    add-int/2addr v0, v1

    .line 164
    mul-int/lit8 v0, v0, 0x1f

    .line 165
    .line 166
    iget v1, p0, Lax/K2/v;->t:I

    .line 167
    .line 168
    add-int/2addr v0, v1

    .line 169
    return v0
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "{WorkSpec: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lax/K2/v;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x7d

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
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
