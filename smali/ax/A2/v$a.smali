.class public final Lax/A2/v$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/A2/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lax/A2/v$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/A2/v$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/A2/v$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/A2/v$a;->a:Lax/A2/v$a;

    .line 7
    .line 8
    return-void
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
.method public final a()Lax/A2/v;
    .registers 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_9

    .line 6
    .line 7
    sget-object v0, Lax/A2/x;->b:Lax/A2/x;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_9
    const/16 v1, 0x1e

    .line 11
    .line 12
    if-lt v0, v1, :cond_10

    .line 13
    .line 14
    sget-object v0, Lax/A2/w;->b:Lax/A2/w;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_10
    sget-object v0, Lax/A2/y;->b:Lax/A2/y;

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method
