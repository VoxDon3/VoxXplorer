.class public final synthetic Lax/x5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/x5/M$b;


# instance fields
.field public final synthetic a:Lax/x5/M;

.field public final synthetic b:Lax/p5/i;

.field public final synthetic c:Lax/p5/p;


# direct methods
.method public synthetic constructor <init>(Lax/x5/M;Lax/p5/i;Lax/p5/p;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/x5/m;->a:Lax/x5/M;

    iput-object p2, p0, Lax/x5/m;->b:Lax/p5/i;

    iput-object p3, p0, Lax/x5/m;->c:Lax/p5/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 1
    iget-object v0, p0, Lax/x5/m;->a:Lax/x5/M;

    iget-object v1, p0, Lax/x5/m;->b:Lax/p5/i;

    iget-object v2, p0, Lax/x5/m;->c:Lax/p5/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lax/x5/M;->L(Lax/x5/M;Lax/p5/i;Lax/p5/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
