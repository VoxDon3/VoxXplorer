.class Lax/P3/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P3/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field final a:Lax/P3/f$e;

.field final b:Lax/b0/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/b0/d<",
            "Lax/P3/f<",
            "*>;>;"
        }
    .end annotation
.end field

.field private c:I


# direct methods
.method constructor <init>(Lax/P3/f$e;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/P3/i$a$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lax/P3/i$a$a;-><init>(Lax/P3/i$a;)V

    .line 7
    .line 8
    .line 9
    const/16 v1, 0x96

    .line 10
    .line 11
    invoke-static {v1, v0}, Lax/l4/a;->d(ILax/l4/a$d;)Lax/b0/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lax/P3/i$a;->b:Lax/b0/d;

    .line 16
    .line 17
    iput-object p1, p0, Lax/P3/i$a;->a:Lax/P3/f$e;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method a(Lax/J3/e;Ljava/lang/Object;Lax/P3/l;Lax/M3/h;IILjava/lang/Class;Ljava/lang/Class;Lax/J3/g;Lax/P3/h;Ljava/util/Map;ZZZLax/M3/j;Lax/P3/f$b;)Lax/P3/f;
    .registers 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lax/J3/e;",
            "Ljava/lang/Object;",
            "Lax/P3/l;",
            "Lax/M3/h;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lax/J3/g;",
            "Lax/P3/h;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lax/M3/m<",
            "*>;>;ZZZ",
            "Lax/M3/j;",
            "Lax/P3/f$b<",
            "TR;>;)",
            "Lax/P3/f<",
            "TR;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lax/P3/i$a;->b:Lax/b0/d;

    .line 4
    .line 5
    invoke-interface {v1}, Lax/b0/d;->b()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lax/P3/f;

    .line 11
    .line 12
    iget v1, v0, Lax/P3/i$a;->c:I

    .line 13
    .line 14
    add-int/lit8 v3, v1, 0x1

    .line 15
    .line 16
    iput v3, v0, Lax/P3/i$a;->c:I

    .line 17
    .line 18
    move-object/from16 v3, p1

    .line 19
    .line 20
    move-object/from16 v4, p2

    .line 21
    .line 22
    move-object/from16 v5, p3

    .line 23
    .line 24
    move-object/from16 v6, p4

    .line 25
    .line 26
    move/from16 v7, p5

    .line 27
    .line 28
    move/from16 v8, p6

    .line 29
    .line 30
    move-object/from16 v9, p7

    .line 31
    .line 32
    move-object/from16 v10, p8

    .line 33
    .line 34
    move-object/from16 v11, p9

    .line 35
    .line 36
    move-object/from16 v12, p10

    .line 37
    .line 38
    move-object/from16 v13, p11

    .line 39
    .line 40
    move/from16 v14, p12

    .line 41
    .line 42
    move/from16 v15, p13

    .line 43
    .line 44
    move/from16 v16, p14

    .line 45
    .line 46
    move-object/from16 v17, p15

    .line 47
    .line 48
    move-object/from16 v18, p16

    .line 49
    .line 50
    move/from16 v19, v1

    .line 51
    .line 52
    invoke-virtual/range {v2 .. v19}, Lax/P3/f;->B(Lax/J3/e;Ljava/lang/Object;Lax/P3/l;Lax/M3/h;IILjava/lang/Class;Ljava/lang/Class;Lax/J3/g;Lax/P3/h;Ljava/util/Map;ZZZLax/M3/j;Lax/P3/f$b;I)Lax/P3/f;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    return-object v1
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
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
