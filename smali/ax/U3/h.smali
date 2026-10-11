.class public interface abstract Lax/U3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lax/U3/h;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lax/U3/h;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/U3/h$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/U3/h$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/U3/h;->a:Lax/U3/h;

    .line 7
    .line 8
    new-instance v0, Lax/U3/j$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lax/U3/j$a;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lax/U3/j$a;->a()Lax/U3/j;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lax/U3/h;->b:Lax/U3/h;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method
