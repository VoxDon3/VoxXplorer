.class public final Lax/a0/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/a0/u$e;,
        Lax/a0/u$c;,
        Lax/a0/u$b;,
        Lax/a0/u$a;,
        Lax/a0/u$f;,
        Lax/a0/u$d;
    }
.end annotation


# static fields
.field public static final a:Lax/a0/t;

.field public static final b:Lax/a0/t;

.field public static final c:Lax/a0/t;

.field public static final d:Lax/a0/t;

.field public static final e:Lax/a0/t;

.field public static final f:Lax/a0/t;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    .line 1
    new-instance v0, Lax/a0/u$e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lax/a0/u$e;-><init>(Lax/a0/u$c;Z)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lax/a0/u;->a:Lax/a0/t;

    .line 9
    .line 10
    new-instance v0, Lax/a0/u$e;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v0, v1, v3}, Lax/a0/u$e;-><init>(Lax/a0/u$c;Z)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lax/a0/u;->b:Lax/a0/t;

    .line 17
    .line 18
    new-instance v0, Lax/a0/u$e;

    .line 19
    .line 20
    sget-object v1, Lax/a0/u$b;->a:Lax/a0/u$b;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Lax/a0/u$e;-><init>(Lax/a0/u$c;Z)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lax/a0/u;->c:Lax/a0/t;

    .line 26
    .line 27
    new-instance v0, Lax/a0/u$e;

    .line 28
    .line 29
    invoke-direct {v0, v1, v3}, Lax/a0/u$e;-><init>(Lax/a0/u$c;Z)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lax/a0/u;->d:Lax/a0/t;

    .line 33
    .line 34
    new-instance v0, Lax/a0/u$e;

    .line 35
    .line 36
    sget-object v1, Lax/a0/u$a;->b:Lax/a0/u$a;

    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lax/a0/u$e;-><init>(Lax/a0/u$c;Z)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lax/a0/u;->e:Lax/a0/t;

    .line 42
    .line 43
    sget-object v0, Lax/a0/u$f;->b:Lax/a0/u$f;

    .line 44
    .line 45
    sput-object v0, Lax/a0/u;->f:Lax/a0/t;

    .line 46
    .line 47
    return-void
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

.method static a(I)I
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_b

    .line 3
    .line 4
    if-eq p0, v0, :cond_9

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_9

    .line 8
    .line 9
    return v0

    .line 10
    :cond_9
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_b
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
    .line 22
.end method

.method static b(I)I
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_e

    .line 3
    .line 4
    if-eq p0, v0, :cond_c

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq p0, v1, :cond_c

    .line 8
    .line 9
    packed-switch p0, :pswitch_data_10

    .line 10
    .line 11
    .line 12
    return v1

    .line 13
    :cond_c
    :pswitch_c
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_e
    :pswitch_e
    return v0

    .line 16
    nop

    .line 17
    :pswitch_data_10
    .packed-switch 0xe
        :pswitch_e
        :pswitch_e
        :pswitch_c
        :pswitch_c
    .end packed-switch
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
