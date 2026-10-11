.class public final Lax/A2/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/A2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lax/A2/c$a;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/A2/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/A2/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/A2/c$a;->a:Lax/A2/c$a;

    .line 7
    .line 8
    const-class v0, Lax/A2/c;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "getSimpleName(...)"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lax/A2/c$a;->b:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method

.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final a()Lax/A2/c;
    .registers 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_9

    .line 6
    .line 7
    sget-object v0, Lax/A2/h;->b:Lax/A2/h;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_9
    const/16 v1, 0x1d

    .line 11
    .line 12
    if-lt v0, v1, :cond_10

    .line 13
    .line 14
    sget-object v0, Lax/A2/g;->b:Lax/A2/g;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_10
    const/16 v1, 0x1c

    .line 18
    .line 19
    if-lt v0, v1, :cond_17

    .line 20
    .line 21
    sget-object v0, Lax/A2/f;->b:Lax/A2/f;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_17
    const/16 v1, 0x18

    .line 25
    .line 26
    if-lt v0, v1, :cond_1e

    .line 27
    .line 28
    sget-object v0, Lax/A2/e;->b:Lax/A2/e;

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1e
    sget-object v0, Lax/A2/d;->b:Lax/A2/d;

    .line 32
    .line 33
    return-object v0
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

.method public final b()Ljava/lang/String;
    .registers 2

    .line 1
    sget-object v0, Lax/A2/c$a;->b:Ljava/lang/String;

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
