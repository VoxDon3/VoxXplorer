.class public final Lax/p0/g;
.super Lax/r0/y;
.source "SourceFile"

# interfaces
.implements Lax/r0/T;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/p0/g$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/r0/y<",
        "Lax/p0/g;",
        "Lax/p0/g$a;",
        ">;",
        "Lax/r0/T;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lax/p0/g;

.field private static volatile PARSER:Lax/r0/a0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r0/a0<",
            "Lax/p0/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final STRINGS_FIELD_NUMBER:I = 0x1


# instance fields
.field private strings_:Lax/r0/A$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r0/A$i<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/p0/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/p0/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/p0/g;->DEFAULT_INSTANCE:Lax/p0/g;

    .line 7
    .line 8
    const-class v1, Lax/p0/g;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lax/r0/y;->H(Ljava/lang/Class;Lax/r0/y;)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/r0/y;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lax/r0/y;->w()Lax/r0/A$i;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lax/p0/g;->strings_:Lax/r0/A$i;

    .line 9
    .line 10
    return-void
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

.method static synthetic J()Lax/p0/g;
    .registers 1

    .line 1
    sget-object v0, Lax/p0/g;->DEFAULT_INSTANCE:Lax/p0/g;

    .line 2
    .line 3
    return-object v0
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

.method static synthetic K(Lax/p0/g;Ljava/lang/Iterable;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/p0/g;->L(Ljava/lang/Iterable;)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method private L(Ljava/lang/Iterable;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/p0/g;->M()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/p0/g;->strings_:Lax/r0/A$i;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lax/r0/a;->a(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method private M()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/p0/g;->strings_:Lax/r0/A$i;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/r0/A$i;->G0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_10

    .line 8
    .line 9
    iget-object v0, p0, Lax/p0/g;->strings_:Lax/r0/A$i;

    .line 10
    .line 11
    invoke-static {v0}, Lax/r0/y;->C(Lax/r0/A$i;)Lax/r0/A$i;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lax/p0/g;->strings_:Lax/r0/A$i;

    .line 16
    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static N()Lax/p0/g;
    .registers 1

    .line 1
    sget-object v0, Lax/p0/g;->DEFAULT_INSTANCE:Lax/p0/g;

    .line 2
    .line 3
    return-object v0
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

.method public static P()Lax/p0/g$a;
    .registers 1

    .line 1
    sget-object v0, Lax/p0/g;->DEFAULT_INSTANCE:Lax/p0/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/r0/y;->s()Lax/r0/y$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/p0/g$a;

    .line 8
    .line 9
    return-object v0
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


# virtual methods
.method public O()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/p0/g;->strings_:Lax/r0/A$i;

    .line 2
    .line 3
    return-object v0
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

.method protected final v(Lax/r0/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 1
    const/4 p2, 0x1

    .line 2
    sget-object p3, Lax/p0/e;->a:[I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    aget p1, p3, p1

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    packed-switch p1, :pswitch_data_54

    .line 12
    .line 13
    .line 14
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :pswitch_13
    return-object p3

    .line 21
    :pswitch_14
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :pswitch_19
    sget-object p1, Lax/p0/g;->PARSER:Lax/r0/a0;

    .line 27
    .line 28
    if-nez p1, :cond_34

    .line 29
    .line 30
    const-class p2, Lax/p0/g;

    .line 31
    .line 32
    monitor-enter p2

    .line 33
    :try_start_20
    sget-object p1, Lax/p0/g;->PARSER:Lax/r0/a0;

    .line 34
    .line 35
    if-nez p1, :cond_30

    .line 36
    .line 37
    new-instance p1, Lax/r0/y$b;

    .line 38
    .line 39
    sget-object p3, Lax/p0/g;->DEFAULT_INSTANCE:Lax/p0/g;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Lax/r0/y$b;-><init>(Lax/r0/y;)V

    .line 42
    .line 43
    .line 44
    sput-object p1, Lax/p0/g;->PARSER:Lax/r0/a0;

    .line 45
    .line 46
    goto :goto_30

    .line 47
    :catchall_2e
    move-exception p1

    .line 48
    goto :goto_32

    .line 49
    :cond_30
    :goto_30
    monitor-exit p2

    .line 50
    return-object p1

    .line 51
    :goto_32
    monitor-exit p2
    :try_end_33
    .catchall {:try_start_20 .. :try_end_33} :catchall_2e

    .line 52
    throw p1

    .line 53
    :cond_34
    return-object p1

    .line 54
    :pswitch_35
    sget-object p1, Lax/p0/g;->DEFAULT_INSTANCE:Lax/p0/g;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_38
    new-array p1, p2, [Ljava/lang/Object;

    .line 58
    .line 59
    const-string p2, "strings_"

    .line 60
    .line 61
    const/4 p3, 0x0

    .line 62
    aput-object p2, p1, p3

    .line 63
    .line 64
    const-string p2, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"

    .line 65
    .line 66
    sget-object p3, Lax/p0/g;->DEFAULT_INSTANCE:Lax/p0/g;

    .line 67
    .line 68
    invoke-static {p3, p2, p1}, Lax/r0/y;->E(Lax/r0/S;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :pswitch_48
    new-instance p1, Lax/p0/g$a;

    .line 74
    .line 75
    invoke-direct {p1, p3}, Lax/p0/g$a;-><init>(Lax/p0/e;)V

    .line 76
    .line 77
    .line 78
    return-object p1

    .line 79
    :pswitch_4e
    new-instance p1, Lax/p0/g;

    .line 80
    .line 81
    invoke-direct {p1}, Lax/p0/g;-><init>()V

    .line 82
    .line 83
    .line 84
    return-object p1

    .line 85
    :pswitch_data_54
    .packed-switch 0x1
        :pswitch_4e
        :pswitch_48
        :pswitch_38
        :pswitch_35
        :pswitch_19
        :pswitch_14
        :pswitch_13
    .end packed-switch
    .line 86
    .line 87
    .line 88
.end method
